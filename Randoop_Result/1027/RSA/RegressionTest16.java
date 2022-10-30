package RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test8001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8001");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.String str15 = rSA1.decrypt("2533230355141144");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37805074531238270313" + "'", str11, "37805074531238270313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\u0651\177w\031\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\u0651\177w\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffdsU0" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffdsU0");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8002");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("115020507562074026553288610924");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1441731543145281" + "'", str7, "1441731543145281");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\002\002\ufffd\ufffd" + "'", str15, "\007\002\002\ufffd\ufffd");
    }

    @Test
    public void test8003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8003");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.decrypt("3226856015400695");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3583892077" + "'", str3, "3583892077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1306791879" + "'", str7, "1306791879");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2241527780" + "'", str9, "2241527780");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1316575989" + "'", str11, "1316575989");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffdh,0^\020\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffdh,0^\020\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8004");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("6025674780");
        java.lang.String str11 = rSA1.decrypt("1565011048071623");
        java.lang.String str13 = rSA1.decrypt("1335293793");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2530373058" + "'", str9, "2530373058");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$~\177," + "'", str11, "$~\177,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8005");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.decrypt("430269816702801749253730374585");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\020\ufffdX\177\ufffdai");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffd");
        java.lang.String str19 = rSA1.encrypt("81625825445594");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1188532418658735" + "'", str11, "1188532418658735");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005Q\\\ufffd\ufffdB" + "'", str13, "\005Q\\\ufffd\ufffdB");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "942344968987235" + "'", str15, "942344968987235");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "974146487952064" + "'", str17, "974146487952064");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1424112787599635" + "'", str19, "1424112787599635");
    }

    @Test
    public void test8006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8006");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "199856479806277871680549082454" + "'", str9, "199856479806277871680549082454");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "47159816222885802771423291079" + "'", str11, "47159816222885802771423291079");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "650303228769912278824492525202" + "'", str13, "650303228769912278824492525202");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd+" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd+");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "626320931795362499309598505513" + "'", str19, "626320931795362499309598505513");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8007");
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
        java.lang.String str25 = rSA1.encrypt("336990947076518486848398398949");
        java.lang.String str27 = rSA1.encrypt("162263194883640");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1709157358416164" + "'", str7, "1709157358416164");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "666160383539117" + "'", str13, "666160383539117");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\013\f\ufffdO" + "'", str15, "\001\ufffd\ufffd\013\f\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\b\ufffd#i" + "'", str19, "\b\ufffd#i");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "359933423" + "'", str21, "359933423");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\ufffd\\" + "'", str23, "\005\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1565081442" + "'", str25, "1565081442");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1415291835" + "'", str27, "1415291835");
    }

    @Test
    public void test8008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8008");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        java.lang.String str15 = rSA1.encrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("\n\ufffd\ufffd\ufffd\ufffd4q\030\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1510303024056532" + "'", str15, "1510303024056532");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "356" + "'", str19, "356");
    }

    @Test
    public void test8009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8009");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.decrypt("611943475129151");
        java.lang.String str15 = rSA1.decrypt("1053810964353719");
        java.lang.String str17 = rSA1.decrypt("14663681160334126644241449642");
        java.lang.String str19 = rSA1.decrypt("6883655097");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "128" + "'", str9, "128");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001$" + "'", str11, "\001$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\016" + "'", str13, "\001\016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "(" + "'", str17, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test8010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8010");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "112" + "'", str3, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "114" + "'", str7, "114");
    }

    @Test
    public void test8011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8011");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str7 = rSA1.encrypt("507616451328483844912348153752");
        java.lang.String str9 = rSA1.decrypt("72424157986486990855074541323");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "389" + "'", str3, "389");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "195" + "'", str7, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\031" + "'", str9, "\031");
    }

    @Test
    public void test8012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8012");
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
        java.lang.String str21 = rSA1.encrypt("\006\035\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.decrypt("2499233516");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "465888163383785671301777710038" + "'", str9, "465888163383785671301777710038");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "465888163383785671301777710038" + "'", str11, "465888163383785671301777710038");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u3fb6" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\u3fb6");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "459171254566303270832095230180" + "'", str15, "459171254566303270832095230180");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "276208709700877832656799964265" + "'", str21, "276208709700877832656799964265");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\b\036\016q\022\ufffd\ufffd\017\ufffd\ufffd" + "'", str23, "\003\ufffd\b\036\016q\022\ufffd\ufffd\017\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8013");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("755629646");
        java.lang.String str19 = rSA1.decrypt("641193625103900470470654114892");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "713577776066241215868873970144" + "'", str9, "713577776066241215868873970144");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "72806836146624355094146321381" + "'", str11, "72806836146624355094146321381");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\002\ufffd\ufffd\ufffd\ufffd\003h\f?\033" + "'", str13, "\003\ufffd\ufffd\002\ufffd\ufffd\ufffd\ufffd\003h\f?\033");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\u0656\ufffd\ufffd\ufffd\ufffdy" + "'", str17, "\003\ufffd\ufffd\u0656\ufffd\ufffd\ufffd\ufffdy");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd?\n}" + "'", str19, "\001\ufffd\ufffd\ufffd\ufffd?\n}");
    }

    @Test
    public void test8014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8014");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("1743865898247515");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8917599670" + "'", str3, "8917599670");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str5, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8015");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        java.lang.String str11 = rSA1.encrypt("511332241021549353646337802365");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "54" + "'", str5, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "553" + "'", str9, "553");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "266" + "'", str11, "266");
    }

    @Test
    public void test8016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8016");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("528192452687346010705232238251");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "582661947034927590537563761027" + "'", str9, "582661947034927590537563761027");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "646948630515126868113568414432" + "'", str11, "646948630515126868113568414432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4194304" + "'", str13, "4194304");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\007\ufffd\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8017");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.decrypt("170142287906490331954515313942");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd&" + "'", str5, "\ufffd\ufffd&");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test8018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8018");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("5620871555");
        java.lang.String str5 = rSA1.decrypt("211845162740245");
        java.lang.String str7 = rSA1.encrypt("34863145760273433507764299721");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\b" + "'", str5, "\001\b");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "343" + "'", str7, "343");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8019");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.decrypt("107276242111474455818604865969");
        java.lang.String str21 = rSA1.encrypt("1563226434239877");
        java.lang.String str23 = rSA1.decrypt("228415793148138197610220971179");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1214366635748883" + "'", str7, "1214366635748883");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "573695442184337" + "'", str13, "573695442184337");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002G" + "'", str19, "\002G");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "532" + "'", str21, "532");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd" + "'", str23, "\002\ufffd");
    }

    @Test
    public void test8020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8020");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("463");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("4597652432");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\u060c" + "'", str3, "\001\ufffd\ufffd\u060c");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "823188361301772" + "'", str5, "823188361301772");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1818938908565423" + "'", str7, "1818938908565423");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffdw\r\ufffd\ufffd{" + "'", str9, "\006\ufffdw\r\ufffd\ufffd{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\022" + "'", str13, "\022");
    }

    @Test
    public void test8021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8021");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.String str13 = rSA1.decrypt("329114188050351");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "571" + "'", str11, "571");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003L" + "'", str13, "\003L");
    }

    @Test
    public void test8022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8022");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.decrypt("755629646");
        java.lang.String str17 = rSA1.decrypt("1053558225107145");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39190231688256293288679491575" + "'", str9, "39190231688256293288679491575");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "470495714554571254838371689769" + "'", str11, "470495714554571254838371689769");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "128257594789039403525100695171" + "'", str13, "128257594789039403525100695171");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003S9\024\ufffd\ufffd\u0783\ufffd\ufffd" + "'", str15, "\003S9\024\ufffd\ufffd\u0783\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8023");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43" + "'", str11, "43");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001)" + "'", str13, "\001)");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "390" + "'", str15, "390");
    }

    @Test
    public void test8024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8024");
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
        java.lang.String str21 = rSA1.decrypt("441737597486003899578395714219");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "336552930308198272327470108269" + "'", str9, "336552930308198272327470108269");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\u07b9\ufffd=&&" + "'", str11, "\004\ufffd\ufffd\ufffd\u07b9\ufffd=&&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "21122905589312577297888263898" + "'", str13, "21122905589312577297888263898");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffdg\007\"\ufffd\ufffd\ufffd\001" + "'", str15, "\002\ufffd\ufffdg\007\"\ufffd\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "290794017641848898059163207178" + "'", str19, "290794017641848898059163207178");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004C\017\ufffd\ufffd\ufffdt9\031\ufffd=" + "'", str21, "\004C\017\ufffd\ufffd\ufffdt9\031\ufffd=");
    }

    @Test
    public void test8025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8025");
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
        java.lang.String str23 = rSA1.decrypt("4021493906");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "447" + "'", str17, "447");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001Y" + "'", str19, "\001Y");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\"\ufffd\ufffd\ufffd\ufffd)" + "'", str23, "\002\ufffd\"\ufffd\ufffd\ufffd\ufffd)");
    }

    @Test
    public void test8026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8026");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("325053041126851022637890970422");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffdK\020\ufffdX");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\034\ufffd" + "'", str5, "\001\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\005\ufffd(:\006\ufffd\ufffd\ufffd" + "'", str9, "\b\ufffd\005\ufffd(:\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "656893301877239035106087744155" + "'", str11, "656893301877239035106087744155");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "623553339296348727246324957490" + "'", str13, "623553339296348727246324957490");
    }

    @Test
    public void test8027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8027");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("529936916062749373766053298845");
        java.lang.String str13 = rSA1.encrypt("1037702314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1549064172" + "'", str5, "1549064172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "78860052" + "'", str7, "78860052");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "270851851105827963551927481806" + "'", str11, "270851851105827963551927481806");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "213633708982252674264531989421" + "'", str13, "213633708982252674264531989421");
    }

    @Test
    public void test8028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8028");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("8589662889");
        java.lang.String str19 = rSA1.decrypt("26650871780452530858575104672");
        java.lang.String str21 = rSA1.encrypt("\004\ufffd\ufffd\u05d9\ufffd\ufffdO");
        java.lang.String str23 = rSA1.decrypt("357690512925543535751245880674");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6i\n\ufffd\ufffd\ufffd\ufffd\002\ufffd\u029d`" + "'", str11, "6i\n\ufffd\ufffd\ufffd\ufffd\002\ufffd\u029d`");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffdg\027\ufffd" + "'", str17, "\007\ufffd\ufffdg\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\031" + "'", str19, "\006\ufffd\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "698197154070915" + "'", str21, "698197154070915");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\ufffd]0*>" + "'", str23, "\004\ufffd\ufffd]0*>");
    }

    @Test
    public void test8029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8029");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "112519798788739419676303236036" + "'", str9, "112519798788739419676303236036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112519798788739419676303236036" + "'", str11, "112519798788739419676303236036");
    }

    @Test
    public void test8030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8030");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("10019204889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("1373484718");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\017\ufffd\ufffd\ufffdm" + "'", str3, "\002\017\ufffd\ufffd\ufffdm");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1960413610001845" + "'", str5, "1960413610001845");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1411653996195535" + "'", str7, "1411653996195535");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "342200768060668" + "'", str9, "342200768060668");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test8031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8031");
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
        java.lang.String str23 = rSA1.decrypt("4586040327");
        java.lang.String str25 = rSA1.encrypt("2469677799813595");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "335339435298896884846063865845" + "'", str9, "335339435298896884846063865845");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "335339435298896884846063865845" + "'", str11, "335339435298896884846063865845");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\026\021\021\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\026\021\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "444854648868016459272597881665" + "'", str15, "444854648868016459272597881665");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b,\022\ufffd\035\ufffd\ufffd\ufffd\006" + "'", str17, "\b,\022\ufffd\035\ufffd\ufffd\ufffd\006");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "145" + "'", str25, "145");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test8032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8032");
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
        java.lang.String str25 = rSA1.decrypt("583961912161072827881466976222");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\r\ufffd\ufffd\ufffd4\023\ufffd\ufffd\ufffd&" + "'", str11, "\r\ufffd\ufffd\ufffd4\023\ufffd\ufffd\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "608165939406935397999291072418" + "'", str13, "608165939406935397999291072418");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "197616240305006838300160544295" + "'", str19, "197616240305006838300160544295");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "164489084690240535834863815607" + "'", str21, "164489084690240535834863815607");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
    }

    @Test
    public void test8033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8033");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "652332080583356177696159045063" + "'", str9, "652332080583356177696159045063");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "571726754569141692031322338193" + "'", str11, "571726754569141692031322338193");
    }

    @Test
    public void test8034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8034");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.decrypt("158305255855005487799219720195");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str21 = rSA1.encrypt("173142578916498161473180352982");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1568300254685394" + "'", str7, "1568300254685394");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "86" + "'", str15, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4227787483311514225998717254" + "'", str21, "4227787483311514225998717254");
    }

    @Test
    public void test8035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8035");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("7320283309");
        java.lang.String str7 = rSA1.encrypt("6367626140");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1073830776" + "'", str3, "1073830776");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\021\ufffdBq" + "'", str5, "\001\021\ufffdBq");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "426068365" + "'", str7, "426068365");
    }

    @Test
    public void test8036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8036");
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
        java.lang.String str27 = rSA1.decrypt("513421642710820");
        java.lang.String str29 = rSA1.decrypt("524634023573241321702378795505");
        java.lang.String str31 = rSA1.encrypt("339893460627064546080859814885");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1062735705204039" + "'", str7, "1062735705204039");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2632502919348315" + "'", str13, "2632502919348315");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\034\ufffdXMI" + "'", str15, "\t\ufffd\034\ufffdXMI");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\034\ufffd\n" + "'", str19, "\034\ufffd\n");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1670970156" + "'", str21, "1670970156");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\016\ufffd\024)" + "'", str23, "\016\ufffd\024)");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd" + "'", str25, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "vSOz" + "'", str27, "vSOz");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "'\001\ufffd" + "'", str29, "'\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "749833993" + "'", str31, "749833993");
    }

    @Test
    public void test8037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8037");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "264727293254254097814443936369" + "'", str9, "264727293254254097814443936369");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\n\016\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\n\016\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "eX\036\001\ufffd\ufffd\ufffd\005\021\ufffd p" + "'", str17, "eX\036\001\ufffd\ufffd\ufffd\005\021\ufffd p");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd-\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd-\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "31019167454093425276705833938" + "'", str21, "31019167454093425276705833938");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\037\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\000\ufffd\037\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8038");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.encrypt("785884193558166");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "191" + "'", str3, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
    }

    @Test
    public void test8039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8039");
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
        java.lang.String str21 = rSA1.encrypt("2139709610626709");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71857209571514729257579609962" + "'", str9, "71857209571514729257579609962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffdr\177\ufffd\u06e9\ufffd\ufffd\003\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffdr\177\ufffd\u06e9\ufffd\ufffd\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "222819922381033894457452865168" + "'", str15, "222819922381033894457452865168");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "707277819962436574126161095589" + "'", str21, "707277819962436574126161095589");
    }

    @Test
    public void test8040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8040");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.encrypt("1092327233");
        java.lang.String str17 = rSA1.encrypt("38254819939697411230932865771");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "447917223430656554397030442773" + "'", str11, "447917223430656554397030442773");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "202646117746158845873328081130" + "'", str15, "202646117746158845873328081130");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "480253759282402567479413351576" + "'", str17, "480253759282402567479413351576");
    }

    @Test
    public void test8041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8041");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("6025674780");
        java.lang.String str11 = rSA1.encrypt("643704156317391201525717451948");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1096713921" + "'", str9, "1096713921");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1708522146" + "'", str11, "1708522146");
    }

    @Test
    public void test8042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8042");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("258");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1700947999" + "'", str11, "1700947999");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2506245010" + "'", str13, "2506245010");
    }

    @Test
    public void test8043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8043");
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
        java.lang.String str21 = rSA1.decrypt("608928658443321641586881418110");
        java.lang.String str23 = rSA1.encrypt("12965768513736791442540318394");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\017\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??8?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "112756659067530148878450748934" + "'", str9, "112756659067530148878450748934");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "332394676231473986715347795773" + "'", str11, "332394676231473986715347795773");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "266030067895289839733587659596" + "'", str13, "266030067895289839733587659596");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffdj\n\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\ufffdj\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "179297028257253348145769125431" + "'", str19, "179297028257253348145769125431");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "285724571428440174643805508398" + "'", str23, "285724571428440174643805508398");
    }

    @Test
    public void test8044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8044");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????;\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "541102285621871" + "'", str7, "541102285621871");
    }

    @Test
    public void test8045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8045");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("61");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8690005798" + "'", str3, "8690005798");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7363191797" + "'", str7, "7363191797");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10990920318" + "'", str9, "10990920318");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2109231384" + "'", str11, "2109231384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "513868423106406500593" + "'", str15, "513868423106406500593");
    }

    @Test
    public void test8046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8046");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("498517715595236544046073650611");
        java.lang.String str9 = rSA1.encrypt("20872893387406392428226946911");
        java.lang.String str11 = rSA1.decrypt("2664057008392299");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+\034\ufffd\034\ufffd\ufffd\ufffd\026'" + "'", str7, "+\034\ufffd\034\ufffd\ufffd\ufffd\026'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7992038280361967032345678727" + "'", str9, "7992038280361967032345678727");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffdb-\003\007\ufffd\ufffd\r" + "'", str11, "\ufffd\ufffd\ufffdb-\003\007\ufffd\ufffd\r");
    }

    @Test
    public void test8047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8047");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("\002t");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("382306363299315393630957444423");
        java.lang.String str17 = rSA1.encrypt("488842307114162286102165662679");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd\\\ufffd\ufffd\ufffd `b\023");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "247673152" + "'", str11, "247673152");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "970843993" + "'", str15, "970843993");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1176700404" + "'", str17, "1176700404");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2139735547" + "'", str19, "2139735547");
    }

    @Test
    public void test8048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8048");
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
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50021567177344646810457776761" + "'", str9, "50021567177344646810457776761");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "623628758316236236231366847340" + "'", str11, "623628758316236236231366847340");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "321593722036993634453211657670" + "'", str17, "321593722036993634453211657670");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "254303159322683235200968027502" + "'", str19, "254303159322683235200968027502");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\007\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8049");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "341570934632292578240391720565" + "'", str9, "341570934632292578240391720565");
    }

    @Test
    public void test8050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8050");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str17 = rSA1.encrypt("73");
        java.lang.String str19 = rSA1.decrypt("1872200516786295");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "408443932852117329612088340429" + "'", str15, "408443932852117329612088340429");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2821751010091" + "'", str17, "2821751010091");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\021\u0277\ufffd\ufffd\ufffd\ufffd\ufffdZ\037\ufffdI" + "'", str19, "\006\021\u0277\ufffd\ufffd\ufffd\ufffd\ufffdZ\037\ufffdI");
    }

    @Test
    public void test8051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8051");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str15 = rSA1.decrypt("473");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\u0362\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "142301037525798339497070598357" + "'", str9, "142301037525798339497070598357");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd9\024\ufffd9YW" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd9\024\ufffd9YW");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd3" + "'", str13, "\005\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd3");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\u07ce\ufffd\ufffd\u02ffVP" + "'", str15, "\003\ufffd\u07ce\ufffd\ufffd\u02ffVP");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "450036204932046211715417800181" + "'", str17, "450036204932046211715417800181");
    }

    @Test
    public void test8052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8052");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("292007140694737696201256199778");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.decrypt("1798148034220344");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b,#\037\ufffd\ufffd" + "'", str3, "\b,#\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1695386283922506" + "'", str5, "1695386283922506");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2861639485288969" + "'", str7, "2861639485288969");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n|\b\ufffd\ufffdxB" + "'", str9, "\n|\b\ufffd\ufffdxB");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\020\uba5b" + "'", str11, "\002\ufffd\ufffd\020\uba5b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffduV\00511" + "'", str13, "\n\ufffduV\00511");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2228669302813888" + "'", str15, "2228669302813888");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\f\ufffd" + "'", str19, "\ufffd\f\ufffd");
    }

    @Test
    public void test8053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8053");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "725773879583929915419371455993" + "'", str9, "725773879583929915419371455993");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "740871142122580118596424033321" + "'", str11, "740871142122580118596424033321");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "56055757312673473618240141977" + "'", str13, "56055757312673473618240141977");
    }

    @Test
    public void test8054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8054");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str9 = rSA1.decrypt("2602093156");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\ufffd+");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "116" + "'", str11, "116");
    }

    @Test
    public void test8055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8055");
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
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "732482206812979753373890862250" + "'", str9, "732482206812979753373890862250");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\u06e8\ufffd\ufffd\ufffd\ufffdYd" + "'", str11, "\004\u06e8\ufffd\ufffd\ufffd\ufffdYd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "541583203008762189986537907823" + "'", str13, "541583203008762189986537907823");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "523114639500043930517912662518" + "'", str15, "523114639500043930517912662518");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "178424889921440082269797265172" + "'", str19, "178424889921440082269797265172");
    }

    @Test
    public void test8056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8056");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007\u0454\ufffd\ufffd\n\ufffdq");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?zv\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "85950686734945632978076838835" + "'", str9, "85950686734945632978076838835");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "271251973901570042777326976589" + "'", str11, "271251973901570042777326976589");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "137081291599552079433245381201" + "'", str13, "137081291599552079433245381201");
    }

    @Test
    public void test8057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8057");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("10590563594");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        java.lang.String str13 = rSA1.encrypt("5520587949");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffdA" + "'", str3, "\004\ufffd\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1105947739873319" + "'", str5, "1105947739873319");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1314279111487273" + "'", str7, "1314279111487273");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1681642696892817" + "'", str11, "1681642696892817");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "22487608485390" + "'", str13, "22487608485390");
    }

    @Test
    public void test8058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8058");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.encrypt("215993178106041042431736613910");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "356932139687597263244294488576" + "'", str3, "356932139687597263244294488576");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "280969863006163750459778677992" + "'", str5, "280969863006163750459778677992");
    }

    @Test
    public void test8059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8059");
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
        java.lang.String str21 = rSA1.decrypt("16232307934981");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53013414391089" + "'", str11, "53013414391089");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2028242992761461" + "'", str13, "2028242992761461");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "642293657441030" + "'", str15, "642293657441030");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "126977448778525629114768894501" + "'", str19, "126977448778525629114768894501");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\030\ufffd\ufffd\022\020\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\006\030\ufffd\ufffd\022\020\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8060");
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
        java.lang.String str21 = rSA1.decrypt("618078253635748773983191495672");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "258429848273748943107232703007" + "'", str9, "258429848273748943107232703007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd/\035\ufffd\ufffd\ufffd\ufffd\033\ufffd" + "'", str11, "\004\ufffd/\035\ufffd\ufffd\ufffd\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "538911606886111131763393881041" + "'", str13, "538911606886111131763393881041");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6970997556750112029373679986" + "'", str15, "6970997556750112029373679986");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "62435548844516682471793912331" + "'", str17, "62435548844516682471793912331");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "293747310699143789626376631934" + "'", str19, "293747310699143789626376631934");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006.\030\ufffd\001\ufffdd\004\ufffd\ufffd\ufffd\000" + "'", str21, "\006.\030\ufffd\001\ufffdd\004\ufffd\ufffd\ufffd\000");
    }

    @Test
    public void test8061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8061");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        java.lang.String str15 = rSA1.encrypt("54326269148954289324151592843");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "425" + "'", str13, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "256" + "'", str15, "256");
    }

    @Test
    public void test8062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8062");
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
        java.lang.String str21 = rSA1.decrypt("4374497655568333171462306324");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "184711561682391471820070546830" + "'", str9, "184711561682391471820070546830");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "211283914164144445275163958589" + "'", str11, "211283914164144445275163958589");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\034\016\ufffd\t\u02ca\ufffdQxv" + "'", str13, "\003\ufffd\034\016\ufffd\t\u02ca\ufffdQxv");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "183854278421049002722162476915" + "'", str15, "183854278421049002722162476915");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "25663667508555049857397472301" + "'", str19, "25663667508555049857397472301");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8063");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("658898867789042");
        java.lang.String str15 = rSA1.decrypt("484167778");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\013\006;");
        java.lang.String str19 = rSA1.encrypt("309060512529359254506659186946");
        java.lang.String str21 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\"\027x\025\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "112" + "'", str5, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "363" + "'", str7, "363");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "818" + "'", str9, "818");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "K" + "'", str13, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "203" + "'", str17, "203");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5" + "'", str19, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "28" + "'", str21, "28");
    }

    @Test
    public void test8064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8064");
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
        java.lang.String str23 = rSA1.decrypt("1899147800627853");
        java.lang.String str25 = rSA1.encrypt("340722847330069004495623463022");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "367094419518520168497494055215" + "'", str9, "367094419518520168497494055215");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "79864736411916922400596786542" + "'", str13, "79864736411916922400596786542");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7690683566401751242693958538" + "'", str15, "7690683566401751242693958538");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "451263915483185025029680784334" + "'", str17, "451263915483185025029680784334");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "406210463770643808185984867821" + "'", str19, "406210463770643808185984867821");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "35757017887665026080222422259" + "'", str21, "35757017887665026080222422259");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\030\ufffd\013\ufffd\ufffd\uede1\ufffd\ufffd" + "'", str23, "\b\030\ufffd\013\ufffd\ufffd\uede1\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100494740557185666869120151053" + "'", str25, "100494740557185666869120151053");
    }

    @Test
    public void test8065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8065");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("462059788404288851690924494526");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "46115499085755836667101678759" + "'", str9, "46115499085755836667101678759");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002Hd\037\ufffd\ufffd\027\ufffd\ufffd" + "'", str11, "\002Hd\037\ufffd\ufffd\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "265903817358929469152422101774" + "'", str13, "265903817358929469152422101774");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "435507791835852033995201534471" + "'", str15, "435507791835852033995201534471");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "49409908602189379090672474024" + "'", str17, "49409908602189379090672474024");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8066");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        java.lang.String str15 = rSA1.encrypt("593904299716151995306964564094");
        java.lang.String str17 = rSA1.encrypt("\nt\"\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7516865509350965248" + "'", str9, "7516865509350965248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffdAm*q" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffdAm*q");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1532278301220703125" + "'", str13, "1532278301220703125");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "728685448417238752607784038284" + "'", str15, "728685448417238752607784038284");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "726083136438197991700239468414" + "'", str17, "726083136438197991700239468414");
    }

    @Test
    public void test8067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8067");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\000\ufffdL\024\ufffd\ufffd\ufffd>\032");
        java.lang.String str13 = rSA1.encrypt("765176053881463928584618351126");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "421332398380875917027018332384" + "'", str11, "421332398380875917027018332384");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "462725714997612537277107631186" + "'", str13, "462725714997612537277107631186");
    }

    @Test
    public void test8068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8068");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "796187974094711583794744867972" + "'", str9, "796187974094711583794744867972");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "217331403624898901753024523023" + "'", str11, "217331403624898901753024523023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\n\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8069");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.decrypt("429740296");
        java.lang.String str7 = rSA1.encrypt("g\022\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("181594806096734");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\030\ufffd\ufffd\000\ufffd\ufffd\ufffd\ufffd\u0414" + "'", str3, "\003\030\ufffd\ufffd\000\ufffd\ufffd\ufffd\ufffd\u0414");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\024\ufffd\ufffd\ufffd(" + "'", str5, "\002\ufffd\024\ufffd\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97842966074436745619502077212" + "'", str7, "97842966074436745619502077212");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "346116187873076242609570233501" + "'", str9, "346116187873076242609570233501");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\006\ufffd\ufffd\ufffd\ufffd\ufffdP\013" + "'", str11, "\004\006\ufffd\ufffd\ufffd\ufffd\ufffdP\013");
    }

    @Test
    public void test8070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8070");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("503300907057025597685177930957");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3430192777308556" + "'", str7, "3430192777308556");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2180649266" + "'", str11, "2180649266");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "948523221" + "'", str13, "948523221");
    }

    @Test
    public void test8071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8071");
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
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "227" + "'", str15, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "361" + "'", str17, "361");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd9<" + "'", str21, "\ufffd9<");
    }

    @Test
    public void test8072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8072");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90" + "'", str11, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8073");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        java.lang.String str13 = rSA1.decrypt("42255066403800866001807416701");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1345664656942050" + "'", str7, "1345664656942050");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2011319384860219" + "'", str9, "2011319384860219");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "418578772432197" + "'", str11, "418578772432197");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\u06fc" + "'", str13, "\003\ufffd\u06fc");
    }

    @Test
    public void test8074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8074");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("5483845661");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "502636438350608380598373975774" + "'", str3, "502636438350608380598373975774");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd9\002\ufffd" + "'", str5, "\001\ufffd\ufffd\ufffd\ufffd\ufffd9\002\ufffd");
    }

    @Test
    public void test8075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8075");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("936488068250800");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "456" + "'", str7, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "299" + "'", str9, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001{" + "'", str13, "\001{");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test8076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8076");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1663121384982181");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "529784568386743722464173599561" + "'", str9, "529784568386743722464173599561");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "556901883931016479697045510733" + "'", str11, "556901883931016479697045510733");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001M" + "'", str17, "\001M");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8077");
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
        rSA1.generateKeys((int) 'a');
        java.lang.String str25 = rSA1.encrypt("\005\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd}");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "747752639430330" + "'", str7, "747752639430330");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "679" + "'", str11, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Z" + "'", str19, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Y" + "'", str21, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3845177145634981906556734833" + "'", str25, "3845177145634981906556734833");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8078");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\rMp");
        java.lang.String str7 = rSA1.decrypt("79308455521165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\001\u0191\ufffd\ufffd;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??i??;\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "152" + "'", str5, "152");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\002" + "'", str7, "\002\002");
    }

    @Test
    public void test8079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8079");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\007Os\020\ufffd\ufffd\ufffd\ufffd\006\ufffd\u05b0");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "121" + "'", str11, "121");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8080");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("730903677901316255479995383411");
        java.lang.String str17 = rSA1.encrypt("2566593727806295");
        java.lang.String str19 = rSA1.decrypt("1880546696402128");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffdg%I\003p" + "'", str3, "\001\ufffdg%I\003p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2006116824406747" + "'", str5, "2006116824406747");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "988844670516049" + "'", str7, "988844670516049");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005ocp\016fF" + "'", str9, "\005ocp\016fF");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "668878036194898" + "'", str11, "668878036194898");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "36689324655446212715052735090" + "'", str15, "36689324655446212715052735090");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "41658609746258895464609886435" + "'", str17, "41658609746258895464609886435");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\032\ufffd\ufffd\ufffd\ufffd\u05c9\\\ufffd\ufffdd" + "'", str19, "\032\ufffd\ufffd\ufffd\ufffd\u05c9\\\ufffd\ufffdd");
    }

    @Test
    public void test8081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8081");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("241");
        java.lang.String str15 = rSA1.encrypt("48545501064253568549105436091");
        java.lang.String str17 = rSA1.encrypt("661295819657843");
        java.lang.String str19 = rSA1.encrypt("5192657478");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "258" + "'", str13, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "277" + "'", str15, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "73" + "'", str17, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "29" + "'", str19, "29");
    }

    @Test
    public void test8082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8082");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("612697493508374");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\024\ufffd\ufffd\ufffd\ufffd.\036\ufffd" + "'", str3, "\003\ufffd\024\ufffd\ufffd\ufffd\ufffd.\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "217953462850340769777796098470" + "'", str5, "217953462850340769777796098470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "246638679981703026517587126818" + "'", str7, "246638679981703026517587126818");
    }

    @Test
    public void test8083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8083");
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
        java.lang.String str23 = rSA1.encrypt("1139156719055614");
        java.lang.String str25 = rSA1.encrypt("2036133537334543");
        java.lang.String str27 = rSA1.decrypt("58860555171513227782349588337");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "502831009005462" + "'", str7, "502831009005462");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\024\ufffd\ufffd\030\0304" + "'", str9, "\001\024\ufffd\ufffd\030\0304");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1327700113754251" + "'", str13, "1327700113754251");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "749302764629863" + "'", str15, "749302764629863");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "33521393444507" + "'", str17, "33521393444507");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "17912948940858310042915562858" + "'", str23, "17912948940858310042915562858");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "45307833198791400023920769818" + "'", str25, "45307833198791400023920769818");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str27, "\000\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8084");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8085");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("586614665667193");
        java.lang.String str17 = rSA1.encrypt("351599105432965402456457863394");
        java.lang.String str19 = rSA1.decrypt("120838933");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1656166682402604" + "'", str7, "1656166682402604");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\036" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffdy" + "'", str11, "\007\ufffd\ufffd\ufffdy");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\024\ufffd\ufffd\177\ufffdW?\035" + "'", str15, "\ufffd\ufffd\024\ufffd\ufffd\177\ufffdW?\035");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "34457214064946614288848502187" + "'", str17, "34457214064946614288848502187");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\001\ufffd\001\u07e6\ufffds\006" + "'", str19, "\ufffd\001\ufffd\001\u07e6\ufffds\006");
    }

    @Test
    public void test8086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8086");
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
        java.lang.String str27 = rSA1.encrypt("3285186441083065");
        java.lang.String str29 = rSA1.encrypt("193");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338536161408688913886247798116" + "'", str9, "338536161408688913886247798116");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "372396752965237255897793311902" + "'", str11, "372396752965237255897793311902");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1046037304042212806316254329786" + "'", str13, "1046037304042212806316254329786");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "177" + "'", str17, "177");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "77" + "'", str21, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "183" + "'", str23, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1346096332" + "'", str27, "1346096332");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1827608917" + "'", str29, "1827608917");
    }

    @Test
    public void test8087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8087");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.lang.String str13 = rSA1.encrypt("538466596764584785061881286421");
        java.lang.String str15 = rSA1.decrypt("58701350063669756490450516252");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd-" + "'", str5, "\000\ufffd\ufffd-");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42371998213842471979" + "'", str9, "42371998213842471979");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "567965652937090743523849695819" + "'", str11, "567965652937090743523849695819");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "304447868697755124678319665899" + "'", str13, "304447868697755124678319665899");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\335\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\335\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8088");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        java.lang.String str19 = rSA1.encrypt("7909395280350889787071946765");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "540785181553849640696981690153" + "'", str9, "540785181553849640696981690153");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "79553507160674104312200873421" + "'", str11, "79553507160674104312200873421");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "346666629467920616069724795701" + "'", str13, "346666629467920616069724795701");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3" + "'", str17, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "34" + "'", str19, "34");
    }

    @Test
    public void test8089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8089");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        java.lang.String str13 = rSA1.encrypt("\007\027\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001U" + "'", str11, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "267" + "'", str13, "267");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8090");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str7 = rSA1.encrypt("\006\025\ufffd\002\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "175" + "'", str3, "175");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "815" + "'", str7, "815");
    }

    @Test
    public void test8091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8091");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("344");
        java.lang.String str19 = rSA1.encrypt("1807465654698719");
        rSA1.generateKeys((int) '4');
        java.lang.String str23 = rSA1.decrypt("727767003863518");
        java.lang.String str25 = rSA1.decrypt("476601765364351111659284369399");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "81992209283555078548668890454" + "'", str9, "81992209283555078548668890454");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "120572801410282970577524193889" + "'", str11, "120572801410282970577524193889");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "538" + "'", str17, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "575" + "'", str19, "575");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\ufffd\u0659" + "'", str23, "\b\ufffd\u0659");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\003\ufffd>\031\ufffd" + "'", str25, "\003\ufffd>\031\ufffd");
    }

    @Test
    public void test8092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8092");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1504675092416233" + "'", str11, "1504675092416233");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "448304850966579" + "'", str13, "448304850966579");
    }

    @Test
    public void test8093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8093");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("936488068250800");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("\007\ufffd\ufffd\034\ufffd\ufffd\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336" + "'", str7, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "201" + "'", str9, "201");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001K" + "'", str15, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "118476554725001271878540591758" + "'", str19, "118476554725001271878540591758");
    }

    @Test
    public void test8094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8094");
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
        rSA1.generateKeys((int) '4');
        java.lang.String str27 = rSA1.encrypt("1629156322188599");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52946396470984558411806052752" + "'", str9, "52946396470984558411806052752");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "324262347818687768868436694135" + "'", str11, "324262347818687768868436694135");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "480382535072688921532151665963" + "'", str13, "480382535072688921532151665963");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd8\017\r\u02eb\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd8\017\r\u02eb\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "242653302834834480819434118715" + "'", str17, "242653302834834480819434118715");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "419483051107119131553397664411" + "'", str19, "419483051107119131553397664411");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\ufffd\uae6az<" + "'", str21, "\005\ufffd\ufffd\ufffd\uae6az<");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "217900238128400151569576629864" + "'", str23, "217900238128400151569576629864");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1289299298636664" + "'", str27, "1289299298636664");
    }

    @Test
    public void test8095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8095");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("603377111727349");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\002\u071a\u0715\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("477224622093152716234480757759");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "210324610596169883781542619383" + "'", str11, "210324610596169883781542619383");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "655061682481375098266243706375" + "'", str13, "655061682481375098266243706375");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "840087414750123444458315150617" + "'", str15, "840087414750123444458315150617");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffdI" + "'", str17, "\n\ufffd\ufffd\ufffd\ufffd\ufffdI");
    }

    @Test
    public void test8096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8096");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("2015015253148227");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<\030" + "'", str3, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<\030");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "729112859755457249916086416904" + "'", str5, "729112859755457249916086416904");
    }

    @Test
    public void test8097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8097");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("2448943656306246");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "285660465670403617535430939195" + "'", str9, "285660465670403617535430939195");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd)L\021\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\ufffd)L\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd\ufffd\b\ufffd\017" + "'", str13, "\f\ufffd\ufffd\b\ufffd\017");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffdO" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "945358405544198867902282602698" + "'", str17, "945358405544198867902282602698");
    }

    @Test
    public void test8098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8098");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("11937679036");
        java.lang.String str9 = rSA1.decrypt("229345064807360297497350496341");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "440507860325879386126738947755" + "'", str7, "440507860325879386126738947755");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd3\024\ufffdX2\006" + "'", str9, "\001\ufffd\ufffd3\024\ufffdX2\006");
    }

    @Test
    public void test8099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8099");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.decrypt("611943475129151");
        java.lang.String str15 = rSA1.decrypt("1053810964353719");
        java.lang.String str17 = rSA1.decrypt("14663681160334126644241449642");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "299" + "'", str9, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\032" + "'", str15, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test8100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8100");
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
        java.lang.String str23 = rSA1.decrypt("169445889120383017091538700236");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "623333009526557" + "'", str7, "623333009526557");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "P" + "'", str23, "P");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8101");
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
        java.lang.String str23 = rSA1.decrypt("503300907057025597685177930957");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "374169209843989351176608483118" + "'", str9, "374169209843989351176608483118");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\u0571\026\ufffd\u0772\ufffd\ufffd\ufffdi" + "'", str11, "\001\ufffd\ufffd\u0571\026\ufffd\u0772\ufffd\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "319938585725641449668402559458" + "'", str13, "319938585725641449668402559458");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "256244705772698988962421170619" + "'", str15, "256244705772698988962421170619");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4586471424" + "'", str17, "4586471424");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)C" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)C");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "161937250467930236216996036864" + "'", str21, "161937250467930236216996036864");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001b\177\ufffd\ufffd\r\ufffdT9" + "'", str23, "\001b\177\ufffd\ufffd\r\ufffdT9");
    }

    @Test
    public void test8102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8102");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd#\037\ufffd\ufffd\ufffdy");
        java.lang.String str19 = rSA1.decrypt("553");
        java.lang.String str21 = rSA1.encrypt("1316695385117664");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "109" + "'", str9, "109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\031" + "'", str13, "\001\031");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "412" + "'", str15, "412");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "381" + "'", str17, "381");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002)" + "'", str19, "\002)");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "663" + "'", str21, "663");
    }

    @Test
    public void test8103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8103");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("992436543");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("361908914768543513491127838956");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7367638573" + "'", str3, "7367638573");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffdp" + "'", str5, "\002\ufffd\ufffdp");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5179561246" + "'", str7, "5179561246");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "339" + "'", str11, "339");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8104");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("6539556310");
        java.lang.String str5 = rSA1.decrypt("882662503");
        java.lang.String str7 = rSA1.encrypt("606561615691672");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001k" + "'", str5, "\001k");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "142" + "'", str7, "142");
    }

    @Test
    public void test8105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8105");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.encrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("\001\u0332\ufffd\ufffd\n\004\ufffd\ufffd");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "381" + "'", str7, "381");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test8106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8106");
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
        java.lang.String str21 = rSA1.encrypt("654");
        java.lang.String str23 = rSA1.encrypt("189363886807029606332069033589");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "377" + "'", str7, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42" + "'", str9, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\023" + "'", str11, "\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25" + "'", str13, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "612" + "'", str17, "612");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "502" + "'", str21, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "632" + "'", str23, "632");
    }

    @Test
    public void test8107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8107");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.encrypt("1024");
        java.lang.String str9 = rSA1.encrypt("\006\035\ufffd\036Y][");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "350327531" + "'", str5, "350327531");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2896700039" + "'", str7, "2896700039");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1653492949" + "'", str9, "1653492949");
    }

    @Test
    public void test8108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8108");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr\013\ufffd");
        java.lang.String str13 = rSA1.encrypt("208");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("940149861");
        java.lang.String str19 = rSA1.encrypt("\\\001\ufffdZ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "228" + "'", str7, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "375" + "'", str9, "375");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "282" + "'", str11, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "232" + "'", str13, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd\ufffd\u0532\036" + "'", str17, "\r\ufffd\ufffd\ufffd\ufffd\ufffd\u0532\036");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "483191801250468553879720399357" + "'", str19, "483191801250468553879720399357");
    }

    @Test
    public void test8109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8109");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\031\ufffd\ufffd\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\034" + "'", str5, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "226" + "'", str7, "226");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "552535456880066134463558351988" + "'", str11, "552535456880066134463558351988");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "259945737393222077375270655722" + "'", str13, "259945737393222077375270655722");
    }

    @Test
    public void test8110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8110");
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
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\n\003");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2187439050742305" + "'", str13, "2187439050742305");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "862852580050299" + "'", str15, "862852580050299");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2174610951059675" + "'", str17, "2174610951059675");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1431485116566863" + "'", str19, "1431485116566863");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2639282878424911" + "'", str21, "2639282878424911");
    }

    @Test
    public void test8111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8111");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd3\026\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3364698886" + "'", str7, "3364698886");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16600162735747890496335095161" + "'", str13, "16600162735747890496335095161");
    }

    @Test
    public void test8112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8112");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.encrypt("\0017");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\ufffd\u06cb\030\ufffd\r");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\006V\037\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?V?Y?0?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "49996030763813227987422951333" + "'", str3, "49996030763813227987422951333");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2632475144332304877738303911" + "'", str5, "2632475144332304877738303911");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1024233068" + "'", str9, "1024233068");
    }

    @Test
    public void test8113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8113");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("2448943656306246");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\u03e6\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\ufffd\u03e6\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8114");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "496359262040681953891289958100" + "'", str9, "496359262040681953891289958100");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "521904857042291246286490508942" + "'", str11, "521904857042291246286490508942");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "574194375555927510445530210062" + "'", str13, "574194375555927510445530210062");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "117460589630655295352215757524" + "'", str15, "117460589630655295352215757524");
    }

    @Test
    public void test8115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8115");
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
        java.lang.String str25 = rSA1.encrypt("\006\000\ufffd\ufffd\ufffd\022\032\ufffd");
        java.lang.String str27 = rSA1.encrypt("735488189656080");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1999311797876208" + "'", str7, "1999311797876208");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\016\ufffdy^j\001" + "'", str9, "\016\ufffdy^j\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46931132224271" + "'", str13, "46931132224271");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2303178316676486" + "'", str15, "2303178316676486");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "242030633652133" + "'", str17, "242030633652133");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1767052724287630034926647024" + "'", str23, "1767052724287630034926647024");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3772963949597529975888637257" + "'", str25, "3772963949597529975888637257");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "6154020963280077320455445063" + "'", str27, "6154020963280077320455445063");
    }

    @Test
    public void test8116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8116");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\002\ufffdxP\003\021");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "328" + "'", str7, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffda" + "'", str11, "\ufffd\ufffd\ufffd\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23950143866110503504289307642" + "'", str13, "23950143866110503504289307642");
    }

    @Test
    public void test8117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8117");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4085418303" + "'", str7, "4085418303");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6231722233" + "'", str9, "6231722233");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\033\ufffd" + "'", str11, "\001\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5859971884" + "'", str13, "5859971884");
    }

    @Test
    public void test8118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8118");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.encrypt("533672814240301731473788469");
        java.lang.String str19 = rSA1.encrypt("2076257449927824");
        java.lang.String str21 = rSA1.encrypt("5211342388");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1965429185288769" + "'", str7, "1965429185288769");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "137" + "'", str17, "137");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "106" + "'", str19, "106");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "156" + "'", str21, "156");
    }

    @Test
    public void test8119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8119");
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
        java.lang.String str23 = rSA1.decrypt("60732077159364971136922584801");
        java.lang.String str25 = rSA1.decrypt("355574194666297609742337562004");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffdp" + "'", str13, "\001\ufffd\ufffd\ufffdp");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "158214750380809" + "'", str15, "158214750380809");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\035\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\035\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffdd\t\ufffd\ufffd\n\ufffd\ufffd\ufffd" + "'", str23, "\ufffdd\t\ufffd\ufffd\n\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdE{" + "'", str25, "\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdE{");
    }

    @Test
    public void test8120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8120");
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
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\u036c\000\ufffd\034\ufffdG" + "'", str11, "\003\ufffd\ufffd\u036c\000\ufffd\034\ufffdG");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373669453125" + "'", str13, "373669453125");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "812491700631275515517711348067" + "'", str15, "812491700631275515517711348067");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "212942456922334764547062297233" + "'", str17, "212942456922334764547062297233");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04cc" + "'", str19, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u04cc");
    }

    @Test
    public void test8121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8121");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("463");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("520311866388828822881614108575");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\ufffd\020v" + "'", str3, "\005\ufffd\ufffd\ufffd\020v");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1477838992581129" + "'", str5, "1477838992581129");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2681389338883196" + "'", str7, "2681389338883196");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003U\027\ufffd\ufffd" + "'", str9, "\003U\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "384" + "'", str13, "384");
    }

    @Test
    public void test8122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8122");
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
        java.lang.String str21 = rSA1.encrypt("1316060367949378");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111614885022230" + "'", str7, "1111614885022230");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1938430992038138" + "'", str9, "1938430992038138");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1470465798116785" + "'", str11, "1470465798116785");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "105137714399389583677978914120" + "'", str17, "105137714399389583677978914120");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "518970894472837641346931798705" + "'", str19, "518970894472837641346931798705");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "359826495582105089019289795441" + "'", str21, "359826495582105089019289795441");
    }

    @Test
    public void test8123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8123");
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
        java.lang.String str21 = rSA1.encrypt("441");
        java.lang.String str23 = rSA1.encrypt("\001\ufffd\277\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "706532053845173" + "'", str11, "706532053845173");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "895663007831490" + "'", str13, "895663007831490");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "126177952135803624677055281266" + "'", str19, "126177952135803624677055281266");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "485723826930358803252124471639" + "'", str21, "485723826930358803252124471639");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "152784786094302618009751027784" + "'", str23, "152784786094302618009751027784");
    }

    @Test
    public void test8124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8124");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.decrypt("914181283893724");
        java.lang.String str13 = rSA1.decrypt("406886696867962475347512808088");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test8125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8125");
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
        java.lang.String str23 = rSA1.decrypt("410657153187552854801940469252");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380992007261238628798892354992" + "'", str9, "380992007261238628798892354992");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ti\004\ufffd\ufffd\u01be\ufffd\023\ufffd\u056c" + "'", str11, "\ti\004\ufffd\ufffd\u01be\ufffd\023\ufffd\u056c");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "523309810009894187268788494051" + "'", str13, "523309810009894187268788494051");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "132651" + "'", str17, "132651");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004uX\017\ufffd\ufffd\025" + "'", str19, "\004uX\017\ufffd\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "729000" + "'", str21, "729000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str23, "\003\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8126");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("592549611818494376206249350988");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd0?");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "275" + "'", str11, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "149" + "'", str13, "149");
    }

    @Test
    public void test8127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8127");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "575706386528131097347941218626" + "'", str9, "575706386528131097347941218626");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "930314883705395857246383207585" + "'", str11, "930314883705395857246383207585");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "662247285649130774137437772765" + "'", str15, "662247285649130774137437772765");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "494807926492885939679178401583" + "'", str17, "494807926492885939679178401583");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8128");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd\u03e0\ufffd");
        java.lang.String str5 = rSA1.decrypt("774950989957480207471039785809");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "694948640286933070556112516915" + "'", str3, "694948640286933070556112516915");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\001\026\ufffd!TB}\013\ufffdp" + "'", str5, "\002\ufffd\001\026\ufffd!TB}\013\ufffdp");
    }

    @Test
    public void test8129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8129");
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
        java.lang.String str25 = rSA1.decrypt("2977022297");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8006737117797938051851203491" + "'", str9, "8006737117797938051851203491");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\006\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffdm" + "'", str11, "\005\006\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffdm");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "440155550132079340543710214414" + "'", str13, "440155550132079340543710214414");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "303239577796936" + "'", str19, "303239577796936");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\005\ufffd\006\ufffd]" + "'", str21, "\005\ufffd\005\ufffd\006\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "494819856398190" + "'", str23, "494819856398190");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\036\ufffd~z" + "'", str25, "\001\ufffd\036\ufffd~z");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8130");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("577925724882894");
        java.lang.String str13 = rSA1.decrypt("160899005785201348795265593317");
        java.lang.String str15 = rSA1.encrypt("125969802301801904412636338052");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "304" + "'", str11, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "132" + "'", str15, "132");
    }

    @Test
    public void test8131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8131");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("101921535994725989");
        java.lang.String str9 = rSA1.decrypt("2195861832");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "354735122854287042585860055882" + "'", str3, "354735122854287042585860055882");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\025H\013}" + "'", str7, "\001\025H\013}");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8132");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("\001\u0645L.KC\027 ]\020\004\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B" + "'", str7, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "387" + "'", str9, "387");
    }

    @Test
    public void test8133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8133");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\\37\034\\\ufffd\ufffd\ufffd3\021" + "'", str13, "\007\ufffd\\37\034\\\ufffd\ufffd\ufffd3\021");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\u05b2\ufffd\ufffd\ufffd." + "'", str15, "\002\ufffd\ufffd\u05b2\ufffd\ufffd\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "269340291302996282702847424066" + "'", str17, "269340291302996282702847424066");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdM" + "'", str19, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdM");
    }

    @Test
    public void test8134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8134");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("463");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\002\177L\002\ufffd\ufffdB'\\\ufffd\ufffdE");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\\\021\ufffd\u032e" + "'", str3, "\002\\\021\ufffd\u032e");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23603072580965" + "'", str5, "23603072580965");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2136341982382548" + "'", str7, "2136341982382548");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffdDn" + "'", str9, "\004\ufffd\ufffd\ufffdDn");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97" + "'", str13, "97");
    }

    @Test
    public void test8135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8135");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        java.lang.String str15 = rSA1.encrypt("593904299716151995306964564094");
        java.lang.String str17 = rSA1.encrypt("\nt\"\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("75119615859114");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\035\ufffd\ufffd\u0255\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\035\ufffd\ufffd\u0255\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "184528125" + "'", str13, "184528125");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "599083913076790382048469189358" + "'", str15, "599083913076790382048469189358");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "62328895806108105082511935540" + "'", str17, "62328895806108105082511935540");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "209201317585416238344483253617" + "'", str19, "209201317585416238344483253617");
    }

    @Test
    public void test8136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8136");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\0351c\027\"\ufffd\uef82\ufffd" + "'", str11, "\007\ufffd\0351c\027\"\ufffd\uef82\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "553333860117623083727360847378" + "'", str13, "553333860117623083727360847378");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "181" + "'", str19, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "294" + "'", str21, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "161" + "'", str23, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "165" + "'", str25, "165");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8137");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2716325243718036" + "'", str7, "2716325243718036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\b" + "'", str19, "\001\b");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8138");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.encrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("\001\u0332\ufffd\ufffd\n\004\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "267" + "'", str7, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "148" + "'", str9, "148");
    }

    @Test
    public void test8139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8139");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("829");
        java.lang.String str17 = rSA1.encrypt("179");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "76168533877072488215679961863" + "'", str9, "76168533877072488215679961863");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffdV\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\b\ufffdV\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\031\ufffd\ufffd\ufffdy%\r\ufffd\ufffd\ufffd" + "'", str15, "\003\031\ufffd\ufffd\ufffdy%\r\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "291463373098230037014854572368" + "'", str17, "291463373098230037014854572368");
    }

    @Test
    public void test8140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8140");
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
        java.lang.String str23 = rSA1.encrypt("4440180166");
        java.lang.String str25 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\001\ufffd\ufffd\177H");
        java.lang.String str27 = rSA1.encrypt("228");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2842979318003375" + "'", str7, "2842979318003375");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "66" + "'", str19, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "462" + "'", str21, "462");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0" + "'", str23, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "231" + "'", str25, "231");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "118" + "'", str27, "118");
    }

    @Test
    public void test8141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8141");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("110437653753293");
        java.lang.String str9 = rSA1.decrypt("257355366039753");
        java.lang.String str11 = rSA1.decrypt("111158135588212");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "143" + "'", str3, "143");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "289831584566635353328365674796" + "'", str7, "289831584566635353328365674796");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\u02a1\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\u02a1\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdr@-,4" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffdr@-,4");
    }

    @Test
    public void test8142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8142");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdx");
        java.lang.String str15 = rSA1.decrypt("1340958869222593");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "987875311085538" + "'", str7, "987875311085538");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5680431374" + "'", str13, "5680431374");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\033\ufffd\036" + "'", str15, "\000\ufffd\033\ufffd\036");
    }

    @Test
    public void test8143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8143");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("846394549888105749652536627724");
        java.lang.String str21 = rSA1.encrypt("1512739533813279");
        java.lang.String str23 = rSA1.decrypt("4295901134");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1571410356119851" + "'", str7, "1571410356119851");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "395840422222416" + "'", str13, "395840422222416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd8l" + "'", str17, "\003\ufffd\ufffd\ufffd8l");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "730865998305057" + "'", str19, "730865998305057");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "455390205116076" + "'", str21, "455390205116076");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdW" + "'", str23, "\000\ufffd\ufffd\ufffd\ufffdW");
    }

    @Test
    public void test8144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8144");
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
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str25 = rSA1.decrypt("287756430553046955263985255854");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "265" + "'", str15, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "247" + "'", str17, "247");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffdf" + "'", str21, "\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\001\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8145");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "213" + "'", str13, "213");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "126" + "'", str15, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "120" + "'", str17, "120");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "325" + "'", str21, "325");
    }

    @Test
    public void test8146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8146");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "313865363764224398092475812708" + "'", str9, "313865363764224398092475812708");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "344189902583124879608521762141" + "'", str11, "344189902583124879608521762141");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "454508388544338564634535402041" + "'", str17, "454508388544338564634535402041");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "247673152" + "'", str19, "247673152");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "566502641893460354582112412703" + "'", str21, "566502641893460354582112412703");
    }

    @Test
    public void test8147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8147");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("586614665667193");
        java.lang.String str17 = rSA1.encrypt("351599105432965402456457863394");
        java.lang.String str19 = rSA1.decrypt("120838933");
        java.lang.String str21 = rSA1.decrypt("419127705977650689593724338960");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "203742294187567" + "'", str7, "203742294187567");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\t\037" + "'", str9, "\005\ufffd\ufffd\t\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ua47b\ufffd\ufffd" + "'", str11, "\003\ufffd\ua47b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Y)u\024\u05f9\ufffd\ufffdE" + "'", str15, "Y)u\024\u05f9\ufffd\ufffdE");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "47240518450023927521407091395" + "'", str17, "47240518450023927521407091395");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\007\ufffd\ufffdCc" + "'", str19, "\ufffd\007\ufffd\ufffdCc");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffdI6F" + "'", str21, "\ufffd\ufffdI6F");
    }

    @Test
    public void test8148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8148");
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
        java.lang.String str27 = rSA1.encrypt("208403742106219927737766648113");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "328581583984952169483386227831" + "'", str9, "328581583984952169483386227831");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\022\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "124237340836503663954858707694" + "'", str13, "124237340836503663954858707694");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd|\004\ufffd\ufffd\ufffd\u076a\006" + "'", str15, "\004\ufffd|\004\ufffd\ufffd\ufffd\u076a\006");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "348920973182897901159023654693" + "'", str19, "348920973182897901159023654693");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "597615186212894299500819617148" + "'", str21, "597615186212894299500819617148");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd" + "'", str23, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "552032358085012765890099052243" + "'", str25, "552032358085012765890099052243");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "569723551224702066055160964175" + "'", str27, "569723551224702066055160964175");
    }

    @Test
    public void test8149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8149");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.decrypt("394641110643206533541912183688");
        java.lang.String str15 = rSA1.encrypt("215143892951143045749748229813");
        java.lang.String str17 = rSA1.encrypt("504620162102307551452014088950");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\035" + "'", str5, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "527" + "'", str15, "527");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "355" + "'", str17, "355");
    }

    @Test
    public void test8150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8150");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("52");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1408514752349" + "'", str11, "1408514752349");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4" + "'", str13, "\004\ufffd\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd4");
    }

    @Test
    public void test8151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8151");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("614257699369705");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\005" + "'", str5, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "408" + "'", str7, "408");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "228" + "'", str9, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "467" + "'", str13, "467");
    }

    @Test
    public void test8152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8152");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "290" + "'", str7, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\035" + "'", str13, "\035");
    }

    @Test
    public void test8153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8153");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6713274875" + "'", str3, "6713274875");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5432175485" + "'", str5, "5432175485");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2490140352" + "'", str7, "2490140352");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6156243010" + "'", str9, "6156243010");
    }

    @Test
    public void test8154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8154");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\013\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2479363878" + "'", str3, "2479363878");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7745342065" + "'", str7, "7745342065");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3245220499" + "'", str9, "3245220499");
    }

    @Test
    public void test8155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8155");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\003\ufffd3Yq[H.\013\ufffd]h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??3\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1541157048799054" + "'", str7, "1541157048799054");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1001963585898213" + "'", str13, "1001963585898213");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\f\027\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\t\f\027\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8156");
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
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\r\ufffd\006\ufffd\177\ufffd\ufffd\037\025\ufffd" + "'", str11, "\004\r\ufffd\006\ufffd\177\ufffd\ufffd\037\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "154118649017868774161715307321" + "'", str13, "154118649017868774161715307321");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001}" + "'", str17, "\001}");
    }

    @Test
    public void test8157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8157");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\004\ufffd\u0740\ufffd\ufffdk");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????k\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33186048268096622994347515946" + "'", str13, "33186048268096622994347515946");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "996544988172078479058464274" + "'", str15, "996544988172078479058464274");
    }

    @Test
    public void test8158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8158");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("1929985830");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.encrypt("346125639250942006569169281670");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "41994701097903196182211480177" + "'", str9, "41994701097903196182211480177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "450935284503901792358635695538" + "'", str11, "450935284503901792358635695538");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "311073746546818711751409452813" + "'", str13, "311073746546818711751409452813");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "141" + "'", str17, "141");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "486" + "'", str21, "486");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8159");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.decrypt("158305255855005487799219720195");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1488129596492698" + "'", str7, "1488129596492698");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "24" + "'", str15, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0022" + "'", str17, "\0022");
    }

    @Test
    public void test8160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8160");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1111166250865836");
        java.lang.String str13 = rSA1.encrypt("2865686058123530968401380793");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\000\ufffd");
        java.lang.String str17 = rSA1.decrypt("2983800397503181");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "227" + "'", str9, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "103" + "'", str11, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50" + "'", str15, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\034" + "'", str17, "\001\034");
    }

    @Test
    public void test8161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8161");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\030\ufffd\ufffd\020\u05a6\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\030\ufffd\ufffd\020\u05a6\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8162");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd\u02c0\ufffd\ufffd\007,");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "202" + "'", str5, "202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "183" + "'", str7, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "116" + "'", str9, "116");
    }

    @Test
    public void test8163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8163");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("457613644251791188504293612087");
        java.lang.String str9 = rSA1.encrypt("\005\ufffd\ufffd\027\024\ufffd\005\ufffd\023\021\034\007");
        java.lang.String str11 = rSA1.encrypt("970748437860623683411570676429");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdx" + "'", str7, "\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "476868690572641" + "'", str9, "476868690572641");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1903033305314430" + "'", str11, "1903033305314430");
    }

    @Test
    public void test8164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8164");
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
        java.lang.String str25 = rSA1.encrypt("2437652554681650");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "386105340350129" + "'", str7, "386105340350129");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\036\ufffd\ufffd\ufffd8/" + "'", str15, "\002\036\ufffd\ufffd\ufffd8/");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "926" + "'", str19, "926");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "883" + "'", str21, "883");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd" + "'", str23, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "81" + "'", str25, "81");
    }

    @Test
    public void test8165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8165");
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
        java.lang.String str25 = rSA1.decrypt("71142004936228452776717870079");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffdg\002\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffd\ufffdg\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "126664630568153141094537897122" + "'", str13, "126664630568153141094537897122");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "196973484997814000668943762423" + "'", str19, "196973484997814000668943762423");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "528517929165247464302956274198" + "'", str21, "528517929165247464302956274198");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "h" + "'", str25, "h");
    }

    @Test
    public void test8166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8166");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("501491827176365");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "102" + "'", str11, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "344" + "'", str15, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "342692090448725797549838859472" + "'", str19, "342692090448725797549838859472");
    }

    @Test
    public void test8167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8167");
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
        java.lang.String str23 = rSA1.decrypt("37946428819909058575787237043");
        java.lang.String str25 = rSA1.decrypt("507735161454502401211578520289");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "166759936369526" + "'", str7, "166759936369526");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "^" + "'", str17, "^");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "164" + "'", str19, "164");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "283" + "'", str21, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\005" + "'", str23, "\001\005");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001G" + "'", str25, "\001G");
    }

    @Test
    public void test8168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8168");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        java.lang.String str15 = rSA1.decrypt("40072012838848394027");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.decrypt("2200208956");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "129791934335350" + "'", str7, "129791934335350");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "f" + "'", str13, "f");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\t" + "'", str15, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "279" + "'", str17, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "j" + "'", str19, "j");
    }

    @Test
    public void test8169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8169");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        java.lang.String str13 = rSA1.decrypt("42255066403800866001807416701");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1641154658278442" + "'", str7, "1641154658278442");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1619049641249113" + "'", str9, "1619049641249113");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1730830416406886" + "'", str11, "1730830416406886");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd<" + "'", str13, "\006\ufffd\ufffd<");
    }

    @Test
    public void test8170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8170");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("7320283309");
        java.lang.String str7 = rSA1.encrypt("6367626140");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5188802378" + "'", str3, "5188802378");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\000\026\ufffdB" + "'", str5, "\001\000\026\ufffdB");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3516516218" + "'", str7, "3516516218");
    }

    @Test
    public void test8171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8171");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\002\002\034\ufffd\026\ufffd\006\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("12694834791790382301744897872");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193" + "'", str9, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8172");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("810514982227303000140801050035");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2153572302525173" + "'", str17, "2153572302525173");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8173");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("786820480");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "922426328807451" + "'", str7, "922426328807451");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\003" + "'", str9, "\001\ufffd\ufffd\ufffd\003");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\u0406\ufffd" + "'", str11, "\003\ufffd\ufffd\u0406\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "655132098244983" + "'", str13, "655132098244983");
    }

    @Test
    public void test8174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8174");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("432268551667889026451279149775");
        java.lang.String str11 = rSA1.decrypt("67255654729147995743857032941");
        java.lang.String str13 = rSA1.encrypt("90158492089125200430849511322");
        java.lang.String str15 = rSA1.encrypt("\001\006\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\033\f\t\ufffd" + "'", str9, "\033\f\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffdO" + "'", str11, "\ufffd\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "122683674" + "'", str13, "122683674");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "14236860" + "'", str15, "14236860");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8175");
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
        java.lang.String str25 = rSA1.encrypt("2490873678805311");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\001\ufffd\ufffd" + "'", str13, "\003\ufffd\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1531794033875675" + "'", str15, "1531794033875675");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "103227309636929" + "'", str17, "103227309636929");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001D" + "'", str21, "\001D");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "308" + "'", str23, "308");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "148" + "'", str25, "148");
    }

    @Test
    public void test8176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8176");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.lang.String str11 = rSA1.decrypt("46925933906613754914094402908");
        java.lang.String str13 = rSA1.encrypt("1699026177576345");
        java.lang.String str15 = rSA1.encrypt("136920345242702");
        java.lang.String str17 = rSA1.encrypt("5225594474");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "38800219134950265002803732920" + "'", str9, "38800219134950265002803732920");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005;\001\ufffd\ufffdU\017\ufffd\ufffd\026L," + "'", str11, "\005;\001\ufffd\ufffdU\017\ufffd\ufffd\026L,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "346218015505468188498407358879" + "'", str13, "346218015505468188498407358879");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "330620495516015541550149928395" + "'", str15, "330620495516015541550149928395");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "303833572186143301647637393005" + "'", str17, "303833572186143301647637393005");
    }

    @Test
    public void test8177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8177");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("\0031\017\004\ufffd\ufffd\035");
        java.lang.String str13 = rSA1.encrypt("6163994892");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "29803630146954767094447812810" + "'", str9, "29803630146954767094447812810");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "447510737357398006017065878237" + "'", str11, "447510737357398006017065878237");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "114928200407702522121380634447" + "'", str13, "114928200407702522121380634447");
    }

    @Test
    public void test8178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8178");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        java.lang.String str7 = rSA1.encrypt("4691461221");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "286686316041122665971901547237" + "'", str3, "286686316041122665971901547237");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "17145112351486603186728518165" + "'", str5, "17145112351486603186728518165");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117579992854791492248330813545" + "'", str7, "117579992854791492248330813545");
    }

    @Test
    public void test8179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8179");
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
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "268" + "'", str9, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd" + "'", str15, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i" + "'", str17, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test8180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8180");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str9 = rSA1.decrypt("2602093156");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("366029008708059727875119417810");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013" + "'", str13, "\013");
    }

    @Test
    public void test8181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8181");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1512739533813279");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\ufffd\u02db\ufffd\ufffd\ufffdP\027");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1408406769374113" + "'", str7, "1408406769374113");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1436025311312154" + "'", str9, "1436025311312154");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "488684420439639273589820565790" + "'", str13, "488684420439639273589820565790");
    }

    @Test
    public void test8182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8182");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "631507072071673303531047114464" + "'", str11, "631507072071673303531047114464");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
    }

    @Test
    public void test8183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8183");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("592549611818494376206249350988");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd0?");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37" + "'", str11, "37");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "121" + "'", str13, "121");
    }

    @Test
    public void test8184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8184");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
    }

    @Test
    public void test8185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8185");
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
        java.lang.String str21 = rSA1.encrypt("8326532576");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "324696062516284" + "'", str11, "324696062516284");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3417698431811573" + "'", str13, "3417698431811573");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "553272156760419" + "'", str15, "553272156760419");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3326342436366640" + "'", str17, "3326342436366640");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "523133291267328864178793949444" + "'", str21, "523133291267328864178793949444");
    }

    @Test
    public void test8186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8186");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.encrypt("\002<|\031\016\ufffdt");
        java.lang.String str11 = rSA1.encrypt("352");
        java.lang.String str13 = rSA1.encrypt("3088882723");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "155" + "'", str9, "155");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "239" + "'", str11, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "76" + "'", str13, "76");
    }

    @Test
    public void test8187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8187");
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
        java.lang.String str21 = rSA1.decrypt("717006236777577851189831105014");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3597118336751210" + "'", str7, "3597118336751210");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1479723686972135" + "'", str13, "1479723686972135");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "O" + "'", str19, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd" + "'", str21, "\002\ufffd");
    }

    @Test
    public void test8188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8188");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        java.lang.String str7 = rSA1.decrypt("1408963370982216");
        java.lang.String str9 = rSA1.encrypt("443557471027960316687611593798");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\033\022\ufffd\ufffd\ufffd\ufffd\003" + "'", str3, "\033\022\ufffd\ufffd\ufffd\ufffd\003");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "171422822052557147405855951478" + "'", str5, "171422822052557147405855951478");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\020" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "342587785846677778429659163293" + "'", str9, "342587785846677778429659163293");
    }

    @Test
    public void test8189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8189");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001i" + "'", str11, "\001i");
    }

    @Test
    public void test8190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8190");
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
        java.lang.String str23 = rSA1.encrypt("370639615");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "284668221758990677176888907248" + "'", str9, "284668221758990677176888907248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\031\b\u077e\u0633\ufffd\311" + "'", str11, "\005\ufffd\031\b\u077e\u0633\ufffd\311");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "688834053731606923479821286598" + "'", str13, "688834053731606923479821286598");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\ufffd\ufffd\ufffd\u011d\ufffd\ufffd\ufffd" + "'", str15, "\n\ufffd\ufffd\ufffd\u011d\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64339296875" + "'", str17, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n\ufffd<*\034\ufffd\ufffdv\023\ufffdM" + "'", str19, "\n\ufffd<*\034\ufffd\ufffdv\023\ufffdM");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "253902284871130738004223139176" + "'", str23, "253902284871130738004223139176");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8191");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("1053810964353719");
        java.lang.String str15 = rSA1.encrypt("702623848205781281862423126661");
        java.lang.String str17 = rSA1.encrypt("\b\ufffd\001f\024\000\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.decrypt("32427175380384275892758226492");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17" + "'", str3, "17");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "717607764" + "'", str7, "717607764");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "59401618810661766864084485206" + "'", str13, "59401618810661766864084485206");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "61350522682079493131935678166" + "'", str15, "61350522682079493131935678166");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "30954362544622784108437530971" + "'", str17, "30954362544622784108437530971");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufa4a\033\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\ufa4a\033\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8192");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.String str15 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.decrypt("273086498646962687379392903211");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "460410014606744887007472510806" + "'", str11, "460410014606744887007472510806");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\004\ufffd\ufffd\"\f\ufffd\ufffd" + "'", str13, "\004\ufffd\004\ufffd\ufffd\"\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\"\ufffd\377\177\033\ufffd\ufffd\ufffd" + "'", str15, "\004\ufffd\"\ufffd\377\177\033\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\022\017\ufffd" + "'", str19, "\"\022\017\ufffd");
    }

    @Test
    public void test8193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8193");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str15 = rSA1.decrypt("304447868697755124678319665899");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "557339685533752611665361480174" + "'", str9, "557339685533752611665361480174");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\024\ufffd\003\ufffd\020" + "'", str11, "\007\ufffd\ufffd\ufffd\024\ufffd\003\ufffd\020");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd8\000\ufffd\017\ufffd\031\ufffdO*" + "'", str13, "\005\ufffd8\000\ufffd\017\ufffd\031\ufffdO*");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\"\ufffd\ufffd\ufffd\ue97e\ufffd" + "'", str15, "\t\ufffd\"\ufffd\ufffd\ufffd\ue97e\ufffd");
    }

    @Test
    public void test8194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8194");
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
        java.lang.String str21 = rSA1.encrypt("\007j{\002\003A\005");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1038833307155004653049045072962" + "'", str9, "1038833307155004653049045072962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd<\004\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd<\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "17030805455915516159114337456" + "'", str13, "17030805455915516159114337456");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\ufffd\u05da\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\013\ufffd\u05da\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "62269147706889802200831645284" + "'", str17, "62269147706889802200831645284");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "51458297542948656389337161138" + "'", str21, "51458297542948656389337161138");
    }

    @Test
    public void test8195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8195");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        java.lang.String str5 = rSA1.encrypt("357690512925543535751245880674");
        java.lang.String str7 = rSA1.encrypt("\002\\\ufffd\u04bc\u0327");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\002\ufffd\ufffd\ufffd-\004\u2a82\022\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "829" + "'", str3, "829");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "160" + "'", str5, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "505" + "'", str7, "505");
    }

    @Test
    public void test8196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8196");
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
        java.lang.String str25 = rSA1.decrypt("323366616559028170805655729800");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005cX\004\ufffd\ufffd" + "'", str13, "\005cX\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2888673650127573" + "'", str15, "2888673650127573");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "194248808726664" + "'", str17, "194248808726664");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1701483786349955" + "'", str19, "1701483786349955");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "949666992486758" + "'", str21, "949666992486758");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2770143981429826" + "'", str23, "2770143981429826");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\tf\004\ufffd\ufffd\ufffd" + "'", str25, "\tf\004\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8197");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("2374996254220858");
        java.lang.String str15 = rSA1.decrypt("2678598749872963");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\034" + "'", str5, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "226" + "'", str7, "226");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "247" + "'", str9, "247");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285" + "'", str11, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "379" + "'", str13, "379");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001b" + "'", str15, "\001b");
    }

    @Test
    public void test8198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8198");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("2912429732105156");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\r" + "'", str7, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\033\ufffd" + "'", str11, "\033\ufffd");
    }

    @Test
    public void test8199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8199");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("58143851088687047188552923988");
        java.lang.String str13 = rSA1.decrypt("602366166336715968353260597067");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "^" + "'", str13, "^");
    }

    @Test
    public void test8200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8200");
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
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str23 = rSA1.encrypt("\003\ufffd\ufffd\ufffdp\004");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "p" + "'", str13, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "385" + "'", str15, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "137797809560144644211389579030" + "'", str23, "137797809560144644211389579030");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8201");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("180544958851594357572097788605");
        java.lang.String str13 = rSA1.decrypt("498517715595236544046073650611");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffd\005\ufffd" + "'", str5, "\002\ufffd\ufffd\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffdE\001\ufffd\007\ufffd\ufffd\035" + "'", str9, "\006\ufffd\ufffd\ufffdE\001\ufffd\007\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "723002563171797719805488472692" + "'", str11, "723002563171797719805488472692");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdz" + "'", str13, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdz");
    }

    @Test
    public void test8202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8202");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.encrypt("623433996390119");
        java.lang.String str11 = rSA1.encrypt("666852044142564779122674445212");
        java.lang.String str13 = rSA1.encrypt("10134139172");
        java.lang.String str15 = rSA1.encrypt("3825352019");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001\037\ufffd\ufffd\177[k");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????[k\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6426009426" + "'", str3, "6426009426");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2893688750" + "'", str5, "2893688750");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6858437499" + "'", str7, "6858437499");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5528728379" + "'", str9, "5528728379");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5395835408" + "'", str11, "5395835408");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "937290897" + "'", str13, "937290897");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8852485439" + "'", str15, "8852485439");
    }

    @Test
    public void test8203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8203");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.decrypt("603423657");
        java.lang.String str17 = rSA1.encrypt("263031188422702115233360549494");
        java.lang.String str19 = rSA1.encrypt("1310473051048185");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "29733393417756" + "'", str7, "29733393417756");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52766095" + "'", str11, "52766095");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "V\t#U" + "'", str13, "V\t#U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffdvH" + "'", str15, "\ufffdvH");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "713370571" + "'", str17, "713370571");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "414630889" + "'", str19, "414630889");
    }

    @Test
    public void test8204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8204");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("614257699369705");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "456" + "'", str9, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "235" + "'", str13, "235");
    }

    @Test
    public void test8205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8205");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477640548" + "'", str3, "477640548");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3034860210" + "'", str5, "3034860210");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6664941953" + "'", str7, "6664941953");
    }

    @Test
    public void test8206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8206");
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
        java.lang.String str21 = rSA1.decrypt("463139431235298159664019440792");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "412147292198320" + "'", str7, "412147292198320");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "730360948919816" + "'", str9, "730360948919816");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "95229200693607" + "'", str11, "95229200693607");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "298525966049510603880210923515" + "'", str17, "298525966049510603880210923515");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "55688047450703772969347015641" + "'", str19, "55688047450703772969347015641");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffdis\006\ufffd\ufffd\ufffd^ " + "'", str21, "\002\ufffd\ufffdis\006\ufffd\ufffd\ufffd^ ");
    }

    @Test
    public void test8207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8207");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36064074883131334461185003038" + "'", str9, "36064074883131334461185003038");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "98322305556098711953262602307" + "'", str11, "98322305556098711953262602307");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd#\017\ufffdQb" + "'", str13, "\000\ufffd\ufffd\ufffd#\017\ufffdQb");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\t\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\t\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd@" + "'", str17, "\001\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd7" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd7");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8208");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.decrypt("1198965058209000");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "271131863420966907684120835344" + "'", str3, "271131863420966907684120835344");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\004\ufffd\002\031\ufffdel9_\000\ufffd\036" + "'", str5, "\004\ufffd\002\031\ufffdel9_\000\ufffd\036");
    }

    @Test
    public void test8209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8209");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.decrypt("407287699968968719545226543717");
        java.lang.String str19 = rSA1.decrypt("121262011380919588501508164245");
        java.lang.String str21 = rSA1.decrypt("3004681284096727391876910016");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1868065811624024" + "'", str7, "1868065811624024");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002e\004\ufffd\ufffd}" + "'", str9, "\002e\004\ufffd\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1878503212479727" + "'", str11, "1878503212479727");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1245683912363628" + "'", str13, "1245683912363628");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\u0200" + "'", str17, "\003\ufffd\ufffd\u0200");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001Bw\022E\177r" + "'", str21, "\001Bw\022E\177r");
    }

    @Test
    public void test8210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8210");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24559914651460" + "'", str7, "24559914651460");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\u07d8\036\ufffd" + "'", str15, "\003\ufffd\ufffd\u07d8\036\ufffd");
    }

    @Test
    public void test8211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8211");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.decrypt("394641110643206533541912183688");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "486" + "'", str7, "486");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\006" + "'", str13, "\001\006");
    }

    @Test
    public void test8212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8212");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("239533509989569937544099898666");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1335690705719277" + "'", str7, "1335690705719277");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\016\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd" + "'", str15, "\007\016\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8213");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.decrypt("211673788539744279696210156906");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("188");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "165" + "'", str3, "165");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\b\ufffd\ufffd" + "'", str7, "\001\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\uffcch" + "'", str11, "\002\uffcch");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "254423085881194683813211770497" + "'", str17, "254423085881194683813211770497");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8214");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        java.lang.String str15 = rSA1.encrypt("258");
        java.lang.String str17 = rSA1.decrypt("4586471424");
        java.lang.String str19 = rSA1.encrypt("\b\ufffd\005dZ\032y");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\005\ufffd[\b\ufffd\ufffdrK{'" + "'", str11, "\003\005\ufffd[\b\ufffd\ufffdrK{'");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003|)\f\ufffd\ufffd\u05e3\ufffd\ufffd" + "'", str13, "\003|)\f\ufffd\ufffd\u05e3\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35625059029665345024" + "'", str15, "35625059029665345024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\b0\017\ufffd\u020a\003" + "'", str17, "\001\ufffd\ufffd\ufffd\b0\017\ufffd\u020a\003");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "63262003240271408817576191051" + "'", str19, "63262003240271408817576191051");
    }

    @Test
    public void test8215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8215");
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
        java.lang.String str21 = rSA1.decrypt("2728895751");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "433130284686948115805006502238" + "'", str9, "433130284686948115805006502238");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\u01c6\tq\006\ufffd\ufffd\ufffd\ufffd\ufffdu" + "'", str13, "\000\u01c6\tq\006\ufffd\ufffd\ufffd\ufffd\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "359685701029327928020892311384" + "'", str15, "359685701029327928020892311384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "112514961199240497794277438811" + "'", str17, "112514961199240497794277438811");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "|" + "'", str21, "|");
    }

    @Test
    public void test8216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8216");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
    }

    @Test
    public void test8217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8217");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str15 = rSA1.decrypt("184");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("120351063945077822959445822691");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffdv\034\u013d\ufffd\ufffd>" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffdv\034\u013d\ufffd\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\u056f\260\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\u056f\260\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd\005\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "89200382681170994489362562951" + "'", str17, "89200382681170994489362562951");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "189465901212358896533125889860" + "'", str19, "189465901212358896533125889860");
    }

    @Test
    public void test8218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8218");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\002\ufffdN\025\ufffdm");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?8?N??m\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "678390220013931" + "'", str7, "678390220013931");
    }

    @Test
    public void test8219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8219");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.decrypt("380765214743367494321195020708");
        java.lang.String str21 = rSA1.encrypt("171637622630321055768329963023");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\007" + "'", str13, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "141" + "'", str15, "141");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "'" + "'", str19, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "400" + "'", str21, "400");
    }

    @Test
    public void test8220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8220");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd,\r\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\004\ufffd,\r\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "325950189152288731971242111195" + "'", str5, "325950189152288731971242111195");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "610883473314179426795899891612" + "'", str7, "610883473314179426795899891612");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\017\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\017\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test8221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8221");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("45526801193026009101365808789");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7433880029" + "'", str7, "7433880029");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?\000" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?\000");
    }

    @Test
    public void test8222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8222");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "151038784345114958521526848793" + "'", str9, "151038784345114958521526848793");
    }

    @Test
    public void test8223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8223");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "959475183210346" + "'", str7, "959475183210346");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "197" + "'", str15, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001+" + "'", str17, "\001+");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "142" + "'", str19, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "238" + "'", str21, "238");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8224");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("3");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("409999539549233345601281863678");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "121664866223270842724388885571" + "'", str9, "121664866223270842724388885571");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005;\"\ufffd\ufffd}u\001\ufffd\ufffd\003\ufffd" + "'", str11, "\005;\"\ufffd\ufffd}u\001\ufffd\ufffd\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "548839630364048241286443039467" + "'", str13, "548839630364048241286443039467");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3139892904901942" + "'", str17, "3139892904901942");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "313" + "'", str21, "313");
    }

    @Test
    public void test8225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8225");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("414356825269006");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "114944759242425438794281262474" + "'", str9, "114944759242425438794281262474");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\u0548\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\u0548\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0049\033\ufffdv\026\ufffd\ufffd\ufffdB" + "'", str13, "\0049\033\ufffdv\026\ufffd\ufffd\ufffdB");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "440279235300633765085907012002" + "'", str15, "440279235300633765085907012002");
    }

    @Test
    public void test8226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8226");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "899073713100958" + "'", str11, "899073713100958");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1736419165788348" + "'", str13, "1736419165788348");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "952024542738534" + "'", str15, "952024542738534");
    }

    @Test
    public void test8227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8227");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("10590563594");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        java.lang.String str13 = rSA1.encrypt("5520587949");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\ufffd" + "'", str3, "\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1003429738985390" + "'", str5, "1003429738985390");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "455032722526515" + "'", str7, "455032722526515");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "|\000\ufffd\ufffd>a" + "'", str9, "|\000\ufffd\ufffd>a");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "690043951690256" + "'", str11, "690043951690256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1825331225395110" + "'", str13, "1825331225395110");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8228");
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
        java.lang.String str25 = rSA1.encrypt("\007T1\030\ufffd\027");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "413099432845096328310002866700" + "'", str9, "413099432845096328310002866700");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\003\ufffd\ufffd\u0390\ufffd$Z\001\ufffd\ufffd" + "'", str11, "\t\003\ufffd\ufffd\u0390\ufffd$Z\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\ufffd\ufffd\ufffd\f\ufffd\ufffd\u023b`\n" + "'", str15, "\013\ufffd\ufffd\ufffd\f\ufffd\ufffd\u023b`\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42875" + "'", str17, "42875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "756037733185777864459978791946" + "'", str19, "756037733185777864459978791946");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "160407394144466812863634791131" + "'", str21, "160407394144466812863634791131");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\ufffdh\f\ufffd\ufffd\ufffd\ufffdY\n" + "'", str23, "\004\ufffd\ufffdh\f\ufffd\ufffd\ufffd\ufffdY\n");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "680383572529615083393252397463" + "'", str25, "680383572529615083393252397463");
    }

    @Test
    public void test8229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8229");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("3081387051");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "486" + "'", str7, "486");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "U" + "'", str15, "U");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test8230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8230");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        java.lang.String str15 = rSA1.decrypt("299");
        java.lang.String str17 = rSA1.encrypt("436610341143824855210469044544");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "166" + "'", str17, "166");
    }

    @Test
    public void test8231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8231");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffdm1");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4888801823" + "'", str3, "4888801823");
    }

    @Test
    public void test8232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8232");
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
        rSA1.generateKeys((int) ' ');
        java.lang.String str27 = rSA1.encrypt("1895725917151180");
        java.lang.String str29 = rSA1.encrypt("464511689");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "722564607843997" + "'", str7, "722564607843997");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\020\ufffd\ufffd\ufffdZ+" + "'", str9, "\004\020\ufffd\ufffd\ufffdZ+");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2497266289171480" + "'", str11, "2497266289171480");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "706897686107433" + "'", str13, "706897686107433");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2117306949404707" + "'", str15, "2117306949404707");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "422840424145405" + "'", str17, "422840424145405");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "44615783804293185729789802451" + "'", str23, "44615783804293185729789802451");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1102620097" + "'", str27, "1102620097");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "497026340" + "'", str29, "497026340");
    }

    @Test
    public void test8233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8233");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("4387152023");
        java.lang.String str17 = rSA1.decrypt("52521875");
        java.lang.String str19 = rSA1.encrypt("130667935552330737962113576314");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "420226419181381196669328516965" + "'", str9, "420226419181381196669328516965");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "87091851825589476199882869944" + "'", str11, "87091851825589476199882869944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8955496613" + "'", str15, "8955496613");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\037" + "'", str17, "\000\ufffd\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2448573663" + "'", str19, "2448573663");
    }

    @Test
    public void test8234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8234");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("274779111525604387596824181322");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "553691207466666614593651287109" + "'", str9, "553691207466666614593651287109");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\u07ca\ufffdz\003\021\ufffd\ufffd" + "'", str11, "\006\u07ca\ufffdz\003\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2118483309906704" + "'", str17, "2118483309906704");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8235");
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
        java.lang.String str21 = rSA1.decrypt("942602395272077");
        java.lang.String str23 = rSA1.decrypt("372");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "133448461112423317465846364470" + "'", str9, "133448461112423317465846364470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "227779066457910989170840999302" + "'", str13, "227779066457910989170840999302");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "328532837013621560913558986506" + "'", str15, "328532837013621560913558986506");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "38675365035677308731716760538" + "'", str17, "38675365035677308731716760538");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006Z\026\ufffd\ufffd\031\u0516\ufffd7" + "'", str19, "\006Z\026\ufffd\ufffd\031\u0516\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffdg*\022\ufffd{(\001\ufffd\ufffd\ufffd" + "'", str23, "\001\ufffdg*\022\ufffd{(\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8236");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.decrypt("710020161505791437554889429809");
        java.lang.String str7 = rSA1.encrypt("\003I,EfR2^\r9\003\ufffd\r");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5\016\ufffd " + "'", str5, "5\016\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "213040627" + "'", str7, "213040627");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test8237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8237");
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
        java.lang.String str25 = rSA1.encrypt("\001\ufffd\ufffd\022\ufffd");
        java.lang.String str27 = rSA1.decrypt("486912457");
        java.lang.String str29 = rSA1.encrypt("174145085437797");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\r\ufffdt#H\fa\004\003\017" + "'", str11, "\t\ufffd\r\ufffdt#H\fa\004\003\017");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "326888444361736706074700743166" + "'", str15, "326888444361736706074700743166");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "315070591975716562170920040886" + "'", str17, "315070591975716562170920040886");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "683176013673933953386640381776" + "'", str19, "683176013673933953386640381776");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "62477636896800531126492811262" + "'", str21, "62477636896800531126492811262");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "166398641287739502443591729247" + "'", str23, "166398641287739502443591729247");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "942322512719339348093477509256" + "'", str25, "942322512719339348093477509256");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\002\ufffd\024'|\022\ufffd\ufffd\025~)m" + "'", str27, "\002\ufffd\024'|\022\ufffd\ufffd\025~)m");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "14096724459190371173242544369" + "'", str29, "14096724459190371173242544369");
    }

    @Test
    public void test8238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8238");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3268412099562068" + "'", str7, "3268412099562068");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd0" + "'", str9, "\003\ufffd\ufffd\ufffd0");
    }

    @Test
    public void test8239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8239");
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
        java.lang.String str21 = rSA1.decrypt("1220399429451544");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "59" + "'", str11, "59");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|" + "'", str13, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12750812506535699124619210301" + "'", str17, "12750812506535699124619210301");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "60319553028670800378552584379" + "'", str19, "60319553028670800378552584379");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd9" + "'", str21, "\n\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd9");
    }

    @Test
    public void test8240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8240");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.encrypt("2372308538763998");
        java.lang.String str9 = rSA1.encrypt("1852625339284461");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\016" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3938980639167" + "'", str5, "3938980639167");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11893547155692249923605116161" + "'", str7, "11893547155692249923605116161");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "296391640368216741493423865818" + "'", str9, "296391640368216741493423865818");
    }

    @Test
    public void test8241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8241");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str15 = rSA1.encrypt("277938194478251");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "229" + "'", str13, "229");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9" + "'", str15, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "88" + "'", str17, "88");
    }

    @Test
    public void test8242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8242");
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
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "339138624676230485804162383334" + "'", str9, "339138624676230485804162383334");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "366693149146501514108287521927" + "'", str11, "366693149146501514108287521927");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "601173847665910" + "'", str15, "601173847665910");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\031\ufffd\ufffdk" + "'", str17, "\031\ufffd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2250666132625" + "'", str19, "2250666132625");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test8243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8243");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("292007140694737696201256199778");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.decrypt("1501354254");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffdC\003\ufffd\ufffd\000" + "'", str3, "\005\ufffdC\003\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2339989211133073" + "'", str5, "2339989211133073");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2018534134069012" + "'", str7, "2018534134069012");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\016" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\032\ufffd" + "'", str13, "\n\ufffd\ufffd\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2265663955770127" + "'", str15, "2265663955770127");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8244");
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
        rSA1.generateKeys((int) '4');
        java.lang.String str25 = rSA1.decrypt("286265936422108");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "190059015100166355758914275535" + "'", str9, "190059015100166355758914275535");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "190059015100166355758914275535" + "'", str11, "190059015100166355758914275535");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\031\036\ufffd\u0558\ufffd" + "'", str13, "\002\ufffd\031\036\ufffd\u0558\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "606415333052722465446810890153" + "'", str15, "606415333052722465446810890153");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd\ud4bd" + "'", str17, "\t\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd\ud4bd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "36005558296405015856794738469" + "'", str19, "36005558296405015856794738469");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "503489752686956225971776259916" + "'", str21, "503489752686956225971776259916");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str25, "\003\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test8245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8245");
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
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "252912679428799508072251778624" + "'", str9, "252912679428799508072251778624");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\f\ufffd\ufffd\ufffd\ufffd\ufffd|" + "'", str11, "\004\f\ufffd\ufffd\ufffd\ufffd\ufffd|");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "91945168444257481087951928534" + "'", str13, "91945168444257481087951928534");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "194624483403650394192602781526" + "'", str15, "194624483403650394192602781526");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "225575066837105457796643109481" + "'", str17, "225575066837105457796643109481");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\030~K\022\ufffd{\027\ufffd\ufffd" + "'", str19, "\004\ufffd\030~K\022\ufffd{\027\ufffd\ufffd");
    }

    @Test
    public void test8246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8246");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("7686411764");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd/");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\025\ufffd\ufffd\003\ufffd\ufffd\n\ufffd\ufffd\ufffdh" + "'", str3, "\001\025\ufffd\ufffd\003\ufffd\ufffd\n\ufffd\ufffd\ufffdh");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "385643968812064138900192394792" + "'", str5, "385643968812064138900192394792");
    }

    @Test
    public void test8247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8247");
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
        java.lang.String str21 = rSA1.decrypt("616");
        java.lang.String str23 = rSA1.encrypt("51916215351733840181872865870");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "643097541793170591596578599743" + "'", str9, "643097541793170591596578599743");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "564894154527543710917472101710" + "'", str11, "564894154527543710917472101710");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "261021585304117908733001517702" + "'", str13, "261021585304117908733001517702");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "409" + "'", str17, "409");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "329" + "'", str19, "329");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\f" + "'", str21, "\f");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "272" + "'", str23, "272");
    }

    @Test
    public void test8248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8248");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("\036\034\u01b7\ufffd\035\ufffd\ufffd\ufffd9h;");
        java.lang.String str9 = rSA1.encrypt("\ufffd");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "327" + "'", str7, "327");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "428" + "'", str9, "428");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test8249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8249");
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
        java.lang.String str21 = rSA1.decrypt("110990081129429679418953710973");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "436566802290137479906286096966" + "'", str9, "436566802290137479906286096966");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "436566802290137479906286096966" + "'", str11, "436566802290137479906286096966");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\030\ufffd\ufffd\006\ufffd\ufffd'" + "'", str13, "\006\ufffd\030\ufffd\ufffd\006\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\n\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\n\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "105621616524748722098181577649" + "'", str17, "105621616524748722098181577649");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\013\"\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032" + "'", str19, "\013\"\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\000\027" + "'", str21, "\013\ufffd\ufffd\ufffd\ufffd\000\027");
    }

    @Test
    public void test8250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8250");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str19 = rSA1.encrypt("2612934065481233");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "235807457893005105331195120669" + "'", str9, "235807457893005105331195120669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "468928729641108201323452972337" + "'", str11, "468928729641108201323452972337");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffdb\023\ufffd\ufffdTT" + "'", str13, "\ufffd\ufffd\ufffd\ufffdb\023\ufffd\ufffdTT");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "38287553023835761186648509639" + "'", str17, "38287553023835761186648509639");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "246661546194416104310703493259" + "'", str19, "246661546194416104310703493259");
    }

    @Test
    public void test8251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8251");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\004\ufffd\ufffd\u07d8");
        java.lang.String str13 = rSA1.encrypt("1785750893713219");
        java.lang.String str15 = rSA1.encrypt("1214366635748883");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "309" + "'", str9, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "296" + "'", str11, "296");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "328" + "'", str13, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354" + "'", str15, "354");
    }

    @Test
    public void test8252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8252");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("1984305702497703292795959933");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "296588924968188385025137570422" + "'", str9, "296588924968188385025137570422");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "366413617090712611759593357445" + "'", str13, "366413617090712611759593357445");
    }

    @Test
    public void test8253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8253");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("487935535487070858957381010441");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\030" + "'", str5, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "825" + "'", str7, "825");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001B" + "'", str11, "\001B");
    }

    @Test
    public void test8254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8254");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        java.lang.String str15 = rSA1.encrypt("54326269148954289324151592843");
        java.lang.String str17 = rSA1.encrypt("690530077128240573643761455271");
        java.lang.String str19 = rSA1.decrypt("315802401881916");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "235" + "'", str13, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "47" + "'", str15, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "251" + "'", str17, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test8255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8255");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\013\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7893333609" + "'", str3, "7893333609");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1794025729" + "'", str7, "1794025729");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6841246830" + "'", str9, "6841246830");
    }

    @Test
    public void test8256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8256");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.decrypt("129799971888735661335295966205");
        java.lang.String str13 = rSA1.decrypt("6709988038");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "265671339" + "'", str3, "265671339");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2761811391" + "'", str5, "2761811391");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5139748288" + "'", str7, "5139748288");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3989426234" + "'", str9, "3989426234");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffdI\t\ufffd" + "'", str11, "\001\ufffdI\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "M\007Q\036" + "'", str13, "M\007Q\036");
    }

    @Test
    public void test8257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8257");
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
        java.lang.String str27 = rSA1.encrypt("\003\ufffd\ufffd\033\u041e\ufffd\ufffd\ufffdD");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "510073542925747" + "'", str7, "510073542925747");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\uebc4" + "'", str9, "\005\ufffd\ufffd\ufffd\uebc4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2625296958787785" + "'", str13, "2625296958787785");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1212242513355527" + "'", str17, "1212242513355527");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "263216679860382" + "'", str19, "263216679860382");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\177\ufffd\ufffdV" + "'", str21, "\002\ufffd\177\ufffd\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\b\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2383957119458977" + "'", str25, "2383957119458977");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2673089414001960" + "'", str27, "2673089414001960");
    }

    @Test
    public void test8258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8258");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("964760522190663");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001P\006&\023\ufffd\ufffd\ufffd\031\005EM\016" + "'", str9, "\001P\006&\023\ufffd\ufffd\ufffd\031\005EM\016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffdP\002\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\ufffdP\002\ufffd");
    }

    @Test
    public void test8259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8259");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("569046855107122163755734229680");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffdU\037g\032\ufffdP");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "485" + "'", str9, "485");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001(" + "'", str11, "\001(");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "566" + "'", str17, "566");
    }

    @Test
    public void test8260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8260");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1926197420224977" + "'", str13, "1926197420224977");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd|\177" + "'", str15, "\005\ufffd\ufffd|\177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffdY" + "'", str17, "\002\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\u0259Z;q1" + "'", str19, "\005\u0259Z;q1");
    }

    @Test
    public void test8261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8261");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("2226987130855552");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd\ufffd\ufffd&r");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\u03a6%" + "'", str5, "\000\ufffd\u03a6%");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9946160897" + "'", str7, "9946160897");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3443351237" + "'", str9, "3443351237");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "319897956585088492863714243391" + "'", str15, "319897956585088492863714243391");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "521281539417660804540922885499" + "'", str17, "521281539417660804540922885499");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "491371368179014014400132023062" + "'", str19, "491371368179014014400132023062");
    }

    @Test
    public void test8262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8262");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("370");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ud8de\udc8d\u015d");
        java.lang.String str19 = rSA1.encrypt("\006\ufffd\u04bf\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "328195842527608323580891676221" + "'", str9, "328195842527608323580891676221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffdb\r\ufffd\007\ufffdn" + "'", str11, "\001\ufffd\ufffd\ufffdb\r\ufffd\007\ufffdn");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "715380388058142464341905431636" + "'", str13, "715380388058142464341905431636");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd.&0\003\ufffd\u0113\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd.&0\003\ufffd\u0113\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "564202769721773806428639608506" + "'", str17, "564202769721773806428639608506");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "652350669775265021255189882052" + "'", str19, "652350669775265021255189882052");
    }

    @Test
    public void test8263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8263");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("333538977866196043865277785098");
        java.lang.String str7 = rSA1.encrypt("2579809352261412");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "62" + "'", str7, "62");
    }

    @Test
    public void test8264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8264");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\030\ufffd\ufffd\024\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001w" + "'", str7, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "916" + "'", str9, "916");
    }

    @Test
    public void test8265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8265");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("147563026464741632979335701288");
        java.lang.String str15 = rSA1.decrypt("1822649237519567");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\037\ufffdK\032\u070c");
        java.lang.String str19 = rSA1.encrypt("1609305523506661");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "67835496219921875457677729217" + "'", str11, "67835496219921875457677729217");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "301998209608354607581939021512" + "'", str13, "301998209608354607581939021512");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\033" + "'", str15, "\001\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\033");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "120367839362817669248146114107" + "'", str17, "120367839362817669248146114107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "267953223221389293431673119721" + "'", str19, "267953223221389293431673119721");
    }

    @Test
    public void test8266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8266");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "17009471576737344687159303443" + "'", str9, "17009471576737344687159303443");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17009471576737344687159303443" + "'", str11, "17009471576737344687159303443");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\u0626\ufffd\ufffd\ufffd,\020N" + "'", str13, "\006\ufffd\ufffd\u0626\ufffd\ufffd\ufffd,\020N");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "208528546238674" + "'", str17, "208528546238674");
    }

    @Test
    public void test8267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8267");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("805201222");
        java.lang.String str17 = rSA1.encrypt("764648198592128872528547211042");
        java.lang.String str19 = rSA1.encrypt("257355366039753");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "867024069117306188862055917499" + "'", str9, "867024069117306188862055917499");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "663092852067847691519075303950" + "'", str11, "663092852067847691519075303950");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\u71ff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\013\u71ff\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\f\ufffdPpaV^oK" + "'", str15, "\006\ufffd\ufffd\f\ufffdPpaV^oK");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "890155260516152084984113666449" + "'", str17, "890155260516152084984113666449");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "658696204549815954084220531170" + "'", str19, "658696204549815954084220531170");
    }

    @Test
    public void test8268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8268");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("2912429732105156");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffdw" + "'", str11, "\ufffdw");
    }

    @Test
    public void test8269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8269");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("318");
        java.lang.String str17 = rSA1.decrypt("1558092582932101");
        java.lang.String str19 = rSA1.decrypt("9356914389550787853776870324");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\005\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffdk" + "'", str15, "\000\ufffd\ufffd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffdT\006\ufffd" + "'", str17, "\003\ufffdT\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\003\ufffd\ufffd" + "'", str19, "\006\ufffd\003\ufffd\ufffd");
    }

    @Test
    public void test8270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8270");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("\b\ufffd\ufffdc\f\ufffd\n");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2038830830391274" + "'", str15, "2038830830391274");
    }

    @Test
    public void test8271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8271");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.encrypt("846394549888105749652536627724");
        java.lang.String str21 = rSA1.encrypt("1512739533813279");
        java.lang.String str23 = rSA1.decrypt("4295901134");
        java.lang.String str25 = rSA1.encrypt("9157523543325901199714361913");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1799490584708995" + "'", str7, "1799490584708995");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1704482158748315" + "'", str13, "1704482158748315");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ns\036\ufffdu\n" + "'", str15, "\001\ns\036\ufffdu\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\t\ufffd?z" + "'", str17, "\003\ufffd\t\ufffd?z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3256145235749633" + "'", str19, "3256145235749633");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "357468169067494" + "'", str21, "357468169067494");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007\ufffd\ufffd\025\ufffd\ufffd" + "'", str23, "\007\ufffd\ufffd\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "813824600130028" + "'", str25, "813824600130028");
    }

    @Test
    public void test8272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8272");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\t\u0360");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "405868852265797725937199133731" + "'", str9, "405868852265797725937199133731");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "405868852265797725937199133731" + "'", str11, "405868852265797725937199133731");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1783062823180090" + "'", str17, "1783062823180090");
    }

    @Test
    public void test8273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8273");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("453903122546506064924666794964");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1023590872619720" + "'", str7, "1023590872619720");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5018082964" + "'", str11, "5018082964");
    }

    @Test
    public void test8274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8274");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5854474203917" + "'", str7, "5854474203917");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1372200523300991" + "'", str9, "1372200523300991");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test8275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8275");
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
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1248547268006409" + "'", str7, "1248547268006409");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1594279837942392" + "'", str13, "1594279837942392");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003v\037{\037\ufffd" + "'", str17, "\003v\037{\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "221318096139056" + "'", str19, "221318096139056");
    }

    @Test
    public void test8276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8276");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \";F.?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "447" + "'", str17, "447");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001Y" + "'", str19, "\001Y");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "383" + "'", str21, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "278" + "'", str23, "278");
    }

    @Test
    public void test8277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8277");
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
        java.lang.String str23 = rSA1.decrypt("249801919758792865935926519031");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001>" + "'", str15, "\001>");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "423" + "'", str17, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "473" + "'", str21, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\003" + "'", str23, "\001\003");
    }

    @Test
    public void test8278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8278");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33570448563366733031" + "'", str15, "33570448563366733031");
    }

    @Test
    public void test8279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8279");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("586614665667193");
        java.lang.String str17 = rSA1.encrypt("351599105432965402456457863394");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1667328052201108" + "'", str7, "1667328052201108");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\027\u049b\ufffd\ufffd" + "'", str9, "\005\027\u049b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001I\r\ufffd\ufffd\000" + "'", str11, "\001I\r\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\"\ufffd\ufffd\ufffdO\t\022\005)" + "'", str15, "\"\ufffd\ufffd\ufffdO\t\022\005)");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "28238501310563184996999406017" + "'", str17, "28238501310563184996999406017");
    }

    @Test
    public void test8280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8280");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.encrypt("5799003948");
        java.lang.String str7 = rSA1.decrypt("4747158113");
        java.lang.String str9 = rSA1.decrypt("541080546688817559591567168106");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\025-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "175218404089229565677317346743" + "'", str3, "175218404089229565677317346743");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "102718696049211051530957371457" + "'", str5, "102718696049211051530957371457");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\000\ufffd\ufffd\ufffd\003\ufffd" + "'", str7, "\005\ufffd\ufffd\000\ufffd\ufffd\ufffd\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\"\ufffd\ufffd\ufffd\ufffd\ufffdY\035x" + "'", str9, "\005\"\ufffd\ufffd\ufffd\ufffd\ufffdY\035x");
    }

    @Test
    public void test8281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8281");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("78487019142441916661670426960");
        java.lang.String str11 = rSA1.decrypt("2887182458725638");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1574973542" + "'", str5, "1574973542");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "662382559" + "'", str7, "662382559");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffdY(" + "'", str9, "\ufffdY(");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffdP\034*" + "'", str11, "\000\ufffdP\034*");
    }

    @Test
    public void test8282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8282");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\u06c3\004c");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "881467228048434" + "'", str7, "881467228048434");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "310" + "'", str15, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "173" + "'", str19, "173");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8283");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("89040210064112265853492837860");
        java.lang.String str19 = rSA1.decrypt("1239847037241862");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "377388635207363022256177934254" + "'", str9, "377388635207363022256177934254");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "696779139877528209043536324676" + "'", str11, "696779139877528209043536324676");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "551077370962642718461225718754" + "'", str13, "551077370962642718461225718754");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffdd5{" + "'", str15, "\013\ufffd\ufffd\ufffd\ufffd\ufffdd5{");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8284");
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
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str27 = rSA1.encrypt("5146518914");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "148874417960429" + "'", str7, "148874417960429");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "865644298140702" + "'", str13, "865644298140702");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffd\ufffd" + "'", str17, "\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "958066787889561" + "'", str19, "958066787889561");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "164459616435583305663644340980" + "'", str23, "164459616435583305663644340980");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "79" + "'", str27, "79");
    }

    @Test
    public void test8285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8285");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005/P\002\ufffd\ufffd\ufffd\ufffd\ufffd'" + "'", str11, "\005/P\002\ufffd\ufffd\ufffd\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "106899773709478890825585609268" + "'", str13, "106899773709478890825585609268");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8286");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        java.lang.String str17 = rSA1.encrypt("100808031796894");
        java.lang.String str19 = rSA1.encrypt("292433961960724721491493060347");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str23 = rSA1.encrypt("\002\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str25 = rSA1.encrypt("\005K+\034\ufffdx\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "640653159026629" + "'", str11, "640653159026629");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "679493504898690" + "'", str13, "679493504898690");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "187801697486691" + "'", str15, "187801697486691");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2495937538337013" + "'", str17, "2495937538337013");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "953469336065635" + "'", str19, "953469336065635");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "372" + "'", str23, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "34" + "'", str25, "34");
    }

    @Test
    public void test8287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8287");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("37822311364830212583");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\bV_n\003\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?V_n???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd-z" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd-z");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2167987282713466" + "'", str15, "2167987282713466");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "936943946352901" + "'", str17, "936943946352901");
    }

    @Test
    public void test8288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8288");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd`A" + "'", str13, "\002\ufffd\ufffd\ufffd`A");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1977227672933389" + "'", str15, "1977227672933389");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "195683546992724" + "'", str17, "195683546992724");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "82807160731311" + "'", str19, "82807160731311");
    }

    @Test
    public void test8289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8289");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("\002t");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("382306363299315393630957444423");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97678328378368" + "'", str11, "97678328378368");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1097910263" + "'", str15, "1097910263");
    }

    @Test
    public void test8290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8290");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("5447816862");
        java.lang.String str11 = rSA1.encrypt("895208255");
        java.lang.String str13 = rSA1.decrypt("540578322830872259908185601083");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002q" + "'", str9, "\002q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "834" + "'", str11, "834");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test8291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8291");
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
        java.lang.String str27 = rSA1.decrypt("516658321736835734876287148460");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\026\ufffd\ufffd\ufffd" + "'", str13, "\002\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1001019189903007" + "'", str15, "1001019189903007");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "831810708437363" + "'", str17, "831810708437363");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "907126641263813" + "'", str19, "907126641263813");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1669626470787419" + "'", str21, "1669626470787419");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "305597121190333" + "'", str23, "305597121190333");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1660715680016178" + "'", str25, "1660715680016178");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001\ufffd\ufffd\026\ufffd\ufffd\ufffd" + "'", str27, "\001\ufffd\ufffd\026\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8292");
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
        java.lang.String str35 = rSA1.encrypt("7311607857");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = rSA1.decrypt("\002\ufffd\n\ufffd\ufffd\006\ufffd$");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?!??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "602400523453897" + "'", str7, "602400523453897");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "383" + "'", str21, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "265" + "'", str27, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "406492260001286624467544833221" + "'", str31, "406492260001286624467544833221");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "459780841144231715204065040285" + "'", str33, "459780841144231715204065040285");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "136965241162673288605421718575" + "'", str35, "136965241162673288605421718575");
    }

    @Test
    public void test8293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8293");
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
        java.lang.String str23 = rSA1.encrypt("781050896");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1958736049801828" + "'", str7, "1958736049801828");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "546" + "'", str19, "546");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2931205158" + "'", str23, "2931205158");
    }

    @Test
    public void test8294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8294");
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
        java.lang.String str23 = rSA1.encrypt("326708160311541190742777933627");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "366698442971612260915880245918" + "'", str9, "366698442971612260915880245918");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\u044c\ufffd\ufffdh\007\f\ufffd\ufffd\ufffd$" + "'", str11, "\002\u044c\ufffd\ufffdh\007\f\ufffd\ufffd\ufffd$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "81900028773040572415846509988" + "'", str13, "81900028773040572415846509988");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "388226733939356844600223267188" + "'", str15, "388226733939356844600223267188");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "543116009696284936657682309018" + "'", str17, "543116009696284936657682309018");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "21659910533750031415317037596" + "'", str19, "21659910533750031415317037596");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "183254884959061836945388203767" + "'", str21, "183254884959061836945388203767");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "235209760630777393875761260386" + "'", str23, "235209760630777393875761260386");
    }

    @Test
    public void test8295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8295");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.decrypt("88311020181547747371412072505");
        java.lang.String str19 = rSA1.encrypt("2026972169485856");
        java.lang.String str21 = rSA1.encrypt("\"\ufffd[");
        java.lang.String str23 = rSA1.encrypt("\002\ufffd\ufffd\ua93d\ufffd\ufffd\ufffd\ufffd\ufffd\035\001");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "853607500017974875607598522494" + "'", str9, "853607500017974875607598522494");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "979870828592984107528576483414" + "'", str13, "979870828592984107528576483414");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd5z\025\032\013\ufffd\ufffd" + "'", str15, "\t\ufffd5z\025\032\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\031\021\ufffd\ufffdJ:" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\031\021\ufffd\ufffdJ:");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "640005107879099337934037347389" + "'", str19, "640005107879099337934037347389");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "31374786211704969969618367452" + "'", str21, "31374786211704969969618367452");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "915046737582746856516436609103" + "'", str23, "915046737582746856516436609103");
    }

    @Test
    public void test8296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8296");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffdxT5.G" + "'", str11, "\001\ufffd\ufffd\ufffdxT5.G");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373669453125" + "'", str13, "373669453125");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8297");
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
        java.lang.String str21 = rSA1.encrypt("323602697523004");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2254323734071773" + "'", str7, "2254323734071773");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1433410705853398" + "'", str13, "1433410705853398");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\t\ufffd\ufffd\ufffd" + "'", str15, "\b\t\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\013\017p" + "'", str17, "\002\ufffd\013\017p");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "270362814418752" + "'", str19, "270362814418752");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "879320446830909" + "'", str21, "879320446830909");
    }

    @Test
    public void test8298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8298");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.encrypt("5904631369");
        java.lang.String str11 = rSA1.encrypt("73931890830183151123801579485");
        java.lang.String str13 = rSA1.decrypt("58463557023417");
        java.lang.String str15 = rSA1.encrypt("31235285618709288526127992429");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "457300940788083" + "'", str7, "457300940788083");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1240251469013275" + "'", str9, "1240251469013275");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1244868234717183" + "'", str11, "1244868234717183");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u07be\ufffd<{\020" + "'", str13, "\001\u07be\ufffd<{\020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2093170901475232" + "'", str15, "2093170901475232");
    }

    @Test
    public void test8299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8299");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("201");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\022\ufffd\ufffd\177a." + "'", str11, "\005\ufffd\022\ufffd\ufffd\177a.");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\u0176Y\"\ufffd\ufffd\007w" + "'", str13, "\002\ufffd\u0176Y\"\ufffd\ufffd\007w");
    }

    @Test
    public void test8300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8300");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.decrypt("925568231498920647360821327791");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("213404515581907");
        java.lang.String str13 = rSA1.decrypt("1658293335");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3760305159" + "'", str3, "3760305159");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\n\ufffd" + "'", str7, "\000\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5342200799" + "'", str11, "5342200799");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8301");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        java.lang.String str9 = rSA1.encrypt("491597882470490509387393294253");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("292711132686465098109993669615");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\005\ufffd\ufffd1\036\ufffd" + "'", str3, "\002\ufffd\ufffd\005\ufffd\ufffd1\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "408811697455991731554791653673" + "'", str5, "408811697455991731554791653673");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\017\t\ufffd\ufffd\ufffdN$ " + "'", str7, "\005\017\t\ufffd\ufffd\ufffdN$ ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "342539586381378546853453248204" + "'", str9, "342539586381378546853453248204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "39854384153873526772586017036" + "'", str13, "39854384153873526772586017036");
    }

    @Test
    public void test8302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8302");
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
        java.lang.String str29 = rSA1.encrypt("\002\ufffd\ufffd\002\ufffd\u014e\ufffd\ufffd\025\031a");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3312337599703092" + "'", str15, "3312337599703092");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "94820837178692" + "'", str17, "94820837178692");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "328" + "'", str21, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "766" + "'", str23, "766");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\n" + "'", str25, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001\ufffd" + "'", str27, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "46" + "'", str29, "46");
    }

    @Test
    public void test8303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8303");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("570226650639502135961025038359");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "407" + "'", str11, "407");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\016\ufffd\006\ufffd\ufffd\ufffd\ufffd\bK" + "'", str17, "\016\ufffd\006\ufffd\ufffd\ufffd\ufffd\bK");
    }

    @Test
    public void test8304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8304");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "511411640062749" + "'", str7, "511411640062749");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd");
    }

    @Test
    public void test8305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8305");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("26893637232334721503841261175");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "629254935014858987629710895706" + "'", str9, "629254935014858987629710895706");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test8306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8306");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str5 = rSA1.encrypt("\n\007\ufffdG\005\ufffd$K\020\ufffd|7\013");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\004\031\035\ufffdF\003\ufffdyv>\230");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "22356006969696753803791916791" + "'", str5, "22356006969696753803791916791");
    }

    @Test
    public void test8307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8307");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("559478705485095");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "130" + "'", str11, "130");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "401" + "'", str13, "401");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "285440451832211892201080327661" + "'", str17, "285440451832211892201080327661");
    }

    @Test
    public void test8308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8308");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("523");
        java.lang.String str17 = rSA1.decrypt("614346653771592189209303265764");
        java.lang.String str19 = rSA1.decrypt("410136971592869927027307124415");
        java.lang.String str21 = rSA1.decrypt("37969581095607959753519100948");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\024" + "'", str11, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001m" + "'", str13, "\001m");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9" + "'", str17, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001)" + "'", str19, "\001)");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test8309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8309");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("270064452819075595077010738176");
        java.lang.String str13 = rSA1.encrypt("1968255834337447");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\354" + "'", str7, "\ufffd\354");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4190048201" + "'", str9, "4190048201");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5355763935" + "'", str13, "5355763935");
    }

    @Test
    public void test8310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8310");
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
        java.lang.String str25 = rSA1.encrypt("\002Hd\037\ufffd\ufffd\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9038531189507742061321068762" + "'", str11, "9038531189507742061321068762");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004" + "'", str17, "\004");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\t" + "'", str19, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "438275791736957406521141663091" + "'", str25, "438275791736957406521141663091");
    }

    @Test
    public void test8311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8311");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("548110071361613660316881187141");
        java.lang.String str17 = rSA1.encrypt("490");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt(".\005*\\\ufffd\035\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \".?*\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "123491484665979183856952063209" + "'", str9, "123491484665979183856952063209");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "426905927000960237568" + "'", str11, "426905927000960237568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdc" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "25524468766407244271986258817" + "'", str15, "25524468766407244271986258817");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "180441679186308401865445204060" + "'", str17, "180441679186308401865445204060");
    }

    @Test
    public void test8312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8312");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("1955448203012581");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "234" + "'", str3, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd0" + "'", str7, "\001\ufffd\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\u0761\ufffd\\" + "'", str9, "\000\u0761\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8841904734" + "'", str11, "8841904734");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8313");
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
        java.lang.String str23 = rSA1.encrypt("\002\005\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "338" + "'", str13, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "102192154122800909815410419535" + "'", str17, "102192154122800909815410419535");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "393823252906306157716670607112" + "'", str19, "393823252906306157716670607112");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "386561799076757221479905671949" + "'", str23, "386561799076757221479905671949");
    }

    @Test
    public void test8314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8314");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "360870411895678" + "'", str7, "360870411895678");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "505636298" + "'", str11, "505636298");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "YM\013\ufffd" + "'", str13, "YM\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8315");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\ufffd\u01f10\025\ufffd");
        java.lang.String str13 = rSA1.decrypt("10416085735186");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\u02d7\b\ufffd\ufffd\ufffd8");
        java.lang.String str17 = rSA1.decrypt("1931499264044464");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\030\ufffdw\035\ua7e7\ufffd\ufffd" + "'", str9, "\001\030\ufffdw\035\ua7e7\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "469962943526955578030167760231" + "'", str11, "469962943526955578030167760231");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\016\ufffd\035\025\ufffd\ufffd8" + "'", str13, "\003\ufffd\016\ufffd\035\025\ufffd\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "216510825744332632436324398067" + "'", str15, "216510825744332632436324398067");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\006\ufffd\036\ufffd+\t" + "'", str17, "\b\ufffd\ufffd\ufffd\ufffd\006\ufffd\036\ufffd+\t");
    }

    @Test
    public void test8316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8316");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "147934805124861146904159628839" + "'", str9, "147934805124861146904159628839");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "147934805124861146904159628839" + "'", str11, "147934805124861146904159628839");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffdP\177\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffdP\177\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "561695708382266906744526890070" + "'", str15, "561695708382266906744526890070");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\u034a\ufffdzE\000\ufffd" + "'", str17, "\004\ufffd\u034a\ufffdzE\000\ufffd");
    }

    @Test
    public void test8317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8317");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("\030");
        java.lang.String str17 = rSA1.decrypt("526416388401332");
        java.lang.String str19 = rSA1.encrypt("\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t" + "'", str7, "\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "S" + "'", str9, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0016" + "'", str11, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "139" + "'", str15, "139");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
    }

    @Test
    public void test8318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8318");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("169979458167342652716591007703");
        java.lang.String str19 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\u027a\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "309536275005859315428059763632" + "'", str11, "309536275005859315428059763632");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "141301969681238548029799599684" + "'", str13, "141301969681238548029799599684");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "216500236776121252275421415709" + "'", str17, "216500236776121252275421415709");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "461994646425854675931169308222" + "'", str19, "461994646425854675931169308222");
    }

    @Test
    public void test8319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8319");
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
        java.lang.String str21 = rSA1.decrypt("1027803753855805");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1015768399856894" + "'", str13, "1015768399856894");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1239559533097416" + "'", str15, "1239559533097416");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1778807931853602" + "'", str17, "1778807931853602");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1461433469781009" + "'", str19, "1461433469781009");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\ufffd\ufffd\000" + "'", str21, "\007\ufffd\ufffd\ufffd\000");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test8320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8320");
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
        java.lang.String str23 = rSA1.encrypt("\006\ufffd\ufffd\u04a9\ufffdV");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\ufffd\ufffd9");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"5??9\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "609630476231691293117524489222" + "'", str9, "609630476231691293117524489222");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "609630476231691293117524489222" + "'", str11, "609630476231691293117524489222");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\u64c3\ufffd\ufffd\ufffd\ufffd\001Nf" + "'", str13, "\000\ufffd\u64c3\ufffd\ufffd\ufffd\ufffd\001Nf");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44177176757162503236606405057" + "'", str15, "44177176757162503236606405057");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffd\ufffd\ufffd\177\021%\000\ufffdKd3F" + "'", str17, "\t\ufffd\ufffd\ufffd\177\021%\000\ufffdKd3F");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "233" + "'", str23, "233");
    }

    @Test
    public void test8321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8321");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.decrypt("570514976048732924728282873013");
        java.lang.String str17 = rSA1.decrypt("3287111037");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "502744572258222757605273312508" + "'", str11, "502744572258222757605273312508");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\033\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd" + "'", str15, "\002\033\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\u031b\ufffd\ufffd\udb7e\udc82\ufffd\ufffdR" + "'", str17, "\003\u031b\ufffd\ufffd\udb7e\udc82\ufffd\ufffdR");
    }

    @Test
    public void test8322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8322");
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
        java.lang.String str21 = rSA1.encrypt("703037567");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "289074048118831512971868897626" + "'", str9, "289074048118831512971868897626");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "240715250718359175574183347852" + "'", str11, "240715250718359175574183347852");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\005\ufffd79\177\ufffd\ufffd" + "'", str13, "\002\ufffd\005\ufffd79\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "285402798941473217906753943135" + "'", str17, "285402798941473217906753943135");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\r87\021[y\020\ufffd\034\ufffd" + "'", str19, "\001\ufffd\r87\021[y\020\ufffd\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "301172329755056801397721000560" + "'", str21, "301172329755056801397721000560");
    }

    @Test
    public void test8323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8323");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("477275381709667864596972007455");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1719158392" + "'", str11, "1719158392");
    }

    @Test
    public void test8324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8324");
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
        java.lang.String str27 = rSA1.encrypt("1378274519");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3917879466" + "'", str7, "3917879466");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10259621550" + "'", str9, "10259621550");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\uce65" + "'", str11, "\002\uce65");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4141742128" + "'", str13, "4141742128");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\u9ea7" + "'", str17, "\001\u9ea7");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str19, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "848549454509506" + "'", str21, "848549454509506");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "93" + "'", str25, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "513" + "'", str27, "513");
    }

    @Test
    public void test8325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8325");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_" + "'", str7, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "410" + "'", str9, "410");
    }

    @Test
    public void test8326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8326");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("\004\024\ufffd\"\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "914319686621449" + "'", str7, "914319686621449");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001j?G\020\ufffd\ufffd" + "'", str9, "\001j?G\020\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "737897771698471" + "'", str13, "737897771698471");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "743227480087523" + "'", str17, "743227480087523");
    }

    @Test
    public void test8327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8327");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        java.lang.String str15 = rSA1.encrypt("258");
        java.lang.String str17 = rSA1.decrypt("4586471424");
        java.lang.String str19 = rSA1.encrypt("\b\ufffd\005dZ\032y");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "306221108727615656136552698403" + "'", str9, "306221108727615656136552698403");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\002\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r" + "'", str11, "\002\002\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffdk\024Hk4" + "'", str13, "\006\ufffd\ufffdk\024Hk4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "318765109409839999493890450036" + "'", str15, "318765109409839999493890450036");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\030" + "'", str17, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "101818655123129504138585809638" + "'", str19, "101818655123129504138585809638");
    }

    @Test
    public void test8328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8328");
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
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6592154991685262412595286270" + "'", str13, "6592154991685262412595286270");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "255243768924373800510042656449" + "'", str19, "255243768924373800510042656449");
    }

    @Test
    public void test8329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8329");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("517376765656606617096719830177");
        java.lang.String str13 = rSA1.decrypt("1511878007853413");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\034\ufffd\032\ufffd\ufffd\\\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??d?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1427934192" + "'", str3, "1427934192");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1198889971" + "'", str7, "1198889971");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001&v\bx" + "'", str9, "\001&v\bx");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "354350098" + "'", str11, "354350098");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\032\ufffd&" + "'", str13, "\001\ufffd\032\ufffd&");
    }

    @Test
    public void test8330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8330");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "48" + "'", str7, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdn" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdn");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7553554225491327483200715592" + "'", str13, "7553554225491327483200715592");
    }

    @Test
    public void test8331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8331");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.lang.String str17 = rSA1.encrypt("173476924289590");
        java.lang.String str19 = rSA1.encrypt("1422455974188443");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1499451820997996" + "'", str7, "1499451820997996");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd?" + "'", str15, "\ufffd?");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1317812211" + "'", str17, "1317812211");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9425207075" + "'", str19, "9425207075");
    }

    @Test
    public void test8332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8332");
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
        java.lang.String str29 = rSA1.decrypt("819786542222851498726815977377");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.encrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "495446063257080679323601596928" + "'", str9, "495446063257080679323601596928");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "632464420884549854478014577306" + "'", str11, "632464420884549854478014577306");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "148700481534092584978999960130" + "'", str13, "148700481534092584978999960130");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "54" + "'", str17, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "128" + "'", str21, "128");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "852391456468132722382234398690" + "'", str25, "852391456468132722382234398690");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "810241538827569294591095831162" + "'", str27, "810241538827569294591095831162");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdB\t" + "'", str29, "\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdB\t");
    }

    @Test
    public void test8333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8333");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        java.lang.String str7 = rSA1.decrypt("2387231432217160");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006k$\035\ufffd\ufffd\ufffd\004\ufffd" + "'", str3, "\006k$\035\ufffd\ufffd\ufffd\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "995515265784159889798424065" + "'", str5, "995515265784159889798424065");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8334");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str9 = rSA1.decrypt("2602093156");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test8335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8335");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("402119530394494");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("2484642719825111");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "623229500989175" + "'", str7, "623229500989175");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4679979882" + "'", str19, "4679979882");
    }

    @Test
    public void test8336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8336");
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
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str31 = rSA1.encrypt("4571991324");
        java.math.BigInteger bigInteger32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger33 = rSA1.encrypt(bigInteger32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "19473612304922" + "'", str7, "19473612304922");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002*" + "'", str19, "\002*");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "924" + "'", str21, "924");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd" + "'", str23, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "83" + "'", str27, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "307770674964827563134909086733" + "'", str31, "307770674964827563134909086733");
    }

    @Test
    public void test8337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8337");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("2138559621");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1638687213" + "'", str5, "1638687213");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1220860869" + "'", str7, "1220860869");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "504886178" + "'", str9, "504886178");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd0z" + "'", str11, "\000\ufffd\ufffd0z");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test8338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8338");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "798049256011126" + "'", str7, "798049256011126");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
    }

    @Test
    public void test8339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8339");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "811664064104710" + "'", str13, "811664064104710");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "829001240338801" + "'", str15, "829001240338801");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1054037274914855" + "'", str17, "1054037274914855");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\177\t\ufffdm2K" + "'", str19, "\004\177\t\ufffdm2K");
    }

    @Test
    public void test8340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8340");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\u065d\u01f6\ufffdT\004");
        java.lang.String str21 = rSA1.decrypt("4150842280");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "565332392710307931706322315758" + "'", str9, "565332392710307931706322315758");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\004\ufffd\030\ufffd\ufffd\ufffd\ufffd$" + "'", str11, "\005\ufffd\004\ufffd\030\ufffd\ufffd\ufffd\ufffd$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffd;S" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffd;S");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8230106113" + "'", str19, "8230106113");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\031" + "'", str21, "\ufffd\031");
    }

    @Test
    public void test8341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8341");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001I\"\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001I\"\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8342");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("432268551667889026451279149775");
        java.lang.String str11 = rSA1.decrypt("67255654729147995743857032941");
        java.lang.String str13 = rSA1.encrypt("90158492089125200430849511322");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\033\ufffd\035" + "'", str9, "\033\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\036\ufffd\ufffd^" + "'", str11, "\036\ufffd\ufffd^");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1086616094" + "'", str13, "1086616094");
    }

    @Test
    public void test8343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8343");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("229");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffd\004\ufffd\ufffd\ufffd~a5\004O" + "'", str11, "\f\ufffd\004\ufffd\ufffd\ufffd~a5\004O");
    }

    @Test
    public void test8344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8344");
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
        java.lang.String str23 = rSA1.decrypt("150659065754400166800630020963");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2242038415077774" + "'", str15, "2242038415077774");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "372552373613914" + "'", str17, "372552373613914");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2250666132625" + "'", str19, "2250666132625");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test8345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8345");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd(L");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Xh\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffdM\177\037\ufffd\f\ufffd\ufffdJ" + "'", str11, "\001\ufffd\ufffd\ufffdM\177\037\ufffd\f\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33570448563366733031" + "'", str15, "33570448563366733031");
    }

    @Test
    public void test8346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8346");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("446605868052502");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "64220402528983492728535504276" + "'", str9, "64220402528983492728535504276");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "172894925741119710294116650073" + "'", str11, "172894925741119710294116650073");
    }

    @Test
    public void test8347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8347");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("457613644251791188504293612087");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\032\ufffd\ufffd" + "'", str7, "\004\ufffd\032\ufffd\ufffd");
    }

    @Test
    public void test8348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8348");
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
        java.lang.String str21 = rSA1.encrypt("2741399055685325");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "191" + "'", str3, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6236175677" + "'", str7, "6236175677");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4591350064" + "'", str9, "4591350064");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\u0182\ufffdl" + "'", str11, "\000\u0182\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5153045008" + "'", str13, "5153045008");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "649027259653091" + "'", str17, "649027259653091");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "550515204926730" + "'", str19, "550515204926730");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1705259959288485" + "'", str21, "1705259959288485");
    }

    @Test
    public void test8349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8349");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        java.lang.String str13 = rSA1.decrypt("42255066403800866001807416701");
        java.lang.String str15 = rSA1.decrypt("1219490463205769");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "762436358252153" + "'", str7, "762436358252153");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1719056689160127" + "'", str9, "1719056689160127");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1863971807292723" + "'", str11, "1863971807292723");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\"" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\"");
    }

    @Test
    public void test8350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8350");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("66989149375831");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1670895333550818" + "'", str7, "1670895333550818");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "228" + "'", str15, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "553142719382811" + "'", str19, "553142719382811");
    }

    @Test
    public void test8351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8351");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("402808305376343001842341859718");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\021\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd" + "'", str3, "\021\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "213993710154338356868751112387" + "'", str5, "213993710154338356868751112387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "622622171365157573446399577269" + "'", str7, "622622171365157573446399577269");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\016\ufffd\035\ufffd\ufffd\u06ab\ufffd\ufffd" + "'", str11, "\002\ufffd\016\ufffd\035\ufffd\ufffd\u06ab\ufffd\ufffd");
    }

    @Test
    public void test8352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8352");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.encrypt("216");
        java.lang.String str15 = rSA1.decrypt("14");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "124738847944725015034756361917" + "'", str9, "124738847944725015034756361917");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112647520323028496462038144382" + "'", str11, "112647520323028496462038144382");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "128068546235974340531961271340" + "'", str13, "128068546235974340531961271340");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\u04e9\ufffd\023\ufffd\ufffd" + "'", str15, "\003\ufffd\u04e9\ufffd\023\ufffd\ufffd");
    }

    @Test
    public void test8353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8353");
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
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\001\u029c\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?)????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222546742708611816901346928878" + "'", str9, "222546742708611816901346928878");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffds\026\u05f7dX" + "'", str11, "\003\ufffd\ufffd\ufffd\ufffds\026\u05f7dX");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "247489208746682350486145751598" + "'", str13, "247489208746682350486145751598");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd*H>?\006\ufffd\ufffdV\032\ufffd\ufffd" + "'", str15, "\007\ufffd*H>?\006\ufffd\ufffdV\032\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "86607053384192373573455039492" + "'", str17, "86607053384192373573455039492");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "41572257022331561106724137926" + "'", str21, "41572257022331561106724137926");
    }

    @Test
    public void test8354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8354");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("1743865898247515");
        java.lang.String str7 = rSA1.decrypt("6418890400");
        java.lang.String str9 = rSA1.decrypt("1553033854018792");
        java.lang.String str11 = rSA1.decrypt("501922866233228470784141950334");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1161350975" + "'", str3, "1161350975");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffd" + "'", str5, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\u027c\ufffda" + "'", str7, "\000\u027c\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\u033f" + "'", str11, "\002\ufffd\u033f");
    }

    @Test
    public void test8355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8355");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\n\n\ufffd,(3=\nC@#z");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??N?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "316156212079441270324089049712" + "'", str9, "316156212079441270324089049712");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "426620678798602035050923740133" + "'", str11, "426620678798602035050923740133");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "148405894708488161218907661450" + "'", str13, "148405894708488161218907661450");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "258982470253723522766853209165" + "'", str15, "258982470253723522766853209165");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "433661510639307148398864849192" + "'", str17, "433661510639307148398864849192");
    }

    @Test
    public void test8356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8356");
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
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37074053046924071737421170058" + "'", str9, "37074053046924071737421170058");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37074053046924071737421170058" + "'", str11, "37074053046924071737421170058");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd\026\u063e\021\034\ufffd\ufffd" + "'", str13, "\n\ufffd\ufffd\ufffd\026\u063e\021\034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "136952557008384344264357586612" + "'", str15, "136952557008384344264357586612");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffd\ufffdR\002\u0760\ufffd" + "'", str17, "\b\ufffd\ufffd\ufffdR\002\u0760\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "813518443751273722555923493984" + "'", str19, "813518443751273722555923493984");
    }

    @Test
    public void test8357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8357");
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
        rSA1.generateKeys(10);
        java.lang.String str25 = rSA1.encrypt("28854088135441021880472648941");
        java.lang.String str27 = rSA1.encrypt("241119870300090292304087394723");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4006810983311" + "'", str7, "4006810983311");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\025\ufffd\ufffd\ufffd" + "'", str9, "\002\025\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "676179522175861" + "'", str11, "676179522175861");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "146057166867458" + "'", str13, "146057166867458");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "416162395196193" + "'", str15, "416162395196193");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "752021857881254" + "'", str17, "752021857881254");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "297820539872665" + "'", str19, "297820539872665");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\0064\006/<7" + "'", str21, "\001\0064\006/<7");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "47" + "'", str25, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "108" + "'", str27, "108");
    }

    @Test
    public void test8358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8358");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4465561799" + "'", str3, "4465561799");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7578162624" + "'", str7, "7578162624");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\u01ad" + "'", str9, "\001\ufffd\ufffd\u01ad");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "626921616395703" + "'", str13, "626921616395703");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "84051137729145" + "'", str15, "84051137729145");
    }

    @Test
    public void test8359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8359");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "455887979737933" + "'", str7, "455887979737933");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\004\r" + "'", str15, "\002\ufffd\004\r");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9391637606" + "'", str17, "9391637606");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5367143027" + "'", str19, "5367143027");
    }

    @Test
    public void test8360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8360");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "767246622548683" + "'", str7, "767246622548683");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd");
    }

    @Test
    public void test8361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8361");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.decrypt("914181283893724");
        java.lang.String str13 = rSA1.decrypt("406886696867962475347512808088");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\177" + "'", str9, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "w" + "'", str13, "w");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test8362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8362");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        java.lang.String str15 = rSA1.encrypt("5613811618");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "275" + "'", str9, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\030" + "'", str13, "\001\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "57" + "'", str15, "57");
    }

    @Test
    public void test8363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8363");
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
        java.lang.String str25 = rSA1.encrypt("597529458457008656998729363831");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\027\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffdu" + "'", str11, "\005\027\ufffd\ufffd\"\ufffd\ufffd\ufffd\ufffd\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "470665465517647364298550508979" + "'", str13, "470665465517647364298550508979");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002=" + "'", str17, "\002=");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "478" + "'", str19, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "339" + "'", str21, "339");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "73" + "'", str23, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "477" + "'", str25, "477");
    }

    @Test
    public void test8364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8364");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("258580565253484916644733070722");
        java.lang.String str17 = rSA1.encrypt("10670906504");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\"~x\026\ufffd\ufffd\ufffd\ufffd\ufffdcc" + "'", str11, "\005\"~x\026\ufffd\ufffd\ufffd\ufffd\ufffdcc");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "307666966711145287991717862416" + "'", str13, "307666966711145287991717862416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "249279698752631970509240954064" + "'", str15, "249279698752631970509240954064");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "282245860949831846498191520418" + "'", str17, "282245860949831846498191520418");
    }

    @Test
    public void test8365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8365");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "324351209051541607819523092110" + "'", str9, "324351209051541607819523092110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "388563311422980686070166140021" + "'", str11, "388563311422980686070166140021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "401274259807047075294152598843" + "'", str17, "401274259807047075294152598843");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "278627291725671548556142068693" + "'", str19, "278627291725671548556142068693");
    }

    @Test
    public void test8366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8366");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.encrypt("1024");
        java.lang.String str9 = rSA1.encrypt("32785009004481843571057639692");
        java.lang.String str11 = rSA1.decrypt("42362846909373312512");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("\007;\026J\033\ufffd\ufffd\ufffd\t\ufffd\003\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffd\036B" + "'", str3, "\000\ufffd\ufffd\036B");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "710580114" + "'", str5, "710580114");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1206982763" + "'", str7, "1206982763");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1530723203" + "'", str9, "1530723203");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd!" + "'", str11, "\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "16395326466460769628373989980" + "'", str15, "16395326466460769628373989980");
    }

    @Test
    public void test8367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8367");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("93073401367409");
        java.lang.String str21 = rSA1.decrypt("947520970892682146009444878716");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "83" + "'", str5, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "421" + "'", str7, "421");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "354" + "'", str9, "354");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "287" + "'", str15, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\ufffd\ufffd\ufffd\ufffd\001\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test8368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8368");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("85317131416827023530889570588");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\u0725+");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "244139694672326516289850578632" + "'", str9, "244139694672326516289850578632");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "740457671354802534172278428918" + "'", str11, "740457671354802534172278428918");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\f\ufffd\ufffd\ufffd\f\021\ufffd\u0470\b" + "'", str13, "\n\f\ufffd\ufffd\ufffd\f\021\ufffd\u0470\b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "707852376367288944761161100746" + "'", str15, "707852376367288944761161100746");
    }

    @Test
    public void test8369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8369");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "299" + "'", str9, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\032" + "'", str15, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test8370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8370");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("1487242062");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "674788580173866189041757602529" + "'", str9, "674788580173866189041757602529");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)" + "'", str11, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\u042a\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\u042a\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "118122658" + "'", str17, "118122658");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test8371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8371");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "99027854665223" + "'", str7, "99027854665223");
    }

    @Test
    public void test8372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8372");
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
        java.lang.String str21 = rSA1.encrypt("\002\ufffd\ufffd\013+");
        java.lang.String str23 = rSA1.decrypt("525231836345230");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "556" + "'", str3, "556");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12186639248" + "'", str7, "12186639248");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12386057805" + "'", str9, "12386057805");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd:" + "'", str11, "\000\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11104847041" + "'", str13, "11104847041");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "862636758859203" + "'", str17, "862636758859203");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\017\ufffd\ufffd<\025" + "'", str19, "\002\ufffd\017\ufffd\ufffd<\025");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8296615143782" + "'", str21, "8296615143782");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\036QI\0254\t" + "'", str23, "\036QI\0254\t");
    }

    @Test
    public void test8373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8373");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("115020507562074026553288610924");
        java.lang.String str17 = rSA1.encrypt("\nl\033\u73af\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\030K=\001\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1138901246416987" + "'", str7, "1138901246416987");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\020\037" + "'", str9, "\004\ufffd\ufffd\ufffd\020\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "479179940956709" + "'", str17, "479179940956709");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1532433383331051" + "'", str19, "1532433383331051");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test8374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8374");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("3607240756192578");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "381" + "'", str7, "381");
    }

    @Test
    public void test8375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8375");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        java.lang.String str13 = rSA1.decrypt("446994016775255566426474620227");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("1077184317");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3856768428196922" + "'", str7, "3856768428196922");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd");
    }

    @Test
    public void test8376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8376");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(100);
        java.lang.String str7 = rSA1.encrypt("170982480398546979943064049675");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "27380881758887270317493254326" + "'", str7, "27380881758887270317493254326");
    }

    @Test
    public void test8377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8377");
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
        java.lang.String str27 = rSA1.encrypt("625242562048162756081156433445");
        java.lang.String str29 = rSA1.decrypt("144221550832580476995436843390");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "333040256931866808367933784412" + "'", str9, "333040256931866808367933784412");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "333040256931866808367933784412" + "'", str11, "333040256931866808367933784412");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\020\ufffd\ufffd\ufffd>\034\ufffd\ufffd\ufffd\006\ufffd" + "'", str13, "\007\020\ufffd\ufffd\ufffd>\034\ufffd\ufffd\ufffd\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "159143754633219848076223973282" + "'", str15, "159143754633219848076223973282");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\033\ufffd\ufffd\ufffd\004\024\ufffdZ\0207" + "'", str17, "\004\033\ufffd\ufffd\ufffd\004\024\ufffdZ\0207");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "151431058873549485690714401602" + "'", str19, "151431058873549485690714401602");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\r\ufffd\ufffd\ufffd\027\ufffdSs}7" + "'", str21, "\001\ufffd\r\ufffd\ufffd\ufffd\027\ufffdSs}7");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\r\ufffd\ufffd\005" + "'", str25, "\r\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "518681532" + "'", str27, "518681532");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ufffd\ufffd" + "'", str29, "\ufffd\ufffd");
    }

    @Test
    public void test8378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test8378");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\ufffd\ufffd\021\ufffd\ufffd\b\ufffd\021");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1858579489377981" + "'", str7, "1858579489377981");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001E" + "'", str13, "\001E");
    }
}
