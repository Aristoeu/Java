package RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        java.lang.String str9 = rSA1.encrypt("825110335461462544760601940215");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2871925268" + "'", str3, "2871925268");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5125771726" + "'", str7, "5125771726");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6453341713" + "'", str9, "6453341713");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "103536595621482726863383256099" + "'", str9, "103536595621482726863383256099");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\016\035Q,\016\ufffdVsjl;\b" + "'", str11, "\016\035Q,\016\ufffdVsjl;\b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "261716446576049088593889607085" + "'", str13, "261716446576049088593889607085");
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\024\027\ufffd\ufffd\013");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\r\ufffd\u03c9\ufffd\ufffd\004\ufffd" + "'", str13, "\004\ufffd\ufffd\r\ufffd\u03c9\ufffd\ufffd\004\ufffd");
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
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
        java.lang.String str21 = rSA1.encrypt("\004+xG\007\ufffd\ufffd\ufffd\ufffd\ufffd0");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71005951903466724755544461299" + "'", str9, "71005951903466724755544461299");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "71005951903466724755544461299" + "'", str11, "71005951903466724755544461299");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\003\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\003\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "695945718126114184679671463658" + "'", str15, "695945718126114184679671463658");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "268559744664772001742757446375" + "'", str19, "268559744664772001742757446375");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "244854058557542019340780494363" + "'", str21, "244854058557542019340780494363");
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "645701995332155216121089684020" + "'", str9, "645701995332155216121089684020");
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "503784516685505648182646529295" + "'", str9, "503784516685505648182646529295");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "503784516685505648182646529295" + "'", str11, "503784516685505648182646529295");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\033%R" + "'", str13, "\n\ufffd\ufffd\ufffd\ufffd\033%R");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "282714793897524896182634865135" + "'", str15, "282714793897524896182634865135");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\b\ufffd\021_\023\035\ufffd\ufffd" + "'", str21, "\003\ufffd\b\ufffd\021_\023\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\021\ufffd\ufffd\ufffd\ufffd\u0587\ufffd" + "'", str23, "\001\021\ufffd\ufffd\ufffd\ufffd\u0587\ufffd");
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "563510116182385" + "'", str7, "563510116182385");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "362797056" + "'", str13, "362797056");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\024\ufffd\ufffd/=" + "'", str15, "\002\024\ufffd\ufffd/=");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "383" + "'", str19, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "275" + "'", str21, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\n" + "'", str23, "\002\n");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd" + "'", str25, "\000\ufffd");
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
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
        java.lang.String str23 = rSA1.decrypt("662389087861228");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "116216060432222085782785667245" + "'", str9, "116216060432222085782785667245");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "363472319661432898076349946214" + "'", str11, "363472319661432898076349946214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "302612537610226037791754028265" + "'", str13, "302612537610226037791754028265");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "314" + "'", str17, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "82" + "'", str19, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "378" + "'", str21, "378");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("85602875538348");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "568460691" + "'", str11, "568460691");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4161782645" + "'", str13, "4161782645");
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str17 = rSA1.encrypt("73");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "210767493678113889298359134556" + "'", str9, "210767493678113889298359134556");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\177\ufffd\030\026\ufffd\u037f\ufffd\ufffd" + "'", str11, "\005\177\ufffd\030\026\ufffd\u037f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "346798489764716028357336181448" + "'", str15, "346798489764716028357336181448");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "563461804751933959651" + "'", str17, "563461804751933959651");
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
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
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "126722182813337" + "'", str7, "126722182813337");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "89205000311784" + "'", str9, "89205000311784");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "879086172597134318466238842228" + "'", str13, "879086172597134318466238842228");
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd#\037\ufffd\ufffd\ufffdy");
        java.lang.String str19 = rSA1.encrypt("4656124781");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "83" + "'", str5, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "421" + "'", str7, "421");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "354" + "'", str9, "354");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "20" + "'", str15, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "818" + "'", str17, "818");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "524" + "'", str19, "524");
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("992436543");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\001\f");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970786205" + "'", str3, "1970786205");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\030\ufffd" + "'", str5, "\ufffd\030\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6084392890" + "'", str7, "6084392890");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "276" + "'", str11, "276");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3357727758788");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\n\003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??;C?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47" + "'", str15, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "277" + "'", str17, "277");
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("659258052412804");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2372230878806246" + "'", str7, "2372230878806246");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "198" + "'", str15, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "34" + "'", str19, "34");
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
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
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd[");
        rSA1.generateKeys(100);
        java.lang.String str25 = rSA1.encrypt("\000\u020f\ufffd\ufffd\ufffd\ufffdi\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "182409984549333893909179036281" + "'", str9, "182409984549333893909179036281");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46263045908517794523836977580" + "'", str13, "46263045908517794523836977580");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\u05f8\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\004\u05f8\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "297634501887517122255395485543" + "'", str17, "297634501887517122255395485543");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1940438576237722648581928459" + "'", str21, "1940438576237722648581928459");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "278164966002948488527210224609" + "'", str25, "278164966002948488527210224609");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "583758511530987722703396595810" + "'", str9, "583758511530987722703396595810");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\r\ufffd\"\026\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\007\r\ufffd\"\026\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffddp\016\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffddp\016\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\034\ufffd\ufffd\ufffdab\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4991240667" + "'", str3, "4991240667");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1378274519" + "'", str7, "1378274519");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4146710288" + "'", str11, "4146710288");
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("\002\ufffd\ufffd\u0480\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("833");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1981355655168" + "'", str3, "1981355655168");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1690522737399" + "'", str5, "1690522737399");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "736573421395376318034000060372" + "'", str7, "736573421395376318034000060372");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("1313740657017087");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "567605011047463276871906630253" + "'", str9, "567605011047463276871906630253");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "374473890192820376753287210464" + "'", str11, "374473890192820376753287210464");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11670958776505501380101886116" + "'", str13, "11670958776505501380101886116");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\000\030\ufffd\ufffd\001" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\000\030\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("86");
        java.lang.String str9 = rSA1.decrypt("70912978627748895967159445373");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\b\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.String str13 = rSA1.decrypt("329114188050351");
        java.lang.String str15 = rSA1.encrypt("x\001\005\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("677");
        java.lang.String str19 = rSA1.decrypt("431163451786947770125759584376");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "206" + "'", str7, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "296" + "'", str11, "296");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "415" + "'", str15, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003-" + "'", str19, "\003-");
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680736352973124" + "'", str7, "680736352973124");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "56" + "'", str19, "56");
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("698830179104320016788462155306");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283807962165544760383035924102" + "'", str5, "283807962165544760383035924102");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\0020" + "'", str9, "\0020");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("1289219933400623");
        java.lang.String str9 = rSA1.encrypt("369208424210212041257818609339");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5948306441" + "'", str3, "5948306441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\017\026\ufffdd\003\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\017\026\ufffdd\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7825658523694401583564216418" + "'", str9, "7825658523694401583564216418");
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "909890367585518085885675891369" + "'", str9, "909890367585518085885675891369");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1273503343825946" + "'", str13, "1273503343825946");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\u0c43\ufffd\001" + "'", str15, "\002\u0c43\ufffd\001");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("547173891878268756953688155445");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "268" + "'", str9, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "283" + "'", str13, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "." + "'", str15, ".");
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\033\ufffd");
        java.lang.String str19 = rSA1.encrypt("105057866033790");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "531740157496114004519634519015" + "'", str9, "531740157496114004519634519015");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "257478796955983703865022000406" + "'", str11, "257478796955983703865022000406");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\u037b" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\u037b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005YH('r\022\ufffd\ufffd\ufffd\006)" + "'", str15, "\005YH('r\022\ufffd\ufffd\ufffd\006)");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "719198437055388934397798532691" + "'", str17, "719198437055388934397798532691");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "438531368575851183714990785882" + "'", str19, "438531368575851183714990785882");
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("457613644251791188504293612087");
        java.lang.String str9 = rSA1.encrypt("1286905197986247");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd2\\\ufffd" + "'", str7, "\000\ufffd2\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1657197964648709" + "'", str9, "1657197964648709");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("363904346928259064880157652878");
        java.lang.String str13 = rSA1.encrypt("2561181311805737");
        java.lang.String str15 = rSA1.decrypt("187689423199582795513620089196");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "111" + "'", str9, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "190" + "'", str11, "190");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5" + "'", str13, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("275121965435296894135626920661");
        java.lang.String str9 = rSA1.decrypt("52387484557955597654223704037");
        java.lang.String str11 = rSA1.decrypt("676377905888930513800855839459");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\f\016\ufffd" + "'", str7, "\f\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd." + "'", str9, "\001\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\021" + "'", str11, "\ufffd\021");
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
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
        java.lang.String str23 = rSA1.encrypt("2273826181119119");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str27 = rSA1.encrypt("1147243167");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "13633786205677294364106092152" + "'", str9, "13633786205677294364106092152");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "360619430279493370003434619313" + "'", str11, "360619430279493370003434619313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "508227657871168019463538611987" + "'", str13, "508227657871168019463538611987");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\013\002\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\013\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "548276245309578370358720731969" + "'", str17, "548276245309578370358720731969");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "242665678096216868081935260765" + "'", str19, "242665678096216868081935260765");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\u0159\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd" + "'", str21, "\006\u0159\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "604800949248269081889459921226" + "'", str23, "604800949248269081889459921226");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "177" + "'", str27, "177");
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("196567626694463745563940699682");
        java.lang.String str19 = rSA1.encrypt("5740624606");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "385" + "'", str9, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "79" + "'", str11, "79");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffdiz" + "'", str17, "\002\ufffdiz");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7330852597" + "'", str19, "7330852597");
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        java.lang.String str7 = rSA1.decrypt("1480332030624002");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007" + "'", str3, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\r" + "'", str7, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "204" + "'", str9, "204");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\005\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd/&A");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str5, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100001030" + "'", str7, "100001030");
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
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
        java.lang.String str21 = rSA1.encrypt("1208664863");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffdu\035\ufffd\f\ufffd\u06e1\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffdu\035\ufffd\f\ufffd\u06e1\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3223945135" + "'", str17, "3223945135");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "771158577" + "'", str19, "771158577");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5336776466" + "'", str21, "5336776466");
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
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
        java.lang.String str23 = rSA1.encrypt("378987016895391605098360238792");
        java.lang.String str25 = rSA1.encrypt("\b\ufffd\ufffd\ufffdc~\f\033\ufffdz");
        java.lang.String str27 = rSA1.encrypt("\003\ufffd\r\013B\031");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1146547516486505" + "'", str7, "1146547516486505");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\030\ufffd\ufffd" + "'", str15, "\002\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "348" + "'", str19, "348");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "130520332323421813652234759442" + "'", str23, "130520332323421813652234759442");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "397087569293020676334530240135" + "'", str25, "397087569293020676334530240135");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "199132106943857302160621177044" + "'", str27, "199132106943857302160621177044");
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.encrypt("\007rb\"\ufffd\ufffd\ufffdG\303k");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172" + "'", str5, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\u046a\u0499\ufffd\ufffd\ufffd\\\u072d\013" + "'", str9, "\002\u046a\u0499\ufffd\ufffd\ufffd\\\u072d\013");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292823215420100081489670706752" + "'", str11, "292823215420100081489670706752");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        java.lang.String str13 = rSA1.encrypt("1335293793");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1877605713074081" + "'", str7, "1877605713074081");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444" + "'", str11, "444");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("564955806244323");
        java.lang.String str19 = rSA1.decrypt("10067723570");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1566742370720944" + "'", str7, "1566742370720944");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "569594161586636260933467276567" + "'", str17, "569594161586636260933467276567");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\001\023\030\ufffd\ufffd\005" + "'", str19, "\003\ufffd\ufffd\ufffd\001\023\030\ufffd\ufffd\005");
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("451850837066694558586623217114");
        java.lang.String str15 = rSA1.decrypt("39686563120869282232251443678");
        java.lang.String str17 = rSA1.decrypt("636567772");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "513661194536906168269474056719" + "'", str9, "513661194536906168269474056719");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "513661194536906168269474056719" + "'", str11, "513661194536906168269474056719");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\023\031\ufffd\ufffd\ufffd\ufffd\u056d\021" + "'", str13, "\023\031\ufffd\ufffd\ufffd\ufffd\u056d\021");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3\035\ufffd" + "'", str15, "\n\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd3\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffdL;@;6" + "'", str17, "\002\ufffdL;@;6");
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("965471357883334");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1894320399172349" + "'", str13, "1894320399172349");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1737667301961432" + "'", str15, "1737667301961432");
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str5 = rSA1.encrypt("592470174344457370919392180301");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4374497655568333171462306324" + "'", str5, "4374497655568333171462306324");
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("\005g\006\ufffd\ufffda");
        java.lang.String str7 = rSA1.encrypt("\007\025\ufffd\ufffd\ufffd\u0591\ufffd\024\016\006");
        java.lang.String str9 = rSA1.decrypt("187573036817718054711842782896");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9895434256" + "'", str3, "9895434256");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11163178795" + "'", str5, "11163178795");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4933596643" + "'", str7, "4933596643");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd8" + "'", str9, "\002\ufffd\ufffd8");
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.encrypt("623433996390119");
        java.lang.String str11 = rSA1.decrypt("299711429567829177107340963225");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffd*\031\ufffd\u0605\ufffd)");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"l)\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7049907708" + "'", str3, "7049907708");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1202874349" + "'", str7, "1202874349");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4679893463" + "'", str9, "4679893463");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\022{nM" + "'", str11, "\001\022{nM");
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.encrypt("\002\007\ufffd\ufffd\ud7ea");
        java.lang.String str7 = rSA1.encrypt("7003277238");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2165650180" + "'", str3, "2165650180");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5262884156" + "'", str5, "5262884156");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2929967120" + "'", str7, "2929967120");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.encrypt("180760426369578260433288579634");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "230698514682382730964849839238" + "'", str3, "230698514682382730964849839238");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "614264394470183614208352181305" + "'", str5, "614264394470183614208352181305");
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("10777219335");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1436356862473596" + "'", str7, "1436356862473596");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "I" + "'", str11, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002t" + "'", str13, "\002t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026" + "'", str17, "\002\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026");
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("37822311364830212583");
        java.lang.String str19 = rSA1.encrypt("2858809728");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\f\033\b" + "'", str13, "\003\ufffd\ufffd\f\033\b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "749882214956691" + "'", str15, "749882214956691");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1320864153254819" + "'", str17, "1320864153254819");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1307212256346264" + "'", str19, "1307212256346264");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("470860891773042");
        java.lang.String str9 = rSA1.decrypt("10");
        java.lang.String str11 = rSA1.encrypt("456915798193527501688717312948");
        java.lang.String str13 = rSA1.decrypt("210");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\007" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\024\026\ufffd_" + "'", str9, "\004\ufffd\ufffd\024\026\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "919388364096406" + "'", str11, "919388364096406");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
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
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str23 = rSA1.encrypt("13060694016");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4" + "'", str15, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "214" + "'", str17, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "154270197827854583000558167929" + "'", str23, "154270197827854583000558167929");
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("88163053801867586941492124226");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "146" + "'", str11, "146");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\030" + "'", str13, "\001\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "19" + "'", str15, "19");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8785841459" + "'", str3, "8785841459");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "38832689997689600311994151766" + "'", str7, "38832689997689600311994151766");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        rSA1.generateKeys(10);
        java.lang.String str5 = rSA1.encrypt("951117453409481224492126840007");
        java.lang.String str7 = rSA1.encrypt("472670908299789064844892290961");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "162" + "'", str5, "162");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "544" + "'", str7, "544");
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("285");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "346860372980044531591852338079" + "'", str9, "346860372980044531591852338079");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffdyO:\t\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffdyO:\t\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "172537125657782759836306062923" + "'", str15, "172537125657782759836306062923");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("805201222");
        java.lang.String str17 = rSA1.encrypt("2185141852737318");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "483152577395321958962733933301" + "'", str9, "483152577395321958962733933301");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100814569747470501144672181545" + "'", str11, "100814569747470501144672181545");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\u0435\ufffd0\"U" + "'", str13, "\005\ufffd\ufffd\ufffd\u0435\ufffd0\"U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r\032V8" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r\032V8");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "57634623141826021498257620017" + "'", str17, "57634623141826021498257620017");
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("765314849130516");
        java.lang.String str19 = rSA1.encrypt("267577708632534762973916587911");
        java.lang.String str21 = rSA1.encrypt("631448170083983948379973877008");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffdb\f\ufffd\ufffd\b\ufffdfn" + "'", str11, "\001\ufffd\ufffdb\f\ufffd\ufffd\b\ufffdfn");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "112627940399189451736138466660" + "'", str13, "112627940399189451736138466660");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "M" + "'", str17, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "339" + "'", str19, "339");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "414" + "'", str21, "414");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("178013705648220");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\004\ufffd\ufffd\037\ufffd[\\\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?^:J\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006" + "'", str5, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "366" + "'", str7, "366");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172" + "'", str9, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "386703352267067026838120167854" + "'", str9, "386703352267067026838120167854");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "593879596516634329437963122612" + "'", str11, "593879596516634329437963122612");
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1282002825616878");
        java.lang.String str19 = rSA1.encrypt("423318336209840095007434506974");
        java.lang.String str21 = rSA1.encrypt("1374299430");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2095151977790749" + "'", str7, "2095151977790749");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1561910642" + "'", str11, "1561910642");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001-" + "'", str17, "\001-");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "532" + "'", str19, "532");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "375" + "'", str21, "375");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("\005g\006\ufffd\ufffda");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7832343085" + "'", str3, "7832343085");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2003547888" + "'", str5, "2003547888");
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("436888915925883347513701815904");
        java.lang.String str11 = rSA1.encrypt("\f\ufffdU\177\ufffd\002\ufffd\ufffd\177\ufffd~\b");
        java.lang.String str13 = rSA1.decrypt("200307374395630");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "425" + "'", str11, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\037" + "'", str13, "\001\037");
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str19 = rSA1.decrypt("74525034491265");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "417220078123903067385800904473" + "'", str9, "417220078123903067385800904473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "449187804591420859110775690979" + "'", str11, "449187804591420859110775690979");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\034\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd" + "'", str13, "\001\034\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "66916406647241919281909290663" + "'", str17, "66916406647241919281909290663");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\\\r\ufffd\013\u0686\031\n\ufffd\ufffdBe" + "'", str19, "\006\\\r\ufffd\013\u0686\031\n\ufffd\ufffdBe");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1028820771419557" + "'", str7, "1028820771419557");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\037" + "'", str9, "\004\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd@\025\ufffdE" + "'", str11, "\002\ufffd@\025\ufffdE");
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "291809724711228330260393337065" + "'", str9, "291809724711228330260393337065");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "291809724711228330260393337065" + "'", str11, "291809724711228330260393337065");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\036\034\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\036\034\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "429263500198072234330075442588" + "'", str15, "429263500198072234330075442588");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\u0120\ufffd\ufffd\026\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd\ufffd\u0120\ufffd\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "133223738535558461611251646095" + "'", str21, "133223738535558461611251646095");
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
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
        java.lang.String str23 = rSA1.decrypt("1776053301389705");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "462896001361710798018835770418" + "'", str9, "462896001361710798018835770418");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "357325410303534277783909452844" + "'", str11, "357325410303534277783909452844");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "458835736715991038441484216820" + "'", str13, "458835736715991038441484216820");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "181" + "'", str17, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "121" + "'", str21, "121");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "S" + "'", str23, "S");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48819226472016940291984004358" + "'", str9, "48819226472016940291984004358");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "48819226472016940291984004358" + "'", str11, "48819226472016940291984004358");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0072\033\006\ufffd\ufffd\264\ufffd\021" + "'", str13, "\0072\033\006\ufffd\ufffd\264\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003K\005\036\ufffd\ufffd\ufffd%\031\ufffd\022\ufffdp" + "'", str15, "\003K\005\036\ufffd\ufffd\ufffd%\031\ufffd\022\ufffdp");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "122543618162708852336644494678" + "'", str17, "122543618162708852336644494678");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001?" + "'", str21, "\001?");
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "353417143736394987633137015587" + "'", str9, "353417143736394987633137015587");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "423113511853481296811033215595" + "'", str11, "423113511853481296811033215595");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "365867281249921481723678565346" + "'", str13, "365867281249921481723678565346");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("887836866708316");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "477380651552744874346727220184" + "'", str9, "477380651552744874346727220184");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\u046a\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\u046a\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "797435202231795520060011957579" + "'", str13, "797435202231795520060011957579");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "697891148813505162164594887177" + "'", str17, "697891148813505162164594887177");
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
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
        java.lang.String str21 = rSA1.decrypt("180466605120703258324735765259");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "368128251633765812059124345744" + "'", str9, "368128251633765812059124345744");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\023Zm\026\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\023Zm\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1359587096924813" + "'", str19, "1359587096924813");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\022\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\003\022\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.decrypt("20232606451808104753107338397");
        java.lang.String str21 = rSA1.decrypt("1062642813");
        java.lang.String str23 = rSA1.encrypt("172");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2495096290167835" + "'", str7, "2495096290167835");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffdR" + "'", str15, "\000\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd;\032\n\ufffd\005\ufffd\ufffd'" + "'", str19, "\002\ufffd\ufffd;\032\n\ufffd\005\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffdnY\177\ufffd]xs" + "'", str21, "\002\ufffdnY\177\ufffd]xs");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "385256126161991887794370597766" + "'", str23, "385256126161991887794370597766");
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("779");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17" + "'", str3, "17");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\u0325\ufffd>" + "'", str7, "\000\u0325\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1975649317" + "'", str9, "1975649317");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd");
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("289013563216973");
        java.lang.String str19 = rSA1.encrypt("483731556944391");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2785812196392027" + "'", str7, "2785812196392027");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "430066647984303971545961672972" + "'", str13, "430066647984303971545961672972");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "456" + "'", str19, "456");
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\026");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "448563410643567342165711937659" + "'", str9, "448563410643567342165711937659");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffdb\021\ufffd\ufffd\ufffd\u017d\ufffd" + "'", str11, "\001\ufffdb\021\ufffd\ufffd\ufffd\u017d\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "194868030538567842466640914718" + "'", str13, "194868030538567842466640914718");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "697599807001230" + "'", str19, "697599807001230");
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.encrypt("\030");
        java.lang.String str19 = rSA1.decrypt("647272055175057");
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.encrypt("\t\ufffd\ufffd\ufffd\ufffd\\\ufffd\ufffd|ay");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "53563054263691361441637880103" + "'", str9, "53563054263691361441637880103");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd#" + "'", str11, "\006\ufffd\ufffd#");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "407549523342588649692295927158" + "'", str13, "407549523342588649692295927158");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "456284262347351474585856308191" + "'", str15, "456284262347351474585856308191");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7962624" + "'", str17, "7962624");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\026\ufffd\ufffd\003\ufffd\ufffd\u0292\ufffd" + "'", str19, "\026\ufffd\ufffd\003\ufffd\ufffd\u0292\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "372" + "'", str23, "372");
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "223521893536861557566192567266" + "'", str9, "223521893536861557566192567266");
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        java.lang.String str13 = rSA1.encrypt("1278119380042838");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3467059785" + "'", str3, "3467059785");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "235052012" + "'", str5, "235052012");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1474073572" + "'", str7, "1474073572");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2104484441" + "'", str9, "2104484441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6091751101" + "'", str11, "6091751101");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4449489423" + "'", str13, "4449489423");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.decrypt("815267620206901");
        java.lang.String str15 = rSA1.encrypt("\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830350163695896" + "'", str7, "830350163695896");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "N\\\ufffdO" + "'", str11, "N\\\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\027\037\ufffd\ufffd" + "'", str13, "\027\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "336468726" + "'", str15, "336468726");
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
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
        java.lang.String str21 = rSA1.decrypt("378902689213189788900953928362");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd'~3" + "'", str13, "\003\ufffd\ufffd'~3");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1271599078603988" + "'", str15, "1271599078603988");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\u074a\t\034\ufffd\ufffdl" + "'", str19, "\ufffd\ufffd\u074a\t\034\ufffd\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\035\ufffd.j\r\uf44c\ufffd<-" + "'", str21, "\035\ufffd.j\r\uf44c\ufffd<-");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
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
        java.lang.String str27 = rSA1.decrypt("113938893120168054832874970957");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.encrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "571520143491305078201222540893" + "'", str9, "571520143491305078201222540893");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "571520143491305078201222540893" + "'", str11, "571520143491305078201222540893");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\024\n\ufffd\ufffd\t" + "'", str13, "\005\ufffd\ufffd\ufffd\024\n\ufffd\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "677507086636286945420952672423" + "'", str15, "677507086636286945420952672423");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd:fi$j" + "'", str17, "\004\ufffd\ufffd:fi$j");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "302398805457478340655781889353" + "'", str21, "302398805457478340655781889353");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\ufffd\f\ufffd\036J\037\ufffd" + "'", str23, "\004\ufffd\ufffd\f\ufffd\036J\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\006\ufffdF\027\ufffd\ufffd\ufffd\ufffd\ufffdP" + "'", str25, "\006\ufffdF\027\ufffd\ufffd\ufffd\ufffd\ufffdP");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\004\ufffdB.\037\ufffd\ufffd\016\ufffd\031" + "'", str27, "\004\ufffdB.\037\ufffd\ufffd\016\ufffd\031");
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("6");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "66" + "'", str15, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "c" + "'", str17, "c");
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("766343301");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48618090292740751231072388204" + "'", str9, "48618090292740751231072388204");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "737306494476685741029168553254" + "'", str11, "737306494476685741029168553254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "619960413089740453412245431680" + "'", str13, "619960413089740453412245431680");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\017\u066c\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\017\u066c\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52364117313095591058842028438" + "'", str17, "52364117313095591058842028438");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.decrypt("192");
        java.lang.String str11 = rSA1.encrypt("2616349964823651");
        java.lang.String str13 = rSA1.decrypt("1925884171");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2469930880265135" + "'", str7, "2469930880265135");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffdt\f\t\ufffd\ufffd" + "'", str9, "\002\ufffdt\f\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2031070179547477" + "'", str11, "2031070179547477");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        java.lang.String str17 = rSA1.encrypt("538152933902267454381271395760");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "473745760376368" + "'", str7, "473745760376368");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "550978623647858198534114187397" + "'", str13, "550978623647858198534114187397");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\u0177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\u0177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "297039344380136018977409184396" + "'", str17, "297039344380136018977409184396");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "248772547062837369038621937047" + "'", str3, "248772547062837369038621937047");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "437791711392954790065865134563" + "'", str5, "437791711392954790065865134563");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2619934298" + "'", str9, "2619934298");
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
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
        java.lang.String str21 = rSA1.encrypt("\002=");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "103865430324731" + "'", str13, "103865430324731");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\004\ufffd\022\ufffd\ufffd" + "'", str15, "\005\004\ufffd\022\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "713703358466798241075716145584" + "'", str19, "713703358466798241075716145584");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20280672584928780597" + "'", str21, "20280672584928780597");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.decrypt("44");
        java.lang.String str17 = rSA1.encrypt("225606425835745481338696146574");
        java.lang.String str19 = rSA1.decrypt("239793023419894264569156500119");
        java.lang.String str21 = rSA1.decrypt("1354252647797405");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256171943953358130580763709931" + "'", str9, "256171943953358130580763709931");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd," + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "156900729759289570232864951559" + "'", str13, "156900729759289570232864951559");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001R\003\ufffdm#\007\ufffd\ufffd" + "'", str15, "\001R\003\ufffdm#\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "531335913648418081036903742195" + "'", str17, "531335913648418081036903742195");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffdK\016PX\003\ufffd_}\004\\4" + "'", str19, "\006\ufffdK\016PX\003\ufffd_}\004\\4");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffdq\031" + "'", str21, "\006\ufffd\ufffd\ufffd\ufffd\ufffdq\031");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("813206094276231374379760053937");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1723327195304280" + "'", str7, "1723327195304280");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("225089623685693560529903855490");
        java.lang.String str19 = rSA1.encrypt("\t\023\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "797429948039785" + "'", str7, "797429948039785");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "167" + "'", str15, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "174" + "'", str19, "174");
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("373");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\030" + "'", str7, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1627720161956303" + "'", str11, "1627720161956303");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1704936169429945" + "'", str13, "1704936169429945");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1208055365712351" + "'", str15, "1208055365712351");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "78" + "'", str19, "78");
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("945162613240688736200140383534");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3294228809" + "'", str7, "3294228809");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9625404511" + "'", str9, "9625404511");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffdq" + "'", str11, "\001\ufffd\ufffdq");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2814544897" + "'", str13, "2814544897");
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1415855512724229" + "'", str7, "1415855512724229");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "304697315105814" + "'", str13, "304697315105814");
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd-D");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1249738726447153" + "'", str7, "1249738726447153");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "344" + "'", str15, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "110" + "'", str17, "110");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\001\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3524990207147813788352052758" + "'", str17, "3524990207147813788352052758");
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.decrypt("192");
        java.lang.String str11 = rSA1.encrypt("2616349964823651");
        java.lang.String str13 = rSA1.decrypt("218338345005273735882612532307");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1799062717392499" + "'", str7, "1799062717392499");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\u041a\ufffd\ufffd" + "'", str9, "\004\u041a\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3320595807803673" + "'", str11, "3320595807803673");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\027\ufffd\ufffd&" + "'", str13, "\b\027\ufffd\ufffd&");
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        java.lang.String str15 = rSA1.encrypt("\036\002\ufffd*");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\u071c\ufffdd\003W\006");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1056648908222054" + "'", str7, "1056648908222054");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\021" + "'", str13, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "37" + "'", str15, "37");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "128" + "'", str17, "128");
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
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
        rSA1.generateKeys((int) ' ');
        java.lang.String str23 = rSA1.decrypt("150232037558206752475908650292");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "814094125070418670986473288568" + "'", str9, "814094125070418670986473288568");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\b\ufffd\ufffd\ufffd\026\000\ufffd" + "'", str13, "\t\ufffd\ufffd\b\ufffd\ufffd\ufffd\026\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "JR\033\ufffd\ufffd\ufffd\ufffdH\177b/" + "'", str17, "JR\033\ufffd\ufffd\ufffd\ufffdH\177b/");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\034\002\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\034\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\ufffd\u0496" + "'", str23, "\000\ufffd\ufffd\u0496");
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\017\ufffd\ufffd\u463d\ufffd\"");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "368" + "'", str13, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "36" + "'", str15, "36");
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("206");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "527" + "'", str9, "527");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007" + "'", str11, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "314" + "'", str13, "314");
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
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
        java.lang.String str27 = rSA1.decrypt("165718708457833953982271069591");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "912390151547668" + "'", str7, "912390151547668");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\006\036\030\ufffd" + "'", str9, "\004\ufffd\006\036\030\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1098037069090222" + "'", str13, "1098037069090222");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1999684255301471" + "'", str15, "1999684255301471");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "925401677555806" + "'", str17, "925401677555806");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "47658690348758518831096624509" + "'", str23, "47658690348758518831096624509");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "45960750843727524684539428011" + "'", str25, "45960750843727524684539428011");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd\ufffd\u02dd\ufffd\ufffdq\357\ufffd\ufffd" + "'", str27, "\000\ufffd\ufffd\u02dd\ufffd\ufffdq\357\ufffd\ufffd");
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "213573601458777185420718849613" + "'", str9, "213573601458777185420718849613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90309151133038618620834638109" + "'", str11, "90309151133038618620834638109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "69401113541639961165037532680" + "'", str13, "69401113541639961165037532680");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3" + "'", str17, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "249" + "'", str21, "249");
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "59449906137341566450805901677" + "'", str11, "59449906137341566450805901677");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6327754702" + "'", str15, "6327754702");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\004#" + "'", str17, "\000\ufffd\ufffd\004#");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9175069851" + "'", str19, "9175069851");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "14694935022" + "'", str21, "14694935022");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "600769614" + "'", str23, "600769614");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
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
        java.lang.String str27 = rSA1.decrypt("213434942759262");
        java.lang.String str29 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\025\ufffd\ufffd&\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004X\003\ufffd\ufffd" + "'", str13, "\004X\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "775335529650145" + "'", str15, "775335529650145");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "744601949545103" + "'", str17, "744601949545103");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "62" + "'", str21, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "313" + "'", str23, "313");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001+" + "'", str27, "\001+");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "432" + "'", str29, "432");
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        java.lang.String str13 = rSA1.decrypt("806729601483697513872336243167");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5383671334" + "'", str3, "5383671334");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1915437759" + "'", str5, "1915437759");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5106066907" + "'", str7, "5106066907");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "308407096" + "'", str9, "308407096");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1497994959" + "'", str11, "1497994959");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.encrypt("114499583605784415240056624559");
        java.lang.String str7 = rSA1.decrypt("14738995945");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "288630883" + "'", str3, "288630883");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2188494338" + "'", str5, "2188494338");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("120");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.decrypt("2296355595");
        java.lang.String str13 = rSA1.decrypt("12367265890354098907409803013");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0014" + "'", str7, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "478" + "'", str9, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001M" + "'", str11, "\001M");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.encrypt("\007Os\020\ufffd\ufffd\ufffd\ufffd\006\ufffd\u05b0");
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.encrypt("188443107996989061433519405603");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "76762286114000" + "'", str7, "76762286114000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "142707998638611" + "'", str13, "142707998638611");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "172308393194726" + "'", str15, "172308393194726");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "89881598360568" + "'", str17, "89881598360568");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2482299142076972" + "'", str21, "2482299142076972");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "300" + "'", str3, "300");
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("321842069114441562362352839359");
        java.lang.String str11 = rSA1.decrypt("1012529833103073");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\000\ufffd\tz\034\ufffd\ufffd^\fD");
        java.lang.String str15 = rSA1.encrypt("7402040342");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007" + "'", str3, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\033?\177\ufffd\f\024r@t\017\ufffd" + "'", str9, "\007\033?\177\ufffd\f\024r@t\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffdh\006\u050d\ufffd\ufffdWn\036N" + "'", str11, "\006\ufffd\ufffdh\006\u050d\ufffd\ufffdWn\036N");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "791802723220088351264918862099" + "'", str13, "791802723220088351264918862099");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "713826053578928464453501543831" + "'", str15, "713826053578928464453501543831");
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
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
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "338" + "'", str13, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "67937301135527783259767847391" + "'", str17, "67937301135527783259767847391");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "162099240417559334927605010124" + "'", str19, "162099240417559334927605010124");
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("844202742226834");
        java.lang.String str11 = rSA1.decrypt("140");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "j" + "'", str11, "j");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("25495718526387762381650918068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("J");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"J\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "536237266675669" + "'", str13, "536237266675669");
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
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
        java.lang.String str21 = rSA1.encrypt("426800244029649467582471543443");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "184940695758743994230493016469" + "'", str9, "184940695758743994230493016469");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "269760836847827477760183503507" + "'", str13, "269760836847827477760183503507");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\r\030\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\r\030\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "57500207141934407990447390376" + "'", str17, "57500207141934407990447390376");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "146146135972328941488091094801" + "'", str19, "146146135972328941488091094801");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "422638816652598215834896897933" + "'", str21, "422638816652598215834896897933");
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "121096570081936045481732648271" + "'", str9, "121096570081936045481732648271");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "354946863315729215149817034946" + "'", str11, "354946863315729215149817034946");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "75254429389543193097396973439" + "'", str13, "75254429389543193097396973439");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ud117\ufffd\ufffd\ufffd\ufffd\002" + "'", str15, "\003\ud117\ufffd\ufffd\ufffd\ufffd\002");
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.decrypt("914181283893724");
        java.lang.String str13 = rSA1.decrypt("406886696867962475347512808088");
        java.lang.String str15 = rSA1.encrypt("\005\002\ufffd\ufffd\r\177");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\031" + "'", str9, "\001\031");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "688" + "'", str15, "688");
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "478588048462124333110851335197" + "'", str3, "478588048462124333110851335197");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "426151063642922504514082439423" + "'", str5, "426151063642922504514082439423");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("5693705465");
        java.lang.String str13 = rSA1.encrypt("1200261676045258");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1515662586" + "'", str3, "1515662586");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1565497404" + "'", str5, "1565497404");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1223401352" + "'", str7, "1223401352");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6093751845" + "'", str9, "6093751845");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "867991412" + "'", str11, "867991412");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5537029378" + "'", str13, "5537029378");
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("1629935995");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd");
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
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
        java.lang.String str25 = rSA1.decrypt("40017971597836857344");
        java.lang.String str27 = rSA1.encrypt("385");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "702575789544852284165395719250" + "'", str9, "702575789544852284165395719250");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd]\r\030\ufffd\ufffd\ufffd\016\ufffd" + "'", str11, "\003\ufffd]\r\030\ufffd\ufffd\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "435252813357306856557268881895" + "'", str13, "435252813357306856557268881895");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd:\000\ufffd\ufffd\024\ufffd\ufffd" + "'", str15, "\b\ufffd:\000\ufffd\ufffd\024\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "530603168984369196374523158899" + "'", str17, "530603168984369196374523158899");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "18329937765857244121648175430" + "'", str21, "18329937765857244121648175430");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "47836072972752926879110600782" + "'", str23, "47836072972752926879110600782");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\n\ufffd\ufffd" + "'", str25, "\000\ufffd\ufffd\ufffd\ufffd\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "28125657614867513858795381494" + "'", str27, "28125657614867513858795381494");
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "260983639718898960421816647319" + "'", str9, "260983639718898960421816647319");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ZG].-\007\ufffd\ufffd\ufffd`VT" + "'", str11, "ZG].-\007\ufffd\ufffd\ufffd`VT");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\u07b3$\006\025\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\u07b3$\006\025\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("1150231073335486");
        java.lang.String str13 = rSA1.encrypt("171637622630321055768329963023");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\013\uf776\ufffd\ufffd\001" + "'", str11, "\007\ufffd\ufffd\ufffd\013\uf776\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "327081255756590341784548782979" + "'", str13, "327081255756590341784548782979");
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd,");
        java.lang.String str5 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "398022102968189564656800683671" + "'", str3, "398022102968189564656800683671");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "405665043071676518735776829367" + "'", str5, "405665043071676518735776829367");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "p" + "'", str13, "p");
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
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
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str23 = rSA1.encrypt("\001\030\ufffd\ufffd\ufffd\r\ufffd\ufffd@C");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "339874095234510387069316047761" + "'", str9, "339874095234510387069316047761");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "339874095234510387069316047761" + "'", str11, "339874095234510387069316047761");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "27520630651684202536179826886" + "'", str15, "27520630651684202536179826886");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\n\ufffd\ufffd\ufffd\003\ufffd\ufffd" + "'", str17, "\002\n\ufffd\ufffd\ufffd\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "524" + "'", str23, "524");
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
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
        java.lang.String str25 = rSA1.encrypt("449648688475566209406122538952");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "287726633686845" + "'", str7, "287726633686845");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\003\033\020\ufffdg" + "'", str15, "\004\003\033\020\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "383" + "'", str19, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "370680214789410674845838495495" + "'", str23, "370680214789410674845838495495");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "903014585507241124847158885149" + "'", str25, "903014585507241124847158885149");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("331999810103969");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "62172085657892" + "'", str7, "62172085657892");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\037\ufffd\ufffd\ufffd~" + "'", str9, "\037\ufffd\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1104358159956631" + "'", str11, "1104358159956631");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\003\ufffd" + "'", str13, "\003\ufffd\ufffd\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\030\ufffd\ufffd\f\ufffd" + "'", str15, "\001\ufffd\030\ufffd\ufffd\f\ufffd");
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "556" + "'", str3, "556");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4357146239" + "'", str7, "4357146239");
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\u0296\ufffd" + "'", str13, "\006\u0296\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2237694918285125" + "'", str15, "2237694918285125");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\031\ufffd\007\ufffd\u026c+\\\002" + "'", str19, "\031\ufffd\007\ufffd\u026c+\\\002");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "11803476363686177079367172429" + "'", str21, "11803476363686177079367172429");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd" + "'", str25, "\002\ufffd");
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("4849824141");
        java.lang.String str17 = rSA1.decrypt("184566071576414681123777014463");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035" + "'", str7, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1380379076440078" + "'", str11, "1380379076440078");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1612446606678133" + "'", str13, "1612446606678133");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd`<b\re" + "'", str15, "\003\ufffd`<b\re");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\004" + "'", str17, "\007\ufffd\ufffd\ufffd\ufffd\004");
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
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
        java.lang.String str23 = rSA1.decrypt("544886818579684");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "170920849926438717349080407539" + "'", str11, "170920849926438717349080407539");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "801124793268545138389691662663" + "'", str13, "801124793268545138389691662663");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("805201222");
        java.lang.String str17 = rSA1.encrypt("549808880");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "66810666961873633011556563575" + "'", str9, "66810666961873633011556563575");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "111323853183973183942684177324" + "'", str11, "111323853183973183942684177324");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffdc\t\rv\034\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffdc\t\rv\034\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd~}\031\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd~}\031\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "122578853991691897422760220579" + "'", str17, "122578853991691897422760220579");
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1023259624185544" + "'", str7, "1023259624185544");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "93465748" + "'", str17, "93465748");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4250461221" + "'", str19, "4250461221");
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.decrypt("553535743006153129855274469250");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffdPz");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "202" + "'", str5, "202");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\002\ufffd\ufffd\027\030P\001\t\027\ufffd" + "'", str11, "\004\002\ufffd\ufffd\027\030P\001\t\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "17559203222660173827075097617" + "'", str13, "17559203222660173827075097617");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
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
        java.lang.String str23 = rSA1.encrypt("378987016895391605098360238792");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdn.>");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?f??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "717637946124583" + "'", str7, "717637946124583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002,7\007\035\ufffd\r" + "'", str15, "\002,7\007\035\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "435" + "'", str19, "435");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "313545408588437222578303449700" + "'", str23, "313545408588437222578303449700");
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
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
        java.lang.String str23 = rSA1.encrypt("19245714296276432120080557989");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "958735860974289" + "'", str7, "958735860974289");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "175029501455497589668694730989" + "'", str13, "175029501455497589668694730989");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "90" + "'", str19, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "F" + "'", str21, "F");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "275" + "'", str23, "275");
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
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
        rSA1.generateKeys((int) ' ');
        java.lang.String str23 = rSA1.encrypt("171");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "161862623541296221257010235113" + "'", str9, "161862623541296221257010235113");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\177\ufffd\007\027\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\177\ufffd\007\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd7\"\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd7\"\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\016\ufffd\ufffd\ufffd\u01e4\ufffd\u0104\u0196" + "'", str17, "\016\ufffd\ufffd\ufffd\u01e4\ufffd\u0104\u0196");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\u0558\ufffd\ufffdg\t\ufffd\013)" + "'", str19, "\005\u0558\ufffd\ufffdg\t\ufffd\013)");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1665942066" + "'", str23, "1665942066");
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
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
        java.lang.String str21 = rSA1.decrypt("521");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "255619343313494746525746234177" + "'", str9, "255619343313494746525746234177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "377338509081156798540095277164" + "'", str11, "377338509081156798540095277164");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\022\007" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\022\007");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\006\t\034\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\006\t\034\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "113485420016984476270881553616" + "'", str17, "113485420016984476270881553616");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
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
        java.lang.String str23 = rSA1.encrypt("\007\000\ufffd\ufffd\022Dw");
        java.lang.String str25 = rSA1.encrypt("1381617869221290");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "489150265908731087552790560272" + "'", str9, "489150265908731087552790560272");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001w" + "'", str15, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "195" + "'", str17, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "131" + "'", str21, "131");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "188" + "'", str23, "188");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "377" + "'", str25, "377");
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("89040210064112265853492837860");
        java.lang.String str19 = rSA1.decrypt("250");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "570172832872144312853211875225" + "'", str11, "570172832872144312853211875225");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "162025018653376863163849868201" + "'", str13, "162025018653376863163849868201");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\002\ufffd\ufffd\ufffd\ufffd\u07a7\ufffd" + "'", str15, "\006\ufffd\002\ufffd\ufffd\ufffd\ufffd\u07a7\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\035\ufffd/v\030\ufffd\033\004\ufffd" + "'", str17, "\003\035\ufffd/v\030\ufffd\033\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^" + "'", str19, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^");
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\006\ufffd\n\034\ufffd \036>{=v");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?&p?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        java.lang.String str17 = rSA1.decrypt("286265936422108");
        java.lang.String str19 = rSA1.encrypt("3404694918");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "397629972603724" + "'", str7, "397629972603724");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\013\ufffd\ufffd" + "'", str15, "\002\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffdGOT" + "'", str17, "\000\ufffdGOT");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2541836643" + "'", str19, "2541836643");
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
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
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str23 = rSA1.encrypt("374511290657346799292396293134");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "82785112807933435808723086979" + "'", str9, "82785112807933435808723086979");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffde" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffde");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffdP\020\013\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffdP\020\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\035\033\ufffd\002$A8hB" + "'", str17, "\035\033\ufffd\002$A8hB");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "51928812303601147953574676482" + "'", str19, "51928812303601147953574676482");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "204955581044566039000769319351" + "'", str23, "204955581044566039000769319351");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "93689930617670474732770887416" + "'", str9, "93689930617670474732770887416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "792891351151714298606464025359" + "'", str11, "792891351151714298606464025359");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffdJH\"\036\t\ufffd\beL\"" + "'", str13, "\t\ufffd\ufffdJH\"\036\t\ufffd\beL\"");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\u0194\ufffdH\002\ufffd\u03e5\177\ufffd\ufffd" + "'", str15, "\001\u0194\ufffdH\002\ufffd\u03e5\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\u0170\ufffd\ufffd[xB\031e" + "'", str19, "\004\ufffd\ufffd\u0170\ufffd\ufffd[xB\031e");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "399553609288221226933395400761" + "'", str21, "399553609288221226933395400761");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("806729601483697513872336243167");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "576943578929631435681926812308" + "'", str9, "576943578929631435681926812308");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\004b\\\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\004b\\\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\006\ufffd3\024\ueb5d\005\ufffd\023\007\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?e\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(" + "'", str13, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "275" + "'", str15, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "66" + "'", str17, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "220363931" + "'", str21, "220363931");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\034\u0189\ufffd" + "'", str23, "\034\u0189\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd[z" + "'", str25, "\ufffd[z");
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "506336440202999" + "'", str7, "506336440202999");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\u0796\ufffd\ufffd" + "'", str9, "\t\ufffd\u0796\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2332001921745131" + "'", str13, "2332001921745131");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "140608" + "'", str15, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "591539994876585" + "'", str17, "591539994876585");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "173237408354651791711750696797" + "'", str21, "173237408354651791711750696797");
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("512");
        java.lang.String str17 = rSA1.encrypt("213512010366553469837091921761");
        java.lang.String str19 = rSA1.decrypt("1236411595187067");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2541955838956824" + "'", str7, "2541955838956824");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1044783489" + "'", str11, "1044783489");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "135" + "'", str15, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "280" + "'", str17, "280");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("447496868224857299807924535199");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1709415315" + "'", str9, "1709415315");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("89040210064112265853492837860");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4148953910715477541700073643" + "'", str9, "4148953910715477541700073643");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "273968638003675767200621906862" + "'", str11, "273968638003675767200621906862");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "258270674906854098697918739215" + "'", str13, "258270674906854098697918739215");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\016\ufffd\ufffd\ufffd,\023\ufffd" + "'", str15, "\002\016\ufffd\ufffd\ufffd,\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "309" + "'", str7, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1448393582918583602170724267" + "'", str13, "1448393582918583602170724267");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
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
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "343884490825227997194715438949" + "'", str9, "343884490825227997194715438949");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "384008970588847154834185041787" + "'", str11, "384008970588847154834185041787");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "348383380827429962020368401214" + "'", str13, "348383380827429962020368401214");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "314" + "'", str17, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!" + "'", str19, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "288" + "'", str21, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "491" + "'", str23, "491");
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.encrypt("9096294327276631334570801956");
        java.lang.String str15 = rSA1.encrypt("16666078853112263439064677627");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\026\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "194770295140026743868554686454" + "'", str9, "194770295140026743868554686454");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "395063902512630451521944214479" + "'", str11, "395063902512630451521944214479");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "744879747325963901645828507842" + "'", str13, "744879747325963901645828507842");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "643895399429890276439134023557" + "'", str15, "643895399429890276439134023557");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "274020675167057255559637538198" + "'", str17, "274020675167057255559637538198");
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66362109618141951760862607800" + "'", str11, "66362109618141951760862607800");
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\000\ufffd\ufffd)\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???)???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1529370416288458" + "'", str11, "1529370416288458");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1353687694628331" + "'", str13, "1353687694628331");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2209186180720404" + "'", str15, "2209186180720404");
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001C");
        java.lang.String str15 = rSA1.decrypt("10571238448");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\027\035\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1822763480926012" + "'", str7, "1822763480926012");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33698267" + "'", str13, "33698267");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2587811885873607" + "'", str17, "2587811885873607");
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
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
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "162305224200246107176972905538" + "'", str9, "162305224200246107176972905538");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "162305224200246107176972905538" + "'", str11, "162305224200246107176972905538");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "153911141172253828646627608047" + "'", str15, "153911141172253828646627608047");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\004\ufffd\ufffd\ufffd\ufffd_Tbt" + "'", str17, "\001\ufffd\004\ufffd\ufffd\ufffd\ufffd_Tbt");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "66186025822327147165132538165" + "'", str19, "66186025822327147165132538165");
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.String str13 = rSA1.decrypt("329114188050351");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("184566071576414681123777014463");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "482" + "'", str11, "482");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ")" + "'", str13, ")");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "402" + "'", str15, "402");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "151" + "'", str17, "151");
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "500587056622705" + "'", str7, "500587056622705");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "499" + "'", str19, "499");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "335" + "'", str21, "335");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "528" + "'", str23, "528");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
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
        java.lang.String str23 = rSA1.decrypt("21717639");
        java.lang.String str25 = rSA1.encrypt("579973074533677581562257425936");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1345604305167179" + "'", str7, "1345604305167179");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "569" + "'", str19, "569");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "344" + "'", str21, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "|" + "'", str23, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "373" + "'", str25, "373");
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "426552006825805612919336075675" + "'", str9, "426552006825805612919336075675");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\024\ufffd\ufffd\ufffdKc\030\ufffdo\027\ufffd\ufffd" + "'", str11, "\001\024\ufffd\ufffd\ufffdKc\030\ufffdo\027\ufffd\ufffd");
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
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
        rSA1.generateKeys((int) '#');
        java.lang.String str23 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "94828609232627747092691298126" + "'", str9, "94828609232627747092691298126");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "94828609232627747092691298126" + "'", str11, "94828609232627747092691298126");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\u044c" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\u044c");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "262441766918572065104389306507" + "'", str15, "262441766918572065104389306507");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd]" + "'", str17, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "425568999921489444885067209412" + "'", str19, "425568999921489444885067209412");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7517689432" + "'", str23, "7517689432");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1927427079013891");
        java.lang.String str15 = rSA1.encrypt("237121674757469760114553009048");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "678" + "'", str9, "678");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("88163053801867586941492124226");
        java.lang.String str17 = rSA1.decrypt("2886579111");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5" + "'", str11, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "43" + "'", str15, "43");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "j" + "'", str17, "j");
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.encrypt("623433996390119");
        java.lang.String str11 = rSA1.encrypt("666852044142564779122674445212");
        java.lang.String str13 = rSA1.encrypt("10134139172");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3168447576" + "'", str3, "3168447576");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6269267476" + "'", str5, "6269267476");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "208109955" + "'", str7, "208109955");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8814513364" + "'", str9, "8814513364");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2116157978" + "'", str11, "2116157978");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9584009876" + "'", str13, "9584009876");
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        java.lang.String str17 = rSA1.decrypt("155707469794806709519787576140");
        java.lang.String str19 = rSA1.decrypt("435291350894530");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "194383811584961123122034370495" + "'", str9, "194383811584961123122034370495");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "193636760706919046207503442913" + "'", str13, "193636760706919046207503442913");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "398494442029934572889403822049" + "'", str15, "398494442029934572889403822049");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\006\ufffd\ufffd\ufffd\023\ufffd\ufffd\u0741E" + "'", str17, "\007\006\ufffd\ufffd\ufffd\023\ufffd\ufffd\u0741E");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\017\036\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\002\017\036\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.decrypt("164");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffdt\f\t\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??t????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77232228369626403489141551331" + "'", str9, "77232228369626403489141551331");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "464967510005888510478293340052" + "'", str11, "464967510005888510478293340052");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "217067585804867333199358050581" + "'", str13, "217067585804867333199358050581");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007'\022\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007'\022\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
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
        java.lang.String str23 = rSA1.decrypt("1934199967458848");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "783026877079829" + "'", str7, "783026877079829");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279936" + "'", str13, "279936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd" + "'", str15, "\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "405" + "'", str19, "405");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "206" + "'", str21, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("801861369307843514749599246127");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "444801247374532" + "'", str7, "444801247374532");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("10019204889");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\032\"\ufffd" + "'", str3, "\006\032\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "759998810616189" + "'", str5, "759998810616189");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2023812775200371" + "'", str7, "2023812775200371");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "53762908868611" + "'", str9, "53762908868611");
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("406098553933561769371894564130");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "145225274522027775294565363634" + "'", str9, "145225274522027775294565363634");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "271802656802851852497525374163" + "'", str11, "271802656802851852497525374163");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "296782650655451690046051738658" + "'", str13, "296782650655451690046051738658");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6140725689040248982104958683" + "'", str19, "6140725689040248982104958683");
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
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
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1681454967755441" + "'", str7, "1681454967755441");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "872236847332438" + "'", str13, "872236847332438");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd^x" + "'", str15, "\006\ufffd\ufffd\ufffd^x");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\005\\\ufffd\ufffdg\033" + "'", str17, "\007\005\\\ufffd\ufffdg\033");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "989922170321637" + "'", str19, "989922170321637");
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.encrypt("128048112137671");
        rSA1.generateKeys(10);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "63" + "'", str13, "63");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3" + "'", str15, "3");
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
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
        java.lang.String str21 = rSA1.encrypt("147726071543457903601747984042");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "915028910773215" + "'", str11, "915028910773215");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "48193138747329" + "'", str13, "48193138747329");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "82643604988816750241505742043" + "'", str19, "82643604988816750241505742043");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "379085355557811160267656849612" + "'", str21, "379085355557811160267656849612");
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("7909395280350889787071946765");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37805074531238270313" + "'", str11, "37805074531238270313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd?\016\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd?\016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "267" + "'", str17, "267");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "473203277083315474721116290307" + "'", str9, "473203277083315474721116290307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "296431339111212330829128701836" + "'", str11, "296431339111212330829128701836");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "197796425916984820065997015234" + "'", str13, "197796425916984820065997015234");
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.encrypt("237");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "495970232696773" + "'", str7, "495970232696773");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "420" + "'", str13, "420");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "253" + "'", str15, "253");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        java.lang.String str11 = rSA1.encrypt("269763592171188072874299671367");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "208828578119361" + "'", str7, "208828578119361");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "270136294424267" + "'", str9, "270136294424267");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "535568779286908" + "'", str11, "535568779286908");
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
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
        java.lang.String str29 = rSA1.decrypt("6416682944601195542898302958");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.encrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "227" + "'", str15, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "361" + "'", str17, "361");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1784563775" + "'", str21, "1784563775");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\t" + "'", str23, "\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffd\f\ufffd" + "'", str25, "\000\ufffd\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ufffd/\n" + "'", str27, "\ufffd/\n");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str29, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "891081747930872947081085402720" + "'", str9, "891081747930872947081085402720");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "967721833852568345078745602320" + "'", str13, "967721833852568345078745602320");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\f\ufffd\ufffd\024\ufffd\ufffd^3" + "'", str15, "\f\ufffd\ufffd\024\ufffd\ufffd^3");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "96549157373046875" + "'", str17, "96549157373046875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "917740177690131034938341031039" + "'", str19, "917740177690131034938341031039");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
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
        java.lang.String str25 = rSA1.decrypt("6871216262");
        java.lang.String str27 = rSA1.encrypt("5108815711");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = rSA1.decrypt("\000\ufffd\000\ufffd\f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "76005601033319" + "'", str7, "76005601033319");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "444257917171185" + "'", str13, "444257917171185");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8_p\025\ufffd" + "'", str15, "8_p\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd" + "'", str19, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "197292272" + "'", str21, "197292272");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffdRe" + "'", str23, "\006\ufffdRe");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd" + "'", str25, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "34577304" + "'", str27, "34577304");
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("1007500148816926");
        java.lang.String str13 = rSA1.decrypt("2810229674496929");
        java.lang.String str15 = rSA1.encrypt("407");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd\026\ufffd\ufffd'\024\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "527197445477499412019784173681" + "'", str9, "527197445477499412019784173681");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\177\ufffd\ufffd<F" + "'", str11, "\004\ufffd\ufffd\ufffd\177\ufffd\ufffd<F");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\u0353\ufffd\ufffd\ufffd\ufffd/o" + "'", str13, "\003\ufffd\u0353\ufffd\ufffd\ufffd\ufffd/o");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "121805880843224405023012115836" + "'", str15, "121805880843224405023012115836");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "395068531814029973200655414290" + "'", str17, "395068531814029973200655414290");
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "764290672892221" + "'", str7, "764290672892221");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1358217873659077" + "'", str9, "1358217873659077");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "233583032075632" + "'", str11, "233583032075632");
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
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
        java.lang.String str23 = rSA1.encrypt("378987016895391605098360238792");
        java.lang.String str25 = rSA1.encrypt("\b\ufffd\ufffd\ufffdc~\f\033\ufffdz");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "630097269908322" + "'", str7, "630097269908322");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "362797056" + "'", str13, "362797056");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\020\u056b\023W" + "'", str15, "\005\ufffd\020\u056b\023W");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44" + "'", str19, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "213193913142301859406801688858" + "'", str23, "213193913142301859406801688858");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "675947757234491083492573905921" + "'", str25, "675947757234491083492573905921");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
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
        java.lang.String str25 = rSA1.decrypt("400359336590835");
        java.lang.String str27 = rSA1.decrypt("207989269123701");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "443101457273668495079614946403" + "'", str9, "443101457273668495079614946403");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffdU\003<" + "'", str11, "\006\ufffd\ufffd\ufffdU\003<");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "443635939850902448313902589836" + "'", str13, "443635939850902448313902589836");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\u032e\ufffd\ufffd\020Z\346\n" + "'", str15, "\ufffd\u032e\ufffd\ufffd\020Z\346\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "498334700187433530698009693917" + "'", str17, "498334700187433530698009693917");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "15221339267179043751711077143" + "'", str21, "15221339267179043751711077143");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffdn7" + "'", str25, "\000\ufffd\ufffdn7");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str27, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("828944592250846");
        java.lang.String str11 = rSA1.decrypt("60732077159364971136922584801");
        java.lang.String str13 = rSA1.decrypt("1499460590289687");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "F" + "'", str9, "F");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001!" + "'", str13, "\001!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("410");
        java.lang.String str13 = rSA1.decrypt("99");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "197032818865748971752537804591" + "'", str9, "197032818865748971752537804591");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "58882100503947076028926597889" + "'", str11, "58882100503947076028926597889");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\023\ufffd\005\ufffd\ufffdm\035\ufffd\035G" + "'", str13, "\003\ufffd\023\ufffd\005\ufffd\ufffdm\035\ufffd\035G");
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("507735161454502401211578520289");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\025\ufffd\ufffd\003\ufffd" + "'", str17, "\001\ufffd\025\ufffd\ufffd\003\ufffd");
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
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
        java.lang.String str21 = rSA1.encrypt("957309924125571");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1880512248961938" + "'", str7, "1880512248961938");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "650" + "'", str21, "650");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("1743865898247515");
        java.lang.String str7 = rSA1.encrypt("34836708977847401567044181990");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8415833387" + "'", str3, "8415833387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7440295611" + "'", str7, "7440295611");
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("22369983321637");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "300" + "'", str11, "300");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "201071686250725" + "'", str15, "201071686250725");
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2208835900409977" + "'", str7, "2208835900409977");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "384235280457023072414386654526" + "'", str3, "384235280457023072414386654526");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "82873497006865111908474749366" + "'", str5, "82873497006865111908474749366");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        java.lang.String str19 = rSA1.decrypt("435901327385001");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1436234083936096" + "'", str15, "1436234083936096");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2110960784617989" + "'", str17, "2110960784617989");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\026\ufffd~" + "'", str19, "\003\ufffd\026\ufffd~");
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
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
        java.lang.String str25 = rSA1.encrypt("171018355731941072357484678712");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd\033\ufffd" + "'", str11, "\003\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "107829248029460355515723430946" + "'", str13, "107829248029460355515723430946");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "156" + "'", str19, "156");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "112" + "'", str21, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "5022562918" + "'", str25, "5022562918");
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "265417143498761" + "'", str7, "265417143498761");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\u068b\ufffd " + "'", str9, "\000\ufffd\u068b\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1233833027972424" + "'", str13, "1233833027972424");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "958267802168914" + "'", str15, "958267802168914");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffdi+ \032" + "'", str17, "\b\ufffd\ufffdi+ \032");
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u0266\ufffd");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "558192381477391639677486359998" + "'", str13, "558192381477391639677486359998");
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.decrypt("507096068695747");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "375241839980281" + "'", str7, "375241839980281");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\016\030\033" + "'", str9, "\007\ufffd\016\030\033");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\006\ufffd\u0728" + "'", str11, "\003\ufffd\ufffd\006\ufffd\u0728");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\0369\016" + "'", str13, "\003\ufffd\0369\016");
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\002\ufffd\u0506\ufffd\ufffd\ufffd\u01f9\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1919032239369623" + "'", str7, "1919032239369623");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1812769045" + "'", str13, "1812769045");
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str9 = rSA1.decrypt("2602093156");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\ufffd+");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "." + "'", str7, ".");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007" + "'", str9, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5" + "'", str11, "5");
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
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
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "159128977973235417999524719804" + "'", str9, "159128977973235417999524719804");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "159128977973235417999524719804" + "'", str11, "159128977973235417999524719804");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\\\ufffd\004\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\\\ufffd\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "336667643398541303062857616618" + "'", str15, "336667643398541303062857616618");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\013\u02f6\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd" + "'", str17, "\001\013\u02f6\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd");
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
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
        java.lang.String str29 = rSA1.encrypt("w<\026\ufffdA\035\ufffd\007\ufffd\ufffd");
        java.lang.String str31 = rSA1.encrypt("\002\037\ufffd\ufffdm");
        java.lang.Class<?> wildcardClass32 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "280985046157207" + "'", str7, "280985046157207");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "579125995214946337467393828941" + "'", str13, "579125995214946337467393828941");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "51905272983644213223757246672" + "'", str23, "51905272983644213223757246672");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "38503872245956370493316053690" + "'", str27, "38503872245956370493316053690");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4475493219804211672777599835" + "'", str29, "4475493219804211672777599835");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "49213992669767286727891884854" + "'", str31, "49213992669767286727891884854");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("252606222438286852223175939175");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\r" + "'", str7, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "332" + "'", str9, "332");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\u0692\ufffd,");
        java.lang.String str17 = rSA1.encrypt("654");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1491790636017641" + "'", str7, "1491790636017641");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\u0625\ufffd]6" + "'", str9, "\007\u0625\ufffd]6");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3070482109823322" + "'", str13, "3070482109823322");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "633213639188955" + "'", str15, "633213639188955");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1568456075045869" + "'", str17, "1568456075045869");
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
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
        java.lang.String str21 = rSA1.encrypt("855597540674158");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "481" + "'", str15, "481");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "68" + "'", str21, "68");
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.decrypt("925568231498920647360821327791");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\001\017\ufffd\ufffd~\026\ufffd\035T");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8781167099" + "'", str3, "8781167099");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\f\ufffd\ufffd\ufffd" + "'", str5, "\002\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\u9cf1" + "'", str7, "\002\u9cf1");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "569827407" + "'", str11, "569827407");
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("430");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "238" + "'", str7, "238");
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
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
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "329292525680821805314671604150" + "'", str9, "329292525680821805314671604150");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffdV\021\ufffd\ufffd\ufffd\u03ca\ufffd\002b\"" + "'", str11, "\006\ufffdV\021\ufffd\ufffd\ufffd\u03ca\ufffd\002b\"");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "687952512698259937203346383102" + "'", str13, "687952512698259937203346383102");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\026\ufffd\ufffd\u0136" + "'", str15, "\007\ufffd\ufffd\026\ufffd\ufffd\u0136");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64339296875" + "'", str17, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "178924111344434217309260750176" + "'", str19, "178924111344434217309260750176");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "155292810960292395813042635620" + "'", str21, "155292810960292395813042635620");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003qr\026\ufffd\ufffd\u05ce\u04bb\ufffd" + "'", str23, "\003qr\026\ufffd\ufffd\u05ce\u04bb\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "271558810777652759244287256454" + "'", str25, "271558810777652759244287256454");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\004\ufffd\ufffd\ufffd\033\ufffd\ufffdZ\007\ufffd\ufffd" + "'", str27, "\004\ufffd\ufffd\ufffd\033\ufffd\ufffdZ\007\ufffd\ufffd");
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        java.lang.String str15 = rSA1.encrypt("2871432409146320");
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffd\ufffdd\003\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "855070607" + "'", str7, "855070607");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4969952576" + "'", str9, "4969952576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "qHt\024" + "'", str11, "qHt\024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1708480384" + "'", str13, "1708480384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5704589994" + "'", str15, "5704589994");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8563830500" + "'", str17, "8563830500");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4664067127" + "'", str19, "4664067127");
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.decrypt("611943475129151");
        java.lang.String str15 = rSA1.decrypt("1053810964353719");
        java.lang.String str17 = rSA1.decrypt("14663681160334126644241449642");
        java.lang.String str19 = rSA1.decrypt("1993711826267244");
        java.lang.String str21 = rSA1.encrypt("\b\024\ufffdc\027\ufffd\ufffd\ufffd\ucf85");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\r" + "'", str7, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "120" + "'", str9, "120");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002>" + "'", str11, "\002>");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "'" + "'", str15, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002." + "'", str17, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "168" + "'", str21, "168");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("568759196801179");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1284671859847213" + "'", str7, "1284671859847213");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
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
        java.lang.String str21 = rSA1.encrypt("4367302672");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "419" + "'", str15, "419");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1505135365" + "'", str21, "1505135365");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("|\035\u06a8");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "278" + "'", str7, "278");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "204" + "'", str11, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\177" + "'", str13, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24083412372214548364056712132" + "'", str17, "24083412372214548364056712132");
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2064440430059638");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "470041524750692283840572898542" + "'", str9, "470041524750692283840572898542");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\002Qi\002\ufffd\037ihf\002\ufffd" + "'", str11, "\005\002Qi\002\ufffd\037ihf\002\ufffd");
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
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
        java.lang.String str21 = rSA1.encrypt("274650662155235");
        java.lang.String str23 = rSA1.decrypt("34836708977847401567044181990");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "429504978740380649509451757738" + "'", str9, "429504978740380649509451757738");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd<\013\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd<\013\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "416551398786424313674852088451" + "'", str13, "416551398786424313674852088451");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\003\ufffd\ufffd\030\006\ufffd\ufffd" + "'", str15, "\004\ufffd\003\ufffd\ufffd\030\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "21486707058988474466997606448" + "'", str19, "21486707058988474466997606448");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "246130941779983459192345185855" + "'", str21, "246130941779983459192345185855");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd'\003\ufffd\ufffd" + "'", str23, "\003\ufffd\ufffd\ufffd\ufffd'\003\ufffd\ufffd");
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("100935160444972936488645408652");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\017\u508e\ufffd\ufffd\ufffd" + "'", str7, "\005\ufffd\017\u508e\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
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
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1300542335554529" + "'", str7, "1300542335554529");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "383160615002353" + "'", str13, "383160615002353");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "250757193943064" + "'", str15, "250757193943064");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdH" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "241566095098300" + "'", str19, "241566095098300");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("806729601483697513872336243167");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("627614365639846832578736688096");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1070569061100772736953819649775" + "'", str9, "1070569061100772736953819649775");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\ufffd\u04c6\ufffd\ufffdK*" + "'", str11, "\r\ufffd\u04c6\ufffd\ufffdK*");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "149531573" + "'", str17, "149531573");
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
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
        java.lang.String str27 = rSA1.encrypt("\004\ufffd\002\016\036\ufffd");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "426637768575366694090170118791" + "'", str9, "426637768575366694090170118791");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd5\177\ufffd\ufffd\ufffd\034l" + "'", str11, "\001\ufffd\ufffd5\177\ufffd\ufffd\ufffd\034l");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "666966518977650071608901337319" + "'", str13, "666966518977650071608901337319");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\n6\002" + "'", str15, "\006\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\n6\002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "342663583910629885205392460612" + "'", str19, "342663583910629885205392460612");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "312176189768507183395485726443" + "'", str21, "312176189768507183395485726443");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\uae78\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\b\uae78\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "84918920868108462966208371408" + "'", str25, "84918920868108462966208371408");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "358964402316087018829299092254" + "'", str27, "358964402316087018829299092254");
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "732733089258840" + "'", str7, "732733089258840");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\017\033\ufffd\ufffd\ufffdp" + "'", str11, "\003\017\033\ufffd\ufffd\ufffdp");
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\020\ufffd\ufffdt$5O\026\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1990854637524947" + "'", str7, "1990854637524947");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "597548919704279549637471082479" + "'", str13, "597548919704279549637471082479");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("7929141622");
        java.lang.String str15 = rSA1.encrypt("91328519925337797047949064504");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\002\ufffd\ufffd\u036f\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "628" + "'", str7, "628");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "458" + "'", str11, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "497" + "'", str13, "497");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "183" + "'", str15, "183");
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("1534903236613159");
        java.lang.String str7 = rSA1.decrypt("977465858354764");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "428216608317640865105374479221" + "'", str3, "428216608317640865105374479221");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\ufffd\ufffd\037\ufffd\022\000\ufffd\ufffdJ" + "'", str5, "\003\ufffd\ufffd\037\ufffd\022\000\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\t\ufffd\ufffd\u0628\u06b4\ufffd" + "'", str7, "\001\ufffd\t\ufffd\ufffd\u0628\u06b4\ufffd");
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7919323478" + "'", str3, "7919323478");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7011235251" + "'", str5, "7011235251");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "95795938" + "'", str7, "95795938");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd2" + "'", str9, "\001\ufffd\ufffd2");
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
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
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str25 = rSA1.decrypt("2106434676194545");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "766651014128936" + "'", str7, "766651014128936");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "569" + "'", str19, "569");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "369" + "'", str21, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "]" + "'", str25, "]");
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
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
        java.lang.String str21 = rSA1.encrypt("5001765270");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "319905546017361532465772896249" + "'", str9, "319905546017361532465772896249");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\r\ufffd\ufffdj" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\r\ufffd\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "214026596039482568045867955675" + "'", str13, "214026596039482568045867955675");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\ufffdsk\013\ufffd\ufffd\f\t\ufffd\ufffd" + "'", str15, "\n\ufffdsk\013\ufffd\ufffd\f\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "377347430183665008070817819487" + "'", str17, "377347430183665008070817819487");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "183023731333692156996014369254" + "'", str19, "183023731333692156996014369254");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "496424866826556924484211973868" + "'", str21, "496424866826556924484211973868");
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("210378250090253374708038199698");
        java.lang.String str11 = rSA1.decrypt("227");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\005\ufffd\003\ufffd\u02c8\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("908476099698015");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\007\350g\177\ufffd" + "'", str3, "\006\007\350g\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "186246864" + "'", str7, "186246864");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1664393851" + "'", str9, "1664393851");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd:" + "'", str11, "\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "61785616530586110720607482006" + "'", str15, "61785616530586110720607482006");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd aj\177\ufffd" + "'", str17, "\002\ufffd\ufffd aj\177\ufffd");
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("1595326767324940");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336363028177008" + "'", str7, "336363028177008");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1267120350293628" + "'", str9, "1267120350293628");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2463027301707296" + "'", str11, "2463027301707296");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "325" + "'", str15, "325");
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1111166250865836");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\u0183\ufffdsLs\001\ufffdJ");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "265" + "'", str9, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "103" + "'", str11, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
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
        java.lang.String str21 = rSA1.decrypt("378902689213189788900953928362");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\001\ufffdan\037\ufffd\ufffd\026K");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd" + "'", str13, "\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3250557369465016" + "'", str15, "3250557369465016");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u075c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\u075c\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\027\ufffd\ufffd\ufffd6T\r" + "'", str21, "\027\ufffd\ufffd\ufffd6T\r");
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
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
        java.lang.String str25 = rSA1.decrypt("195882734018189227456597164682");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "86021064872131" + "'", str7, "86021064872131");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1564757644167536" + "'", str13, "1564757644167536");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd*i%J" + "'", str15, "\001\ufffd*i%J");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffdF\007\001Z" + "'", str17, "\t\ufffdF\007\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "26561249809332" + "'", str19, "26561249809332");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "96448412411913004706203811928" + "'", str23, "96448412411913004706203811928");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\002\ufffd\ufffd\ufffd\ufffd7R{" + "'", str25, "\002\002\ufffd\ufffd\ufffd\ufffd7R{");
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.encrypt("6318253741");
        java.lang.String str19 = rSA1.decrypt("844129610510235");
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\032\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.encrypt("\006\ufffd\ufffd\022\177\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2426976131773207" + "'", str7, "2426976131773207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\024\ufffd\ufffd\037" + "'", str9, "\t\024\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2610610437692259" + "'", str13, "2610610437692259");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2525330550841338" + "'", str15, "2525330550841338");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1175047512570859" + "'", str17, "1175047512570859");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\032\ufffd\035\ufffd" + "'", str19, "\001\032\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "211845162740245" + "'", str21, "211845162740245");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "288658898917593" + "'", str23, "288658898917593");
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("680112922457928");
        java.lang.String str19 = rSA1.decrypt("74709597602157338792090796174");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198" + "'", str13, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\031\u0768" + "'", str17, "\ufffd\ufffd\031\u0768");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/7_\000\027\ufffd\024\ufffd" + "'", str19, "/7_\000\027\ufffd\024\ufffd");
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "33" + "'", str11, "33");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4278190595175132951884818273" + "'", str17, "4278190595175132951884818273");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "22286937530586343221376149462" + "'", str19, "22286937530586343221376149462");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7485620689" + "'", str3, "7485620689");
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        java.lang.String str17 = rSA1.decrypt("397646092825710359010702002350");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "473102285581570" + "'", str7, "473102285581570");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1070333555039686339852602247817" + "'", str13, "1070333555039686339852602247817");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05e6" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u05e6");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0075\024\ufffd\ufffd\ufffd\u05ddE" + "'", str17, "\0075\024\ufffd\ufffd\ufffd\u05ddE");
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("6539556310");
        java.lang.String str5 = rSA1.decrypt("882662503");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\177" + "'", str5, "\002\177");
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("55");
        java.lang.String str19 = rSA1.encrypt("1603037267069329");
        java.lang.String str21 = rSA1.encrypt("1104207101772250964281680622285");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "765684426213271" + "'", str7, "765684426213271");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1535628220997201" + "'", str13, "1535628220997201");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "158" + "'", str17, "158");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "19" + "'", str19, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "189" + "'", str21, "189");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
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
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "303695654166848" + "'", str7, "303695654166848");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "315" + "'", str19, "315");
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
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
        java.lang.String str21 = rSA1.encrypt("2354660541645508");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "178433326348852" + "'", str11, "178433326348852");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2256712206889364" + "'", str13, "2256712206889364");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1452990390565534" + "'", str15, "1452990390565534");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "112714863293601120446011342764" + "'", str19, "112714863293601120446011342764");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "577410713348878630620087964668" + "'", str21, "577410713348878630620087964668");
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
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
        java.lang.String str27 = rSA1.encrypt("2097762746171364");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "298767773346821955638392137586" + "'", str17, "298767773346821955638392137586");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "91004994531746538786089127685" + "'", str19, "91004994531746538786089127685");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "892" + "'", str25, "892");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "52" + "'", str27, "52");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffdj\004\ufffd" + "'", str13, "\007\ufffd\ufffdj\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "751692083291854" + "'", str15, "751692083291854");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1160904447690012" + "'", str17, "1160904447690012");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "478257607706295" + "'", str19, "478257607706295");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "553" + "'", str23, "553");
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("1131007583696693");
        java.lang.String str19 = rSA1.encrypt("327");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1651069419338684" + "'", str13, "1651069419338684");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1431616717096366" + "'", str15, "1431616717096366");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1577118558624859" + "'", str17, "1577118558624859");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2661902890728510" + "'", str19, "2661902890728510");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "391280824241612576313188672908" + "'", str9, "391280824241612576313188672908");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\034\ufffd6\006\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\034\ufffd6\006\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "858932200340694936194298185104" + "'", str13, "858932200340694936194298185104");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64339296875" + "'", str17, "64339296875");
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("635442583753138455625950920532");
        java.lang.String str7 = rSA1.encrypt("\003\016D?\n\ufffd\005\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004$TP\006\ufffd\ufffd\ufffd\u0540\ufffd" + "'", str3, "\004$TP\006\ufffd\ufffd\ufffd\u0540\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "475080540283236834268311833119" + "'", str5, "475080540283236834268311833119");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "474135658378387650158278459701" + "'", str7, "474135658378387650158278459701");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "117" + "'", str11, "117");
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "369" + "'", str13, "369");
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
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
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "359701287230690" + "'", str7, "359701287230690");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "371" + "'", str19, "371");
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("992436543");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("2195592740645340");
        java.lang.String str13 = rSA1.encrypt("376853852534580107150879430176");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206087893" + "'", str3, "206087893");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd" + "'", str5, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1335048508" + "'", str7, "1335048508");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "47" + "'", str11, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "288" + "'", str13, "288");
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\t\036" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\t\036");
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\001X");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001v");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?v\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "257944239859370" + "'", str5, "257944239859370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1759612515536979" + "'", str7, "1759612515536979");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1310634654616194" + "'", str9, "1310634654616194");
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("\001\002");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "407244424974451019757579958737" + "'", str3, "407244424974451019757579958737");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76091814718849152" + "'", str5, "76091814718849152");
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("210378250090253374708038199698");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001\ufffd\n\ufffd\ufffdd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?g??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\030\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "961713491" + "'", str7, "961713491");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "409820906" + "'", str9, "409820906");
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "154" + "'", str13, "154");
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("570226650639502135961025038359");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "86" + "'", str11, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\025" + "'", str13, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1\034\r\ufffd\ufffd\ufffd\ufffd\ufffd?[" + "'", str17, "1\034\r\ufffd\ufffd\ufffd\ufffd\ufffd?[");
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "664100243811993" + "'", str7, "664100243811993");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\t\bi" + "'", str9, "\001\ufffd\ufffd\t\bi");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "278368470312403" + "'", str11, "278368470312403");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1423857087426141" + "'", str13, "1423857087426141");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        java.lang.String str17 = rSA1.encrypt("594");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1359828265293735" + "'", str13, "1359828265293735");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\025\035\ufffd\ufffd" + "'", str15, "\005\ufffd\025\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "510639654296143" + "'", str17, "510639654296143");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\004\ufffdo\366\ufffd1\007\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??o\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6192488138" + "'", str7, "6192488138");
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str15 = rSA1.encrypt("36889312402462405966288044447");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001>" + "'", str7, "\001>");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "506" + "'", str9, "506");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "365" + "'", str13, "365");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "375" + "'", str15, "375");
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.encrypt("237");
        java.lang.String str17 = rSA1.encrypt("1421278555682012");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1569887595769100" + "'", str7, "1569887595769100");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "178" + "'", str11, "178");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27" + "'", str13, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "214" + "'", str15, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "243" + "'", str17, "243");
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "582" + "'", str11, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\013" + "'", str13, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "742" + "'", str15, "742");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "157" + "'", str17, "157");
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.decrypt("925568231498920647360821327791");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8532523544" + "'", str3, "8532523544");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffdX*'" + "'", str5, "\000\ufffdX*'");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\005\ufffd" + "'", str7, "\002\ufffd\ufffd\005\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.decrypt("307617158993279925207183563328");
        java.lang.String str21 = rSA1.decrypt("429369126295408145122130275092");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "859205959358627" + "'", str7, "859205959358627");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1335204218556020" + "'", str13, "1335204218556020");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0016" + "'", str19, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001v" + "'", str21, "\001v");
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
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
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "485432553013546017496759789075" + "'", str9, "485432553013546017496759789075");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\026\036\ufffdl\001\ufffd\ufffdBR\020\ufffd" + "'", str11, "\001\026\036\ufffdl\001\ufffd\ufffdBR\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "220079349946888798339391453633" + "'", str13, "220079349946888798339391453633");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "496686142940485631479714724184" + "'", str15, "496686142940485631479714724184");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "30276785129213068781408806173" + "'", str17, "30276785129213068781408806173");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\006\ufffd\u0261\017\ufffd\026\ufffd" + "'", str19, "\000\ufffd\006\ufffd\u0261\017\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "311375184281258019710012708390" + "'", str21, "311375184281258019710012708390");
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.decrypt("456351013126802");
        java.lang.String str7 = rSA1.encrypt("268370251453300563787314458062");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?X??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98577597811514166640540962037" + "'", str3, "98577597811514166640540962037");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\005\ufffdr\007\ufffd\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\005\ufffdr\007\ufffd\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36142643214884898706013901982" + "'", str7, "36142643214884898706013901982");
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("451850837066694558586623217114");
        java.lang.String str15 = rSA1.decrypt("39686563120869282232251443678");
        java.lang.String str17 = rSA1.decrypt("1938703203101505");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22832067837258758696551512883" + "'", str9, "22832067837258758696551512883");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "22832067837258758696551512883" + "'", str11, "22832067837258758696551512883");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\002\ufffd\024\ufffd\ufffd\ufffd)xaqM" + "'", str13, "\b\ufffd\002\ufffd\024\ufffd\ufffd\ufffd)xaqM");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffda\004\ufffdd, " + "'", str15, "\003\ufffd\ufffd\ufffd\ufffda\004\ufffdd, ");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\020\ufffd\ufffd\ufffd\f\ufffd\ufffd\036\ufffd\ufffdz" + "'", str17, "\002\020\ufffd\ufffd\ufffd\f\ufffd\ufffd\036\ufffd\ufffdz");
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "354629327585307134836652692329" + "'", str9, "354629327585307134836652692329");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\031\ufffd\020\037\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\031\ufffd\020\037\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "312136827659250545703328582062" + "'", str13, "312136827659250545703328582062");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\t\u639e\ufffd\ufffd8+O" + "'", str15, "\002\t\u639e\ufffd\ufffd8+O");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "292922852389110441200110252059" + "'", str19, "292922852389110441200110252059");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "26605627608284066069411495190" + "'", str21, "26605627608284066069411495190");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\021\ufffd\ufffd\ufffd:\024\032\031\ufffdo" + "'", str23, "\004\ufffd\021\ufffd\ufffd\ufffd:\024\032\031\ufffdo");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1028071702528");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "850585739029514" + "'", str7, "850585739029514");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2480998363314036" + "'", str13, "2480998363314036");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "V" + "'", str17, "V");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
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
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2610702499780394" + "'", str7, "2610702499780394");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\u06acQ" + "'", str9, "\000\ufffd\ufffd\u06acQ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1621941238878143" + "'", str13, "1621941238878143");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2199390726809726" + "'", str17, "2199390726809726");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "904978512031729" + "'", str19, "904978512031729");
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("623989711483246");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
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
        java.lang.String str21 = rSA1.decrypt("180466605120703258324735765259");
        java.lang.String str23 = rSA1.decrypt("6318253741");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "393282455247744654762677652281" + "'", str9, "393282455247744654762677652281");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "i\033\ufffd\u56d2\u0158Sb\035" + "'", str11, "i\033\ufffd\u56d2\u0158Sb\035");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "747214342137073141327124087074" + "'", str13, "747214342137073141327124087074");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2701194866853096" + "'", str19, "2701194866853096");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffdi" + "'", str21, "\001\ufffd\ufffd\ufffd\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\ufffd\ufffd\ufffdll" + "'", str23, "\005\ufffd\ufffd\ufffdll");
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.decrypt("777124217965828542860586651850");
        java.lang.String str9 = rSA1.encrypt("\005\ufffd\007\ufffd\ufffd\ufffd\ufffd\ufffdW~");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\tR\fH]\r\ufffd\ufffd\t\ufffd\ufffd" + "'", str3, "\tR\fH]\r\ufffd\ufffd\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "992436543" + "'", str5, "992436543");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t!\032\ufffd\b\ufffd.F6F)n" + "'", str7, "\t!\032\ufffd\b\ufffd.F6F)n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "236410254005311399316465567184" + "'", str9, "236410254005311399316465567184");
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.encrypt("\030");
        java.lang.String str19 = rSA1.decrypt("647272055175057");
        java.lang.String str21 = rSA1.encrypt("73073083040888118419040653382");
        java.lang.String str23 = rSA1.encrypt("\001\ufffd\016\ufffdh");
        java.lang.String str25 = rSA1.decrypt("2843953827");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "106070565213550688933318117207" + "'", str9, "106070565213550688933318117207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "717831349614746234088238504834" + "'", str13, "717831349614746234088238504834");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "598320295198940811601449609166" + "'", str15, "598320295198940811601449609166");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7962624" + "'", str17, "7962624");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\"\ufffd\021\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\ufffd\"\ufffd\021\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "733084591971750120435125526444" + "'", str21, "733084591971750120435125526444");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "404234703467717997541500134583" + "'", str23, "404234703467717997541500134583");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\b\ufffd\ufffd\ufffdx\021\ufffd\ufffd\ufffd\0306" + "'", str25, "\b\ufffd\ufffd\ufffdx\021\ufffd\ufffd\ufffd\0306");
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1328132175830253" + "'", str7, "1328132175830253");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
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
        java.lang.String str21 = rSA1.encrypt("1445011235798689");
        java.lang.String str23 = rSA1.decrypt("1279651744689134");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2171111153552970" + "'", str7, "2171111153552970");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n1\004\ufffd\ufffd\ufffd\026" + "'", str9, "\n1\004\ufffd\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40595660600708" + "'", str11, "40595660600708");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1031796177967545" + "'", str13, "1031796177967545");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2302358579851552" + "'", str17, "2302358579851552");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "417868899062692017186382966634" + "'", str21, "417868899062692017186382966634");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("15573850693655");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\t\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "974702244721155" + "'", str13, "974702244721155");
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        java.lang.String str15 = rSA1.encrypt("196989163804812");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001C524");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?C524\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\u0381\ufffd\ufffd\ufffdMm|" + "'", str13, "\b\ufffd\u0381\ufffd\ufffd\ufffdMm|");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "850193739043293046612666854361" + "'", str15, "850193739043293046612666854361");
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\036\u03bfR");
        java.lang.String str15 = rSA1.encrypt("437057932281058866141326378333");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373771619945611657527775889966" + "'", str13, "373771619945611657527775889966");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "368519759026680203169291606975" + "'", str15, "368519759026680203169291606975");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("277");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "317" + "'", str3, "317");
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("884371775882389478461512527746");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432437563822390824542773273706" + "'", str9, "432437563822390824542773273706");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd 7ql\017\ufffdM\013" + "'", str11, "\003\ufffd\ufffd 7ql\017\ufffdM\013");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\022\ufffd\ufffd\ufffd}3\030\ufffd\ufffd\ufffd" + "'", str13, "\003\022\ufffd\ufffd\ufffd}3\030\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1786212079" + "'", str17, "1786212079");
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        java.lang.String str9 = rSA1.encrypt("825110335461462544760601940215");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\023\ufffdd1\006\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??b\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "559789920" + "'", str3, "559789920");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4815724969" + "'", str5, "4815724969");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2437052169" + "'", str7, "2437052169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3999727870" + "'", str9, "3999727870");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2881331400" + "'", str11, "2881331400");
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("813206094276231374379760053937");
        java.lang.String str21 = rSA1.decrypt("482");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "275" + "'", str9, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "74" + "'", str13, "74");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "182106571423892" + "'", str19, "182106571423892");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3037190042978760" + "'", str7, "3037190042978760");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1209684215390878" + "'", str13, "1209684215390878");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffdt" + "'", str15, "\004\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\u03a8" + "'", str17, "\002\ufffd\ufffd\u03a8");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "431771323543620" + "'", str19, "431771323543620");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "332594010652816" + "'", str21, "332594010652816");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3144258277857041582803565651" + "'", str25, "3144258277857041582803565651");
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.decrypt("311802123074235925915620233684");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd\027\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "39311417948435809898093167022" + "'", str13, "39311417948435809898093167022");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "14204263426455573201661441015" + "'", str15, "14204263426455573201661441015");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd'l" + "'", str19, "\000\ufffd\ufffd'l");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1381192292698228" + "'", str7, "1381192292698228");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1156661458659863" + "'", str13, "1156661458659863");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2348382168283281" + "'", str15, "2348382168283281");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd" + "'", str17, "\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2158456856129814" + "'", str19, "2158456856129814");
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
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
        java.lang.String str23 = rSA1.encrypt("\001\ufffd\ufffd");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "389171369235902264986598150666" + "'", str9, "389171369235902264986598150666");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\u2a78" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\u2a78");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "330780748837279263636251580154" + "'", str13, "330780748837279263636251580154");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2561224938347407" + "'", str19, "2561224938347407");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\000\ufffd\023\ufffd\ufffd" + "'", str21, "\001\000\ufffd\023\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "3515992165145825" + "'", str23, "3515992165145825");
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("457613644251791188504293612087");
        java.lang.String str9 = rSA1.encrypt("\005\ufffd\ufffd\027\024\ufffd\005\ufffd\023\021\034\007");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004X\005\ufffd\ufffd" + "'", str7, "\004X\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1326541798180366" + "'", str9, "1326541798180366");
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("9209852681");
        java.lang.String str9 = rSA1.decrypt("320500678631717928572539474601");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "396595865845140428643785760442" + "'", str3, "396595865845140428643785760442");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6143669082" + "'", str7, "6143669082");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\005\ufffd" + "'", str9, "\000\ufffd\ufffd\005\ufffd");
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4521201851" + "'", str3, "4521201851");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4887220741" + "'", str5, "4887220741");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1552591749" + "'", str7, "1552591749");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffdy&" + "'", str9, "\000\ufffdy&");
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16" + "'", str13, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "48350340107608641361073210878" + "'", str17, "48350340107608641361073210878");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32069561504214299255898737244" + "'", str19, "32069561504214299255898737244");
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("10496963571");
        java.lang.String str13 = rSA1.encrypt("106196728087020674353374184536");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "165" + "'", str3, "165");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\u59a2" + "'", str7, "\000\ufffd\u59a2");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\023\ufffd" + "'", str9, "\000\ufffd\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2803984239" + "'", str11, "2803984239");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2973116907" + "'", str13, "2973116907");
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("743632217708299");
        java.lang.String str11 = rSA1.decrypt("389529968428293");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\"\ufffd\027\ufffd\ufffd" + "'", str3, "\b\"\ufffd\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1616209725996776" + "'", str5, "1616209725996776");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2610622440827703" + "'", str7, "2610622440827703");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\036\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\u060c\ufffd\ufffd" + "'", str11, "\003\ufffd\u060c\ufffd\ufffd");
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "143" + "'", str3, "143");
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
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
        java.lang.String str27 = rSA1.decrypt("866349567396973");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "908296655910470" + "'", str7, "908296655910470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002*" + "'", str19, "\002*");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "924" + "'", str21, "924");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd" + "'", str23, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001\ufffd" + "'", str27, "\001\ufffd");
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
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
        java.lang.String str23 = rSA1.encrypt("99093455703265065469185521349");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1296157971991449788499232706" + "'", str9, "1296157971991449788499232706");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1296157971991449788499232706" + "'", str11, "1296157971991449788499232706");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "409126145892191889863758495984" + "'", str15, "409126145892191889863758495984");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\u0164\ufffd\u02de\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\000\u0164\ufffd\u02de\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "118632757242894692302880145171" + "'", str19, "118632757242894692302880145171");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "554036991643936454364164326342" + "'", str21, "554036991643936454364164326342");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "533541802024177459771772791498" + "'", str23, "533541802024177459771772791498");
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        java.lang.String str7 = rSA1.decrypt("2280883083");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "119579939769595636001061" + "'", str3, "119579939769595636001061");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "475164201681898315184595903527" + "'", str5, "475164201681898315184595903527");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\ufffd\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\t\ufffd\ufffd\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        java.lang.String str17 = rSA1.encrypt("1368946672987619");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2011427185976578" + "'", str13, "2011427185976578");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "191261717435978" + "'", str15, "191261717435978");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1381559158945820" + "'", str17, "1381559158945820");
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("407349113968439258043617203691");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "625509329" + "'", str15, "625509329");
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1216146960797951" + "'", str7, "1216146960797951");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238" + "'", str11, "238");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\005ia\\\002\ufffd\ufffd\ufffd\ufffd>J" + "'", str25, "\005ia\\\002\ufffd\ufffd\ufffd\ufffd>J");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.decrypt("158305255855005487799219720195");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "405742276373198" + "'", str7, "405742276373198");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "158" + "'", str15, "158");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("490536993234244");
        java.lang.String str15 = rSA1.encrypt("3055971274171833");
        java.lang.String str17 = rSA1.decrypt("2193102364306317");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffdd" + "'", str3, "\004\ufffd\ufffd\ufffdd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1659297839741407" + "'", str5, "1659297839741407");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "673105654644677" + "'", str7, "673105654644677");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdX" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "583024455933087638857517642752" + "'", str15, "583024455933087638857517642752");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffdE\031\ufffd\u01cf\ufffd;." + "'", str17, "\003\ufffd\ufffdE\031\ufffd\u01cf\ufffd;.");
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr\013\ufffd");
        java.lang.String str13 = rSA1.encrypt("208");
        rSA1.generateKeys((int) (byte) 100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "409" + "'", str9, "409");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "289" + "'", str11, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "549" + "'", str13, "549");
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("\b\ufffd\ufffdc\f\ufffd\n");
        java.lang.String str17 = rSA1.decrypt("123861012712764701167587676382");
        java.lang.String str19 = rSA1.encrypt("31");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "29881727070391325300469544759" + "'", str9, "29881727070391325300469544759");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "282956149662071097146751913446" + "'", str11, "282956149662071097146751913446");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "257482470883339" + "'", str15, "257482470883339");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\n\ufffd\000" + "'", str17, "\002\ufffd\n\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "926158157310321" + "'", str19, "926158157310321");
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("238");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffde");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??l???e\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "314629073879575286945823653950" + "'", str9, "314629073879575286945823653950");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffdU\021\ufffd\001\ufffdx" + "'", str11, "\004\ufffd\ufffd\ufffdU\021\ufffd\001\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffdM\007\ufffd\ufffd8\007\ufffd\030" + "'", str13, "\000\ufffd\ufffdM\007\ufffd\ufffd8\007\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "'\017\ufffd" + "'", str17, "'\017\ufffd");
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("377274208793307859118109594762");
        java.lang.String str21 = rSA1.decrypt("3606542550");
        java.lang.String str23 = rSA1.decrypt("443");
        rSA1.generateKeys(10);
        java.lang.String str27 = rSA1.encrypt("191327039042497");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "190442567746756" + "'", str11, "190442567746756");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1964371042589782" + "'", str13, "1964371042589782");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "907054823672855" + "'", str15, "907054823672855");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "121177492577254930566357464048" + "'", str19, "121177492577254930566357464048");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\u0153\ufffd\ufffd\ufffd\ufffd\ufffdY" + "'", str21, "\001\u0153\ufffd\ufffd\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffd\030" + "'", str23, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\007\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "118" + "'", str27, "118");
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        java.lang.String str15 = rSA1.encrypt("1902662215266297");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "213061785291399158258061768288" + "'", str9, "213061785291399158258061768288");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffdLb\r\ufffd\ufffd\ufffd\u0730" + "'", str11, "\005\ufffd\ufffd\ufffdLb\r\ufffd\ufffd\ufffd\u0730");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffdGH" + "'", str13, "\006\ufffd\ufffd\ufffdGH");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "164410276565656241159282609605" + "'", str15, "164410276565656241159282609605");
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1512739533813279");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("\t\ufffd\ufffdER\020\ufffd=_\031\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1379198935888650" + "'", str7, "1379198935888650");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "937572554865326" + "'", str9, "937572554865326");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4643775306741934748905376773" + "'", str13, "4643775306741934748905376773");
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("506655051908724392251151748603");
        java.lang.String str19 = rSA1.decrypt("764648198592128872528547211042");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffdg9" + "'", str13, "\006\ufffdg9");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "55628635458621" + "'", str15, "55628635458621");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24132179224090" + "'", str17, "24132179224090");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffds" + "'", str19, "\002\ufffd\ufffd\ufffds");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
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
        java.lang.String str21 = rSA1.encrypt("1632486383706842");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "47342376746260677401199741174" + "'", str9, "47342376746260677401199741174");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "329819321176429678656230150696" + "'", str11, "329819321176429678656230150696");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\035\ufffd\uef9f\177\u03b5\026b" + "'", str13, "\001\ufffd\035\ufffd\uef9f\177\u03b5\026b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004|\017\ufffd\f\ufffd\u07bb\ufffd\ufffd\021\ufffd" + "'", str15, "\004|\017\ufffd\f\ufffd\u07bb\ufffd\ufffd\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "380846474487731735753413243803" + "'", str17, "380846474487731735753413243803");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\t\ufffd\ufffd!\024\ufffd)]*" + "'", str19, "\003\t\ufffd\ufffd!\024\ufffd)]*");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "373201842937437829342764338858" + "'", str21, "373201842937437829342764338858");
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "88075787266743947858175126486" + "'", str9, "88075787266743947858175126486");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "88075787266743947858175126486" + "'", str11, "88075787266743947858175126486");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<\n" + "'", str13, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<\n");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "299418942706546843104014900161" + "'", str15, "299418942706546843104014900161");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\016\ufffd\ufffd\\\f\000\ufffd\ufffd" + "'", str17, "\002\016\ufffd\ufffd\\\f\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004Qv\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\005" + "'", str19, "\004Qv\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\005");
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?:?'??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "524" + "'", str13, "524");
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("159324186965374018993794128375");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\n\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\020\ufffd\ufffdQw\n\ufffdl_." + "'", str17, "\000\ufffd\020\ufffd\ufffdQw\n\ufffdl_.");
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        java.lang.String str15 = rSA1.encrypt("196989163804812");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\024\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?]A?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\t\031\ufffd\024\ufffd\f\ufffd\ufffd\023\ufffd\ufffd" + "'", str13, "\002\ufffd\t\031\ufffd\024\ufffd\f\ufffd\ufffd\023\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "250259460990324795147793563561" + "'", str15, "250259460990324795147793563561");
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\004\ufffd\033G" + "'", str13, "\001\ufffd\004\ufffd\033G");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3781411356175813" + "'", str15, "3781411356175813");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1537029340304341" + "'", str17, "1537029340304341");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1991295709083719" + "'", str19, "1991295709083719");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3819552166213984" + "'", str21, "3819552166213984");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2194488710071870" + "'", str23, "2194488710071870");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3739279451356692" + "'", str25, "3739279451356692");
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffd\007\u0529\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0013" + "'", str7, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\001" + "'", str9, "\002\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001U" + "'", str11, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "246" + "'", str15, "246");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("1698695996533702");
        java.lang.String str19 = rSA1.decrypt("7522840604");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "637815365261342037241058853793" + "'", str11, "637815365261342037241058853793");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "585170009276945119871587283004" + "'", str13, "585170009276945119871587283004");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd8H\020\ufffd\u0227\ufffd" + "'", str15, "\002\ufffd\ufffd8H\020\ufffd\u0227\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004\ufffd\004" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004\ufffd\004");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\035\177\ufffd\ufffd\ufffd" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\035\177\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
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
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59809579767034526976002534401" + "'", str9, "59809579767034526976002534401");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "59809579767034526976002534401" + "'", str11, "59809579767034526976002534401");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "540548966757092197734598194411" + "'", str15, "540548966757092197734598194411");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\033<\003\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd\033<\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\ufffd\013\ufffd\ufffd\ufffd\033" + "'", str19, "\007\ufffd\ufffd\013\ufffd\ufffd\ufffd\033");
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.decrypt("4288676673");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001R" + "'", str9, "\001R");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
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
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1210012186061380" + "'", str7, "1210012186061380");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1749298563244673" + "'", str13, "1749298563244673");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\032" + "'", str17, "\002\032");
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
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
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "742567065065178738617289605266" + "'", str9, "742567065065178738617289605266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006J3\007\017\ufffd\032\ufffd\ufffd`Q\023" + "'", str11, "\006J3\007\017\ufffd\032\ufffd\ufffd`Q\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "236374566977012370728840642986" + "'", str13, "236374566977012370728840642986");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd$\002\ufffd\ufffd\"\0230" + "'", str15, "\b\ufffd$\002\ufffd\ufffd\"\0230");
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("2133068282947590");
        java.lang.String str19 = rSA1.decrypt("1995297418959056");
        java.lang.String str21 = rSA1.encrypt("349010711772933009600124606579");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9936405551792857057480242693" + "'", str9, "9936405551792857057480242693");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "488716408107557641070327099860" + "'", str11, "488716408107557641070327099860");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "146384630742727541575410162717" + "'", str13, "146384630742727541575410162717");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "336" + "'", str17, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\036" + "'", str19, "\036");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "78" + "'", str21, "78");
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3064477541808429");
        java.lang.String str17 = rSA1.decrypt("627682096335932539143797577387");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "247941846902559" + "'", str7, "247941846902559");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1571424011445374" + "'", str9, "1571424011445374");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1029849620269575" + "'", str11, "1029849620269575");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "232" + "'", str15, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\026" + "'", str17, "\026");
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        java.lang.String str19 = rSA1.decrypt("337620386496259653218673354427");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "286218438735277765513508181423" + "'", str9, "286218438735277765513508181423");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\027\032\ufffdfz_" + "'", str13, "\001\027\032\ufffdfz_");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1430935333862610" + "'", str15, "1430935333862610");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "171143411934714" + "'", str17, "171143411934714");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd`" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd`");
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "394405627907099354427973115156" + "'", str3, "394405627907099354427973115156");
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("113484804779532097642572840092");
        java.lang.String str17 = rSA1.decrypt("33522487042404985624");
        java.lang.String str19 = rSA1.decrypt("1374229591490732");
        java.lang.String str21 = rSA1.encrypt("3566878757");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1811277377326221" + "'", str7, "1811277377326221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "895532764" + "'", str11, "895532764");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "224" + "'", str15, "224");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "9" + "'", str21, "9");
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("457613644251791188504293612087");
        java.lang.String str9 = rSA1.encrypt("\005\ufffd\ufffd\027\024\ufffd\005\ufffd\023\021\034\007");
        java.lang.String str11 = rSA1.decrypt("1817845140561912");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd'\037" + "'", str7, "\001\ufffd\ufffd\ufffd'\037");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2088876982522174" + "'", str9, "2088876982522174");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\177\ufffd\ufffd" + "'", str11, "\b\ufffd\177\ufffd\ufffd");
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("37761701459156484237");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("2496260200544749");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "442732782866918453875408676651" + "'", str11, "442732782866918453875408676651");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "582037753339450543479634406061" + "'", str15, "582037753339450543479634406061");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "479294250038456576241387766218" + "'", str19, "479294250038456576241387766218");
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("\005g\006\ufffd\ufffda");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\ufffdxK\013\ufffd\ufffd\b\034\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2884534864" + "'", str3, "2884534864");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3488499186" + "'", str5, "3488499186");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4866457696" + "'", str7, "4866457696");
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("5458393606");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "404558472111049682346241796953" + "'", str9, "404558472111049682346241796953");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "86255464885533901965069902130" + "'", str11, "86255464885533901965069902130");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "524584234395833268727770491800" + "'", str15, "524584234395833268727770491800");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u07b1\ufffd\ufffd\ufffd\035" + "'", str13, "\001\u07b1\ufffd\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1913343179789677" + "'", str15, "1913343179789677");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1602900720545057" + "'", str17, "1602900720545057");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1369028680213257" + "'", str19, "1369028680213257");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "257727379239840" + "'", str21, "257727379239840");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1026497967591391" + "'", str23, "1026497967591391");
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.decrypt("753709548305681");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230458303718801473513853842827" + "'", str9, "230458303718801473513853842827");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "488696442702895997208219504327" + "'", str11, "488696442702895997208219504327");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\017\ufffd\004\ufffd\ufffd\ufffd$86" + "'", str13, "\002\017\ufffd\004\ufffd\ufffd\ufffd$86");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\026\ufffd\u5ac8d\025\ufffd\ufffd\ufffd\035" + "'", str15, "\004\026\ufffd\u5ac8d\025\ufffd\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\027\u06ac" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\027\u06ac");
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("173");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001B" + "'", str7, "\001B");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77" + "'", str9, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\034" + "'", str13, "\034");
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "248468342525174602889416229792" + "'", str9, "248468342525174602889416229792");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "248468342525174602889416229792" + "'", str11, "248468342525174602889416229792");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\u04cd\ufffd\007\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\u04cd\ufffd\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "650668489993629247613878349050" + "'", str15, "650668489993629247613878349050");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdb" + "'", str21, "\003\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdb");
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.lang.String str11 = rSA1.decrypt("46925933906613754914094402908");
        java.lang.String str13 = rSA1.encrypt("1699026177576345");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "659288752459644156402280735647" + "'", str9, "659288752459644156402280735647");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\032L\031\ufffd\ufffd\ufffd`" + "'", str11, "\b\ufffd\ufffd\032L\031\ufffd\ufffd\ufffd`");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "641391939497428055067312407611" + "'", str13, "641391939497428055067312407611");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "273988574917357970135950621461" + "'", str15, "273988574917357970135950621461");
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("252606222438286852223175939175");
        java.lang.String str15 = rSA1.encrypt("2059890261345274");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "227" + "'", str9, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\ufffd\ufffd" + "'", str13, "\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7483784660" + "'", str15, "7483784660");
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("30774062305666838944109687145");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "217" + "'", str13, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "d" + "'", str17, "d");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("H\t\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "526453772597631" + "'", str7, "526453772597631");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\b\ufffdf" + "'", str9, "\005\ufffd\b\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1275882009270633" + "'", str11, "1275882009270633");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "494217068570842" + "'", str13, "494217068570842");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1243157858300553" + "'", str15, "1243157858300553");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1141302514322038" + "'", str19, "1141302514322038");
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("9209852681");
        java.lang.String str9 = rSA1.decrypt("320500678631717928572539474601");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "162230157844637362436383671357" + "'", str3, "162230157844637362436383671357");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5820947819" + "'", str7, "5820947819");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001.#;\003" + "'", str9, "\001.#;\003");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "750055763028791" + "'", str11, "750055763028791");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2516682825672535" + "'", str13, "2516682825672535");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2291683448813138" + "'", str15, "2291683448813138");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3337268060290451" + "'", str7, "3337268060290451");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "592582094557557" + "'", str13, "592582094557557");
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str15 = rSA1.decrypt("473");
        java.lang.String str17 = rSA1.decrypt("38224169242876816648692772463");
        java.lang.String str19 = rSA1.encrypt("3404694918");
        java.lang.String str21 = rSA1.decrypt("68009096504381448066944111591");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "62192299408493702977560033696" + "'", str9, "62192299408493702977560033696");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\u0317\017\ufffd\ufffd\ufffdBN" + "'", str11, "\005\ufffd\ufffd\u0317\017\ufffd\ufffd\ufffdBN");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd=\026\ufffd\ufffd\ufffd\ufffde\031\ufffd" + "'", str15, "\005\ufffd=\026\ufffd\ufffd\ufffd\ufffde\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\\\ufffd\035g\"\n\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\b\\\ufffd\035g\"\n\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "480183697535814105233991601018" + "'", str19, "480183697535814105233991601018");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\027\ufffd\ufffd\020\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\003\027\ufffd\ufffd\020\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\n\ufffd0U");
        java.lang.String str17 = rSA1.encrypt("635452748473337312538698001294");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0013" + "'", str7, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\001" + "'", str9, "\002\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001U" + "'", str11, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "159" + "'", str15, "159");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "389" + "'", str17, "389");
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.decrypt("797531287745579");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + ")" + "'", str19, ")");
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("576");
        java.lang.String str19 = rSA1.decrypt("905004948346330734839429911423");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "581218694088927051598002606064" + "'", str9, "581218694088927051598002606064");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\n" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\n");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\006.}\034\004\ufffd\001\ufffdjdl" + "'", str13, "\002\006.}\034\004\ufffd\001\ufffdjdl");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdUF0\035" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdUF0\035");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\000\005nYJ\177\ufffd" + "'", str19, "\ufffd\000\005nYJ\177\ufffd");
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("333538977866196043865277785098");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str9 = rSA1.encrypt("971673362384997");
        java.lang.String str11 = rSA1.encrypt("46656");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I" + "'", str5, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "56" + "'", str9, "56");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "245" + "'", str11, "245");
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("815267620206901");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        java.lang.String str13 = rSA1.decrypt("2836091720111680");
        java.lang.String str15 = rSA1.decrypt("3416410363345270");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3370369595" + "'", str3, "3370369595");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6303323792" + "'", str5, "6303323792");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8327202263" + "'", str7, "8327202263");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8494213295" + "'", str9, "8494213295");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5568649481" + "'", str11, "5568649481");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\036\ufffd" + "'", str13, "\000\ufffd\ufffd\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\037\ufffd\ufffd" + "'", str15, "\001\037\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1686445410039240" + "'", str7, "1686445410039240");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "155025824081482" + "'", str13, "155025824081482");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\032\ufffd\005\nz\013" + "'", str15, "\005\032\ufffd\005\nz\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\177\ufffd\ufffd" + "'", str17, "\002\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "627899393626292" + "'", str19, "627899393626292");
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        java.lang.String str9 = rSA1.encrypt("40627128861085818020058494926");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1496605489" + "'", str5, "1496605489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1672424822" + "'", str7, "1672424822");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2132145760" + "'", str9, "2132145760");
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.decrypt("33554310665719462984");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\177\f\ufffd" + "'", str5, "\001\ufffd\177\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "70763847004560614178415246454" + "'", str9, "70763847004560614178415246454");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002#\"\u0668\017\ufffd\030\u0279\ufffd" + "'", str11, "\002#\"\u0668\017\ufffd\030\u0279\ufffd");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.encrypt("216");
        java.lang.String str15 = rSA1.encrypt("528864329572193935886654471744");
        java.lang.String str17 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "273116183646419921688306146357" + "'", str9, "273116183646419921688306146357");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "103232607579521677459314001237" + "'", str11, "103232607579521677459314001237");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285891959128095842083540917508" + "'", str13, "285891959128095842083540917508");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "265695893542077295837349127757" + "'", str15, "265695893542077295837349127757");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "115968871064878313379671332239" + "'", str17, "115968871064878313379671332239");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("813206094276231374379760053937");
        java.lang.String str21 = rSA1.decrypt("482");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "587" + "'", str9, "587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "174" + "'", str13, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "446605868052502" + "'", str19, "446605868052502");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\177\u050d\ufffd(" + "'", str21, "\004\ufffd\177\u050d\ufffd(");
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("214");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "465462691234570176426211323672" + "'", str9, "465462691234570176426211323672");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "465462691234570176426211323672" + "'", str11, "465462691234570176426211323672");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "87419488925459376845996441783" + "'", str15, "87419488925459376845996441783");
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        java.lang.String str15 = rSA1.decrypt("5983892845115794059512419946");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd7\177\ufffd\ufffd\u02ceVU\ri" + "'", str11, "\003\ufffd7\177\ufffd\ufffd\u02ceVU\ri");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\004\ufffd\ufffd`\005\ufffd" + "'", str13, "\001\ufffd\004\ufffd\ufffd`\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\007\ufffd\ufffd\023\ufffd\ufffd" + "'", str15, "\004\007\ufffd\ufffd\023\ufffd\ufffd");
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
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
        java.lang.String str29 = rSA1.decrypt("2096065223642225");
        java.lang.String str31 = rSA1.encrypt("503");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "533473687280612" + "'", str7, "533473687280612");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0012" + "'", str19, "\0012");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "614" + "'", str21, "614");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd" + "'", str23, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "284" + "'", str27, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\000\ufffd" + "'", str29, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "68" + "'", str31, "68");
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("2411260992603826");
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1028071702528" + "'", str11, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1683196891" + "'", str15, "1683196891");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "269189306" + "'", str17, "269189306");
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("\b\002\ufffdP");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "48" + "'", str7, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "48223915446961246963305717677" + "'", str11, "48223915446961246963305717677");
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1434205420341334" + "'", str13, "1434205420341334");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\016\ufffdN=" + "'", str15, "\ufffd\016\ufffdN=");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\007\ufffd\025\ufffd_" + "'", str17, "\005\007\ufffd\025\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffdW4" + "'", str19, "\003\ufffd\ufffdW4");
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
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
        java.lang.String str21 = rSA1.decrypt("132651");
        java.lang.String str23 = rSA1.encrypt("196228282553724531742057314198");
        java.lang.String str25 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\0024L");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "106173371156870" + "'", str7, "106173371156870");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "34" + "'", str15, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "311" + "'", str19, "311");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32" + "'", str23, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "45" + "'", str25, "45");
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.encrypt("1024");
        java.lang.String str9 = rSA1.encrypt("32785009004481843571057639692");
        java.lang.String str11 = rSA1.decrypt("42362846909373312512");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("\007;\026J\033\ufffd\ufffd\ufffd\t\ufffd\003\ufffd");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\021\ufffdz!" + "'", str3, "\021\ufffdz!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1386493873" + "'", str5, "1386493873");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8853081" + "'", str7, "8853081");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2263542055" + "'", str9, "2263542055");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\036" + "'", str11, "\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "17568284689864621031833691174" + "'", str15, "17568284689864621031833691174");
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
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
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffdB\032\002\027\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffdB\032\002\027\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "497194858306366685945535348683" + "'", str15, "497194858306366685945535348683");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "254934141876969492327976830407" + "'", str17, "254934141876969492327976830407");
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "838621078913685" + "'", str7, "838621078913685");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "371668945549990" + "'", str13, "371668945549990");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\u0392\ufffd\ufffd\031" + "'", str15, "\006\ufffd\u0392\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd\u03e0\ufffd");
        java.lang.String str5 = rSA1.decrypt("929397063179076");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "521313460105799544891014873283" + "'", str3, "521313460105799544891014873283");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006\ufffd\007\ufffdTj\027\ufffd\ufffd\ufffd" + "'", str5, "\006\ufffd\007\ufffdTj\027\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("2251185751828143");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "331" + "'", str7, "331");
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.decrypt("914181283893724");
        java.lang.String str13 = rSA1.decrypt("406886696867962475347512808088");
        java.lang.String str15 = rSA1.encrypt("\005\002\ufffd\ufffd\r\177");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.encrypt("86277080072252824524097513978");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K" + "'", str11, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\016" + "'", str13, "\002\016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "65" + "'", str15, "65");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "638271675" + "'", str19, "638271675");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
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
        java.lang.String str21 = rSA1.decrypt("493073813962831643623653941167");
        java.lang.String str23 = rSA1.encrypt("\004\ufffd\u8e0d\ufffd\ufffd\ufffd \b");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22298236469761595284155294547" + "'", str9, "22298236469761595284155294547");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd:\004\ufffd\u01e1\003\026\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd:\004\ufffd\u01e1\003\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "297147684056209685495817537866" + "'", str13, "297147684056209685495817537866");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd[\t\ufffd\bKx\016\ufffd\013" + "'", str15, "\b\ufffd\ufffd[\t\ufffd\bKx\016\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`" + "'", str19, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\022\030\ufffd\000\ufffd\ufffdj3DF" + "'", str21, "\ufffd\022\030\ufffd\000\ufffd\ufffdj3DF");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "51029266158615791184638515845" + "'", str23, "51029266158615791184638515845");
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("10019204889");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("622140017123891");
        java.lang.String str21 = rSA1.encrypt("441092054808243");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "78788915817801561317611665824" + "'", str9, "78788915817801561317611665824");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "76289550880965645741255032832" + "'", str11, "76289550880965645741255032832");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\udacc\udd08\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\udacc\udd08\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "400280629572583925798723185870" + "'", str15, "400280629572583925798723185870");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "281335238161742630094718875935" + "'", str19, "281335238161742630094718875935");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "444884234082437554729260724285" + "'", str21, "444884234082437554729260724285");
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("423");
        java.lang.String str5 = rSA1.encrypt("825");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "827366935585226" + "'", str7, "827366935585226");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
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
        java.lang.String str21 = rSA1.encrypt("47829690000000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??;\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75206267573343962322385497765" + "'", str9, "75206267573343962322385497765");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "75206267573343962322385497765" + "'", str11, "75206267573343962322385497765");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd\u04c8\ufffdVNr!\007" + "'", str13, "\t\ufffd\ufffd\ufffd\u04c8\ufffdVNr!\007");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "945803920959922464135419012037" + "'", str15, "945803920959922464135419012037");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "360601142659170875420403208869" + "'", str21, "360601142659170875420403208869");
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "842333048292156" + "'", str7, "842333048292156");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "295" + "'", str15, "295");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\034" + "'", str17, "\034");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "58" + "'", str19, "58");
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("321842069114441562362352839359");
        java.lang.String str11 = rSA1.decrypt("1012529833103073");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\000\ufffd\tz\034\ufffd\ufffd^\fD");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdJ\b\ufffd\ufffdv\027\ufffd\u0563\ufffd" + "'", str9, "\000\ufffd\ufffdJ\b\ufffd\ufffdv\027\ufffd\u0563\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\u016e\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\u016e\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "740923728642000333828392698041" + "'", str13, "740923728642000333828392698041");
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("1814032248");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffdW\020\ufffd\ufffd\ufffd\ufffd[h" + "'", str13, "\004\ufffd\ufffdW\020\ufffd\ufffd\ufffd\ufffd[h");
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        java.lang.String str15 = rSA1.encrypt("453271197550529659739416350615");
        java.lang.String str17 = rSA1.decrypt("44806902903151382863854495294");
        java.lang.String str19 = rSA1.decrypt("636965577117824470113692484346");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2224737984686714" + "'", str7, "2224737984686714");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7552998032" + "'", str13, "7552998032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5844696364" + "'", str15, "5844696364");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\031\036" + "'", str17, "\002\ufffd\031\036");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\u057d" + "'", str19, "\000\ufffd\ufffd\u057d");
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.decrypt("1198965058209000");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "128927669917071490294840062068" + "'", str3, "128927669917071490294840062068");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\370" + "'", str5, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\370");
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        java.lang.String str13 = rSA1.decrypt("1423068253868870");
        java.lang.String str15 = rSA1.decrypt("869969774246323591843875220049");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\030" + "'", str7, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "368" + "'", str11, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002y" + "'", str13, "\002y");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("652458685405459190865265712722");
        java.lang.String str9 = rSA1.encrypt("2008322195689409");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2653999176" + "'", str7, "2653999176");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6544752143" + "'", str9, "6544752143");
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
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
        java.lang.String str21 = rSA1.decrypt("176487509978745484412065836341");
        java.lang.String str23 = rSA1.decrypt("163083724602303583110224629221");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "841718503060266" + "'", str7, "841718503060266");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "698632001185174765104893459126" + "'", str13, "698632001185174765104893459126");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\r" + "'", str19, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
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
        java.lang.String str25 = rSA1.encrypt("3600424230");
        java.lang.String str27 = rSA1.encrypt("2368138632");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "111260633310991967905652250039" + "'", str9, "111260633310991967905652250039");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffdk\016\005" + "'", str11, "\007\ufffd\ufffd\ufffdk\016\005");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "359677349381035231131251331782" + "'", str13, "359677349381035231131251331782");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\"`+\"\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\"`+\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "223487706750299316955870375506" + "'", str17, "223487706750299316955870375506");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19784156277741242652930986254" + "'", str21, "19784156277741242652930986254");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3030501072" + "'", str25, "3030501072");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1681995583" + "'", str27, "1681995583");
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
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
        java.lang.String str21 = rSA1.decrypt("653");
        java.lang.String str23 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2072017412067462" + "'", str7, "2072017412067462");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\006\ufffd\ufffd\ufffd" + "'", str9, "\007\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "157818298753135" + "'", str13, "157818298753135");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2198395749448494" + "'", str17, "2198395749448494");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "428672635200114" + "'", str19, "428672635200114");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd" + "'", str21, "\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1329189440634779" + "'", str23, "1329189440634779");
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("462059788404288851690924494526");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("1914051331757115942209403875");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "340396739138029398454886315527" + "'", str9, "340396739138029398454886315527");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd\016\ufffdo" + "'", str11, "\002\ufffd\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd\016\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8331851534032027473488601069" + "'", str15, "8331851534032027473488601069");
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "528672237112453013134151704187" + "'", str9, "528672237112453013134151704187");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "529897539092499651265402754371" + "'", str13, "529897539092499651265402754371");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\023\u0488\ufffd\ufffd" + "'", str15, "\007\ufffd\023\u0488\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64339296875" + "'", str17, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "282779218495447694203197979074" + "'", str19, "282779218495447694203197979074");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.decrypt("682207750398180758004262180703");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "582768826223234450666419073266" + "'", str9, "582768826223234450666419073266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\\\ufffd\ufffdn" + "'", str11, "\000\ufffd\ufffd\ufffd\\\ufffd\ufffdn");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "174243875324596606960120707736" + "'", str13, "174243875324596606960120707736");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\033\ufffd%" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi\033\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001!\002\177\037" + "'", str19, "\001!\002\177\037");
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffdD\020\030d" + "'", str13, "\006\ufffd\ufffdD\020\030d");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2392893814058027" + "'", str15, "2392893814058027");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1632550871158597" + "'", str17, "1632550871158597");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2430563741698438" + "'", str19, "2430563741698438");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "51085266582027" + "'", str21, "51085266582027");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1308132657657811" + "'", str23, "1308132657657811");
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "289793571352882" + "'", str7, "289793571352882");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "355" + "'", str15, "355");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001a" + "'", str19, "\001a");
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.encrypt("202585656882194916579406915390");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "218669995126893099881842846192" + "'", str9, "218669995126893099881842846192");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "921158792737392047012366355739" + "'", str15, "921158792737392047012366355739");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "825304420956089396722463948634" + "'", str19, "825304420956089396722463948634");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("132522483985687636017302287217");
        java.lang.String str17 = rSA1.encrypt("604713861838391493603631641603");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\006\ufffd\ufffd\ufffd,\037\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????,??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\022" + "'", str7, "\001\022");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\022" + "'", str15, "\001\022");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "169" + "'", str17, "169");
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        java.lang.String str15 = rSA1.decrypt("1353500237814561");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "722565187549046" + "'", str7, "722565187549046");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\\\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004)\b\ufffd\u0436" + "'", str11, "\004)\b\ufffd\u0436");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\032\u025e\ufffdT" + "'", str13, "\005\ufffd\032\u025e\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd");
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.decrypt("208");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\u0342\ufffd\u02dck\027\ufffd\037\ufffd" + "'", str11, "\001\ufffd\u0342\ufffd\u02dck\027\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.String str15 = rSA1.encrypt("473");
        java.lang.String str17 = rSA1.decrypt("9892043117");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "286324680409037649533736542020" + "'", str11, "286324680409037649533736542020");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005()B\t\013\ufffd(d|\025\ufffd" + "'", str13, "\005()B\t\013\ufffd(d|\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "648458959702081850744362997168" + "'", str15, "648458959702081850744362997168");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\017\ufffd\ufffd\ufffdQ\036\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\017\ufffd\ufffd\ufffdQ\036\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd'");
        java.lang.String str19 = rSA1.encrypt("\006\ufffd\034\ufffd\ufffdr");
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.decrypt("202402939340689812174792253415");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd!" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u068b?y" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u068b?y");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "160" + "'", str17, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "498" + "'", str19, "498");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "A" + "'", str23, "A");
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        java.lang.String str13 = rSA1.decrypt("252365513580659");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("555793519177444192636172018711");
        java.lang.String str19 = rSA1.encrypt("411630426759756130725144985790");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "77" + "'", str11, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "636564619828100006798680286153" + "'", str17, "636564619828100006798680286153");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "718005200962331287338693648040" + "'", str19, "718005200962331287338693648040");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
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
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str27 = rSA1.encrypt("1398970650344529");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "862452636000832958764990879330" + "'", str9, "862452636000832958764990879330");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\u0523\001\ufffd" + "'", str11, "\001\ufffd\ufffd\u0523\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\034\ufffd\ufffd\ufffd\031\ufffd\ufffd\002" + "'", str13, "\004\034\ufffd\ufffd\ufffd\031\ufffd\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd0E-" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd0E-");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "53517012206884570588404949589" + "'", str21, "53517012206884570588404949589");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "56" + "'", str27, "56");
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "278" + "'", str7, "278");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\035&\030\ufffd\ufffd\ufffd\ufffdy\\\026\ufffd" + "'", str11, "\035&\030\ufffd\ufffd\ufffd\ufffdy\\\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20729000924393748489592739347" + "'", str13, "20729000924393748489592739347");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("10606287702275894954582520061");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "414132763887640773044775236134" + "'", str13, "414132763887640773044775236134");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd;\035\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd;\035\ufffd");
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str19 = rSA1.encrypt("1658871643786944");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "352708604768909082891156353143" + "'", str9, "352708604768909082891156353143");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "89153553488034549267641665046" + "'", str11, "89153553488034549267641665046");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "412027877155755339517377403885" + "'", str17, "412027877155755339517377403885");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "456043984555550191442175387863" + "'", str19, "456043984555550191442175387863");
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("810514982227303000140801050035");
        java.lang.String str19 = rSA1.encrypt("1466579829777239");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "262778544863406064117465695989" + "'", str9, "262778544863406064117465695989");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "449928549956997704499789690504" + "'", str11, "449928549956997704499789690504");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1585789576798177" + "'", str17, "1585789576798177");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2307325124774390" + "'", str19, "2307325124774390");
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt(".\022\ufffd\ufffd\024\ufffd\ufffd0GF");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\031\ufffd\025\ufffd\006\ufffd\ufffd\ufffd6.N8");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2115566518700497" + "'", str7, "2115566518700497");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32241911596379231281793762997" + "'", str13, "32241911596379231281793762997");
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("192569224470580183531005309777");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5" + "'", str7, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "290" + "'", str9, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd" + "'", str11, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("1955448203012581");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "773" + "'", str3, "773");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\033\ufffd\u061b" + "'", str7, "\033\ufffd\u061b");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffdn" + "'", str9, "\001\ufffd\ufffdn");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2914095828" + "'", str11, "2914095828");
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
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
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???N\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1332467832205769" + "'", str7, "1332467832205769");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "683221243550695" + "'", str13, "683221243550695");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\026\u07c1V" + "'", str15, "\001\ufffd\ufffd\026\u07c1V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\004\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "33661175747472" + "'", str19, "33661175747472");
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        java.lang.String str15 = rSA1.encrypt("1902662215266297");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "206451372007756651617782099980" + "'", str9, "206451372007756651617782099980");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\035\ufffd\ufffd\"\ufffd\ufffdU\035" + "'", str11, "\006\035\ufffd\ufffd\"\ufffd\ufffdU\035");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003e\025\ufffd\ufffd\ufffd\ufffd\031\u05d4\ufffd" + "'", str13, "\003e\025\ufffd\ufffd\ufffd\ufffd\031\u05d4\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "485160991215354736298197778617" + "'", str15, "485160991215354736298197778617");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "678" + "'", str9, "678");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d" + "'", str13, "d");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "187" + "'", str19, "187");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "119" + "'", str21, "119");
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("8589662889");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "248960615805729933011817473307" + "'", str9, "248960615805729933011817473307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "282070519243886799545074608979" + "'", str13, "282070519243886799545074608979");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("416175732479790270497901975791");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "431342757" + "'", str5, "431342757");
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("1131007583696693");
        java.lang.String str19 = rSA1.encrypt("327");
        java.lang.String str21 = rSA1.encrypt("586");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1370764375491786" + "'", str13, "1370764375491786");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "49579175794262" + "'", str15, "49579175794262");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1545611831805401" + "'", str17, "1545611831805401");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1697796552808751" + "'", str19, "1697796552808751");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2072330230295315" + "'", str21, "2072330230295315");
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("196567626694463745563940699682");
        java.lang.String str19 = rSA1.encrypt("5740624606");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "265" + "'", str9, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "359" + "'", str11, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffdh$" + "'", str17, "\001\ufffdh$");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6506194846" + "'", str19, "6506194846");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("2064440430059638");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("37761701459156484237");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "104181240506603806428402093779" + "'", str11, "104181240506603806428402093779");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "92934795361508619115005551129" + "'", str15, "92934795361508619115005551129");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.decrypt("307641391968194344643523456830");
        java.lang.String str17 = rSA1.encrypt("2308941710044151");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2662858223889455" + "'", str7, "2662858223889455");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246" + "'", str11, "246");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27" + "'", str13, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6" + "'", str15, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "76" + "'", str17, "76");
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
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
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "303131796729561309290923831167" + "'", str9, "303131796729561309290923831167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "W\034\ufffd\"\021\ufffd\ufffd\ufffd" + "'", str11, "W\034\ufffd\"\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdO\024\ufffd\ufffd\ufffd\022\ufffdK\025" + "'", str13, "\ufffdO\024\ufffd\ufffd\ufffd\022\ufffdK\025");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\r\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\r\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u02d9D\035\030\ufffdA\b?" + "'", str19, "\u02d9D\035\030\ufffdA\b?");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "13410493364297545500974750844" + "'", str21, "13410493364297545500974750844");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\016\ufffd\ufffd\ufffd\ufffd\016\ufffd" + "'", str23, "\ufffd\016\ufffd\ufffd\ufffd\ufffd\016\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
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
        java.lang.String str21 = rSA1.encrypt("6972139707");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "101458627308237" + "'", str7, "101458627308237");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffdE*\023" + "'", str9, "\000\ufffd\ufffd\ufffdE*\023");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "817663460746149" + "'", str13, "817663460746149");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "624454913620541" + "'", str17, "624454913620541");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1310213584123081" + "'", str21, "1310213584123081");
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("354502109229355787765617646243");
        java.lang.String str19 = rSA1.encrypt("302631451451116719795947388545");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002'r*\177\ufffd" + "'", str13, "\002'r*\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "389" + "'", str17, "389");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "366" + "'", str19, "366");
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\016\020\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1148349650037827" + "'", str15, "1148349650037827");
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("669");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "130" + "'", str11, "130");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "y" + "'", str13, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "130411634015561" + "'", str11, "130411634015561");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1609305523506661" + "'", str13, "1609305523506661");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2728754749917703467979934625" + "'", str17, "2728754749917703467979934625");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
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
        java.lang.String str23 = rSA1.encrypt("2566593727806295");
        java.lang.String str25 = rSA1.encrypt("\001\ufffd\ufffd>\013\ufffd+\030t2");
        java.lang.String str27 = rSA1.decrypt("541961617835256443173582604147");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "241968972400874129009393928558" + "'", str9, "241968972400874129009393928558");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "357679403522068846718298349539" + "'", str11, "357679403522068846718298349539");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373086680469054036896251577063" + "'", str13, "373086680469054036896251577063");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "65" + "'", str17, "65");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "326" + "'", str19, "326");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "784" + "'", str21, "784");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "20" + "'", str23, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "532" + "'", str25, "532");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\003%" + "'", str27, "\003%");
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("3060553596769532");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "944085209193538" + "'", str7, "944085209193538");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\031" + "'", str9, "\002\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\037\ufffd\ufffd" + "'", str11, "\ufffd\037\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
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
        java.lang.String str21 = rSA1.encrypt("\n\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.decrypt("12123156199");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\030b\006\ufffdb" + "'", str13, "\005\030b\006\ufffdb");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "143883352610370" + "'", str15, "143883352610370");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "214691625180249" + "'", str17, "214691625180249");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1476790311421905" + "'", str19, "1476790311421905");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2227801823785512" + "'", str21, "2227801823785512");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\f\ufffd\007\ufffdO\0049" + "'", str23, "\f\ufffd\007\ufffdO\0049");
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
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
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "760703463562876274467039870361" + "'", str9, "760703463562876274467039870361");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\ufffd\ufe35\005\ufffd\ufffd" + "'", str11, "\n\ufffd\ufffd\ufe35\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\ufffd\n\u037f\ufffd\ufffdz0" + "'", str13, "\\\ufffd\n\u037f\ufffd\ufffdz0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\022\177\ufffd\ufffd\ufffd\ufffd\ufffd}" + "'", str17, "\022\177\ufffd\ufffd\ufffd\ufffd\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1\021\ufffd\ufffd\n\ufffdl" + "'", str19, "1\021\ufffd\ufffd\n\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8130302295135367163293661327" + "'", str21, "8130302295135367163293661327");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\002\ufffd\ufffdy5\bQ" + "'", str23, "\ufffd\002\ufffd\ufffdy5\bQ");
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "894104742435120" + "'", str7, "894104742435120");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "197" + "'", str15, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001+" + "'", str17, "\001+");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "451" + "'", str19, "451");
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "206372493765250" + "'", str7, "206372493765250");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "690013785849648" + "'", str13, "690013785849648");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\026\027\ufffdE" + "'", str15, "\004\ufffd\026\027\ufffdE");
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("813206094276231374379760053937");
        java.lang.String str13 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "993639129598142" + "'", str7, "993639129598142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\177\ufffd\ufffd\017" + "'", str11, "\177\ufffd\ufffd\017");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "779678916" + "'", str13, "779678916");
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        java.lang.String str17 = rSA1.decrypt("264484706");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\b\035\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd*");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "400934787509424" + "'", str13, "400934787509424");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\r\ufffdoa" + "'", str15, "\001\ufffd\r\ufffdoa");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\r\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\r\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1663121384982181");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "248410642300165545201608383874" + "'", str11, "248410642300165545201608383874");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002" + "'", str17, "\002");
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?t??!??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "160167657203025958023417745103" + "'", str9, "160167657203025958023417745103");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "512750683948951547857097450899" + "'", str13, "512750683948951547857097450899");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "471824094781812061627696502956" + "'", str15, "471824094781812061627696502956");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4334526658926048379369241331" + "'", str21, "4334526658926048379369241331");
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        java.lang.String str17 = rSA1.encrypt("100808031796894");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str21 = rSA1.encrypt("1198120526");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1009684429337435" + "'", str11, "1009684429337435");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1512411979025601" + "'", str13, "1512411979025601");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2031626118695108" + "'", str15, "2031626118695108");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "164174874730926" + "'", str17, "164174874730926");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "307972191645561942566930183398" + "'", str21, "307972191645561942566930183398");
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("113919550569426485468138904285");
        java.lang.String str19 = rSA1.decrypt("375119866055244578735675286296");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "377" + "'", str7, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42" + "'", str9, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\023" + "'", str11, "\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25" + "'", str13, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "66" + "'", str15, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "442" + "'", str17, "442");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
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
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "78" + "'", str13, "78");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "550737578168070445512970256680" + "'", str17, "550737578168070445512970256680");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "547979080820852108644880231514" + "'", str19, "547979080820852108644880231514");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "409" + "'", str25, "409");
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("1809985654975719");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1105747294" + "'", str7, "1105747294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3762933249617304740369918761" + "'", str13, "3762933249617304740369918761");
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
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
        java.lang.String str21 = rSA1.decrypt("866744350265289");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "p" + "'", str13, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "56" + "'", str15, "56");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "121" + "'", str17, "121");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffdh" + "'", str21, "\ufffd\ufffdh");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str17 = rSA1.encrypt("\001\u0736\ufffd\ufffd\ufffd\ufffdf\016\023\036\007");
        java.lang.String str19 = rSA1.encrypt("10571238448");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "269315676759728421700035498122" + "'", str9, "269315676759728421700035498122");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\177\ufffd\ufffdF" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\177\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffdd\016\ufffd\ufffd\ufffd\\" + "'", str13, "\000\ufffdd\016\ufffd\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "505773419930732939003829583242" + "'", str15, "505773419930732939003829583242");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "113094850981201644993871827603" + "'", str17, "113094850981201644993871827603");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "199229774238164605362090861874" + "'", str19, "199229774238164605362090861874");
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\007\ufffd\ufffd\032\ufffd\ufffd\ufffd1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("172724761660472190993592461870");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "719620282757491371057711085739" + "'", str9, "719620282757491371057711085739");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "719620282757491371057711085739" + "'", str11, "719620282757491371057711085739");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\0363\001\ufffd3\030y\003\ufffd\ufffd\u02d1" + "'", str13, "\003\0363\001\ufffd3\030y\003\ufffd\ufffd\u02d1");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\r\ufffd$i" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\r\ufffd$i");
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.decrypt("220617025702073530757413422836");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\026;" + "'", str11, "\001\ufffd\026;");
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
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
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "704026935437307913993542442558" + "'", str9, "704026935437307913993542442558");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "785578578356609797456698303448" + "'", str13, "785578578356609797456698303448");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffdf:F," + "'", str15, "\002\ufffd\ufffd\ufffd\ufffdf:F,");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "l" + "'", str19, "l");
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("101921535994725989");
        java.lang.String str9 = rSA1.encrypt("1616469578732974");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "453996686436123902841207004594" + "'", str3, "453996686436123902841207004594");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "170474601" + "'", str9, "170474601");
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("523");
        java.lang.String str17 = rSA1.encrypt("\006\u07fd\ufffdb");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "&" + "'", str15, "&");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "189" + "'", str17, "189");
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("1062642813");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "228049791507540473917786338002" + "'", str9, "228049791507540473917786338002");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "215403108756483117021610704540" + "'", str11, "215403108756483117021610704540");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\r\002\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\r\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005B\017\f\ufffd\u04b0\ufffd\ufffd" + "'", str17, "\005B\017\f\ufffd\u04b0\ufffd\ufffd");
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "316332456045288255232071544281" + "'", str9, "316332456045288255232071544281");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "664297909402315257528366495335" + "'", str11, "664297909402315257528366495335");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffdMWgd\013\020\ufffd\ufffd\035" + "'", str13, "\002\ufffdMWgd\013\020\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "475046999806208455864043766643" + "'", str17, "475046999806208455864043766643");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd<\013\ufffd\024\f\ufffd\021");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33416696293217511028298522124" + "'", str9, "33416696293217511028298522124");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\021-d\0172\023\ufffd\ufffd\ufffdZ" + "'", str11, "\003\021-d\0172\023\ufffd\ufffd\ufffdZ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "664882248852813149609697428881" + "'", str13, "664882248852813149609697428881");
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("\0072Z!C>H\023\ufffd9\020\ufffd");
        java.lang.String str17 = rSA1.decrypt("324053092273740555737028151137");
        java.lang.String str19 = rSA1.encrypt("3416410363345270");
        java.lang.String str21 = rSA1.encrypt("1985016011121269");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "867230227947720655499707915542" + "'", str9, "867230227947720655499707915542");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "867230227947720655499707915542" + "'", str11, "867230227947720655499707915542");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\u0795\033\003\ufffd\ufffd;" + "'", str13, "\004\u0795\033\003\ufffd\ufffd;");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "290635368794276505149790449863" + "'", str15, "290635368794276505149790449863");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\023\013E\b\ufffd\ufffd^\022\ufffd\006" + "'", str17, "\002\023\013E\b\ufffd\ufffd^\022\ufffd\006");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "122776486770840464572057807445" + "'", str19, "122776486770840464572057807445");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "263813533426575484022952562712" + "'", str21, "263813533426575484022952562712");
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.encrypt("\030");
        java.lang.String str19 = rSA1.encrypt("\000\u072c\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("\007\ufffd\ufffd\021\ufffd\ufffd\ufffd\037\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214265220446511122959937424425" + "'", str9, "214265220446511122959937424425");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "C\032\ufffd\u0210\ufffd\ufffd\024\ufffd_" + "'", str11, "C\032\ufffd\u0210\ufffd\ufffd\024\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32766975103418718352988756354" + "'", str15, "32766975103418718352988756354");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "13824" + "'", str17, "13824");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "57051815992743622315430933078" + "'", str19, "57051815992743622315430933078");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "155224407845986821588883178831" + "'", str21, "155224407845986821588883178831");
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
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
        java.lang.String str21 = rSA1.decrypt("451682510248222031366290752768");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "299308035889124405827882804540" + "'", str11, "299308035889124405827882804540");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\023" + "'", str17, "\002\023");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002?" + "'", str19, "\002?");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\005" + "'", str21, "\001\005");
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str15 = rSA1.decrypt("184");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffdK");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006=5\024\ufffd\ufffd\u0161\u0418\ufffdJ" + "'", str13, "\006=5\024\ufffd\ufffd\u0161\u0418\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\013\u0649\ufffd\ufffd\ufffdW" + "'", str15, "\001\013\u0649\ufffd\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "555930678622114201438980864420" + "'", str17, "555930678622114201438980864420");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "691225625607907878953704471595" + "'", str19, "691225625607907878953704471595");
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str15 = rSA1.encrypt("277938194478251");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "C" + "'", str7, "C");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "179" + "'", str9, "179");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "12" + "'", str13, "12");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "312" + "'", str15, "312");
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.decrypt("192");
        java.lang.String str11 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str13 = rSA1.decrypt("650");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "867153916388160" + "'", str7, "867153916388160");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffdd~AS\024" + "'", str11, "\001\ufffdd~AS\024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("403443141468527212570169909163");
        java.lang.String str13 = rSA1.decrypt("183858544214142161188479561855");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9214575325" + "'", str3, "9214575325");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3836863893" + "'", str5, "3836863893");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9751777752" + "'", str7, "9751777752");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "576537335774417004880780653231" + "'", str11, "576537335774417004880780653231");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd+\003" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd+\003");
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
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
        java.lang.String str23 = rSA1.encrypt("2296355595");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8894650555210199606375218784" + "'", str9, "8894650555210199606375218784");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "516832760364419620913289410296" + "'", str11, "516832760364419620913289410296");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\u0687\ufffd\021\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\u0687\ufffd\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\"\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "228967450232131974364831461306" + "'", str17, "228967450232131974364831461306");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd<\004\ufffd\020\ufffd\u03ab\002" + "'", str19, "\001\ufffd<\004\ufffd\020\ufffd\u03ab\002");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "130498466418179807383548325828" + "'", str23, "130498466418179807383548325828");
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1203887931864483" + "'", str7, "1203887931864483");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1276113996469405" + "'", str13, "1276113996469405");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd!" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ue16c\ufffd\ufffd" + "'", str17, "\001\ue16c\ufffd\ufffd");
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("906422179706046");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "218" + "'", str9, "218");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0019" + "'", str11, "\0019");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "502" + "'", str13, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18" + "'", str17, "18");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1303064629244256" + "'", str7, "1303064629244256");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\027U" + "'", str9, "\ufffd\ufffd\ufffd\027U");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "268584297008077" + "'", str13, "268584297008077");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "336139411031370" + "'", str15, "336139411031370");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "530552581440624" + "'", str17, "530552581440624");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "60787781660923787970392955099" + "'", str23, "60787781660923787970392955099");
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
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
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\f\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1059579112777209" + "'", str15, "1059579112777209");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\020\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\020\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "36710859569203411567351679891" + "'", str21, "36710859569203411567351679891");
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "575820928796050613355197138141" + "'", str9, "575820928796050613355197138141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\\\ufffd\ufffd\ufffd\ufffd\u03bc\020" + "'", str11, "\001\ufffd\\\ufffd\ufffd\ufffd\ufffd\u03bc\020");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "515685681184641914888328984039" + "'", str13, "515685681184641914888328984039");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001r\n\f\ufffd\030\022\021\u03e6q" + "'", str15, "\001r\n\f\ufffd\030\022\021\u03e6q");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "262858001141021" + "'", str19, "262858001141021");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("184677000372197579945525954200");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
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
        rSA1.generateKeys((int) ' ');
        java.lang.String str25 = rSA1.decrypt("574312319062905622730846129322");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "398751285744242443627099175482" + "'", str9, "398751285744242443627099175482");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "398751285744242443627099175482" + "'", str11, "398751285744242443627099175482");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u01bc\013\ufffd\u0655\ufffd\ufffd\ufffd" + "'", str13, "\001\u01bc\013\ufffd\u0655\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44907229168773246260806661256" + "'", str15, "44907229168773246260806661256");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\001U\005\ufffd\ufffd\ufffd\030\031" + "'", str17, "\001\001U\005\ufffd\ufffd\ufffd\030\031");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "436735028359372259988048365966" + "'", str19, "436735028359372259988048365966");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\320\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\ufffd\320\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\007\fgc" + "'", str25, "\007\fgc");
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "250" + "'", str9, "250");
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.decrypt("2354813854350387");
        java.lang.String str19 = rSA1.encrypt("171472342135926510904921586689");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1340964679032831" + "'", str7, "1340964679032831");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffds1i" + "'", str9, "\002\ufffd\ufffds1i");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "547330654988957" + "'", str13, "547330654988957");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "121018910013419" + "'", str15, "121018910013419");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\007\004" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffd\007\004");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1356324710981140" + "'", str19, "1356324710981140");
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("32427175380384275892758226492");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u043a" + "'", str11, "\005\ufffd\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u043a");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "282478285019693090174450516468" + "'", str13, "282478285019693090174450516468");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\006\r\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\006\r\ufffd");
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("224495630513799910487095884514");
        java.lang.String str15 = rSA1.encrypt("474495743389303022429066728937");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\020\ufffd\ufffd" + "'", str5, "\002\020\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9671834529" + "'", str7, "9671834529");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1360859045" + "'", str9, "1360859045");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96348510831478985527934334428" + "'", str13, "96348510831478985527934334428");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "195760156721388583760238158653" + "'", str15, "195760156721388583760238158653");
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
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
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\013\ufffd\ufffd\ufffdb\030\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001[" + "'", str11, "\001[");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "134" + "'", str15, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "151" + "'", str17, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "86" + "'", str19, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "282" + "'", str21, "282");
    }

    @Test
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "186019054526651648881085887380" + "'", str9, "186019054526651648881085887380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffd\ufffd\u2c29\025\ufffd\ufffd\ufffd\022" + "'", str11, "\f\ufffd\ufffd\u2c29\025\ufffd\ufffd\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "985607486239734835864171442470" + "'", str13, "985607486239734835864171442470");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "845583233176429598130924702440" + "'", str15, "845583233176429598130924702440");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd/1" + "'", str17, "\003\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd/1");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "371308479831755949044454462685" + "'", str19, "371308479831755949044454462685");
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.encrypt("1092327233");
        java.lang.String str17 = rSA1.encrypt("38254819939697411230932865771");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.encrypt("\ufffd");
        java.lang.String str23 = rSA1.decrypt("319905546017361532465772896249");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "609423094599134786435749651944" + "'", str9, "609423094599134786435749651944");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "187454162107893495201959135859" + "'", str11, "187454162107893495201959135859");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "143807350943099236204855862543" + "'", str15, "143807350943099236204855862543");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "654061871535580885076914783250" + "'", str17, "654061871535580885076914783250");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "794605163393158046001107465182" + "'", str21, "794605163393158046001107465182");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd\003\ufffd\033\ufffd\ufffd\ufffd\031" + "'", str23, "\002\ufffd\ufffd\003\ufffd\033\ufffd\ufffd\ufffd\031");
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
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
        java.lang.String str21 = rSA1.encrypt("\002=");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1663345442446905" + "'", str13, "1663345442446905");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "326520594772682404616741215980" + "'", str19, "326520594772682404616741215980");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "61769361174093" + "'", str21, "61769361174093");
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("556443160399275552123079795843");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18154107359019484085406602497" + "'", str17, "18154107359019484085406602497");
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("377853615909366030761362174155");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "460" + "'", str13, "460");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8192923529474" + "'", str19, "8192923529474");
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "101" + "'", str3, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\034\ufffd\ufffd%" + "'", str7, "\002\034\ufffd\ufffd%");
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("592549611818494376206249350988");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd0?");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "524" + "'", str11, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "544" + "'", str13, "544");
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("2411260992603826");
        java.lang.String str17 = rSA1.encrypt("294035768");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1028071702528" + "'", str11, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "178357807" + "'", str15, "178357807");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "577915654" + "'", str17, "577915654");
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.decrypt("6647907366");
        java.lang.String str15 = rSA1.encrypt("1682803771672384");
        java.lang.String str17 = rSA1.encrypt("90312674384827345590121248248");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001\ufffd^b\035\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?I?^b??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222185700644396464540351468295" + "'", str9, "222185700644396464540351468295");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325246680515370982836950780901" + "'", str11, "325246680515370982836950780901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007w\003\ufffd<\\\ufffd\ufffd\ufffdn\0223" + "'", str13, "\007w\003\ufffd<\\\ufffd\ufffd\ufffdn\0223");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "574323158656425247309771387210" + "'", str15, "574323158656425247309771387210");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "19368113919220588444777204964" + "'", str17, "19368113919220588444777204964");
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\b\022\n\ufffd\ufffd" + "'", str11, "\004\ufffd\b\022\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "309968113460820050046071211216" + "'", str13, "309968113460820050046071211216");
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\005\ufffd\ufffdhf@v\002\ufffd\ufffd\ufffd\b\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1374369431549628" + "'", str7, "1374369431549628");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\023\ufffd\ufffd\u063d" + "'", str9, "\003\023\ufffd\ufffd\u063d");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\f8s" + "'", str11, "\000\ufffd\ufffd\ufffd\f8s");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffdv\t" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffdv\t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23867156223902236283080730463" + "'", str17, "23867156223902236283080730463");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\b\ufffd\ufffd\"o" + "'", str19, "\ufffd\ufffd\b\ufffd\ufffd\"o");
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
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
        java.lang.String str23 = rSA1.encrypt("328903028443220325288065167565");
        java.lang.String str25 = rSA1.decrypt("307");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193633043633883" + "'", str7, "193633043633883");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1471518457535500" + "'", str13, "1471518457535500");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2105188191125650" + "'", str19, "2105188191125650");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1080972143930301" + "'", str21, "1080972143930301");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "207674718091120" + "'", str23, "207674718091120");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\004\ufffd\ufffd\ufffd\035" + "'", str25, "\004\ufffd\ufffd\ufffd\035");
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("887836866708316");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd(#\f\ufffd\ufffd\ufffd\027");
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u06ba\fI\025\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\023\\\ufffd" + "'", str5, "\003\023\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5778650967" + "'", str7, "5778650967");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4885467597" + "'", str9, "4885467597");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "348246972" + "'", str11, "348246972");
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.decrypt("1632923298108129");
        rSA1.generateKeys(100);
        java.lang.String str21 = rSA1.decrypt("868835296532413125488670768049");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "524634023573241321702378795505" + "'", str9, "524634023573241321702378795505");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffd\u0292\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffd\u0292\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "514590207860761668186022535816" + "'", str13, "514590207860761668186022535816");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "508780290422617300660582339822" + "'", str15, "508780290422617300660582339822");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\n\ufffd\ufffd\006\ufffd$" + "'", str17, "\002\ufffd\n\ufffd\ufffd\006\ufffd$");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\u02d4\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\u02d4\ufffd\ufffd");
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("722565187549046");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\003\ufffd\ufffd\ufffdf" + "'", str11, "\006\ufffd\ufffd\003\ufffd\ufffd\ufffdf");
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
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
        rSA1.generateKeys((int) '#');
        java.lang.String str23 = rSA1.encrypt("288");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "72" + "'", str13, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "275979328843379844977440070306" + "'", str17, "275979328843379844977440070306");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "634739539468748337176361578157" + "'", str19, "634739539468748337176361578157");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1645707622" + "'", str23, "1645707622");
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("85317131416827023530889570588");
        java.lang.String str15 = rSA1.encrypt("230392568664349877198980463493");
        java.lang.String str17 = rSA1.encrypt("414008651302373171950419774429");
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.encrypt("50");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104766358892333141639060315546" + "'", str9, "104766358892333141639060315546");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122049477147741391364276052878" + "'", str11, "122049477147741391364276052878");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\035\ufffdd\017|" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\035\ufffdd\017|");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "312153845361876754854995519838" + "'", str15, "312153845361876754854995519838");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "487323200076296631570658718657" + "'", str17, "487323200076296631570658718657");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "501010136154472" + "'", str21, "501010136154472");
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\u672b\ufffd\n\013j");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43" + "'", str11, "43");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001)" + "'", str13, "\001)");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "390" + "'", str15, "390");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "340" + "'", str17, "340");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "277667370925612524054661667390" + "'", str9, "277667370925612524054661667390");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\u031f\017\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\u031f\017\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "168420578214361675727751047704" + "'", str13, "168420578214361675727751047704");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3136675340019613080962346800" + "'", str15, "3136675340019613080962346800");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "304644926217063042864086647538" + "'", str17, "304644926217063042864086647538");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "298291462916582420211010407803" + "'", str19, "298291462916582420211010407803");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffd\ufffdfp\031\ufffd\ufffd" + "'", str21, "\000\ufffd\ufffd\ufffdfp\031\ufffd\ufffd");
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("55");
        java.lang.String str19 = rSA1.encrypt("1603037267069329");
        java.lang.String str21 = rSA1.encrypt("1104207101772250964281680622285");
        java.lang.String str23 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdh");
        java.lang.String str25 = rSA1.encrypt("1569952931426523");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "824515529101615" + "'", str7, "824515529101615");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1627802429921006" + "'", str13, "1627802429921006");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "310" + "'", str17, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "303" + "'", str21, "303");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "145" + "'", str23, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "14" + "'", str25, "14");
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.encrypt("1858995041484385");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1059000650815057" + "'", str13, "1059000650815057");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2104070507833959" + "'", str15, "2104070507833959");
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr\013\ufffd");
        java.lang.String str13 = rSA1.encrypt("208");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("638007806");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172" + "'", str5, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "192" + "'", str9, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "41" + "'", str11, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "239" + "'", str13, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd)\032\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd)\032\ufffd");
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("470860891773042");
        java.lang.String str9 = rSA1.decrypt("10");
        java.lang.String str11 = rSA1.encrypt("456915798193527501688717312948");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\u076c\ufffd\ufffd" + "'", str7, "\004\u076c\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\u01cd\ufffduV" + "'", str9, "\004\ufffd\u01cd\ufffduV");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2293989198381471" + "'", str11, "2293989198381471");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
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
        java.lang.String str21 = rSA1.decrypt("2237885470");
        java.lang.String str23 = rSA1.decrypt("406606455");
        java.lang.String str25 = rSA1.encrypt("873565170810554255345883101159");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "113354884548781" + "'", str7, "113354884548781");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "703" + "'", str15, "703");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "F" + "'", str19, "F");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "300" + "'", str25, "300");
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.encrypt("120278723214103938881357741819");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd-\035\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1210684002168478" + "'", str7, "1210684002168478");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "735" + "'", str13, "735");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "535" + "'", str15, "535");
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("2228954831817383");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "844304364718047927683048145471" + "'", str9, "844304364718047927683048145471");
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        java.lang.String str13 = rSA1.decrypt("2836091720111680");
        java.lang.String str15 = rSA1.decrypt("3416410363345270");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2936258441" + "'", str3, "2936258441");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2265136174" + "'", str7, "2265136174");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4605713307" + "'", str9, "4605713307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4856166219" + "'", str11, "4856166219");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\tr" + "'", str15, "\000\ufffd\ufffd\tr");
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
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
        java.lang.String str21 = rSA1.encrypt("47829690000000");
        java.lang.String str23 = rSA1.decrypt("87203191126925675072023416378");
        java.lang.String str25 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffdy'\b");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "520870690229168652086593314973" + "'", str9, "520870690229168652086593314973");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "520870690229168652086593314973" + "'", str11, "520870690229168652086593314973");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\025\ufffd\ufffd\023\ufffd\ufffd23w" + "'", str13, "\007\025\ufffd\ufffd\023\ufffd\ufffd23w");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "202643402008429575558402784562" + "'", str15, "202643402008429575558402784562");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "640760952385628752201028165665" + "'", str21, "640760952385628752201028165665");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffd" + "'", str23, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "466973981575237019859816122732" + "'", str25, "466973981575237019859816122732");
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
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
        java.lang.String str21 = rSA1.decrypt("262326345125934");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "428791202870174789919554446198" + "'", str9, "428791202870174789919554446198");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "89933138050646304048600721814" + "'", str11, "89933138050646304048600721814");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "119144618650657927037145677996" + "'", str17, "119144618650657927037145677996");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "361193981787846033038621830925" + "'", str19, "361193981787846033038621830925");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffdjx\177\ufffd/{\017T0`U" + "'", str21, "\002\ufffdjx\177\ufffd/{\017T0`U");
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        java.lang.String str15 = rSA1.decrypt("829");
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "524" + "'", str13, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "28" + "'", str17, "28");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
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
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "591151907227331365990701087829" + "'", str9, "591151907227331365990701087829");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdYa\027" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffdYa\027");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "441205512135924384879605349952" + "'", str13, "441205512135924384879605349952");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1275531877619723" + "'", str17, "1275531877619723");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "941553010760624" + "'", str19, "941553010760624");
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("945892428");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\001\ufffd\001b");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\r" + "'", str7, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\u1089+" + "'", str13, "\007\u1089+");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "382160078275637" + "'", str15, "382160078275637");
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.encrypt("9047872");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3317754450237842" + "'", str7, "3317754450237842");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "178" + "'", str11, "178");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27" + "'", str13, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "152" + "'", str15, "152");
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\034" + "'", str5, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "125" + "'", str7, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1595308127326493" + "'", str13, "1595308127326493");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("\030");
        java.lang.String str17 = rSA1.encrypt("339257337319992927037122241849");
        java.lang.String str19 = rSA1.decrypt("552243905166864160734208974669");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002i" + "'", str7, "\002i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O" + "'", str9, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001t" + "'", str11, "\001t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "123" + "'", str15, "123");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "245" + "'", str17, "245");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\n" + "'", str19, "\002\n");
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("844202742226834");
        java.lang.String str11 = rSA1.encrypt("66");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "126" + "'", str11, "126");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}
