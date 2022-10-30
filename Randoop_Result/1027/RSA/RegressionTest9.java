package RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "303903127768173670187724039917" + "'", str9, "303903127768173670187724039917");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "45581313955226181794079771515" + "'", str11, "45581313955226181794079771515");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005_\000\ufffd\ufffdXG" + "'", str15, "\005_\000\ufffd\ufffdXG");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\u070df" + "'", str17, "\001\ufffd\ufffd\u070df");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\rMp");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "133" + "'", str5, "133");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
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
        java.lang.String str21 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd_" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "280440468475854473118018188461" + "'", str13, "280440468475854473118018188461");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "M" + "'", str17, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "199" + "'", str19, "199");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "463" + "'", str21, "463");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "P" + "'", str11, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\013" + "'", str15, "\002\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "463" + "'", str17, "463");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        java.lang.String str7 = rSA1.decrypt("2387231432217160");
        java.lang.String str9 = rSA1.decrypt("22707670828225102787686214356");
        java.lang.String str11 = rSA1.decrypt("1799353956589672");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\020\ufffd\ufffd\017\ufffd\ufffd\ufffd\017\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd\020\ufffd\ufffd\017\ufffd\ufffd\ufffd\017\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "190909499700954940974517533928" + "'", str5, "190909499700954940974517533928");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\u026f\ufffd\ufffd\u076e\024\n\ufffd" + "'", str9, "\000\u026f\ufffd\ufffd\u076e\024\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd}\024\ufffd\006\ufffd\"\013\u06d6*" + "'", str11, "\001\ufffd}\024\ufffd\006\ufffd\"\013\u06d6*");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        java.lang.String str23 = rSA1.encrypt("366256663770416793503748410329");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "522429710694439448081239131884" + "'", str9, "522429710694439448081239131884");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffdb\t\ufffd\022G2" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffdb\t\ufffd\022G2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\u01ad\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\u01ad\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\023\ufffdz\027\ufffd\ufffd\016\006k8o" + "'", str17, "\023\ufffdz\027\ufffd\ufffd\016\006k8o");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2694120315211531276102608050" + "'", str21, "2694120315211531276102608050");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "33021141552876569578329723750" + "'", str23, "33021141552876569578329723750");
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("583253898306406");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "258555835317419508328867046563" + "'", str11, "258555835317419508328867046563");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "702645830776631587360440179556" + "'", str13, "702645830776631587360440179556");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\016x\f\ufffd\ufffdD\034\ufffd\035\ufffd" + "'", str15, "\004\ufffd\016x\f\ufffd\ufffdD\034\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "294749159722182779661814017000" + "'", str17, "294749159722182779661814017000");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        java.lang.String str25 = rSA1.decrypt("72652057612854808969012649713");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "949549338670118" + "'", str7, "949549338670118");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "228" + "'", str15, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "q" + "'", str17, "q");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2" + "'", str25, "2");
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("41063046398994343945280613329");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3201680180" + "'", str11, "3201680180");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7172470287" + "'", str13, "7172470287");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "309" + "'", str9, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "314" + "'", str11, "314");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
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
        java.lang.String str21 = rSA1.decrypt("210378250090253374708038199698");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002L\276\ufffd\ufffd\ufffd\013\ufffd\ufffd\013&?" + "'", str11, "\002L\276\ufffd\ufffd\ufffd\013\ufffd\ufffd\013&?");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "291336491710207877362960214038" + "'", str13, "291336491710207877362960214038");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002=" + "'", str17, "\002=");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "478" + "'", str19, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        java.lang.String str23 = rSA1.decrypt("9990772525");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\030\ufffdZ*d" + "'", str13, "\005\ufffd\030\ufffdZ*d");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2733310978885813" + "'", str15, "2733310978885813");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\"\ufffd\ufffd\ufffd\006[(\034\ufffd\ufffd\017" + "'", str19, "\"\ufffd\ufffd\ufffd\006[(\034\ufffd\ufffd\017");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "27408057193820683014729311582" + "'", str21, "27408057193820683014729311582");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\013>+&\021\ufffd\ufffd\ufffd\ufffd\ufffd\003c" + "'", str23, "\013>+&\021\ufffd\ufffd\ufffd\ufffd\ufffd\003c");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001C");
        java.lang.String str15 = rSA1.decrypt("237830699929158427676435923969");
        java.lang.String str17 = rSA1.decrypt("3060553596769532");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "382326141768359" + "'", str7, "382326141768359");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3515706497843" + "'", str13, "3515706497843");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffdQ\013\004\t" + "'", str15, "\006\ufffd\ufffdQ\013\004\t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffd\ufffdR" + "'", str17, "\t\ufffd\ufffdR");
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77280629596441110989751735530" + "'", str9, "77280629596441110989751735530");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135937467378005172740839073872" + "'", str11, "135937467378005172740839073872");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdR" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004^t\030\ufffd\ufffd\ufffd\ufffdNu" + "'", str15, "\004^t\030\ufffd\ufffd\ufffd\ufffdNu");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "11380529701775094919846656162" + "'", str17, "11380529701775094919846656162");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "829" + "'", str3, "829");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6639628572" + "'", str7, "6639628572");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6097087464" + "'", str9, "6097087464");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffdhf@v\002\ufffd\ufffd\ufffd\b\ufffd");
        java.lang.String str19 = rSA1.encrypt("\005\ufffd7JnS");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "290" + "'", str13, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5818776061794861292005278315" + "'", str17, "5818776061794861292005278315");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "13762136013993660795474485683" + "'", str19, "13762136013993660795474485683");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("810514982227303000140801050035");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "570840753074854795031791740196" + "'", str9, "570840753074854795031791740196");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "922830309250352955180519966636" + "'", str11, "922830309250352955180519966636");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1199857984617824" + "'", str17, "1199857984617824");
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
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
        java.lang.String str21 = rSA1.encrypt("2380889848");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "321456422822513681801336249169" + "'", str9, "321456422822513681801336249169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "64623973071685668998542701893" + "'", str11, "64623973071685668998542701893");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\007\ufffdJ,{=}:\005\006\ufffd" + "'", str13, "\001\ufffd\007\ufffdJ,{=}:\005\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\u0183\ufffdsLs\001\ufffdJ" + "'", str15, "\002\ufffd\ufffd\u0183\ufffdsLs\001\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "233757284148802395866873864475" + "'", str17, "233757284148802395866873864475");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "514467006349045154761076285395" + "'", str21, "514467006349045154761076285395");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???F???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffdW\t\ufffd" + "'", str5, "\001\ufffdW\t\ufffd");
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "145839342541760" + "'", str7, "145839342541760");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "295" + "'", str15, "295");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\034" + "'", str17, "\034");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("470860891773042");
        java.lang.String str9 = rSA1.decrypt("10");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\u03c2\u064a?|" + "'", str9, "\b\u03c2\u064a?|");
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
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
        java.lang.String str21 = rSA1.encrypt("1112108031496516");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1687565489655887" + "'", str7, "1687565489655887");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "59" + "'", str19, "59");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "222" + "'", str21, "222");
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdO");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "110458711235905707081725645028" + "'", str9, "110458711235905707081725645028");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\026\013\001" + "'", str11, "\001\ufffd\ufffd\ufffd\026\013\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\n\u0274\016\ufffd" + "'", str13, "\005\ufffd\ufffd\n\u0274\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\u7b88=e{%P" + "'", str17, "\000\ufffd\ufffd\ufffd\u7b88=e{%P");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8948195793054732622449196991" + "'", str21, "8948195793054732622449196991");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        java.lang.String str15 = rSA1.decrypt("299");
        java.lang.String str17 = rSA1.encrypt("633142800628300");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "376" + "'", str17, "376");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "166892510144642" + "'", str7, "166892510144642");
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("3302625949888448");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_" + "'", str7, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71" + "'", str9, "71");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "433" + "'", str11, "433");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5891639257" + "'", str17, "5891639257");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\036\u03bfR");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\u0641\ufffd\037\ufffd\ufffd\ufffd\ufffdla");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2679066365331992" + "'", str7, "2679066365331992");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\ufffd\ufffdD" + "'", str11, "\013\ufffd\ufffdD");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1726801265" + "'", str13, "1726801265");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("640396749099661255743419249290");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37805074531238270313" + "'", str11, "37805074531238270313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\034\ufffd\ufffd\ufffd{o" + "'", str13, "\003\ufffd\ufffd\034\ufffd\ufffd\ufffd{o");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "690" + "'", str17, "690");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        java.lang.String str23 = rSA1.decrypt("566997155835309335393979736942");
        java.lang.String str25 = rSA1.encrypt("\000\ufffd\ufffd\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1671033760674427" + "'", str7, "1671033760674427");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1114021832596824" + "'", str13, "1114021832596824");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001?fH\036" + "'", str23, "\001?fH\036");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4025487484" + "'", str25, "4025487484");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "132541095307782" + "'", str13, "132541095307782");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "385055828406917" + "'", str15, "385055828406917");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
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
        java.lang.String str23 = rSA1.decrypt("629388989576392450425203431014");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "432444797909046" + "'", str7, "432444797909046");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd3ila{" + "'", str9, "\004\ufffd3ila{");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1451972115611803" + "'", str13, "1451972115611803");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2537146026511427" + "'", str15, "2537146026511427");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffdT':" + "'", str17, "\000\ufffd\ufffdT':");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "688796725634061" + "'", str19, "688796725634061");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\025\032\000" + "'", str21, "\006\ufffd\025\032\000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd)" + "'", str23, "\013\ufffd\ufffd\ufffd\ufffd)");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1967691446" + "'", str3, "1967691446");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7761151054" + "'", str7, "7761151054");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8067655279" + "'", str9, "8067655279");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2672790156" + "'", str11, "2672790156");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("*");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "510120219434584647125777442748" + "'", str9, "510120219434584647125777442748");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "430082806837613508449757077904" + "'", str11, "430082806837613508449757077904");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "135511349310027596971103628869" + "'", str13, "135511349310027596971103628869");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44" + "'", str17, "44");
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11556596399" + "'", str3, "11556596399");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7720966729" + "'", str5, "7720966729");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8008803798" + "'", str7, "8008803798");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4262244925" + "'", str9, "4262244925");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11198764939" + "'", str11, "11198764939");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("240184670799194778159869759470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\001\ufffd\ufffd!&\020\ufffd\ufffd\ufffdGIX");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "160791553650981470831709458644" + "'", str7, "160791553650981470831709458644");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "73864465239365813608932796098" + "'", str9, "73864465239365813608932796098");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "364263598840813773882992038354" + "'", str11, "364263598840813773882992038354");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "480335143409254526911323904638" + "'", str13, "480335143409254526911323904638");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd\034\034\ufffd" + "'", str15, "\003\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd\034\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "166204304012789467987864441203" + "'", str17, "166204304012789467987864441203");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "93415681851636766324973135274" + "'", str19, "93415681851636766324973135274");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd= " + "'", str21, "\003\ufffd\ufffd\ufffd\ufffd= ");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "135258069304381126289156789230" + "'", str23, "135258069304381126289156789230");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.encrypt("1632923298108129");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2343892519368265" + "'", str7, "2343892519368265");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "651804339" + "'", str11, "651804339");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2798319749" + "'", str13, "2798319749");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2154523741868074" + "'", str7, "2154523741868074");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "328" + "'", str13, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380" + "'", str15, "380");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("96");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\u01fe\ufffdz^\025\ufffd\ufffd\ufffd:");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("*\236\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"*??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "559995548513639" + "'", str7, "559995548513639");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",LP6" + "'", str11, ",LP6");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "458457935" + "'", str13, "458457935");
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2610161298" + "'", str3, "2610161298");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8003189839" + "'", str7, "8003189839");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("10496963571");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "773" + "'", str3, "773");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001>\320\ufffd" + "'", str9, "\001>\320\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7828166819" + "'", str11, "7828166819");
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("2279400941187448");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "833616652869795" + "'", str7, "833616652869795");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "310836861264204621365495191193" + "'", str13, "310836861264204621365495191193");
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("698830179104320016788462155306");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "203657521223471000495460813032" + "'", str9, "203657521223471000495460813032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "198646382386620988801452982845" + "'", str11, "198646382386620988801452982845");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "598269235221283660181078573734" + "'", str17, "598269235221283660181078573734");
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.decrypt("192");
        java.lang.String str11 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str13 = rSA1.encrypt("\005\u07f8\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2891709106998241" + "'", str7, "2891709106998241");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6Rz|\034T" + "'", str9, "6Rz|\034T");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\177\021" + "'", str11, "\006\ufffd\ufffd\177\021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "496082432945417" + "'", str13, "496082432945417");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
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
        java.lang.String str23 = rSA1.encrypt("541070444203118");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "518877882398283598523203790287" + "'", str9, "518877882398283598523203790287");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "518877882398283598523203790287" + "'", str11, "518877882398283598523203790287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "144309037615591014511993416840" + "'", str15, "144309037615591014511993416840");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdSF" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdSF");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "814770968686616" + "'", str23, "814770968686616");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("470860891773042");
        java.lang.String str9 = rSA1.decrypt("10");
        java.lang.String str11 = rSA1.decrypt("1070442260");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\ufffd\ufffd\u04c7" + "'", str7, "\b\ufffd\ufffd\ufffd\u04c7");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd,k" + "'", str9, "\t\ufffd\ufffd\ufffd\ufffd,k");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd:Kj" + "'", str11, "\005\ufffd:Kj");
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "369208424210212041257818609339" + "'", str9, "369208424210212041257818609339");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004o\027\ufffd\ufffd\ufffd\\\ufffd\ufffd" + "'", str11, "\004o\027\ufffd\ufffd\ufffd\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "150832637910751446048514154455" + "'", str13, "150832637910751446048514154455");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "458142116697220856616424654999" + "'", str15, "458142116697220856616424654999");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "421376340409180862558089053157" + "'", str17, "421376340409180862558089053157");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("100935160444972936488645408652");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("559805790079501390562750525754");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007[\003\ufffd\ufffd\ufffd\ufffd\ufffd\u01ab\ufffd." + "'", str7, "\007[\003\ufffd\ufffd\ufffd\ufffd\ufffd\u01ab\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd]\r\ufffd" + "'", str11, "\003\ufffd\ufffd]\r\ufffd");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.decrypt("639857867348047546651687203467");
        java.lang.String str11 = rSA1.decrypt("95057093174212120272332960514");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4931652803" + "'", str3, "4931652803");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1990707671" + "'", str5, "1990707671");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4628826575" + "'", str7, "4628826575");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("259796602111776482470143626959");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "187903117643607282461302489364" + "'", str9, "187903117643607282461302489364");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8895214082219386565366573798" + "'", str11, "8895214082219386565366573798");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "437811893130060175195974796024" + "'", str13, "437811893130060175195974796024");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffdY\030\ufffd\ufffd\u0610\r" + "'", str15, "\005\ufffdY\030\ufffd\ufffd\u0610\r");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd-\f\ufffd\ufffd\ufffd\ufffdR" + "'", str19, "\003\ufffd-\f\ufffd\ufffd\ufffd\ufffdR");
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("556");
        java.lang.String str17 = rSA1.encrypt("7765692852");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "456" + "'", str9, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "653090044" + "'", str15, "653090044");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1130162802" + "'", str17, "1130162802");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd8\004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??f\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1616279665286710" + "'", str7, "1616279665286710");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\021!re" + "'", str15, "\003\021!re");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\001\ufffd\t\ufffd\ufffd\"\ufffd4\016\ufffd\ufffd" + "'", str19, "\002\001\ufffd\t\ufffd\ufffd\"\ufffd4\016\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\002\ufffd\ufffd\u0756\ufffd\ufffd\u020b\ufffd" + "'", str21, "\006\002\ufffd\ufffd\u0756\ufffd\ufffd\u020b\ufffd");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("423");
        java.lang.String str13 = rSA1.decrypt("1812393953540623");
        java.lang.String str15 = rSA1.encrypt("6250160807051710641100560070");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5549347404" + "'", str3, "5549347404");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5369697937" + "'", str7, "5369697937");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\026\ufffdE\007\ufffd\ufffd\ufffd\ufffd\004N\025" + "'", str11, "\026\ufffdE\007\ufffd\ufffd\ufffd\ufffd\004N\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\027\ufffdL\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\027\ufffdL\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "524445198678779724155844010188" + "'", str15, "524445198678779724155844010188");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.String str13 = rSA1.decrypt("329114188050351");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????l?3\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "239" + "'", str11, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5" + "'", str13, "5");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
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
        java.lang.String str21 = rSA1.encrypt("\001`");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2287154908838259" + "'", str7, "2287154908838259");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "569" + "'", str19, "569");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "695" + "'", str21, "695");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.decrypt("307641391968194344643523456830");
        java.lang.String str17 = rSA1.encrypt("2308941710044151");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1172293225273915" + "'", str7, "1172293225273915");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "99" + "'", str11, "99");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "243" + "'", str13, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "97" + "'", str17, "97");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("7320283309");
        java.lang.String str7 = rSA1.encrypt("6367626140");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6402480409" + "'", str3, "6402480409");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "K.\031\ufffd" + "'", str5, "K.\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7226776460" + "'", str7, "7226776460");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
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
        java.lang.String str29 = rSA1.decrypt("883489425173594551172568374832");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd" + "'", str13, "\n\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1235623978393311" + "'", str15, "1235623978393311");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2518176355916102" + "'", str17, "2518176355916102");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "96" + "'", str21, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "244" + "'", str23, "244");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\017" + "'", str25, "\001\017");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "219" + "'", str27, "219");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "=" + "'", str29, "=");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
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
        java.lang.String str21 = rSA1.encrypt("513584694840387920950764335044");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\030" + "'", str7, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1138154579903894" + "'", str11, "1138154579903894");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2361885570791904" + "'", str13, "2361885570791904");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2313079696101368" + "'", str15, "2313079696101368");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1307253680482562" + "'", str17, "1307253680482562");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1437862003032886" + "'", str19, "1437862003032886");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1547751917465224" + "'", str21, "1547751917465224");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "558321888774984249644964146777" + "'", str9, "558321888774984249644964146777");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "558321888774984249644964146777" + "'", str11, "558321888774984249644964146777");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "726798423403496127919180879742" + "'", str15, "726798423403496127919180879742");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\t\ufffd\ufffd\ufffd\"t\021\ufffd\ufffdox" + "'", str17, "\004\t\ufffd\ufffd\ufffd\"t\021\ufffd\ufffdox");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "683285032979225071932584941059" + "'", str19, "683285032979225071932584941059");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "638287149946370931714477020009" + "'", str21, "638287149946370931714477020009");
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.encrypt("1249253780109007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\002\ufffdxP\003\021");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?N?xP??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "426790884384997620116966662988" + "'", str3, "426790884384997620116966662988");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\f\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06ec" + "'", str5, "\001\f\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u06ec");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "337108553983883885393491397746" + "'", str7, "337108553983883885393491397746");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("640396749099661255743419249290");
        java.lang.String str19 = rSA1.encrypt("152");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "471035147199899934668724786943" + "'", str11, "471035147199899934668724786943");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffdc\032\ufffd\ufffd\\\ufffd\ufffd" + "'", str13, "\002\ufffdc\032\ufffd\ufffd\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "285" + "'", str17, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "339" + "'", str19, "339");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.decrypt("639857867348047546651687203467");
        java.lang.String str11 = rSA1.decrypt("478908770438626");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2844228944" + "'", str3, "2844228944");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1223077425" + "'", str5, "1223077425");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2089740012" + "'", str7, "2089740012");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\016\ufffd" + "'", str9, "\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffdH" + "'", str11, "\ufffdH");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.String str15 = rSA1.encrypt("473");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "429075481008245694673000949272" + "'", str11, "429075481008245694673000949272");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151967810021851523286630166793" + "'", str15, "151967810021851523286630166793");
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        java.lang.String str25 = rSA1.encrypt("\001\023\ufffd\ufffd\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1637799163384659" + "'", str7, "1637799163384659");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\002\ufffd" + "'", str9, "\001\ufffd\ufffd\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1628393596859928" + "'", str13, "1628393596859928");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1276906114907419" + "'", str15, "1276906114907419");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1411773249086385" + "'", str17, "1411773249086385");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "30987154364644136013503700938" + "'", str23, "30987154364644136013503700938");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "40202082294517943468388198778" + "'", str25, "40202082294517943468388198778");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\005\002\ufffd\ufffd\r\177");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\032g\016");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "802637361172513" + "'", str7, "802637361172513");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "497932159" + "'", str13, "497932159");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2775758802" + "'", str15, "2775758802");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("Z");
        java.lang.String str11 = rSA1.encrypt("3463356647");
        java.lang.String str13 = rSA1.encrypt("399218178");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3138105960900000000000" + "'", str9, "3138105960900000000000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "410150583594582583520281303980" + "'", str11, "410150583594582583520281303980");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "292579495076538810046177520735" + "'", str13, "292579495076538810046177520735");
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.decrypt("356172424337288026649386620298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\033");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??2?s??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "69974032193105954758216223250" + "'", str9, "69974032193105954758216223250");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "102879982727965482764736092639" + "'", str11, "102879982727965482764736092639");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002R" + "'", str15, "\002R");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "752199515693422373094997732142" + "'", str9, "752199515693422373094997732142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\n\u0298\ufffd+\022\u0576" + "'", str11, "\004\n\u0298\ufffd+\022\u0576");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\b\ufffd\ufffd\ufffd\032\ufffd\ufffd\u0646" + "'", str15, "\007\ufffd\b\ufffd\ufffd\ufffd\032\ufffd\ufffd\u0646");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42875" + "'", str17, "42875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "509268088436923471277325967318" + "'", str19, "509268088436923471277325967318");
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\ufffd\u01f10\025\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\r\ufffd\ufffd\ufffd\ufffd\024\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??G?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "284008884276397475831795673240" + "'", str11, "284008884276397475831795673240");
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        java.lang.String str21 = rSA1.decrypt("1414622092256646");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(" + "'", str13, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "126" + "'", str15, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "]" + "'", str17, "]");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "271" + "'", str19, "271");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001 " + "'", str21, "\001 ");
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\003C\035\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?C?]?0?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "700721520029153" + "'", str7, "700721520029153");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        java.lang.String str17 = rSA1.encrypt("538621452366062192513302577482");
        java.lang.String str19 = rSA1.decrypt("27377123092728631889936804936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\ufffd\020\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?(???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2002595313585082" + "'", str7, "2002595313585082");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6720836720" + "'", str17, "6720836720");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd)" + "'", str19, "\000\ufffd\ufffd\ufffd)");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507" + "'", str11, "507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20" + "'", str13, "20");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("423");
        java.lang.String str13 = rSA1.decrypt("1812393953540623");
        java.lang.String str15 = rSA1.encrypt("6250160807051710641100560070");
        java.lang.String str17 = rSA1.encrypt("1017701322286044653322105622429");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12993812910" + "'", str3, "12993812910");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "15586633292" + "'", str5, "15586633292");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3652310667" + "'", str7, "3652310667");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd[PI" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd[PI");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "138305268901412303562341514458" + "'", str15, "138305268901412303562341514458");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "235356157837966471041515527891" + "'", str17, "235356157837966471041515527891");
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("598040450161656559953215209051");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1408514752349" + "'", str11, "1408514752349");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\t\ufffd&\"\ufffd\ufffd" + "'", str13, "\006\t\ufffd&\"\ufffd\ufffd");
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("656776447759906107379658235825");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\016\ufffd\ufffd\025" + "'", str3, "\001\016\ufffd\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "622140017123891" + "'", str5, "622140017123891");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2146982144459017" + "'", str7, "2146982144459017");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd/" + "'", str13, "\ufffd/");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("1289219933400623");
        java.lang.String str9 = rSA1.decrypt("184677000372197579945525954200");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("5246302288");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2900564026" + "'", str3, "2900564026");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\026\ufffd\u0782\ufffd\ufffd\n@" + "'", str7, "\ufffd\ufffd\026\ufffd\u0782\ufffd\ufffd\n@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\u06b0\ufffd\ufffdXo\177\ufffd\ufffd" + "'", str9, "\ufffd\u06b0\ufffd\ufffdXo\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2717047499892009335110903431" + "'", str11, "2717047499892009335110903431");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffdX\004\ufffd\ufffdr\020hP" + "'", str13, "\ufffd\ufffdX\004\ufffd\ufffdr\020hP");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
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
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2481959268538370" + "'", str7, "2481959268538370");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "240" + "'", str19, "240");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "277" + "'", str21, "277");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("41020759083851174566306088014");
        java.lang.String str13 = rSA1.decrypt("562973936183234597494436662767");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "y2R\021\ufffd\000\ufffd\u07cf.\0048" + "'", str11, "y2R\021\ufffd\000\ufffd\u07cf.\0048");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\t\ufffd\021\ufffd$\030-g2" + "'", str13, "\ufffd\ufffd\t\ufffd\021\ufffd$\030-g2");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("1603037267069329");
        java.lang.String str15 = rSA1.encrypt("1602403727");
        java.lang.String str17 = rSA1.decrypt("120210931294819567914781828560");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478535548657058" + "'", str7, "478535548657058");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2555848282" + "'", str13, "2555848282");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4874386309" + "'", str15, "4874386309");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffdu" + "'", str17, "\000\ufffd\ufffd\ufffdu");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("369824009393067");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\002\ufffd\ufffd\ufffd,N" + "'", str3, "\002\002\ufffd\ufffd\ufffd,N");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1981431183" + "'", str7, "1981431183");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2727961954" + "'", str9, "2727961954");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "628721392023099021090119745452" + "'", str9, "628721392023099021090119745452");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "205347647868455067009691995560" + "'", str11, "205347647868455067009691995560");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "471759783325248461492069544969" + "'", str13, "471759783325248461492069544969");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "219" + "'", str17, "219");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "G" + "'", str19, "G");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        java.lang.String str23 = rSA1.decrypt("629388989576392450425203431014");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2064081939964435" + "'", str7, "2064081939964435");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\004\ufffd\002\u026af" + "'", str9, "\005\004\ufffd\002\u026af");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2095120945721124" + "'", str13, "2095120945721124");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "422545061197824" + "'", str15, "422545061197824");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007iD\002\ufffd" + "'", str17, "\007iD\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2061777860821850" + "'", str19, "2061777860821850");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\u10c9\ufffd\ufffd" + "'", str21, "\007\u10c9\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\003\ufffdl\\\ufffd" + "'", str23, "\001\003\ufffdl\\\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.encrypt("\007Os\020\ufffd\ufffd\ufffd\ufffd\006\ufffd\u05b0");
        java.lang.String str19 = rSA1.encrypt("112");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "725055452531165" + "'", str7, "725055452531165");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2626390984484145" + "'", str13, "2626390984484145");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1126825225872354" + "'", str15, "1126825225872354");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1361062583717916" + "'", str17, "1361062583717916");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "700365773808873" + "'", str19, "700365773808873");
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("612697493508374");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\ufffd\ufffd5\035\ufffd\ufffdXs1" + "'", str3, "\b\ufffd\ufffd\ufffd5\035\ufffd\ufffdXs1");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3541359895480479621345815562" + "'", str5, "3541359895480479621345815562");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "715128124271664180997540300223" + "'", str7, "715128124271664180997540300223");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("71737133284728");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "119579939769595636001061" + "'", str3, "119579939769595636001061");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "234375147800809836075266572944" + "'", str5, "234375147800809836075266572944");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1067878940429111" + "'", str13, "1067878940429111");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\024\ufffd\ufffd=\005" + "'", str15, "\006\024\ufffd\ufffd=\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\037\ufffd'" + "'", str17, "\004\ufffd\ufffd\037\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\013>\036" + "'", str19, "\001\ufffd\013>\036");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\020\ufffd\ufffdt$5O\026\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61088123552924" + "'", str7, "61088123552924");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "108856825257868125087651999123" + "'", str13, "108856825257868125087651999123");
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        java.lang.String str21 = rSA1.decrypt("210378250090253374708038199698");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\000\ufffd\ufffd\020");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??]??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "393237401776370650931204935171" + "'", str13, "393237401776370650931204935171");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H" + "'", str17, "H");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "124" + "'", str19, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004" + "'", str21, "\004");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\021\ufffd");
        java.lang.String str17 = rSA1.encrypt("604599376813224");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "584" + "'", str15, "584");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "404" + "'", str17, "404");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
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
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24663025598219319319448074546" + "'", str9, "24663025598219319319448074546");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\u0529\ufffd\ufffd\004\ufffd\ufffd\002\ufffd\025" + "'", str11, "\005\u0529\ufffd\ufffd\004\ufffd\ufffd\002\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd?\006\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd?\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "C\034\ufffd(\000\ufffd\ufffd')4\017" + "'", str17, "C\034\ufffd(\000\ufffd\ufffd')4\017");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "7268881660016123297943871014" + "'", str21, "7268881660016123297943871014");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7874827145667347339670568966" + "'", str23, "7874827145667347339670568966");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        java.lang.String str15 = rSA1.decrypt("102");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001\ufffd\013\006;");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????;\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2607042046952623" + "'", str7, "2607042046952623");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001$" + "'", str13, "\001$");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001(" + "'", str15, "\001(");
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.encrypt("128048112137671");
        java.lang.String str17 = rSA1.decrypt("2431113526778646");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "63" + "'", str13, "63");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "88" + "'", str15, "88");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "}" + "'", str17, "}");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124266777732128" + "'", str7, "124266777732128");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("147563026464741632979335701288");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\000\ufffd\ufffd2\034");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???2?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "58645172975622986038372567213" + "'", str9, "58645172975622986038372567213");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "91119253025548039790523850431" + "'", str11, "91119253025548039790523850431");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "147245272114058243876865498141" + "'", str13, "147245272114058243876865498141");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("75472562827089017340799555154");
        java.lang.String str11 = rSA1.encrypt("214450326285773129502890621279");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\ufffd\ufffd\177\ufffd" + "'", str3, "\t\ufffd\ufffd\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2729529233779907" + "'", str5, "2729529233779907");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2367527980142137" + "'", str7, "2367527980142137");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1019355092940945" + "'", str9, "1019355092940945");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2394424398779267" + "'", str11, "2394424398779267");
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("3775398402");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "900545388086334904606033492430" + "'", str9, "900545388086334904606033492430");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "436108452427365537994396546497" + "'", str11, "436108452427365537994396546497");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\035I" + "'", str15, "\000\ufffd\ufffd\035I");
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\b\ufffd\004ra=\030\ufffdr\021\ufffdH");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "471" + "'", str9, "471");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "417" + "'", str11, "417");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "225" + "'", str13, "225");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("360143793835170409825620524630");
        java.lang.String str13 = rSA1.encrypt("\001#");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "437907491814087575105768026734" + "'", str9, "437907491814087575105768026734");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd!\n\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd!\n\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2086723682451" + "'", str13, "2086723682451");
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "275" + "'", str9, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "259" + "'", str13, "259");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "62035434637146" + "'", str19, "62035434637146");
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "556" + "'", str3, "556");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\u01c5\ufffd" + "'", str7, "\000\u01c5\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("726538495898349057827372017464");
        rSA1.generateKeys(10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002i" + "'", str7, "\002i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O" + "'", str9, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001t" + "'", str11, "\001t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "96" + "'", str15, "96");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "556" + "'", str3, "556");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\032\ufffd\013\ufffd" + "'", str7, "\002\032\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2622171523" + "'", str9, "2622171523");
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("94");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "133633516970217334215916966302" + "'", str9, "133633516970217334215916966302");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "281033073241893007445604782511" + "'", str11, "281033073241893007445604782511");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\022\ufffd\001\ufffd\ufffd" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\022\ufffd\001\ufffd\ufffd");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        java.lang.String str7 = rSA1.decrypt("2387231432217160");
        java.lang.String str9 = rSA1.encrypt("\b\ufffd\ufffd\ufffdc~\f\033\ufffdz");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "89406686645027148085343821796" + "'", str5, "89406686645027148085343821796");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd4m" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd4m");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "580564402201697679846531075634" + "'", str9, "580564402201697679846531075634");
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("878469832647682509056934882617");
        java.lang.String str15 = rSA1.decrypt("2579809352261412");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "521903282715855407585474679950" + "'", str9, "521903282715855407585474679950");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "782308614483136590336308692989" + "'", str11, "782308614483136590336308692989");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "720407789142046467880297209590" + "'", str13, "720407789142046467880297209590");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\003s" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\003s");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1981355655168" + "'", str3, "1981355655168");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1690522737399" + "'", str5, "1690522737399");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "869750795839916664652115719705" + "'", str7, "869750795839916664652115719705");
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str13 = rSA1.decrypt("555139909713915");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001w" + "'", str7, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "664" + "'", str9, "664");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "420" + "'", str11, "420");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0022" + "'", str13, "\0022");
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6763985984575113502344611191" + "'", str9, "6763985984575113502344611191");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "348762591827028031063826148693" + "'", str11, "348762591827028031063826148693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1?B\025\ufffd\ufffd\037\ufffd\ufffd\ufffd\035" + "'", str13, "1?B\025\ufffd\ufffd\037\ufffd\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\r\u027a\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001\r\u027a\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "268333639303158216240674669302" + "'", str17, "268333639303158216240674669302");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\035\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd" + "'", str19, "\002\035\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "389325516541045414361043179231" + "'", str9, "389325516541045414361043179231");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "787154079394229515500291630736" + "'", str11, "787154079394229515500291630736");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "415317992069188559256027050552" + "'", str13, "415317992069188559256027050552");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\025\u01a4\017\022\u0156\ufffd\ufffd" + "'", str15, "\005\025\u01a4\017\022\u0156\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "278938966447679551854647574630" + "'", str17, "278938966447679551854647574630");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "454567106344250685751269619416" + "'", str19, "454567106344250685751269619416");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n,\004\005\ufffd\ufffd\ufffdD\032\ufffdo" + "'", str21, "\n,\004\005\ufffd\ufffd\ufffdD\032\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "438910499665696401638135828676" + "'", str23, "438910499665696401638135828676");
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys(100);
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("73073083040888118419040653382");
        java.lang.String str17 = rSA1.decrypt("1063858226294161");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffdQUf" + "'", str5, "\001\ufffdQUf");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3436067454" + "'", str7, "3436067454");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6158990778" + "'", str9, "6158990778");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "233" + "'", str15, "233");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1872200516786295" + "'", str7, "1872200516786295");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "568411953986723" + "'", str13, "568411953986723");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("498517715595236544046073650611");
        java.lang.String str9 = rSA1.encrypt("20872893387406392428226946911");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001Z" + "'", str3, "\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\u0262\ufffd,\020\020\ufffd\ufffd" + "'", str7, "\007\u0262\ufffd,\020\020\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24803584179596059596143298674" + "'", str9, "24803584179596059596143298674");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("1534903236613159");
        java.lang.String str7 = rSA1.encrypt("502175635293882102637091172630");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "398614642812954083753885173525" + "'", str3, "398614642812954083753885173525");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "96640995981505597668650831585" + "'", str7, "96640995981505597668650831585");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str23 = rSA1.encrypt("1643313745665141");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "514974506477695792126808146527" + "'", str9, "514974506477695792126808146527");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444473485812634627015644169061" + "'", str11, "444473485812634627015644169061");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\037\ufffd\ufffd\ufffd\ufffd\177\ufffd" + "'", str13, "\002\ufffd\037\ufffd\ufffd\ufffd\ufffd\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "289173005696273206940990402579" + "'", str17, "289173005696273206940990402579");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\u04b6\033\ufffd\ufffd\ufffdU\036" + "'", str19, "\002\ufffd\ufffd\u04b6\033\ufffd\ufffd\ufffdU\036");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "340194582028462795621626534498" + "'", str23, "340194582028462795621626534498");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "479417485999917876364653850815" + "'", str9, "479417485999917876364653850815");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "479417485999917876364653850815" + "'", str11, "479417485999917876364653850815");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u0311\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\u0311\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "114467194877809784891035061221" + "'", str15, "114467194877809784891035061221");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\u07b2\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd\u07b2\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\006\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "723018005521034476097180237379" + "'", str9, "723018005521034476097180237379");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "723018005521034476097180237379" + "'", str11, "723018005521034476097180237379");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("113484804779532097642572840092");
        java.lang.String str17 = rSA1.decrypt("33522487042404985624");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "41773794449532" + "'", str7, "41773794449532");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "685173997" + "'", str11, "685173997");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "456" + "'", str15, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001C");
        java.lang.String str15 = rSA1.decrypt("237830699929158427676435923969");
        java.lang.String str17 = rSA1.decrypt("3060553596769532");
        java.lang.String str19 = rSA1.decrypt("415711564585771912550233444681");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6553737199675" + "'", str7, "6553737199675");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1390540025322472" + "'", str13, "1390540025322472");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd\026" + "'", str17, "\007\ufffd\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\023T\036\ufffd" + "'", str19, "\006\ufffd\023T\036\ufffd");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "414902042294645113464698845876" + "'", str9, "414902042294645113464698845876");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffdG,$\016\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffdG,$\016\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "197724592626821654341288675777" + "'", str13, "197724592626821654341288675777");
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "41231578409648868574287442305" + "'", str9, "41231578409648868574287442305");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "332244008931091664301168282852" + "'", str11, "332244008931091664301168282852");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\006\ufffd\ufffd\ufffd\ufffd\ufffd\u02af\007" + "'", str13, "\005\ufffd\006\ufffd\ufffd\ufffd\ufffd\ufffd\u02af\007");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("2374996254220858");
        java.lang.String str15 = rSA1.decrypt("1047482469336782699089679928208");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5" + "'", str7, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "290" + "'", str9, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "357" + "'", str11, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "249" + "'", str13, "249");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("210378250090253374708038199698");
        java.lang.String str11 = rSA1.decrypt("227");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\u028d\ufffd\ufffd\ufffd\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str3, "\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "815942046" + "'", str7, "815942046");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1198916707" + "'", str9, "1198916707");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "`@Ae" + "'", str11, "`@Ae");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "498134649805851606201335615863" + "'", str15, "498134649805851606201335615863");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\035" + "'", str5, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "90" + "'", str7, "90");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("474335040501396479992257135073");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3857827298" + "'", str3, "3857827298");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6364315687" + "'", str7, "6364315687");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "d;v\025" + "'", str9, "d;v\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "130" + "'", str13, "130");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("153248405780229125806274957194");
        java.lang.String str15 = rSA1.decrypt("2533230355141144");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007\027\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "765091843514436" + "'", str7, "765091843514436");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246" + "'", str11, "246");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "352" + "'", str13, "352");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001?" + "'", str15, "\001?");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
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
        java.lang.String str21 = rSA1.decrypt("210378250090253374708038199698");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "538152933902267454381271395760" + "'", str13, "538152933902267454381271395760");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "29" + "'", str19, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001m" + "'", str21, "\001m");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("169979458167342652716591007703");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "336310054511388794292296959309" + "'", str9, "336310054511388794292296959309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "407414141965140396766156406856" + "'", str11, "407414141965140396766156406856");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "128912712021805297575369742449" + "'", str13, "128912712021805297575369742449");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\016\ufffd\ufffd\ufffd\ufffd\ufffd\u0312\ufffd\ufffd" + "'", str15, "\006\016\ufffd\ufffd\ufffd\ufffd\ufffd\u0312\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "415764530384734326210109772498" + "'", str17, "415764530384734326210109772498");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2476247055632942" + "'", str7, "2476247055632942");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444" + "'", str11, "444");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "296" + "'", str19, "296");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "317" + "'", str21, "317");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str15 = rSA1.decrypt("1630771903");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1612393417398159" + "'", str13, "1612393417398159");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\003\ufffd'x\023" + "'", str15, "\b\ufffd\003\ufffd'x\023");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\u04ae\ufffdlL]" + "'", str3, "\002\ufffd\ufffd\u04ae\ufffdlL]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169354408914553878305891465804" + "'", str5, "169354408914553878305891465804");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "597307086731034013615991320544" + "'", str9, "597307086731034013615991320544");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "92793703143836233895364607045" + "'", str11, "92793703143836233895364607045");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7492721214" + "'", str15, "7492721214");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7450952252" + "'", str19, "7450952252");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4556743877" + "'", str21, "4556743877");
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.encrypt("$");
        java.lang.String str15 = rSA1.encrypt("\002C\027\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("2183468490280394");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "53457677272745207639757285964" + "'", str9, "53457677272745207639757285964");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380184853582240059999435508409" + "'", str11, "380184853582240059999435508409");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46656" + "'", str13, "46656");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "970748437860623683411570676429" + "'", str15, "970748437860623683411570676429");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdP" + "'", str17, "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdP");
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.decrypt("6647907366");
        java.lang.String str15 = rSA1.encrypt("1682803771672384");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "349877007798484929782020171088" + "'", str9, "349877007798484929782020171088");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "119650093319571627609016692498" + "'", str11, "119650093319571627609016692498");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\t\ufffdv" + "'", str13, "\ufffd\ufffd\t\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "186828374781213960497190340192" + "'", str15, "186828374781213960497190340192");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\b\030\ufffd\ufffd\ufffdx ");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "179626872799453175746450937900" + "'", str9, "179626872799453175746450937900");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "354117727920053376110553598721" + "'", str13, "354117727920053376110553598721");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "630724520913650209250876869272" + "'", str15, "630724520913650209250876869272");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "515083315015880838319953246925" + "'", str17, "515083315015880838319953246925");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\001\u011d\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1945539852" + "'", str3, "1945539852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1730453543" + "'", str7, "1730453543");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "366331741" + "'", str11, "366331741");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001.");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?.\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("1955448203012581");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004\ufffd$;\035\ufffd\ufffd\ufffdA\025\ufffd\004");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?^?$\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2W\"\ufffd" + "'", str7, "2W\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\016\ufffd" + "'", str9, "\000\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7340044230" + "'", str11, "7340044230");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
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
        java.lang.String str23 = rSA1.decrypt("179473698325411773813461707663");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "864856958614681" + "'", str7, "864856958614681");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "157" + "'", str15, "157");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "449" + "'", str19, "449");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + " " + "'", str21, " ");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\u0268\ufffd\ufffd\ufffd\ufffdf");
        java.lang.String str17 = rSA1.encrypt("2851293010");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "905644809387800" + "'", str7, "905644809387800");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9444627864" + "'", str15, "9444627864");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7125925700" + "'", str17, "7125925700");
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("577925724882894");
        java.lang.String str13 = rSA1.decrypt("160899005785201348795265593317");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "811" + "'", str11, "811");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
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
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "311279374995910278482749713140" + "'", str9, "311279374995910278482749713140");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "209516525365482542581246286872" + "'", str11, "209516525365482542581246286872");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\032\ufffd\ufffd ." + "'", str13, "\002\ufffd\ufffd\ufffd\032\ufffd\ufffd .");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "139542104868218591216622610277" + "'", str15, "139542104868218591216622610277");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "190008558752789529747860389278" + "'", str17, "190008558752789529747860389278");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\003\ufffd\ufffd\ufffd\ufffd\u0610\ufffd<" + "'", str11, "\002\003\ufffd\ufffd\ufffd\ufffd\u0610\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\005\ufffd\001^Ed\003s" + "'", str13, "\002\ufffd\ufffd\005\ufffd\001^Ed\003s");
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
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
        java.lang.String str21 = rSA1.encrypt("209");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1872897855942201" + "'", str7, "1872897855942201");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279936" + "'", str13, "279936");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40880571966715872370988555484" + "'", str17, "40880571966715872370988555484");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "64593628243452237681264333027" + "'", str19, "64593628243452237681264333027");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "35583532398091723625" + "'", str21, "35583532398091723625");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("304740070237960671182697086271");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "924547757" + "'", str5, "924547757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1905908882" + "'", str11, "1905908882");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\013\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\013\ufffdN\022\u03cd\ufffd\ufffd" + "'", str13, "\007\ufffd\013\ufffdN\022\u03cd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$w\006\ufffd\ufffd\ufffd\033\ufffd" + "'", str17, "$w\006\ufffd\ufffd\ufffd\033\ufffd");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1429300422395905" + "'", str7, "1429300422395905");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "775250249733155" + "'", str13, "775250249733155");
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "445795443536920" + "'", str7, "445795443536920");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "679" + "'", str11, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5" + "'", str19, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "400" + "'", str21, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "228" + "'", str23, "228");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("17862321440275");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("34233733903336725692633044826");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004d\020\002\ufffd" + "'", str7, "\004d\020\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\u01ce" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\u01ce");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.decrypt("281336313");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "773" + "'", str3, "773");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "880602992" + "'", str7, "880602992");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4174571255" + "'", str9, "4174571255");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001!\b\ufffdw" + "'", str11, "\001!\b\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "290" + "'", str7, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "671844577794316760919136552383" + "'", str11, "671844577794316760919136552383");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("487935535487070858957381010441");
        java.lang.String str13 = rSA1.decrypt("472311133554697");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\027" + "'", str5, "\027");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "502" + "'", str7, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001=" + "'", str11, "\001=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0013" + "'", str13, "\0013");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "70155125846928057245369183137" + "'", str11, "70155125846928057245369183137");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "92147419023543088455027896928" + "'", str13, "92147419023543088455027896928");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3" + "'", str17, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "17" + "'", str19, "17");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "191" + "'", str21, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2" + "'", str25, "2");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        java.lang.String str15 = rSA1.decrypt("299");
        java.lang.String str17 = rSA1.encrypt("633142800628300");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "628" + "'", str7, "628");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "458" + "'", str11, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35" + "'", str17, "35");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        java.lang.String str15 = rSA1.decrypt("618443824774458842838968720878");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\020\ufffd\ufffd\ufffdD");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "911575413928629" + "'", str7, "911575413928629");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0011" + "'", str11, "\0011");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "j" + "'", str13, "j");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "153" + "'", str17, "153");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
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
        java.lang.String str21 = rSA1.decrypt("1414622092256646");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90" + "'", str11, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "79" + "'", str15, "79");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "135" + "'", str19, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\017" + "'", str21, "\001\017");
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2781935061" + "'", str7, "2781935061");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10192550894" + "'", str9, "10192550894");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "q\006wh" + "'", str11, "q\006wh");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3444965966" + "'", str13, "3444965966");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
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
        java.lang.String str25 = rSA1.decrypt("143167274281712197334652919040");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336633230050511" + "'", str7, "336633230050511");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P" + "'", str19, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\006\ufffd\u02a0\ufffd\ufffd\ufffd=#@" + "'", str25, "\006\ufffd\u02a0\ufffd\ufffd\ufffd=#@");
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.encrypt("5799003948");
        java.lang.String str7 = rSA1.decrypt("4747158113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\tY\022\ufffd\ufffd/q");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Y???/q\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "118327944626234750437066628651" + "'", str3, "118327944626234750437066628651");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "417547767730881599712965005785" + "'", str5, "417547767730881599712965005785");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\t\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "124866222177434" + "'", str13, "124866222177434");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\004\ufffd\ufffd." + "'", str15, "\006\004\ufffd\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "206146634182006931962945070841" + "'", str19, "206146634182006931962945070841");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "478047814490498148335475413670" + "'", str21, "478047814490498148335475413670");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("517376765656606617096719830177");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2826694068" + "'", str3, "2826694068");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4901097509" + "'", str5, "4901097509");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7127385170" + "'", str7, "7127385170");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\n\ufffd(" + "'", str9, "\001\n\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3484507382" + "'", str11, "3484507382");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\004\ufffd8" + "'", str11, "\002\ufffd\ufffd\004\ufffd8");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        java.lang.String str5 = rSA1.decrypt("1047482469336782699089679928208");
        java.lang.String str7 = rSA1.encrypt("10038248675189789010085843633");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "143" + "'", str3, "143");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "430" + "'", str7, "430");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4910915732" + "'", str7, "4910915732");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3137715260" + "'", str9, "3137715260");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd5" + "'", str11, "\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3906666888" + "'", str13, "3906666888");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ued48w\031" + "'", str17, "\005\ufffd\ued48w\031");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "TK\007\ufffd\ufffd" + "'", str19, "TK\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1995137077890762" + "'", str21, "1995137077890762");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdx");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1504244342652830" + "'", str7, "1504244342652830");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "909949943" + "'", str13, "909949943");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("569046855107122163755734229680");
        java.lang.String str11 = rSA1.decrypt("71246182698955505680257915552");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\002\020");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17" + "'", str3, "17");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd!j[" + "'", str7, "\000\ufffd!j[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3348779669" + "'", str9, "3348779669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\007\u063d\ufffd" + "'", str11, "\001\007\u063d\ufffd");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("1445011235798689");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104370751549901998226282176383" + "'", str9, "104370751549901998226282176383");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "78471069854448268553449614987" + "'", str11, "78471069854448268553449614987");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\026\ufffd\ufffd\ufffdT" + "'", str13, "\001\ufffd\ufffd\ufffd\026\ufffd\ufffd\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\ufffd");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2529143498350597" + "'", str7, "2529143498350597");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1066549429" + "'", str11, "1066549429");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "166" + "'", str15, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "209" + "'", str17, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "471" + "'", str19, "471");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "264692324937750310608896259400" + "'", str3, "264692324937750310608896259400");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "599072127704588827879071131469" + "'", str5, "599072127704588827879071131469");
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("*");
        java.lang.String str19 = rSA1.decrypt("4004357946");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\003}\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?}??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "46588482169528774383242915078" + "'", str11, "46588482169528774383242915078");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "92700191448411881546767134841" + "'", str13, "92700191448411881546767134841");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "138" + "'", str17, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("2448943656306246");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("166");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "466907007187345935125255656096" + "'", str9, "466907007187345935125255656096");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffdp\034\ufffd\ufffdgF\003\ufffd\u079fb" + "'", str13, "\t\ufffdp\034\ufffd\ufffdgF\003\ufffd\u079fb");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r" + "'", str17, "\r");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\006\u06e8\ufffd\ufffd\035\ufffd\027\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd9t\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd{" + "'", str11, "\000\ufffd9t\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "50557430527947033389783381716" + "'", str13, "50557430527947033389783381716");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "405" + "'", str19, "405");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\021\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354" + "'", str15, "354");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
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
        java.lang.String str23 = rSA1.encrypt("\n\ufffd\ufffd\u01e2\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "610209003683044374489459643190" + "'", str9, "610209003683044374489459643190");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\020\ufffd\ufffd\ufffd\023's" + "'", str11, "\004\ufffd\ufffd\020\ufffd\ufffd\ufffd\023's");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "472701433610629110217764115170" + "'", str13, "472701433610629110217764115170");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "91569312451739040150498261410" + "'", str15, "91569312451739040150498261410");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "348279437220171902138572627654" + "'", str17, "348279437220171902138572627654");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5696210355118643016802698369" + "'", str19, "5696210355118643016802698369");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\004\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "58108908212568070164723880325" + "'", str23, "58108908212568070164723880325");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.decrypt("887836866708316");
        java.lang.String str17 = rSA1.encrypt("609650796");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2678038479609766" + "'", str13, "2678038479609766");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\031\ufffd\ufffd\\" + "'", str15, "\t\ufffd\031\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2222446093652427" + "'", str17, "2222446093652427");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("2183500682712619");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2217435227" + "'", str7, "2217435227");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "39500187292505928569120685667" + "'", str13, "39500187292505928569120685667");
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("5693705465");
        java.lang.String str15 = rSA1.decrypt("566454229538444812474847337870");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172439112371165869154617398989" + "'", str9, "172439112371165869154617398989");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005&$\006\025\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005&$\006\025\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "318473692508204625750427036166" + "'", str11, "318473692508204625750427036166");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u0680\022\ufffd\ufffd\ufffd\ufffd\ufffdEZ\007" + "'", str13, "\005\u0680\022\ufffd\ufffd\ufffd\ufffd\ufffdEZ\007");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006}^3\025\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006}^3\025\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1737047108" + "'", str19, "1737047108");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006" + "'", str5, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "366" + "'", str7, "366");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172" + "'", str9, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001v\003o\033");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?v?o?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2675388312387298" + "'", str7, "2675388312387298");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1124623057476443" + "'", str9, "1124623057476443");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2958268987606774" + "'", str11, "2958268987606774");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.encrypt("6318253741");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("404643023707228610917158386462");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2265987497893921" + "'", str7, "2265987497893921");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0" + "'", str13, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd*" + "'", str17, "\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd*");
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
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
        java.lang.String str23 = rSA1.encrypt("2232890650772139");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2163883915220255" + "'", str7, "2163883915220255");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "498332075616759785672056829952" + "'", str13, "498332075616759785672056829952");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "435" + "'", str19, "435");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "91" + "'", str23, "91");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        java.lang.String str17 = rSA1.encrypt("353706821132697402012447044730");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "108668193871920" + "'", str7, "108668193871920");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd" + "'", str13, "\t\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffdK" + "'", str15, "\004\ufffd\ufffdK");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2497731800776032" + "'", str17, "2497731800776032");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
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
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "78728951549435651700617144547" + "'", str9, "78728951549435651700617144547");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "78728951549435651700617144547" + "'", str11, "78728951549435651700617144547");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\u027f\ufffd\ufffd\ufffd\ufffd\000" + "'", str13, "\b\ufffd\ufffd\u027f\ufffd\ufffd\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "292767776788305341033320311312" + "'", str15, "292767776788305341033320311312");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffd\001\ufffd\ufffd\005_<\027*U\027" + "'", str17, "\t\ufffd\001\ufffd\ufffd\005_<\027*U\027");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004$|\033\ufffd\t\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd" + "'", str19, "\004$|\033\ufffd\t\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        java.lang.String str5 = rSA1.decrypt("11695976753");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19" + "'", str3, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("1863031711965363");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007\ufffd\ufffd\023\032\ufffdv\001\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?@?>\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "669637821608473067117636033032" + "'", str9, "669637821608473067117636033032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\005\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd7\013{" + "'", str11, "\002\005\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd7\013{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "506652169578124588586916217344" + "'", str13, "506652169578124588586916217344");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "660060631497930250409086123271" + "'", str15, "660060631497930250409086123271");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("640396749099661255743419249290");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37805074531238270313" + "'", str11, "37805074531238270313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffdg\t\ufffd\ufffd\ufffd\ufffd1G\017\ufffd" + "'", str13, "\004\ufffd\ufffdg\t\ufffd\ufffd\ufffd\ufffd1G\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "633" + "'", str17, "633");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "414093555079412115284216022914" + "'", str9, "414093555079412115284216022914");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "317357401603655815115114508560" + "'", str11, "317357401603655815115114508560");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "733807472532086296486385882888" + "'", str13, "733807472532086296486385882888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\u03cb\ufffd\ufffd\u0612?" + "'", str15, "\t\ufffd\u03cb\ufffd\ufffd\u0612?");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("111391917685414668336366870336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\u0514\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "889060397322247" + "'", str7, "889060397322247");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\016\006\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\016\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\025a\022\004\ufffd\ufffd\ufffd\031Ct" + "'", str13, "\003\ufffd\025a\022\004\ufffd\ufffd\ufffd\031Ct");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "689" + "'", str17, "689");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "608" + "'", str19, "608");
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2252480625296852" + "'", str11, "2252480625296852");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "354378140713081" + "'", str13, "354378140713081");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2350541616393517" + "'", str15, "2350541616393517");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "192355311668854004280228529210" + "'", str19, "192355311668854004280228529210");
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.encrypt("\002<|\031\016\ufffdt");
        java.lang.String str11 = rSA1.encrypt("352");
        java.lang.String str13 = rSA1.encrypt("\022\ufffd\ufffd\ufffdy\023\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "217" + "'", str9, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "91" + "'", str11, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13" + "'", str13, "13");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("71737133284728");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "667957388143663187027993259284" + "'", str3, "667957388143663187027993259284");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172384945517499226697033338918" + "'", str5, "172384945517499226697033338918");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\005" + "'", str5, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "408" + "'", str7, "408");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "228" + "'", str9, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\005" + "'", str13, "\001\005");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("1422455974188443");
        java.lang.String str13 = rSA1.decrypt("3096483238");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284132496" + "'", str5, "284132496");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "548430243" + "'", str7, "548430243");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2012932508879619" + "'", str11, "2012932508879619");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd");
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.decrypt("394641110643206533541912183688");
        java.lang.String str15 = rSA1.encrypt("215143892951143045749748229813");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\034" + "'", str5, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "125" + "'", str7, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004" + "'", str11, "\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31" + "'", str15, "31");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("423");
        java.lang.String str13 = rSA1.decrypt("1812393953540623");
        java.lang.String str15 = rSA1.encrypt("6250160807051710641100560070");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\003\u058c\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?1O???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3668468991" + "'", str3, "3668468991");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4922312582" + "'", str7, "4922312582");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\u01c3\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\u01c3\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\033\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "258616346636136285760931557842" + "'", str15, "258616346636136285760931557842");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("517376765656606617096719830177");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "394778968" + "'", str3, "394778968");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6529375122" + "'", str7, "6529375122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\036\ufffd\ufffdt" + "'", str9, "\001\036\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6791309921" + "'", str11, "6791309921");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6152264589" + "'", str13, "6152264589");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "483057265619959977614258611156" + "'", str9, "483057265619959977614258611156");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "245268630978732471059021148288" + "'", str11, "245268630978732471059021148288");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "116140723707255126992255440035" + "'", str13, "116140723707255126992255440035");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdR" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "63646253077643399881175241047" + "'", str17, "63646253077643399881175241047");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "516855567835943655593159585478" + "'", str19, "516855567835943655593159585478");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\u0144\022\ufffd\ufffd^\033\ufffd\ufffd\ufffd" + "'", str21, "\002\u0144\022\ufffd\ufffd^\033\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "352462419790143146925046761210" + "'", str23, "352462419790143146925046761210");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("806729601483697513872336243167");
        java.lang.String str13 = rSA1.decrypt("325752737241329561549107236819");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "602234841598434382836731575064" + "'", str9, "602234841598434382836731575064");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\\\ufffd\023\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\\\ufffd\023\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\032\ufffd\ufffd\ufffd-" + "'", str13, "\ufffd\ufffd\ufffd\032\ufffd\ufffd\ufffd-");
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001C" + "'", str13, "\001C");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "360" + "'", str15, "360");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "133" + "'", str17, "133");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1899342811" + "'", str21, "1899342811");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str23, "\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        java.lang.String str15 = rSA1.encrypt("428452644705730171179267584336");
        java.lang.String str17 = rSA1.encrypt("\000\ufffdJ\265");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1401779524107099" + "'", str7, "1401779524107099");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\t\ufffdQ" + "'", str11, "\000\ufffd\ufffd\t\ufffdQ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\u06cc\u06c6\ufffd" + "'", str13, "\003\u06cc\u06c6\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "767830894645901" + "'", str15, "767830894645901");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "717372620273173" + "'", str17, "717372620273173");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.decrypt("28100933696926471903600515426");
        java.lang.String str19 = rSA1.encrypt("9892043117");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd<\027\ufffd" + "'", str15, "\003\ufffd\ufffd<\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "622487608204331" + "'", str19, "622487608204331");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        java.lang.String str11 = rSA1.encrypt("361");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2264271693245258" + "'", str7, "2264271693245258");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1098827256062068" + "'", str9, "1098827256062068");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "324912036818714" + "'", str11, "324912036818714");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
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
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "219" + "'", str9, "219");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31" + "'", str11, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100" + "'", str13, "100");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        java.lang.String str21 = rSA1.encrypt("\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3044920011007722" + "'", str7, "3044920011007722");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "733182504989604" + "'", str13, "733182504989604");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\007\ufffd" + "'", str17, "\003\ufffd\ufffd\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "459791022175239" + "'", str19, "459791022175239");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1793356136761610" + "'", str21, "1793356136761610");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\034\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???q\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffdn!&f\f\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffdn!&f\f\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffdD\005M3q" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffdD\005M3q");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9\027\ufffd\ufffd\b\ufffd\ufffd\ufffd" + "'", str17, "9\027\ufffd\ufffd\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\021\ufffd\ufffd" + "'", str19, "\013\ufffd\ufffd\ufffd\ufffd\021\ufffd\ufffd");
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.decrypt("430269816702801749253730374585");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\020\ufffdX\177\ufffdai");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "620941038996229" + "'", str11, "620941038996229");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u010f\ufffd\ufffd" + "'", str13, "\005\u010f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1514900303647686" + "'", str15, "1514900303647686");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd\ufffdm\007");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "323" + "'", str11, "323");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "245" + "'", str13, "245");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "9249957561" + "'", str19, "9249957561");
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("787439318926031104812953602702");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "77212003158687" + "'", str11, "77212003158687");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1440489731310131" + "'", str13, "1440489731310131");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd&\005\ufffd\ufffdX\017\\\ufffd" + "'", str19, "\004\ufffd&\005\ufffd\ufffdX\017\\\ufffd");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "228" + "'", str7, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "375" + "'", str9, "375");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\f" + "'", str13, "\001\f");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001z" + "'", str15, "\001z");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
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
        java.lang.String str23 = rSA1.decrypt("588529452157270476868304934034");
        java.lang.String str25 = rSA1.encrypt("1314124975260929");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "596849562193353265276556728543" + "'", str9, "596849562193353265276556728543");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\031\ufffd\ufffd\u0762\ufffd" + "'", str11, "\b\031\ufffd\ufffd\u0762\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "353061547558009054338431524476" + "'", str13, "353061547558009054338431524476");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "81042758620772004000189436647" + "'", str15, "81042758620772004000189436647");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7962624" + "'", str17, "7962624");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\n\ufffd\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\001\ufffd\n\ufffd\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\0013" + "'", str23, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "533" + "'", str25, "533");
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("10");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\006\ufffd\ufffdBZE" + "'", str3, "\t\006\ufffd\ufffdBZE");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1483943034409825" + "'", str5, "1483943034409825");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "73972842377555" + "'", str7, "73972842377555");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\u3cc2\ufffd" + "'", str9, "\007\ufffd\u3cc2\ufffd");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("567489291482222151985241898549");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "234" + "'", str3, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11771436150" + "'", str7, "11771436150");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2908805797" + "'", str9, "2908805797");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\t\ufffd\ufffd" + "'", str11, "\001\t\ufffd\ufffd");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("417879610204410439572746380961");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\u01a2\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\002\ufffd\ufffd\u01a2\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "251" + "'", str7, "251");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
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
        rSA1.generateKeys(100);
        java.lang.String str25 = rSA1.encrypt("399541468714022580561781209941");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "436783099725537499864055390192" + "'", str9, "436783099725537499864055390192");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "436783099725537499864055390192" + "'", str11, "436783099725537499864055390192");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44806902903151382863854495294" + "'", str15, "44806902903151382863854495294");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "469285795625907121781927087847" + "'", str25, "469285795625907121781927087847");
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd1\016\ufffd\ufffd\b\ufffd\ufffd\t" + "'", str13, "\t\ufffd\ufffd1\016\ufffd\ufffd\b\ufffd\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\034\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffdST" + "'", str17, "\034\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffdST");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "16115103142805721753348898584" + "'", str21, "16115103142805721753348898584");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1021014386997283539574042835" + "'", str23, "1021014386997283539574042835");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd'");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001ee\026\ufffd\013\240\ufffd\ufffd\ufffd" + "'", str11, "\001ee\026\ufffd\013\240\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd]\036\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd]\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "689" + "'", str17, "689");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.encrypt("\002<|\031\016\ufffdt");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("52608297224407693454086081731");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035" + "'", str7, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172" + "'", str9, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\f\ufffd\ufffd\ufffd\027" + "'", str17, "\001\f\ufffd\ufffd\ufffd\027");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("2499795775");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\027" + "'", str5, "\027");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "632" + "'", str7, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "508" + "'", str9, "508");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "594" + "'", str11, "594");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        java.lang.String str11 = rSA1.encrypt("511332241021549353646337802365");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "162" + "'", str9, "162");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "259" + "'", str11, "259");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
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
            java.lang.String str17 = rSA1.decrypt("\ufffd\ufffd\ufffd\003N");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \">?K\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "697680548674596" + "'", str7, "697680548674596");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\021^" + "'", str13, "\005\ufffd\ufffd\ufffd\021^");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
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
            java.lang.String str17 = rSA1.decrypt("-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "745089148871886" + "'", str7, "745089148871886");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6549293412" + "'", str13, "6549293412");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256134069905105765917157513632" + "'", str9, "256134069905105765917157513632");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3220874006428605" + "'", str13, "3220874006428605");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\u03cd\013\ufffd)" + "'", str15, "\t\ufffd\u03cd\013\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "269822811197738245117840476020" + "'", str19, "269822811197738245117840476020");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd_" + "'", str13, "\t\ufffd\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "788063537223784" + "'", str15, "788063537223784");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\027\ufffd\005\ufffd\ufffd\035\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\027\ufffd\005\ufffd\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "15069841412823627339891865247" + "'", str21, "15069841412823627339891865247");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("511324906649475524073057205686");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "65760655668726" + "'", str7, "65760655668726");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\r\u0721" + "'", str13, "\t\ufffd\r\u0721");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\ufffd" + "'", str15, "\t\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("15573850693655");
        java.lang.String str15 = rSA1.decrypt("880555645873017");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "328" + "'", str7, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd8\r\f\ufffd" + "'", str11, "\003\ufffd\ufffd8\r\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "108679460368440" + "'", str13, "108679460368440");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\000\\\023\ufffd\ufffd" + "'", str15, "\003\000\\\023\ufffd\ufffd");
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("5627337140");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "737311693433163770260985475953" + "'", str11, "737311693433163770260985475953");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("\003`\000\ufffd\ufffdEw\034\ufffd\002\004");
        java.lang.String str17 = rSA1.encrypt("59233418754066768221164616651");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\u02e5\u02b7\ufffd" + "'", str3, "\004\u02e5\u02b7\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1691775158814544" + "'", str5, "1691775158814544");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2736710764656475" + "'", str7, "2736710764656475");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\\\ufffd}\017\ufffd" + "'", str9, "\004\ufffd\\\ufffd}\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\013\u015eB" + "'", str11, "\ufffd\013\u015eB");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u03dd\ufffd\ufffdk" + "'", str13, "\001\u03dd\ufffd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1614294938026536" + "'", str15, "1614294938026536");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "381348639332871" + "'", str17, "381348639332871");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("887836866708316");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\t\ufffd" + "'", str5, "\000\ufffd\ufffd\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9157952000" + "'", str7, "9157952000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "56071071326521496983888737600" + "'", str9, "56071071326521496983888737600");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "53863267589433713447930117339" + "'", str13, "53863267589433713447930117339");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "132651" + "'", str17, "132651");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\035\u0176\ufffd\ufffd" + "'", str19, "\003\035\u0176\ufffd\ufffd");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("21717639");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\tY\003\ufffd?" + "'", str15, "\001\ufffd\tY\003\ufffd?");
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("259796602111776482470143626959");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "369966973106263426019874181194" + "'", str9, "369966973106263426019874181194");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "397561075897720726251507170102" + "'", str11, "397561075897720726251507170102");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49252577654435322630948107204" + "'", str13, "49252577654435322630948107204");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\u02b9\ufffdFp" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd\u02b9\ufffdFp");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\032\ufffd\ufffd\u025e" + "'", str19, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\032\ufffd\ufffd\u025e");
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("726538495898349057827372017464");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("394367388890581002330411516510");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001D" + "'", str11, "\001D");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "310" + "'", str15, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "147" + "'", str19, "147");
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffdb" + "'", str13, "\ufffd\ufffd\ufffdb");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1379985294216852" + "'", str15, "1379985294216852");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "319539906377492" + "'", str17, "319539906377492");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "651" + "'", str21, "651");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "476" + "'", str23, "476");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002{" + "'", str25, "\002{");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd" + "'", str27, "\000\ufffd");
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("2411260992603826");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1028071702528" + "'", str11, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1997815433" + "'", str15, "1997815433");
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "568447754341771500159477103023" + "'", str9, "568447754341771500159477103023");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "451612322876306567450942330200" + "'", str11, "451612322876306567450942330200");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "344201372453719286312834816804" + "'", str17, "344201372453719286312834816804");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "247673152" + "'", str19, "247673152");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "610431954729257911933269065861" + "'", str21, "610431954729257911933269065861");
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "195465970565261181421160993075" + "'", str9, "195465970565261181421160993075");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "195465970565261181421160993075" + "'", str11, "195465970565261181421160993075");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u062c\ufffd\ufffd\ufffd\ufffd\ufffd0]\n\t" + "'", str13, "\001\u062c\ufffd\ufffd\ufffd\ufffd\ufffd0]\n\t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "193831266254108854885965733728" + "'", str15, "193831266254108854885965733728");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "18214820636430186165579923639" + "'", str19, "18214820636430186165579923639");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str9 = rSA1.decrypt("2602093156");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ">" + "'", str9, ">");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\u0619\\" + "'", str13, "\002\ufffd\ufffd\ufffd\u0619\\");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "341977059386996" + "'", str15, "341977059386996");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1774338013658436" + "'", str17, "1774338013658436");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "96" + "'", str21, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "244" + "'", str23, "244");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\017" + "'", str25, "\001\017");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "219" + "'", str27, "219");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "255979147925199165440884773281" + "'", str9, "255979147925199165440884773281");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "255979147925199165440884773281" + "'", str11, "255979147925199165440884773281");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\027\001\ufffd?G0" + "'", str13, "\004\ufffd\ufffd\027\001\ufffd?G0");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "292052925007439644541733236168" + "'", str15, "292052925007439644541733236168");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\031\ufffd\002Q\037\ufffdTv" + "'", str17, "\004\ufffd\ufffd\031\ufffd\002Q\037\ufffdTv");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "597529458457008656998729363831" + "'", str19, "597529458457008656998729363831");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "308136181115552531720823230597" + "'", str21, "308136181115552531720823230597");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "248227410487238" + "'", str7, "248227410487238");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1684784462" + "'", str11, "1684784462");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffdc\t\030" + "'", str13, "\000\ufffdc\t\030");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("6367626140");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("809627930648310897862777565349");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "817523553039272" + "'", str7, "817523553039272");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\u03b8\ufffd\ufffd" + "'", str9, "\003\u03b8\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd-\t\ufffd\ufffd" + "'", str11, "\000\ufffd-\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "608210667547579" + "'", str13, "608210667547579");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "810619159168159" + "'", str15, "810619159168159");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.decrypt("307641391968194344643523456830");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "571805358636758" + "'", str7, "571805358636758");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "265" + "'", str13, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001[" + "'", str15, "\001[");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
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
        java.lang.String str25 = rSA1.encrypt("254129029918192297413720814189");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1993490682769694" + "'", str7, "1993490682769694");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\ufffd}" + "'", str9, "\t\ufffd\ufffd\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "212147942516557" + "'", str13, "212147942516557");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3213594543913025" + "'", str17, "3213594543913025");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3648242721026289" + "'", str19, "3648242721026289");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\u0217J" + "'", str21, "\006\ufffd\u0217J");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd&" + "'", str23, "\013\ufffd\ufffd\ufffd\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "978788536625102" + "'", str25, "978788536625102");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("49376333609094587042351986760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?}?k?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\021\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\t\021\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.lang.String str17 = rSA1.decrypt("31");
        java.lang.String str19 = rSA1.encrypt("300286980447452920813953922608");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1638325706286286" + "'", str7, "1638325706286286");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "679" + "'", str11, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\036\ufffd\032" + "'", str15, "\001\ufffd\036\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd62" + "'", str17, "\001\ufffd\ufffd62");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "467909279" + "'", str19, "467909279");
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        java.lang.String str17 = rSA1.encrypt("4437661730");
        java.lang.String str19 = rSA1.encrypt("7288314624");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1795098832657421" + "'", str7, "1795098832657421");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffdr" + "'", str13, "\005\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\031\ufffd\ufffd\u02be[" + "'", str15, "\006\031\ufffd\ufffd\u02be[");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "16232307934981" + "'", str17, "16232307934981");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2312808924817235" + "'", str19, "2312808924817235");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("308422204620092985527502288542");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd\u0672\ufffd" + "'", str3, "\006\ufffd\u0672\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "226566558582365712862985732343" + "'", str5, "226566558582365712862985732343");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524356838235811383825156776242" + "'", str7, "524356838235811383825156776242");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\u07be\r\ufffd\uce59ga" + "'", str9, "\b\u07be\r\ufffd\uce59ga");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "613475297755892373488078061833" + "'", str11, "613475297755892373488078061833");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "951303078531293" + "'", str7, "951303078531293");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "167" + "'", str15, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001$" + "'", str17, "\001$");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "270" + "'", str19, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("4801815136");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001w" + "'", str7, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "89" + "'", str9, "89");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.encrypt("1092327233");
        java.lang.String str17 = rSA1.encrypt("38254819939697411230932865771");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str21 = rSA1.decrypt("734821704");
        java.lang.String str23 = rSA1.decrypt("3546049091");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99620695679135122408064792102" + "'", str9, "99620695679135122408064792102");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "499582228542953752776607354463" + "'", str11, "499582228542953752776607354463");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "288860820710785735550796419744" + "'", str15, "288860820710785735550796419744");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "106253707801956027128640564407" + "'", str17, "106253707801956027128640564407");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd|N" + "'", str21, "\002\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd|N");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\033\ufffd\ufffdV" + "'", str23, "\002\ufffd\033\ufffd\ufffdV");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("2448943656306246");
        java.lang.String str17 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\017\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffdy\003\u06c1\ufffd\035\ufffd\ufffd" + "'", str15, "\005\ufffdy\003\u06c1\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "274259120881713261363197416242" + "'", str17, "274259120881713261363197416242");
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214" + "'", str9, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "248" + "'", str13, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "229604529276003" + "'", str19, "229604529276003");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.encrypt("103148395234393545369257486234");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "113" + "'", str3, "113");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("252606222438286852223175939175");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3314001441" + "'", str15, "3314001441");
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("451677133");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001[\024\ufffd" + "'", str7, "\001[\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffdK%\r" + "'", str9, "\000\ufffdK%\r");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "69572366" + "'", str13, "69572366");
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        java.lang.String str27 = rSA1.encrypt("\ufffd\ufffd\ufffd\u03e5\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2101363903339961" + "'", str7, "2101363903339961");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\r\177UA" + "'", str15, "\ufffd\r\177UA");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "348" + "'", str19, "348");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "92" + "'", str21, "92");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "T" + "'", str23, "T");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001'" + "'", str25, "\001'");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "136" + "'", str27, "136");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1313288121506305" + "'", str7, "1313288121506305");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "86842385381442279029395311576" + "'", str13, "86842385381442279029395311576");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "742077522820322" + "'", str7, "742077522820322");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "411697714432038432330294914568" + "'", str13, "411697714432038432330294914568");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\u042d\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\u042d\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        java.lang.String str17 = rSA1.decrypt("1610609348121997");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1106730354645264" + "'", str7, "1106730354645264");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2175557611737386" + "'", str13, "2175557611737386");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\r\ufffd]>\036" + "'", str15, "\n\r\ufffd]>\036");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd" + "'", str17, "\007\ufffd");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
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
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99871812611919148408920233653" + "'", str9, "99871812611919148408920233653");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "673580613427158299591235713317" + "'", str11, "673580613427158299591235713317");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "576783961586961719644068215676" + "'", str13, "576783961586961719644068215676");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\b\ufffd\ufffd\ufffd\017\ufffd\ufffd" + "'", str15, "\007\ufffd\b\ufffd\ufffd\ufffd\017\ufffd\ufffd");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1054881677385067" + "'", str7, "1054881677385067");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\r3\000" + "'", str9, "\ufffd\r3\000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2097051732372594" + "'", str13, "2097051732372594");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "322072749168124" + "'", str15, "322072749168124");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\016g" + "'", str17, "\000\ufffd\ufffd\ufffd\016g");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2639992899570065" + "'", str19, "2639992899570065");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\006\031.\022\ufffd\005" + "'", str21, "\003\006\031.\022\ufffd\005");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2802181250577430" + "'", str7, "2802181250577430");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001U" + "'", str19, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "233" + "'", str21, "233");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("1527126373863416");
        java.lang.String str13 = rSA1.encrypt("1512895838");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd*" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "265836101546091688992974702624" + "'", str5, "265836101546091688992974702624");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "402432651239040936289450849933" + "'", str7, "402432651239040936289450849933");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "346049241513068531263477390906" + "'", str11, "346049241513068531263477390906");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "267444099885180107416881220753" + "'", str13, "267444099885180107416881220753");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\030\ufffd\ufffd\024\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "158" + "'", str9, "158");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("6025674780");
        java.lang.String str11 = rSA1.decrypt("1565011048071623");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "985128356" + "'", str9, "985128356");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u0798\ufffd" + "'", str11, "\u0798\ufffd");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("523");
        java.lang.String str19 = rSA1.encrypt("366159298107333549312946903145");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "258470033755743824926870900608" + "'", str17, "258470033755743824926870900608");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "530607367836072536819363201491" + "'", str19, "530607367836072536819363201491");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("251079656967995209389306632424");
        java.lang.String str21 = rSA1.encrypt("625794448185545179843844918667");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "863628060614072" + "'", str7, "863628060614072");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd1\0251D" + "'", str9, "\004\ufffd1\0251D");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "125821212248019" + "'", str15, "125821212248019");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "514" + "'", str19, "514");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "547" + "'", str21, "547");
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
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
        java.lang.String str21 = rSA1.decrypt("2666833155");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\ufffd]");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"b<?]\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2127199822958500" + "'", str7, "2127199822958500");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1236678783161275" + "'", str13, "1236678783161275");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\u023f\ufffd\ufffd" + "'", str17, "\001\ufffd\u023f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2036055521886492" + "'", str19, "2036055521886492");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd" + "'", str21, "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("245660888853858665981788302206");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "404472504403439254130057549512" + "'", str11, "404472504403439254130057549512");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3460225611" + "'", str15, "3460225611");
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "535385062491100" + "'", str7, "535385062491100");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "202" + "'", str19, "202");
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.encrypt("6318253741");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1582306979037933" + "'", str7, "1582306979037933");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd@" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1484303105336428" + "'", str13, "1484303105336428");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "520660024008919" + "'", str15, "520660024008919");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "430337890729444" + "'", str17, "430337890729444");
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("779");
        java.lang.String str13 = rSA1.decrypt("2062270877");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffdj" + "'", str7, "\000\ufffd\ufffd\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "872370956" + "'", str9, "872370956");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\\&\013" + "'", str11, "\002\ufffd\\&\013");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\u059d\ufffdQ" + "'", str13, "\002\u059d\ufffdQ");
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("470860891773042");
        java.lang.String str9 = rSA1.decrypt("10");
        java.lang.String str11 = rSA1.encrypt("456915798193527501688717312948");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?a?:\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\021\ufffd\ufffd\ufffd9b" + "'", str7, "\006\021\ufffd\ufffd\ufffd9b");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003M\026\u02a8" + "'", str9, "\003M\026\u02a8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2417475404461634" + "'", str11, "2417475404461634");
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.encrypt("149");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "394971645209081944195819398120" + "'", str3, "394971645209081944195819398120");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\b\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "149718323607044459403779085024" + "'", str7, "149718323607044459403779085024");
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\u03b0eh");
        java.lang.String str17 = rSA1.encrypt("1523471720");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "78429154634106" + "'", str7, "78429154634106");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1006165071" + "'", str11, "1006165071");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\035\ufffd\035\ufffd" + "'", str13, "\035\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1467970561" + "'", str15, "1467970561");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "204648245" + "'", str17, "204648245");
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd3\026\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("17984750416640363209182140552");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7492970517" + "'", str7, "7492970517");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4512612802135580760156063748" + "'", str13, "4512612802135580760156063748");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7\034\ufffd\ufffd\u067b<*\"\ufffd" + "'", str17, "7\034\ufffd\ufffd\u067b<*\"\ufffd");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        java.lang.String str9 = rSA1.encrypt("491597882470490509387393294253");
        java.lang.String str11 = rSA1.decrypt("332892179453072453431910072674");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd#\003" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\ufffd#\003");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "381456413213433751626725981508" + "'", str5, "381456413213433751626725981508");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\034\ufffd\006\0010k" + "'", str7, "\001\ufffd\ufffd\ufffd\034\ufffd\006\0010k");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "241353624839712893545187150919" + "'", str9, "241353624839712893545187150919");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\u075c\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\u075c\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "160944669076640297792062477439" + "'", str9, "160944669076640297792062477439");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "184652349048504076626100820098" + "'", str11, "184652349048504076626100820098");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd*" + "'", str15, "\004\ufffd\ufffd\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\021\ufffd\ufffd" + "'", str17, "\002\ufffd\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "128" + "'", str21, "128");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
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
        java.lang.String str25 = rSA1.encrypt("51376601757888737417237895966");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52387484557955597654223704037" + "'", str9, "52387484557955597654223704037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52387484557955597654223704037" + "'", str11, "52387484557955597654223704037");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0032\021\ufffd\u0511\ufffd\ufffd\ufffd" + "'", str13, "\0032\021\ufffd\u0511\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "173142578916498161473180352982" + "'", str15, "173142578916498161473180352982");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "27659208072402252831780124780" + "'", str21, "27659208072402252831780124780");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd%\"\002J" + "'", str23, "\002\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd%\"\002J");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "310320778538720579135362157643" + "'", str25, "310320778538720579135362157643");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
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
        java.lang.String str23 = rSA1.decrypt("56");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2119894725242769" + "'", str7, "2119894725242769");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "178262733888441" + "'", str13, "178262733888441");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "140608" + "'", str15, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "321169333180800" + "'", str17, "321169333180800");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "476624902340803" + "'", str19, "476624902340803");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\000\ufffd" + "'", str21, "\004\ufffd\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\ufffd\ufffd" + "'", str23, "\b\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("1671892677309544");
        java.lang.String str19 = rSA1.decrypt("142882767595980348121771717762");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "729824387498805" + "'", str13, "729824387498805");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "563856394555760" + "'", str15, "563856394555760");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\021\ufffd\013" + "'", str17, "\021\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd&*" + "'", str19, "\005\ufffd\ufffd\ufffd\ufffd&*");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("2669812389699993");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "57958086700419290795333259128" + "'", str9, "57958086700419290795333259128");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "620186844738600319489379922976" + "'", str11, "620186844738600319489379922976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "352894052095139860760195833297" + "'", str13, "352894052095139860760195833297");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("956742419960502");
        java.lang.String str13 = rSA1.encrypt("677515820738920883677057551843");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "179823060755565" + "'", str7, "179823060755565");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002^\002\ufffd\036\ufffd\ufffd" + "'", str11, "\002^\002\ufffd\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1372805526431668" + "'", str13, "1372805526431668");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("Z");
        java.lang.String str11 = rSA1.encrypt("1422455974188443");
        java.lang.String str13 = rSA1.decrypt("1330434113842336");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd'1" + "'", str5, "\001\ufffd'1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5904900000" + "'", str9, "5904900000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "247126754698324850700058925755" + "'", str11, "247126754698324850700058925755");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\033\ufffd\ufffd\ufffd\u86bb\u06a2\020" + "'", str13, "\004\ufffd\033\ufffd\ufffd\ufffd\u86bb\u06a2\020");
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
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
        java.lang.String str21 = rSA1.decrypt("1024337989772968734431866553693");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1550629398569366" + "'", str13, "1550629398569366");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\020\ufffd\ufffd" + "'", str15, "\013\020\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "210082212129096208940392436775" + "'", str19, "210082212129096208940392436775");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffd:\027\ufffd\003\ufffd\ufffd\ufffd" + "'", str21, "\000\ufffd\ufffd:\027\ufffd\003\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.decrypt("603423657");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "143141483563908" + "'", str7, "143141483563908");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "910086269" + "'", str11, "910086269");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\002\ufffdP" + "'", str13, "\b\002\ufffdP");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\035\u0430Q" + "'", str15, "\035\u0430Q");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("110437653753293");
        java.lang.String str9 = rSA1.decrypt("257355366039753");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "230" + "'", str3, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "550801399625017950721461545177" + "'", str7, "550801399625017950721461545177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\ufffd\"\ufffdx\035\304\ufffd" + "'", str9, "\t\ufffd\ufffd\ufffd\"\ufffdx\035\304\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("15573850693655");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1109125221341137" + "'", str13, "1109125221341137");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.encrypt("2372308538763998");
        java.lang.String str9 = rSA1.encrypt("1852625339284461");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\006\ufffd\ufffd\ufffd?G\035\ufffd'r" + "'", str3, "\000\ufffd\006\ufffd\ufffd\ufffd?G\035\ufffd'r");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250047" + "'", str5, "250047");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "150232037558206752475908650292" + "'", str7, "150232037558206752475908650292");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "195121173515415215442345944604" + "'", str9, "195121173515415215442345944604");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("577925724882894");
        java.lang.String str13 = rSA1.decrypt("160899005785201348795265593317");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "376" + "'", str11, "376");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "234" + "'", str15, "234");
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        java.lang.String str5 = rSA1.decrypt("135");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
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
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "966017933039262" + "'", str11, "966017933039262");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1093194638978214" + "'", str13, "1093194638978214");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "757754874664258" + "'", str15, "757754874664258");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "29561197679054492117245910144" + "'", str19, "29561197679054492117245910144");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\016\ufffd\ufffd\ufffd]\037\ufffd\ufffd" + "'", str23, "\002\016\ufffd\ufffd\ufffd]\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "237" + "'", str27, "237");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1884260150411716" + "'", str7, "1884260150411716");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "167" + "'", str15, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001$" + "'", str17, "\001$");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("235");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "523690526986050" + "'", str11, "523690526986050");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1297944459002884" + "'", str13, "1297944459002884");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\035\037\u022b\ufffd\ufffd\u0604\ufffd" + "'", str19, "\007\ufffd\035\037\u022b\ufffd\ufffd\u0604\ufffd");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("4688029675");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035" + "'", str7, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "802870045939996" + "'", str11, "802870045939996");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "526054617594272" + "'", str13, "526054617594272");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3061526836099037" + "'", str15, "3061526836099037");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "489588542971875099474660285883" + "'", str19, "489588542971875099474660285883");
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("23596208946137472461782808");
        java.lang.String str17 = rSA1.encrypt("\n\ufffd\ufffd\ufffd\001\ufffd9/\020\ufffd");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2675629075348047" + "'", str7, "2675629075348047");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\013\ufffdO" + "'", str9, "\t\013\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2074562793892297" + "'", str13, "2074562793892297");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2462899738792337" + "'", str15, "2462899738792337");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1361594004173479" + "'", str17, "1361594004173479");
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("477275381709667864596972007455");
        java.lang.String str13 = rSA1.decrypt("192");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "704892612" + "'", str11, "704892612");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\032\ufffdQ7" + "'", str13, "\032\ufffdQ7");
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("229");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("157691046172990273683746874770");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\u05db\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\b\ufffd\u05db\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd0+Y\026HYa" + "'", str7, "\ufffd\ufffd\ufffd\ufffd0+Y\026HYa");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("\030");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001)" + "'", str9, "\001)");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "530" + "'", str15, "530");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("2183500682712619");
        java.lang.String str15 = rSA1.encrypt("131591980401875559");
        java.lang.String str17 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd\u0549A");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\003\020\ufffd\ufffd7S");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???i?7S\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "234" + "'", str3, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4765988643" + "'", str7, "4765988643");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7027494023404428077738236114" + "'", str13, "7027494023404428077738236114");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9500860705470705241306689190" + "'", str15, "9500860705470705241306689190");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "16864982928211005888146464881" + "'", str17, "16864982928211005888146464881");
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("936488068250800");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "471" + "'", str9, "471");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001{" + "'", str13, "\001{");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("387");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "324130120296515134851195518375" + "'", str9, "324130120296515134851195518375");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "324130120296515134851195518375" + "'", str11, "324130120296515134851195518375");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffdT" + "'", str13, "\003\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffdT");
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\031]k");
        java.lang.String str11 = rSA1.decrypt("2221417013");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8089638267" + "'", str3, "8089638267");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6273513120" + "'", str7, "6273513120");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5509788982" + "'", str9, "5509788982");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u02ed\ufffd" + "'", str11, "\u02ed\ufffd");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.lang.String str11 = rSA1.decrypt("46925933906613754914094402908");
        java.lang.String str13 = rSA1.decrypt("707354788339984318646007591924");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "66700990193405422344978541546" + "'", str9, "66700990193405422344978541546");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\u0362\ufffd\ufffd\ufffd\ufffd\033" + "'", str11, "\000\u0362\ufffd\ufffd\ufffd\ufffd\033");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffdG" + "'", str13, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\f\ufffdG");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("511324906649475524073057205686");
        java.lang.String str17 = rSA1.encrypt("1489595178");
        java.lang.String str19 = rSA1.encrypt("477224622093152716234480757759");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "664115411350120" + "'", str7, "664115411350120");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\020\ufffd\ufffd\ufffd" + "'", str15, "\b\ufffd\ufffd\020\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1361918096523925" + "'", str17, "1361918096523925");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1440659500713163" + "'", str19, "1440659500713163");
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "47606374594985181195398169126" + "'", str9, "47606374594985181195398169126");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5713649075174595887837592851" + "'", str11, "5713649075174595887837592851");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\022\ufffd\006\ufffdT+" + "'", str13, "\005\ufffd\ufffd\ufffd\022\ufffd\006\ufffdT+");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\007\ufffd\ufffd\ufffd\001\ufffd\u0134u" + "'", str15, "\000\ufffd\ufffd\007\ufffd\ufffd\ufffd\001\ufffd\u0134u");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\021\ufffdU\177\ufffd\ufffd\ufffd\ufffd9" + "'", str19, "\004\ufffd\ufffd\021\ufffdU\177\ufffd\ufffd\ufffd\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd*KM\020\000\ufffd\ufffd\ufffd" + "'", str21, "\005\ufffd*KM\020\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "63831853932896309527830255737" + "'", str23, "63831853932896309527830255737");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
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
        java.lang.String str23 = rSA1.decrypt("1264678101");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\ufffdU7");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"$?U7\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "763329034586023" + "'", str7, "763329034586023");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "240" + "'", str19, "240");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd" + "'", str23, "\001\ufffd\ufffd");
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.decrypt("273390189577687013215022252038");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\u02c1\u04e3\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("2128656648578657");
        java.lang.String str19 = rSA1.encrypt("\ufffd\375\u07a2\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\t\ufffd\ufffd\016\ufffd" + "'", str3, "\b\ufffd\t\ufffd\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "999264132279460475222156350931" + "'", str5, "999264132279460475222156350931");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "956454960567022790444457505088" + "'", str7, "956454960567022790444457505088");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd5\001\ufffd\ufffd\ufffd&\nwIz" + "'", str9, "\006\ufffd5\001\ufffd\ufffd\ufffd&\nwIz");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\005\ufffd\ufffd~6\036\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\005\ufffd\ufffd~6\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "247545652193443397362602010191" + "'", str15, "247545652193443397362602010191");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\005\ufffd\ufffd\ufffd\020c\032\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd\005\ufffd\ufffd\ufffd\020c\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "367588733472854432172203682804" + "'", str19, "367588733472854432172203682804");
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230" + "'", str9, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198" + "'", str13, "198");
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.encrypt("182896684412517005977800507579");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\005\036\ufffd\ufffd\ufffd\003\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("98183941855532363183091666438");
        java.lang.String str21 = rSA1.encrypt("\002\ufffd\ufffd\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001." + "'", str11, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "170" + "'", str13, "170");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "45040611815031085465134180885" + "'", str17, "45040611815031085465134180885");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "17352442834145597901605487838" + "'", str19, "17352442834145597901605487838");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "28815036267810941300932151889" + "'", str21, "28815036267810941300932151889");
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        java.lang.String str15 = rSA1.decrypt("299");
        java.lang.String str17 = rSA1.encrypt("441699557");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "86" + "'", str11, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\025" + "'", str13, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001~" + "'", str15, "\001~");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "586" + "'", str17, "586");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("86");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
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
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str25 = rSA1.encrypt("6269346463");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "&" + "'", str15, "&");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001*" + "'", str19, "\001*");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "836347019915329252631495763354" + "'", str25, "836347019915329252631495763354");
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd!" + "'", str3, "\000\ufffd\ufffd\ufffd\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "45009739" + "'", str7, "45009739");
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        java.lang.String str15 = rSA1.encrypt("54326269148954289324151592843");
        java.lang.String str17 = rSA1.encrypt("36889312402462405966288044447");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "214" + "'", str13, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "327" + "'", str15, "327");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "338" + "'", str17, "338");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507" + "'", str11, "507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "511" + "'", str13, "511");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1921140814646505" + "'", str7, "1921140814646505");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "85107424765816" + "'", str13, "85107424765816");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "489" + "'", str17, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "254" + "'", str19, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "441" + "'", str21, "441");
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("1313077561120818");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16801464539943882266521625187" + "'", str9, "16801464539943882266521625187");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\"B;\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdS" + "'", str11, "\004\"B;\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdS");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "528877003590824300723334134819" + "'", str15, "528877003590824300723334134819");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        java.lang.String str21 = rSA1.decrypt("3405700636");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1869388971445530" + "'", str7, "1869388971445530");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1965602054106432" + "'", str9, "1965602054106432");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "468065371412196" + "'", str11, "468065371412196");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "660130989911113791012357923333" + "'", str17, "660130989911113791012357923333");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "28433729727210546671279803340" + "'", str19, "28433729727210546671279803340");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\177\ufffd\030\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\005\ufffd\ufffd\177\ufffd\030\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        java.lang.String str13 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str15 = rSA1.decrypt("352");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.decrypt("172702154013448640780877889078");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "379403432348647994780205707659" + "'", str9, "379403432348647994780205707659");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "697283014504803104706968181360" + "'", str11, "697283014504803104706968181360");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffdIb\"\000\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffdIb\"\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd" + "'", str15, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001=" + "'", str19, "\001=");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\006\016\ufffd\ufffda2");
        java.lang.String str17 = rSA1.encrypt("282");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "578250473429239725558896084243" + "'", str13, "578250473429239725558896084243");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "152200808944724284826471986194" + "'", str15, "152200808944724284826471986194");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "595577998605737096057093776479" + "'", str17, "595577998605737096057093776479");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
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
        java.lang.String str23 = rSA1.decrypt("629388989576392450425203431014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt(",");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \",\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1314838005596326" + "'", str7, "1314838005596326");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\b\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2942255866215808" + "'", str13, "2942255866215808");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2326554921814903" + "'", str15, "2326554921814903");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b&\006i\\\ufffd\ufffd" + "'", str17, "\b&\006i\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2447889471943949" + "'", str19, "2447889471943949");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str21, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\ufffd\ufffd\f\fL;" + "'", str23, "\b\ufffd\ufffd\f\fL;");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\006?X\000\ufffd$h\017\ufffd\ufffd\ufffd\025\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdj" + "'", str3, "\003\ufffd\ufffd\ufffd\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "880979985021628" + "'", str5, "880979985021628");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1255623975498449" + "'", str7, "1255623975498449");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "635164017371536" + "'", str9, "635164017371536");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
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
        java.lang.String str23 = rSA1.encrypt("258580565253484916644733070722");
        java.lang.String str25 = rSA1.decrypt("1913892309");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\005\037\036\ufffd\ufffdF" + "'", str13, "\001\005\037\036\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "654845643115097" + "'", str15, "654845643115097");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2142328239633602" + "'", str17, "2142328239633602");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "96" + "'", str21, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "377" + "'", str23, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001R" + "'", str25, "\001R");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\001\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("L");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"L\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5348714431" + "'", str3, "5348714431");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "566753496" + "'", str5, "566753496");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
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
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "217" + "'", str13, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "216" + "'", str15, "216");
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("3594062061299896073537008963");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3449908135" + "'", str3, "3449908135");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2952148033" + "'", str7, "2952148033");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "440218190" + "'", str11, "440218190");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.encrypt("473642297");
        java.lang.String str13 = rSA1.encrypt("286111260777271851216079818434");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\u041d\ufffd\u07b0\ufffd\ufffd" + "'", str9, "\t\u041d\ufffd\u07b0\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "837195331974483896973241182192" + "'", str11, "837195331974483896973241182192");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "316652332898165976624516776655" + "'", str13, "316652332898165976624516776655");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("5447816862");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001O" + "'", str9, "\001O");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = rSA1.decrypt("\002\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??Y;?^?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25726452963467" + "'", str7, "25726452963467");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P" + "'", str19, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "41" + "'", str21, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001L" + "'", str23, "\001L");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "544" + "'", str27, "544");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\"\ufffd\ufffd\ufffd" + "'", str13, "\002\"\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("730903677901316255479995383411");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\034\ufffd\035L" + "'", str3, "\006\034\ufffd\035L");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "112750765355423" + "'", str5, "112750765355423");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "423717078310790" + "'", str7, "423717078310790");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffdv\017\ufffd\ufffd" + "'", str9, "\000\ufffdv\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2516587779489182" + "'", str11, "2516587779489182");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "26870359599690689213460349953" + "'", str15, "26870359599690689213460349953");
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("10019204889");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\007\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?O? ???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007\ufffd\ufffd\ufffdU^" + "'", str3, "\007\ufffd\ufffd\ufffdU^");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2390942216394773" + "'", str5, "2390942216394773");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2707038476904756" + "'", str7, "2707038476904756");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2631301674422173" + "'", str9, "2631301674422173");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
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
        rSA1.generateKeys(100);
        java.lang.String str23 = rSA1.encrypt("\004\ufffd\ufffd\u076c\ufffd\0207\034\u0411");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "217253802192595844708364718732" + "'", str9, "217253802192595844708364718732");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\u0729\ufffd\ufffd\ufffd&\004p?-4\031" + "'", str11, "\003\u0729\ufffd\ufffd\ufffd&\004p?-4\031");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "326479624884884038715769963154" + "'", str13, "326479624884884038715769963154");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffds\016\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffds\016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\\v\f\u0105\ufffd\ufffd\ufffd\023" + "'", str19, "\004\\v\f\u0105\ufffd\ufffd\ufffd\023");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "437470520704794182996986064073" + "'", str23, "437470520704794182996986064073");
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2064440430059638");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\005\ufffd\b@U");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????@U\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\u0585\177\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\u0585\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\n\ufffd\026\002" + "'", str13, "\000\ufffd\ufffd\ufffd\n\ufffd\026\002");
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\013\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12426383575" + "'", str3, "12426383575");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3822234665" + "'", str5, "3822234665");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15354205665" + "'", str7, "15354205665");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11766398134" + "'", str9, "11766398134");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\004\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1354028964501536" + "'", str15, "1354028964501536");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\016\ufffd\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\016\ufffd\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "37744904683390723898904897463" + "'", str21, "37744904683390723898904897463");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("1534903236613159");
        java.lang.String str7 = rSA1.encrypt("502175635293882102637091172630");
        java.lang.String str9 = rSA1.encrypt("352462419790143146925046761210");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "660513885789021870224614995055" + "'", str3, "660513885789021870224614995055");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\005\ufffd\ufffd\u07c6\ufffd#B\b" + "'", str5, "\005\ufffd\ufffd\u07c6\ufffd#B\b");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "774441004871081647487716421015" + "'", str7, "774441004871081647487716421015");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "358357755496824942923076542021" + "'", str9, "358357755496824942923076542021");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90" + "'", str11, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13" + "'", str13, "13");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "410156919671436318998529774612" + "'", str17, "410156919671436318998529774612");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "305357976752770414470438957676" + "'", str19, "305357976752770414470438957676");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\005\032K\004\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??K?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffdS$" + "'", str13, "\003\ufffdS$");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1645467871759062" + "'", str15, "1645467871759062");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1049523867178825" + "'", str17, "1049523867178825");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1047744790419350" + "'", str19, "1047744790419350");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1120740154586813" + "'", str21, "1120740154586813");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("\036\034\u01b7\ufffd\035\ufffd\ufffd\ufffd9h;");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "445" + "'", str5, "445");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "366" + "'", str7, "366");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("945892428");
        java.lang.String str15 = rSA1.decrypt("433287805607708");
        java.lang.String str17 = rSA1.encrypt("31247694869501262833790932729");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\022\u045b\023\020" + "'", str13, "\006\022\u045b\023\020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007,S\007\ufffd\ufffd\005" + "'", str15, "\007,S\007\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1802814602491813" + "'", str17, "1802814602491813");
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.encrypt("216");
        java.lang.String str15 = rSA1.encrypt("528864329572193935886654471744");
        java.lang.String str17 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "393075020607935054523394998145" + "'", str9, "393075020607935054523394998145");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "75290219084946316554988011113" + "'", str11, "75290219084946316554988011113");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "528808902918475729960951069723" + "'", str13, "528808902918475729960951069723");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "138598387724012738474087378745" + "'", str15, "138598387724012738474087378745");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "233107168541703449238734483966" + "'", str17, "233107168541703449238734483966");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1302562350660895" + "'", str11, "1302562350660895");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2234042948310705" + "'", str13, "2234042948310705");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7025062932901111170952421349" + "'", str19, "7025062932901111170952421349");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "298858693267815645250128918541" + "'", str21, "298858693267815645250128918541");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("86");
        java.lang.String str9 = rSA1.decrypt("70912978627748895967159445373");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\005\ufffd\ufffd\ufffd\ufffd\037\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?pb?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\026\ufffd\013\ufffd\ufffd\ufffd\ufffd\002R" + "'", str7, "\026\ufffd\013\ufffd\ufffd\ufffd\ufffd\002R");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdm" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdm");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.decrypt("1198965058209000");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\004\u0317\ufffd\ufffd5\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "424597954261181429785400451801" + "'", str3, "424597954261181429785400451801");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd}i\025\ufffd\f\ufffd\022\ufffd\ufffd" + "'", str5, "\000\ufffd}i\025\ufffd\f\ufffd\022\ufffd\ufffd");
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2525222791675032" + "'", str7, "2525222791675032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1573730253281702" + "'", str13, "1573730253281702");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\020p\007\ufffd\ufffd" + "'", str15, "\004\020p\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffdj" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "573302886903797" + "'", str19, "573302886903797");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("Z");
        java.lang.String str11 = rSA1.encrypt("3463356647");
        java.lang.String str13 = rSA1.encrypt("399218178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\\\033V\"" + "'", str5, "\001\\\033V\"");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5904900000" + "'", str9, "5904900000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "180091675405487149233310514141" + "'", str11, "180091675405487149233310514141");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "433146474277456631777834357851" + "'", str13, "433146474277456631777834357851");
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("1609850914753610");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\036\002b{3");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "164341563462254592" + "'", str3, "164341563462254592");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "131591980401875559" + "'", str5, "131591980401875559");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "309270469915567435599857730225" + "'", str7, "309270469915567435599857730225");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "30" + "'", str11, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "403" + "'", str13, "403");
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
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
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9517856654050" + "'", str7, "9517856654050");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279936" + "'", str13, "279936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "881423672548463" + "'", str15, "881423672548463");
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("308422204620092985527502288542");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001m\002\ufffdzQ\007\ufffdb\017\ufffd\ufffd" + "'", str3, "\001m\002\ufffdzQ\007\ufffdb\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "301463864979201237530092181803" + "'", str5, "301463864979201237530092181803");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "454366441661071970772667409648" + "'", str7, "454366441661071970772667409648");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffdQ\024\ufffd\ufffd\ufffd\u04cb*\004" + "'", str9, "\003\ufffd\ufffdQ\024\ufffd\ufffd\ufffd\u04cb*\004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "189722558849620461365386083088" + "'", str11, "189722558849620461365386083088");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "685705353270466" + "'", str7, "685705353270466");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "11" + "'", str19, "11");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "231" + "'", str21, "231");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "13" + "'", str23, "13");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("350555347807474765631801418392");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "70176448984802801528920899252" + "'", str9, "70176448984802801528920899252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\020:\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\007\020:\004\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t<?,\017\ufffd\ufffd\ufffd\ufffd\022" + "'", str15, "\t<?,\017\ufffd\ufffd\ufffd\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "429700809700660086744615597674" + "'", str17, "429700809700660086744615597674");
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1512739533813279");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1312757649628170" + "'", str7, "1312757649628170");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2026261617216233" + "'", str9, "2026261617216233");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("423");
        java.lang.String str5 = rSA1.encrypt("825");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("603377111727349");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\002\u071a\u0715\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("146");
        java.lang.String str19 = rSA1.encrypt("360275062061272870298343807686");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "419912784191519944189992383989" + "'", str11, "419912784191519944189992383989");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "286119932202553719865666295589" + "'", str13, "286119932202553719865666295589");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "451154973933744032581564572676" + "'", str15, "451154973933744032581564572676");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\n\u07b6\ufffd\ufffd\ufffdVV" + "'", str17, "\004\ufffd\n\u07b6\ufffd\ufffd\ufffdVV");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "162006749851941096890068141859" + "'", str19, "162006749851941096890068141859");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd\u02c0\ufffd\ufffd\007,");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172" + "'", str5, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "430" + "'", str9, "430");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        java.lang.String str9 = rSA1.encrypt("11695976753");
        java.lang.String str11 = rSA1.encrypt("\002\033\ufffd\t\ufffd\ufffd>\026\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214" + "'", str9, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "335" + "'", str11, "335");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("1249253780109007");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "387835350594672" + "'", str7, "387835350594672");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "899205894" + "'", str11, "899205894");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd*\034" + "'", str13, "\ufffd*\034");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("85317131416827023530889570588");
        java.lang.String str15 = rSA1.encrypt("230392568664349877198980463493");
        java.lang.String str17 = rSA1.encrypt("414008651302373171950419774429");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "356942126382843992755724801685" + "'", str9, "356942126382843992755724801685");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "731558716377361680374487383087" + "'", str11, "731558716377361680374487383087");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "658661779780289956178568478029" + "'", str15, "658661779780289956178568478029");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "425904795020250708199657427975" + "'", str17, "425904795020250708199657427975");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
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
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "912821305" + "'", str3, "912821305");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5274165284" + "'", str7, "5274165284");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8416224645" + "'", str13, "8416224645");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6088583320" + "'", str15, "6088583320");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("462059788404288851690924494526");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "332910574158178492182477546300" + "'", str9, "332910574158178492182477546300");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\n\ufffd\ufffdxX>i\004\ufffd" + "'", str11, "\000\ufffd\ufffd\n\ufffd\ufffdxX>i\004\ufffd");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
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
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "363089930267748" + "'", str7, "363089930267748");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10778463128977" + "'", str13, "10778463128977");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\\ufffd\ufffdl" + "'", str19, "\\\ufffd\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "819141890" + "'", str21, "819141890");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffdK" + "'", str23, "\ufffd\ufffdK");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "_FF:" + "'", str25, "_FF:");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\ufffd\ufffd" + "'", str27, "\ufffd\ufffd");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("8403463512");
        java.lang.String str13 = rSA1.encrypt("\024\ufffdo\024\ufffdG\031\ufffd\ufffd\ufffdG");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "545802783660929" + "'", str7, "545802783660929");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\177\t\ufffd" + "'", str9, "\005\ufffd\177\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\n\ufffd\ufffd\007\u048f" + "'", str11, "\003\n\ufffd\ufffd\007\u048f");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "824229730808464" + "'", str13, "824229730808464");
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("493417818868954359065709461101");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\n\ufffd\ufffd" + "'", str9, "\t\ufffd\ufffd\ufffd\ufffd\n\ufffd\ufffd");
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.decrypt("925568231498920647360821327791");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2538707321" + "'", str3, "2538707321");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\"\ufffd\f" + "'", str7, "\001\ufffd\"\ufffd\f");
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.encrypt("9047872");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1711848465941355" + "'", str7, "1711848465941355");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "270" + "'", str11, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "243" + "'", str13, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "288" + "'", str15, "288");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("575730631187720402467793207691");
        java.lang.String str15 = rSA1.decrypt("3555131614");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171472342135926510904921586689" + "'", str9, "171472342135926510904921586689");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "142766678955646781508427052502" + "'", str11, "142766678955646781508427052502");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "183692074128392504068783805063" + "'", str13, "183692074128392504068783805063");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002X\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdE" + "'", str15, "\002X\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdE");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffd\033\ufffd\ufffdu%");
        java.lang.String str19 = rSA1.decrypt("717006236777577851189831105014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001)\016\ufffdP");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?)??P\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "566577658975536772934351019344" + "'", str13, "566577658975536772934351019344");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "264142585304655492181390713941" + "'", str17, "264142585304655492181390713941");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\032\ufffd\ufffd\ufffd\ufffdZa" + "'", str19, "\006\032\ufffd\ufffd\ufffd\ufffdZa");
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.decrypt("431084566042046118914878654595");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "300" + "'", str11, "300");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "B" + "'", str13, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "148" + "'", str15, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "119285712147724441693660032010" + "'", str9, "119285712147724441693660032010");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\006\ufffd\ufffd\ufffd\027\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\006\ufffd\ufffd\ufffd\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "368964704234278383950188588230" + "'", str13, "368964704234278383950188588230");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffdq\022\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\ufffdq\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "278035949539868951631980928474" + "'", str17, "278035949539868951631980928474");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2542762824143027116568558491" + "'", str21, "2542762824143027116568558491");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd;\177\ufffdM\b\ufffd\001\ufffd\ufffd" + "'", str25, "\ufffd;\177\ufffdM\b\ufffd\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "33659202104052239049401706521" + "'", str27, "33659202104052239049401706521");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
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
        java.lang.String str21 = rSA1.encrypt("\001`");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1163339183123510" + "'", str7, "1163339183123510");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "315" + "'", str19, "315");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "212" + "'", str21, "212");
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\t\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "629546509584715" + "'", str15, "629546509584715");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "512328174812343" + "'", str17, "512328174812343");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\027\ufffd\ufffd\ufffdo" + "'", str19, "\027\ufffd\ufffd\ufffdo");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffdtV^\021\ufffd\177\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "309081328336441533164658285128" + "'", str11, "309081328336441533164658285128");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.decrypt("7516865509350965248");
        java.lang.String str19 = rSA1.encrypt("319862624706953877403554557125");
        java.lang.String str21 = rSA1.encrypt("220512433854357867069828977731");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1320412087624589" + "'", str7, "1320412087624589");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "489" + "'", str15, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\000" + "'", str17, "\001\000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "179" + "'", str19, "179");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "222" + "'", str21, "222");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "431891789191782610621056331825" + "'", str9, "431891789191782610621056331825");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "c\024\ufffd\ufffd\u01a0\ufffd\ufffd\ufffd\ufffdR" + "'", str11, "c\024\ufffd\ufffd\u01a0\ufffd\ufffd\ufffd\ufffdR");
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("279936");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "252971636947938265733345965320" + "'", str9, "252971636947938265733345965320");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\004\u0621\ufffd\n\007\ufffd\u0539\ufffd" + "'", str11, "\004\ufffd\004\u0621\ufffd\n\007\ufffd\u0539\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "274753280501954881595166120249" + "'", str13, "274753280501954881595166120249");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "231279615465721569603755126783" + "'", str15, "231279615465721569603755126783");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\\\ufffd\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd\\\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("1062642813");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "354502109229355787765617646243" + "'", str9, "354502109229355787765617646243");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "249809521981159211227905822869" + "'", str11, "249809521981159211227905822869");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd\027\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\032\ufffd\ufffd\ufffd\003" + "'", str17, "\004\ufffd\032\ufffd\ufffd\ufffd\003");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.encrypt("7776");
        rSA1.generateKeys(10);
        java.lang.String str21 = rSA1.encrypt("399");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "660744558474188" + "'", str7, "660744558474188");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\ufffd\ufffd$Z" + "'", str9, "\013\ufffd\ufffd$Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1300102472573488" + "'", str13, "1300102472573488");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "446538714699719" + "'", str17, "446538714699719");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "69" + "'", str21, "69");
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("451");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\020\u079a&");
        java.lang.String str19 = rSA1.decrypt("527056584");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "426" + "'", str13, "426");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "171" + "'", str15, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "16" + "'", str17, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001x" + "'", str19, "\001x");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("4849824141");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "279116477101958" + "'", str11, "279116477101958");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "593807977763495" + "'", str13, "593807977763495");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd|;C" + "'", str15, "\000\ufffd\ufffd|;C");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        rSA1.generateKeys(100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004" + "'", str11, "\004");
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str15 = rSA1.decrypt("1630771903");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1153073230200795" + "'", str13, "1153073230200795");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\031\ufffd\004R\007|" + "'", str15, "\031\ufffd\004R\007|");
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("180544958851594357572097788605");
        java.lang.String str13 = rSA1.decrypt("498517715595236544046073650611");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd\n" + "'", str5, "\001\ufffd\ufffd\ufffd\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001$\033\ufffd\ufffd\ufffd\u0440\ufffdT" + "'", str9, "\001$\033\ufffd\ufffd\ufffd\u0440\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16499181951068256937200556762" + "'", str11, "16499181951068256937200556762");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\b\ufffd\r\ufffd\"\ufffd0kOF" + "'", str13, "\004\b\ufffd\r\ufffd\"\ufffd0kOF");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("88163053801867586941492124226");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "199" + "'", str11, "199");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "446" + "'", str15, "446");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\ufffd`");
        java.lang.String str19 = rSA1.decrypt("1812393953540623");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "347" + "'", str17, "347");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0015" + "'", str19, "\0015");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
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
        java.lang.String str35 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd(])");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "836649603944747" + "'", str7, "836649603944747");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\007" + "'", str19, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "439" + "'", str21, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001H" + "'", str23, "\001H");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "139" + "'", str27, "139");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "287578578117007103506711943210" + "'", str31, "287578578117007103506711943210");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "472" + "'", str35, "472");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        java.lang.String str17 = rSA1.decrypt("155707469794806709519787576140");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "289689637379977095881198843262" + "'", str9, "289689637379977095881198843262");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "188800433311439679639216145997" + "'", str11, "188800433311439679639216145997");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "408815839191219815716833820729" + "'", str13, "408815839191219815716833820729");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "538065690154094167810163928100" + "'", str15, "538065690154094167810163928100");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\b\030\ufffd\ufffd\ufffdx ");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205287862446133207597542866329" + "'", str9, "205287862446133207597542866329");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005g\031\035\ufffd\ufffd\020\ufffd" + "'", str11, "\005g\031\035\ufffd\ufffd\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "353446515019804732157521110398" + "'", str13, "353446515019804732157521110398");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380118684435112883177904963439" + "'", str15, "380118684435112883177904963439");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "367786146101896064634451554964" + "'", str17, "367786146101896064634451554964");
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "804423794110395675811490105132" + "'", str9, "804423794110395675811490105132");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "418309605466038046822379599773" + "'", str11, "418309605466038046822379599773");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffds.\002;\n\ufffd\ufffd" + "'", str13, "\007\ufffds.\002;\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031" + "'", str15, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("22369983321637");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1384284520700753" + "'", str15, "1384284520700753");
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
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
        java.lang.String str21 = rSA1.encrypt("1642026385220030");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1188576645164928" + "'", str7, "1188576645164928");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "198" + "'", str19, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "80" + "'", str21, "80");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        java.lang.String str13 = rSA1.encrypt("796458007411936427820377881398");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "228" + "'", str7, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "447391891524262825077225984201" + "'", str11, "447391891524262825077225984201");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "265656920363980284403224116407" + "'", str13, "265656920363980284403224116407");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "487436198816315313919034685860" + "'", str11, "487436198816315313919034685860");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "464406058644304280283411546303" + "'", str13, "464406058644304280283411546303");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\177\ufffd\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd>" + "'", str15, "\001\ufffd\177\ufffd\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "454233345648413435043986406371" + "'", str17, "454233345648413435043986406371");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "37761701459156484237" + "'", str19, "37761701459156484237");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\ufffd  \016\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\007\ufffd\ufffd  \016\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "623008899948980062226988976702" + "'", str23, "623008899948980062226988976702");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
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
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2277509929852108" + "'", str7, "2277509929852108");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "137" + "'", str17, "137");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\001X");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\f\ufffdAv" + "'", str3, "\005\ufffd\ufffd\f\ufffdAv");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2547732178936567" + "'", str5, "2547732178936567");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52287255422376" + "'", str7, "52287255422376");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1424060534029850" + "'", str9, "1424060534029850");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("d8\000\026\ufffd\ufffd\002\ufffd\ufffd\ufffd\003");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"d8\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "228" + "'", str7, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "375" + "'", str9, "375");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("184677000372197579945525954200");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001\ufffd\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\0035" + "'", str9, "\0035");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("227290461441087430894724401851");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9370151139" + "'", str3, "9370151139");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd");
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("5483845661");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "196736120452979024427954245167" + "'", str3, "196736120452979024427954245167");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\u052d\ufffd\ufffd" + "'", str5, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\u052d\ufffd\ufffd");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "232057842784678483398113967753" + "'", str9, "232057842784678483398113967753");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\007" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffdC\016J\005\ufffd\ufffd\ufffd" + "'", str15, "\004\ufffdC\016J\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42875" + "'", str17, "42875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdJ\025\ufffd?" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdJ\025\ufffd?");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
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
        java.lang.String str23 = rSA1.encrypt("\ufffd\036d");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "235419944100146734008432013816" + "'", str9, "235419944100146734008432013816");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380746810588554422075409025757" + "'", str11, "380746810588554422075409025757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "561203774971616455070592758043" + "'", str13, "561203774971616455070592758043");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\001\ufffd~\377\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\001\ufffd~\377\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "151778908619170302591835073095" + "'", str17, "151778908619170302591835073095");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "483952153620554256519569152668" + "'", str19, "483952153620554256519569152668");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\u06e4\ufffd\ufffd\ufffd\u6acc/f" + "'", str21, "\001\u06e4\ufffd\ufffd\ufffd\u6acc/f");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "476607332240052099541422049107" + "'", str23, "476607332240052099541422049107");
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("346125639250942006569169281670");
        java.lang.String str15 = rSA1.encrypt("592552440178091751602093603316");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?%?9?u?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "272" + "'", str13, "272");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "292" + "'", str15, "292");
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("111391917685414668336366870336");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2691175129667673" + "'", str7, "2691175129667673");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("583253898306406");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("7962624");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "329289487379400202224855979151" + "'", str9, "329289487379400202224855979151");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "611856503736761496170039084249" + "'", str11, "611856503736761496170039084249");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "568636449278503016333908541970" + "'", str13, "568636449278503016333908541970");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "145281271585509382944166775378" + "'", str17, "145281271585509382944166775378");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "26" + "'", str21, "26");
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("498517715595236544046073650611");
        java.lang.String str9 = rSA1.encrypt("20872893387406392428226946911");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001Z" + "'", str3, "\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035\ufffd\177l\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\035\ufffd\177l\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39423976071493307600279367088" + "'", str9, "39423976071493307600279367088");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("258580565253484916644733070722");
        java.lang.String str17 = rSA1.encrypt("10670906504");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "254557477462664361070817342451" + "'", str9, "254557477462664361070817342451");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002z\002\ufffd\005\ufffd\ufffd4\035" + "'", str11, "\002z\002\ufffd\005\ufffd\ufffd4\035");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "616783667746177352974556718681" + "'", str13, "616783667746177352974556718681");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "438456049510711601290818249184" + "'", str15, "438456049510711601290818249184");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "94003580248690369080758556133" + "'", str17, "94003580248690369080758556133");
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.decrypt("211673788539744279696210156906");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035\ufffd" + "'", str7, "\001\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\b\ufffd\ufffd\ufffd" + "'", str9, "\002\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
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
        java.lang.String str23 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "170573438064664194177368993756" + "'", str9, "170573438064664194177368993756");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\031\ufffd\ufffd\004\t\024BRB\001\ufffd" + "'", str11, "\002\031\ufffd\ufffd\004\t\024BRB\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002]\035ph\021\ufffd\ufffd\030\ufffd\ufffd\ufffdj" + "'", str13, "\002]\035ph\021\ufffd\ufffd\030\ufffd\ufffd\ufffdj");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdm[" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffdm[");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd1 B\024\033\ufffd\ufffd\ufffd~" + "'", str19, "\000\ufffd\ufffd1 B\024\033\ufffd\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\004/" + "'", str23, "\ufffd\004/");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("\003`\000\ufffd\ufffdEw\034\ufffd\002\004");
        java.lang.String str17 = rSA1.decrypt("224604543349583");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003.Fm\022\ufffdi" + "'", str3, "\003.Fm\022\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470095783054000" + "'", str5, "470095783054000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1026359543754689" + "'", str7, "1026359543754689");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\f\ufffd" + "'", str9, "\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\u26ec\034" + "'", str13, "\004\ufffd\u26ec\034");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "611134772990218" + "'", str15, "611134772990218");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
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
        java.lang.String str21 = rSA1.encrypt("\007\ufffdO\016");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd10\023\ufffd\ufffdJW" + "'", str11, "\004\ufffd\ufffd10\023\ufffd\ufffdJW");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\034\ufffd\ufffd\002\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\034\ufffd\ufffd\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\023\ufffd\\\030\ufffd\035\ufffd\ufffd\ufffd" + "'", str17, "\023\ufffd\\\030\ufffd\035\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + ")8%!p\006\ufffd\ufffdA" + "'", str19, ")8%!p\006\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "43777307010996280520835544662" + "'", str21, "43777307010996280520835544662");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("460290203420997373753530609873");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "162" + "'", str9, "162");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002d\021\ufffd\ufffd" + "'", str13, "\002d\021\ufffd\ufffd");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd=");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("1814032248");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "451132567" + "'", str9, "451132567");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffdT" + "'", str13, "\000\ufffd\ufffdT");
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("1021508253829588");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "752394553229045" + "'", str7, "752394553229045");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\0057\177\020\ufffd\ufffd" + "'", str9, "\0057\177\020\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1269938024680095" + "'", str13, "1269938024680095");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2003045371168405" + "'", str15, "2003045371168405");
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
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
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "511242902704498" + "'", str13, "511242902704498");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2825194682112244" + "'", str15, "2825194682112244");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "698741542353086" + "'", str17, "698741542353086");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1522653606694548" + "'", str19, "1522653606694548");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\023\ufffd\022\u03e1j" + "'", str21, "\005\023\ufffd\022\u03e1j");
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("\005g\006\ufffd\ufffda");
        java.lang.String str7 = rSA1.encrypt("\007\025\ufffd\ufffd\ufffd\u0591\ufffd\024\016\006");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\002\024\ufffd\ufffdu");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2493191316" + "'", str3, "2493191316");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "54747847" + "'", str5, "54747847");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "179360986" + "'", str7, "179360986");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3395621061" + "'", str9, "3395621061");
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("566454229538444812474847337870");
        java.lang.String str15 = rSA1.encrypt("4833214092");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3597437409" + "'", str3, "3597437409");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1069911949" + "'", str5, "1069911949");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8385964140" + "'", str7, "8385964140");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10785856985" + "'", str9, "10785856985");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\016\ufffd\ufffd}J" + "'", str13, "\016\ufffd\ufffd}J");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "80980865783633" + "'", str15, "80980865783633");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("241");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "214" + "'", str13, "214");
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.lang.String str13 = rSA1.encrypt("538466596764584785061881286421");
        java.lang.String str15 = rSA1.encrypt("255208532862462952347238750539");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\"\ufffd\ufffd" + "'", str5, "\001\ufffd\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "496409577097149070926417543698" + "'", str9, "496409577097149070926417543698");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "567297446169907703714635845950" + "'", str11, "567297446169907703714635845950");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "678729435333335455533047993069" + "'", str13, "678729435333335455533047993069");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "342022975411800672907680734258" + "'", str15, "342022975411800672907680734258");
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str19 = rSA1.encrypt("\003\ufffdh\b\ufffd\ufffdw*\002\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffde\026D\t\ufffd\ufffd\021\ufffd" + "'", str15, "\001\ufffd\ufffde\026D\t\ufffd\ufffd\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "508" + "'", str19, "508");
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        java.lang.String str15 = rSA1.encrypt("380204032");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd7\004\ufffd\ufffd\ufffd\nQ");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + " \f$\016\ufffdF" + "'", str13, " \f$\016\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "945310333111898" + "'", str15, "945310333111898");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1882487327242800" + "'", str17, "1882487327242800");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
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
        java.lang.String str21 = rSA1.decrypt("136920345242702");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2621729112545273" + "'", str7, "2621729112545273");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005y\177\ufffd\ufffd\ufffd$" + "'", str9, "\005y\177\ufffd\ufffd\ufffd$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1461046121005397" + "'", str11, "1461046121005397");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1954827862511726" + "'", str13, "1954827862511726");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2143339462115370" + "'", str15, "2143339462115370");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\f\ufffd\ufffd\000\ufffd\037" + "'", str17, "\001\f\ufffd\ufffd\000\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd" + "'", str21, "\002\ufffd\ufffd");
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
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
        java.lang.String str25 = rSA1.encrypt("2810229674496929");
        java.lang.String str27 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\005i\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6416682944601195542898302958" + "'", str9, "6416682944601195542898302958");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "392107475836773525556209305719" + "'", str11, "392107475836773525556209305719");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "349452705705570545001713452524" + "'", str13, "349452705705570545001713452524");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "301" + "'", str17, "301");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "42" + "'", str21, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "817735117009080902884680502698" + "'", str25, "817735117009080902884680502698");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "832891629683477830460033090859" + "'", str27, "832891629683477830460033090859");
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("321169333180800");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19" + "'", str3, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\032\ufffd\ufffd\ufffd\ufffdqqv" + "'", str7, "\006\032\ufffd\ufffd\ufffd\ufffdqqv");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
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
        java.lang.String str25 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd_");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1638419463416296" + "'", str7, "1638419463416296");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1332197564568852" + "'", str13, "1332197564568852");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffdw\022\ufffd\003j" + "'", str15, "\t\ufffdw\022\ufffd\003j");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007j~\013\034\ufffd\ufffd" + "'", str17, "\007j~\013\034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2624004021979914" + "'", str19, "2624004021979914");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "164710411857309854447413887389" + "'", str23, "164710411857309854447413887389");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "396168651817203197697502191030" + "'", str25, "396168651817203197697502191030");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
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
            java.lang.String str21 = rSA1.decrypt("\002\ufffd\ufffd*");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "392" + "'", str15, "392");
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "285187678533111610401385713912" + "'", str9, "285187678533111610401385713912");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285187678533111610401385713912" + "'", str11, "285187678533111610401385713912");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\001\u1d17\ufffdR:3m" + "'", str13, "\004\ufffd\001\u1d17\ufffdR:3m");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "516984112806652556298515043720" + "'", str15, "516984112806652556298515043720");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\003\ufffd\ufffd\ufffd\ufffd\u044dq#+" + "'", str17, "\004\ufffd\003\ufffd\ufffd\ufffd\ufffd\u044dq#+");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "17786922482661138138569866180" + "'", str19, "17786922482661138138569866180");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str13 = rSA1.decrypt("555139909713915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?<\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "113" + "'", str9, "113");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "321" + "'", str11, "321");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0014" + "'", str13, "\0014");
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
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
        java.lang.String str23 = rSA1.encrypt("258580565253484916644733070722");
        java.lang.String str25 = rSA1.encrypt("699621472359355");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd]\036\ufffd" + "'", str13, "\006\ufffd\ufffd]\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "959118063799901" + "'", str15, "959118063799901");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "432210701045116" + "'", str17, "432210701045116");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "403" + "'", str21, "403");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "483" + "'", str23, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "56" + "'", str25, "56");
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("108582244308243");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "544733639" + "'", str7, "544733639");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4706700781" + "'", str9, "4706700781");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\\\026\ufffd" + "'", str11, "\001\\\026\ufffd");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("238518633581286165489835490234");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\001\002");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\f" + "'", str3, "\f");
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547" + "'", str9, "547");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "54" + "'", str15, "54");
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
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
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "386300318181692971171813413253" + "'", str9, "386300318181692971171813413253");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n9\177\ufffd\"\ufffd\000\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\n9\177\ufffd\"\ufffd\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "397658754931482694952532426946" + "'", str13, "397658754931482694952532426946");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffdQ\t\036\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\ufffd\ufffd\ufffdQ\t\036\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
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
        java.lang.String str23 = rSA1.decrypt("1264678101");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1024384962807031" + "'", str7, "1024384962807031");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "296" + "'", str19, "296");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd" + "'", str23, "\ufffd\ufffd");
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("5693705465");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "643698281952646074252203416496" + "'", str9, "643698281952646074252203416496");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd\022\ufffd_M\fOL" + "'", str11, "\t\ufffd\ufffd\022\ufffd_M\fOL");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\026\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\026\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001U");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?U\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "569592477561122578843643595608" + "'", str9, "569592477561122578843643595608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "569592477561122578843643595608" + "'", str11, "569592477561122578843643595608");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\u0616\ufffd\ufffdM\034\ufffdb'" + "'", str13, "\n\ufffd\u0616\ufffd\ufffdM\034\ufffdb'");
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1297158510575548" + "'", str7, "1297158510575548");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1131356181471672" + "'", str13, "1131356181471672");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\036\021\ufffd\ufffd" + "'", str15, "\004\ufffd\036\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\006\ufffd\ufffd\ufffd" + "'", str17, "\002\ufffd\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "340871415550774" + "'", str19, "340871415550774");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "133270208838890078723250860114" + "'", str23, "133270208838890078723250860114");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "221203534924965581629473438948" + "'", str25, "221203534924965581629473438948");
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
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
        java.lang.String str23 = rSA1.decrypt("654");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "408601735968033905908043464218" + "'", str9, "408601735968033905908043464218");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd&;" + "'", str11, "\003\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd&;");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006r\027\177\002\ufffdvv\021I`tn" + "'", str13, "\006r\027\177\002\ufffdvv\021I`tn");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\034\ufffd\ufffd\ufffd\ufffd\"\ufffd" + "'", str19, "\034\ufffd\ufffd\ufffd\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "14102092299160585281879479258" + "'", str21, "14102092299160585281879479258");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\u032a\u06f5\ufffd" + "'", str23, "\ufffd\ufffd\u032a\u06f5\ufffd");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "618982019111803" + "'", str7, "618982019111803");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\000" + "'", str9, "\003\ufffd\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "307074371669431" + "'", str15, "307074371669431");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507" + "'", str11, "507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "539" + "'", str15, "539");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\020" + "'", str17, "\002\020");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001L" + "'", str19, "\001L");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("5627337140");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "297891044257828640504406634913" + "'", str11, "297891044257828640504406634913");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
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
        java.lang.String str21 = rSA1.encrypt("679526473072652");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "246056641988588234300799059250" + "'", str9, "246056641988588234300799059250");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246056641988588234300799059250" + "'", str11, "246056641988588234300799059250");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "722397336458138668622780661281" + "'", str15, "722397336458138668622780661281");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd2\031\027\ufffd^)f" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd2\031\027\ufffd^)f");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "394142840048213857588798352158" + "'", str21, "394142840048213857588798352158");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("458002844983530722688203208591");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "405010477266382323210136872069" + "'", str9, "405010477266382323210136872069");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("\b\ufffd\ufffdc\f\ufffd\n");
        java.lang.String str17 = rSA1.decrypt("123861012712764701167587676382");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1340669554822596" + "'", str15, "1340669554822596");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\b\024\007\026" + "'", str17, "\005\ufffd\b\024\007\026");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2230785163022008" + "'", str7, "2230785163022008");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\026\ufffd\ufffd\000" + "'", str9, "\007\026\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "703836872441739" + "'", str13, "703836872441739");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "391544324795114" + "'", str15, "391544324795114");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1270622833909481" + "'", str17, "1270622833909481");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u020c\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\u020c\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        rSA1.generateKeys(10);
        java.lang.String str5 = rSA1.encrypt("951117453409481224492126840007");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "301" + "'", str5, "301");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
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
        rSA1.generateKeys((int) ' ');
        java.lang.String str23 = rSA1.encrypt("4485337385");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "197987913012330553964299254955" + "'", str9, "197987913012330553964299254955");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "221446620890306423254807164149" + "'", str11, "221446620890306423254807164149");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\\\ufffd\ufffd\ufffd\u0252\b\ufffd\ufffd" + "'", str13, "\001\ufffd\\\ufffd\ufffd\ufffd\u0252\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\027" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\027");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "60625181133464660516267552211" + "'", str17, "60625181133464660516267552211");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "33434015930744141986668016604" + "'", str19, "33434015930744141986668016604");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "87148434" + "'", str23, "87148434");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "781295405306990" + "'", str7, "781295405306990");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1154788489683918" + "'", str13, "1154788489683918");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd" + "'", str15, "\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\u0686" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd\u0686");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1678104950543883" + "'", str19, "1678104950543883");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2775829508676097" + "'", str21, "2775829508676097");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2628616847137684" + "'", str23, "2628616847137684");
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.decrypt("429740296");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\b\ufffd\001\ufffdF0V\\\u0135k\007\ufffd" + "'", str5, "\b\ufffd\001\ufffdF0V\\\u0135k\007\ufffd");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\000\ufffd~J" + "'", str13, "\002\ufffd\000\ufffd~J");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "386442155307670" + "'", str15, "386442155307670");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\002\ufffd\ufffdS\021\ufffd" + "'", str19, "\006\ufffd\ufffd\002\ufffd\ufffdS\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\024\027\ufffd\ufffd\013" + "'", str21, "\ufffd\ufffd\ufffd\ufffd\024\027\ufffd\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\u0717\ufffd\ufffd\ufffd+" + "'", str23, "\ufffd\ufffd\u0717\ufffd\ufffd\ufffd+");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\026\ufffd\ufffd\ufffd\ufffdZ" + "'", str25, "\ufffd\ufffd\026\ufffd\ufffd\ufffd\ufffdZ");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
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
        java.lang.String str21 = rSA1.decrypt("136920345242702");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2183385652689426" + "'", str7, "2183385652689426");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd \034\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd \034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3961109574882507" + "'", str11, "3961109574882507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "304763191241231" + "'", str13, "304763191241231");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1753564771846480" + "'", str15, "1753564771846480");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd3H" + "'", str17, "\002\ufffd\ufffd\ufffd3H");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd" + "'", str21, "\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("147563026464741632979335701288");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6976412749535808206022647706" + "'", str9, "6976412749535808206022647706");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "393883838804585490570090661835" + "'", str11, "393883838804585490570090661835");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64688463170107853232321595403" + "'", str13, "64688463170107853232321595403");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\ufffdS\0053T(\007\ufffd$");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "435071936843751609634129984325" + "'", str9, "435071936843751609634129984325");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "426905927000960237568" + "'", str11, "426905927000960237568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\u0113\u03fe\ufffd\ufffd\ufffd" + "'", str13, "\003\u0113\u03fe\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "115893284921444363836909246043" + "'", str15, "115893284921444363836909246043");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
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
        java.lang.String str23 = rSA1.encrypt("1180432125");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\026\ufffd\ufffd\ufffd\ufffd\"\023\ufffd\ufffd\ufffd" + "'", str13, "\002\026\ufffd\ufffd\ufffd\ufffd\"\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5440934464" + "'", str17, "5440934464");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "448823221" + "'", str19, "448823221");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "7579968411" + "'", str21, "7579968411");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "8197712860" + "'", str23, "8197712860");
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("728807813322231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "836461964140960" + "'", str7, "836461964140960");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.encrypt("\034\ufffd\035\ufffd");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001N\020\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001N\020\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1381440160338870" + "'", str17, "1381440160338870");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        java.lang.String str11 = rSA1.encrypt("269763592171188072874299671367");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1472765444450049" + "'", str7, "1472765444450049");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "134671560264941" + "'", str9, "134671560264941");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1642401725942621" + "'", str11, "1642401725942621");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        java.lang.String str11 = rSA1.encrypt("361");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "130757323462211" + "'", str7, "130757323462211");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "655380050119156" + "'", str9, "655380050119156");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "752863007712024" + "'", str11, "752863007712024");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "278" + "'", str7, "278");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "618578824803713166766101665096" + "'", str9, "618578824803713166766101665096");
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        java.lang.String str11 = rSA1.encrypt("427796421375865321479625061985");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\f" + "'", str5, "\001\ufffd\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "142678842" + "'", str7, "142678842");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4927942745" + "'", str9, "4927942745");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1245189227" + "'", str11, "1245189227");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("350965551667387192912440934095");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1758672113953355" + "'", str7, "1758672113953355");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1064820081" + "'", str11, "1064820081");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.decrypt("431084566042046118914878654595");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\034\ufffd\r\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
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
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "273134652995080" + "'", str7, "273134652995080");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1752602238139141" + "'", str13, "1752602238139141");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100083999332340" + "'", str15, "100083999332340");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "310829769199285" + "'", str17, "310829769199285");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "41160043025865085976700921757" + "'", str23, "41160043025865085976700921757");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
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
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380204032" + "'", str11, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2146904592" + "'", str15, "2146904592");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1537511683" + "'", str17, "1537511683");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "476594986381959043710076381898" + "'", str9, "476594986381959043710076381898");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "476594986381959043710076381898" + "'", str11, "476594986381959043710076381898");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "795901947392919662620228043278" + "'", str15, "795901947392919662620228043278");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffda\025\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffda\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "571292018731275552465246732390" + "'", str19, "571292018731275552465246732390");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "42400116637624927000" + "'", str21, "42400116637624927000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "140568776351756417823526718635" + "'", str23, "140568776351756417823526718635");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        java.lang.String str17 = rSA1.encrypt("538621452366062192513302577482");
        java.lang.String str19 = rSA1.encrypt("1355731620947976");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "401325389095535" + "'", str7, "401325389095535");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "679" + "'", str11, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd-e" + "'", str15, "\002\ufffd\ufffd-e");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12178494859" + "'", str17, "12178494859");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4275127533" + "'", str19, "4275127533");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("308422204620092985527502288542");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffde\021\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffde\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "865539640625496437371330819330" + "'", str5, "865539640625496437371330819330");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "777893749612603199296750221727" + "'", str7, "777893749612603199296750221727");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\036\ufffd\030\ufffd\u05fa" + "'", str9, "\t\ufffd\ufffd\036\ufffd\030\ufffd\u05fa");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "896224831048807521334741643142" + "'", str11, "896224831048807521334741643142");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
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
        java.lang.String str23 = rSA1.decrypt("566997155835309335393979736942");
        java.lang.String str25 = rSA1.decrypt("203373233437054396104932385642");
        java.lang.String str27 = rSA1.encrypt("16016527107490745984");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "976069151155487" + "'", str7, "976069151155487");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "576472242122566" + "'", str13, "576472242122566");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\u058f" + "'", str17, "\005\ufffd\ufffd\ufffd\u058f");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd*]\003" + "'", str23, "\000\ufffd*]\003");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str25, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "5217641543" + "'", str27, "5217641543");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("397665068662727978252316658237");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1027105473805908" + "'", str7, "1027105473805908");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "319611865435947114280157207125" + "'", str15, "319611865435947114280157207125");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
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
        java.lang.String str27 = rSA1.encrypt("263726574487558");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001C" + "'", str13, "\001C");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "360" + "'", str15, "360");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "133" + "'", str17, "133");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1178924043" + "'", str21, "1178924043");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\036\ufffd2\006" + "'", str23, "\036\ufffd2\006");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Y\027\ufffd" + "'", str25, "Y\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1399666039" + "'", str27, "1399666039");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("184849045919747658886903839476");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "117760194643746688373908163047" + "'", str9, "117760194643746688373908163047");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "117760194643746688373908163047" + "'", str11, "117760194643746688373908163047");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\023\ufffd\ufffd\ufffd\t\027\ufffdn\032\ufffd\ufffd" + "'", str13, "\023\ufffd\ufffd\ufffd\t\027\ufffdn\032\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd.f" + "'", str17, "\007\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd.f");
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.decrypt("6647907366");
        java.lang.String str15 = rSA1.encrypt("1682803771672384");
        java.lang.String str17 = rSA1.encrypt("528758607313524312090196940326");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "112939940791256599607607098048" + "'", str9, "112939940791256599607607098048");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "271728315922354812415376456226" + "'", str11, "271728315922354812415376456226");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd'G\017\ufffd\ufffd\ufffd\ufffd\ufffdC" + "'", str13, "\f\ufffd'G\017\ufffd\ufffd\ufffd\ufffd\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "372511527866120257326944832092" + "'", str15, "372511527866120257326944832092");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "148037578304905952870027130484" + "'", str17, "148037578304905952870027130484");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("217350032881712580388225702236");
        java.lang.String str21 = rSA1.decrypt("2829873940319468");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1903016610717710" + "'", str7, "1903016610717710");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "708980890069868" + "'", str13, "708980890069868");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\312" + "'", str15, "\001\ufffd\ufffd\ufffd\312");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffdF\026\ufffd]\f\ufffd\ufffdl" + "'", str19, "\ufffdF\026\ufffd]\f\ufffd\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("3836305984");
        java.lang.String str17 = rSA1.encrypt("\002\b\003\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\005\u87fa\ufffd\031\ufffd\037\r\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "108269345277298026466912437227" + "'", str9, "108269345277298026466912437227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "79572426430431621368016873551" + "'", str11, "79572426430431621368016873551");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001#" + "'", str15, "\001#");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "295" + "'", str17, "295");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "148" + "'", str19, "148");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("410");
        java.lang.String str13 = rSA1.encrypt("\004\004\ufffd\ufffd\u03bd\ufffd\u5c1c\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "246293123346164963832401838855" + "'", str9, "246293123346164963832401838855");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40017971597836857344" + "'", str11, "40017971597836857344");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "518965384600895567573453936590" + "'", str13, "518965384600895567573453936590");
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd<\013\ufffd\024\f\ufffd\021");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str9 = rSA1.decrypt("1188802795402547");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\017\ufffd8\177\u0122" + "'", str3, "\004\017\ufffd8\177\u0122");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2064479451703496" + "'", str5, "2064479451703496");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<" + "'", str9, "<");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\035\ufffd\ufffd\ufffd\ufffd\024\ufffd\ufffd" + "'", str11, "\035\ufffd\ufffd\ufffd\ufffd\024\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "11515618228571050353933613545" + "'", str13, "11515618228571050353933613545");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "914360819939465540034429693" + "'", str15, "914360819939465540034429693");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("730903677901316255479995383411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007\ufffd\u786dZ)" + "'", str3, "\007\ufffd\u786dZ)");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1458076471606176" + "'", str5, "1458076471606176");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1305918418878359" + "'", str7, "1305918418878359");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffdEl\r {" + "'", str9, "\006\ufffdEl\r {");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2444301719097597" + "'", str11, "2444301719097597");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "53899887454151379752085401802" + "'", str15, "53899887454151379752085401802");
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
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
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001#" + "'", str15, "\001#");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0020" + "'", str17, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\023" + "'", str19, "\001\023");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("3355576328");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4773377534" + "'", str3, "4773377534");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\n\ufffd" + "'", str5, "\001\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2922261100" + "'", str7, "2922261100");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.decrypt("553535743006153129855274469250");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffdPz");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\t\ufffd\ufffd\ufffd\031\ufffd\ufffd<" + "'", str9, "\002\ufffd\t\ufffd\ufffd\ufffd\031\ufffd\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "636752315423699856368673309637" + "'", str13, "636752315423699856368673309637");
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("1629935995");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "592417126194095974003414875526" + "'", str9, "592417126194095974003414875526");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffdC\002\ufffd\\\037" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffdC\002\ufffd\\\037");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\022\ufffd\310\ufffd\ufffdQ\024\ufffdv" + "'", str13, "\001\ufffd\022\ufffd\310\ufffd\ufffdQ\024\ufffdv");
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "365798311483268764631318647834" + "'", str9, "365798311483268764631318647834");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "235585668197001417494991070011" + "'", str11, "235585668197001417494991070011");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "106196728087020674353374184536" + "'", str13, "106196728087020674353374184536");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\u04f4\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\t\ufffd\ufffd\u04f4\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "328422734822519773337364703881" + "'", str17, "328422734822519773337364703881");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "372339898079528390935502094383" + "'", str19, "372339898079528390935502094383");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\0354\003\ufffd\ufffd" + "'", str21, "\005\ufffd\ufffd\ufffd\ufffd\0354\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "231999523719438853573834756180" + "'", str23, "231999523719438853573834756180");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("624");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002" + "'", str11, "\002");
    }
}
