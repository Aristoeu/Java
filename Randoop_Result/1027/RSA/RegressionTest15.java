package RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
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
        java.lang.String str23 = rSA1.encrypt("120890067933436440637511838537");
        java.lang.String str25 = rSA1.encrypt("2411260992603826");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1203144174239469" + "'", str7, "1203144174239469");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "68" + "'", str19, "68");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "309" + "'", str21, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "351" + "'", str23, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "281" + "'", str25, "281");
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("887836866708316");
        java.lang.String str19 = rSA1.encrypt("964314961740013");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "211386543290542548680897174386" + "'", str9, "211386543290542548680897174386");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u0549\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u0549\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\u0445\ufffd\ufffd\u0322=" + "'", str15, "\001\ufffd\ufffd\u0445\ufffd\ufffd\u0322=");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "297369405692297953663868655749" + "'", str17, "297369405692297953663868655749");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "134261902986673300588892743797" + "'", str19, "134261902986673300588892743797");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("206");
        java.lang.String str15 = rSA1.encrypt("412849958012346869158998924038");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "485" + "'", str9, "485");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001(" + "'", str11, "\001(");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "478" + "'", str13, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "338" + "'", str15, "338");
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        java.lang.String str15 = rSA1.encrypt("\036\002\ufffd*");
        java.lang.String str17 = rSA1.decrypt("402");
        java.lang.String str19 = rSA1.decrypt("432400006404237121697582775480");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2202020615975247" + "'", str7, "2202020615975247");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "f" + "'", str13, "f");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "132" + "'", str15, "132");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "R" + "'", str19, "R");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("652458685405459190865265712722");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15387556343" + "'", str7, "15387556343");
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("1808092672364359");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "521840944632697902918198753571" + "'", str9, "521840944632697902918198753571");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\013\u1aed\ufffd\ufffd6\026\000" + "'", str11, "\005\ufffd\ufffd\013\u1aed\ufffd\ufffd6\026\000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\u02cf\ufffd\ufffdC\177\b\ufffd\001\ufffd\ufffd" + "'", str13, "\004\u02cf\ufffd\ufffdC\177\b\ufffd\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\017c\027\ufffd\ufffd\ufffd[\017 " + "'", str17, "\005\ufffd\017c\027\ufffd\ufffd\ufffd[\017 ");
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
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
        java.lang.String str23 = rSA1.decrypt("1569032329454568");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "169947547653678444117830302737" + "'", str9, "169947547653678444117830302737");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "604446960596626291735917400559" + "'", str11, "604446960596626291735917400559");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "569448074517799735074036479710" + "'", str13, "569448074517799735074036479710");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "314" + "'", str17, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!" + "'", str19, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "288" + "'", str21, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\017" + "'", str23, "\001\017");
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.encrypt("315");
        java.lang.String str15 = rSA1.encrypt("1044859805291138");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1408514752349" + "'", str11, "1408514752349");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "203026265368507873092876724164" + "'", str13, "203026265368507873092876724164");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "130744955437609699565767375192" + "'", str15, "130744955437609699565767375192");
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("4706050620");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "500017068690037109279580082982" + "'", str9, "500017068690037109279580082982");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\t\ufffd\036\ufffd\ufffd\ufffdi3\023" + "'", str11, "\006\ufffd\t\ufffd\036\ufffd\ufffd\ufffdi3\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\016\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\004" + "'", str15, "\003\ufffd\ufffd\016\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\004");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4810039344" + "'", str19, "4810039344");
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
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
        java.lang.String str25 = rSA1.decrypt("501202944439580085093511050417");
        java.lang.String str27 = rSA1.decrypt("9772698789");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "273291084204791349298915554316" + "'", str9, "273291084204791349298915554316");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\u0475\ufffdsM&" + "'", str11, "\007\ufffd\ufffd\ufffd\u0475\ufffdsM&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140067807272592111960752377787" + "'", str13, "140067807272592111960752377787");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "873458008582439" + "'", str19, "873458008582439");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\ufffd\b" + "'", str21, "\005\ufffd\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\f" + "'", str23, "\005\ufffd\ufffd\ufffd\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\004\ufffd\ufffd\ufffd\t\ufffd\t" + "'", str25, "\004\ufffd\ufffd\ufffd\t\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\005\ufffd\ufffd\013\ufffdq" + "'", str27, "\005\ufffd\ufffd\013\ufffdq");
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "362835359650551764409020700159" + "'", str9, "362835359650551764409020700159");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "252475910871347566772950798236" + "'", str11, "252475910871347566772950798236");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46819420657375151972308663052" + "'", str13, "46819420657375151972308663052");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\023\ufffd\ufffd\ufffd\036\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\023\ufffd\ufffd\ufffd\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("10019204889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001\ufffd\u0330\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "533196835978826980537438910295" + "'", str9, "533196835978826980537438910295");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "426905927000960237568" + "'", str11, "426905927000960237568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffdm\r\020\ufffd" + "'", str13, "\b\ufffd\ufffd\ufffdm\r\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "555207858561379790834746200253" + "'", str15, "555207858561379790834746200253");
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        java.lang.String str15 = rSA1.encrypt("258");
        java.lang.String str17 = rSA1.decrypt("4586471424");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380552912947734448596308630137" + "'", str9, "380552912947734448596308630137");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd#6'\017y\025\006p\023" + "'", str11, "\ufffd#6'\017y\025\006p\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\207\ufffd\ufffd\ufffd\ufffd\002" + "'", str13, "\001\207\ufffd\ufffd\ufffd\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "39023192558916366993163732478" + "'", str15, "39023192558916366993163732478");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\030" + "'", str17, "\030");
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        java.lang.String str5 = rSA1.encrypt("357690512925543535751245880674");
        java.lang.String str7 = rSA1.encrypt("M");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "215" + "'", str3, "215");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "504" + "'", str5, "504");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "514" + "'", str7, "514");
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\000\ufffd5Uc");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??5Uc\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "358593181815185340165292287600" + "'", str9, "358593181815185340165292287600");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "358593181815185340165292287600" + "'", str11, "358593181815185340165292287600");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdw\006\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffdw\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "537436282459363939895389156189" + "'", str15, "537436282459363939895389156189");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\u04dc\ufffd\ufffd\ufffd\\\ufffd\013\ufffd" + "'", str21, "\007\u04dc\ufffd\ufffd\ufffd\\\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffd\ufffd\t\ufffd?\177\ufffd:\022\ufffd" + "'", str23, "\006\ufffd\ufffd\t\ufffd?\177\ufffd:\022\ufffd");
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1326889722876285" + "'", str7, "1326889722876285");
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\u8e25\ufffd\ufffdZ");
        java.lang.String str17 = rSA1.encrypt("458388307745635741204123901299");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("\002O\002]S");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t" + "'", str7, "\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "S" + "'", str9, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0016" + "'", str11, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "478" + "'", str15, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "172" + "'", str17, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "261" + "'", str21, "261");
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("86");
        java.lang.String str17 = rSA1.encrypt("4597126594");
        java.lang.String str19 = rSA1.encrypt("326");
        java.lang.String str21 = rSA1.decrypt("265939002401624");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\004" + "'", str15, "\001\004");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "297" + "'", str17, "297");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "151" + "'", str19, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "R" + "'", str21, "R");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "699234347571286540096806849411" + "'", str9, "699234347571286540096806849411");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd[\"\ufffd\023\ufffdu" + "'", str11, "\006\ufffd\ufffd[\"\ufffd\023\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "669902569792068860254750376392" + "'", str13, "669902569792068860254750376392");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffdR':\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffdR':\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "566584461078159766243755306300" + "'", str17, "566584461078159766243755306300");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19739327492597988291721361224" + "'", str21, "19739327492597988291721361224");
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
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
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str25 = rSA1.decrypt("304049231429385801196759394382");
        rSA1.generateKeys(100);
        java.lang.String str29 = rSA1.encrypt("56846555629581231975376747532");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1203270960669108" + "'", str7, "1203270960669108");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001U" + "'", str19, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffdG\016" + "'", str25, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffdG\016");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "277862029523771342362517714032" + "'", str29, "277862029523771342362517714032");
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str19 = rSA1.decrypt("175616000");
        java.lang.String str21 = rSA1.decrypt("1253533842561291");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1232921532579600" + "'", str7, "1232921532579600");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "217" + "'", str15, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\026" + "'", str17, "\001\026");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "S" + "'", str21, "S");
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\ufffd\u027d\ufffd\ufffd\u04f8\ufffd" + "'", str3, "\b\ufffd\ufffd\u027d\ufffd\ufffd\u04f8\ufffd");
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("13087572778356868098099484487");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "967189355353064" + "'", str7, "967189355353064");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2609100301408069" + "'", str13, "2609100301408069");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffdMrI" + "'", str15, "\004\ufffd\ufffdMrI");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\u0735\u04c7" + "'", str17, "\002\ufffd\u0735\u04c7");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "499818137367426" + "'", str19, "499818137367426");
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
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
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "329623269230717" + "'", str13, "329623269230717");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffdZ%\013r" + "'", str15, "\001\ufffd\ufffdZ%\013r");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "342474640583025786847356698188" + "'", str19, "342474640583025786847356698188");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\021\003\004\ufffdY/J\036\ufffd\ufffd" + "'", str21, "\001\ufffd\021\003\004\ufffdY/J\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "402943142893564477384324526943" + "'", str23, "402943142893564477384324526943");
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("159324186965374018993794128375");
        java.lang.String str19 = rSA1.encrypt("\005\006\ufffd");
        java.lang.String str21 = rSA1.decrypt("2325424005");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\001\ufffd\ufffd\ufffd\f\003\027\u0607\026" + "'", str13, "\013\001\ufffd\ufffd\ufffd\f\003\027\u0607\026");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\030\ufffd\ufffd\ufffd\037" + "'", str17, "\007\030\ufffd\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "580419590487988320996125648787" + "'", str19, "580419590487988320996125648787");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\n\ufffd\025\u066d\031\ufffd\002\ufffd" + "'", str21, "\005\ufffd\ufffd\n\ufffd\025\u066d\031\ufffd\002\ufffd");
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("460290203420997373753530609873");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffdy[");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "112" + "'", str5, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "408" + "'", str9, "408");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\016" + "'", str13, "\001\ufffd\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6353050031" + "'", str15, "6353050031");
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.decrypt("611943475129151");
        java.lang.String str15 = rSA1.decrypt("1053810964353719");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "128" + "'", str9, "128");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001$" + "'", str11, "\001$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\016" + "'", str13, "\001\016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("1709572230870390");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\005^\037\ufffd yUG\023\u0328");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\002\024\ufffd\ufffd\ufffd:\024\ufffd\ufffd\ufffd" + "'", str3, "\001\002\024\ufffd\ufffd\ufffd:\024\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35297066219747394694533948678" + "'", str5, "35297066219747394694533948678");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6570677624" + "'", str9, "6570677624");
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str15 = rSA1.decrypt("473");
        java.lang.String str17 = rSA1.encrypt("184486595282572044193315087565");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "93282453864897931102815606035" + "'", str9, "93282453864897931102815606035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\034\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\034\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\033\ufffd\ufffd\r\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\033\ufffd\ufffd\r\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "464155365194194786490221494651" + "'", str17, "464155365194194786490221494651");
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
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
        java.lang.String str27 = rSA1.encrypt("2614535356");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2933644553451045" + "'", str7, "2933644553451045");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "281" + "'", str15, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "371" + "'", str25, "371");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "101" + "'", str27, "101");
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("549539548161837355014455050201");
        java.lang.String str17 = rSA1.encrypt("\0342h\177\ufffd!b\006\ufffd\fzQ");
        rSA1.generateKeys(10);
        java.lang.String str21 = rSA1.encrypt("402808305376343001842341859718");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "598149755140933465735519031908" + "'", str9, "598149755140933465735519031908");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "598149755140933465735519031908" + "'", str11, "598149755140933465735519031908");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\204\ufffd\ufffd[G\030\ufffd\ufffd" + "'", str13, "\005\204\ufffd\ufffd[G\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "329111619897547711609072151595" + "'", str17, "329111619897547711609072151595");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "441" + "'", str21, "441");
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("111391917685414668336366870336");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2875840028496853" + "'", str7, "2875840028496853");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\f" + "'", str11, "\001\f");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys((int) '#');
        java.lang.String str23 = rSA1.decrypt("338025202314195845037898337");
        java.lang.String str25 = rSA1.decrypt("2706353318672410");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1078263493258372" + "'", str7, "1078263493258372");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffdE-S" + "'", str9, "\004\ufffd\ufffd\ufffdE-S");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1199611478554605" + "'", str13, "1199611478554605");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "784444365721669" + "'", str15, "784444365721669");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005GM\002\\\ufffd\ufffd" + "'", str17, "\005GM\002\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "784633537498262" + "'", str19, "784633537498262");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\037,C" + "'", str23, "\000\ufffd\037,C");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd\ufffd(" + "'", str25, "\002\ufffd\ufffd(");
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\001\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("360143793835170409825620524630");
        java.lang.String str15 = rSA1.encrypt("1151836492267164");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "291" + "'", str11, "291");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "146" + "'", str13, "146");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "180" + "'", str15, "180");
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
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
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "93895888366412" + "'", str7, "93895888366412");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "41" + "'", str21, "41");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("M\021\ufffd");
        java.lang.String str17 = rSA1.encrypt("\024\ufffdo\024\ufffdG\031\ufffd\ufffd\ufffdG");
        java.lang.String str19 = rSA1.encrypt("2179832320");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1282913068835791" + "'", str5, "1282913068835791");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "132260443450589" + "'", str7, "132260443450589");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\025\ufffd\ufffd" + "'", str9, "\004\ufffd\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd," + "'", str11, "\004\ufffd\ufffd\ufffd,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\u06d3\ufffd\006\022\ufffd" + "'", str13, "\002\u06d3\ufffd\006\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2398617118306708" + "'", str15, "2398617118306708");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2198988405091381" + "'", str17, "2198988405091381");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "535450410303480" + "'", str19, "535450410303480");
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1304583769586471" + "'", str7, "1304583769586471");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "454627900" + "'", str11, "454627900");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\023\031:\000" + "'", str13, "\023\031:\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "166314214" + "'", str15, "166314214");
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("489216744821809573348585320231");
        java.lang.String str19 = rSA1.encrypt("4843613396");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "289779519231022292761450152910" + "'", str17, "289779519231022292761450152910");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "420693715280236969279764419534" + "'", str19, "420693715280236969279764419534");
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("\b\ufffd\032\ufffd\034\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("203295766041821509236512994768");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "449323239592669251881493024794" + "'", str9, "449323239592669251881493024794");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001%\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001%\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "147968201096473676842901965269" + "'", str13, "147968201096473676842901965269");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd!P" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd!P");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "400046491683507" + "'", str19, "400046491683507");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\035\ufffd" + "'", str21, "\000\ufffd\ufffd\ufffd\ufffd\035\ufffd");
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.decrypt("494127135293188");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1082018492562105" + "'", str7, "1082018492562105");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1463908423575616" + "'", str13, "1463908423575616");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\u061f\ufffd\ufffdo" + "'", str15, "\001\u061f\ufffd\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\006" + "'", str19, "\ufffd\ufffd\006");
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("5693705465");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7284134478" + "'", str3, "7284134478");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1264791069" + "'", str5, "1264791069");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8895275695" + "'", str7, "8895275695");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3021641933" + "'", str9, "3021641933");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5558083084" + "'", str11, "5558083084");
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffdb\004");
        rSA1.generateKeys(100);
        java.lang.String str21 = rSA1.encrypt("R");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\030" + "'", str7, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1844557647900825" + "'", str11, "1844557647900825");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "108348224161937" + "'", str13, "108348224161937");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "26009100373252808839582686046" + "'", str17, "26009100373252808839582686046");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3707398432" + "'", str21, "3707398432");
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("477275381709667864596972007455");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffdI\017\ufffd\ufffd\ufffd\ufffdR+\b");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1319982837" + "'", str11, "1319982837");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "247142710" + "'", str13, "247142710");
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
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
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3039783727254819" + "'", str7, "3039783727254819");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "286" + "'", str15, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "312" + "'", str17, "312");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001." + "'", str19, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002 " + "'", str21, "\002 ");
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3081068478" + "'", str3, "3081068478");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8495232832" + "'", str7, "8495232832");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\001,\034" + "'", str9, "\000\ufffd\001,\034");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "403793174146648533206821776604" + "'", str15, "403793174146648533206821776604");
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("652458685405459190865265712722");
        java.lang.String str9 = rSA1.encrypt("2008322195689409");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5733457747" + "'", str7, "5733457747");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7941731967" + "'", str9, "7941731967");
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.decrypt("456351013126802");
        java.lang.String str7 = rSA1.decrypt("121146565524829642818807927021");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40017971597836857344" + "'", str3, "40017971597836857344");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\u0146\ufffd\ufffd" + "'", str7, "\006\ufffd\ufffd\u0146\ufffd\ufffd");
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
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
        java.lang.String str21 = rSA1.decrypt("361687133367933136614006370607");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "428" + "'", str17, "428");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\0013" + "'", str21, "\0013");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) ' ');
        java.lang.String str21 = rSA1.encrypt("3141644858136");
        java.lang.String str23 = rSA1.decrypt("246");
        java.lang.String str25 = rSA1.decrypt("289");
        java.lang.String str27 = rSA1.decrypt("640396749099661255743419249290");
        java.lang.String str29 = rSA1.encrypt("4691461221");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.encrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(" + "'", str13, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "275" + "'", str15, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "66" + "'", str17, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1386471244" + "'", str21, "1386471244");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "B\007\ufffd\ufffd" + "'", str23, "B\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffd\016" + "'", str25, "\000\ufffd\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ufffd" + "'", str27, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "684953288" + "'", str29, "684953288");
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("\005\ufffdQ\017q~\177\ufffd\025\ufffdM0");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214" + "'", str9, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "383" + "'", str13, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1719022683" + "'", str17, "1719022683");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("370751075487002776593854224073");
        java.lang.String str13 = rSA1.encrypt("6297770075");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "999126594019391" + "'", str7, "999126594019391");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\007\023" + "'", str11, "\n\ufffd\007\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "880242760" + "'", str13, "880242760");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
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
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "202348717952687904903823979564" + "'", str9, "202348717952687904903823979564");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "398644716077356451574769242312" + "'", str11, "398644716077356451574769242312");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\033\u02c7<\007\ufffd\u0121" + "'", str13, "\003\033\u02c7<\007\ufffd\u0121");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\f\u039e\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001\f\u039e\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "510189487276998" + "'", str7, "510189487276998");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "854785796049041" + "'", str13, "854785796049041");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1319305450516018" + "'", str15, "1319305450516018");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffdPB\005o" + "'", str17, "\001\ufffdPB\005o");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1383528848042228" + "'", str19, "1383528848042228");
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("457613644251791188504293612087");
        java.lang.String str9 = rSA1.encrypt("\005\ufffd\ufffd\027\024\ufffd\005\ufffd\023\021\034\007");
        java.lang.String str11 = rSA1.encrypt("970748437860623683411570676429");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd|M" + "'", str7, "\005\ufffd\ufffd|M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "288021850765006" + "'", str9, "288021850765006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022948942604861" + "'", str11, "2022948942604861");
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
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
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str25 = rSA1.decrypt("304049231429385801196759394382");
        rSA1.generateKeys(100);
        java.lang.String str29 = rSA1.decrypt("435039569");
        java.lang.String str31 = rSA1.decrypt("270");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1502425158752007" + "'", str7, "1502425158752007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002*" + "'", str19, "\002*");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\u034az\035\ufffd\u0565\ufffd&" + "'", str25, "\001\ufffd\u034az\035\ufffd\u0565\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\007\036\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd5d" + "'", str29, "\007\036\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd5d");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\005Y\030z\177\ufffd\ufffd\ufffd \003\ufffdu" + "'", str31, "\005Y\030z\177\ufffd\ufffd\ufffd \003\ufffdu");
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.encrypt("765314849130516");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("974893299216530036297456057222");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "459451599221216280032937421268" + "'", str9, "459451599221216280032937421268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "387964701757469001903752566248" + "'", str13, "387964701757469001903752566248");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "463583662260971717203505469531" + "'", str15, "463583662260971717203505469531");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9157523543325901199714361913" + "'", str17, "9157523543325901199714361913");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "38" + "'", str21, "38");
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str11 = rSA1.encrypt("104505243654056990127866040198");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("360269784593448187859562480797");
        java.lang.String str17 = rSA1.decrypt("66011755970030761385223442767");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "293" + "'", str9, "293");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "249" + "'", str11, "249");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd4L" + "'", str15, "\006\ufffd\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd4L");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd1\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\002\ufffd1\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "399" + "'", str3, "399");
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str11 = rSA1.encrypt("1446573806455994");
        java.lang.String str13 = rSA1.encrypt("69618674077933");
        java.lang.String str15 = rSA1.decrypt("942602395272077");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222958403449545308619955143114" + "'", str9, "222958403449545308619955143114");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "57853210692335636789327993647" + "'", str11, "57853210692335636789327993647");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "306741346997802725837159097054" + "'", str13, "306741346997802725837159097054");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\u0758\"\023\u044c\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\u0758\"\023\u044c\ufffd");
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd8\007\"\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd8\007\"\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd#\037\ufffd\ufffd\ufffdy");
        java.lang.String str19 = rSA1.encrypt("165718708457833953982271069591");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "228" + "'", str7, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "375" + "'", str9, "375");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "412" + "'", str15, "412");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "567" + "'", str17, "567");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "364" + "'", str19, "364");
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("1603037267069329");
        java.lang.String str15 = rSA1.encrypt("1602403727");
        java.lang.String str17 = rSA1.decrypt("120210931294819567914781828560");
        java.lang.String str19 = rSA1.decrypt("297724277052410");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "155425924457496" + "'", str7, "155425924457496");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6512475" + "'", str13, "6512475");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5295563773" + "'", str15, "5295563773");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\026=\016?" + "'", str19, "\002\026=\016?");
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
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
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1017034269521827004054465345848" + "'", str11, "1017034269521827004054465345848");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "558362690448387856907946122738" + "'", str17, "558362690448387856907946122738");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "65807618487869729155693239211" + "'", str19, "65807618487869729155693239211");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "506102231258720351327622413848" + "'", str21, "506102231258720351327622413848");
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("7772915241");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\ufffd\u0d8c\ufffd:\002\007");
        java.lang.String str21 = rSA1.decrypt("947975234450991");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "476030099342435288955503956045" + "'", str9, "476030099342435288955503956045");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "81116783444150163080560161885" + "'", str11, "81116783444150163080560161885");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8326532576" + "'", str19, "8326532576");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002p\032\ufffd6" + "'", str21, "\002p\032\ufffd6");
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("3836305984");
        java.lang.String str17 = rSA1.encrypt("\002\b\003\ufffd\ufffd");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "217609702038542482740736188601" + "'", str9, "217609702038542482740736188601");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "405842467699261122775457884161" + "'", str11, "405842467699261122775457884161");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "311" + "'", str17, "311");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("125");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "296" + "'", str11, "296");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "497" + "'", str13, "497");
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
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
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2693142688779637" + "'", str7, "2693142688779637");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3402929464839437" + "'", str9, "3402929464839437");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238670044757072" + "'", str11, "238670044757072");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "146301330784585346417165016476" + "'", str17, "146301330784585346417165016476");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "545255245261561590017887184710" + "'", str19, "545255245261561590017887184710");
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("88638193188866845071594874023");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1373330338723880" + "'", str7, "1373330338723880");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1848179889332912" + "'", str13, "1848179889332912");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "410161846398793" + "'", str15, "410161846398793");
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("3836305984");
        java.lang.String str17 = rSA1.decrypt("85");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "412286393951288971856424664013" + "'", str9, "412286393951288971856424664013");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "344087354233536496203972469650" + "'", str11, "344087354233536496203972469650");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        java.lang.String str11 = rSA1.encrypt("468");
        java.lang.String str13 = rSA1.encrypt("1358342944");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\025\ufffd\016\ufffd\ufffd\ufffdq" + "'", str9, "\001\ufffd\025\ufffd\016\ufffd\ufffd\ufffdq");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19582090499317043242435485129" + "'", str11, "19582090499317043242435485129");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "468262801029862321978342807114" + "'", str13, "468262801029862321978342807114");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.decrypt("547173891878268756953688155445");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "438045424972744973755656429842" + "'", str9, "438045424972744973755656429842");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\000\ufffd\ufffd\ufffd7" + "'", str11, "\002\ufffd\ufffd\000\ufffd\ufffd\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "107579466364470829836302566661" + "'", str13, "107579466364470829836302566661");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "472865074070840316931789940100" + "'", str15, "472865074070840316931789940100");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd0\n\ufffd\035\ufffdzY" + "'", str17, "\004\ufffd\ufffd\ufffd0\n\ufffd\035\ufffdzY");
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("5627337140");
        java.lang.String str19 = rSA1.decrypt("52608297224407693454086081731");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "299060217368268793242497174165" + "'", str11, "299060217368268793242497174165");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001_" + "'", str19, "\001_");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3335051444" + "'", str5, "3335051444");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.encrypt("249149502657092604838469591750");
        java.lang.String str17 = rSA1.encrypt("1275537561153405");
        java.lang.String str19 = rSA1.decrypt("173142578916498161473180352982");
        java.lang.String str21 = rSA1.encrypt("732944758");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "226800169349794" + "'", str7, "226800169349794");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13742036560453752483515536339" + "'", str13, "13742036560453752483515536339");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "181125394083365581076889603743" + "'", str15, "181125394083365581076889603743");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "81549089472439810969454188716" + "'", str17, "81549089472439810969454188716");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\\\ufffd\033\ufffd\r\ufffd\005\ufffd" + "'", str19, "\003\\\ufffd\033\ufffd\r\ufffd\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "275000999574770998181790835589" + "'", str21, "275000999574770998181790835589");
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("\004e1\036\ufffd\ufffd\ufffd\ufffd_\"\ufffd");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "694730937375654166225199619009" + "'", str9, "694730937375654166225199619009");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122909276200143919902004495052" + "'", str11, "122909276200143919902004495052");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "543132139823550820237226909862" + "'", str13, "543132139823550820237226909862");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "198" + "'", str17, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "374" + "'", str19, "374");
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.encrypt("1396245536455160");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1282440372501559" + "'", str7, "1282440372501559");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1345418550419944" + "'", str15, "1345418550419944");
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str19 = rSA1.decrypt("10416085735186");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "387177974981879880512047897112" + "'", str9, "387177974981879880512047897112");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "545641939118706363046770300457" + "'", str11, "545641939118706363046770300457");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "280662925285576096400689090576" + "'", str17, "280662925285576096400689090576");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006g\025\000\ufffd\ufffd\003\024\ufffd\\\ufffd" + "'", str19, "\006g\025\000\ufffd\ufffd\003\024\ufffd\\\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "523" + "'", str15, "523");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "531" + "'", str17, "531");
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("5627337140");
        java.lang.String str19 = rSA1.decrypt("124112473946695722556928910068");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "229204535731053030807271591309" + "'", str9, "229204535731053030807271591309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "303938977019669425458150448065" + "'", str11, "303938977019669425458150448065");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Y" + "'", str17, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\004\024\ufffd\"\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\005");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?h??s??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2099339617019073" + "'", str7, "2099339617019073");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1576355405200991" + "'", str11, "1576355405200991");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "788012490559673" + "'", str13, "788012490559673");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "496444691778527" + "'", str15, "496444691778527");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "995959081791522" + "'", str17, "995959081791522");
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        java.lang.String str13 = rSA1.decrypt("42255066403800866001807416701");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "951304947887718" + "'", str7, "951304947887718");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1538262058567819" + "'", str9, "1538262058567819");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2189414425391728" + "'", str11, "2189414425391728");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffdvfDf" + "'", str13, "\002\ufffd\ufffdvfDf");
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        java.lang.String str15 = rSA1.decrypt("402808305376343001842341859718");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\u05fb\ufffd\ufffdi" + "'", str11, "\t\ufffd\u05fb\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "184528125" + "'", str13, "184528125");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\u02f9\ufffdKe\\\ufffdd" + "'", str15, "\007\ufffd\u02f9\ufffdKe\\\ufffdd");
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
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
        java.lang.String str25 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str27 = rSA1.decrypt("939320849989680");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "151638853085018139090723839522" + "'", str9, "151638853085018139090723839522");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\f\ufffd\000\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\f\ufffd\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6386727796347366842223467310" + "'", str13, "6386727796347366842223467310");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\u03e9\ufffd\u046b\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001\u03e9\ufffd\u046b\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "26353300633977058096749202487" + "'", str19, "26353300633977058096749202487");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "166163401455078037577737022268" + "'", str21, "166163401455078037577737022268");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\025\ufffd\ufffd\ufffd\ufffd\u04c6\ufffd\ufffd" + "'", str23, "\005\025\ufffd\ufffd\ufffd\ufffd\u04c6\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "268740475645918629901536634436" + "'", str25, "268740475645918629901536634436");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ufffd\ufffd q\016\ufffd\ufffd\n\ufffd\030" + "'", str27, "\ufffd\ufffd q\016\ufffd\ufffd\n\ufffd\030");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("728807813322231");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "987903871055854" + "'", str7, "987903871055854");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\034" + "'", str13, "\034");
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("765314849130516");
        java.lang.String str19 = rSA1.decrypt("37822311364830212583");
        java.lang.String str21 = rSA1.decrypt("94111875490901");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "310259318963660870825061468810" + "'", str9, "310259318963660870825061468810");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\177\ufffd\ufffd\026\ufffd\ufffd\ufffd" + "'", str11, "\005\177\ufffd\ufffd\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "816176860834490893497888514727" + "'", str13, "816176860834490893497888514727");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001Q" + "'", str17, "\001Q");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001b" + "'", str19, "\001b");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd" + "'", str21, "\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\007\ufffd\ufffd\ufffd\ufffd0\003\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??HD\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
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
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\022\ufffd\034\u061a<\025\ufffd\000" + "'", str11, "\003\022\ufffd\034\u061a<\025\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33570448563366733031" + "'", str15, "33570448563366733031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "98663584396381605885857178604" + "'", str17, "98663584396381605885857178604");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "362780929348670763952767871129" + "'", str21, "362780929348670763952767871129");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "544525919053662627536368340867" + "'", str23, "544525919053662627536368340867");
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("278806374250498767788908229396");
        java.lang.String str19 = rSA1.encrypt("s\"\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?/h?k ?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2053937144083159" + "'", str7, "2053937144083159");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279936" + "'", str13, "279936");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "246519844186238508443302960829" + "'", str17, "246519844186238508443302960829");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "96771203808485349728247583739" + "'", str19, "96771203808485349728247583739");
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("258580565253484916644733070722");
        java.lang.String str17 = rSA1.encrypt("35254515914498631704205390539");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "719157829277753220245451907032" + "'", str9, "719157829277753220245451907032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\u06ad\ufffd\ufffd\036\ufffd\f\u01a8" + "'", str11, "\005\u06ad\ufffd\ufffd\036\ufffd\f\u01a8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "235791224424301033087515715814" + "'", str13, "235791224424301033087515715814");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "79354270466951746048319487689" + "'", str15, "79354270466951746048319487689");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "195378300258367949931468627206" + "'", str17, "195378300258367949931468627206");
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
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
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "158887880039068" + "'", str15, "158887880039068");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "237" + "'", str19, "237");
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.encrypt("252");
        java.lang.String str21 = rSA1.encrypt("20");
        java.lang.String str23 = rSA1.decrypt("561658842431796679757060112120");
        java.lang.String str25 = rSA1.encrypt("2582197211");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str29 = rSA1.encrypt("581");
        java.lang.String str31 = rSA1.decrypt("2228523193174491");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "543537106072132996265520305381" + "'", str9, "543537106072132996265520305381");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97736604593295048381987034678" + "'", str11, "97736604593295048381987034678");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "148485528024596083980200877425" + "'", str13, "148485528024596083980200877425");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "22" + "'", str17, "22");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "442" + "'", str19, "442");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "329" + "'", str21, "329");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "358" + "'", str25, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "248" + "'", str29, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000" + "'", str31, "\000");
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\004\ufffd\ufffd\u07d8");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "265" + "'", str9, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11" + "'", str11, "11");
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("75472562827089017340799555154");
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("413650277383093449271044312093");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\013\025\ufffd" + "'", str3, "\002\ufffd\ufffd\013\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1175823139904122" + "'", str5, "1175823139904122");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1416394228001495" + "'", str7, "1416394228001495");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "58933377833532" + "'", str9, "58933377833532");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "790399015" + "'", str13, "790399015");
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        java.lang.String str17 = rSA1.decrypt("852");
        java.lang.String str19 = rSA1.encrypt("278");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2061245045319030" + "'", str7, "2061245045319030");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1478108168" + "'", str11, "1478108168");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "^\020\ufffdz" + "'", str13, "^\020\ufffdz");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "149271621" + "'", str15, "149271621");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\026}" + "'", str17, "\ufffd\026}");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1832291249" + "'", str19, "1832291249");
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("270064452819075595077010738176");
        java.lang.String str13 = rSA1.encrypt("1968255834337447");
        java.lang.String str15 = rSA1.encrypt("\001\013\ufffd\036");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "829" + "'", str3, "829");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\0254" + "'", str7, "\ufffd\0254");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4279503586" + "'", str9, "4279503586");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\020\ufffd\ufffd" + "'", str11, "\000\ufffd\020\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1028214450" + "'", str13, "1028214450");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1483094020" + "'", str15, "1483094020");
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("5620871555");
        java.lang.String str5 = rSA1.encrypt("?E\034\ufffd\u03c5\ufffd\ufffd\ufffdRg");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "'" + "'", str3, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "606" + "'", str5, "606");
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("2448943656306246");
        java.lang.String str17 = rSA1.decrypt("407361645");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "620458489145353870380667810615" + "'", str9, "620458489145353870380667810615");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffdW\021" + "'", str11, "\007\ufffd\ufffd\ufffdW\021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd?\013\ufffd\ufffd\ufffd\ufffd\036" + "'", str13, "\006\ufffd?\013\ufffd\ufffd\ufffd\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\013\037\ufffd\002\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\013\037\ufffd\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\007\ufffd\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.decrypt("831265349016221");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd1\t_" + "'", str5, "\000\ufffd1\t_");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6596825175" + "'", str7, "6596825175");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002QA\001\ufffd" + "'", str9, "\002QA\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\026\007\ufffd\033" + "'", str11, "\001\026\007\ufffd\033");
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
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
        java.lang.String str21 = rSA1.encrypt("456351013126802");
        java.lang.String str23 = rSA1.decrypt("308");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2366135113047191" + "'", str7, "2366135113047191");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "632" + "'", str15, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "149" + "'", str19, "149");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "610" + "'", str21, "610");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001j" + "'", str23, "\001j");
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "90182167249159863319795123910" + "'", str3, "90182167249159863319795123910");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "411946793930988218186447210512" + "'", str9, "411946793930988218186447210512");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\017\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\017\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "311868052003321999912560132292" + "'", str13, "311868052003321999912560132292");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "78588210665887596488077204206" + "'", str15, "78588210665887596488077204206");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "89083274946109485322540669140" + "'", str17, "89083274946109485322540669140");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\030\ufffd\ufffd\ufffd.~" + "'", str19, "\001\030\ufffd\ufffd\ufffd.~");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "372465946407895726652127563160" + "'", str21, "372465946407895726652127563160");
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("62722718278913035955711442900");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\034" + "'", str5, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "125" + "'", str7, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "169" + "'", str9, "169");
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("7796138148");
        java.lang.String str19 = rSA1.encrypt("435039569");
        java.lang.String str21 = rSA1.encrypt("239682091482667318557703389810");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214" + "'", str9, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "136" + "'", str19, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "323" + "'", str21, "323");
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("2448943656306246");
        java.lang.String str17 = rSA1.decrypt("407361645");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.decrypt("220512433854357867069828977731");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "516046282123066679633035898571" + "'", str9, "516046282123066679633035898571");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd:" + "'", str11, "\000\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\005\ufffd\ufffd\ufffd\025\ufffd\ufffd\177\ufffdr" + "'", str17, "\004\005\ufffd\ufffd\ufffd\025\ufffd\ufffd\177\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002e" + "'", str21, "\002e");
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("586614665667193");
        java.lang.String str17 = rSA1.encrypt("351599105432965402456457863394");
        java.lang.String str19 = rSA1.decrypt("792688595735605867856996324071");
        java.lang.String str21 = rSA1.decrypt("211");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2553873133383733" + "'", str7, "2553873133383733");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\017\ufffds" + "'", str9, "\002\017\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001v\036\ufffd\u01bc" + "'", str11, "\001v\036\ufffd\u01bc");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\021\ufffd\ufffd\ufffd\ufffd\ufffd\u0754q" + "'", str15, "\021\ufffd\ufffd\ufffd\ufffd\ufffd\u0754q");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24452784815662381951192839217" + "'", str17, "24452784815662381951192839217");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "dz3\013\ufffd\f\ufffd\ufffd\u021a`" + "'", str19, "dz3\013\ufffd\f\ufffd\ufffd\u021a`");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffdYmfxF.\027\ufffd" + "'", str21, "\ufffdYmfxF.\027\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
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
        java.lang.String str21 = rSA1.decrypt("221971892719873328421664449213");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "210200609668991" + "'", str7, "210200609668991");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11349107838" + "'", str13, "11349107838");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9044841016" + "'", str15, "9044841016");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7338239416" + "'", str17, "7338239416");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4208324906" + "'", str19, "4208324906");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffdGZ" + "'", str21, "\002\ufffdGZ");
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("1904256626782150");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\020\ufffd\ufffd\016\ufffd\ufffdH{e\030\ufffdj" + "'", str11, "\004\020\ufffd\ufffd\016\ufffd\ufffdH{e\030\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
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
        rSA1.generateKeys(10);
        java.lang.String str27 = rSA1.decrypt("411110272427028895285258013543");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001>" + "'", str15, "\001>");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "46" + "'", str17, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "173" + "'", str19, "173");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "101" + "'", str21, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "171" + "'", str23, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd" + "'", str27, "\000\ufffd");
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("138378253545377");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?)??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "389996598666289665962263127088" + "'", str9, "389996598666289665962263127088");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\u0314\ufffd\177\ufffd\ufffdx" + "'", str11, "\004\ufffd\u0314\ufffd\177\ufffd\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "308045129864398325469443266164" + "'", str13, "308045129864398325469443266164");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "55" + "'", str17, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "109" + "'", str19, "109");
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1631704259462347" + "'", str11, "1631704259462347");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1265950043954716" + "'", str13, "1265950043954716");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1458888114255627" + "'", str15, "1458888114255627");
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("138378253545377");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "108408062866894834989443418846" + "'", str9, "108408062866894834989443418846");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "160710986363135215639492128417" + "'", str13, "160710986363135215639492128417");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "115" + "'", str17, "115");
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("125");
        java.lang.String str17 = rSA1.encrypt("9710448056486244645057993580");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "301233756914481118007161396429" + "'", str9, "301233756914481118007161396429");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\b\000\t\034\u0525\ufffd&" + "'", str11, "\ufffd\b\000\t\034\u0525\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "439010320131922045004137970136" + "'", str13, "439010320131922045004137970136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\030\ufffd\\V(\n\ufffd\ufffd\022\ufffd" + "'", str15, "\004\030\ufffd\\V(\n\ufffd\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "238189058697304961628944539513" + "'", str17, "238189058697304961628944539513");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "326663310775120808014945226940" + "'", str19, "326663310775120808014945226940");
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
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
        java.lang.String str21 = rSA1.encrypt("\007\ufffd\021\024\ufffd\ufffdU]\025\ufffd");
        java.lang.String str23 = rSA1.decrypt("2479622041");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "62459936272542342291240973436" + "'", str9, "62459936272542342291240973436");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\033\ufffd\ufffd\ufffd\ufffd\002" + "'", str11, "\033\ufffd\ufffd\ufffd\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "182910879137703834615993754494" + "'", str13, "182910879137703834615993754494");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1796498506314675" + "'", str19, "1796498506314675");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1297196877580419" + "'", str21, "1297196877580419");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\u03fe\ufffd" + "'", str23, "\003\ufffd\u03fe\ufffd");
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.encrypt("\b\ufffd\u07c2\ufffd\ufffd\ufffd\u02cd\ufffd");
        java.lang.String str21 = rSA1.encrypt("1652592266");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd|\022\ufffd\ufffdY\016\ufffd\ufffdI" + "'", str11, "\007\ufffd|\022\ufffd\ufffdY\016\ufffd\ufffdI");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "433240645127778435803400435135" + "'", str13, "433240645127778435803400435135");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "738200934648194697656183487172" + "'", str19, "738200934648194697656183487172");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "899016430102794124417534988765" + "'", str21, "899016430102794124417534988765");
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("4387152023");
        java.lang.String str17 = rSA1.decrypt("52521875");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("830");
        java.lang.String str23 = rSA1.encrypt("86369050749366992004662119224");
        java.lang.String str25 = rSA1.encrypt("452737337820613406770049518345");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "30631899957186756574433406120" + "'", str11, "30631899957186756574433406120");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3538677762" + "'", str15, "3538677762");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3766271522" + "'", str19, "3766271522");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "598553238" + "'", str21, "598553238");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4574541888" + "'", str23, "4574541888");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1585786123" + "'", str25, "1585786123");
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str5 = rSA1.decrypt("594093401393859900359548629650");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34713019818454276238101142010" + "'", str3, "34713019818454276238101142010");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffdM\177m\021\ufffd\ufffdx" + "'", str5, "\ufffd\ufffd\ufffdM\177m\021\ufffd\ufffdx");
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str15 = rSA1.decrypt("1630771903");
        java.lang.String str17 = rSA1.decrypt("272939687956143482432847478943");
        java.lang.String str19 = rSA1.decrypt("149747291");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1965272114351312" + "'", str13, "1965272114351312");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004G\f\ufffd\u02ea" + "'", str17, "\004G\f\ufffd\u02ea");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\\\ufffd\027\u05fd" + "'", str19, "\007\\\ufffd\027\u05fd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str9 = rSA1.decrypt("2602093156");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\ufffd+");
        java.lang.String str13 = rSA1.decrypt("433514589036589659930463840785");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002d" + "'", str7, "\002d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "P" + "'", str9, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "87" + "'", str11, "87");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\001" + "'", str13, "\001\001");
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("1007500148816926");
        java.lang.String str13 = rSA1.decrypt("2810229674496929");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "602612580652590428996327922059" + "'", str9, "602612580652590428996327922059");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\013N`\032\ufffd\ufffdV\020\026" + "'", str11, "\000\ufffd\013N`\032\ufffd\ufffdV\020\026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.decrypt("2139198067134255");
        java.lang.String str13 = rSA1.encrypt("3284767720");
        java.lang.String str15 = rSA1.decrypt("9631200475968403422545875079");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4023764556" + "'", str3, "4023764556");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2516484517" + "'", str7, "2516484517");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4393609752" + "'", str13, "4393609752");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\b$n" + "'", str15, "\000\ufffd\b$n");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
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
        java.lang.String str23 = rSA1.decrypt("102598660965733479902884053000");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "520" + "'", str11, "520");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003W" + "'", str13, "\003W");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "848" + "'", str15, "848");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "757" + "'", str17, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "679" + "'", str19, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "711" + "'", str21, "711");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001x" + "'", str23, "\001x");
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("3");
        java.lang.String str19 = rSA1.decrypt("478535548657058");
        java.lang.String str21 = rSA1.encrypt("\f\ufffd'G\017\ufffd\ufffd\ufffd\ufffd\ufffdC");
        java.lang.String str23 = rSA1.encrypt("108722538920771011354156006427");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256174099011227276598106759977" + "'", str9, "256174099011227276598106759977");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\u0687\ufffd\ufffd\026y\023" + "'", str11, "\004\ufffd\ufffd\u0687\ufffd\ufffd\026y\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "458193223857886300693573685011" + "'", str13, "458193223857886300693573685011");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "345025251" + "'", str17, "345025251");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd^H\032" + "'", str19, "\005\ufffd^H\032");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1364983661220270" + "'", str21, "1364983661220270");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1323742809485008" + "'", str23, "1323742809485008");
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("\006w\"\ufffd\\\ufffd\u02f7\ufffd\ufffd\u067f");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6926993947" + "'", str5, "6926993947");
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("936488068250800");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("413530087");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "54" + "'", str5, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "566" + "'", str7, "566");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "615" + "'", str9, "615");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffdG" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\ufffdG");
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("598040450161656559953215209051");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1408514752349" + "'", str11, "1408514752349");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\u03bd\ufffd\037\ufffd\ufffd\n\ufffdf" + "'", str13, "\006\u03bd\ufffd\037\ufffd\ufffd\n\ufffdf");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("570226650639502135961025038359");
        java.lang.String str19 = rSA1.encrypt("505211318948015");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "610" + "'", str11, "610");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\030\ufffd\ufffd\037\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\030\ufffd\ufffd\037\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19884168579098040117667692282" + "'", str19, "19884168579098040117667692282");
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.decrypt("31317355060983078023669156236");
        java.lang.String str9 = rSA1.decrypt("239732599822930183723892331346");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\006z" + "'", str5, "\001\ufffd\ufffd\006z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffdG" + "'", str9, "\001\ufffd\ufffd\ufffdG");
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        rSA1.generateKeys(10);
        java.lang.String str5 = rSA1.decrypt("207074022944097484930123625359");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("106");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\005" + "'", str5, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffdm1");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str7 = rSA1.encrypt("41160043025865085976700921757");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("Y");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Y\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1648159964" + "'", str3, "1648159964");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "143" + "'", str7, "143");
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("517376765656606617096719830177");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3030588733" + "'", str3, "3030588733");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7027236297" + "'", str5, "7027236297");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6588495399" + "'", str7, "6588495399");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd" + "'", str9, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2813354507" + "'", str11, "2813354507");
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
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
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.decrypt("6250160807051710641100560070");
        java.lang.String str25 = rSA1.decrypt("1406513568");
        java.lang.String str27 = rSA1.encrypt("\000\ufffd\ufffd\u076a\ufffd\ufffd\024\ufffd\ufffd");
        java.lang.String str29 = rSA1.encrypt("1933045463197265");
        java.lang.String str31 = rSA1.encrypt("2345855125");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "571019148067721258769258651304" + "'", str9, "571019148067721258769258651304");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023" + "'", str11, "\t\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "410713309484345245361400782541" + "'", str13, "410713309484345245361400782541");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd!\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd!\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "391344857860263627240641682032" + "'", str17, "391344857860263627240641682032");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4630431259150276755745054235" + "'", str21, "4630431259150276755745054235");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\036\ufffd\ufffd\ufffd3" + "'", str23, "\036\ufffd\ufffd\ufffd3");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffd " + "'", str25, "\ufffd\ufffd\ufffd\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "15913346086162767805288599948" + "'", str27, "15913346086162767805288599948");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "14896142068114928435632464809" + "'", str29, "14896142068114928435632464809");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "34561085384999013365929913580" + "'", str31, "34561085384999013365929913580");
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("956742419960502");
        java.lang.String str13 = rSA1.encrypt("677515820738920883677057551843");
        java.lang.String str15 = rSA1.decrypt("120607011170300625513497917516");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1849318294558205" + "'", str7, "1849318294558205");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\007\ufffd\ufffd" + "'", str9, "\003\ufffd\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffdX" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "836172713874257" + "'", str13, "836172713874257");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\004%5\032\ufffd" + "'", str15, "\002\004%5\032\ufffd");
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        java.lang.String str13 = rSA1.decrypt("806729601483697513872336243167");
        java.lang.String str15 = rSA1.encrypt("5267573612");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3573428463" + "'", str3, "3573428463");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6710695496" + "'", str7, "6710695496");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3391567540" + "'", str9, "3391567540");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "712238419" + "'", str11, "712238419");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\032\ufffdr" + "'", str13, "\032\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6220139312" + "'", str15, "6220139312");
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("462059788404288851690924494526");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "364192464699401728362032469933" + "'", str9, "364192464699401728362032469933");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "303985410932199651655078922475" + "'", str13, "303985410932199651655078922475");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "580592203925796484795402193026" + "'", str15, "580592203925796484795402193026");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "585612345930370885968330826964" + "'", str17, "585612345930370885968330826964");
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.encrypt("765314849130516");
        java.lang.String str19 = rSA1.encrypt("78487019142441916661670426960");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "513414508622264831942236033053" + "'", str9, "513414508622264831942236033053");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\r\ufffd\ufffd\u0440\005\ufffd\ufffd" + "'", str11, "\001\ufffd\r\ufffd\ufffd\u0440\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "193640932904919946060086878703" + "'", str13, "193640932904919946060086878703");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "589618085883782846024983477818" + "'", str15, "589618085883782846024983477818");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "666080195787714517077761024191" + "'", str17, "666080195787714517077761024191");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "321751795317106623558623361593" + "'", str19, "321751795317106623558623361593");
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
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
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffdK\003" + "'", str13, "\006\ufffd\ufffdK\003");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "592130941379766" + "'", str15, "592130941379766");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\022\ufffd\ufffd\023\ufffdY\031\ufffd~\002h" + "'", str19, "\007\022\ufffd\ufffd\023\ufffdY\031\ufffd~\002h");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10765912267239608505424856028" + "'", str21, "10765912267239608505424856028");
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\005\u0428\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "226637199" + "'", str5, "226637199");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "276877514" + "'", str7, "276877514");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "676781396900575" + "'", str11, "676781396900575");
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
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
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffdy<R" + "'", str13, "\006\ufffd\ufffdy<R");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "500379784568774" + "'", str15, "500379784568774");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2213001490280441" + "'", str17, "2213001490280441");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "137" + "'", str23, "137");
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("1408514752349");
        java.lang.String str17 = rSA1.decrypt("715760744860764417509469677307");
        java.lang.String str19 = rSA1.encrypt("814813217197256");
        java.lang.String str21 = rSA1.encrypt("3177946531848200628434003703");
        java.lang.String str23 = rSA1.decrypt("193407581656328801842000858954");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2767578329974428" + "'", str7, "2767578329974428");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "78" + "'", str15, "78");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001z" + "'", str17, "\001z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "189" + "'", str19, "189");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "308" + "'", str21, "308");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("460290203420997373753530609873");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "202" + "'", str5, "202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\034" + "'", str7, "\034");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "46" + "'", str9, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd," + "'", str13, "\001\ufffd,");
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("549539548161837355014455050201");
        java.lang.String str17 = rSA1.encrypt("\0342h\177\ufffd!b\006\ufffd\fzQ");
        rSA1.generateKeys(10);
        java.lang.String str21 = rSA1.decrypt("1062642813");
        java.lang.String str23 = rSA1.encrypt("390010346396905817970965884381");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "565921648723003255965457729876" + "'", str9, "565921648723003255965457729876");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "565921648723003255965457729876" + "'", str11, "565921648723003255965457729876");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)4" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\021\005\u853a" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\021\005\u853a");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "286791614639080709153027378627" + "'", str17, "286791614639080709153027378627");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001?" + "'", str21, "\001?");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "334" + "'", str23, "334");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.encrypt("442906429184914576856631382878");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1456681390531260" + "'", str7, "1456681390531260");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "908403496392256" + "'", str13, "908403496392256");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\ufffd\u07dcb:Z" + "'", str15, "\n\ufffd\u07dcb:Z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "534652891" + "'", str19, "534652891");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("1900562927670896");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "72" + "'", str11, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "156" + "'", str13, "156");
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("432268551667889026451279149775");
        java.lang.String str11 = rSA1.encrypt("\003MCV\"\ufffd\ufffd\031\ufffd\ufffd\006h");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd4" + "'", str9, "\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1987991876" + "'", str11, "1987991876");
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("\001\ufffd\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "25692511275152905020679583409" + "'", str3, "25692511275152905020679583409");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "885961778" + "'", str7, "885961778");
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("10657727957294");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "155786206745934" + "'", str7, "155786206745934");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "385" + "'", str11, "385");
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd\u03e0\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffdE\036");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "333761595712292947242537991803" + "'", str3, "333761595712292947242537991803");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7268001973" + "'", str7, "7268001973");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
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
        rSA1.generateKeys((int) ' ');
        java.lang.String str25 = rSA1.encrypt("302896852174618096971866978650");
        java.lang.String str27 = rSA1.encrypt("628721392023099021090119745452");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "110990081129429679418953710973" + "'", str9, "110990081129429679418953710973");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "599676572055304964086626382694" + "'", str11, "599676572055304964086626382694");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "26040763749233042560874705711" + "'", str17, "26040763749233042560874705711");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "38522769859174285312" + "'", str19, "38522769859174285312");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "739183480933611504563797096822" + "'", str21, "739183480933611504563797096822");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "983562564" + "'", str25, "983562564");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2518899455" + "'", str27, "2518899455");
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("543");
        java.lang.String str15 = rSA1.decrypt("231279615465721569603755126783");
        java.lang.String str17 = rSA1.decrypt("2592470118736841");
        java.lang.String str19 = rSA1.decrypt("383765587944511");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "79095506676194133203686269989" + "'", str9, "79095506676194133203686269989");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "469556641428864146362860701256" + "'", str11, "469556641428864146362860701256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "315528995071478769295170163746" + "'", str13, "315528995071478769295170163746");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004F\013\u0251Qrq\nx\035\ufffd" + "'", str15, "\004F\013\u0251Qrq\nx\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\025\ufffd&\032\017\ufffd^V" + "'", str17, "\002\ufffd\ufffd\ufffd\025\ufffd&\032\017\ufffd^V");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\177\ufffd\ufffd\tSSBALW" + "'", str19, "\002\ufffd\177\ufffd\ufffd\tSSBALW");
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("75472562827089017340799555154");
        java.lang.String str11 = rSA1.encrypt("214450326285773129502890621279");
        java.lang.String str13 = rSA1.decrypt("103051321850618132719621699391");
        java.lang.String str15 = rSA1.decrypt("3446865071729492");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\033\ufffdtP\027\ufffd" + "'", str3, "\b\033\ufffdtP\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875761491868624" + "'", str5, "875761491868624");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2780893726918200" + "'", str7, "2780893726918200");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "526282100264170" + "'", str9, "526282100264170");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1740368546649777" + "'", str11, "1740368546649777");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffdg" + "'", str13, "\n\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\016\ufffd\ufffd\ufffd.\013" + "'", str15, "\006\016\ufffd\ufffd\ufffd.\013");
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdx");
        java.lang.String str15 = rSA1.decrypt("1340958869222593");
        java.lang.String str17 = rSA1.encrypt("4990141519");
        java.lang.String str19 = rSA1.decrypt("858");
        java.lang.String str21 = rSA1.encrypt("3677053396");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61194659896455" + "'", str7, "61194659896455");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5989735521" + "'", str13, "5989735521");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3718403283" + "'", str17, "3718403283");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\001" + "'", str19, "\000\ufffd\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3875730251" + "'", str21, "3875730251");
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("37822311364830212583");
        java.lang.String str19 = rSA1.encrypt("772078695069549");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "137941114876772508580473310094" + "'", str9, "137941114876772508580473310094");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\001\ufffd\ufffd\ufffd\ufffd[" + "'", str13, "\002\001\ufffd\ufffd\ufffd\ufffd[");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1921116640156458" + "'", str15, "1921116640156458");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3294999816725462" + "'", str17, "3294999816725462");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2732541180276682" + "'", str19, "2732541180276682");
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(100);
        java.lang.String str7 = rSA1.encrypt("2185508545");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "520729673951405358215623806051" + "'", str7, "520729673951405358215623806051");
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str21 = rSA1.encrypt("841619268646719464790099241834");
        java.lang.String str23 = rSA1.encrypt("1832644267111399");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193282224972639213679584971817" + "'", str9, "193282224972639213679584971817");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "180191978764292161547470708517" + "'", str13, "180191978764292161547470708517");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\035\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\035\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97882734" + "'", str21, "97882734");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1395468237" + "'", str23, "1395468237");
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
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
        java.lang.String str21 = rSA1.decrypt("848");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\177\ufffdgI" + "'", str13, "\003\177\ufffdgI");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1890284972107175" + "'", str15, "1890284972107175");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "429" + "'", str19, "429");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001d" + "'", str21, "\001d");
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("21717639");
        java.lang.String str17 = rSA1.encrypt("4947905959");
        java.lang.String str19 = rSA1.encrypt("416457944894064195171883846947");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\027" + "'", str15, "\001\027");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1022582103891608" + "'", str17, "1022582103891608");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1968179712636040" + "'", str19, "1968179712636040");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("369");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\027" + "'", str5, "\027");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "632" + "'", str7, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "508" + "'", str9, "508");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\ufffdf" + "'", str15, "\r\ufffdf");
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("2438604946779230");
        java.lang.String str17 = rSA1.decrypt("977645517028708");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "54196093293599722874725897640" + "'", str15, "54196093293599722874725897640");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\037\ufffd\ufffd\ufffd\ufffd\036\ufffds" + "'", str17, "\000\ufffd\037\ufffd\ufffd\ufffd\ufffd\036\ufffds");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.lang.String str17 = rSA1.encrypt("173476924289590");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd;");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2266092532227079" + "'", str7, "2266092532227079");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1295747341" + "'", str17, "1295747341");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3958432621" + "'", str19, "3958432621");
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
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
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4301895466475968251874335050" + "'", str9, "4301895466475968251874335050");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "106842683118020303401791351248" + "'", str11, "106842683118020303401791351248");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "494119693637231903131703666871" + "'", str13, "494119693637231903131703666871");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "177" + "'", str17, "177");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "205" + "'", str21, "205");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("\004\016\ufffd\ufffdOl\037\ufffdM\n\ufffd2");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1967349916" + "'", str7, "1967349916");
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("*");
        java.lang.String str19 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "148414795946266909064798405544" + "'", str9, "148414795946266909064798405544");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338352773387970613342001959343" + "'", str11, "338352773387970613342001959343");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "381673163605486485950497901582" + "'", str13, "381673163605486485950497901582");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "104" + "'", str17, "104");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000" + "'", str19, "\000");
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("490536993234244");
        java.lang.String str15 = rSA1.encrypt("2036929128843843");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\u02fb\ufffd.\000i" + "'", str3, "\002\u02fb\ufffd.\000i");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1807828267868459" + "'", str5, "1807828267868459");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3305702674966632" + "'", str7, "3305702674966632");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\t\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "752026583012135771234015503260" + "'", str15, "752026583012135771234015503260");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("457613644251791188504293612087");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\034\u0302\ufffd>\t" + "'", str7, "\004\034\u0302\ufffd>\t");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("546441400885176648772586357406");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("694351392156537328143263582359");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3360553668" + "'", str3, "3360553668");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3403741700" + "'", str5, "3403741700");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5687802977" + "'", str7, "5687802977");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd*" + "'", str9, "\001\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "155779093699689" + "'", str13, "155779093699689");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\u0692\ufffd,");
        java.lang.String str17 = rSA1.decrypt("7757737415");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "893518002247524" + "'", str7, "893518002247524");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\f\ufffd\ufffd\ufffd\ufffdy" + "'", str9, "\f\ufffd\ufffd\ufffd\ufffdy");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3123808524237855" + "'", str13, "3123808524237855");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3102945802320259" + "'", str15, "3102945802320259");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd\ufffd\022\031" + "'", str17, "\n\ufffd\ufffd\022\031");
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
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
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "321380330640038729361322812461" + "'", str9, "321380330640038729361322812461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "889900157849701109681186904793" + "'", str13, "889900157849701109681186904793");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "498305535686239" + "'", str19, "498305535686239");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd" + "'", str21, "\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t\ufffd\ud1eb" + "'", str23, "\t\ufffd\ud1eb");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\002\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        java.lang.String str9 = rSA1.encrypt("11695976753");
        java.lang.String str11 = rSA1.encrypt("\002\033\ufffd\t\ufffd\ufffd>\026\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("144833308724683925683949639490");
        rSA1.generateKeys((int) (short) 100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "491" + "'", str9, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "82" + "'", str11, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "372" + "'", str13, "372");
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
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
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\023\ufffd\003\ufffd" + "'", str13, "\002\ufffd\023\ufffd\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1449344919715565" + "'", str15, "1449344919715565");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1639240731015654" + "'", str17, "1639240731015654");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1658639760264902" + "'", str19, "1658639760264902");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2744" + "'", str21, "2744");
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.decrypt("755629646");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.encrypt("152326453382622375135620688500");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "571407599395771522738838610744" + "'", str9, "571407599395771522738838610744");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "812419713945994724235938697574" + "'", str11, "812419713945994724235938697574");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "113939832320782340380616290408" + "'", str13, "113939832320782340380616290408");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffdlRg\"\ufffd\ufffd\t\ufffd\ufffd" + "'", str15, "\b\ufffdlRg\"\ufffd\ufffd\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "104458681305577324662936800521" + "'", str19, "104458681305577324662936800521");
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\032g\016");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7337039761" + "'", str7, "7337039761");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6511798990" + "'", str9, "6511798990");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\036\ufffdh" + "'", str11, "\001\036\ufffdh");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4428807890" + "'", str13, "4428807890");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7342444102" + "'", str15, "7342444102");
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("829");
        java.lang.String str17 = rSA1.encrypt("132651");
        java.lang.String str19 = rSA1.decrypt("223287504203909719590032994769");
        java.lang.String str21 = rSA1.encrypt("1088659475");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\001\ufffd\ufffdK\013");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???K?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "411201715718350643638513906913" + "'", str9, "411201715718350643638513906913");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\u02eb\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\u02eb\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "26066407646466012574922131309" + "'", str17, "26066407646466012574922131309");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\f\ufffd\ufffd\f" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\f\ufffd\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "91417379349960554001026109431" + "'", str21, "91417379349960554001026109431");
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.String str13 = rSA1.decrypt("329114188050351");
        java.lang.String str15 = rSA1.encrypt("x\001\005\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("135559370710933428039709918499");
        java.lang.String str19 = rSA1.encrypt("98157585685811018815373522697");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "278" + "'", str7, "278");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "103" + "'", str11, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "M" + "'", str13, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "481" + "'", str15, "481");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "r" + "'", str17, "r");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "199" + "'", str19, "199");
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("828944592250846");
        java.lang.String str11 = rSA1.decrypt("60732077159364971136922584801");
        java.lang.String str13 = rSA1.encrypt("\006\u0453\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "e" + "'", str9, "e");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "29" + "'", str13, "29");
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
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
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1883520628925337" + "'", str7, "1883520628925337");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1713974234917407" + "'", str13, "1713974234917407");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1190747387337275" + "'", str15, "1190747387337275");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2186936061871529" + "'", str17, "2186936061871529");
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("10590563594");
        java.lang.String str11 = rSA1.decrypt("395899771572896144210561400268");
        java.lang.String str13 = rSA1.encrypt("361957846321412704292555945794");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\021\032\ufffd" + "'", str3, "\005\021\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1636723289471012" + "'", str5, "1636723289471012");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "971896960597456" + "'", str7, "971896960597456");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd+wd" + "'", str9, "\000\ufffd+wd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffdN\025\ufffdm" + "'", str11, "\002\ufffdN\025\ufffdm");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "68510378004065" + "'", str13, "68510378004065");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("503");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1721440817722428" + "'", str11, "1721440817722428");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1228304915520028" + "'", str13, "1228304915520028");
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str15 = rSA1.encrypt("210378250090253374708038199698");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("2474705579721179");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "123893788162252" + "'", str13, "123893788162252");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "876213871875903" + "'", str15, "876213871875903");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "216" + "'", str19, "216");
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("87658465495263894175189561611");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "466987737015180" + "'", str11, "466987737015180");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1417479599978528" + "'", str13, "1417479599978528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\u0380\ufffd\ufffd\u07eb\007>\020" + "'", str17, "\000\ufffd\ufffd\u0380\ufffd\ufffd\u07eb\007>\020");
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("436888915925883347513701815904");
        java.lang.String str11 = rSA1.encrypt("\f\ufffdU\177\ufffd\002\ufffd\ufffd\177\ufffd~\b");
        java.lang.String str13 = rSA1.encrypt("680112922457928");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "30" + "'", str11, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\n\ufffd\013\u07a1\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????i?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "329497074296949818883403568999" + "'", str9, "329497074296949818883403568999");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "148549519059167967297538459867" + "'", str11, "148549519059167967297538459867");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\035\ufffd" + "'", str15, "\004\ufffd\ufffd\035\ufffd");
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("13087572778356868098099484487");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str23 = rSA1.encrypt("11060739609");
        java.lang.String str25 = rSA1.encrypt("332932055509601845975748029145");
        java.lang.String str27 = rSA1.decrypt("2101145813961538");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = rSA1.decrypt("\\\ufffd\013");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\\3??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2338759490679886" + "'", str7, "2338759490679886");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1427234521287944" + "'", str13, "1427234521287944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\035\ufffd\ufffd\ufffdE" + "'", str15, "\005\035\ufffd\ufffd\ufffdE");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\bfO\f\ufffd\ufffd" + "'", str17, "\bfO\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2449162769747878" + "'", str19, "2449162769747878");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "27791684798159756495792189063" + "'", str23, "27791684798159756495792189063");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "327166768349329712513249288856" + "'", str25, "327166768349329712513249288856");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001\ufffd\ufffd\ufffd`zR\000\ufffd" + "'", str27, "\001\ufffd\ufffd\ufffd`zR\000\ufffd");
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("2228954831817383");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?}|?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "430165686110693234485670275056" + "'", str9, "430165686110693234485670275056");
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.encrypt("765314849130516");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\ufffd\ufffd9G\020\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\002\ufffd");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "249573886692994863024663778981" + "'", str9, "249573886692994863024663778981");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\032\ufffd\ufffd\007\023\ufffd\ufffd5" + "'", str11, "\002\032\ufffd\ufffd\007\023\ufffd\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "161686082948085743393181725959" + "'", str13, "161686082948085743393181725959");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "324397922400462523307612456972" + "'", str15, "324397922400462523307612456972");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "398376776919255976362686633212" + "'", str17, "398376776919255976362686633212");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "311872496205079797936906925788" + "'", str19, "311872496205079797936906925788");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "435855169262786418862065294567" + "'", str21, "435855169262786418862065294567");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2277631229360699" + "'", str7, "2277631229360699");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "387996888656448" + "'", str13, "387996888656448");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffdF\0265]k" + "'", str15, "\001\ufffdF\0265]k");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        java.lang.String str17 = rSA1.encrypt("159324186965374018993794128375");
        java.lang.String str19 = rSA1.encrypt("2305703395965035");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2191341956468068" + "'", str7, "2191341956468068");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd;\bH" + "'", str15, "\002\ufffd;\bH");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2880066668" + "'", str17, "2880066668");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2328213916" + "'", str19, "2328213916");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
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
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("2279400941187448");
        java.lang.String str15 = rSA1.decrypt("100240732388302475470420810056");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2013011102309120" + "'", str7, "2013011102309120");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "83662475735080212417862327130" + "'", str13, "83662475735080212417862327130");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\u051a\ufffd\ufffd}" + "'", str15, "\005\ufffd\ufffd\u051a\ufffd\ufffd}");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str17 = rSA1.encrypt("1472324714429839");
        java.lang.String str19 = rSA1.encrypt("44249750134603965137544010532");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "147177536109389832570321408594" + "'", str9, "147177536109389832570321408594");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\u0713\ufffd^Rs\026\ufffd" + "'", str11, "\b\ufffd\u0713\ufffd^Rs\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "654038163250215036698946129670" + "'", str13, "654038163250215036698946129670");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffdk\007\ufffd" + "'", str15, "\007\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffdk\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "250475886552700333729464345182" + "'", str17, "250475886552700333729464345182");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "141887190185133205413450910564" + "'", str19, "141887190185133205413450910564");
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "568745511381805" + "'", str7, "568745511381805");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "24432592094102070736159931840" + "'", str13, "24432592094102070736159931840");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\007\ufffd\n\ufffd\ufffd\ufffd\ufffdh" + "'", str15, "\003\ufffd\ufffd\007\ufffd\n\ufffd\ufffd\ufffd\ufffdh");
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.encrypt("765314849130516");
        java.lang.String str19 = rSA1.encrypt("1200908742907039");
        java.lang.String str21 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28701859650209389604436748273" + "'", str9, "28701859650209389604436748273");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdg\001a" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdg\001a");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "113353276149823871431983469405" + "'", str13, "113353276149823871431983469405");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "257488298378422158223901444025" + "'", str15, "257488298378422158223901444025");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "274485221529117686598961163218" + "'", str17, "274485221529117686598961163218");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "278618288100609018609853295658" + "'", str19, "278618288100609018609853295658");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "226410239253777976718466339777" + "'", str21, "226410239253777976718466339777");
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        java.lang.String str13 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str15 = rSA1.decrypt("352");
        java.lang.String str17 = rSA1.decrypt("611943475129151");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "46009866793801901029099412615" + "'", str9, "46009866793801901029099412615");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "441817200835788830183309864528" + "'", str11, "441817200835788830183309864528");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdmR\026\ufffd\ufffdZi" + "'", str13, "\ufffdmR\026\ufffd\ufffdZi");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\u0243\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\u0243\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\u047c\ufffd\ufffd\ufffd\ufffdG" + "'", str17, "\002\ufffd\ufffd\ufffd\u047c\ufffd\ufffd\ufffd\ufffdG");
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("1527126373863416");
        java.lang.String str13 = rSA1.encrypt("50305157274325");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\n\ufffd\ufffd\034\ufffd\023\006\ufffd\016\ufffd\ufffd" + "'", str3, "\t\n\ufffd\ufffd\034\ufffd\023\006\ufffd\016\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "43048917175519330887727756253" + "'", str5, "43048917175519330887727756253");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "233116307107919203489879234098" + "'", str7, "233116307107919203489879234098");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\006\ufffd\ufffd\ufffd\035\ufffdr" + "'", str9, "\007\ufffd\006\ufffd\ufffd\ufffd\035\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "12013620465816447705379569410" + "'", str11, "12013620465816447705379569410");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "575641836182815512052946894033" + "'", str13, "575641836182815512052946894033");
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
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
        java.lang.String str23 = rSA1.encrypt("3366732744");
        java.lang.String str25 = rSA1.encrypt("796");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "968832336921184" + "'", str7, "968832336921184");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\ufffd\ufffd" + "'", str9, "\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "751753721976880" + "'", str13, "751753721976880");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "442439193748327" + "'", str15, "442439193748327");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "555759521992378" + "'", str17, "555759521992378");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "22472321359454444448091875517" + "'", str23, "22472321359454444448091875517");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "7968879757441977254745602294" + "'", str25, "7968879757441977254745602294");
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("346125639250942006569169281670");
        java.lang.String str15 = rSA1.encrypt("592552440178091751602093603316");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "341" + "'", str13, "341");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "62" + "'", str15, "62");
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt(".\022\ufffd\ufffd\024\ufffd\ufffd0GF");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2313270479799728" + "'", str7, "2313270479799728");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3508203582982386312774896513" + "'", str13, "3508203582982386312774896513");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
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
        java.lang.String str21 = rSA1.encrypt("5904936616");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "13740080501134851615690786797" + "'", str9, "13740080501134851615690786797");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "13740080501134851615690786797" + "'", str11, "13740080501134851615690786797");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\f\ufffdw\"\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\f\ufffdw\"\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "268003371460764603227596634098" + "'", str15, "268003371460764603227596634098");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\017\ufffd\ufffd\034\ufffd\ufffd}8" + "'", str17, "\004\017\ufffd\ufffd\034\ufffd\ufffd}8");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "108688688941146039066007468818" + "'", str19, "108688688941146039066007468818");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "396445220109954783604843060339" + "'", str21, "396445220109954783604843060339");
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("442380850626800120698932994377");
        java.lang.String str19 = rSA1.encrypt("511324906649475524073057205686");
        java.lang.String str21 = rSA1.encrypt("647229245919364");
        java.lang.String str23 = rSA1.encrypt("\002\ufffd\ufffd\ufffd1\013\ufffd3\021I");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "456" + "'", str9, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "312" + "'", str13, "312");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "501" + "'", str17, "501");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "208" + "'", str19, "208");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "501" + "'", str21, "501");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "246" + "'", str23, "246");
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
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
        java.lang.String str23 = rSA1.encrypt("650");
        java.lang.String str25 = rSA1.encrypt("4431580083");
        java.lang.String str27 = rSA1.decrypt("349877007798484929782020171088");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1730441854866234" + "'", str7, "1730441854866234");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "87057194177811" + "'", str13, "87057194177811");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\021\ufffd" + "'", str15, "\001\ufffd\ufffd\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffdo\f" + "'", str19, "\ufffdo\f");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "44835732012617216000" + "'", str23, "44835732012617216000");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "191348933082036977440704188090" + "'", str25, "191348933082036977440704188090");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffdx" + "'", str27, "\000\ufffd\ufffd\ufffd\ufffd\ufffdx");
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("489216744821809573348585320231");
        java.lang.String str19 = rSA1.encrypt("\\\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("1557951100096944");
        java.lang.String str23 = rSA1.decrypt("961211650033787993892761995823");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\001\013k\033\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??k\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "473201071802633457024028309534" + "'", str17, "473201071802633457024028309534");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "567715564494264462052860703969" + "'", str19, "567715564494264462052860703969");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\b\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\b\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\013\025\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffdl" + "'", str23, "\013\025\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffdl");
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\013\ufffd\ufffd\024\r");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "792012401843367" + "'", str7, "792012401843367");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2056135082972532" + "'", str9, "2056135082972532");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "660093708168141" + "'", str11, "660093708168141");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "55984932427147525483713682273" + "'", str17, "55984932427147525483713682273");
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("1021508253829588");
        java.lang.String str17 = rSA1.decrypt("55073177600000");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1136669809975630" + "'", str7, "1136669809975630");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003`0\025\ufffd\ufffdp" + "'", str9, "\003`0\025\ufffd\ufffdp");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1235658017006916" + "'", str11, "1235658017006916");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "606244041220842" + "'", str13, "606244041220842");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "455310220248709" + "'", str15, "455310220248709");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffdW#\f" + "'", str17, "\004\ufffdW#\f");
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.decrypt("753709548305681");
        java.lang.String str19 = rSA1.decrypt("177");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "512682617907219447977506650986" + "'", str9, "512682617907219447977506650986");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "556056162004549488864835782396" + "'", str11, "556056162004549488864835782396");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\u0368\ufffd\\\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\u0368\ufffd\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\027\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\027\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd2\021." + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd2\021.");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd5\032\021\ufffdU\016\ufffd\ufffd\ufffd" + "'", str19, "\001\ufffd5\032\021\ufffdU\016\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
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
        java.lang.String str23 = rSA1.encrypt("514022429339877052793021759384");
        java.lang.String str25 = rSA1.encrypt("1107198777024550");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\u016c\ufffd\ufffd" + "'", str13, "\ufffd\u016c\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2975124402564753" + "'", str15, "2975124402564753");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2458426670772712" + "'", str17, "2458426670772712");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1570112126547228" + "'", str19, "1570112126547228");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "756164709589122" + "'", str21, "756164709589122");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "683210234802409" + "'", str23, "683210234802409");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "210735611196642" + "'", str25, "210735611196642");
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("2184831592");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198" + "'", str13, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffdI\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffdI\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1792074056760905");
        java.lang.String str15 = rSA1.encrypt("190");
        java.lang.String str17 = rSA1.decrypt("205209132115534698884987734640");
        java.lang.String str19 = rSA1.encrypt("538995184522415200799108498836");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "860214352902152" + "'", str7, "860214352902152");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd2\021\ufffd\004w" + "'", str9, "\005\ufffd2\021\ufffd\004w");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "525" + "'", str15, "525");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "539" + "'", str19, "539");
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("37761701459156484237");
        java.lang.String str17 = rSA1.encrypt("1072620211829688962532211142741");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "294095346898650070106929476989" + "'", str11, "294095346898650070106929476989");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "78530715584162517683200118772" + "'", str15, "78530715584162517683200118772");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "374936199645101415739705441367" + "'", str17, "374936199645101415739705441367");
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.encrypt("\002<|\031\016\ufffdt");
        java.lang.String str11 = rSA1.encrypt("352");
        java.lang.String str13 = rSA1.decrypt("423194135510858684994917032077");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "126" + "'", str9, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "645" + "'", str11, "645");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "257560383068881854949316853108" + "'", str9, "257560383068881854949316853108");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "39054327381859210852915430550" + "'", str11, "39054327381859210852915430550");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\177\ufffd\ufffd\001\r\ufffd" + "'", str13, "\001\ufffd\ufffd\177\ufffd\ufffd\001\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\001\u0479\032\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\001\u0479\032\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.decrypt("307641391968194344643523456830");
        java.lang.String str17 = rSA1.encrypt("253884834105822557075962649811");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2039117448136325" + "'", str7, "2039117448136325");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "118" + "'", str11, "118");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "243" + "'", str13, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "169" + "'", str17, "169");
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("370");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "248684067319039722578632267605" + "'", str9, "248684067319039722578632267605");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\033\ufffd\ufffd\013\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\033\ufffd\ufffd\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "499151339143669880001925435871" + "'", str13, "499151339143669880001925435871");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007iP\n\ufffd%o\"\177\032\ufffd\u0630" + "'", str15, "\007iP\n\ufffd%o\"\177\032\ufffd\u0630");
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffd\007\u0529\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "g" + "'", str11, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "768" + "'", str15, "768");
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1298544399" + "'", str5, "1298544399");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "844329980" + "'", str7, "844329980");
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.decrypt("192");
        java.lang.String str11 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str13 = rSA1.encrypt("\005\u07f8\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("478908770438626");
        java.lang.String str17 = rSA1.decrypt("37468467090067767106021692253");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "472676187782197" + "'", str7, "472676187782197");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\013\ufffd" + "'", str9, "\001\ufffd\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\r\ufffd@" + "'", str11, "\001\ufffd\ufffd\r\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "510680761070789" + "'", str13, "510680761070789");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006C\t\ufffd\ufffd" + "'", str15, "\006C\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffd\ufffd,\025\ufffdX" + "'", str17, "\t\ufffd\ufffd,\025\ufffdX");
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("3083620275");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001C" + "'", str13, "\001C");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "457" + "'", str15, "457");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffde" + "'", str19, "\003\ufffd\ufffd\ufffde");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("813206094276231374379760053937");
        java.lang.String str13 = rSA1.decrypt("342");
        java.lang.String str15 = rSA1.decrypt("178013705648220");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998985947008931" + "'", str7, "1998985947008931");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\033\b\ufffd" + "'", str11, "\033\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffdY" + "'", str15, "\ufffd\ufffdY");
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("572726807792118476680166356076");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "J" + "'", str13, "J");
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        java.lang.String str9 = rSA1.decrypt("673956605723821641068855364286");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "594933548" + "'", str5, "594933548");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "216240056" + "'", str7, "216240056");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5\f\ufffdx" + "'", str9, "5\f\ufffdx");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
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
        java.lang.String str27 = rSA1.encrypt("597293335191402");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "577164265294788413732408683773" + "'", str9, "577164265294788413732408683773");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffdF\030\ufffd\ufffd\025\ufffd\ufffd" + "'", str11, "\005\ufffdF\030\ufffd\ufffd\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "155597224641182427999950706455" + "'", str13, "155597224641182427999950706455");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\u010d\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\u010d\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "241687330988197122115012970375" + "'", str17, "241687330988197122115012970375");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "57528357686827370491987177259" + "'", str21, "57528357686827370491987177259");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10760626915747715784073227399" + "'", str27, "10760626915747715784073227399");
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("576");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "639756995027519029461509721419" + "'", str9, "639756995027519029461509721419");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\\W\022XE\t\ufffd8[" + "'", str11, "\000\ufffd\ufffd\\W\022XE\t\ufffd8[");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd(>\t\ufffd0\001\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd(>\t\ufffd0\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd-5\026\ufffd\ufffd\ufffd\ufffd\ufffd\005\ufffd" + "'", str17, "\ufffd-5\026\ufffd\ufffd\ufffd\ufffd\ufffd\005\ufffd");
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("270064452819075595077010738176");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffde-" + "'", str7, "\ufffde-");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4177900505" + "'", str9, "4177900505");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffdiP" + "'", str11, "\001\ufffdiP");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("592549611818494376206249350988");
        java.lang.String str13 = rSA1.decrypt("245512847854625650469734822557");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "207" + "'", str11, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "s" + "'", str13, "s");
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("459239140433883");
        java.lang.String str5 = rSA1.encrypt("1251472241038399");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34890264043068983913668670838" + "'", str3, "34890264043068983913668670838");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "610956906038707210853688096274" + "'", str5, "610956906038707210853688096274");
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("1088253610076491");
        java.lang.String str21 = rSA1.encrypt(" y-\000\ufffd\013\ufffdf\004s");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "433671524666442" + "'", str7, "433671524666442");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "95" + "'", str19, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "157" + "'", str21, "157");
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("1408514752349");
        java.lang.String str17 = rSA1.decrypt("715760744860764417509469677307");
        java.lang.String str19 = rSA1.encrypt("814813217197256");
        java.lang.String str21 = rSA1.encrypt("3177946531848200628434003703");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "113627857187853" + "'", str7, "113627857187853");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "560" + "'", str15, "560");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001Q" + "'", str17, "\001Q");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "162" + "'", str19, "162");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "307" + "'", str21, "307");
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
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
        java.lang.String str21 = rSA1.decrypt("391");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffds" + "'", str11, "\n\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33570448563366733031" + "'", str15, "33570448563366733031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "303456068448371387796474277151" + "'", str17, "303456068448371387796474277151");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006+*I\027\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\006+*I\027\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\u0366N7E\000\ufffd\ufffd*" + "'", str21, "\001\ufffd\u0366N7E\000\ufffd\ufffd*");
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.decrypt("2139198067134255");
        java.lang.String str13 = rSA1.encrypt("3284767720");
        java.lang.String str15 = rSA1.decrypt("6090687537");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10872316119" + "'", str3, "10872316119");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7939594299" + "'", str5, "7939594299");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3692594667" + "'", str7, "3692594667");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd_\036\ufffd" + "'", str9, "\001\ufffd_\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\\\ufffd\ufffd\030" + "'", str11, "\001\\\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5991316704" + "'", str13, "5991316704");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\032\ufffd\000\ufffd" + "'", str15, "\001\032\ufffd\000\ufffd");
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("15531997365273025742698361245");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "749757822" + "'", str5, "749757822");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("\002\ufffd\ufffd\ufffdO\004\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "779438030896608" + "'", str7, "779438030896608");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2357408682169845" + "'", str13, "2357408682169845");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\f\ufffd\ufffd" + "'", str15, "\002\ufffd\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\021\032\ufffd" + "'", str17, "\005\021\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1097925001138789" + "'", str19, "1097925001138789");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.encrypt("252");
        java.lang.String str21 = rSA1.encrypt("20");
        java.lang.String str23 = rSA1.decrypt("561658842431796679757060112120");
        java.lang.String str25 = rSA1.encrypt("2582197211");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str29 = rSA1.encrypt("581");
        java.lang.Class<?> wildcardClass30 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "846187935413587287443508532656" + "'", str9, "846187935413587287443508532656");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "404099239574044410976750616119" + "'", str11, "404099239574044410976750616119");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "772866124170651629416628919113" + "'", str13, "772866124170651629416628919113");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "65" + "'", str17, "65");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "326" + "'", str19, "326");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "784" + "'", str21, "784");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\n" + "'", str23, "\002\n");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "44" + "'", str25, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "248" + "'", str29, "248");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
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
        java.lang.String str21 = rSA1.decrypt("295181302357437057453544767129");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "197309423833816" + "'", str7, "197309423833816");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd{" + "'", str9, "\005\ufffd\ufffd\ufffd{");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1578501902382348" + "'", str13, "1578501902382348");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1037750181141917" + "'", str15, "1037750181141917");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd>\r\020\ufffd" + "'", str17, "\000\ufffd>\r\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "737420852169451" + "'", str19, "737420852169451");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\037\ufffd\026\ufffd\ufffd" + "'", str21, "\037\ufffd\026\ufffd\ufffd");
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("172724761660472190993592461870");
        java.lang.String str17 = rSA1.encrypt("1468234090");
        java.lang.String str19 = rSA1.decrypt("667082801894545044853341289041");
        java.lang.String str21 = rSA1.encrypt("\0035\031\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "129716128125011387267667694848" + "'", str9, "129716128125011387267667694848");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "129716128125011387267667694848" + "'", str11, "129716128125011387267667694848");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\017>{\025\ufffd\ufffd\ufffd\u02a1\ufffd" + "'", str13, "\b\017>{\025\ufffd\ufffd\ufffd\u02a1\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\007\ufffd\ufffd-\027\ufffd\ufffd\ufffdg" + "'", str15, "\002\ufffd\007\ufffd\ufffd-\027\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "775570236407064265589860558754" + "'", str17, "775570236407064265589860558754");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\036\ufffd\013\ufffd\ufffd\177\ufffd\034Z{" + "'", str19, "\003\036\ufffd\013\ufffd\ufffd\177\ufffd\034Z{");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "173680698472433708592469149560" + "'", str21, "173680698472433708592469149560");
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("125929722957241554051908584886");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd8\000\ufffd\f\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\005\ufffd8\000\ufffd\f\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "429368274241599595572881136246" + "'", str5, "429368274241599595572881136246");
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.encrypt("782");
        java.lang.String str17 = rSA1.encrypt("180242499946659989412448361500");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\n\ufffd\ufffd\ufffd\ufffd\006\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3764832745" + "'", str3, "3764832745");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1141703897" + "'", str7, "1141703897");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\u016e\ufffd\ufffd" + "'", str9, "\000\u016e\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2355801358238808" + "'", str13, "2355801358238808");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1189050831665595" + "'", str15, "1189050831665595");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3127849334748410" + "'", str17, "3127849334748410");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "967356309577636" + "'", str19, "967356309577636");
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("443786068122398375663304316792");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\f\ufffdz\002\ufffd\ufffdx" + "'", str19, "\f\ufffdz\002\ufffd\ufffdx");
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "617423968440088" + "'", str7, "617423968440088");
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("1289219933400623");
        java.lang.String str9 = rSA1.decrypt("184677000372197579945525954200");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\006\027\ufffd\ufffd\033\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "620353277" + "'", str3, "620353277");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u04dc\036\ufffd^" + "'", str7, "\ufffd\u04dc\036\ufffd^");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\031\ufffd$\005\ufffd\t\ufffd\013\ufffd\ufffd" + "'", str9, "\031\ufffd$\005\ufffd\t\ufffd\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "28992574829111536363588588773" + "'", str11, "28992574829111536363588588773");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11480075254409550311064316952" + "'", str13, "11480075254409550311064316952");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("96549157373046875");
        java.lang.String str19 = rSA1.decrypt("363439440");
        java.lang.String str21 = rSA1.encrypt("492786781570745");
        rSA1.generateKeys(10);
        java.lang.String str25 = rSA1.encrypt("42353332408625927723");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\002\ufffd(\021\ufffd\ufffd\000\ufffd\ufffd\003\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?;?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "191" + "'", str3, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1447509461" + "'", str7, "1447509461");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "575592283" + "'", str9, "575592283");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\024xV\030" + "'", str11, "\001\024xV\030");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2746294516" + "'", str13, "2746294516");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\016R\024>" + "'", str17, "\000\ufffd\ufffd\016R\024>");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002,\027\ufffd\ufffd" + "'", str19, "\002,\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1379822243008657" + "'", str21, "1379822243008657");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "156" + "'", str25, "156");
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "523525580050828597681841010371" + "'", str5, "523525580050828597681841010371");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\177\ufffd\u0273\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\007\177\ufffd\u0273\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.encrypt("1790735148896114");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n" + "'", str7, "\001\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "k" + "'", str9, "k");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "348" + "'", str11, "348");
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
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
        java.lang.String str21 = rSA1.encrypt("792854241");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "679942384921460088876694096265" + "'", str9, "679942384921460088876694096265");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "293241648707991128435013949414" + "'", str11, "293241648707991128435013949414");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "650767693083972266201898056200" + "'", str13, "650767693083972266201898056200");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "489" + "'", str17, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001~" + "'", str19, "\001~");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "476" + "'", str21, "476");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        java.lang.String str17 = rSA1.decrypt("161");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "409328203972350983988401467507" + "'", str9, "409328203972350983988401467507");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "409328203972350983988401467507" + "'", str11, "409328203972350983988401467507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\020\ufffd\ufffdW\032\005\ufffd" + "'", str13, "\000\ufffd\ufffd\020\ufffd\ufffdW\032\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "148242988664518485350682943275" + "'", str15, "148242988664518485350682943275");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\u06dc\ufffd(\f\ufffd\ufffd0" + "'", str17, "\002\ufffd\u06dc\ufffd(\f\ufffd\ufffd0");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\u06c2\u02e7\ufffd\ufffd\022\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("35726109917165204911430804347");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "208662219222655810256493141398" + "'", str9, "208662219222655810256493141398");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "223192575871501598422561368228" + "'", str11, "223192575871501598422561368228");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\004\u139e" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\004\u139e");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "383917738781449695806237615008" + "'", str17, "383917738781449695806237615008");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "82669261503362920774240201483" + "'", str19, "82669261503362920774240201483");
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
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
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str23 = rSA1.encrypt("\005\ufffd-A{\000\u0766\021\ufffd\ufffd|\t");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1152277428030314" + "'", str7, "1152277428030314");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "145" + "'", str19, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "455" + "'", str23, "455");
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("94");
        java.lang.String str17 = rSA1.decrypt("228");
        java.lang.String str19 = rSA1.decrypt("10019204889");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "507286643366866797258909984393" + "'", str9, "507286643366866797258909984393");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "198691886305934844734774885765" + "'", str11, "198691886305934844734774885765");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd2\025\b\ufffd\ufffd`" + "'", str13, "\000\ufffd\ufffd\ufffd2\025\b\ufffd\ufffd`");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001Nl6ym\021O\031\034\ufffd\ufffd\ufffd" + "'", str15, "\001Nl6ym\021O\031\034\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\026\ufffd\ufffd\ufffd\ufffd\ufffd\177\ufffd\ufffdW" + "'", str17, "\002\026\ufffd\ufffd\ufffd\ufffd\ufffd\177\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd{\006\021\017\001\032\ufffd" + "'", str19, "\005\ufffd\ufffd\ufffd{\006\021\017\001\032\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.encrypt("\0017");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "375384251904184939954237041466" + "'", str3, "375384251904184939954237041466");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "30080231" + "'", str5, "30080231");
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
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
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '4');
        java.lang.String str27 = rSA1.encrypt("98631057648323");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1191313687820604" + "'", str7, "1191313687820604");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "315" + "'", str19, "315");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "498129319351537" + "'", str27, "498129319351537");
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("85317131416827023530889570588");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\u0725+");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136474371602274908483503756409" + "'", str9, "136474371602274908483503756409");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "461293270716876212244824768009" + "'", str11, "461293270716876212244824768009");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr" + "'", str13, "\004\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "29476798894620543925077262317" + "'", str15, "29476798894620543925077262317");
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("141592947570930378736777989995");
        java.lang.String str19 = rSA1.encrypt("461172035659693");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u0755\002\ufffd\025\ufffd" + "'", str13, "\001\u0755\002\ufffd\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1237532824504520" + "'", str15, "1237532824504520");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "332384259848437" + "'", str17, "332384259848437");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1253329564125231" + "'", str19, "1253329564125231");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("806511434195549");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "641712231188179986973606013642" + "'", str17, "641712231188179986973606013642");
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.encrypt("1092327233");
        java.lang.String str17 = rSA1.encrypt("38254819939697411230932865771");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "742627290449220525993582152514" + "'", str9, "742627290449220525993582152514");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "630834766934556327882452248536" + "'", str11, "630834766934556327882452248536");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4194304" + "'", str13, "4194304");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5211638606558700340028393472" + "'", str15, "5211638606558700340028393472");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "175766334869157313155788927497" + "'", str17, "175766334869157313155788927497");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
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
        java.lang.String str21 = rSA1.encrypt("831265349016221");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "&" + "'", str11, "&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ")" + "'", str13, ")");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\023" + "'", str15, "\001\023");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "495" + "'", str17, "495");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4117767628" + "'", str21, "4117767628");
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
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
        java.lang.String str23 = rSA1.encrypt("1299530166501446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????N?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1024785671862651" + "'", str7, "1024785671862651");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd" + "'", str15, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "461" + "'", str19, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "23132654953595002806692871717" + "'", str23, "23132654953595002806692871717");
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.encrypt("765314849130516");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "124120777440228403194235305713" + "'", str9, "124120777440228403194235305713");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\u028b\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\u028b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "398221150385959205223295950541" + "'", str13, "398221150385959205223295950541");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "705148172015452156073506302056" + "'", str15, "705148172015452156073506302056");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "455233543008395336160794162698" + "'", str17, "455233543008395336160794162698");
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        java.lang.String str17 = rSA1.encrypt("765314849130516");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\ufffd\ufffd9G\020\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("3463356647");
        java.lang.String str23 = rSA1.encrypt("72");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\005\007\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\005\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "145264397772825642935054899381" + "'", str15, "145264397772825642935054899381");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "58065656752989646002664143021" + "'", str17, "58065656752989646002664143021");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "158745493375455777284230664996" + "'", str19, "158745493375455777284230664996");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "279779568115393297963211988811" + "'", str21, "279779568115393297963211988811");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2821151997000" + "'", str23, "2821151997000");
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("538621452366062192513302577482");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "667118949233291199361745276322" + "'", str9, "667118949233291199361745276322");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1039629249898090014336126527803" + "'", str11, "1039629249898090014336126527803");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "522668887097474743518397209016" + "'", str13, "522668887097474743518397209016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd +" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd +");
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
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
        java.lang.String str21 = rSA1.encrypt("\007\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\u02c7\ufffd3");
        java.lang.String str23 = rSA1.encrypt("285");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "679202690053970404897554493171" + "'", str9, "679202690053970404897554493171");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "427483199994941540472505192285" + "'", str11, "427483199994941540472505192285");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001o\"\ufffd\036\022\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001o\"\ufffd\036\022\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffdqF\027\ufffd\r\ufffd\ufffd\ufffd" + "'", str15, "\b\ufffd\ufffd\ufffdqF\027\ufffd\r\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\t\ufffd\ufffd\u030e\ufffd\ufffd" + "'", str19, "\003\t\ufffd\ufffd\u030e\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2126749683687345506781491300" + "'", str21, "2126749683687345506781491300");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "65381341317117756818668064996" + "'", str23, "65381341317117756818668064996");
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("125");
        java.lang.String str17 = rSA1.encrypt("9710448056486244645057993580");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "544772473866169871109303204863" + "'", str9, "544772473866169871109303204863");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\027\ufffd\ufffduZek" + "'", str11, "\006\ufffd\027\ufffd\ufffduZek");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "426096392315449856419206065948" + "'", str13, "426096392315449856419206065948");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\u05fb\036\ufffd\ufffd\ufffdC" + "'", str15, "\005\ufffd\u05fb\036\ufffd\ufffd\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "822576820827199967639133507641" + "'", str17, "822576820827199967639133507641");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "468159340809439163144972664266" + "'", str19, "468159340809439163144972664266");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.decrypt("273390189577687013215022252038");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\025x\f\ufffd\\\ufffd\ufffd" + "'", str3, "\001\ufffd\025x\f\ufffd\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "109341743966474376916542169984" + "'", str5, "109341743966474376916542169984");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "67908096706680275050271420503" + "'", str7, "67908096706680275050271420503");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\b~\177\ufffd\ufffd\ufffd\ufffd\021\ufffd\ufffd" + "'", str9, "\004\b~\177\ufffd\ufffd\ufffd\ufffd\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\002\ufffd\ufffd\ufffdB)\022\ufffd" + "'", str11, "\002\ufffd\ufffd\002\ufffd\ufffd\ufffdB)\022\ufffd");
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
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
        java.lang.String str21 = rSA1.decrypt("577021757156213");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "258" + "'", str13, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "277" + "'", str15, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "73" + "'", str17, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\030" + "'", str21, "\030");
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("289013563216973");
        java.lang.String str19 = rSA1.encrypt("1107280845033953");
        java.lang.String str21 = rSA1.decrypt("302395086388864423064900668330");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "912586880821201" + "'", str7, "912586880821201");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "351783452452833060943308525157" + "'", str13, "351783452452833060943308525157");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
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
        rSA1.generateKeys(100);
        java.lang.String str25 = rSA1.decrypt("136730093797845575590428510770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\001\ufffd'");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?'?'\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "95721932543809" + "'", str7, "95721932543809");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "178291497500237" + "'", str13, "178291497500237");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd" + "'", str15, "\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\004@\027\f\177\ufffdg\005\ufffd<." + "'", str25, "\004@\027\f\177\ufffdg\005\ufffd<.");
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
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
        java.lang.String str23 = rSA1.encrypt("844202742226834");
        java.lang.String str25 = rSA1.decrypt("97144494604182018041492507149");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "534501962433261789676122076941" + "'", str9, "534501962433261789676122076941");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "536847118252813845026775809447" + "'", str11, "536847118252813845026775809447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "462934972340510839698967602107" + "'", str13, "462934972340510839698967602107");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\u0704\ufffd\ufffd\001\ufffd\177\ufffd\ufffd\ufffd\ufffdG" + "'", str15, "\n\u0704\ufffd\ufffd\001\ufffd\177\ufffd\ufffd\ufffd\ufffdG");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "50102801060796132270568204221" + "'", str17, "50102801060796132270568204221");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "122650694442993603451150848406" + "'", str19, "122650694442993603451150848406");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\u05cd}|" + "'", str21, "\n\ufffd\ufffd\ufffd\ufffd\u05cd}|");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "8241655972113762526102287386" + "'", str23, "8241655972113762526102287386");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\003\ufffd\003\007\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\001\ufffd\003\ufffd\003\007\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
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
        java.lang.String str31 = rSA1.encrypt("aF\005\ufffd\ufffd\ufffd&t");
        java.lang.String str33 = rSA1.encrypt("179473698325411773813461707663");
        java.lang.String str35 = rSA1.encrypt("309305362788033664391291799854");
        java.lang.String str37 = rSA1.decrypt("1289796806754001");
        java.math.BigInteger bigInteger38 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger39 = rSA1.decrypt(bigInteger38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "512099496466425" + "'", str7, "512099496466425");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "80" + "'", str21, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001/" + "'", str23, "\001/");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "151" + "'", str27, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "154726470338419031942014095594" + "'", str31, "154726470338419031942014095594");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "120846267222432529870236956783" + "'", str33, "120846267222432529870236956783");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "390429865851750965386045271674" + "'", str35, "390429865851750965386045271674");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\004\ufffd\ufffd\ufffdGWf\030\ufffd\\\027\ufffd" + "'", str37, "\004\ufffd\ufffd\ufffdGWf\030\ufffd\\\027\ufffd");
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.decrypt("3531439932933077");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004\021\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "162268153993340" + "'", str7, "162268153993340");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd0h\004" + "'", str9, "\001\ufffd\ufffd0h\004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2\024\ufffd\ufffd\ufffd\ufffd" + "'", str11, "2\024\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\177\ufffd\ufffd\ufffd" + "'", str13, "\005\177\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("15370703353317709614231641516");
        java.lang.String str19 = rSA1.encrypt("13344539084164297269512128928");
        java.lang.String str21 = rSA1.encrypt("\001G\003Jy");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "765023536522997843194565167562" + "'", str9, "765023536522997843194565167562");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\023\ufffd\ufffd\035\ufffd" + "'", str11, "\b\ufffd\ufffd\ufffd\023\ufffd\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285649367751279192143490812924" + "'", str13, "285649367751279192143490812924");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6558365937140398406025324059" + "'", str17, "6558365937140398406025324059");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10316392311240433848489591468" + "'", str19, "10316392311240433848489591468");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "26017364493136097969877642425" + "'", str21, "26017364493136097969877642425");
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
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
        java.lang.String str25 = rSA1.encrypt("60609348565725956091217057335");
        java.lang.String str27 = rSA1.encrypt("\006\ufffd\ufffd\031p");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "261707587240501570132076426697" + "'", str9, "261707587240501570132076426697");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\u015e\ufffd9GC)" + "'", str11, "\002\ufffd\ufffd\u015e\ufffd9GC)");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002>7lw|\020\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002>7lw|\020\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42875" + "'", str17, "42875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "85540445113121085669490359478" + "'", str19, "85540445113121085669490359478");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "728579959883590188179086474248" + "'", str21, "728579959883590188179086474248");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\023\\\ufffd\u6d38\u07b0\ufffd\u06ff" + "'", str23, "\001\ufffd\023\\\ufffd\u6d38\u07b0\ufffd\u06ff");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "421236845143517925227471699883" + "'", str25, "421236845143517925227471699883");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "359420474268025529041963399" + "'", str27, "359420474268025529041963399");
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("639581396801755524271293352968");
        java.lang.String str11 = rSA1.encrypt("815696648");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "q\027\ufffd\ufffd\037\ufffd\037\ufffd\ufffd" + "'", str9, "q\027\ufffd\ufffd\037\ufffd\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32830066044955222393494365174" + "'", str11, "32830066044955222393494365174");
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3357727758788");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "582" + "'", str15, "582");
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.decrypt("316973227613881101828002122645");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\ufffd\033\ufffdY");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???i>?Y\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "582" + "'", str11, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\013" + "'", str13, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "742" + "'", str15, "742");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "?" + "'", str17, "?");
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str15 = rSA1.decrypt("13059213607");
        java.lang.String str17 = rSA1.decrypt("294035768");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "699" + "'", str13, "699");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002U" + "'", str15, "\002U");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("369824009393067");
        java.lang.String str11 = rSA1.encrypt("498025537373966143508288825554");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "475829029" + "'", str7, "475829029");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1324357710" + "'", str9, "1324357710");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1233459273" + "'", str11, "1233459273");
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("#");
        java.lang.String str19 = rSA1.decrypt("606561615691672");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str23 = rSA1.decrypt("606980969545235");
        java.lang.String str25 = rSA1.encrypt("8589662889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\001\ufffd\032\ufffd<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????<\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "870939109644579673613115335567" + "'", str9, "870939109644579673613115335567");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffdJ\021\ufffd\ufffd\ufffd\ufffd\036\ufffd" + "'", str11, "\007\ufffdJ\021\ufffd\ufffd\ufffd\ufffd\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "163645886642727854674958077399" + "'", str13, "163645886642727854674958077399");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\003\ufffd\ufffd\ufffd\u04b9N" + "'", str15, "\000\ufffd\ufffd\003\ufffd\ufffd\ufffd\u04b9N");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "96549157373046875" + "'", str17, "96549157373046875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\ufffd\ufffd\ufffdE\r\ufffd\ufffd\ufffd\007\ufffd\027" + "'", str19, "\t\ufffd\ufffd\ufffdE\r\ufffd\ufffd\ufffd\007\ufffd\027");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffdH6\034\ufffd\ufffd\034\u8552" + "'", str23, "\002\ufffdH6\034\ufffd\ufffd\034\u8552");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "640442927128712929438821169459" + "'", str25, "640442927128712929438821169459");
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\n\ufffd" + "'", str5, "\000\ufffd\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "532482696543253555124622578718" + "'", str9, "532482696543253555124622578718");
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        java.lang.String str15 = rSA1.encrypt("196989163804812");
        java.lang.String str17 = rSA1.decrypt("582");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007C\025\003\ufffd\ufffd\ufffdsA" + "'", str13, "\007C\025\003\ufffd\ufffd\ufffdsA");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "96632651030631704418585720421" + "'", str15, "96632651030631704418585720421");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\017\ufffd\ufffd\ufffd\ufffd\ufffdiUT" + "'", str17, "\002\017\ufffd\ufffd\ufffd\ufffd\ufffdiUT");
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "200312738362679550549652696975" + "'", str13, "200312738362679550549652696975");
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "278" + "'", str7, "278");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\n\007\ufffdG\005\ufffd$K\020\ufffd|7\013");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "504732023270637" + "'", str7, "504732023270637");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "311" + "'", str11, "311");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("2411260992603826");
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str21 = rSA1.encrypt("633241000096917638888267085827");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380204032" + "'", str11, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "670723551" + "'", str15, "670723551");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "607030626" + "'", str17, "607030626");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "506808107951303516358274480032" + "'", str21, "506808107951303516358274480032");
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3357727758788");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("975082525107426");
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffd\ufffdQ\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47" + "'", str15, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\u0171\ufffd\ufffdI(" + "'", str19, "\005\ufffd\ufffd\u0171\ufffd\ufffdI(");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "573841689245250974853413554405" + "'", str21, "573841689245250974853413554405");
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("546441400885176648772586357406");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "483" + "'", str9, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd\u02c0\ufffd\ufffd\007,");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172" + "'", str5, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "430" + "'", str9, "430");
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\007F.\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "114791649837562" + "'", str7, "114791649837562");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003F\005brV\004" + "'", str9, "\003F\005brV\004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1518596365046507" + "'", str13, "1518596365046507");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "660630431454240" + "'", str17, "660630431454240");
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "477763470414691" + "'", str7, "477763470414691");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6782893432" + "'", str13, "6782893432");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("304740070237960671182697086271");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("6766351949");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026e\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "184425284" + "'", str5, "184425284");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "809836620" + "'", str11, "809836620");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd3" + "'", str13, "\ufffd\ufffd3");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1622767863" + "'", str15, "1622767863");
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("10");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007~\"\ufffd\ufffd\005X" + "'", str3, "\007~\"\ufffd\ufffd\005X");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2403989977223578" + "'", str5, "2403989977223578");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "907839937428580" + "'", str7, "907839937428580");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.String str15 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37805074531238270313" + "'", str11, "37805074531238270313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdl\027" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffdl\027");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002t\032\235\ufffd\ufffd\"\000\ufffd" + "'", str15, "\002t\032\235\ufffd\ufffd\"\000\ufffd");
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("635442583753138455625950920532");
        java.lang.String str7 = rSA1.encrypt("\003\016D?\n\ufffd\005\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "258734930002547038208453313079" + "'", str5, "258734930002547038208453313079");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "325950339402499448849797625461" + "'", str7, "325950339402499448849797625461");
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1512739533813279");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1895725917151180" + "'", str7, "1895725917151180");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "864280062815843" + "'", str9, "864280062815843");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\004\ufffd\ufffd\u07d8");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("145917496315515281324622551513");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "l" + "'", str7, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "102" + "'", str9, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "526" + "'", str11, "526");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "27349483337282677033479178331" + "'", str15, "27349483337282677033479178331");
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.decrypt("394641110643206533541912183688");
        java.lang.String str15 = rSA1.encrypt("215143892951143045749748229813");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002z" + "'", str13, "\002z");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffdp");
        java.lang.String str17 = rSA1.decrypt("270257349018815");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "352972966311141070343204099473" + "'", str13, "352972966311141070343204099473");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "675225333437236584797480237479" + "'", str15, "675225333437236584797480237479");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\030\ufffd\ufffd\034\ufffdW" + "'", str17, "\005\030\ufffd\ufffd\034\ufffdW");
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
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
        java.lang.String str25 = rSA1.decrypt("688794101870314");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\000\u048d\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1299838246721667" + "'", str7, "1299838246721667");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\r\024Au+Cy" + "'", str15, "\r\024Au+Cy");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "61" + "'", str19, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "344" + "'", str21, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "y" + "'", str25, "y");
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str15 = rSA1.decrypt("184");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "203316471112602178939702169598" + "'", str9, "203316471112602178939702169598");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\013\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\u01c4\ufffd\ufffd\ufffd\ufffd\ufffd&\r\ufffd" + "'", str13, "\f\u01c4\ufffd\ufffd\ufffd\ufffd\ufffd&\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\ufffd");
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("682207750398180758004262180703");
        java.lang.String str13 = rSA1.decrypt("357690512925543535751245880674");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd4\002\ufffd\ufffd" + "'", str3, "\006\ufffd4\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "399038713189368" + "'", str5, "399038713189368");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2019453386183496" + "'", str7, "2019453386183496");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002C\n\ufffd\ufffd" + "'", str9, "\002C\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3064728492488501" + "'", str11, "3064728492488501");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\u0127" + "'", str13, "\007\ufffd\u0127");
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str11 = rSA1.encrypt("104505243654056990127866040198");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("360269784593448187859562480797");
        java.lang.String str17 = rSA1.decrypt("66011755970030761385223442767");
        java.lang.String str19 = rSA1.encrypt("\004`\016\006\ufffd\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001B" + "'", str7, "\001B");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77" + "'", str9, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "191" + "'", str11, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\035\033\u0632\177\ufffd?" + "'", str15, "\007\ufffd\ufffd\ufffd\035\033\u0632\177\ufffd?");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "18311393670493564153121904817" + "'", str19, "18311393670493564153121904817");
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
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
        java.lang.String str21 = rSA1.encrypt("1196073324910466");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003P\000\ufffd\ufffd\036\ufffd\ufffd\ufffd3n" + "'", str13, "\003P\000\ufffd\ufffd\036\ufffd\ufffd\ufffd3n");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35649912519807184269" + "'", str15, "35649912519807184269");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "584" + "'", str19, "584");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "584" + "'", str21, "584");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
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
        java.lang.String str23 = rSA1.encrypt("15531997365273025742698361245");
        java.lang.String str25 = rSA1.encrypt("XE\020q");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "135277205411725980988735139607" + "'", str13, "135277205411725980988735139607");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "551" + "'", str19, "551");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "23" + "'", str21, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "74" + "'", str23, "74");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "689" + "'", str25, "689");
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
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
        java.lang.String str21 = rSA1.decrypt("568411953986723");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b/\005\ufffd\004ok\006\007\ufffd\036\ufffd" + "'", str13, "\b/\005\ufffd\004ok\006\007\ufffd\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35649912519807184269" + "'", str15, "35649912519807184269");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "354" + "'", str19, "354");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        java.lang.String str7 = rSA1.encrypt("250147309");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "707437154336082855677038148878" + "'", str3, "707437154336082855677038148878");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669890656986857484881818009868" + "'", str5, "669890656986857484881818009868");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "339143903327970634038105972579" + "'", str7, "339143903327970634038105972579");
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        java.lang.String str17 = rSA1.decrypt("1710810537");
        java.lang.String str19 = rSA1.encrypt("\027\ufffd\ufffd\ufffd\ufffd\ufffd\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "293588704135891674700004230738" + "'", str9, "293588704135891674700004230738");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "206918752498438159044543694449" + "'", str11, "206918752498438159044543694449");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "209251926636561111093441045903" + "'", str13, "209251926636561111093441045903");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "116535055935684694372986593286" + "'", str15, "116535055935684694372986593286");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\006\ufffd\ufffd\ufffd\ufffd#]g*]" + "'", str17, "\000\ufffd\ufffd\006\ufffd\ufffd\ufffd\ufffd#]g*]");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "749866526066094595929054231797" + "'", str19, "749866526066094595929054231797");
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193954793655125" + "'", str7, "193954793655125");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "776905511821844" + "'", str13, "776905511821844");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "221" + "'", str19, "221");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
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
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "609884529758581945864133981280" + "'", str9, "609884529758581945864133981280");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "635372551158590188746477342808" + "'", str11, "635372551158590188746477342808");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "303775043102105660229025337801" + "'", str13, "303775043102105660229025337801");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "d" + "'", str21, "d");
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("370751075487002776593854224073");
        java.lang.String str13 = rSA1.encrypt("6297770075");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1555602827843669" + "'", str7, "1555602827843669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "cX*y" + "'", str11, "cX*y");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1831787648" + "'", str13, "1831787648");
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.decrypt("361606126042016");
        java.lang.String str17 = rSA1.decrypt("2308941710044151");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "165" + "'", str9, "165");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46" + "'", str13, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\tC[u\000o");
        java.lang.String str17 = rSA1.decrypt("5918332813769375149320969583");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "981162539365922" + "'", str7, "981162539365922");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\032bP\020" + "'", str9, "\005\ufffd\032bP\020");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\n\026\ufffd\0039" + "'", str11, "\001\ufffd\n\026\ufffd\0039");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd.\006\ufffd" + "'", str13, "\001\ufffd\ufffd.\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1116163475062713" + "'", str15, "1116163475062713");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\177\ufffd\ufffd" + "'", str17, "\004\ufffd\177\ufffd\ufffd");
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("786820480");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2618739640139186" + "'", str7, "2618739640139186");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\ufffd" + "'", str9, "\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd$UdH\n" + "'", str11, "\005\ufffd$UdH\n");
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("225089623685693560529903855490");
        java.lang.String str19 = rSA1.decrypt("2459090002");
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\u0498\ufffd\ufffd\006\ufffde");
        java.lang.String str23 = rSA1.encrypt("1447011972567904");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444616186880996" + "'", str7, "444616186880996");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "693" + "'", str15, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001l" + "'", str19, "\001l");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "554" + "'", str21, "554");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "173" + "'", str23, "173");
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("141592947570930378736777989995");
        java.lang.String str19 = rSA1.encrypt("\b\ufffd(\023");
        java.lang.String str21 = rSA1.encrypt("63126036322318");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\004\ufffd\ufffd_" + "'", str13, "\003\004\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "634121792549784" + "'", str15, "634121792549784");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "884156277557921" + "'", str17, "884156277557921");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "949730858234397" + "'", str19, "949730858234397");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "125167617842136" + "'", str21, "125167617842136");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("2026972169485856");
        java.lang.String str21 = rSA1.decrypt("1437799634");
        java.lang.String str23 = rSA1.encrypt("180916074");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1247496128441606" + "'", str7, "1247496128441606");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "316" + "'", str11, "316");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "335" + "'", str19, "335");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "196" + "'", str23, "196");
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("304740070237960671182697086271");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2308999264" + "'", str5, "2308999264");
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd)/b\037" + "'", str3, "\006\ufffd)/b\037");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "156839479" + "'", str7, "156839479");
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\ufffd\u0455\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "265803907099213" + "'", str15, "265803907099213");
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd=");
        java.lang.String str11 = rSA1.decrypt("2142835345");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2943486708" + "'", str9, "2943486708");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\024\004\ufffd:" + "'", str11, "\024\004\ufffd:");
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("36712578767268098520414318263");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "287717423447030" + "'", str7, "287717423447030");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1333304585489721" + "'", str9, "1333304585489721");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "516877033807252051301116994303" + "'", str13, "516877033807252051301116994303");
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("759194901112647");
        java.lang.String str23 = rSA1.encrypt("\002\002");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "355883112038148840616888088162" + "'", str9, "355883112038148840616888088162");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "296524429312696562749212506241" + "'", str11, "296524429312696562749212506241");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffds\002\ufffd\ufffd\007\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffds\002\ufffd\ufffd\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "445039092996532600616147678503" + "'", str17, "445039092996532600616147678503");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "77" + "'", str21, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "381" + "'", str23, "381");
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("489216744821809573348585320231");
        java.lang.String str19 = rSA1.encrypt("\\\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\000\ufffdZ\n\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??Z????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "262539021076043427404872133479" + "'", str17, "262539021076043427404872133479");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "485293378588769731902571211547" + "'", str19, "485293378588769731902571211547");
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\u05c5\ufffd\017\013&");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??|\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336" + "'", str7, "336");
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("530");
        java.lang.String str15 = rSA1.encrypt("755629646");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001Z" + "'", str13, "\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "38" + "'", str15, "38");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        java.lang.String str11 = rSA1.decrypt("1206686368");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B" + "'", str7, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "98" + "'", str9, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "U" + "'", str11, "U");
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
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
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2353653388571464" + "'", str7, "2353653388571464");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "456" + "'", str15, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("225089623685693560529903855490");
        java.lang.String str19 = rSA1.decrypt("2459090002");
        java.lang.String str21 = rSA1.encrypt("1920050391995830");
        java.lang.String str23 = rSA1.encrypt("262482002366492204516047924861");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1071225953068348" + "'", str7, "1071225953068348");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "281" + "'", str15, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "533" + "'", str21, "533");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "132" + "'", str23, "132");
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.decrypt("603423657");
        java.lang.String str17 = rSA1.encrypt("263031188422702115233360549494");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1663663208434190" + "'", str7, "1663663208434190");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "988710337" + "'", str11, "988710337");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0\b\ufffd\ufffd" + "'", str13, "0\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\030" + "'", str15, "\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2047662013" + "'", str17, "2047662013");
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("169");
        java.lang.String str21 = rSA1.encrypt("2220683795372449");
        java.lang.String str23 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str25 = rSA1.decrypt("128048112137671");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "196410401745625" + "'", str7, "196410401745625");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2239699346549977" + "'", str13, "2239699346549977");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b bD\027U\023" + "'", str15, "\b bD\027U\023");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd>U-0e" + "'", str17, "\b\ufffd>U-0e");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2632636072284392" + "'", str19, "2632636072284392");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1675004690051740" + "'", str21, "1675004690051740");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "715902738077216" + "'", str23, "715902738077216");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("451");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "582" + "'", str11, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "712" + "'", str13, "712");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        java.lang.String str15 = rSA1.encrypt("196989163804812");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005K+\034\ufffdx\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005K+\034\ufffdx\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "486544884275625823435395416817" + "'", str15, "486544884275625823435395416817");
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("23596208946137472461782808");
        java.lang.String str17 = rSA1.encrypt("\n\ufffd\ufffd\ufffd\001\ufffd9/\020\ufffd");
        java.lang.String str19 = rSA1.encrypt("1563226434239877");
        java.lang.String str21 = rSA1.encrypt("26847776103555381200680657374");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "62103952697791" + "'", str7, "62103952697791");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\177\006\ufffd\000|" + "'", str9, "\007\ufffd\177\006\ufffd\000|");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "54723093713055" + "'", str13, "54723093713055");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2299088538935471" + "'", str15, "2299088538935471");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "579442156372558" + "'", str17, "579442156372558");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1269135023194997" + "'", str19, "1269135023194997");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "912804121056644" + "'", str21, "912804121056644");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "916633170235423" + "'", str7, "916633170235423");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279936" + "'", str13, "279936");
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("775570236407064265589860558754");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "838447433" + "'", str3, "838447433");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1848649467" + "'", str7, "1848649467");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3595088058" + "'", str9, "3595088058");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "476665366" + "'", str11, "476665366");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44259223332192249359220202599" + "'", str15, "44259223332192249359220202599");
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.lang.String str13 = rSA1.encrypt("538466596764584785061881286421");
        java.lang.String str15 = rSA1.encrypt("255208532862462952347238750539");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd2" + "'", str5, "\001\ufffd\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "853123000679155476274644158686" + "'", str9, "853123000679155476274644158686");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "595969921966192131045242753483" + "'", str11, "595969921966192131045242753483");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "258652213375989492811390212975" + "'", str13, "258652213375989492811390212975");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "614267607281074949554816996327" + "'", str15, "614267607281074949554816996327");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.encrypt("179");
        java.lang.String str23 = rSA1.encrypt("3346835387270903");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r5" + "'", str11, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33570448563366733031" + "'", str15, "33570448563366733031");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20239165964085966272757184145" + "'", str21, "20239165964085966272757184145");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "23450786650359859544808763416" + "'", str23, "23450786650359859544808763416");
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys(100);
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\004\"\\\001\ufffd\ufffd\ufffd_G>{");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1563112156522302597263952740" + "'", str17, "1563112156522302597263952740");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "182977581522825039812952848173" + "'", str21, "182977581522825039812952848173");
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("230010334849505957218466528713");
        java.lang.String str21 = rSA1.encrypt("513");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "536399973987932" + "'", str7, "536399973987932");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "135" + "'", str15, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "49" + "'", str19, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "207" + "'", str21, "207");
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("7796138148");
        java.lang.String str19 = rSA1.encrypt("435039569");
        java.lang.String str21 = rSA1.encrypt("239682091482667318557703389810");
        java.lang.String str23 = rSA1.decrypt("1701676611727632");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "94" + "'", str9, "94");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\"" + "'", str13, "\002\"");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "~" + "'", str17, "~");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "34" + "'", str21, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("169");
        java.lang.String str21 = rSA1.encrypt("2220683795372449");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1037157215433239" + "'", str7, "1037157215433239");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "933559360441861" + "'", str13, "933559360441861");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd{R" + "'", str17, "\001\ufffd\ufffd\ufffd{R");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "314819387125574" + "'", str19, "314819387125574");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "374877404575261" + "'", str21, "374877404575261");
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("5158103767");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "280245234401463" + "'", str7, "280245234401463");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\017\ufffd" + "'", str9, "\006\ufffd\ufffd\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\rcc" + "'", str13, "\004\ufffd\ufffd\ufffd\rcc");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "245908734001442" + "'", str15, "245908734001442");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "292" + "'", str21, "292");
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("241");
        java.lang.String str15 = rSA1.encrypt("48545501064253568549105436091");
        java.lang.String str17 = rSA1.encrypt("423318336209840095007434506974");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "281" + "'", str13, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "449" + "'", str15, "449");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "300" + "'", str17, "300");
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("155581436361346739510495665777");
        java.lang.String str21 = rSA1.decrypt("1384569939406284");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "275" + "'", str9, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "74" + "'", str13, "74");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1206078838785780" + "'", str19, "1206078838785780");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\u03b1\032\ufffd" + "'", str21, "\006\u03b1\032\ufffd");
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
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
        java.lang.String str29 = rSA1.decrypt("5056541237");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.encrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "969032752804803" + "'", str7, "969032752804803");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "696264135584325516943610464956" + "'", str13, "696264135584325516943610464956");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\005" + "'", str19, "\001\005");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "37376053399689429620067416911" + "'", str23, "37376053399689429620067416911");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\021\ufffd\177\ufffd\ufffd\ufffd\ufffd\001\ufffd\030\ufffd" + "'", str25, "\021\ufffd\177\ufffd\ufffd\ufffd\ufffd\001\ufffd\030\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "47853477035583672806796299248" + "'", str27, "47853477035583672806796299248");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\006\"\ufffd\ufffdi4" + "'", str29, "\006\"\ufffd\ufffdi4");
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
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
        java.lang.String str21 = rSA1.decrypt("265022505206169");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "954103693461787" + "'", str11, "954103693461787");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1837610467716353" + "'", str13, "1837610467716353");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1096979236367943" + "'", str15, "1096979236367943");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "131872834191335436437628564234" + "'", str19, "131872834191335436437628564234");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffdc(+A\036\ufffd" + "'", str21, "\t\ufffd\ufffd\ufffd\ufffdc(+A\036\ufffd");
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.encrypt("6318253741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\005\035\037\ufffd\ufffd\ufffd\025\016\ufffd\037");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1843185335268482" + "'", str7, "1843185335268482");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\036-\016\ufffd" + "'", str9, "\b\ufffd\036-\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "319385339359821" + "'", str11, "319385339359821");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "339954552204321" + "'", str13, "339954552204321");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "626670186502757" + "'", str15, "626670186502757");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "610499482936024" + "'", str17, "610499482936024");
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        java.lang.String str15 = rSA1.encrypt("54326269148954289324151592843");
        java.lang.String str17 = rSA1.encrypt("36889312402462405966288044447");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "425" + "'", str13, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47" + "'", str15, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "90" + "'", str17, "90");
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("1408514752349");
        java.lang.String str17 = rSA1.decrypt("715760744860764417509469677307");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd\004\ufffd\ufffd\034\ufffd");
        java.lang.String str21 = rSA1.decrypt("1126656814549687");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2436873213201143" + "'", str7, "2436873213201143");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "97" + "'", str15, "97");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "]" + "'", str17, "]");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "51" + "'", str19, "51");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\030" + "'", str21, "\030");
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("1699026177576345");
        java.lang.String str19 = rSA1.decrypt("70985735561349807473625559213");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4532289648" + "'", str7, "4532289648");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5537624952" + "'", str9, "5537624952");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9366517370" + "'", str13, "9366517370");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "693250985900986" + "'", str17, "693250985900986");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\u04cd\ufffd" + "'", str19, "\005\u04cd\ufffd");
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
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
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.encrypt("158");
        java.lang.String str25 = rSA1.decrypt("37430639259253136412859969358");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "648559551109102658529898506795" + "'", str9, "648559551109102658529898506795");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\020\ufffdN" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\020\ufffdN");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd:\t\030\ufffd8UR" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd:\t\030\ufffd8UR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "646506488772948389159966799048" + "'", str17, "646506488772948389159966799048");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "14567812657371586117092919515" + "'", str21, "14567812657371586117092919515");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7327402493801481870741491585" + "'", str23, "7327402493801481870741491585");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "7f\177\027\ufffd\ufffd\ufffd\u0460\ufffd\ufffd" + "'", str25, "7f\177\027\ufffd\ufffd\ufffd\u0460\ufffd\ufffd");
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("353");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "161997814286212293268844621251" + "'", str9, "161997814286212293268844621251");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\004\ufffd\032\021\027\ufffd\005\ufffd>" + "'", str11, "\002\ufffd\004\ufffd\032\021\027\ufffd\005\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "42471014590830574155770651828" + "'", str13, "42471014590830574155770651828");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2200735439001847" + "'", str17, "2200735439001847");
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1382245430" + "'", str3, "1382245430");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4384774770" + "'", str5, "4384774770");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7327900339" + "'", str7, "7327900339");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11482950224" + "'", str9, "11482950224");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2237473372" + "'", str11, "2237473372");
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str17 = rSA1.decrypt("368083998891054225388659508881");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\030" + "'", str13, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001c" + "'", str15, "\001c");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
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
            java.lang.String str19 = rSA1.decrypt("\005\ufffd.mR\023\ufffd\ufffdvx\\\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??.m\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "126145427627224457982002781100" + "'", str9, "126145427627224457982002781100");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "321865671795701203025753102114" + "'", str11, "321865671795701203025753102114");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "16004665935" + "'", str15, "16004665935");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("H");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1473341178518360" + "'", str13, "1473341178518360");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2062076475490525" + "'", str15, "2062076475490525");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "702" + "'", str19, "702");
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "549592562997471643561986807362" + "'", str9, "549592562997471643561986807362");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "733021118893847431239634777626" + "'", str11, "733021118893847431239634777626");
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("765314849130516");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) '4');
        java.lang.String str23 = rSA1.encrypt("50540830783244606909811256474");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\026\ufffd\ufffd\ufffdOm8" + "'", str11, "\002\ufffd\ufffd\026\ufffd\ufffd\ufffdOm8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "585156398595373375870597819915" + "'", str13, "585156398595373375870597819915");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001}" + "'", str17, "\001}");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1242413160428941" + "'", str23, "1242413160428941");
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("85317131416827023530889570588");
        java.lang.String str15 = rSA1.encrypt("230392568664349877198980463493");
        java.lang.String str17 = rSA1.encrypt("414008651302373171950419774429");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "67008697641678404447399362238" + "'", str9, "67008697641678404447399362238");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "526188987933867827591226490132" + "'", str11, "526188987933867827591226490132");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "310217625868872337855315778754" + "'", str15, "310217625868872337855315778754");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "667633529515270826664818025019" + "'", str17, "667633529515270826664818025019");
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("214613013380271327686434676578");
        java.lang.String str17 = rSA1.encrypt("\003\"(\032\ufffd");
        java.lang.String str19 = rSA1.decrypt("5266737849");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1773250744062161" + "'", str7, "1773250744062161");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6280539618" + "'", str15, "6280539618");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1301474334" + "'", str17, "1301474334");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "a76g" + "'", str19, "a76g");
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1109236385164256163844427917340" + "'", str9, "1109236385164256163844427917340");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1051027866818066755194208277482" + "'", str11, "1051027866818066755194208277482");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "908914316386470958747449568311" + "'", str13, "908914316386470958747449568311");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "244810175856819648470746331033" + "'", str17, "244810175856819648470746331033");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "798110764696567015107653528789" + "'", str19, "798110764696567015107653528789");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffd\035\u06ea\ufffd\030\036\ufffd\ufffd" + "'", str21, "\000\ufffd\ufffd\035\u06ea\ufffd\030\036\ufffd\ufffd");
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.encrypt("6318253741");
        java.lang.String str15 = rSA1.encrypt("2411338679603182");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "280392659529735" + "'", str7, "280392659529735");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "345" + "'", str13, "345");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "262" + "'", str15, "262");
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("169");
        java.lang.String str21 = rSA1.encrypt("2220683795372449");
        java.lang.String str23 = rSA1.decrypt("1610609348121997");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2193396010426013" + "'", str7, "2193396010426013");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "945228849827048" + "'", str13, "945228849827048");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffdl" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1373385806041460" + "'", str19, "1373385806041460");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "404382624477743" + "'", str21, "404382624477743");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str23, "\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("\001]\f\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("6\024i$");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\007\ufffd&\035\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??&??3?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1228282631891967" + "'", str11, "1228282631891967");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1567522371982287" + "'", str13, "1567522371982287");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "229056985708114118724498510913" + "'", str19, "229056985708114118724498510913");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "505020935808825030255783525811" + "'", str21, "505020935808825030255783525811");
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
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
        java.lang.String str21 = rSA1.encrypt("429226032323421979611756388643");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "323" + "'", str11, "323");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "126" + "'", str15, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "23" + "'", str19, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "710" + "'", str21, "710");
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
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
        java.lang.String str21 = rSA1.decrypt("772142580463152");
        java.lang.String str23 = rSA1.decrypt("1528040200463460");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "95633242496978030385283777836" + "'", str9, "95633242496978030385283777836");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "95633242496978030385283777836" + "'", str11, "95633242496978030385283777836");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\026\ufffd\u54a8\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\026\ufffd\u54a8\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "77731572127671257999003058089" + "'", str15, "77731572127671257999003058089");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd\017\004\ufffd\ufffd\ufffd\ufffd\ufffdm" + "'", str21, "\006\ufffd\ufffd\ufffd\017\004\ufffd\ufffd\ufffd\ufffd\ufffdm");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\f\017\ufffd\ufffd\ufffd\031\ufffd\u0262\ufffd`7" + "'", str23, "\f\017\ufffd\ufffd\ufffd\031\ufffd\u0262\ufffd`7");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\u03b0eh");
        java.lang.String str17 = rSA1.encrypt("1523471720");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1433477914809465" + "'", str7, "1433477914809465");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "985592660" + "'", str15, "985592660");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "617849321" + "'", str17, "617849321");
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.encrypt("533672814240301731473788469");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2719026969769708" + "'", str7, "2719026969769708");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "632" + "'", str15, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "427" + "'", str17, "427");
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
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
        java.lang.String str27 = rSA1.encrypt("1630771903");
        java.lang.String str29 = rSA1.decrypt("1683578461219619");
        java.lang.String str31 = rSA1.decrypt("240957294746352219473256570192");
        java.lang.String str33 = rSA1.decrypt("469669009694239186737957028577");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2615344800456936" + "'", str7, "2615344800456936");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444" + "'", str11, "444");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "490" + "'", str21, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "d" + "'", str23, "d");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "587" + "'", str27, "587");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001$" + "'", str29, "\001$");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\ufffd" + "'", str31, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\001\034" + "'", str33, "\001\034");
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "69663502878286" + "'", str7, "69663502878286");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffdmq" + "'", str9, "\006\ufffd\ufffd\ufffdmq");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\u067e\u0503" + "'", str13, "\006\u067e\u0503");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\ufffdw\037\ufffd" + "'", str15, "\t\ufffd\ufffd\ufffdw\037\ufffd");
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("4833214092");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "614825545796418" + "'", str7, "614825545796418");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1931688184776315" + "'", str13, "1931688184776315");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffdd\f" + "'", str15, "\006\ufffd\ufffd\ufffdd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2015031346397915" + "'", str19, "2015031346397915");
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
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
        java.lang.String str23 = rSA1.encrypt("514022429339877052793021759384");
        java.lang.String str25 = rSA1.encrypt("1107198777024550");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006k\002\ufffd\ufffd\ufffd" + "'", str13, "\006k\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1110200091747246" + "'", str15, "1110200091747246");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "205962032410725" + "'", str17, "205962032410725");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "306530589680200" + "'", str19, "306530589680200");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "856784694477338" + "'", str21, "856784694477338");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1383339387102902" + "'", str23, "1383339387102902");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1804856649561522" + "'", str25, "1804856649561522");
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("512");
        java.lang.String str17 = rSA1.encrypt("213512010366553469837091921761");
        java.lang.String str19 = rSA1.encrypt("119987202087244");
        java.lang.String str21 = rSA1.encrypt("\005\ufffd\ufffd\021\u03ec\ufffd\ufffd");
        java.lang.String str23 = rSA1.encrypt("3121273811927073");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "630764466777517" + "'", str7, "630764466777517");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2076576508" + "'", str11, "2076576508");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "550" + "'", str15, "550");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "395" + "'", str17, "395");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "339" + "'", str19, "339");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "359" + "'", str21, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "228" + "'", str23, "228");
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("529936916062749373766053298845");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1692963477" + "'", str5, "1692963477");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385844222" + "'", str7, "385844222");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "544719042935566667861827221256" + "'", str11, "544719042935566667861827221256");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        java.lang.String str19 = rSA1.encrypt("31");
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.encrypt("162263194883640");
        java.lang.String str25 = rSA1.decrypt("2356297228");
        java.lang.String str27 = rSA1.encrypt("185666784148808474577078060758");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd+{" + "'", str13, "\004\ufffd\ufffd\ufffd+{");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1419350425966866" + "'", str15, "1419350425966866");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2014925649278289" + "'", str17, "2014925649278289");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "254409653664290" + "'", str19, "254409653664290");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "347" + "'", str23, "347");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "n" + "'", str25, "n");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "124" + "'", str27, "124");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("729470594797276379172756825569");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46" + "'", str13, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
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
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\u055d\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\u055d\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33570448563366733031" + "'", str15, "33570448563366733031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "129706581313023818727813169434" + "'", str17, "129706581313023818727813169434");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffdi\033\u05d1\ufffd\ufffd\ufffd" + "'", str19, "\003\ufffdi\033\u05d1\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "265690710565374413960619583296" + "'", str21, "265690710565374413960619583296");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "211601267932472974234517779111" + "'", str23, "211601267932472974234517779111");
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
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
        rSA1.generateKeys(10);
        java.lang.String str25 = rSA1.decrypt("882767743578889");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\343\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd\343\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1986076930754837" + "'", str15, "1986076930754837");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\022\ufffd[bmY\005\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\003\022\ufffd[bmY\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8963015050267195646394025486" + "'", str21, "8963015050267195646394025486");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd" + "'", str25, "\000\ufffd");
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        rSA1.generateKeys(100);
        java.lang.String str7 = rSA1.encrypt("749059399503547");
        java.lang.String str9 = rSA1.encrypt("\\\ufffd\ufffd\ufffd\024\ufffd\ufffd\007\ufffdU");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3818374039" + "'", str3, "3818374039");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "284555235201204972973342015526" + "'", str7, "284555235201204972973342015526");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "113027252098993001554467461906" + "'", str9, "113027252098993001554467461906");
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("225089623685693560529903855490");
        java.lang.String str19 = rSA1.decrypt("2459090002");
        java.lang.String str21 = rSA1.encrypt("1920050391995830");
        java.lang.String str23 = rSA1.encrypt("939196575401842");
        java.lang.String str25 = rSA1.encrypt("\013\027\ufffd\u0302\ufffd\ufffd\ufffd\ufffd\u0267");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "308641556004377" + "'", str7, "308641556004377");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "167" + "'", str15, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\021" + "'", str19, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "305" + "'", str21, "305");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "231" + "'", str23, "231");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "151" + "'", str25, "151");
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        java.lang.String str5 = rSA1.encrypt("1512739533813279");
        java.lang.String str7 = rSA1.decrypt("1910408943294711");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "101" + "'", str5, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\"" + "'", str7, "\"");
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
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
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\ufffd\ufffdK");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "916633828963209149096691616268" + "'", str9, "916633828963209149096691616268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "916633828963209149096691616268" + "'", str11, "916633828963209149096691616268");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\ufffdj\003\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\013\ufffdj\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "492438773152606689278783976694" + "'", str15, "492438773152606689278783976694");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "955804978818114195382907180519" + "'", str19, "955804978818114195382907180519");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "73033875837448050962179667713" + "'", str21, "73033875837448050962179667713");
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("669");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "374" + "'", str15, "374");
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.encrypt("252");
        java.lang.String str21 = rSA1.encrypt("20");
        java.lang.String str23 = rSA1.decrypt("561658842431796679757060112120");
        java.lang.String str25 = rSA1.encrypt("2582197211");
        java.lang.String str27 = rSA1.decrypt("529897539092499651265402754371");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "270572194882206800218810408051" + "'", str9, "270572194882206800218810408051");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97779621952327530912583128075" + "'", str11, "97779621952327530912583128075");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "730911392779270609038553976988" + "'", str13, "730911392779270609038553976988");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "65" + "'", str17, "65");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "326" + "'", str19, "326");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "784" + "'", str21, "784");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\n" + "'", str23, "\002\n");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "44" + "'", str25, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001C" + "'", str27, "\001C");
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
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
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.encrypt("1104215898119544");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37597831124474660138206652203" + "'", str9, "37597831124474660138206652203");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\022w\"\ufffd \017\ufffd&" + "'", str11, "\004\ufffd\ufffd\ufffd\022w\"\ufffd \017\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd@\004\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd@\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "211021509475378213186101690927" + "'", str17, "211021509475378213186101690927");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "34807651296528893219074328447" + "'", str21, "34807651296528893219074328447");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "25889842713035835231679664872" + "'", str23, "25889842713035835231679664872");
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr\013\ufffd");
        java.lang.String str13 = rSA1.encrypt("208");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd`\f\022\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172" + "'", str5, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "192" + "'", str9, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "41" + "'", str11, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "239" + "'", str13, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "113" + "'", str15, "113");
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) ' ');
        java.lang.String str21 = rSA1.encrypt("192569224470580183531005309777");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "234988443570955047559488397099" + "'", str9, "234988443570955047559488397099");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\u0438\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\u0438\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "53823885838169167321624711236" + "'", str13, "53823885838169167321624711236");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "585367059138588590088139675139" + "'", str15, "585367059138588590088139675139");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "297017458546050956866014276429" + "'", str17, "297017458546050956866014276429");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "246122623" + "'", str21, "246122623");
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("141592947570930378736777989995");
        java.lang.String str19 = rSA1.encrypt("\b\ufffd(\023");
        java.lang.String str21 = rSA1.encrypt("63126036322318");
        java.lang.String str23 = rSA1.encrypt("461967943459320");
        java.lang.String str25 = rSA1.decrypt("9562383435");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004I\021\ufffd+_e" + "'", str13, "\004I\021\ufffd+_e");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2182391227641817" + "'", str15, "2182391227641817");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1041652660702044" + "'", str17, "1041652660702044");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2067149851134382" + "'", str19, "2067149851134382");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "231504411354296" + "'", str21, "231504411354296");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1688704592761143" + "'", str23, "1688704592761143");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\007\035\ufffd\ufffd\ufffd" + "'", str25, "\007\035\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("1603037267069329");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3057322518786886" + "'", str7, "3057322518786886");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2503676553" + "'", str13, "2503676553");
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str15 = rSA1.decrypt("1630771903");
        java.lang.String str17 = rSA1.decrypt("254393131027315390075822379294");
        java.lang.String str19 = rSA1.decrypt("5613811618");
        java.lang.String str21 = rSA1.decrypt("472759722417840");
        java.lang.String str23 = rSA1.encrypt("3123665183");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "527391890488094" + "'", str13, "527391890488094");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd{\\\177\ufffd\ufffd" + "'", str17, "\001\ufffd{\\\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffdC\005" + "'", str19, "\000\ufffd\ufffd\ufffdC\005");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd->0KX" + "'", str21, "\004\ufffd->0KX");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2023090899651460" + "'", str23, "2023090899651460");
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("370751075487002776593854224073");
        java.lang.String str13 = rSA1.encrypt("6297770075");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1632887210313162" + "'", str7, "1632887210313162");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "B\017\ufffd" + "'", str11, "B\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "318320973" + "'", str13, "318320973");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7516865509350965248" + "'", str9, "7516865509350965248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1532278301220703125" + "'", str13, "1532278301220703125");
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3978487539" + "'", str3, "3978487539");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7190648613" + "'", str5, "7190648613");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9204138406" + "'", str7, "9204138406");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9212169953" + "'", str9, "9212169953");
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd8X\031$\001");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "&" + "'", str11, "&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ")" + "'", str13, ")");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\023" + "'", str15, "\001\023");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "495" + "'", str17, "495");
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
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
        java.lang.String str21 = rSA1.encrypt("792854241");
        rSA1.generateKeys(100);
        java.lang.String str25 = rSA1.encrypt("\n\ufffd\ufffd\ufffd");
        java.lang.String str27 = rSA1.encrypt("\006V\037\ufffd\ufffd");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "26293659865586474938575484109" + "'", str9, "26293659865586474938575484109");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "396609414441869694091599050263" + "'", str11, "396609414441869694091599050263");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "421685586104860755863262064643" + "'", str13, "421685586104860755863262064643");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "363" + "'", str17, "363");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "135" + "'", str21, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "660025824803549868093519375251" + "'", str25, "660025824803549868093519375251");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "364295008084228442884723945715" + "'", str27, "364295008084228442884723945715");
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
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
        java.lang.String str25 = rSA1.encrypt("416175732479790270497901975791");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\002\u071d\ufffd\024\ufffd\ufffd\001.\026\ufffd.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "649525898784600" + "'", str7, "649525898784600");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1282967983780847" + "'", str13, "1282967983780847");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "140608" + "'", str15, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1003861513220839" + "'", str17, "1003861513220839");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1308378393813767" + "'", str19, "1308378393813767");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\032qd9K" + "'", str21, "\003\ufffd\032qd9K");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str23, "\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "441274637568410" + "'", str25, "441274637568410");
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.encrypt("T\024\"\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("139542104868218591216622610277");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "268" + "'", str9, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "439" + "'", str11, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        java.lang.String str15 = rSA1.decrypt("136050176823069173982770643607");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffdb\030\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\t\ufffdb\030\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\n\"<\017\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\t\n\"<\017\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\\s" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\\s");
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\ufffd\u01f10\025\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\025\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\025\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29021429930800694508091174054" + "'", str11, "29021429930800694508091174054");
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.decrypt("1422455974188443");
        java.lang.String str19 = rSA1.encrypt("\005g\006\ufffd\ufffda");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1682511864268402" + "'", str7, "1682511864268402");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1206858725967526" + "'", str13, "1206858725967526");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "126251759080788" + "'", str15, "126251759080788");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\u04ef" + "'", str17, "\004\ufffd\ufffd\ufffd\u04ef");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2055760721306135" + "'", str19, "2055760721306135");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "201622894053497463128796592206" + "'", str9, "201622894053497463128796592206");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "503039558767646612736165575949" + "'", str11, "503039558767646612736165575949");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdd\f\ufffd\ufffd\ufffd\\\ufffd\ufffdI" + "'", str13, "\ufffdd\f\ufffd\ufffd\ufffd\\\ufffd\ufffdI");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffddM:2&" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffddM:2&");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("828944592250846");
        java.lang.String str11 = rSA1.decrypt("60732077159364971136922584801");
        java.lang.String str13 = rSA1.decrypt("1499460590289687");
        java.lang.String str15 = rSA1.encrypt("1081477671416484");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "e" + "'", str9, "e");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "353" + "'", str15, "353");
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
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
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str25 = rSA1.encrypt("2136087085446784");
        java.lang.String str27 = rSA1.decrypt("2069046455449321");
        java.lang.String str29 = rSA1.decrypt("27295460979668429096045430190");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "868306962560375932681976783268" + "'", str9, "868306962560375932681976783268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "564799541565136621745141497768" + "'", str11, "564799541565136621745141497768");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "217435756118892648545814752186" + "'", str13, "217435756118892648545814752186");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "181" + "'", str17, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "241" + "'", str21, "241");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "32" + "'", str25, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd" + "'", str27, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000\ufffd" + "'", str29, "\000\ufffd");
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
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
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2510265542797866" + "'", str7, "2510265542797866");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "679" + "'", str11, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("1289219933400623");
        java.lang.String str9 = rSA1.decrypt("184677000372197579945525954200");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\006\027\ufffd\ufffd\033\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("357053978347407956994256651358");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2310978052" + "'", str3, "2310978052");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\374\ufffd\ufffd\u0371\ufffd" + "'", str7, "\ufffd\374\ufffd\ufffd\u0371\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd'\007\ufffd{q" + "'", str9, "\ufffd\ufffd'\007\ufffd{q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8743532285328338862141295826" + "'", str11, "8743532285328338862141295826");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35121845326752929298156728534" + "'", str13, "35121845326752929298156728534");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "327" + "'", str17, "327");
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd<\013\ufffd\024\f\ufffd\021");
        java.lang.String str7 = rSA1.encrypt("\0025");
        java.lang.String str9 = rSA1.decrypt("670602851665580730506210001205");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\ufffd\177\ufffd" + "'", str3, "\005\ufffd\ufffd\ufffd\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "688655248898795" + "'", str5, "688655248898795");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "57576099353125" + "'", str7, "57576099353125");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("\002\ufffd\ufffd\ufffdO\004\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("24685792626362170145174572889");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1799402731442386" + "'", str7, "1799402731442386");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "210477933017650" + "'", str13, "210477933017650");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\u06ed\ufffd\ufffd@" + "'", str15, "\005\u06ed\ufffd\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd*\024" + "'", str17, "\006\ufffd*\024");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1881705580909135" + "'", str19, "1881705580909135");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.encrypt("315");
        java.lang.String str15 = rSA1.encrypt("136");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101921535994725989" + "'", str11, "101921535994725989");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "394429669870485690047598085329" + "'", str13, "394429669870485690047598085329");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "141988146887104233769490055377" + "'", str15, "141988146887104233769490055377");
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40017971597836857344" + "'", str3, "40017971597836857344");
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("3695423354981462");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\002\024\ufffd\ufffd\020\ufffd\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1609072518323450" + "'", str7, "1609072518323450");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "181328724683569" + "'", str13, "181328724683569");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1009660304040431" + "'", str15, "1009660304040431");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "453485944289964" + "'", str17, "453485944289964");
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.decrypt("914181283893724");
        java.lang.String str13 = rSA1.decrypt("406886696867962475347512808088");
        java.lang.String str15 = rSA1.decrypt("181594806096734");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K" + "'", str11, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\016" + "'", str13, "\002\016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "c" + "'", str15, "c");
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.decrypt("307641391968194344643523456830");
        java.lang.String str17 = rSA1.decrypt("6997781443191095777352523841");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2126646269146442" + "'", str7, "2126646269146442");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "321" + "'", str11, "321");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44" + "'", str13, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\032" + "'", str17, "\003\032");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("278806374250498767788908229396");
        java.lang.String str19 = rSA1.encrypt("s\"\ufffd\ufffd");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1686722976544338" + "'", str7, "1686722976544338");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "362797056" + "'", str13, "362797056");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "503093052999188800295488061912" + "'", str17, "503093052999188800295488061912");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "176228136615742223784577717597" + "'", str19, "176228136615742223784577717597");
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55" + "'", str11, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1" + "'", str15, "1");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("\030");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "g" + "'", str11, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47" + "'", str15, "47");
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("397665068662727978252316658237");
        java.lang.String str17 = rSA1.decrypt("6215196877342841510188341188");
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.decrypt("432");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1170845929058802" + "'", str7, "1170845929058802");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "455301491233980191381815745781" + "'", str15, "455301491233980191381815745781");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006V\b\033\ufffd\f\ufffdm*S:\b\ufffd" + "'", str17, "\006V\b\033\ufffd\f\ufffdm*S:\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\024\ufffd\ufffdd" + "'", str21, "\007\ufffd\024\ufffd\ufffdd");
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str15 = rSA1.encrypt("210378250090253374708038199698");
        java.lang.String str17 = rSA1.encrypt("2721187082833909");
        java.lang.String str19 = rSA1.decrypt("373621002371511102642815100357");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1152400916276153" + "'", str13, "1152400916276153");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "667223829675202" + "'", str15, "667223829675202");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1292634812023632" + "'", str17, "1292634812023632");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\b\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\005\ufffd\b\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "607276667950090541052388231316" + "'", str11, "607276667950090541052388231316");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
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
        java.lang.String str27 = rSA1.encrypt("3988510568");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "771909763128203" + "'", str15, "771909763128203");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1206607176414094" + "'", str17, "1206607176414094");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "305" + "'", str21, "305");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "98" + "'", str23, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\000" + "'", str25, "\002\000");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "140" + "'", str27, "140");
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("350555347807474765631801418392");
        java.lang.String str19 = rSA1.encrypt("219091099050495");
        java.lang.String str21 = rSA1.encrypt("57874652183029187933617445072");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "792239879409278898871813113557" + "'", str9, "792239879409278898871813113557");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004`q;\004\t\177\ufffd\ufffd\ufffd," + "'", str11, "\004`q;\004\t\177\ufffd\ufffd\ufffd,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd>4\021\ufffd" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffd>4\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "217224729497905117061699459016" + "'", str17, "217224729497905117061699459016");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "280110542184477716185553876073" + "'", str19, "280110542184477716185553876073");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "526348720161945500612710975050" + "'", str21, "526348720161945500612710975050");
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\ufffd\t\ufffd=\000\"\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("35649815032570742856");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1768728771606650" + "'", str7, "1768728771606650");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "198" + "'", str15, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "204" + "'", str19, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "17" + "'", str21, "17");
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
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
        java.lang.String str21 = rSA1.encrypt("\013\027\ufffd\ufffd4\r\ufffd\ufffdKRv");
        java.lang.String str23 = rSA1.decrypt("131591980401875559");
        java.lang.String str25 = rSA1.decrypt("332878761705464188673359881647");
        java.lang.String str27 = rSA1.encrypt("802274267248068");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "779371060339786" + "'", str7, "779371060339786");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1256569923644158" + "'", str13, "1256569923644158");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\036\ufffd)" + "'", str15, "\001\ufffd\ufffd\036\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\020\ufffd\ufffd\ufffd" + "'", str19, "\020\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1574931188" + "'", str21, "1574931188");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\027" + "'", str23, "\001\027");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\017\ufffd\ufffd" + "'", str25, "\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "482386634" + "'", str27, "482386634");
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str17 = rSA1.encrypt("73");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "436082888131967776315085156319" + "'", str9, "436082888131967776315085156319");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\031\ufffd\022\ufffd\ufffd\u031e\ufffd" + "'", str11, "\005\ufffd\031\ufffd\022\ufffd\ufffd\u031e\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "313916245304073174666054940465" + "'", str15, "313916245304073174666054940465");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "563461804751933959651" + "'", str17, "563461804751933959651");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "739549151185884" + "'", str7, "739549151185884");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "I" + "'", str11, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002t" + "'", str13, "\002t");
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("1088253610076491");
        java.lang.String str21 = rSA1.encrypt("971727387290633133168470664135");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1638204102700976" + "'", str7, "1638204102700976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "808" + "'", str19, "808");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "647" + "'", str21, "647");
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("13087572778356868098099484487");
        java.lang.String str21 = rSA1.encrypt("456226710613497684616549588458");
        rSA1.generateKeys((int) 'a');
        java.lang.String str25 = rSA1.encrypt("1404342418398114");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2906279721846363" + "'", str7, "2906279721846363");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "616857709608655" + "'", str13, "616857709608655");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\u03af\026\ufffd\ufffd" + "'", str15, "\003\u03af\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005nz@{QP" + "'", str17, "\005nz@{QP");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "500463332065784" + "'", str19, "500463332065784");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1637730759444778" + "'", str21, "1637730759444778");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3661992897428187232519404308" + "'", str25, "3661992897428187232519404308");
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.encrypt("473642297");
        java.lang.String str13 = rSA1.decrypt("66011755970030761385223442767");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\u05e0\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "234" + "'", str5, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\005\ufffd\ufffd\ufffd\030\ufffd\ufffd" + "'", str9, "\005\005\ufffd\ufffd\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "379317228779150756873734673660" + "'", str11, "379317228779150756873734673660");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\003\ufffd\ufffd\035\ufffd" + "'", str13, "\003\ufffd\ufffd\003\ufffd\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "555859850711907447043090412636" + "'", str15, "555859850711907447043090412636");
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str23 = rSA1.encrypt("4475493219804211672777599835");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(" + "'", str13, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "275" + "'", str15, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "66" + "'", str17, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "500" + "'", str23, "500");
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
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
        java.lang.String str23 = rSA1.encrypt("514022429339877052793021759384");
        java.lang.String str25 = rSA1.decrypt("262700727544159828518267312289");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\u02e4\ufffdx" + "'", str13, "\003\ufffd\u02e4\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1708378162142352" + "'", str15, "1708378162142352");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1284017609017407" + "'", str17, "1284017609017407");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "540494380815292" + "'", str19, "540494380815292");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "545083614590888" + "'", str21, "545083614590888");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "629411429067891" + "'", str23, "629411429067891");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\004\ufffd\ufffd\b\ufffd\ufffd" + "'", str25, "\004\ufffd\ufffd\b\ufffd\ufffd");
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("8403463512");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd3}&");
        java.lang.String str15 = rSA1.encrypt("\ufffd:\030");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1683971489803734" + "'", str7, "1683971489803734");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\004\ufffd\ufffd" + "'", str9, "\005\ufffd\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "759480517273977" + "'", str13, "759480517273977");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1946427206970300" + "'", str15, "1946427206970300");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("907138002405795583308521934224");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "232182070" + "'", str3, "232182070");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd0" + "'", str5, "\001\ufffd\ufffd0");
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        java.lang.String str15 = rSA1.encrypt("196989163804812");
        java.lang.String str17 = rSA1.decrypt("34467657032642345677139981796");
        java.lang.String str19 = rSA1.decrypt("7904149261");
        java.lang.String str21 = rSA1.encrypt("316332456045288255232071544281");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "494655270862415127985013147428" + "'", str15, "494655270862415127985013147428");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffda\020\ufffd\ufffd\ufffd/Cq" + "'", str17, "\t\ufffda\020\ufffd\ufffd\ufffd/Cq");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "349301103253870825554812621797" + "'", str21, "349301103253870825554812621797");
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
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
        java.lang.String str27 = rSA1.encrypt("1630771903");
        java.lang.String str29 = rSA1.decrypt("1683578461219619");
        java.lang.String str31 = rSA1.decrypt("240957294746352219473256570192");
        java.math.BigInteger bigInteger32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger33 = rSA1.encrypt(bigInteger32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1893359840015429" + "'", str7, "1893359840015429");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0012" + "'", str19, "\0012");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "614" + "'", str21, "614");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd" + "'", str23, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "7" + "'", str27, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000\ufffd" + "'", str29, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\000\ufffd" + "'", str31, "\000\ufffd");
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("1609850914753610");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1130621826892669783231168512" + "'", str3, "1130621826892669783231168512");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "797344928059979319406571079" + "'", str5, "797344928059979319406571079");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "371190886830417641264991886352" + "'", str7, "371190886830417641264991886352");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "197" + "'", str11, "197");
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("304740070237960671182697086271");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("6766351949");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1619094268" + "'", str5, "1619094268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1377249819" + "'", str11, "1377249819");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "s\030\u07c9" + "'", str13, "s\030\u07c9");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "378107452" + "'", str15, "378107452");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
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
        java.lang.String str25 = rSA1.encrypt("510335356594148790667665878993");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "361399251172605022941924049240" + "'", str9, "361399251172605022941924049240");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005VV\r\ufffd\ufffd\000\ufffd`" + "'", str11, "\005VV\r\ufffd\ufffd\000\ufffd`");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\u03fc\ufffd\ufffd\021\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\u03fc\ufffd\ufffd\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "23931819901327459880166510763" + "'", str21, "23931819901327459880166510763");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\036\013" + "'", str23, "\n\ufffd\ufffd\ufffd\ufffd\036\013");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "16024161119943310065173508382" + "'", str25, "16024161119943310065173508382");
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("1027617448837851");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001 " + "'", str15, "\001 ");
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.encrypt("\001\033");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9141864955496755190224725334" + "'", str11, "9141864955496755190224725334");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "119974508522864236368467827993" + "'", str13, "119974508522864236368467827993");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "22665187" + "'", str15, "22665187");
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
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
        java.lang.String str25 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str27 = rSA1.decrypt("939320849989680");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "340591153117388260208929786953" + "'", str9, "340591153117388260208929786953");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "83321568889428714251434776084" + "'", str13, "83321568889428714251434776084");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffdH\\\ufffd\002\ufffd\ufffd\t\ufffd" + "'", str15, "\006\ufffdH\\\ufffd\002\ufffd\ufffd\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "118272717781982421875" + "'", str17, "118272717781982421875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "62464542173169426263019569461" + "'", str19, "62464542173169426263019569461");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "110842335536248667647385295432" + "'", str21, "110842335536248667647385295432");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd\t\ufffd\ufffdhC\036\ufffd\ufffd" + "'", str23, "\002\ufffd\ufffd\t\ufffd\ufffdhC\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "375171697350072146828709811234" + "'", str25, "375171697350072146828709811234");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\006\"\ufffd*\036\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd" + "'", str27, "\006\"\ufffd*\036\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        java.lang.String str13 = rSA1.decrypt("51072814435354477634104262711");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1929727423" + "'", str3, "1929727423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1908303270" + "'", str5, "1908303270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2965859229" + "'", str7, "2965859229");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9942844821" + "'", str9, "9942844821");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2998709689" + "'", str11, "2998709689");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        java.lang.String str17 = rSA1.decrypt("852");
        java.lang.String str19 = rSA1.decrypt("27572656154364275559432000655");
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "705730964737962" + "'", str7, "705730964737962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "703229542" + "'", str11, "703229542");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2855523314" + "'", str15, "2855523314");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\u04c1" + "'", str17, "\000\ufffd\ufffd\u04c1");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd" + "'", str19, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2892899108" + "'", str21, "2892899108");
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.encrypt("623433996390119");
        java.lang.String str11 = rSA1.decrypt("299711429567829177107340963225");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7384151446" + "'", str3, "7384151446");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6286592746" + "'", str7, "6286592746");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "460506876" + "'", str9, "460506876");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\"\ufffd" + "'", str11, "\000\ufffd\"\ufffd");
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("229");
        java.lang.String str13 = rSA1.encrypt("1036074795300243");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004>\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004>\006\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "355911968540486920421635543322" + "'", str13, "355911968540486920421635543322");
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("697412553478866682791085192253");
        java.lang.String str7 = rSA1.encrypt("49140920675126024452718351806");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003&" + "'", str5, "\003&");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "760" + "'", str7, "760");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
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
        java.lang.String str25 = rSA1.decrypt("240092284704561247203406104910");
        java.lang.String str27 = rSA1.encrypt("\003\ubdc1\ufffd\ufffd\ufffd\037X\020+");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\017\003\ufffd" + "'", str13, "\006\ufffd\ufffd\017\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1389366739000901" + "'", str15, "1389366739000901");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "843752488941568" + "'", str17, "843752488941568");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "251" + "'", str23, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "253" + "'", str27, "253");
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.lang.String str13 = rSA1.encrypt("538466596764584785061881286421");
        java.lang.String str15 = rSA1.encrypt("255208532862462952347238750539");
        java.lang.String str17 = rSA1.encrypt("9093719717375991413456515037");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\u0277\ufffdO" + "'", str5, "\001\u0277\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "201404102637158710163219990694" + "'", str9, "201404102637158710163219990694");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237908218217774739395235569613" + "'", str11, "237908218217774739395235569613");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "121405931267231927277259137617" + "'", str13, "121405931267231927277259137617");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "64698322986544818440829311804" + "'", str15, "64698322986544818440829311804");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "218369319371595633245981025473" + "'", str17, "218369319371595633245981025473");
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("\0072Z!C>H\023\ufffd9\020\ufffd");
        java.lang.String str17 = rSA1.decrypt("324053092273740555737028151137");
        java.lang.String str19 = rSA1.decrypt("586614665667193");
        java.lang.String str21 = rSA1.decrypt("446");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "107147242937938065406108665751" + "'", str9, "107147242937938065406108665751");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107147242937938065406108665751" + "'", str11, "107147242937938065406108665751");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\u03dc\ufffd\025" + "'", str13, "\003\ufffd\ufffd\u03dc\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "513053367481101273685567338405" + "'", str15, "513053367481101273685567338405");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\u0170\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd3" + "'", str17, "\006\u0170\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd3");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\000\\\ufffd\ufffd\ufffd(D2J" + "'", str19, "\004\000\\\ufffd\ufffd\ufffd(D2J");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\037\ufffd\ufffd\ufffd>" + "'", str21, "\003\ufffd\ufffd\037\ufffd\ufffd\ufffd>");
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("592549611818494376206249350988");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd0?");
        java.lang.String str15 = rSA1.encrypt("769592099307801");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "284" + "'", str11, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "406" + "'", str13, "406");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "347" + "'", str15, "347");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        java.lang.String str19 = rSA1.decrypt("498691499322197");
        java.lang.String str21 = rSA1.decrypt("1731720909");
        java.lang.String str23 = rSA1.encrypt("565504052626583936640069678263");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffdgM\004\ufffd" + "'", str13, "\002\ufffd\ufffdgM\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1649559869902032" + "'", str15, "1649559869902032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2588813784330825" + "'", str17, "2588813784330825");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\tf\023\ufffd\ufffd\005" + "'", str19, "\tf\023\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\027\ufffdo)" + "'", str21, "\001\ufffd\027\ufffdo)");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1823350548014905" + "'", str23, "1823350548014905");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
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
        java.lang.String str27 = rSA1.encrypt("1630771903");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1309466407661217" + "'", str7, "1309466407661217");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "383" + "'", str21, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "190" + "'", str27, "190");
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("37761701459156484237");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "289818437129760482589896150986" + "'", str11, "289818437129760482589896150986");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "713227567814127202973217888888" + "'", str15, "713227567814127202973217888888");
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
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
        java.lang.String str29 = rSA1.encrypt("4018800740");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = rSA1.decrypt("\0137\032\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?7??c??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "105732955779444" + "'", str7, "105732955779444");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "228" + "'", str15, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "q" + "'", str17, "q");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "235" + "'", str25, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd" + "'", str27, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "286" + "'", str29, "286");
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.decrypt("430269816702801749253730374585");
        java.lang.String str15 = rSA1.encrypt("329450841152748808338738061118");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "803778280840792" + "'", str11, "803778280840792");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0079\n\ufffdH\034" + "'", str13, "\0079\n\ufffdH\034");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2316264353463448" + "'", str15, "2316264353463448");
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("M\021\ufffd");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffd(" + "'", str3, "\004\ufffd\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2073426959935676" + "'", str5, "2073426959935676");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "315416004336993" + "'", str7, "315416004336993");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\u0744\u0580m" + "'", str9, "\001\ufffd\u0744\u0580m");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\u02bfx\017\ufffd" + "'", str11, "\007\ufffd\u02bfx\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\007\ufffd\013" + "'", str13, "\005\ufffd\ufffd\007\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2268945416036686" + "'", str15, "2268945416036686");
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1271360148175641" + "'", str7, "1271360148175641");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "913378984971336" + "'", str13, "913378984971336");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\u9776I" + "'", str15, "\002\ufffd\u9776I");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\0323!~" + "'", str17, "\004\ufffd\0323!~");
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3008754028361207" + "'", str7, "3008754028361207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\031\ufffd" + "'", str9, "\b\ufffd\ufffd\ufffd\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "663233461792484" + "'", str13, "663233461792484");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1168015225971805" + "'", str15, "1168015225971805");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "710618032539837" + "'", str17, "710618032539837");
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
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
        java.lang.String str23 = rSA1.encrypt("495691608449970956244414510384");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str29 = rSA1.decrypt("3906666888");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.encrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "34342298206895444844354945781" + "'", str9, "34342298206895444844354945781");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "34342298206895444844354945781" + "'", str11, "34342298206895444844354945781");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffdA\026\023\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffdA\026\023\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "295804648016041522867467134191" + "'", str15, "295804648016041522867467134191");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\n\ufffd{" + "'", str17, "\001\ufffd\ufffd\ufffd\n\ufffd{");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20558464583715838807869817954" + "'", str21, "20558464583715838807869817954");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "640257058473060273607377791664" + "'", str23, "640257058473060273607377791664");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\002f" + "'", str29, "\002f");
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("603377111727349");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\002\u071a\u0715\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("294732951289951383216356438943");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "61596617191856899713280869742" + "'", str11, "61596617191856899713280869742");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "347816785079589277409124569674" + "'", str13, "347816785079589277409124569674");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "417579986928111627766714241094" + "'", str15, "417579986928111627766714241094");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("1249253780109007");
        java.lang.String str15 = rSA1.encrypt("\003\026\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2179180108793207" + "'", str7, "2179180108793207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1563125485" + "'", str11, "1563125485");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "368262539" + "'", str15, "368262539");
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("765314849130516");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd7");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????7\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\022\ufffd\ufffd\ufffd\u064f\ufffdg5" + "'", str11, "\001\ufffd\022\ufffd\ufffd\ufffd\u064f\ufffdg5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "439815062569703411042972443174" + "'", str13, "439815062569703411042972443174");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002=" + "'", str17, "\002=");
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
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
        java.lang.String str21 = rSA1.encrypt("128412821042219503162385571257");
        java.lang.String str23 = rSA1.decrypt("2977022297");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "697800319917950" + "'", str7, "697800319917950");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\f\ufffd\ufffd\ufffd" + "'", str9, "\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1273107895152301" + "'", str11, "1273107895152301");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1461009784112881" + "'", str13, "1461009784112881");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3235323222297602" + "'", str17, "3235323222297602");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "342584225166481331179260417490" + "'", str21, "342584225166481331179260417490");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004S%n5\027\ufffd\ufffd\023\ufffd\026" + "'", str23, "\004S%n5\027\ufffd\ufffd\023\ufffd\026");
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        java.lang.String str7 = rSA1.encrypt("2123476673999729");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "119579939769595636001061" + "'", str3, "119579939769595636001061");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "403366835514364936590766001357" + "'", str5, "403366835514364936590766001357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "82304483286851358342320859077" + "'", str7, "82304483286851358342320859077");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\r" + "'", str7, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "332" + "'", str9, "332");
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("13087572778356868098099484487");
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.encrypt("892790447778000");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "301665112581933" + "'", str7, "301665112581933");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1468955084198331" + "'", str13, "1468955084198331");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffd\004\ufffdo" + "'", str17, "\b\ufffd\ufffd\004\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "848460858082265" + "'", str19, "848460858082265");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "355" + "'", str23, "355");
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
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
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50235068404465788456874394493" + "'", str9, "50235068404465788456874394493");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd;\0209#\027" + "'", str11, "\001\ufffd\ufffd\ufffd;\0209#\027");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "409965950654034730590998000621" + "'", str13, "409965950654034730590998000621");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd<\034" + "'", str17, "\000\ufffd\ufffd<\034");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "941829852854466" + "'", str19, "941829852854466");
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3287021950" + "'", str7, "3287021950");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "510718295" + "'", str9, "510718295");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd@" + "'", str11, "\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "499493586" + "'", str13, "499493586");
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.encrypt("360275062061272870298343807686");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\027\ufffdS\005");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??S?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "658962069494808" + "'", str7, "658962069494808");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\005\0377~\034\030" + "'", str9, "\004\005\0377~\034\030");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1157737276587936" + "'", str13, "1157737276587936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1293378028480448" + "'", str15, "1293378028480448");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3166484064315388" + "'", str21, "3166484064315388");
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\u8e25\ufffd\ufffdZ");
        java.lang.String str17 = rSA1.encrypt("458388307745635741204123901299");
        java.lang.String str19 = rSA1.encrypt("362100633300163959326683313726");
        java.lang.String str21 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t" + "'", str7, "\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "S" + "'", str9, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0016" + "'", str11, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "478" + "'", str15, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "172" + "'", str17, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "217" + "'", str19, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "550" + "'", str21, "550");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
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
        java.lang.String str21 = rSA1.decrypt("772142580463152");
        java.lang.String str23 = rSA1.decrypt("1528040200463460");
        java.lang.String str25 = rSA1.decrypt("15125060773096054179723371361");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193451519810386035734494120377" + "'", str9, "193451519810386035734494120377");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "193451519810386035734494120377" + "'", str11, "193451519810386035734494120377");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdl>" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdl>");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "302718888115401676930201021010" + "'", str15, "302718888115401676930201021010");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\034\u06e6\ufffd\ufffd\ufffdq+" + "'", str21, "\004\ufffd\034\u06e6\ufffd\ufffd\ufffdq+");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffd\ufffd\ufffdh\005\ufffd\ufffd!" + "'", str23, "\006\ufffd\ufffd\ufffdh\005\ufffd\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n\b\022\007xo\002\031\ufffd\004\ufffd\023n" + "'", str25, "\n\b\022\007xo\002\031\ufffd\004\ufffd\023n");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.encrypt("4783419535");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372126762151814341746529334561" + "'", str3, "372126762151814341746529334561");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "339999379059230878061680145269" + "'", str5, "339999379059230878061680145269");
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.decrypt("473642297");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\rX\006t\003\005\022\ufffd\u04e2" + "'", str3, "\004\ufffd\rX\006t\003\005\022\ufffd\u04e2");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250047" + "'", str5, "250047");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\007\ufffd\ufffdo" + "'", str7, "\007\ufffd\ufffd\007\ufffd\ufffdo");
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "351289488149809170731750242514" + "'", str9, "351289488149809170731750242514");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530364372773263233124463773279" + "'", str11, "530364372773263233124463773279");
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("559478705485095");
        java.lang.String str19 = rSA1.encrypt("\002\t\ufffd\007\ufffd\ufffd\ufffd\ufffde7");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "323" + "'", str11, "323");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "357" + "'", str13, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31293377126885848905017800496" + "'", str17, "31293377126885848905017800496");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "454273328728777062347589936165" + "'", str19, "454273328728777062347589936165");
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("604");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1904017023" + "'", str3, "1904017023");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1720732785" + "'", str5, "1720732785");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "435378367" + "'", str7, "435378367");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffdv" + "'", str9, "\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "56966388317290569084646073286" + "'", str15, "56966388317290569084646073286");
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.encrypt("216");
        java.lang.String str15 = rSA1.encrypt("528864329572193935886654471744");
        java.lang.String str17 = rSA1.encrypt("7481034013");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144422206657252189121330363000" + "'", str9, "144422206657252189121330363000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "637210495396596453351616745387" + "'", str11, "637210495396596453351616745387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35591744252109312792" + "'", str13, "35591744252109312792");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "148873459930042729697596568628" + "'", str15, "148873459930042729697596568628");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "568180637392087633719630740912" + "'", str17, "568180637392087633719630740912");
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("366659386383014");
        java.lang.String str13 = rSA1.encrypt("1811810741660453");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "518" + "'", str11, "518");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "497" + "'", str13, "497");
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        java.lang.String str15 = rSA1.encrypt("593904299716151995306964564094");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd$o\013");
        java.lang.String str19 = rSA1.decrypt("1046378350889913");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\u0392Z" + "'", str11, "\b\ufffd\ufffd\ufffd\u0392Z");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "184528125" + "'", str13, "184528125");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "475826710873870455174810361650" + "'", str15, "475826710873870455174810361650");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "87430938129726311094734792420" + "'", str17, "87430938129726311094734792420");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\\\ufffd7J\006\b\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\ufffd\\\ufffd7J\006\b\ufffd\ufffd");
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\n\ufffd\ufffd\ufffd|");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??j?)?|\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1055494713826442" + "'", str11, "1055494713826442");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1298334692894236" + "'", str13, "1298334692894236");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1511072590583781" + "'", str15, "1511072590583781");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "589499845026920832424279247946" + "'", str19, "589499845026920832424279247946");
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("1761509011968114");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "545126524636182894915931261532" + "'", str9, "545126524636182894915931261532");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffdA\"\u01b5\ufffd\ufffd\ufffd\000\ufffd" + "'", str13, "\000\ufffdA\"\u01b5\ufffd\ufffd\ufffd\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\u0119\ufffd\033\u07df?" + "'", str15, "\005\ufffd\ufffd\ufffd\u0119\ufffd\033\u07df?");
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("992436543");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\001\f");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9253273786" + "'", str3, "9253273786");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3752707897" + "'", str7, "3752707897");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "109" + "'", str11, "109");
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.String str13 = rSA1.decrypt("91678854426503168386094718335");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1188586906" + "'", str3, "1188586906");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1991080698" + "'", str7, "1991080698");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd<\027" + "'", str9, "\001\ufffd<\027");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2731006917" + "'", str11, "2731006917");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("1534903236613159");
        java.lang.String str19 = rSA1.decrypt("9915219130");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "392796439811826569189447349687" + "'", str9, "392796439811826569189447349687");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\035\ufffdL" + "'", str11, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\035\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffdU" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffdU");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\004\u0286\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd\004\u0286\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u0156\ufffd\035\u0467C" + "'", str19, "\u0156\ufffd\035\u0467C");
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "399647104495512" + "'", str7, "399647104495512");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\u04feo" + "'", str9, "\005\ufffd\ufffd\u04feo");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "98631829856355" + "'", str11, "98631829856355");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1361619286034499" + "'", str13, "1361619286034499");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "990627302945546" + "'", str15, "990627302945546");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\0227," + "'", str17, "\001\ufffd\0227,");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("765314849130516");
        java.lang.String str19 = rSA1.decrypt("37822311364830212583");
        java.lang.String str21 = rSA1.decrypt("94111875490901");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\ufffd=@\035\030\ufffd\ufffd\002te\002");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"B?=\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\020" + "'", str11, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\020");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "668383817040704908462812842246" + "'", str13, "668383817040704908462812842246");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "y" + "'", str19, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "," + "'", str21, ",");
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("526205689782020390279918776579");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1246757979700304" + "'", str7, "1246757979700304");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\022\ufffd" + "'", str13, "\003\ufffd\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "651098405289699" + "'", str15, "651098405289699");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "82" + "'", str21, "82");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("37761701459156484237");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.decrypt("742");
        java.lang.String str21 = rSA1.encrypt("1010879549265843");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "737048809722172423575196955656" + "'", str11, "737048809722172423575196955656");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "352774141414522474386632069111" + "'", str15, "352774141414522474386632069111");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd\u0748B" + "'", str19, "\000\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd\u0748B");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "372040102703686172471798649800" + "'", str21, "372040102703686172471798649800");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("85317131416827023530889570588");
        java.lang.String str15 = rSA1.encrypt("230392568664349877198980463493");
        java.lang.String str17 = rSA1.decrypt("944875821010124");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "200524250024247738901935107663" + "'", str9, "200524250024247738901935107663");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "453899862733693191770382418083" + "'", str11, "453899862733693191770382418083");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\032\ufffd\u02c7G" + "'", str13, "\004\ufffd\ufffd\032\ufffd\u02c7G");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35480866375739692897721749879" + "'", str15, "35480866375739692897721749879");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffdJ\t\ufffd\u0592h\030\ufffd" + "'", str17, "\005\ufffdJ\t\ufffd\u0592h\030\ufffd");
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
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
        java.lang.String str23 = rSA1.encrypt("253427251319610");
        java.lang.String str25 = rSA1.encrypt("501945165014648248890773876071");
        java.lang.String str27 = rSA1.decrypt("91125");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1162265038377566" + "'", str7, "1162265038377566");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "167" + "'", str15, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001$" + "'", str17, "\001$");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "270" + "'", str19, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "41" + "'", str23, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "88" + "'", str25, "88");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\024" + "'", str27, "\024");
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("887836866708316");
        java.lang.String str19 = rSA1.encrypt("964314961740013");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\n\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "701025254912880889238152073040" + "'", str9, "701025254912880889238152073040");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\177\ufffd\ufffdU" + "'", str11, "\004\ufffd\ufffd\ufffd\177\ufffd\ufffdU");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffdL_\000" + "'", str15, "\001\ufffd\ufffdL_\000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "203261250645902167843153679303" + "'", str17, "203261250645902167843153679303");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "300970652813489905932178854067" + "'", str19, "300970652813489905932178854067");
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("1709572230870390");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd=\023\027\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd=\023\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "519407615861248051195722686031" + "'", str5, "519407615861248051195722686031");
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\006\016\ufffd\ufffda2");
        java.lang.String str17 = rSA1.encrypt("282");
        java.lang.String str19 = rSA1.decrypt("844129610510235");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\030K\"\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\030K\"\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "324716125233682377635141343114" + "'", str13, "324716125233682377635141343114");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "241807339462621318403079164932" + "'", str15, "241807339462621318403079164932");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "361213220983328453574305011371" + "'", str17, "361213220983328453574305011371");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\017\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\017\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("47829690000000");
        java.lang.String str21 = rSA1.encrypt("23064682279670222787953542970");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214991635428710736898755143243" + "'", str9, "214991635428710736898755143243");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003t\017\ufffd\ufffd\ufffd\ufffd\u031a\ufffd\ufffd\ufffd" + "'", str11, "\003t\017\ufffd\ufffd\ufffd\ufffd\u031a\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "576945872950241417004896960791" + "'", str13, "576945872950241417004896960791");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1460567403626835" + "'", str19, "1460567403626835");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1244077799402039" + "'", str21, "1244077799402039");
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str13 = rSA1.decrypt("555139909713915");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("5844898012");
        java.lang.String str19 = rSA1.encrypt("1922365438442502");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "199" + "'", str9, "199");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "451" + "'", str11, "451");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001:" + "'", str13, "\001:");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1453384480" + "'", str17, "1453384480");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1093548948" + "'", str19, "1093548948");
    }

    @Test
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
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
        java.lang.String str23 = rSA1.decrypt("257");
        java.lang.String str25 = rSA1.decrypt("94700998626499598827701647705");
        java.lang.String str27 = rSA1.encrypt("362240388130557");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\005\ufffd\ufffd\ufffd" + "'", str13, "\006\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1268901167873921" + "'", str15, "1268901167873921");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "372546675345593" + "'", str17, "372546675345593");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "C" + "'", str21, "C");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001D" + "'", str25, "\001D");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "311" + "'", str27, "311");
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        java.lang.String str17 = rSA1.encrypt("100808031796894");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "476088648646293" + "'", str11, "476088648646293");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1812590990076713" + "'", str13, "1812590990076713");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1555628263058312" + "'", str15, "1555628263058312");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1410611039842491" + "'", str17, "1410611039842491");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.decrypt("208");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("832595611796045640369168064278");
        java.lang.String str19 = rSA1.decrypt("3875730251");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "206" + "'", str7, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K\r\031\ufffd\ufffd\ufffd\ufffd\ufffd=" + "'", str11, "K\r\031\ufffd\ufffd\ufffd\ufffd\ufffd=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ":\002\ufffd\ufffd\ufffd\u04c0\ufffd\ufffd" + "'", str13, ":\002\ufffd\ufffd\ufffd\u04c0\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "347174342630562826201566107096" + "'", str17, "347174342630562826201566107096");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\ufffd\ufffd\u0561\ufffd\b\ufffd\017" + "'", str19, "\t\ufffd\ufffd\u0561\ufffd\b\ufffd\017");
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.encrypt("329884100690202171705653954367");
        java.lang.String str17 = rSA1.encrypt("743555153197108408198099090927");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1523934089551650" + "'", str7, "1523934089551650");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "666113549099557" + "'", str13, "666113549099557");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2080103264866562" + "'", str15, "2080103264866562");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "355817870246802" + "'", str17, "355817870246802");
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        java.lang.String str17 = rSA1.encrypt("1275701937366434");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "339211912122549" + "'", str7, "339211912122549");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "448066544073840" + "'", str15, "448066544073840");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "480193137203527" + "'", str17, "480193137203527");
    }

    @Test
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("489216744821809573348585320231");
        java.lang.String str19 = rSA1.encrypt("\\\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("1557951100096944");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "278114341361800547466919123026" + "'", str17, "278114341361800547466919123026");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "532317489447951299119614543101" + "'", str19, "532317489447951299119614543101");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffdC-\f`00!\021\ufffd" + "'", str21, "\ufffd\ufffdC-\f`00!\021\ufffd");
    }
}
