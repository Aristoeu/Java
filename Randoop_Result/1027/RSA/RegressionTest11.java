package RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("363904346928259064880157652878");
        java.lang.String str13 = rSA1.encrypt("2561181311805737");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "243" + "'", str9, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "342" + "'", str11, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "493" + "'", str13, "493");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        rSA1.generateKeys(10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffdt\177\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\f\ufffdt\177\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd3K\002\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd3K\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "275" + "'", str9, "275");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("3844015076");
        java.lang.String str15 = rSA1.encrypt("74853551270143319640802282643");
        java.lang.String str17 = rSA1.encrypt("\004\ufffd\ufffd\u34db\021\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\004\ufffddu\032\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?T?du??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "952676722357413" + "'", str7, "952676722357413");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2558088132471591" + "'", str15, "2558088132471591");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "801403615096911" + "'", str17, "801403615096911");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
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
        java.lang.String str23 = rSA1.encrypt("987858896469436");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "979542058949404" + "'", str7, "979542058949404");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "362797056" + "'", str13, "362797056");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "124353769460219847357923838593" + "'", str17, "124353769460219847357923838593");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "236733932337043937189748068307" + "'", str19, "236733932337043937189748068307");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3140358001984" + "'", str21, "3140358001984");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "127582117026673885336535973949" + "'", str23, "127582117026673885336535973949");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1473699414452045" + "'", str7, "1473699414452045");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "148" + "'", str15, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\021" + "'", str17, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "102" + "'", str19, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "336" + "'", str23, "336");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        java.lang.String str15 = rSA1.decrypt("192569224470580183531005309777");
        java.lang.String str17 = rSA1.decrypt("332878761705464188673359881647");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "676377905888930513800855839459" + "'", str11, "676377905888930513800855839459");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\002\ufffd\002\ufffdb5t-" + "'", str13, "\007\ufffd\002\ufffd\002\ufffdb5t-");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffdq\001\ufffd\ufffd\u038762" + "'", str15, "\007\ufffdq\001\ufffd\ufffd\u038762");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0069B\032\ufffd\u0474\ufffd" + "'", str17, "\0069B\032\ufffd\u0474\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "224314702663206676817662075968" + "'", str9, "224314702663206676817662075968");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "76781069074810191560394059658" + "'", str11, "76781069074810191560394059658");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.decrypt("297273516923851");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "182595027026236567665607853661" + "'", str3, "182595027026236567665607853661");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\001\\\ufffd\ufffd\024\ufffdc~r\000" + "'", str5, "\000\ufffd\001\\\ufffd\ufffd\024\ufffdc~r\000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffdst{_\003*" + "'", str7, "\005\ufffd\ufffd\ufffd\ufffdst{_\003*");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "711321009201671" + "'", str7, "711321009201671");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3184818448674285" + "'", str13, "3184818448674285");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\t\ufffd\u038a" + "'", str15, "\006\t\ufffd\u038a");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013\023\t\ufffd\b\033;" + "'", str17, "\013\023\t\ufffd\b\033;");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "709354187396623" + "'", str19, "709354187396623");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1327407631723473" + "'", str21, "1327407631723473");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("460290203420997373753530609873");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\034" + "'", str7, "\034");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "369" + "'", str9, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("1204620642");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\023\ufffd\r\ufffd\u028d\n" + "'", str11, "\002\ufffd\ufffd\ufffd\023\ufffd\r\ufffd\u028d\n");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdfY" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdfY");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\017\ufffd\ufffd\017\ufffd\177\ufffd\ufffd" + "'", str17, "\017\ufffd\ufffd\017\ufffd\177\ufffd\ufffd");
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("110437653753293");
        java.lang.String str9 = rSA1.decrypt("19513538879382774566429914688");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "230" + "'", str3, "230");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "440120570493268031642191757259" + "'", str7, "440120570493268031642191757259");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffdo\366\ufffd1\007\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffdo\366\ufffd1\007\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
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
        java.lang.String str23 = rSA1.encrypt("2201481331121055");
        java.lang.String str25 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "829046119212345300968719834830" + "'", str9, "829046119212345300968719834830");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\032\ufffd2" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\032\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40889267365468242910359694029" + "'", str13, "40889267365468242910359694029");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\u0259\ufffd\ufffd\r\ufffd" + "'", str15, "\001\ufffd\ufffd\u0259\ufffd\ufffd\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "197153289294764111495298202019" + "'", str17, "197153289294764111495298202019");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3747309905947842952384488561" + "'", str21, "3747309905947842952384488561");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "15953467174982082995901714104" + "'", str23, "15953467174982082995901714104");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "5401409306261217990011890303" + "'", str25, "5401409306261217990011890303");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("75472562827089017340799555154");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\005\ufffd\036\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\021\ufffda\037\ufffd" + "'", str3, "\001\021\ufffda\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3138544005987562" + "'", str5, "3138544005987562");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1331897391844977" + "'", str7, "1331897391844977");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1108344991014722" + "'", str9, "1108344991014722");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        java.lang.String str17 = rSA1.encrypt("3264782225");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "588685990398531" + "'", str7, "588685990398531");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1605952175880218" + "'", str13, "1605952175880218");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffdk~M&" + "'", str15, "\002\ufffd\ufffdk~M&");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "195160141679646" + "'", str17, "195160141679646");
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("703037567");
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffdO\030\ufffd\ufffd\ufffdmj" + "'", str15, "\ufffdO\030\ufffd\ufffd\ufffdmj");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "974893299216530036297456057222" + "'", str9, "974893299216530036297456057222");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\026\ufffd\023\ufffd\ufffd\ufffd\ufffd\006t" + "'", str11, "\006\026\ufffd\023\ufffd\ufffd\ufffd\ufffd\006t");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "957043294646279868366634625404" + "'", str13, "957043294646279868366634625404");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\177\ufffd\ufffd\032\ufffd" + "'", str15, "\005\ufffd\177\ufffd\ufffd\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "243125940370807565255318859235" + "'", str17, "243125940370807565255318859235");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20342640389029547384341734681" + "'", str21, "20342640389029547384341734681");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2994362625666262251994235818" + "'", str23, "2994362625666262251994235818");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("\004e1\036\ufffd\ufffd\ufffd\ufffd_\"\ufffd");
        java.lang.String str19 = rSA1.encrypt("1037546025844877");
        java.lang.String str21 = rSA1.encrypt("700617066464625422168779659806");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7669837226762024485422628826" + "'", str9, "7669837226762024485422628826");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "429891056315252352752307738949" + "'", str11, "429891056315252352752307738949");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "200555846466472289767396812627" + "'", str13, "200555846466472289767396812627");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "457" + "'", str17, "457");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "319" + "'", str19, "319");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "482" + "'", str21, "482");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("178");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2357261626136237" + "'", str11, "2357261626136237");
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("423");
        java.lang.String str5 = rSA1.encrypt("825");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        java.lang.String str15 = rSA1.encrypt("5613811618");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "587" + "'", str9, "587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!" + "'", str13, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        java.lang.String str17 = rSA1.decrypt("285094131110099573481526081520");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?jX?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\034\ufffd\ufffd\ufffd" + "'", str15, "\b\ufffd\034\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
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
        java.lang.String str23 = rSA1.encrypt("\002\ufffd\ufffd\021\ufffd\ufffd\ufffd]");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1147342102663649" + "'", str7, "1147342102663649");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "281" + "'", str15, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "77" + "'", str23, "77");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.encrypt("2372308538763998");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004+Y" + "'", str3, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004+Y");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3938980639167" + "'", str5, "3938980639167");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214412226867191101198886477529" + "'", str7, "214412226867191101198886477529");
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\001\034\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???X?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1276810628707337" + "'", str7, "1276810628707337");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\036\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\036\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "588485256194317" + "'", str11, "588485256194317");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "959390147354936" + "'", str13, "959390147354936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1347625631497367" + "'", str15, "1347625631497367");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "635728038254182" + "'", str17, "635728038254182");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
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
        java.lang.String str23 = rSA1.encrypt("446255588935293837675114668863");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "166134699261440957836995934147" + "'", str9, "166134699261440957836995934147");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "166134699261440957836995934147" + "'", str11, "166134699261440957836995934147");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "341130286343681313445565172290" + "'", str15, "341130286343681313445565172290");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "484125525773016895122994698126" + "'", str21, "484125525773016895122994698126");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "428227565039077097845662358434" + "'", str23, "428227565039077097845662358434");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.encrypt("\034\ufffd\035\ufffd");
        java.lang.String str19 = rSA1.decrypt("163164840797447973266066395758");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "509565817166015438514491988086" + "'", str9, "509565817166015438514491988086");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "413143145273789915823090554709" + "'", str11, "413143145273789915823090554709");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\n\ufffdZ33L" + "'", str15, "\t\n\ufffdZ33L");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2525815924308981" + "'", str17, "2525815924308981");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\"V\035\021\ufffd}" + "'", str19, "\002\"V\035\021\ufffd}");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
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
        java.math.BigInteger bigInteger36 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger37 = rSA1.encrypt(bigInteger36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1555512685111859" + "'", str7, "1555512685111859");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "463" + "'", str21, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001?" + "'", str23, "\001?");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "498" + "'", str27, "498");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "430268376987206969210319842686" + "'", str31, "430268376987206969210319842686");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "206787685857498389976725112639" + "'", str33, "206787685857498389976725112639");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "39183804014235476519842840909" + "'", str35, "39183804014235476519842840909");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "507174087587606984321165665759" + "'", str9, "507174087587606984321165665759");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507174087587606984321165665759" + "'", str11, "507174087587606984321165665759");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdA" + "'", str13, "\013\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "118489389705345013438353873179" + "'", str15, "118489389705345013438353873179");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\u0420\ufffd\035\022i\031\ufffd\ufffd" + "'", str21, "\005\u0420\ufffd\035\022i\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "673" + "'", str27, "673");
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.decrypt("5602292640");
        java.lang.String str19 = rSA1.decrypt("366154344527638");
        java.lang.String str21 = rSA1.decrypt("45746406303606178912292924957");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "412053443493957183580184904110" + "'", str9, "412053443493957183580184904110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "76875457446493407771796062551" + "'", str11, "76875457446493407771796062551");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffda\r\ufffd:Jm\b\002\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffda\r\ufffd:Jm\b\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdt" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\037\ufffdL\n\ufffd=w=-/" + "'", str17, "\003\ufffd\037\ufffdL\n\ufffd=w=-/");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffdNf\002\ufffd9\024\ufffd\ufffd" + "'", str19, "\002\ufffdNf\002\ufffd9\024\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\021\025\ufffd\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\021\025\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\013\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "102016844409062" + "'", str7, "102016844409062");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2050037390344329" + "'", str13, "2050037390344329");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("2183500682712619");
        java.lang.String str15 = rSA1.encrypt("3555131614");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2014830867" + "'", str7, "2014830867");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27410670469158797020650874818" + "'", str13, "27410670469158797020650874818");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30431968321004781765636352560" + "'", str15, "30431968321004781765636352560");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "l" + "'", str7, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "247" + "'", str9, "247");
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("887836866708316");
        java.lang.String str19 = rSA1.decrypt("570");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "349509272748507448098991091554" + "'", str9, "349509272748507448098991091554");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\r\ufffd\ufffds" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\r\ufffd\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88638193188866845071594874023" + "'", str13, "88638193188866845071594874023");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001#\027\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\001#\027\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "493119229207537320535795574727" + "'", str17, "493119229207537320535795574727");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\035i4j|" + "'", str19, "\003\ufffd\ufffd\ufffd\ufffd\035i4j|");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.encrypt("147127730644432778532779330245");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\ufffd\ufffd\ufffd" + "'", str3, "\t\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1524217899199330" + "'", str5, "1524217899199330");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1632486383706842" + "'", str7, "1632486383706842");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2665643831408131" + "'", str9, "2665643831408131");
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.encrypt("188056847977118301724067984843");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\u06ca\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??>???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\007" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "621781203382977" + "'", str5, "621781203382977");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1042850883951190" + "'", str7, "1042850883951190");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\026\ufffd\005" + "'", str11, "\001\ufffd\026\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "304040810918266" + "'", str13, "304040810918266");
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("100935160444972936488645408652");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\030\ufffd<s\033\ufffd\u05b4\ufffd\ufffd" + "'", str7, "\004\ufffd\ufffd\030\ufffd<s\033\ufffd\u05b4\ufffd\ufffd");
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1106731025105476" + "'", str7, "1106731025105476");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "465" + "'", str19, "465");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "495" + "'", str21, "495");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("1603037267069329");
        java.lang.String str15 = rSA1.encrypt("1602403727");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "988089737857778" + "'", str7, "988089737857778");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3950004559" + "'", str13, "3950004559");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4508745664" + "'", str15, "4508745664");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "664786288323832196629651803414" + "'", str9, "664786288323832196629651803414");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.decrypt("208");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("671405300578467582984498213176");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "48" + "'", str7, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "~\020\u0475\027\ufffd\ufffd\ufffd\007\ufffd" + "'", str11, "~\020\u0475\027\ufffd\ufffd\ufffd\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd&\001" + "'", str17, "\007\ufffd\ufffd\ufffd\ufffd\ufffd&\001");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "667726712880957" + "'", str7, "667726712880957");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\u07df" + "'", str9, "\003\u07df");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1380502524610134" + "'", str11, "1380502524610134");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2163420516959304" + "'", str13, "2163420516959304");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1896440043288691" + "'", str15, "1896440043288691");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\027\ufffd|@");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16620928634085" + "'", str7, "16620928634085");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1680590353100253" + "'", str13, "1680590353100253");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1636837777910479" + "'", str15, "1636837777910479");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
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
        java.lang.String str21 = rSA1.decrypt("257");
        java.lang.String str23 = rSA1.decrypt("349784803459623516822302510937");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr" + "'", str11, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "508035666242496817839753946227" + "'", str15, "508035666242496817839753946227");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "145972399468661906422751429033" + "'", str17, "145972399468661906422751429033");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "655069156430039145394066574126" + "'", str19, "655069156430039145394066574126");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004(\b\ufffd<\004S\017\ufffd\ufffd\ufffdq" + "'", str21, "\004(\b\ufffd<\004S\017\ufffd\ufffd\ufffdq");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\003\ufffd\001\ufffd\013\ufffd\ufffd+" + "'", str23, "\001\ufffd\003\ufffd\001\ufffd\013\ufffd\ufffd+");
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("7320283309");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12162182347" + "'", str3, "12162182347");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffdJ4:" + "'", str5, "\001\ufffdJ4:");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        java.lang.String str7 = rSA1.decrypt("1480332030624002");
        java.lang.String str9 = rSA1.decrypt("1308742942572266");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002?" + "'", str9, "\002?");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("58143851088687047188552923988");
        java.lang.String str13 = rSA1.decrypt("602366166336715968353260597067");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "88515537603283950982606438861" + "'", str17, "88515537603283950982606438861");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "103856807821863503763443713978" + "'", str19, "103856807821863503763443713978");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\t\ufffd\022\ufffd\ufffd" + "'", str21, "\006\ufffd\t\ufffd\022\ufffd\ufffd");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("5447816862");
        java.lang.String str11 = rSA1.encrypt("895208255");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\007\ufffdDs=o[");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??Ds=o[\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(100);
        java.lang.String str7 = rSA1.decrypt("553");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\u06ba\fI\025\ufffd\ufffd\ufffd" + "'", str7, "\004\ufffd\ufffd\ufffd\u06ba\fI\025\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.decrypt("775523633993418");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "218" + "'", str9, "218");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "604" + "'", str11, "604");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "/" + "'", str13, "/");
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
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
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "51679286756459812968934259046" + "'", str9, "51679286756459812968934259046");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffdq\007\ufffd\ufffd\ufffdg" + "'", str11, "\ufffdq\007\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "539032328828013878563129101764" + "'", str13, "539032328828013878563129101764");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "29" + "'", str19, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "161" + "'", str21, "161");
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("75472562827089017340799555154");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\ufffd\177\ufffdu?" + "'", str3, "\b\ufffd\ufffd\177\ufffdu?");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1362612251883118" + "'", str5, "1362612251883118");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "239250940110808" + "'", str7, "239250940110808");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1188938599611521" + "'", str9, "1188938599611521");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.decrypt("28100933696926471903600515426");
        java.lang.String str19 = rSA1.decrypt("154");
        java.lang.String str21 = rSA1.encrypt("113651514831272089995192591195");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffds\360\ufffd" + "'", str15, "\000\ufffds\360\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\b\025\177\ufffda" + "'", str19, "\002\ufffd\b\025\177\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1706871360322448" + "'", str21, "1706871360322448");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
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
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "301255466684531739503300221293" + "'", str9, "301255466684531739503300221293");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1850983104540879877090271543" + "'", str11, "1850983104540879877090271543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "746786257190449" + "'", str7, "746786257190449");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd`e" + "'", str9, "\ufffd\ufffd\ufffd`e");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1548526339929021" + "'", str11, "1548526339929021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\006\ufffd " + "'", str13, "\001\ufffd\006\ufffd ");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("78487019142441916661670426960");
        java.lang.String str11 = rSA1.decrypt("2887182458725638");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\004$|\033\ufffd\t\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?$|?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "950107149" + "'", str5, "950107149");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "583203817" + "'", str7, "583203817");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\016" + "'", str9, "\ufffd\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\ufffd" + "'", str11, "\n\ufffd\ufffd");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
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
        java.lang.String str23 = rSA1.encrypt("\002\ufffd\ufffd\021\ufffd\ufffd\ufffd]");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1955061095502081" + "'", str7, "1955061095502081");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "632" + "'", str15, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "261" + "'", str23, "261");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035" + "'", str7, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1010118626336836" + "'", str11, "1010118626336836");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1473468588481963" + "'", str13, "1473468588481963");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "303458982956038" + "'", str15, "303458982956038");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "732488362455210399584096672082" + "'", str19, "732488362455210399584096672082");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t\r\ufffd\ufffd}\002\ufffd\ufffd\ufffd" + "'", str21, "\t\r\ufffd\ufffd}\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\ufffd\ufffdoT\005\ufffd\ufffd\ufffd\ufffdN" + "'", str23, "\005\ufffd\ufffdoT\005\ufffd\ufffd\ufffd\ufffdN");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
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
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\016\ufffd\r" + "'", str13, "\b\ufffd\ufffd\016\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3047755284623850" + "'", str15, "3047755284623850");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "661910859979735" + "'", str17, "661910859979735");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2463480699172083" + "'", str19, "2463480699172083");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2794600499176008" + "'", str21, "2794600499176008");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1215000505783469" + "'", str23, "1215000505783469");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\004\ufffd\023\ufffd\ufffd\017\013" + "'", str25, "\004\ufffd\023\ufffd\ufffd\017\013");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("2279400941187448");
        java.lang.String str15 = rSA1.encrypt("2339068862822151");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("2642759235654111");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "566151205328758" + "'", str7, "566151205328758");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "97642172948990188072214931067" + "'", str13, "97642172948990188072214931067");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "128230569628032576184724501365" + "'", str15, "128230569628032576184724501365");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "889330617088105569063260062209" + "'", str19, "889330617088105569063260062209");
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??s?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1379231641524080" + "'", str7, "1379231641524080");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffdu\024\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffdu\024\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u026d\ufffd\ufffd\ufffd\n\ufffd\ufffd" + "'", str13, "\005\u026d\ufffd\ufffd\ufffd\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "689" + "'", str17, "689");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "608" + "'", str19, "608");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("5447816862");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "N" + "'", str9, "N");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.encrypt("5799003948");
        java.lang.String str7 = rSA1.decrypt("4747158113");
        java.lang.String str9 = rSA1.decrypt("541080546688817559591567168106");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "633977880454564771610809550732" + "'", str3, "633977880454564771610809550732");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "430022093406707317269109629578" + "'", str5, "430022093406707317269109629578");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\u07ad\ufffd\u061e>\002" + "'", str7, "\t\ufffd\ufffd\ufffd\ufffd\u07ad\ufffd\u061e>\002");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013\177\177\ufffdpl\035f\b\032/0\034" + "'", str9, "\013\177\177\ufffdpl\035f\b\032/0\034");
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "308" + "'", str13, "308");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "384001166" + "'", str17, "384001166");
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str15 = rSA1.encrypt("\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "139661094833069439585810111095" + "'", str9, "139661094833069439585810111095");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\u04a7\ufffd\ufffd\ufffd\ufffd\030" + "'", str11, "\005\ufffd\ufffd\ufffd\u04a7\ufffd\ufffd\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\r\177\ufffd\ufffd\ufffddO\"" + "'", str13, "\006\ufffd\r\177\ufffd\ufffd\ufffddO\"");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "458532795735048239720255128701" + "'", str15, "458532795735048239720255128701");
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
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
        java.lang.String str21 = rSA1.decrypt("104500621909331296494924954273");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1409581204737030" + "'", str7, "1409581204737030");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\000\ufffd~MB$" + "'", str9, "\004\000\ufffd~MB$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507731934536207" + "'", str11, "507731934536207");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "496879807381713" + "'", str13, "496879807381713");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "71566458183639" + "'", str15, "71566458183639");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1252913476352652" + "'", str17, "1252913476352652");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "664633667368529" + "'", str19, "664633667368529");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\037\ufffd%" + "'", str21, "\002\ufffd\ufffd\037\ufffd%");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        java.lang.String str5 = rSA1.decrypt("470");
        java.lang.String str7 = rSA1.decrypt("2734162466562393");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001y" + "'", str5, "\001y");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23887872" + "'", str3, "23887872");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21717639" + "'", str5, "21717639");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("507735161454502401211578520289");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19492906946806733112278170111" + "'", str9, "19492906946806733112278170111");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "443557471027960316687611593798" + "'", str11, "443557471027960316687611593798");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\f\ufffd\ufffd\ufffd\020" + "'", str17, "\f\ufffd\ufffd\ufffd\020");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("463");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\"\ufffd_" + "'", str3, "\005\ufffd\ufffd\"\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "474929751355999" + "'", str5, "474929751355999");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "777187117052322" + "'", str7, "777187117052322");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffdE\025\ufffd\007" + "'", str9, "\006\ufffdE\025\ufffd\007");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("451850837066694558586623217114");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71001237773900607657272119653" + "'", str9, "71001237773900607657272119653");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "71001237773900607657272119653" + "'", str11, "71001237773900607657272119653");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1499415905690794" + "'", str7, "1499415905690794");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffdgLB{B" + "'", str9, "\003\ufffdgLB{B");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.decrypt("570514976048732924728282873013");
        java.lang.String str17 = rSA1.decrypt("3287111037");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "262577963162452738547764768245" + "'", str11, "262577963162452738547764768245");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004X\177\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffdv" + "'", str15, "\004X\177\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\005\002\ufffd\ufffd\r\177");
        java.lang.String str15 = rSA1.encrypt("4980435325");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\004\ufffd\ufffd\024\ufffd\ufffd\ufffd\b\ufffde");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1673322000029828" + "'", str7, "1673322000029828");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\032W" + "'", str11, "\ufffd\032W");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "165769648" + "'", str13, "165769648");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1138544363" + "'", str15, "1138544363");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("728807813322231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\002\ufffd\037\ufffd\ufffd\ufffd\ufffd\177\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1576447670199587" + "'", str7, "1576447670199587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.encrypt("182896684412517005977800507579");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\005\036\ufffd\ufffd\ufffd\003\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\027" + "'", str5, "\027");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "502" + "'", str7, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7" + "'", str11, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "227" + "'", str13, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "31539901229182438006487846313" + "'", str17, "31539901229182438006487846313");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007;\n\ufffdJg\031J\017\ufffdV" + "'", str15, "\007;\n\ufffdJg\031J\017\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "508" + "'", str19, "508");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys(100);
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("73073083040888118419040653382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\006C\r\ufffd\ufffd\ufffd\ufffd\033\ufffd\000");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?C??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd" + "'", str5, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3596504059" + "'", str7, "3596504059");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2327677229" + "'", str9, "2327677229");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "121" + "'", str15, "121");
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "478681592389502562834674637319" + "'", str9, "478681592389502562834674637319");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\031" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "398861260631873477083203928999" + "'", str13, "398861260631873477083203928999");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12965768513736791442540318394" + "'", str15, "12965768513736791442540318394");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
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
        java.lang.String str27 = rSA1.decrypt("222879794198403226277948183912");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "49413532418377494934763090699" + "'", str9, "49413532418377494934763090699");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\021\ufffd\ufffd\ufffd\037\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\021\ufffd\ufffd\ufffd\037\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "309060512529359254506659186946" + "'", str13, "309060512529359254506659186946");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "585667305522956087646982457497" + "'", str15, "585667305522956087646982457497");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "352087482085283632152500082228" + "'", str17, "352087482085283632152500082228");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\037\ufffdr" + "'", str19, "\006\ufffd\ufffd\ufffd\037\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "392258014184006667613343968440" + "'", str21, "392258014184006667613343968440");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "494314715748491005447028555589" + "'", str23, "494314715748491005447028555589");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\002\ufffd\ufffd\002\ufffd\u014e\ufffd\ufffd\025\031a" + "'", str27, "\002\ufffd\ufffd\002\ufffd\u014e\ufffd\ufffd\025\031a");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\005\004\ufffd\002\u026af");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????f\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "199725830903948183879344185467" + "'", str9, "199725830903948183879344185467");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "160627973515048824058071035384" + "'", str11, "160627973515048824058071035384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "839474018283493" + "'", str15, "839474018283493");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\t" + "'", str17, "\ufffd\ufffd\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "968310305600851" + "'", str19, "968310305600851");
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
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
        java.lang.String str27 = rSA1.encrypt("497706564873384989901006103302");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1267210747183544" + "'", str7, "1267210747183544");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\f\ufffd\ufffd\ufffd\ufffd6" + "'", str15, "\f\ufffd\ufffd\ufffd\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "461" + "'", str19, "461");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "317398495007864118028617900018" + "'", str23, "317398495007864118028617900018");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "333913193004283468877994761300" + "'", str25, "333913193004283468877994761300");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "7405547081749214406524231697" + "'", str27, "7405547081749214406524231697");
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("138985947564462492432526127832");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "787282248271601536805220040966" + "'", str9, "787282248271601536805220040966");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd(\r\021\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\ufffd(\r\021\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "429102269413709669727308040490" + "'", str13, "429102269413709669727308040490");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\007\ufffd\177\ufffd\u0308\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\007\ufffd\177\ufffd\u0308\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9803525704089304596289793793" + "'", str17, "9803525704089304596289793793");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("2185141852737318");
        java.lang.String str13 = rSA1.encrypt("317");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001G\013\030\ufffd\ufffd\ufffd\ufffdsP'" + "'", str11, "\001G\013\030\ufffd\ufffd\ufffd\ufffdsP'");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "206480909220261471049940922898" + "'", str13, "206480909220261471049940922898");
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "435586077314997274507409932268" + "'", str9, "435586077314997274507409932268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17283664686051533364786890296" + "'", str11, "17283664686051533364786890296");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffdhN\t\035\ufffd\ufffd\ufffd{" + "'", str13, "\002\ufffd\ufffdhN\t\035\ufffd\ufffd\ufffd{");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "322452700597002579587004486784" + "'", str15, "322452700597002579587004486784");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
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
        java.lang.String str21 = rSA1.decrypt("2195508674068547");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "274164472600066" + "'", str7, "274164472600066");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd-],\004" + "'", str9, "\002\ufffd\ufffd-],\004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "395545576437395" + "'", str11, "395545576437395");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "724089122098505" + "'", str13, "724089122098505");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1234491142942544" + "'", str15, "1234491142942544");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "583382351975947" + "'", str17, "583382351975947");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n0\004\ufffdrP1" + "'", str21, "\n0\004\ufffdrP1");
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("806729601483697513872336243167");
        java.lang.String str5 = rSA1.decrypt("4942163606");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\004\ufffd\ufffd\033\ufffd\ufffd\ufffd\016\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?H??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd:R\025\ufffd\ufffd\ufffdu" + "'", str3, "\006\ufffd:R\025\ufffd\ufffd\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdO" + "'", str5, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdO");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("520114314410818623717816048857");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4407811086" + "'", str3, "4407811086");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2376226427" + "'", str7, "2376226427");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1313499984" + "'", str9, "1313499984");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\u0227" + "'", str13, "\002\ufffd\u0227");
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("1028071702528");
        java.lang.String str19 = rSA1.encrypt("159612991184791823106482181472");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1226120989542713" + "'", str7, "1226120989542713");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1047151082962112" + "'", str13, "1047151082962112");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "148" + "'", str19, "148");
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.encrypt("2100449234");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\f\ufffd\034" + "'", str5, "\000\ufffd\f\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "253862309989903209742705149808" + "'", str9, "253862309989903209742705149808");
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdx");
        java.lang.String str15 = rSA1.encrypt("621");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "965117646484842" + "'", str7, "965117646484842");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "768238289" + "'", str13, "768238289");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2035507669" + "'", str15, "2035507669");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\u049f-");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1981355655168" + "'", str3, "1981355655168");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1690522737399" + "'", str5, "1690522737399");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "96548518294559381083942524555" + "'", str7, "96548518294559381083942524555");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("1112473507598001");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001F\022\ufffd\327\013\ufffd\021\ufffd/a" + "'", str13, "\001F\022\ufffd\327\013\ufffd\021\ufffd/a");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.encrypt("4298658708");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "692960028169273243357378644326" + "'", str9, "692960028169273243357378644326");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "600918907953978979245253282021" + "'", str11, "600918907953978979245253282021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "772752359230290560508050723594" + "'", str13, "772752359230290560508050723594");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "322705804236009556731068601053" + "'", str15, "322705804236009556731068601053");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.encrypt("702947451550003778719770877111");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ud8de\udc8d\u015d");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "480320919648289" + "'", str7, "480320919648289");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\253\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\253\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\026" + "'", str11, "\002\ufffd\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "591927948093251" + "'", str13, "591927948093251");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("1743865898247515");
        java.lang.String str7 = rSA1.decrypt("6418890400");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4662281220" + "'", str3, "4662281220");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\004jqN" + "'", str7, "\003\004jqN");
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
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
        java.lang.String str21 = rSA1.encrypt("78364164096");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "452263614481030364492167577859" + "'", str9, "452263614481030364492167577859");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "D\033\ufffd\ufffd" + "'", str13, "D\033\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1229966030685894" + "'", str15, "1229966030685894");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1337866775201006" + "'", str17, "1337866775201006");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "800" + "'", str21, "800");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.encrypt("2994536589");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "109763307470335845821417198938" + "'", str9, "109763307470335845821417198938");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2388907372032" + "'", str11, "2388907372032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "480152426046457340602792017129" + "'", str13, "480152426046457340602792017129");
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("277");
        java.lang.String str5 = rSA1.encrypt("2724571176865586");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "156" + "'", str3, "156");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "485" + "'", str5, "485");
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
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
        java.lang.String str25 = rSA1.decrypt("447");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2368992258387718" + "'", str7, "2368992258387718");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\nK\025\ufffd\ufffd\031\ufffd" + "'", str15, "\nK\025\ufffd\ufffd\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "29" + "'", str19, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "399" + "'", str21, "399");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\007" + "'", str23, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd" + "'", str25, "\000\ufffd");
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
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
        java.lang.String str23 = rSA1.decrypt("1094491894308185");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd9\020\000\ufffd" + "'", str13, "\005\ufffd9\020\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1449974378945927" + "'", str15, "1449974378945927");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "903820055336275" + "'", str17, "903820055336275");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1258719753171751" + "'", str19, "1258719753171751");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "427022654210542" + "'", str21, "427022654210542");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\u02b1\ufffd" + "'", str23, "\001\ufffd\u02b1\ufffd");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
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
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "229254893085156305579142860228" + "'", str9, "229254893085156305579142860228");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\"\u0703\ufffd`\016" + "'", str11, "\004\ufffd\ufffd\"\u0703\ufffd`\016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "113047060049528988469004163516" + "'", str13, "113047060049528988469004163516");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "440246130581804" + "'", str17, "440246130581804");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\"\ufffd\u057e\ufffd\ufffd" + "'", str19, "\007\"\ufffd\u057e\ufffd\ufffd");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "642384111544779" + "'", str13, "642384111544779");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\001\ufffd\ufffd\"\ufffd" + "'", str15, "\005\001\ufffd\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "545797105301245104213761534882" + "'", str19, "545797105301245104213761534882");
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\000\ufffdL\024\ufffd\ufffd\ufffd>\032");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("673446834879694395538250792567");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "159749274159367404537993764817" + "'", str11, "159749274159367404537993764817");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "109" + "'", str15, "109");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.encrypt("315");
        java.lang.String str15 = rSA1.encrypt("581316892255132158528187087758");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37761701459156484237" + "'", str13, "37761701459156484237");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "263604668988736656991185779123" + "'", str15, "263604668988736656991185779123");
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        java.lang.String str15 = rSA1.decrypt("297037574156103209447213891242");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd^\013\t\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd^\013\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\017\ufffd\000\ufffd\ufffd(;.B" + "'", str13, "\n\ufffd\017\ufffd\000\ufffd\ufffd(;.B");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("432268551667889026451279149775");
        java.lang.String str11 = rSA1.decrypt("67255654729147995743857032941");
        java.lang.String str13 = rSA1.encrypt("90158492089125200430849511322");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005ARD" + "'", str9, "\005ARD");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\023QsV" + "'", str11, "\023QsV");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2498208348" + "'", str13, "2498208348");
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\002\002\034\ufffd\026\ufffd\006\ufffd");
        java.lang.String str11 = rSA1.decrypt("639581396801755524271293352968");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "228" + "'", str7, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136" + "'", str9, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007" + "'", str11, "\007");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
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
        java.lang.String str21 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str23 = rSA1.decrypt("434");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffdI7" + "'", str13, "\004\ufffd\ufffdI7");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3262354756987992" + "'", str15, "3262354756987992");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdg" + "'", str19, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "22387486344437767626666148235" + "'", str21, "22387486344437767626666148235");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\ufffd\ufffd`I&\013\ufffd6" + "'", str23, "\ufffd\ufffd\ufffd\ufffd`I&\013\ufffd6");
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("299711429567829177107340963225");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "456" + "'", str9, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "312" + "'", str13, "312");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\032" + "'", str17, "\001\032");
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("583253898306406");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "233882728029243520881512816935" + "'", str9, "233882728029243520881512816935");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "604468341743521915415896266191" + "'", str11, "604468341743521915415896266191");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19374908722669289528069930004" + "'", str13, "19374908722669289528069930004");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "516697706063588140327150826363" + "'", str17, "516697706063588140327150826363");
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        java.lang.String str15 = rSA1.encrypt("54326269148954289324151592843");
        java.lang.String str17 = rSA1.encrypt("690530077128240573643761455271");
        java.lang.String str19 = rSA1.decrypt("92411931167650810452260723934");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "130" + "'", str11, "130");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "714" + "'", str13, "714");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "605" + "'", str15, "605");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "779" + "'", str17, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1401320653779123" + "'", str7, "1401320653779123");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffdv\360\ufffd" + "'", str9, "\005\ufffdv\360\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "69254517157161" + "'", str13, "69254517157161");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "140608" + "'", str15, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "730323239584323" + "'", str17, "730323239584323");
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.encrypt("182896684412517005977800507579");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\005\036\ufffd\ufffd\ufffd\003\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("144555030144998575362767788416");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\005" + "'", str5, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004" + "'", str11, "\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "75" + "'", str13, "75");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52631490029292951700788466631" + "'", str17, "52631490029292951700788466631");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "57219000557917810048588218277" + "'", str19, "57219000557917810048588218277");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u9cf2`" + "'", str13, "\005\u9cf2`");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1288634388211887" + "'", str15, "1288634388211887");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1409954982410965" + "'", str17, "1409954982410965");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2250666132625" + "'", str19, "2250666132625");
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
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
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42500413686604" + "'", str7, "42500413686604");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1581406763" + "'", str11, "1581406763");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "798" + "'", str15, "798");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001e" + "'", str17, "\001e");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("432268551667889026451279149775");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd_\001" + "'", str9, "\ufffd_\001");
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("37822311364830212583");
        java.lang.String str19 = rSA1.encrypt("314");
        java.lang.String str21 = rSA1.encrypt("2975347492871031");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001(z)\002\ufffd" + "'", str13, "\001(z)\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1486519000066282" + "'", str15, "1486519000066282");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1984111913850655" + "'", str17, "1984111913850655");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "90230696488075" + "'", str19, "90230696488075");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2467200590327285" + "'", str21, "2467200590327285");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\ufffd`");
        java.lang.String str19 = rSA1.encrypt("\ufffd*j\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "944" + "'", str17, "944");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "518" + "'", str19, "518");
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.decrypt("473642297");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\036\ufffd\ufffd\ufffd\ufffd\ufffd\027\ufffdF." + "'", str3, "\b\036\ufffd\ufffd\ufffd\ufffd\ufffd\027\ufffdF.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3938980639167" + "'", str5, "3938980639167");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd)\026\u02b1\ufffd\ufffdl\b\r\ufffd" + "'", str7, "\004\ufffd)\026\u02b1\ufffd\ufffdl\b\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317033730325889071377092691787" + "'", str9, "317033730325889071377092691787");
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.decrypt("815267620206901");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "198010993943799" + "'", str7, "198010993943799");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\ufffd\ufffd" + "'", str11, "\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\020\"\030\ufffd" + "'", str13, "\020\"\030\ufffd");
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.decrypt("2909737450");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002b" + "'", str7, "\002b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "667664628484292" + "'", str11, "667664628484292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "718345131070934" + "'", str13, "718345131070934");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1913562953373223" + "'", str15, "1913562953373223");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\023\ufffd\ufffd" + "'", str19, "\003\ufffd\ufffd\ufffd\023\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
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
        java.lang.String str25 = rSA1.decrypt("2344608470");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "316272079498010261951009604577" + "'", str9, "316272079498010261951009604577");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "189403534253982419506645433208" + "'", str13, "189403534253982419506645433208");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd\037" + "'", str15, "\002\ufffd\ufffd\f\ufffd\ufffd\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "96549157373046875" + "'", str17, "96549157373046875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "160933697917949198820719447915" + "'", str19, "160933697917949198820719447915");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "198548964328932678867217379904" + "'", str21, "198548964328932678867217379904");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\ufffd6\t\032\ufffd\004\036_" + "'", str23, "\001\ufffd\ufffd\ufffd6\t\032\ufffd\004\036_");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd5" + "'", str25, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd5");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\n\ufffd0U");
        java.lang.String str17 = rSA1.encrypt("40235761325436828131800443396");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001D" + "'", str11, "\001D");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "43" + "'", str15, "43");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "241" + "'", str17, "241");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\000\ufffd\ufffd\024\ufffd\ufffd\f\u02c0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "514148801620021" + "'", str7, "514148801620021");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd.\030\005\ufffd" + "'", str9, "\005\ufffd.\030\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1586965087809711" + "'", str13, "1586965087809711");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1457020858831083" + "'", str17, "1457020858831083");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1422069127352894" + "'", str19, "1422069127352894");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffdfp\027\ufffd\036" + "'", str21, "\001\ufffdfp\027\ufffd\036");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("373");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "200117848939014462588132362290" + "'", str9, "200117848939014462588132362290");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "214967925408971820778354454413" + "'", str11, "214967925408971820778354454413");
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("451");
        java.lang.String str17 = rSA1.encrypt("1518936014865871");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55" + "'", str11, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "271" + "'", str13, "271");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "68" + "'", str15, "68");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "254" + "'", str17, "254");
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
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
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1844284142793019" + "'", str7, "1844284142793019");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0012" + "'", str19, "\0012");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
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
        java.lang.String str21 = rSA1.encrypt("601516698092057359464103177515");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55073177600000" + "'", str11, "55073177600000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\f" + "'", str19, "\f");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "161" + "'", str21, "161");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\005\002\ufffd\ufffd\r\177");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\032g\016");
        java.lang.String str17 = rSA1.decrypt("3416410363345270");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1324055817704045" + "'", str7, "1324055817704045");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\022\ufffd" + "'", str11, "\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1771309986" + "'", str13, "1771309986");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "997713717" + "'", str15, "997713717");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "k\b\ufffd`" + "'", str17, "k\b\ufffd`");
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "272092775570925" + "'", str7, "272092775570925");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("1027617448837851");
        java.lang.String str17 = rSA1.decrypt("575730631187720402467793207691");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t" + "'", str15, "\t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\016\ufffd" + "'", str11, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "91125" + "'", str13, "91125");
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str15 = rSA1.encrypt("36889312402462405966288044447");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338" + "'", str9, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "451" + "'", str13, "451");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "338" + "'", str15, "338");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("1419761660222944");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\034" + "'", str5, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "226" + "'", str7, "226");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "247" + "'", str9, "247");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285" + "'", str11, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "475" + "'", str13, "475");
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "l" + "'", str7, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "247" + "'", str9, "247");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.decrypt("429740296");
        java.lang.String str7 = rSA1.encrypt("1863290051759484");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\006\ufffd\ufffd\001\ufffd\ufffd\ufffd\u064b\ufffdn");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd" + "'", str3, "\002\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffd\ufffd\u06d6\ufffd\ufffd\ufffd" + "'", str5, "\002\ufffd\ufffd\ufffd\u06d6\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "331007955061749015847990839160" + "'", str7, "331007955061749015847990839160");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
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
        java.lang.String str21 = rSA1.decrypt("199330574800048045967492931911");
        java.lang.String str23 = rSA1.encrypt("403443141468527212570169909163");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "566765522948092226443024575813" + "'", str9, "566765522948092226443024575813");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "310719151447568313093480952770" + "'", str11, "310719151447568313093480952770");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "352927225376363028523633350164" + "'", str13, "352927225376363028523633350164");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\t\ufffdA\035\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\004\t\ufffdA\035\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "239682091482667318557703389810" + "'", str17, "239682091482667318557703389810");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "73" + "'", str23, "73");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
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
        java.lang.String str21 = rSA1.decrypt("974227703267206");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "526138026052297356371936343630" + "'", str11, "526138026052297356371936343630");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffdQ\002\ufffd\034&\035\ufffd\ufffd\u0382" + "'", str13, "\000\ufffdQ\002\ufffd\034&\035\ufffd\ufffd\u0382");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "81" + "'", str17, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "101" + "'", str19, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        java.lang.String str13 = rSA1.decrypt("446994016775255566426474620227");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("452176614619701");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2001707901053085" + "'", str7, "2001707901053085");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "316" + "'", str11, "316");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "$" + "'", str13, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "30815016745981052152877386027" + "'", str17, "30815016745981052152877386027");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("806729601483697513872336243167");
        java.lang.String str13 = rSA1.decrypt("325752737241329561549107236819");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "350723783409871966444513016193" + "'", str9, "350723783409871966444513016193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\037<\"\035\ufffd\ufffd\0240\003" + "'", str11, "\b\ufffd\037<\"\035\ufffd\ufffd\0240\003");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\022\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\022\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        rSA1.generateKeys((int) ' ');
        java.lang.String str19 = rSA1.encrypt("\005gbo\003\002\ufffd\ufffd\ufffdlfc");
        java.lang.String str21 = rSA1.encrypt("\001\031\ufffd\ufffd\035");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str25 = rSA1.encrypt("2365271457208378");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3061102394474622" + "'", str7, "3061102394474622");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "325268034957566" + "'", str13, "325268034957566");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "<m\002\036-s" + "'", str15, "<m\002\036-s");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1725773870" + "'", str19, "1725773870");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "721347148" + "'", str21, "721347148");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "534" + "'", str25, "534");
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("15370703353317709614231641516");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "123497501711501928873328788420" + "'", str9, "123497501711501928873328788420");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\n\ufffd&\0343;`" + "'", str11, "\ufffd\ufffd\n\ufffd&\0343;`");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "423930173822988228734260518816" + "'", str13, "423930173822988228734260518816");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "11229839473336235158949707733" + "'", str17, "11229839473336235158949707733");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.decrypt("15399140528");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str3, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "888572528615142" + "'", str5, "888572528615142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "735741830848784" + "'", str7, "735741830848784");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\037r\b\026\ufffd\ufffd" + "'", str11, "\002\037r\b\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005e\013\ufffd\025" + "'", str13, "\005e\013\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\f\030\ufffd\ufffd" + "'", str15, "\005\f\030\ufffd\ufffd");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(100);
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
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        java.lang.String str13 = rSA1.decrypt("51072814435354477634104262711");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("9093719717375991413456515037");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4926281259" + "'", str3, "4926281259");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5377950000" + "'", str5, "5377950000");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3319575025" + "'", str7, "3319575025");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6037141236" + "'", str9, "6037141236");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1755720284" + "'", str11, "1755720284");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\007\ufffd" + "'", str13, "\000\ufffd\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1819226813674297" + "'", str17, "1819226813674297");
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "517868237448823967721115136422" + "'", str9, "517868237448823967721115136422");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1684486850959658" + "'", str13, "1684486850959658");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "440644582436161" + "'", str15, "440644582436161");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("10590563594");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005Y-\034\ufffdH\002" + "'", str3, "\005Y-\034\ufffdH\002");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14049128167273" + "'", str5, "14049128167273");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "702171570889415" + "'", str7, "702171570889415");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd|P9" + "'", str9, "\004\ufffd\ufffd\ufffd|P9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "927926131748884" + "'", str11, "927926131748884");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("125");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("2339551310067626");
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffdC\032\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "62059282633096926812214517077" + "'", str9, "62059282633096926812214517077");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\u0222\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\u0222\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "353726221177205784990534607592" + "'", str13, "353726221177205784990534607592");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004=\036\ufffdx\016e\002\006\ufffd\027\ufffd" + "'", str15, "\004=\036\ufffdx\016e\002\006\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffdy\023\ufffd\ufffd\u0917\ufffd\000" + "'", str19, "\001\ufffd\ufffdy\023\ufffd\ufffd\u0917\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "393289246818840940670299315048" + "'", str21, "393289246818840940670299315048");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("17862321440275");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\177\ufffd\ufffd\ufffd" + "'", str7, "\006\177\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("603377111727349");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\002\u071a\u0715\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("146");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7516865509350965248" + "'", str9, "7516865509350965248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97345273616933321026117391045" + "'", str11, "97345273616933321026117391045");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "142426947332795554468292469724" + "'", str13, "142426947332795554468292469724");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "467035432871523157291100706063" + "'", str15, "467035432871523157291100706063");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\027\ufffd\ufffd\ufffd\ufffd\ufffd,@E" + "'", str17, "\003\027\ufffd\ufffd\ufffd\ufffd\ufffd,@E");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("32427175380384275892758226492");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4367283665702692042391140595" + "'", str9, "4367283665702692042391140595");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "175321358104484706351034487094" + "'", str13, "175321358104484706351034487094");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\030\ufffd\030\u0390\ufffd\f\ufffd\ufffd\024K" + "'", str15, "\002\030\ufffd\030\u0390\ufffd\f\ufffd\ufffd\024K");
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
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
        java.lang.String str25 = rSA1.encrypt("941381949840434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\001\ufffd\001\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?c???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "358404282151907301864288247368" + "'", str9, "358404282151907301864288247368");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffdw\034\022\005\ufffd\ufffd\003\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffdw\034\022\005\ufffd\ufffd\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "419532138424814503210543573818" + "'", str13, "419532138424814503210543573818");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\006\013\027\ufffd" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffd\006\013\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "114722372672716085470635300724" + "'", str17, "114722372672716085470635300724");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "16537393139030843128479620960" + "'", str21, "16537393139030843128479620960");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2778776097544805990878187413" + "'", str23, "2778776097544805990878187413");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "40240681704292542182641621442" + "'", str25, "40240681704292542182641621442");
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("402119530394494");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1696232034738692" + "'", str7, "1696232034738692");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238" + "'", str11, "238");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\020\ufffdH\013" + "'", str15, "\020\ufffdH\013");
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("4334658428");
        java.lang.String str13 = rSA1.encrypt("\001\u03a8\ufffd\ufffd\ufffdx\035\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004vB\025\ufffd\024\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?vB?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "48102042597016525296585507493" + "'", str11, "48102042597016525296585507493");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23580801840609745778025021281" + "'", str13, "23580801840609745778025021281");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\006\b\ufffd\ufffd\355");
        java.lang.String str11 = rSA1.decrypt("434967124633863235246636600006");
        java.lang.String str13 = rSA1.encrypt("11");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "468297681914559914008267150902" + "'", str9, "468297681914559914008267150902");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\n\007\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\n\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "316698507583844446193" + "'", str13, "316698507583844446193");
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
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
        java.lang.String str21 = rSA1.decrypt("974227703267206");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "753948587974272392712783622845" + "'", str11, "753948587974272392712783622845");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\035\037\ufffd\ufffd\ufffd\025\016\ufffd\037" + "'", str13, "\005\035\037\ufffd\ufffd\ufffd\025\016\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "81" + "'", str17, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "101" + "'", str19, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("8403463512");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd3}&");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\020\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"!??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "131588355118070" + "'", str7, "131588355118070");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\b" + "'", str9, "\001\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd'\f\ufffde" + "'", str11, "\006\ufffd\ufffd'\f\ufffde");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1818811870225928" + "'", str13, "1818811870225928");
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357703222164128732893811052432" + "'", str9, "357703222164128732893811052432");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "294550804844522382316689804536" + "'", str11, "294550804844522382316689804536");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffdi\035\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffdi\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "236080578197248902741558308630" + "'", str17, "236080578197248902741558308630");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "274" + "'", str13, "274");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "300483668880894588960627494974" + "'", str9, "300483668880894588960627494974");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "177882810348944844471905758175" + "'", str11, "177882810348944844471905758175");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdg" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001co\177\ufffd\ufffd2^\021\n" + "'", str15, "\001co\177\ufffd\ufffd2^\021\n");
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        rSA1.generateKeys((int) ' ');
        java.lang.String str7 = rSA1.encrypt("141534893279925187594255106704");
        java.lang.String str9 = rSA1.encrypt("369824009393067");
        java.lang.String str11 = rSA1.encrypt("498025537373966143508288825554");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "421499970" + "'", str7, "421499970");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "46737110" + "'", str9, "46737110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1396297097" + "'", str11, "1396297097");
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("543");
        java.lang.String str15 = rSA1.decrypt("231279615465721569603755126783");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "427798583254131977435175525411" + "'", str11, "427798583254131977435175525411");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "42390669502470292011" + "'", str13, "42390669502470292011");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\t\ufffd\ufffd\ufffd\ufffd;." + "'", str15, "\006\ufffd\t\ufffd\ufffd\ufffd\ufffd;.");
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("360143793835170409825620524630");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "802883843804264935898577333766" + "'", str9, "802883843804264935898577333766");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd\177\ufffd\t" + "'", str11, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd\177\ufffd\t");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\u0675\ufffd\ufffd\ufffd\ufffd\u01c2>\004@s");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10" + "'", str11, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "22" + "'", str15, "22");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\u0379\\\f\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "68" + "'", str7, "68");
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "372218019692947" + "'", str7, "372218019692947");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("131");
        java.lang.String str13 = rSA1.encrypt("1904256626782150");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3301839387" + "'", str3, "3301839387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "179062740" + "'", str5, "179062740");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5218339351" + "'", str7, "5218339351");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "63384773964379002105333518609" + "'", str11, "63384773964379002105333518609");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "150659065754400166800630020963" + "'", str13, "150659065754400166800630020963");
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("30774062305666838944109687145");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "377" + "'", str7, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42" + "'", str9, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\023" + "'", str11, "\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "25" + "'", str13, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "149341492784784345395865409104" + "'", str9, "149341492784784345395865409104");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\u0609CH" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\u0609CH");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005I\032\020\ufffd\ufffd\ufffd\ufffd\ufffd\\" + "'", str15, "\005I\032\020\ufffd\ufffd\ufffd\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42875" + "'", str17, "42875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\r\ufffd\ufffd\017\ufffd\013\ufffd\ufffd." + "'", str19, "\005\r\ufffd\ufffd\017\ufffd\013\ufffd\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002A\007\ufffd\ufffdh\030\ufffdJo?Ks" + "'", str23, "\002A\007\ufffd\ufffdh\030\ufffdJo?Ks");
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
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
        java.lang.String str21 = rSA1.decrypt("433");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415231457243473402600069990840" + "'", str9, "415231457243473402600069990840");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "~T\003\0252N\034\ufffd\u0290\ufffd" + "'", str11, "~T\003\0252N\034\ufffd\u0290\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "281645712727097246875826524017" + "'", str13, "281645712727097246875826524017");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "229487787504993305290796976027" + "'", str15, "229487787504993305290796976027");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "110562137291022344644252460649" + "'", str17, "110562137291022344644252460649");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "66215169932574364413722592114" + "'", str19, "66215169932574364413722592114");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\0048\024\ufffdm?{" + "'", str21, "\004\ufffd\0048\024\ufffdm?{");
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "234" + "'", str3, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "548293013" + "'", str7, "548293013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5053798081" + "'", str9, "5053798081");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4122160151" + "'", str13, "4122160151");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\003\ud253\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1050094332369773" + "'", str7, "1050094332369773");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\u07d5\ufffd\ufffd]" + "'", str9, "\007\u07d5\ufffd\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2920261302462571" + "'", str11, "2920261302462571");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1652315404026344" + "'", str13, "1652315404026344");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1945607867501145" + "'", str15, "1945607867501145");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2508861753053221" + "'", str17, "2508861753053221");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\u0763\ufffd\ufffd" + "'", str19, "\005\u0763\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2374473124492116" + "'", str21, "2374473124492116");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "574460807514414086119300839083" + "'", str9, "574460807514414086119300839083");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18661281465218370107661816219" + "'", str11, "18661281465218370107661816219");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\u016f\u0516]\025\n\ufffd\ufffd\ufffd" + "'", str13, "\006\u016f\u0516]\025\n\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004;\037\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd" + "'", str15, "\004;\037\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\uf454\ufffd\ufffd\ufffd~" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd\uf454\ufffd\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\036\ufffd\ufffd\ufffd\ufffd\u0784\ufffdl" + "'", str19, "\007\ufffd\036\ufffd\ufffd\ufffd\ufffd\u0784\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr" + "'", str21, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "476185214403264887381045711021" + "'", str23, "476185214403264887381045711021");
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\005\ufffd\n");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "651348611983996" + "'", str7, "651348611983996");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2899630684570252" + "'", str9, "2899630684570252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "408508261345783" + "'", str11, "408508261345783");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "251" + "'", str13, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1409970684398624" + "'", str19, "1409970684398624");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("1527126373863416");
        java.lang.String str13 = rSA1.encrypt("1512895838");
        java.lang.String str15 = rSA1.encrypt("4367905338");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\ufffd1\r\ufffd\ufffd\ufffdr{ " + "'", str3, "\t\ufffd1\r\ufffd\ufffd\ufffdr{ ");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "48189803739411360322783886106" + "'", str5, "48189803739411360322783886106");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "105614910832977479208286545657" + "'", str7, "105614910832977479208286545657");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\003\r\ufffd\ufffd\ufffd\ufffd\ufffd\006" + "'", str9, "\003\ufffd\ufffd\003\r\ufffd\ufffd\ufffd\ufffd\ufffd\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "327568330746282872389742630838" + "'", str11, "327568330746282872389742630838");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "422792059999852295968331341407" + "'", str13, "422792059999852295968331341407");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "420538783815425691062461112167" + "'", str15, "420538783815425691062461112167");
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\t\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10444361322235" + "'", str15, "10444361322235");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1170714220650192" + "'", str17, "1170714220650192");
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("\003`\000\ufffd\ufffdEw\034\ufffd\002\004");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\003\n0D" + "'", str3, "\003\ufffd\003\n0D");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "99050895170230" + "'", str5, "99050895170230");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1237156718414152" + "'", str7, "1237156718414152");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\026\020\ufffd=x" + "'", str9, "\002\026\020\ufffd=x");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\031\ufffd\u0386\021" + "'", str11, "\002\031\ufffd\u0386\021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\017\ufffd\0039t" + "'", str13, "\000\ufffd\017\ufffd\0039t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "795452860197247" + "'", str15, "795452860197247");
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
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
            java.lang.String str19 = rSA1.decrypt("\000\ufffd\004\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????u=?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "991598870590591996956290697214" + "'", str9, "991598870590591996956290697214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "95755686751699361959929768915" + "'", str13, "95755686751699361959929768915");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "236814337872304894493196945466" + "'", str15, "236814337872304894493196945466");
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
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
        java.lang.String str21 = rSA1.encrypt("796017407254759754390594198500");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2051254549837913" + "'", str11, "2051254549837913");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2657267645503378" + "'", str13, "2657267645503378");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0023\021\ufffd\ufffd\033\u073e\\\ufffd&V" + "'", str19, "\0023\021\ufffd\ufffd\033\u073e\\\ufffd&V");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "101583748263805559153600111734" + "'", str21, "101583748263805559153600111734");
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("318");
        java.lang.String str17 = rSA1.decrypt("1558092582932101");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "130" + "'", str11, "130");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffdA" + "'", str15, "\004\ufffd\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\000\ufffd\u07d7\ufffd," + "'", str17, "\006\000\ufffd\u07d7\ufffd,");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.decrypt("639857867348047546651687203467");
        java.lang.String str11 = rSA1.decrypt("95057093174212120272332960514");
        java.lang.String str13 = rSA1.encrypt("751450299502754");
        java.lang.String str15 = rSA1.encrypt("111726187388700902387621788491");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5205929195" + "'", str3, "5205929195");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1249727618" + "'", str5, "1249727618");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "374572847" + "'", str7, "374572847");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\000\ufffd\ufffd" + "'", str11, "\002\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2444879422" + "'", str13, "2444879422");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4765823083" + "'", str15, "4765823083");
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "672706024501759161532131200581" + "'", str9, "672706024501759161532131200581");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "672706024501759161532131200581" + "'", str11, "672706024501759161532131200581");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd~p6$?\024\ufffd" + "'", str13, "\005\ufffd\ufffd~p6$?\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "750463064986455997500453258487" + "'", str15, "750463064986455997500453258487");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\u067a\007\ufffd\r" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\u067a\007\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.encrypt("432373222534973726506934894382");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2522100260471046" + "'", str7, "2522100260471046");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\u0411\013" + "'", str13, "\000\ufffd\u0411\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2803789855" + "'", str15, "2803789855");
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "298056082824404" + "'", str7, "298056082824404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "383" + "'", str19, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\022" + "'", str21, "\022");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("639581396801755524271293352968");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\002\ufffd\ufffd\ufffd\ufffdt" + "'", str9, "{\002\ufffd\ufffd\ufffd\ufffdt");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "57109573024163758216603840060" + "'", str9, "57109573024163758216603840060");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "185100319980450731819117590946" + "'", str11, "185100319980450731819117590946");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\t\b\"\\\ufffd" + "'", str15, "\001\ufffd\t\b\"\\\ufffd");
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
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
        java.lang.String str23 = rSA1.encrypt("I");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\000\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1439264957116461" + "'", str15, "1439264957116461");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "754995622679873" + "'", str17, "754995622679873");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1335421998367012" + "'", str19, "1335421998367012");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1571787771865108" + "'", str21, "1571787771865108");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "389017" + "'", str23, "389017");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("138378253545377");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "255278012961404259194349915502" + "'", str9, "255278012961404259194349915502");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffdY\032\ufffd\ufffd\n\ufffd\025" + "'", str11, "\003\ufffd\ufffdY\032\ufffd\ufffd\n\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "401407753288194207234333801657" + "'", str13, "401407753288194207234333801657");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "93" + "'", str17, "93");
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"w(d???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1820265379612694" + "'", str7, "1820265379612694");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "167" + "'", str15, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001$" + "'", str17, "\001$");
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = rSA1.decrypt("\007\u10c9\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???p?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3586838769180804912978911780" + "'", str11, "3586838769180804912978911780");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "613782041715355280570053425590" + "'", str13, "613782041715355280570053425590");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "177" + "'", str17, "177");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "287" + "'", str19, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19" + "'", str21, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002r" + "'", str23, "\002r");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "110" + "'", str25, "110");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3357727758788");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\n\003");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31" + "'", str15, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "354" + "'", str17, "354");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("687316887150992152363348790340");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001>" + "'", str7, "\001>");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "224740109619092634006117945792" + "'", str11, "224740109619092634006117945792");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        java.lang.String str17 = rSA1.decrypt("264484706");
        java.lang.String str19 = rSA1.encrypt("59563667839075419707491552814");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "434678776748354" + "'", str13, "434678776748354");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\u04be\ufffd\ufffd" + "'", str17, "\t\u04be\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "79061156823463" + "'", str19, "79061156823463");
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        java.lang.String str11 = rSA1.encrypt("468");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\020\n\ufffd\ufffd\ufffd\ufffd\ufffd\002;R" + "'", str9, "\020\n\ufffd\ufffd\ufffd\ufffd\ufffd\002;R");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "310040650362700280533520253541" + "'", str11, "310040650362700280533520253541");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("214613013380271327686434676578");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1791078400327415" + "'", str7, "1791078400327415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3777785264" + "'", str15, "3777785264");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\027\024\ufffd\005\ufffd\023\021\034\007");
        java.lang.String str17 = rSA1.encrypt("1188066506118274");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "868643189909123" + "'", str7, "868643189909123");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "630275001541331" + "'", str13, "630275001541331");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2628957808274698" + "'", str15, "2628957808274698");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "987908749502833" + "'", str17, "987908749502833");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("2669812389699993");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\017\ufffd\t");
        java.lang.String str17 = rSA1.decrypt("111282414026995639481644391300");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "457075336370672855393448123896" + "'", str9, "457075336370672855393448123896");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "41050730830230229127740437972" + "'", str11, "41050730830230229127740437972");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "394998442441851329591258667691" + "'", str13, "394998442441851329591258667691");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "338619819515215225847406232067" + "'", str15, "338619819515215225847406232067");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\025\ufffd\ufffd\ufffd\ufffd5\020lM\035" + "'", str17, "\007\025\ufffd\ufffd\ufffd\ufffd5\020lM\035");
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
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
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1543212165153930" + "'", str7, "1543212165153930");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "316" + "'", str11, "316");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "339" + "'", str19, "339");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("1247669252889969");
        java.lang.String str13 = rSA1.encrypt("153853134159497141190339455222");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\u9419" + "'", str5, "\000\ufffd\u9419");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "163998839043489776430883363193" + "'", str11, "163998839043489776430883363193");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "305257340432467093790416735425" + "'", str13, "305257340432467093790416735425");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
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
            java.lang.String str21 = rSA1.decrypt("\005\ufffd\ufffd\ufffd\ufffdst{_\003*");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??T?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffdC\035\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffdC\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1564844324717560" + "'", str15, "1564844324717560");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1334138518210549" + "'", str17, "1334138518210549");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\027IS\037\ufffd\027" + "'", str19, "\005\027IS\037\ufffd\027");
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.lang.String str13 = rSA1.encrypt("538466596764584785061881286421");
        java.lang.String str15 = rSA1.encrypt("255208532862462952347238750539");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffdd\036\ufffd" + "'", str5, "\002\ufffdd\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "498713993297891413091775138398" + "'", str9, "498713993297891413091775138398");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "698250344193544953572821148897" + "'", str11, "698250344193544953572821148897");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "505775053421625451888121043181" + "'", str13, "505775053421625451888121043181");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "660875550116471779956842950077" + "'", str15, "660875550116471779956842950077");
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.lang.String str15 = rSA1.encrypt("576838359927970006129927354507");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("\b\ufffd\004\ufffd\"\ufffdMO\017\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "=" + "'", str11, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "217" + "'", str13, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "216" + "'", str15, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1698823138" + "'", str19, "1698823138");
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
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
        java.lang.String str25 = rSA1.decrypt("167924046209645854036997289195");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "342311603313877475516488002422" + "'", str9, "342311603313877475516488002422");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\u0516\ufffd\020\ufffd\006\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\u0516\ufffd\020\ufffd\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "313014946667143528899677560433" + "'", str13, "313014946667143528899677560433");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "391076615191591" + "'", str19, "391076615191591");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\ufffd\016\021" + "'", str23, "\001\ufffd\ufffd\ufffd\016\021");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\004\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
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
        java.lang.String str23 = rSA1.encrypt("291688146728594867886419743884");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "171120412151601" + "'", str7, "171120412151601");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "295" + "'", str15, "295");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\034" + "'", str17, "\034");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "127" + "'", str19, "127");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001K" + "'", str21, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "361" + "'", str23, "361");
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006" + "'", str5, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "366" + "'", str7, "366");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172" + "'", str9, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19" + "'", str13, "19");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("906422179706046");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
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
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "151" + "'", str17, "151");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.decrypt("208");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("832595611796045640369168064278");
        java.lang.String str19 = rSA1.encrypt("\t\ufffd\ufffd\ufffd\u05ca\ufffd");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\027\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\027\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\177\ufffd\u063c\025\000\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\177\ufffd\u063c\025\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "685829059426488234359586031127" + "'", str17, "685829059426488234359586031127");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "683221617344622746145559042517" + "'", str19, "683221617344622746145559042517");
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "558020201210526646834858326988" + "'", str9, "558020201210526646834858326988");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\022JN\037" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\022JN\037");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02e5\ufffdV" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u02e5\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\016\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\016\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "31420475829330316283122873449" + "'", str21, "31420475829330316283122873449");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\024\ufffdv\f\007\u0779\ufffd\ufffd\ufffd" + "'", str23, "\024\ufffdv\f\007\u0779\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.decrypt("553535743006153129855274469250");
        java.lang.String str13 = rSA1.encrypt("1772440215358392");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "54" + "'", str5, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\025\004\ufffd\ufffd\u49f2" + "'", str11, "\004\ufffd\025\004\ufffd\ufffd\u49f2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "852304272195509159218823079266" + "'", str13, "852304272195509159218823079266");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("3060553596769532");
        java.lang.String str19 = rSA1.decrypt("9830939715");
        java.lang.String str21 = rSA1.encrypt("\001\006\ufffd\037");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "33568450143171327471894249932" + "'", str17, "33568450143171327471894249932");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\031\ufffd\ufffdY" + "'", str19, "\ufffd\ufffd\031\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1647985486497196612326346469" + "'", str21, "1647985486497196612326346469");
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
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
        java.lang.String str21 = rSA1.decrypt("457");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "363261305166376" + "'", str7, "363261305166376");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1655331641877903" + "'", str9, "1655331641877903");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3130529924122926" + "'", str11, "3130529924122926");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "405101631516064613693907246681" + "'", str17, "405101631516064613693907246681");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "539473139479721733358843879569" + "'", str19, "539473139479721733358843879569");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffdpTE!" + "'", str21, "\006\ufffd\ufffd\ufffd\ufffd\ufffdpTE!");
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffdp");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "209101541445918523223061967390" + "'", str13, "209101541445918523223061967390");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "238106192051979389710881046399" + "'", str15, "238106192051979389710881046399");
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("612697493508374");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\022\ufffd\ufffd}\037\ufffd" + "'", str3, "\002\ufffd\ufffd\ufffd\022\ufffd\ufffd}\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "957090334194443531480029418964" + "'", str5, "957090334194443531480029418964");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "505215763720074234107508239876" + "'", str7, "505215763720074234107508239876");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("5395746149");
        java.lang.String str19 = rSA1.encrypt("\002_");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2069393933" + "'", str7, "2069393933");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6771256695" + "'", str9, "6771256695");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd_" + "'", str11, "\001\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "12124898464" + "'", str13, "12124898464");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\002\ufffd\005/" + "'", str17, "\003\ufffd\002\ufffd\005/");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "82217404548248" + "'", str19, "82217404548248");
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
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
        java.math.BigInteger bigInteger34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger35 = rSA1.decrypt(bigInteger34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "583215802992312" + "'", str7, "583215802992312");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001U" + "'", str19, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "233" + "'", str21, "233");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "209" + "'", str27, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "823381371573740379519325063028" + "'", str31, "823381371573740379519325063028");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "909781663590539392278757865671" + "'", str33, "909781663590539392278757865671");
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("603377111727349");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "138191661721105149465196524470" + "'", str11, "138191661721105149465196524470");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "430439156390438622381482513120" + "'", str13, "430439156390438622381482513120");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u0266\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\002\027");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "466726492113802009198389467869" + "'", str9, "466726492113802009198389467869");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\006X}\017\ufffd\ufffd\022\ufffd6" + "'", str11, "\006\ufffd\006X}\017\ufffd\ufffd\022\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "240783684742674223497075082462" + "'", str13, "240783684742674223497075082462");
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("586614665667193");
        java.lang.String str17 = rSA1.encrypt("351599105432965402456457863394");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1408350923264206" + "'", str7, "1408350923264206");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd3e\n\024" + "'", str9, "\004\ufffd3e\n\024");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004'\022\ufffd\031b" + "'", str11, "\004'\022\ufffd\031b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd~" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24958965374569334649650691265" + "'", str17, "24958965374569334649650691265");
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("755629646");
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.encrypt("110384169821366054744618407114");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4830555066707739337741289318" + "'", str9, "4830555066707739337741289318");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "60609348565725956091217057335" + "'", str11, "60609348565725956091217057335");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\025\ufffd\ufffdF\000\003\ufffd\ufffd\ufffdC" + "'", str13, "\001\025\ufffd\ufffdF\000\003\ufffd\ufffd\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffdyA\020\ufffd\ufffd6a" + "'", str17, "\007\ufffd\ufffdyA\020\ufffd\ufffd6a");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "19245714296276432120080557989" + "'", str21, "19245714296276432120080557989");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
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
        java.lang.String str23 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "860298259733205" + "'", str13, "860298259733205");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1225900163727402" + "'", str15, "1225900163727402");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "149573483281908" + "'", str17, "149573483281908");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1014239273922338" + "'", str19, "1014239273922338");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1483112444263918" + "'", str21, "1483112444263918");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "370822312887299" + "'", str23, "370822312887299");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524455966506217" + "'", str7, "524455966506217");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024304446903324" + "'", str13, "1024304446903324");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\005_" + "'", str15, "\001\ufffd\ufffd\ufffd\005_");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\025\ufffd\ufffd" + "'", str17, "\005\ufffd\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1791197185627015" + "'", str19, "1791197185627015");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1066598375853342" + "'", str21, "1066598375853342");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
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
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "603378331541082795999659662204" + "'", str11, "603378331541082795999659662204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35808116012019487781768014703" + "'", str13, "35808116012019487781768014703");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "128" + "'", str17, "128");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000" + "'", str19, "\000");
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "394459200191173840526722770881" + "'", str9, "394459200191173840526722770881");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "394459200191173840526722770881" + "'", str11, "394459200191173840526722770881");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "179111841382064081493166642310" + "'", str15, "179111841382064081493166642310");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\004\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\ufffd\003\ufffd\ufffd\ufffd\017" + "'", str19, "\007\ufffd\ufffd\003\ufffd\ufffd\ufffd\017");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
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
            java.lang.String str21 = rSA1.decrypt("\000\ufffd\033\ufffd\ufffd\b\ufffd\ufffd\u046c");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "482" + "'", str13, "482");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7184539316" + "'", str19, "7184539316");
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("11058548533");
        java.lang.String str15 = rSA1.encrypt("131409880136861723651274356346");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "123983719418501" + "'", str7, "123983719418501");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007-\f\025\ufffd\ufffd" + "'", str13, "\007-\f\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1495894535360517" + "'", str15, "1495894535360517");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
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
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1128526928863835" + "'", str7, "1128526928863835");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1815631632264445" + "'", str13, "1815631632264445");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\u0453\ufffd\ufffd\b" + "'", str15, "\006\u0453\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd{\003\ufffd~#" + "'", str17, "\001\ufffd{\003\ufffd~#");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("\036\034\u01b7\ufffd\035\ufffd\ufffd\ufffd9h;");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "83" + "'", str5, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1111166250865836");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "278" + "'", str11, "278");
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
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
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "q" + "'", str17, "q");
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.encrypt("503");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "295315808640286477089530750036" + "'", str3, "295315808640286477089530750036");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "118669983912874968628766419726" + "'", str5, "118669983912874968628766419726");
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\ufffd\ufffdS\0053T(\007\ufffd$");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "548951491771384947407293758930" + "'", str9, "548951491771384947407293758930");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2388907372032" + "'", str11, "2388907372032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffdK\022\ufffd\\\ufffd\ufffd\032" + "'", str13, "\005\ufffd\ufffd\ufffdK\022\ufffd\\\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "243022346311073797145214135890" + "'", str15, "243022346311073797145214135890");
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("8589662889");
        java.lang.String str19 = rSA1.decrypt("126849007446911256148502065860");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "62687021542420658268190987653" + "'", str9, "62687021542420658268190987653");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\016\ufffd\ufffd\b\ufffda" + "'", str11, "\b\ufffd\ufffd\016\ufffd\ufffd\b\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "503474599602800366173117958097" + "'", str13, "503474599602800366173117958097");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\035\u042d\007" + "'", str19, "\ufffd\035\u042d\007");
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
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
        java.lang.String str25 = rSA1.encrypt("1115524922");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1916498012382342" + "'", str7, "1916498012382342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd{h" + "'", str9, "\005\ufffd\ufffd\ufffd{h");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1065556828079485" + "'", str11, "1065556828079485");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "935659138651279" + "'", str13, "935659138651279");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "418400651626632" + "'", str17, "418400651626632");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "586921902760326" + "'", str19, "586921902760326");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str21, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\ufffd\ufffdm" + "'", str23, "\ufffd\ufffd\ufffd\ufffdm");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1607431724133522" + "'", str25, "1607431724133522");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("111391917685414668336366870336");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("1385917111");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "771111727486284" + "'", str7, "771111727486284");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001L" + "'", str17, "\001L");
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("945162613240688736200140383534");
        java.lang.String str15 = rSA1.decrypt("839926756669354810033717567792");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "832516931" + "'", str7, "832516931");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4299022107" + "'", str9, "4299022107");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "B\006\ufffd\"" + "'", str11, "B\006\ufffd\"");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5427190860" + "'", str13, "5427190860");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\005\036" + "'", str15, "\001\ufffd\005\036");
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2433189233786414" + "'", str7, "2433189233786414");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1716802860491350" + "'", str13, "1716802860491350");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\031q\034xp" + "'", str15, "\006\ufffd\031q\034xp");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\u0231\ufffd\ufffdid" + "'", str17, "\007\u0231\ufffd\ufffdid");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "652194269824945" + "'", str19, "652194269824945");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\ufffdOH" + "'", str21, "\005\ufffd\ufffd\ufffdOH");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("219430057538805555486238156998");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5242930842" + "'", str11, "5242930842");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\023\ufffd" + "'", str13, "\023\ufffd");
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("121105627997551");
        java.lang.String str9 = rSA1.encrypt("86842385381442279029395311576");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\017\ufffd\u04f5\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\017\ufffd\u04f5\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "443772901232770111072212637279" + "'", str9, "443772901232770111072212637279");
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.decrypt("553535743006153129855274469250");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffdPz");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172" + "'", str5, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001 \t\002\ufffd\ufffd\ufffdgUhM" + "'", str11, "\001 \t\002\ufffd\ufffd\ufffdgUhM");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "302943202539675722441755754810" + "'", str13, "302943202539675722441755754810");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11823992004" + "'", str3, "11823992004");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6204414424" + "'", str7, "6204414424");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
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
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.encrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1415715802057895" + "'", str7, "1415715802057895");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40" + "'", str15, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "278" + "'", str25, "278");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\0017" + "'", str27, "\0017");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "179" + "'", str29, "179");
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.encrypt("315");
        java.lang.String str15 = rSA1.encrypt("5627337140");
        java.lang.String str17 = rSA1.encrypt("\003x*\006\ufffd\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1408514752349" + "'", str11, "1408514752349");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "406098553933561769371894564130" + "'", str13, "406098553933561769371894564130");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "302808268101900635879739238801" + "'", str15, "302808268101900635879739238801");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "411733272383499966451861609253" + "'", str17, "411733272383499966451861609253");
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "791088488240020" + "'", str7, "791088488240020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\u050cG\007\ufffd" + "'", str9, "\006\u050cG\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str5 = rSA1.encrypt("\002~.:TD\032\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "28804779186851798370902134287" + "'", str5, "28804779186851798370902134287");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("463");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("520311866388828822881614108575");
        java.lang.String str15 = rSA1.decrypt("448135720855058258985292762207");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffdg" + "'", str3, "\003\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14631353638126" + "'", str5, "14631353638126");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "949846401253491" + "'", str7, "949846401253491");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "411" + "'", str13, "411");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\002" + "'", str15, "\002\002");
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        java.lang.String str13 = rSA1.decrypt("51072814435354477634104262711");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7905563595" + "'", str3, "7905563595");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7418315390" + "'", str5, "7418315390");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6349972691" + "'", str7, "6349972691");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5252599907" + "'", str9, "5252599907");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11247102591" + "'", str11, "11247102591");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0025\032Q\024" + "'", str13, "\0025\032Q\024");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("2279400941187448");
        java.lang.String str15 = rSA1.encrypt("2339068862822151");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "116087369907654" + "'", str7, "116087369907654");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "511482356051824780794992123929" + "'", str13, "511482356051824780794992123929");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44051923137973825569222859960" + "'", str15, "44051923137973825569222859960");
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\027\ufffd\ufffd\001\ufffd\ufffd" + "'", str11, "\003\ufffd\027\ufffd\ufffd\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "80759263890443654878359367940" + "'", str13, "80759263890443654878359367940");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "798" + "'", str19, "798");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("121105627997551");
        java.lang.String str9 = rSA1.encrypt("XE\020q");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\u074d\ufffd\ufffd\ufffd" + "'", str7, "\004\ufffd\ufffd\u074d\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "446971563904065430570684538512" + "'", str9, "446971563904065430570684538512");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("96549157373046875");
        java.lang.String str19 = rSA1.decrypt("44");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3401695475" + "'", str7, "3401695475");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5413765137" + "'", str9, "5413765137");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\002" + "'", str11, "\000\ufffd\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5394333972" + "'", str13, "5394333972");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffdR" + "'", str17, "\000\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\002\ufffdd\005" + "'", str19, "\004\ufffd\002\ufffdd\005");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("120");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001U" + "'", str7, "\001U");
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("19465109");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\r" + "'", str11, "\001\r");
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str15 = rSA1.decrypt("184");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\023\007\004\ufffd\ufffd\022o<" + "'", str11, "\006\ufffd\ufffd\ufffd\023\007\004\ufffd\ufffd\022o<");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\u0548T\036;" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\u0548T\036;");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\177\ufffd\ufffd5\001\ufffdf" + "'", str15, "\b\ufffd\177\ufffd\ufffd5\001\ufffdf");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("353");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "452734386454160401102180306765" + "'", str9, "452734386454160401102180306765");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "136655256687422911750769023249" + "'", str13, "136655256687422911750769023249");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1295874414186461" + "'", str17, "1295874414186461");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        java.lang.String str17 = rSA1.decrypt("345976358833331095953203904666");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "590658402645208" + "'", str7, "590658402645208");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "530072332011727003132793055329" + "'", str13, "530072332011727003132793055329");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\017\ufffd\ufffd\ufffdL#\022\ufffd\ufffdb" + "'", str15, "\002\ufffd\017\ufffd\ufffd\ufffdL#\022\ufffd\ufffdb");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\013\ufffd\ufffdq\r\ufffd\ufffd" + "'", str17, "\002\013\ufffd\ufffdq\r\ufffd\ufffd");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.decrypt("1422455974188443");
        java.lang.String str19 = rSA1.decrypt("566394880265978225041784944821");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1384569939406284" + "'", str7, "1384569939406284");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "413900562016746" + "'", str13, "413900562016746");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "89029969668758" + "'", str15, "89029969668758");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\023\ufffd\ufffd\ufffd\ufffdm" + "'", str17, "\004\023\ufffd\ufffd\ufffd\ufffdm");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\004\ufffd\ufffd" + "'", str19, "\001\ufffd\004\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "679897655772216440892236077793" + "'", str9, "679897655772216440892236077793");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "243919295526422721800374118554" + "'", str11, "243919295526422721800374118554");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "270972438510049524054184086697" + "'", str13, "270972438510049524054184086697");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "440" + "'", str17, "440");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "385" + "'", str19, "385");
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("239533509989569937544099898666");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2676950404000924" + "'", str7, "2676950404000924");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\031\ufffd\177\ufffd\ufffd\u0360d" + "'", str15, "\006\ufffd\031\ufffd\177\ufffd\ufffd\u0360d");
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("108582244308243");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "829" + "'", str3, "829");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3031649671" + "'", str7, "3031649671");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3206496658" + "'", str9, "3206496658");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffdI(" + "'", str11, "\000\ufffd\ufffdI(");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("100935160444972936488645408652");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032\u053f\ufffd\ufffd\ufffd\ufffd\ufffdU\037" + "'", str7, "\032\u053f\ufffd\ufffd\ufffd\ufffd\ufffdU\037");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffdhf@v\002\ufffd\ufffd\ufffd\b\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "185" + "'", str13, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "39938662164912380821087868852" + "'", str17, "39938662164912380821087868852");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
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
        java.lang.String str25 = rSA1.encrypt("\001\024\u01d3\ufffd\u104f\ufffd\ufffd\177\ufffd");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "364886306170997996814091260771" + "'", str9, "364886306170997996814091260771");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "364886306170997996814091260771" + "'", str11, "364886306170997996814091260771");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\001\ufffd\ufffd\ufffd\005\ufffdQR" + "'", str13, "\002\ufffd\ufffd\001\ufffd\ufffd\ufffd\005\ufffdQR");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30913542891729857700199942710" + "'", str15, "30913542891729857700199942710");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "487087714184569831856695291562" + "'", str21, "487087714184569831856695291562");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "685641672060105532617853838668" + "'", str25, "685641672060105532617853838668");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("936488068250800");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("3262355743");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "83" + "'", str5, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "421" + "'", str7, "421");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "354" + "'", str9, "354");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "153169530990996805936609648168" + "'", str19, "153169530990996805936609648168");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1522058093595747" + "'", str7, "1522058093595747");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13060694016" + "'", str13, "13060694016");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "147500367360704596463652428838" + "'", str17, "147500367360704596463652428838");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "437511821563712238691964542988" + "'", str19, "437511821563712238691964542988");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "661418316704208" + "'", str7, "661418316704208");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\0354FS.\007" + "'", str9, "\004\0354FS.\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1730230392015463" + "'", str13, "1730230392015463");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\000" + "'", str17, "\006\ufffd\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\b\ufffd\"\ufffd\ufffd\016" + "'", str19, "\b\ufffd\"\ufffd\ufffd\016");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("441737597486003899578395714219");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\031\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?oj?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd@\002\ufffd" + "'", str3, "\001\ufffd\ufffd@\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1473687768746097" + "'", str5, "1473687768746097");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2427244163109955" + "'", str7, "2427244163109955");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31342690078357153054218536219" + "'", str13, "31342690078357153054218536219");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.encrypt("503");
        java.lang.String str7 = rSA1.encrypt("\004\u0692\ufffd,");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "112218905074429754918690977120" + "'", str3, "112218905074429754918690977120");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "424693932181826103456827411963" + "'", str5, "424693932181826103456827411963");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "375739459091855433433537186508" + "'", str7, "375739459091855433433537186508");
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.decrypt("777124217965828542860586651850");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\005\ufffd\ufffd\ufffd\ufffd\007\ufffd\036|By");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\u04f7\ufffd@>" + "'", str3, "\000\ufffd\ufffd\ufffd\ufffd\u04f7\ufffd@>");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250047" + "'", str5, "250047");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("122391984778607625815584437283");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1708569568648425" + "'", str7, "1708569568648425");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "178404486128752232202470905528" + "'", str11, "178404486128752232202470905528");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("648449316259704856969437075577");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "693" + "'", str15, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0017" + "'", str17, "\0017");
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        java.lang.String str13 = rSA1.decrypt("1035069149946528368188026252275");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd^dO");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\\\ufffd\ufffd\ufffd" + "'", str3, "\003\ufffd\\\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1324917520354511" + "'", str5, "1324917520354511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1227483324938744" + "'", str7, "1227483324938744");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffdx4" + "'", str9, "\ufffd\ufffdx4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "915542001352696" + "'", str11, "915542001352696");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\000\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "94996263412810" + "'", str15, "94996263412810");
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.decrypt("6647907366");
        java.lang.String str15 = rSA1.encrypt("1682803771672384");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "416645125692442645740510004614" + "'", str9, "416645125692442645740510004614");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "462154161312088828241643050843" + "'", str11, "462154161312088828241643050843");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd+\017\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd+\017\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "514123300962233135095284670666" + "'", str15, "514123300962233135095284670666");
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("3844015076");
        java.lang.String str15 = rSA1.encrypt("\u0205\n\ufffdxGy");
        java.lang.String str17 = rSA1.decrypt("267830102000175788894679043275");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "520041266087716" + "'", str7, "520041266087716");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\021\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\021\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "819384910715565" + "'", str15, "819384910715565");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\031\026\ufffd\ufffd]\b" + "'", str17, "\031\026\ufffd\ufffd]\b");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("297643039690176422743853815281");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2771921872990074" + "'", str7, "2771921872990074");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9409057030" + "'", str15, "9409057030");
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1247602670591078" + "'", str7, "1247602670591078");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("250235708869437867103396182410");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffd\u0101\ufffd\ufffd\ufffd" + "'", str3, "\000\ufffd\ufffd\u0101\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "311662910327938206250311660127" + "'", str5, "311662910327938206250311660127");
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.encrypt("128048112137671");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\006\ufffd\t\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?()??x?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "679" + "'", str7, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "63" + "'", str13, "63");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3" + "'", str15, "3");
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757839162405436400770019882327" + "'", str11, "757839162405436400770019882327");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.encrypt("702947451550003778719770877111");
        java.lang.String str15 = rSA1.decrypt("60732077159364971136922584801");
        java.lang.String str17 = rSA1.decrypt("62722718278913035955711442900");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "251468801602377" + "'", str7, "251468801602377");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\ufffd\001+" + "'", str9, "\007\ufffd\ufffd\ufffd\001+");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\u0755\ufffda\002" + "'", str11, "\005\u0755\ufffda\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "647793458603621" + "'", str13, "647793458603621");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\021\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffd\021\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "213757901325674381197334033690" + "'", str9, "213757901325674381197334033690");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "570501733757021792423026440621" + "'", str11, "570501733757021792423026440621");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffdr_" + "'", str13, "\000\ufffd\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffdr_");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "808223838923808694004907981864" + "'", str17, "808223838923808694004907981864");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\u03fe\ufffd\005" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\u03fe\ufffd\005");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1629141475649027" + "'", str7, "1629141475649027");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "148" + "'", str15, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\021" + "'", str17, "\001\021");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd\u02c0\ufffd\ufffd\007,");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "202" + "'", str5, "202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "183" + "'", str7, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "116" + "'", str9, "116");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("\005\ufffdQ\017q~\177\ufffd\025\ufffdM0");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24" + "'", str9, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "248" + "'", str13, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1658773598" + "'", str17, "1658773598");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001a" + "'", str15, "\001a");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "862" + "'", str17, "862");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "257" + "'", str21, "257");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("410");
        java.lang.String str13 = rSA1.encrypt("\004\004\ufffd\ufffd\u03bd\ufffd\u5c1c\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25222033811739908744600453450" + "'", str9, "25222033811739908744600453450");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "151406187171023831900282910110" + "'", str11, "151406187171023831900282910110");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "386347783480858509347381037137" + "'", str13, "386347783480858509347381037137");
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\n\ufffd0U");
        java.lang.String str17 = rSA1.decrypt("883");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\f" + "'", str9, "\f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K" + "'", str11, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "157" + "'", str15, "157");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd=");
        java.lang.String str11 = rSA1.decrypt("2142835345");
        java.lang.String str13 = rSA1.decrypt("272572964790671438795989253786");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "991768799" + "'", str9, "991768799");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\034" + "'", str13, "\ufffd\034");
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
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
        java.lang.String str23 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "598105655703987" + "'", str7, "598105655703987");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "632" + "'", str15, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "221" + "'", str19, "221");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002Z" + "'", str21, "\002Z");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12" + "'", str23, "12");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("2573327249882962");
        java.lang.String str15 = rSA1.encrypt("\036\002\ufffd*");
        java.lang.String str17 = rSA1.decrypt("402");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2383760382186246" + "'", str7, "2383760382186246");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "227" + "'", str15, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001s" + "'", str17, "\001s");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("753709548305681");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "701497562679058946623478884624" + "'", str3, "701497562679058946623478884624");
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.encrypt("884371775882389478461512527746");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "53323181896296002074556967584" + "'", str9, "53323181896296002074556967584");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "wx\023\ufffd\ufffd\ufffd\u0390" + "'", str11, "wx\023\ufffd\ufffd\ufffd\u0390");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "699953829262718352732815717225" + "'", str15, "699953829262718352732815717225");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "132996172203184715632009274013" + "'", str17, "132996172203184715632009274013");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.encrypt("4298658708");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "459971911347489694893102089402" + "'", str9, "459971911347489694893102089402");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "404782347324082161536816630755" + "'", str11, "404782347324082161536816630755");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "506108084685553753645830591241" + "'", str13, "506108084685553753645830591241");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "173310259581280352597197990420" + "'", str15, "173310259581280352597197990420");
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.decrypt("338");
        java.lang.String str17 = rSA1.decrypt("803592413162055");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "777895710523382" + "'", str7, "777895710523382");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\u046c\ufffd-" + "'", str15, "\001\ufffd\ufffd\u046c\ufffd-");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\033Vi" + "'", str17, "\001\ufffd\ufffd\033Vi");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
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
        java.lang.String str21 = rSA1.decrypt("617");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338592606353788510242030814837" + "'", str9, "338592606353788510242030814837");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "351708276341276651073775781501" + "'", str11, "351708276341276651073775781501");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "609550230579142972279873566145" + "'", str13, "609550230579142972279873566145");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\036\031\ufffd \013\ufffd2\f\u0260B" + "'", str15, "\004\036\031\ufffd \013\ufffd2\f\u0260B");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "56421092617512471022080471244" + "'", str17, "56421092617512471022080471244");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "196612432775680715213268825256" + "'", str19, "196612432775680715213268825256");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("1809985654975719");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "876493420" + "'", str7, "876493420");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "12367265890354098907409803013" + "'", str13, "12367265890354098907409803013");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
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
        rSA1.generateKeys((int) '4');
        java.lang.String str27 = rSA1.encrypt("1485351897609465");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "308251545622700104193722749679" + "'", str9, "308251545622700104193722749679");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "636400607270979883949183536865" + "'", str11, "636400607270979883949183536865");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "307021377573902507438973267923" + "'", str17, "307021377573902507438973267923");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97678328378368" + "'", str19, "97678328378368");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "190975645759379554338938394784" + "'", str21, "190975645759379554338938394784");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1430555247018875" + "'", str27, "1430555247018875");
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
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
        java.lang.String str25 = rSA1.decrypt("263991246368632398527497195960");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100955528836329044245572131885" + "'", str9, "100955528836329044245572131885");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\026\002\ufffd\ufffd\ufffd\005\ufffd?\024\ufffdZ\025" + "'", str11, "\n\026\002\ufffd\ufffd\ufffd\005\ufffd?\024\ufffdZ\025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "396258473599698389983289456818" + "'", str13, "396258473599698389983289456818");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "131997362150133" + "'", str19, "131997362150133");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\bT4\003\ufffd/" + "'", str21, "\bT4\003\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "883857143386830" + "'", str23, "883857143386830");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffdC\n\ufffd" + "'", str25, "\002\ufffdC\n\ufffd");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
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
        java.lang.String str23 = rSA1.encrypt("\t\ufffd\ufffd\030D\n^\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "273051541839802461575668126080" + "'", str9, "273051541839802461575668126080");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffdzY\"\ufffdN\\\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffdzY\"\ufffdN\\\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\u06b5\"\ufffd\ufffd\ufffd\ufffd\ufffd|" + "'", str15, "\005\ufffd\ufffd\u06b5\"\ufffd\ufffd\ufffd\ufffd\ufffd|");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "98931418801961999985553807578" + "'", str17, "98931418801961999985553807578");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "41876914044980653098472811123" + "'", str21, "41876914044980653098472811123");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "36860743232305702057555285239" + "'", str23, "36860743232305702057555285239");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("408136370941651");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "744553181753245" + "'", str7, "744553181753245");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\027\ufffd\037\ufffdf" + "'", str9, "\007\ufffd\027\ufffd\037\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3292738076650542" + "'", str11, "3292738076650542");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1271611482862721" + "'", str13, "1271611482862721");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2863891514736181" + "'", str15, "2863891514736181");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "378" + "'", str19, "378");
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.decrypt("204");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "763125610816303058292799253563" + "'", str9, "763125610816303058292799253563");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "544762991651490744088929461992" + "'", str11, "544762991651490744088929461992");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "558015455275570791857534589659" + "'", str13, "558015455275570791857534589659");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("2691002376090700");
        java.lang.String str15 = rSA1.encrypt("194926560872557477970272473809");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "11049074197" + "'", str15, "11049074197");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("523");
        java.lang.String str17 = rSA1.encrypt("\006\u07fd\ufffdb");
        java.lang.String str19 = rSA1.decrypt("267704433864514309265386076526");
        java.lang.String str21 = rSA1.decrypt("956224766");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\024" + "'", str11, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001m" + "'", str13, "\001m");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "236" + "'", str17, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "%" + "'", str21, "%");
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2744819448260233" + "'", str7, "2744819448260233");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "334499025335520179016368522023" + "'", str13, "334499025335520179016368522023");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4454339110636481385530455298" + "'", str23, "4454339110636481385530455298");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u047e\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\u047e\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "803419458937084" + "'", str7, "803419458937084");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3884598150" + "'", str13, "3884598150");
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.decrypt("192");
        java.lang.String str11 = rSA1.decrypt("151464558644061297306368349467");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1353714000542221" + "'", str7, "1353714000542221");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\033\ufffd" + "'", str9, "\006\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\025\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\025\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380851960628056885845691330455" + "'", str9, "380851960628056885845691330455");
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
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
        java.lang.String str23 = rSA1.encrypt("628721392023099021090119745452");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001w" + "'", str15, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "195" + "'", str17, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "131" + "'", str21, "131");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "22" + "'", str23, "22");
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "162391157898773390108670738908" + "'", str9, "162391157898773390108670738908");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "634876432268655966356258405731" + "'", str11, "634876432268655966356258405731");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\u03b0\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\u03b0\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\035@%-" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffd\035@%-");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "464964984670568511327052328173" + "'", str17, "464964984670568511327052328173");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\355\ufffd*\004\ufffd\000b" + "'", str19, "\003\ufffd\ufffd\355\ufffd*\004\ufffd\000b");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
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
        java.lang.String str29 = rSA1.encrypt("107254835868444");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.decrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "478619280703678070562629999877" + "'", str9, "478619280703678070562629999877");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "431259237217094927665601572098" + "'", str11, "431259237217094927665601572098");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "223415022235160364280841792681" + "'", str13, "223415022235160364280841792681");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "489" + "'", str17, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001~" + "'", str19, "\001~");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "476" + "'", str21, "476");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "216865096269971114383306721510" + "'", str25, "216865096269971114383306721510");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "154261675150279921076022753152" + "'", str27, "154261675150279921076022753152");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "330121970029027181134593559" + "'", str29, "330121970029027181134593559");
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "369233436564749403800644552817" + "'", str9, "369233436564749403800644552817");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\006\ufffd\023\ufffd\ufffd\ufffdt" + "'", str11, "\001\ufffd\006\ufffd\023\ufffd\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "39865568459108904083090847322" + "'", str13, "39865568459108904083090847322");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "562878829663703297188363839184" + "'", str15, "562878829663703297188363839184");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "269825167230660808542697502209" + "'", str17, "269825167230660808542697502209");
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.encrypt("315");
        java.lang.String str15 = rSA1.encrypt("136");
        java.lang.String str17 = rSA1.decrypt("374013126959508333375475409205");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101921535994725989" + "'", str11, "101921535994725989");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "128908164156174259647479073439" + "'", str13, "128908164156174259647479073439");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "489658855928063175268380441193" + "'", str15, "489658855928063175268380441193");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffda\n\ufffd\034\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffda\n\ufffd\034\ufffd\ufffd");
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("1324891368150122");
        java.lang.String str13 = rSA1.encrypt("6543839260");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "F" + "'", str7, "F");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdU}J" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdU}J");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "533734384514069948763005412751" + "'", str13, "533734384514069948763005412751");
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
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
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2403513462186113" + "'", str7, "2403513462186113");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "371" + "'", str19, "371");
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1616621759988711" + "'", str7, "1616621759988711");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "276432993697419" + "'", str13, "276432993697419");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\032\ufffd\177\000o" + "'", str15, "\001\ufffd\032\ufffd\177\000o");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd}\006\ufffd" + "'", str17, "\003\ufffd\ufffd}\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\033\ufffd\ufffd" + "'", str23, "\002\033\ufffd\ufffd");
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.decrypt("222526935773735097246987832908");
        rSA1.generateKeys((int) 'a');
        java.lang.String str23 = rSA1.decrypt("34");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\007" + "'", str13, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "141" + "'", str15, "141");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\036" + "'", str19, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\005\024\ufffd" + "'", str23, "\ufffd\ufffd\ufffd\ufffd\ufffd\005\024\ufffd");
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1927427079013891");
        java.lang.String str15 = rSA1.encrypt("465665931060405");
        java.lang.String str17 = rSA1.encrypt("791687511000922907273420655928");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\022" + "'", str13, "\002\022");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "373" + "'", str15, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "115" + "'", str17, "115");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1264959540976456" + "'", str7, "1264959540976456");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffdv\025\ufffd" + "'", str15, "\b\ufffd\ufffd\ufffd\ufffdv\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42362846909373312512" + "'", str17, "42362846909373312512");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "617068496429847816232649230603" + "'", str19, "617068496429847816232649230603");
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("805201222");
        java.lang.String str17 = rSA1.decrypt("190909499700954940974517533928");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "318886196937190592188045935684" + "'", str9, "318886196937190592188045935684");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "488822198133057660838874283301" + "'", str11, "488822198133057660838874283301");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd0\003\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd0\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\026\f\ufffd\ufffd\ufffd\ufffd\ufffd(" + "'", str15, "\003\026\f\ufffd\ufffd\ufffd\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\uf8db\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd\uf8db\ufffd\ufffd");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44818909021955029645728268174" + "'", str9, "44818909021955029645728268174");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004u7\177\ufffd\023\ufffd\ufffd\ufffd\016\ufffdp" + "'", str11, "\004u7\177\ufffd\023\ufffd\ufffd\ufffd\016\ufffdp");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("96549157373046875");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4760152418" + "'", str7, "4760152418");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4415080663" + "'", str9, "4415080663");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\025\027#" + "'", str11, "\001\ufffd\025\027#");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "898971399" + "'", str13, "898971399");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffdQ\001\ufffd" + "'", str17, "\003\ufffd\ufffdQ\001\ufffd");
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
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
        java.lang.String str25 = rSA1.encrypt("16283246214");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\021\ufffd\ufffd\ufffdL#p\005\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?F?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1818392734585378" + "'", str7, "1818392734585378");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237" + "'", str11, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "263" + "'", str19, "263");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "116" + "'", str21, "116");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1475158250" + "'", str25, "1475158250");
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Q\n\032\ufffdg\025\ufffd\002\ufffd\ufffd" + "'", str11, "Q\n\032\ufffdg\025\ufffd\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19489956374496936466969450207" + "'", str13, "19489956374496936466969450207");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "27631638212359355712168432282" + "'", str15, "27631638212359355712168432282");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\026\ufffd\ufffdH" + "'", str19, "\026\ufffd\ufffdH");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
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
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1681251736086311581743281455" + "'", str9, "1681251736086311581743281455");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\017\ufffd\031\020\ufffd\ufffd\u0532" + "'", str11, "\002\ufffd\ufffd\017\ufffd\031\020\ufffd\ufffd\u0532");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "568416855704215596456402520351" + "'", str13, "568416855704215596456402520351");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "259085112572200285566694325916" + "'", str15, "259085112572200285566694325916");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "190229276034897942000934319983" + "'", str17, "190229276034897942000934319983");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "124053804750455004283425878103" + "'", str19, "124053804750455004283425878103");
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17" + "'", str3, "17");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("M\021\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1193236555777009" + "'", str5, "1193236555777009");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1727683428328124" + "'", str7, "1727683428328124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd4\036\ufffd\005\ufffd" + "'", str9, "\004\ufffd4\036\ufffd\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\003\ufffd\ufffdf" + "'", str11, "\001\ufffd\003\ufffd\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\024" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\024");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10376710340369" + "'", str15, "10376710340369");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1111166250865836");
        java.lang.String str13 = rSA1.encrypt("2865686058123530968401380793");
        java.lang.String str15 = rSA1.encrypt("703853965437422169290837252602");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001w" + "'", str7, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "664" + "'", str9, "664");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "929" + "'", str11, "929");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "277" + "'", str13, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "833" + "'", str15, "833");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        java.lang.String str17 = rSA1.decrypt("285094131110099573481526081520");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffdI\\\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffdI\\\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffdu\025\u07d1\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffdu\025\u07d1\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.encrypt("\002<|\031\016\ufffdt");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("27");
        java.lang.String str15 = rSA1.decrypt("942602395272077");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "83" + "'", str9, "83");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003" + "'", str13, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "&\022\ufffd\ufffd\ufffd\ufffd\u06ceZd_" + "'", str15, "&\022\ufffd\ufffd\ufffd\ufffd\u06ceZd_");
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("813206094276231374379760053937");
        java.lang.String str13 = rSA1.decrypt("342");
        java.lang.String str15 = rSA1.encrypt("41020759083851174566306088014");
        java.lang.String str17 = rSA1.decrypt("868686659940924");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2312644059646615" + "'", str7, "2312644059646615");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\036\ufffdu" + "'", str11, "\000\ufffd\036\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hb\037\"" + "'", str13, "hb\037\"");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "53015539" + "'", str15, "53015539");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\035\ufffd" + "'", str17, "\000\ufffd\ufffd\035\ufffd");
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\000\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "320" + "'", str17, "320");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "320" + "'", str19, "320");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001a" + "'", str15, "\001a");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "862" + "'", str17, "862");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "257" + "'", str21, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "180" + "'", str23, "180");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.decrypt("823");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1442451205912677" + "'", str7, "1442451205912677");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\035" + "'", str11, "\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdp!" + "'", str13, "\ufffdp!");
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
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
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "378996316094449171169805128684" + "'", str9, "378996316094449171169805128684");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "740480002626146906274116441753" + "'", str13, "740480002626146906274116441753");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "914870765934365" + "'", str19, "914870765934365");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "529348238969765455803927692866" + "'", str9, "529348238969765455803927692866");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "418939358399199488002336499975" + "'", str11, "418939358399199488002336499975");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "505607988978093712813885902321" + "'", str13, "505607988978093712813885902321");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "54" + "'", str17, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "367" + "'", str21, "367");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "222" + "'", str23, "222");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "380204032" + "'", str11, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "911090735005024225148480398665" + "'", str13, "911090735005024225148480398665");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "47" + "'", str13, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "304519043378681877930608182340" + "'", str17, "304519043378681877930608182340");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "140747174642047984786514963029" + "'", str19, "140747174642047984786514963029");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "303" + "'", str25, "303");
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("169979458167342652716591007703");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str21 = rSA1.decrypt("292956968754025");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "147123426183145477021921638210" + "'", str9, "147123426183145477021921638210");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "232848091274843925942291845967" + "'", str11, "232848091274843925942291845967");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "516658321736835734876287148460" + "'", str13, "516658321736835734876287148460");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\000\u0610\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\000\u0610\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23348713980046694510158100078" + "'", str17, "23348713980046694510158100078");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("569046855107122163755734229680");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "268" + "'", str9, "268");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "283" + "'", str13, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "600347226025669140621103649673" + "'", str9, "600347226025669140621103649673");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "301131416627334928587265143452" + "'", str11, "301131416627334928587265143452");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7225993539" + "'", str15, "7225993539");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "#" + "'", str17, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12123156199" + "'", str19, "12123156199");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("308422204620092985527502288542");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffdE");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\034\ufffd\ufffdH\002\ufffdJE\"\ufffd" + "'", str3, "\003\034\ufffd\ufffdH\002\ufffdJE\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "215718395834702815808161978021" + "'", str5, "215718395834702815808161978021");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "80209974535533242242556107103" + "'", str7, "80209974535533242242556107103");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004z\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004z\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "275743885243935366171383217535" + "'", str11, "275743885243935366171383217535");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "245570757349081600048518123241" + "'", str13, "245570757349081600048518123241");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("515");
        java.lang.String str13 = rSA1.decrypt("1254984174338675");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.decrypt("1198965058209000");
        java.lang.String str7 = rSA1.decrypt("37805074531238270313");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9920643347438226355690831089" + "'", str3, "9920643347438226355690831089");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006\ufffd\024\ufffd\ufffd\034\ufffd\ufffd\ufffd" + "'", str5, "\006\ufffd\024\ufffd\ufffd\034\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "369" + "'", str7, "369");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
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
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "727381430657332" + "'", str7, "727381430657332");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1204941364807954" + "'", str13, "1204941364807954");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "221" + "'", str19, "221");
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.decrypt("211673788539744279696210156906");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "?\005\ufffd\ufffd" + "'", str7, "?\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\u063a" + "'", str9, "\000\ufffd\ufffd\u063a");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("451850837066694558586623217114");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "474432693855242563895636423572" + "'", str9, "474432693855242563895636423572");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "474432693855242563895636423572" + "'", str11, "474432693855242563895636423572");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\035\ufffdX\016\ufffd\ufffd\024\ufffd\ufffd" + "'", str13, "\001\ufffd\035\ufffdX\016\ufffd\ufffd\024\ufffd\ufffd");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
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
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "153575799660481" + "'", str13, "153575799660481");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\027\004\ufffd\ufffd" + "'", str15, "\005\027\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd");
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.String str15 = rSA1.decrypt("3938980639167");
        java.lang.String str17 = rSA1.decrypt("775860831955899");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "846594792882505131339299714258" + "'", str9, "846594792882505131339299714258");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "346693206643740465158187846851" + "'", str11, "346693206643740465158187846851");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1131804572340267737334062528637" + "'", str13, "1131804572340267737334062528637");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\033\ufffd\ufffd\u07e5\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\b\033\ufffd\ufffd\u07e5\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd~\bn" + "'", str17, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd~\bn");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2423774353418425" + "'", str11, "2423774353418425");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.decrypt("28100933696926471903600515426");
        rSA1.generateKeys(10);
        java.lang.String str21 = rSA1.encrypt("2296355595");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "511518134718530122961841816794" + "'", str9, "511518134718530122961841816794");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "334333300469243850206412048385" + "'", str11, "334333300469243850206412048385");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "197" + "'", str21, "197");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\002\ufffd\006\ufffd\007\ufffd\ufffd\021\n\ufffd\ufffd" + "'", str13, "\002\002\ufffd\006\ufffd\007\ufffd\ufffd\021\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "644327044464233694240660097880" + "'", str15, "644327044464233694240660097880");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "471847235993371382949131448815" + "'", str17, "471847235993371382949131448815");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "332135733490119553029970407756" + "'", str19, "332135733490119553029970407756");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
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
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "108722538920771011354156006427" + "'", str9, "108722538920771011354156006427");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\u03fe\ufffd\035R\\\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\u03fe\ufffd\035R\\\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ua054\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ua054\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\005\ufffd\ufffd\000" + "'", str17, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\005\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "500" + "'", str21, "500");
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
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
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2308040798101167" + "'", str7, "2308040798101167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002z\\8q" + "'", str15, "\002z\\8q");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\b\ufffd\ufffd\u073d\ufffd\ufffd\ufffd" + "'", str21, "\b\ufffd\ufffd\u073d\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "410204436911982764542588516153" + "'", str23, "410204436911982764542588516153");
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("9915219130");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "101203733230012" + "'", str7, "101203733230012");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd6\027." + "'", str13, "\001\ufffd6\027.");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
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
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "389401216031465731735201534128" + "'", str9, "389401216031465731735201534128");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "519555083146039844880986447685" + "'", str11, "519555083146039844880986447685");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "295157346448282457913208048856" + "'", str13, "295157346448282457913208048856");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "409" + "'", str17, "409");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "486" + "'", str21, "486");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        java.lang.String str15 = rSA1.encrypt("575730631187720402467793207691");
        java.lang.String str17 = rSA1.decrypt("27408057193820683014729311582");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "504620162102307551452014088950" + "'", str9, "504620162102307551452014088950");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\003\ufffdAR\r\ufffdK " + "'", str11, "\004\ufffd\003\ufffdAR\r\ufffdK ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "457360748789338383232494017715" + "'", str15, "457360748789338383232494017715");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\u03fd+8\r\ufffd8" + "'", str17, "\007\u03fd+8\r\ufffd8");
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("576088999918603768472696909496");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.encrypt("\002\007\ufffd\ufffd\ud7ea");
        java.lang.String str7 = rSA1.encrypt("7003277238");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4807315391" + "'", str3, "4807315391");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10529598849" + "'", str5, "10529598849");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1613433154" + "'", str7, "1613433154");
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("806729601483697513872336243167");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002z\024\ufffdB&\024\ufffd\033\005\ufffd`5" + "'", str3, "\002z\024\ufffdB&\024\ufffd\033\005\ufffd`5");
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("698511809473640");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7700554303" + "'", str3, "7700554303");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9484102271" + "'", str7, "9484102271");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd$)" + "'", str9, "\000\ufffd\ufffd$)");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "754970040323951866899182713819" + "'", str13, "754970040323951866899182713819");
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001a" + "'", str15, "\001a");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "862" + "'", str17, "862");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "257" + "'", str21, "257");
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\005" + "'", str7, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "77" + "'", str11, "77");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.decrypt("542787756366693653966002416522");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "471" + "'", str9, "471");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002K" + "'", str11, "\002K");
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.decrypt("394641110643206533541912183688");
        java.lang.String str15 = rSA1.encrypt("215143892951143045749748229813");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "299" + "'", str7, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004" + "'", str11, "\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31" + "'", str15, "31");
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\021\ufffd");
        java.lang.String str17 = rSA1.encrypt("\004\035\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a" + "'", str11, "a");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "252" + "'", str15, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "63" + "'", str17, "63");
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "456" + "'", str9, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("289013563216973");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2231876555567025" + "'", str7, "2231876555567025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "305067119901668794524872635913" + "'", str13, "305067119901668794524872635913");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001e" + "'", str17, "\001e");
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\004" + "'", str15, "\001\004");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "297" + "'", str17, "297");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "151" + "'", str19, "151");
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("\ufffd.t");
        java.lang.String str17 = rSA1.encrypt("*+\002\ufffdg\032\ufffd\ufffd\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "234" + "'", str11, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2037220987" + "'", str15, "2037220987");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1413012078" + "'", str17, "1413012078");
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
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
        java.lang.String str31 = rSA1.encrypt("310");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "500293142303013595828525623794" + "'", str9, "500293142303013595828525623794");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "500293142303013595828525623794" + "'", str11, "500293142303013595828525623794");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd0\006\ufffd\ufffd\001\ufffdR" + "'", str13, "\005\ufffd0\006\ufffd\ufffd\001\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "496758726422464438234707400709" + "'", str15, "496758726422464438234707400709");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001(\025\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001(\025\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "28727489951008120631447527335" + "'", str21, "28727489951008120631447527335");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "125600302389143129021996711146" + "'", str23, "125600302389143129021996711146");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\002f" + "'", str29, "\002f");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "241" + "'", str31, "241");
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\006\016\ufffd\ufffda2");
        java.lang.String str17 = rSA1.encrypt("282");
        java.lang.String str19 = rSA1.encrypt("\030\ufffd7*\024\024\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\037\ufffd[\\\ufffd" + "'", str11, "\004\ufffd\ufffd\037\ufffd[\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "85151867389331237970735094407" + "'", str13, "85151867389331237970735094407");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "62645980000641455732212916040" + "'", str15, "62645980000641455732212916040");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "137060463698445766996731664580" + "'", str17, "137060463698445766996731664580");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "113610302307060323379888183886" + "'", str19, "113610302307060323379888183886");
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.decrypt("583253898306406");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "204" + "'", str11, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "463" + "'", str13, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
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
        java.lang.String str27 = rSA1.decrypt("159324186965374018993794128375");
        java.lang.String str29 = rSA1.encrypt("595214886010763");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1802756608440849" + "'", str7, "1802756608440849");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001U" + "'", str19, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "233" + "'", str21, "233");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd" + "'", str27, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "181" + "'", str29, "181");
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "206914786449811535961651289428" + "'", str9, "206914786449811535961651289428");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23133243939758190023204989642" + "'", str11, "23133243939758190023204989642");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "149112170910729732758163421905" + "'", str13, "149112170910729732758163421905");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\007*\001\033\ufffd\ufffd\ufffd\ufffd%." + "'", str15, "\002\007*\001\033\ufffd\ufffd\ufffd\ufffd%.");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "117454749159003094777927479094" + "'", str17, "117454749159003094777927479094");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "395399536300637475545520232762" + "'", str19, "395399536300637475545520232762");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?" + "'", str21, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd?");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "25916553769698331039857329884" + "'", str23, "25916553769698331039857329884");
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
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
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\004\ufffd\ufffdD2 \026");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?/U>\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\f\u0428\ufffd\021" + "'", str13, "\001\ufffd\f\u0428\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "726467325969485" + "'", str15, "726467325969485");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1668407010211685" + "'", str17, "1668407010211685");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("432268551667889026451279149775");
        java.lang.String str11 = rSA1.decrypt("67255654729147995743857032941");
        java.lang.String str13 = rSA1.encrypt("90158492089125200430849511322");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\037\ufffd" + "'", str9, "\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "q\t\ufffd\007" + "'", str11, "q\t\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "822003896" + "'", str13, "822003896");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("2279400941187448");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("\006\027\ufffd\ufffd\033\ufffd\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "977316923586410" + "'", str7, "977316923586410");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "139485231946720412147385909921" + "'", str13, "139485231946720412147385909921");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4547696178201553139418009600" + "'", str19, "4547696178201553139418009600");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "861533347905509" + "'", str5, "861533347905509");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2269874696138999" + "'", str7, "2269874696138999");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\u0284\ufffd" + "'", str9, "\004\ufffd\u0284\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1088716120599059" + "'", str11, "1088716120599059");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
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
        java.lang.String str25 = rSA1.decrypt("348571328638567086409748209952");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "610820365292736426330989401659" + "'", str9, "610820365292736426330989401659");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffdQ+<" + "'", str11, "\001\ufffd\ufffdQ+<");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "111711531616768996337074637196" + "'", str13, "111711531616768996337074637196");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "534005080519620" + "'", str19, "534005080519620");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\b\ufffd\ufffd\ufffd" + "'", str21, "\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005\ufffd\177\ufffd\u02a5" + "'", str23, "\005\ufffd\177\ufffd\u02a5");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd\u04c9" + "'", str25, "\001\ufffd\ufffd\u04c9");
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("1534903236613159");
        java.lang.String str7 = rSA1.encrypt("\001\u029c\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\006\ufffd\u01db");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "325482877675198791569594012101" + "'", str3, "325482877675198791569594012101");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\004\ufffdt\007\ufffd\ufffd\ufffd\ufffd$\0072" + "'", str5, "\004\ufffdt\007\ufffd\ufffd\ufffd\ufffd$\0072");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "291815711219884180767680639396" + "'", str7, "291815711219884180767680639396");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338453012347857671619840299171" + "'", str9, "338453012347857671619840299171");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "239794384834334" + "'", str7, "239794384834334");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\016\ufffd\013\ufffd\ufffd\ufffd\005\ufffd\ufffd[" + "'", str19, "\002\ufffd\016\ufffd\013\ufffd\ufffd\ufffd\005\ufffd\ufffd[");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
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
        java.lang.String str25 = rSA1.decrypt("24347782930095355056301782619");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1587379314131740" + "'", str7, "1587379314131740");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "312" + "'", str15, "312");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "317" + "'", str19, "317");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "369" + "'", str21, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001R" + "'", str23, "\001R");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001%" + "'", str25, "\001%");
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "14704350098324090839667061778" + "'", str9, "14704350098324090839667061778");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\b\"\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\b\"\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "862331386358308103235584819506" + "'", str13, "862331386358308103235584819506");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\u0722\ufffd\ufffd\ufffd\020e\007\034<" + "'", str15, "\n\u0722\ufffd\ufffd\ufffd\020e\007\034<");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6009050989" + "'", str19, "6009050989");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
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
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "63077744878246918067335454728" + "'", str9, "63077744878246918067335454728");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd}" + "'", str11, "\005\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "428454414973863167568001177766" + "'", str13, "428454414973863167568001177766");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffdBD\003\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffdBD\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "75665654874278317209651267988" + "'", str17, "75665654874278317209651267988");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "18768892602747341913053642746" + "'", str21, "18768892602747341913053642746");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffdZ" + "'", str25, "\000\ufffd\ufffdZ");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd\000\ufffd" + "'", str27, "\000\ufffd\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1139289583567605" + "'", str7, "1139289583567605");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "137" + "'", str17, "137");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "174" + "'", str19, "174");
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
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
        java.lang.String str21 = rSA1.encrypt("12837301271978823652881043010");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "323646147872427458067896996340" + "'", str9, "323646147872427458067896996340");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\u0608\002\ufffd\ufffd\035\ufffd\ufffdVU8" + "'", str11, "\004\ufffd\u0608\002\ufffd\ufffd\035\ufffd\ufffdVU8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "138901598124130597951461910915" + "'", str13, "138901598124130597951461910915");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "415508391117727431091785181466" + "'", str15, "415508391117727431091785181466");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "33427634958521909987197222711" + "'", str17, "33427634958521909987197222711");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "124087172694972728028942786514" + "'", str19, "124087172694972728028942786514");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "333120006007968731466079757261" + "'", str21, "333120006007968731466079757261");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("325053041126851022637890970422");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffdK\020\ufffdX");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????G??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0017\013\ufffd\013" + "'", str5, "\0017\013\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\u03d9\ufffd\ufffd\ufffdE" + "'", str9, "\007\ufffd\ufffd\ufffd\ufffd\u03d9\ufffd\ufffd\ufffdE");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "309426479664986437750311049774" + "'", str11, "309426479664986437750311049774");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "665257131205122637977704185970" + "'", str13, "665257131205122637977704185970");
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("96");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19" + "'", str3, "19");
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("22369983321637");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd,\000\ufffd");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "499087659361430" + "'", str15, "499087659361430");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2293490404859622" + "'", str17, "2293490404859622");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\031]k");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7124789478" + "'", str3, "7124789478");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4789575163" + "'", str7, "4789575163");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9025120" + "'", str9, "9025120");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "173" + "'", str15, "173");
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("370");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ud8de\udc8d\u015d");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("'a\004\030\u03d7\ufffd\004\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"'a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`{" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdK\034" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdK\034");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "353258544899106014426755580273" + "'", str17, "353258544899106014426755580273");
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("441737597486003899578395714219");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\u052a\ufffd\ufffd\ufffd\004" + "'", str3, "\003\u052a\ufffd\ufffd\ufffd\004");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "552057372326607" + "'", str5, "552057372326607");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "208564267781110" + "'", str7, "208564267781110");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "735388561631086261807196648835" + "'", str13, "735388561631086261807196648835");
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str17 = rSA1.encrypt("73");
        java.lang.String str19 = rSA1.encrypt("\001\032");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "704589110496068351330489057199" + "'", str9, "704589110496068351330489057199");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\u62b4\ufffd\u037f" + "'", str11, "\005\ufffd\u62b4\ufffd\u037f");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "16565318866191230299678685314" + "'", str15, "16565318866191230299678685314");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "563461804751933959651" + "'", str17, "563461804751933959651");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1783386774432" + "'", str19, "1783386774432");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "481" + "'", str15, "481");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "70" + "'", str17, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2290848969" + "'", str21, "2290848969");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",2}D" + "'", str23, ",2}D");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd" + "'", str25, "\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
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
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "736721796087114" + "'", str7, "736721796087114");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1040839096" + "'", str11, "1040839096");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\037\ufffd\ufffd\020" + "'", str13, "\037\ufffd\ufffd\020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "634272258" + "'", str15, "634272258");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1885454798" + "'", str19, "1885454798");
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
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
        java.lang.String str21 = rSA1.decrypt("692");
        java.lang.String str23 = rSA1.decrypt("1126558764");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1416096663880360" + "'", str7, "1416096663880360");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\036}\013" + "'", str9, "\006\ufffd\ufffd\036}\013");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "937964162722975" + "'", str15, "937964162722975");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "265" + "'", str19, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\003" + "'", str21, "\001\003");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "!" + "'", str23, "!");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
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
        java.lang.String str23 = rSA1.encrypt("406");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "206397379215681223068975313422" + "'", str9, "206397379215681223068975313422");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97330975982653729159450707500" + "'", str11, "97330975982653729159450707500");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffdc" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\036\ufffd\ufffd<d" + "'", str17, "\036\ufffd\ufffd<d");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "71" + "'", str21, "71");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "389" + "'", str23, "389");
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("730903677901316255479995383411");
        java.lang.String str17 = rSA1.encrypt("2566593727806295");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\037\ufffd\u05ef\ufffd" + "'", str3, "\006\037\ufffd\u05ef\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "329698061348848" + "'", str5, "329698061348848");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1411698791451205" + "'", str7, "1411698791451205");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\0043,\177\ufffd\ufffd" + "'", str9, "\0043,\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "575547482049849" + "'", str11, "575547482049849");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "24142193165886673466933683981" + "'", str15, "24142193165886673466933683981");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "27014134577494837255732022233" + "'", str17, "27014134577494837255732022233");
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4426954283" + "'", str3, "4426954283");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4918648316" + "'", str7, "4918648316");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "413530087" + "'", str9, "413530087");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9293460703" + "'", str11, "9293460703");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("751825890355339584418475310521");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14210906997" + "'", str3, "14210906997");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "13333094731" + "'", str7, "13333094731");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("726538495898349057827372017464");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t" + "'", str7, "\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "S" + "'", str9, "S");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0016" + "'", str11, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "279" + "'", str15, "279");
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\021\ufffd\030^");
        java.lang.String str13 = rSA1.decrypt("122539253301091745680483609109");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd" + "'", str7, "\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2250635971" + "'", str9, "2250635971");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5819817069" + "'", str11, "5819817069");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\f\177H" + "'", str13, "\000\ufffd\f\177H");
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("380423421443618706983369572489");
        java.lang.String str19 = rSA1.decrypt("2262127258");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "448382684726755" + "'", str7, "448382684726755");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46714735808755702797965455714" + "'", str13, "46714735808755702797965455714");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1429843159" + "'", str17, "1429843159");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd" + "'", str19, "\ufffd");
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1111166250865836");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\177" + "'", str7, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "278" + "'", str11, "278");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.lang.String str11 = rSA1.decrypt("46925933906613754914094402908");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "328215205931063100278616134829" + "'", str9, "328215205931063100278616134829");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffdu>~1?+CCC" + "'", str11, "\002\ufffdu>~1?+CCC");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffdDsw\021W;K");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2697882933" + "'", str3, "2697882933");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3540783383" + "'", str5, "3540783383");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2346624013" + "'", str7, "2346624013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\031I" + "'", str9, "\000\ufffd\ufffd\031I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1215583419" + "'", str11, "1215583419");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
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
        java.lang.String str23 = rSA1.encrypt("8\036Ay\f\ufffdR<n\024\b\027");
        java.lang.String str25 = rSA1.decrypt("171637622630321055768329963023");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "846441165417444577848202754528" + "'", str9, "846441165417444577848202754528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007" + "'", str11, "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "937578509122917598621826251190" + "'", str13, "937578509122917598621826251190");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\n\ufffd\ufffd\ufffd\ufffd-\177\ufffd\ufffd" + "'", str15, "\003\ufffd\n\ufffd\ufffd\ufffd\ufffd-\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9726013857748955424447620566" + "'", str17, "9726013857748955424447620566");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "14251116929972070016835037949" + "'", str21, "14251116929972070016835037949");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "13366986209434170618355995076" + "'", str23, "13366986209434170618355995076");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\034ah\002\ufffd\ufffd\ufffd" + "'", str25, "\ufffd\ufffd\034ah\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("470860891773042");
        java.lang.String str9 = rSA1.decrypt("10");
        java.lang.String str11 = rSA1.encrypt("456915798193527501688717312948");
        java.lang.String str13 = rSA1.decrypt("2234525096067495");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\ufffd\u0179" + "'", str7, "\t\ufffd\ufffd\u0179");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1252348828666865" + "'", str11, "1252348828666865");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\u01de\ufffdM" + "'", str13, "\004\ufffd\u01de\ufffdM");
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("2645095105545624");
        java.lang.String str17 = rSA1.decrypt("28100933696926471903600515426");
        java.lang.String str19 = rSA1.encrypt("175034602682797");
        java.lang.String str21 = rSA1.decrypt("1926837195046224");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "369103338147993949070243560450" + "'", str9, "369103338147993949070243560450");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "83400531943224836948990330936" + "'", str11, "83400531943224836948990330936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd+" + "'", str15, "\005\ufffd\ufffd+");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\024\ufffd\ufffd0\022" + "'", str17, "\005\024\ufffd\ufffd0\022");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1180131200138578" + "'", str19, "1180131200138578");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.decrypt("914181283893724");
        java.lang.String str13 = rSA1.decrypt("406886696867962475347512808088");
        java.lang.String str15 = rSA1.encrypt("\n\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("1832517406456917");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001v" + "'", str13, "\001v");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "323" + "'", str15, "323");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "438" + "'", str17, "438");
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.decrypt("394641110643206533541912183688");
        java.lang.String str15 = rSA1.encrypt("215143892951143045749748229813");
        java.lang.String str17 = rSA1.encrypt("\007;\026J\033\ufffd\ufffd\ufffd\t\ufffd\003\ufffd");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd*");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\035" + "'", str5, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "502" + "'", str15, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "399" + "'", str17, "399");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "402" + "'", str19, "402");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "257719516" + "'", str5, "257719516");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1047010666" + "'", str7, "1047010666");
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("35600054765755498264");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("g");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"g\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "27481746014650983133202300401" + "'", str3, "27481746014650983133202300401");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "226" + "'", str5, "226");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "492194501770192839254888441298" + "'", str9, "492194501770192839254888441298");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u9245\u07b4" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u9245\u07b4");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "107681470306794682567759660344" + "'", str13, "107681470306794682567759660344");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd\000" + "'", str15, "\004\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "105706264945063702816382119539" + "'", str17, "105706264945063702816382119539");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "14093536544607164219670762197" + "'", str21, "14093536544607164219670762197");
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
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
        java.lang.String str21 = rSA1.encrypt("290119421");
        java.lang.String str23 = rSA1.decrypt("405173248458375494721427708460");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "471" + "'", str9, "471");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001+" + "'", str15, "\001+");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "181344857" + "'", str21, "181344857");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\035\ufffd\ufffd" + "'", str23, "\035\ufffd\ufffd");
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.decrypt("1792074056760905");
        java.lang.String str13 = rSA1.encrypt("-");
        java.lang.String str15 = rSA1.encrypt("593904299716151995306964564094");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd$o\013");
        java.lang.String str19 = rSA1.encrypt("456351013126802");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "91125" + "'", str13, "91125");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "185092629235859845103837287782" + "'", str15, "185092629235859845103837287782");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "429252786434039995290214404418" + "'", str17, "429252786434039995290214404418");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "175399964095158370321688955290" + "'", str19, "175399964095158370321688955290");
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
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
        java.lang.String str23 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0574");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "582" + "'", str11, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\013" + "'", str13, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "742" + "'", str15, "742");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "157" + "'", str17, "157");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\021\"\ufffd" + "'", str21, "\021\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "537029677" + "'", str23, "537029677");
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "95814295750811400973752165954" + "'", str9, "95814295750811400973752165954");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\u0383\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\u0383\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "316556837086675697345159955301" + "'", str13, "316556837086675697345159955301");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\u04e1\ufffd\ufffd" + "'", str15, "\b\ufffd\ufffd\ufffd\ufffd\u04e1\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "677926721043663639129913857468" + "'", str17, "677926721043663639129913857468");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "12708361651981479784394563232" + "'", str21, "12708361651981479784394563232");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "6723475812031390210508604632" + "'", str23, "6723475812031390210508604632");
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\b\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("468444835375607536399600772861");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1796477021378129" + "'", str7, "1796477021378129");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "71" + "'", str15, "71");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "201" + "'", str17, "201");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "203927028926353671009694759117" + "'", str9, "203927028926353671009694759117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffdqi\031\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffdqi\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "664103714708458166773543807677" + "'", str13, "664103714708458166773543807677");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`\"D" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd`\"D");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18629233676075082624631825023" + "'", str17, "18629233676075082624631825023");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "25593277872834088928288941710" + "'", str21, "25593277872834088928288941710");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\005IY\013" + "'", str25, "\002\005IY\013");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\u03e0\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "158" + "'", str9, "158");
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
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
        java.lang.String str21 = rSA1.decrypt("964314961740013");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "44887191280223429879733997615" + "'", str9, "44887191280223429879733997615");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44887191280223429879733997615" + "'", str11, "44887191280223429879733997615");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "305836359195829530265534097651" + "'", str15, "305836359195829530265534097651");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdn\026\033\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdn\026\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5169901790773646531263270410" + "'", str19, "5169901790773646531263270410");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd |" + "'", str21, "\003\ufffd\ufffd\ufffd\ufffd |");
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\001\u011d\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4392209305" + "'", str3, "4392209305");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4562681624" + "'", str7, "4562681624");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7160350427" + "'", str11, "7160350427");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("65");
        java.lang.String str9 = rSA1.decrypt("126333523926733107924820156637");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "210349677915526113240645520172" + "'", str3, "210349677915526113240645520172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\004\ufffd\ufffd" + "'", str7, "\001\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\u03a5\ufffd." + "'", str9, "\001\u03a5\ufffd.");
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
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
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str29 = rSA1.decrypt("707565420408485886187005835264");
        java.lang.Class<?> wildcardClass30 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "682703810214218750825803550207" + "'", str9, "682703810214218750825803550207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "682703810214218750825803550207" + "'", str11, "682703810214218750825803550207");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd'\250\032\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd'\250\032\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "364393719063032335482585438481" + "'", str15, "364393719063032335482585438481");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\177\ufffdT\026\ufffd\ufffd\ufffd" + "'", str21, "\000\ufffd\177\ufffdT\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdI]=\r\ufffd\ufffd\007" + "'", str23, "\000\ufffd\ufffd\ufffd\ufffdI]=\r\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\f" + "'", str29, "\006\ufffd\ufffd\ufffd\ufffd\f");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.encrypt("\035AAd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "193" + "'", str7, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "86" + "'", str13, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "251" + "'", str15, "251");
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
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
        rSA1.generateKeys(100);
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "30768540091527817547701778355" + "'", str9, "30768540091527817547701778355");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\u0623\ufffd\ufffd\ufffda" + "'", str11, "\003\ufffd\ufffd\u0623\ufffd\ufffd\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\017\ufffdHLM}3" + "'", str15, "\002\ufffd\ufffd\ufffd\017\ufffdHLM}3");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\u069f\ufffdv1\004\ufffd\ufffd" + "'", str17, "\006\u069f\ufffdv1\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "16386580829389616474829351302" + "'", str19, "16386580829389616474829351302");
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\n\u05a4V");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??V\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd" + "'", str5, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42371998213842471979" + "'", str9, "42371998213842471979");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "419004936558731776895956357547" + "'", str11, "419004936558731776895956357547");
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
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
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "233624973407872916027505525295" + "'", str9, "233624973407872916027505525295");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004z4Q\026\ufffd\ufffd\ufffd\022\ufffd\ufffd%2" + "'", str11, "\004z4Q\026\ufffd\ufffd\ufffd\022\ufffd\ufffd%2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\016\ufffd\ufffd\020\ufffd\"\ufffd\ufffd\032T" + "'", str13, "\002\ufffd\016\ufffd\ufffd\020\ufffd\"\ufffd\ufffd\032T");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Z=YY\035\ufffd\ufffd\ufffd\007\ufffd" + "'", str17, "Z=YY\035\ufffd\ufffd\ufffd\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "18085017740132714742934032924" + "'", str19, "18085017740132714742934032924");
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "191" + "'", str3, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5314472213" + "'", str7, "5314472213");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "949815368" + "'", str9, "949815368");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5388504005" + "'", str13, "5388504005");
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.encrypt("5799003948");
        java.lang.String str7 = rSA1.decrypt("4747158113");
        java.lang.String str9 = rSA1.decrypt("541080546688817559591567168106");
        java.lang.String str11 = rSA1.encrypt("2750139415285747");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "144852503141256769061258263977" + "'", str3, "144852503141256769061258263977");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "639595209278581523398469808182" + "'", str5, "639595209278581523398469808182");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023" + "'", str7, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffdI\f#" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffdI\f#");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "670829128837875448510563271815" + "'", str11, "670829128837875448510563271815");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
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
        java.lang.String str27 = rSA1.encrypt("153175166168351482598425139765");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass32 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002b" + "'", str7, "\002b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1643776225960743" + "'", str11, "1643776225960743");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "432903082940936" + "'", str13, "432903082940936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "668459738301668" + "'", str15, "668459738301668");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "506529788111875051757571545821" + "'", str19, "506529788111875051757571545821");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd," + "'", str21, "\000\ufffd\ufffd\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd,");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\035\ufffd*\025\ufffd{;" + "'", str23, "\035\ufffd*\025\ufffd{;");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "252" + "'", str27, "252");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37754122145199104732605032958" + "'", str11, "37754122145199104732605032958");
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("525446349330894280447240455546");
        java.lang.String str21 = rSA1.encrypt("220543977174069820793987180718");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "428792373428143049156677581424" + "'", str9, "428792373428143049156677581424");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\033\ufffd\ufffd\ufffd\ufffd\006\ufffd" + "'", str11, "\t\033\ufffd\ufffd\ufffd\ufffd\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "345634555706120369199405693706" + "'", str13, "345634555706120369199405693706");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\")S\037\u07ba" + "'", str19, "\006\")S\037\u07ba");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1690686978962854" + "'", str21, "1690686978962854");
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) '#');
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
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("10019204889");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\025\u06e8\ufffdR" + "'", str3, "\001\ufffd\025\u06e8\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2078468474843095" + "'", str5, "2078468474843095");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1989175864249341" + "'", str7, "1989175864249341");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "584328301120903" + "'", str9, "584328301120903");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
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
        java.lang.String str23 = rSA1.decrypt("418302352161981103798040615915");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "285061882479225592179176437970" + "'", str9, "285061882479225592179176437970");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285061882479225592179176437970" + "'", str11, "285061882479225592179176437970");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\005\ufffd\ufffd\031\ufffd*\033\ufffd" + "'", str13, "\003\ufffd\ufffd\005\ufffd\ufffd\031\ufffd*\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "58029143480798684635846076649" + "'", str15, "58029143480798684635846076649");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n3\002\ufffd\ufffd\ufffd\006\ufffd\ufffds" + "'", str17, "\n3\002\ufffd\ufffd\ufffd\006\ufffd\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "579906219412848134966372722882" + "'", str21, "579906219412848134966372722882");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffd\ufffd\u06f3\ufffd\ufffd\ufffd9\006r" + "'", str23, "\003\ufffd\ufffd\ufffd\u06f3\ufffd\ufffd\ufffd9\006r");
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3426800978" + "'", str3, "3426800978");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "16490247544174681446403460430" + "'", str7, "16490247544174681446403460430");
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "529423350781450832910304744729" + "'", str9, "529423350781450832910304744729");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "529423350781450832910304744729" + "'", str11, "529423350781450832910304744729");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffdBRf" + "'", str13, "\013\ufffd\ufffd\ufffd\ufffdBRf");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "808772176970130920140724965934" + "'", str15, "808772176970130920140724965934");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\001\ufffd+`F\007\ufffd\ufffd" + "'", str17, "\b\ufffd\001\ufffd+`F\007\ufffd\ufffd");
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2295711701370321" + "'", str7, "2295711701370321");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\022\ufffd\ufffd\ufffd" + "'", str9, "\b\ufffd\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1307531911965720" + "'", str11, "1307531911965720");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2088228745701068" + "'", str13, "2088228745701068");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1453064742325622" + "'", str17, "1453064742325622");
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "358" + "'", str5, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd!?" + "'", str9, "\t\ufffd\ufffd\ufffd\ufffd\ufffd!?");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.decrypt("6756588560");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10152470154" + "'", str3, "10152470154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4232646123" + "'", str7, "4232646123");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd;d" + "'", str9, "\000\ufffd\ufffd;d");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138044315387939688179807309633" + "'", str9, "138044315387939688179807309633");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "937443264467759419286784598363" + "'", str11, "937443264467759419286784598363");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\022\ufffd\ufffd\ufffd\ufffd\025\ufffd\ufffdN" + "'", str13, "\004\ufffd\022\ufffd\ufffd\ufffd\ufffd\025\ufffd\ufffdN");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\u075a\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\030" + "'", str15, "\b\ufffd\u075a\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "424293033930697904206182759224" + "'", str17, "424293033930697904206182759224");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\027\ufffd\ufffdYt" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\027\ufffd\ufffdYt");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd7");
        java.lang.String str13 = rSA1.encrypt("224209094478641780267188463876");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336" + "'", str7, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18310236905753614514010859720" + "'", str11, "18310236905753614514010859720");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "72603064949442019105926924692" + "'", str13, "72603064949442019105926924692");
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "856356103144160" + "'", str7, "856356103144160");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\036\ufffd\ufffd." + "'", str9, "\003\ufffd\ufffd\036\ufffd\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2038678624590428" + "'", str13, "2038678624590428");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2790939611285667" + "'", str17, "2790939611285667");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2868884244023217" + "'", str19, "2868884244023217");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
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
        java.lang.String str23 = rSA1.encrypt("13006132420908613601429159670");
        java.lang.String str25 = rSA1.encrypt("\001\ufffdU");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294131422946051758289354931237" + "'", str9, "294131422946051758289354931237");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "294131422946051758289354931237" + "'", str11, "294131422946051758289354931237");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "59749633881204894192981321442" + "'", str15, "59749633881204894192981321442");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\030\ufffdU\000\u02d7\004\017\ufffd\ufffd" + "'", str17, "\001\030\ufffdU\000\u02d7\004\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "196717533858080" + "'", str23, "196717533858080");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1645819130897366" + "'", str25, "1645819130897366");
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("2279400941187448");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("\006\027\ufffd\ufffd\033\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2350564229018330" + "'", str7, "2350564229018330");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "233710799113035560147302479047" + "'", str13, "233710799113035560147302479047");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7186704133341462264065531678" + "'", str19, "7186704133341462264065531678");
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "506979899788391611696674074353" + "'", str9, "506979899788391611696674074353");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffdn\016\ufffd\ufffdM" + "'", str11, "\000\ufffd\ufffd\ufffdn\016\ufffd\ufffdM");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\020\ufffdl\002\ufffd\ufffd\ufffd\u0514Z" + "'", str13, "\003\020\ufffdl\002\ufffd\ufffd\ufffd\u0514Z");
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "501945165014648248890773876071" + "'", str9, "501945165014648248890773876071");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "501945165014648248890773876071" + "'", str11, "501945165014648248890773876071");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "165151925470598613557816704649" + "'", str15, "165151925470598613557816704649");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffdqV\026\ufffd\001\ufffd\f\ufffd\025\r" + "'", str17, "\000\ufffd\ufffdqV\026\ufffd\001\ufffd\f\ufffd\025\r");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "407" + "'", str23, "407");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
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
        java.lang.String str23 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd@O\027H");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2304038467994903" + "'", str7, "2304038467994903");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1198116971374130" + "'", str13, "1198116971374130");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "y" + "'", str19, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "258" + "'", str21, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "5" + "'", str23, "5");
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.encrypt("884371775882389478461512527746");
        java.lang.String str19 = rSA1.decrypt("30987154364644136013503700938");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "573535123702677433381598846585" + "'", str9, "573535123702677433381598846585");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\031\ufffd\ufffd\ufffd\ufffd\ufffd\027\ufffd" + "'", str11, "\t\031\ufffd\ufffd\ufffd\ufffd\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "528647897684938204338959483863" + "'", str13, "528647897684938204338959483863");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "208403742106219927737766648113" + "'", str15, "208403742106219927737766648113");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "779907583821894004441578027352" + "'", str17, "779907583821894004441578027352");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\u0379\035\u0105\ufffd\ufffd9H\034\003" + "'", str19, "\007\u0379\035\u0105\ufffd\ufffd9H\034\003");
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
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
        java.lang.String str23 = rSA1.decrypt("7405345554");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_" + "'", str11, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001w" + "'", str15, "\001w");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\024\u049d" + "'", str23, "\003\ufffd\024\u049d");
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("806729601483697513872336243167");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "522111314044076049464967573249" + "'", str9, "522111314044076049464967573249");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\031\ufffd\ufffd\004\ufffd\022\ufffd\ufffd{" + "'", str11, "\006\ufffd\031\ufffd\ufffd\004\ufffd\022\ufffd\ufffd{");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\u041a" + "'", str3, "\005\ufffd\ufffd\u041a");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1772386332868278" + "'", str5, "1772386332868278");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1561484017617770" + "'", str7, "1561484017617770");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\022\017\u042d\ufffd\ufffd" + "'", str9, "\006\022\017\u042d\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd,:F\007\ufffd" + "'", str13, "\003\ufffd,:F\007\ufffd");
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("2374996254220858");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "84" + "'", str13, "84");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        java.lang.String str17 = rSA1.decrypt("641878189380227");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "467004601433472" + "'", str7, "467004601433472");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "398015473688219" + "'", str13, "398015473688219");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\037\ufffd\ufffd\034" + "'", str15, "\005\ufffd\037\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\035\ufffd\ufffd" + "'", str17, "\003\ufffd\035\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\021\ufffd\030^");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffdGs\031\ufffd\ufffd\ufffd#");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "17" + "'", str3, "17");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdO" + "'", str7, "\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7218655876" + "'", str9, "7218655876");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1764309848" + "'", str11, "1764309848");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9540080686" + "'", str13, "9540080686");
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2738436648032738" + "'", str7, "2738436648032738");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\r\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("55");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str21 = rSA1.decrypt("323366616559028170805655729800");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "739585416165390" + "'", str7, "739585416165390");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2594012655498223" + "'", str13, "2594012655498223");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24" + "'", str17, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\025j\007\ufffd\ufffd3>" + "'", str21, "\007\ufffd\025j\007\ufffd\ufffd3>");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "190" + "'", str17, "190");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2185508545" + "'", str21, "2185508545");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("7320283309");
        java.lang.String str7 = rSA1.encrypt("6367626140");
        java.lang.String str9 = rSA1.encrypt("24376648142502653686982227296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"w?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8728787098" + "'", str3, "8728787098");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd" + "'", str5, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3724967696" + "'", str7, "3724967696");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5550900003" + "'", str9, "5550900003");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1272687368257046" + "'", str7, "1272687368257046");
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("201");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("240");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\023\ufffd\ufffd\ufffd\u03f2\ufffd" + "'", str11, "\001\ufffd\023\ufffd\ufffd\ufffd\u03f2\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd>\023\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd>\023\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd3Yq[H.\013\ufffd]h" + "'", str19, "\003\ufffd3Yq[H.\013\ufffd]h");
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("1034761437778960171775616314");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "13518527836" + "'", str3, "13518527836");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\\\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\\\ufffd");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
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
        java.lang.String str21 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd\ufffd\022\ufffd");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "352563207930738083766315547165" + "'", str9, "352563207930738083766315547165");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031" + "'", str11, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\u0137\ufffd\ufffd\ufffdV\013d\030;" + "'", str13, "\000\u0137\ufffd\ufffd\ufffdV\013d\030;");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffdK\021\ufffdC\026\ufffd" + "'", str17, "\ufffdK\021\ufffdC\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "13918138093466087792667479538" + "'", str21, "13918138093466087792667479538");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("33177321896406");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd3\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd3\002\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "210757492354337374995881643396" + "'", str5, "210757492354337374995881643396");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("58143851088687047188552923988");
        java.lang.String str13 = rSA1.encrypt("5716068370");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035" + "'", str7, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "429" + "'", str13, "429");
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("147563026464741632979335701288");
        java.lang.String str15 = rSA1.decrypt("1822649237519567");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "379854726566536318144070134331" + "'", str9, "379854726566536318144070134331");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246370985057442914007974898532" + "'", str11, "246370985057442914007974898532");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "515085783257479204065240828732" + "'", str13, "515085783257479204065240828732");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\u0535\ufffd\ufffd" + "'", str15, "\ufffd\u0535\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "165" + "'", str3, "165");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3023358929" + "'", str7, "3023358929");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1555200486" + "'", str9, "1555200486");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Q`\t\ufffd" + "'", str11, "Q`\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1910918105" + "'", str13, "1910918105");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\u0381\ufffd\ufffdD0" + "'", str11, "\006\ufffd\ufffd\ufffd\u0381\ufffd\ufffdD0");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4636791502045563917197849084" + "'", str13, "4636791502045563917197849084");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "115" + "'", str17, "115");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "201" + "'", str19, "201");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("314");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3319658499" + "'", str5, "3319658499");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
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
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "196" + "'", str9, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "695440973933243" + "'", str7, "695440973933243");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
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
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "123560943086106" + "'", str7, "123560943086106");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "340866887784736545153791839121" + "'", str13, "340866887784736545153791839121");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\005" + "'", str19, "\001\005");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "11525909476180956128764993923" + "'", str23, "11525909476180956128764993923");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\037\ufffdR\032\ufffdC" + "'", str25, "\ufffd\ufffd\037\ufffdR\032\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "25680469605597800338428082699" + "'", str27, "25680469605597800338428082699");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("363904346928259064880157652878");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("169");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\r" + "'", str7, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "284" + "'", str9, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "336" + "'", str11, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002J" + "'", str17, "\002J");
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "418758161" + "'", str3, "418758161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5013700459" + "'", str7, "5013700459");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.String str13 = rSA1.decrypt("91678854426503168386094718335");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1687975769" + "'", str3, "1687975769");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3007648093" + "'", str7, "3007648093");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\f" + "'", str9, "\000\ufffd\ufffd\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6342906464" + "'", str11, "6342906464");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\025\ufffd#" + "'", str13, "\000\ufffd\025\ufffd#");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\006\035\ufffd\036Y][");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????Y][\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005c\002\ufffd}G\006\ufffd\ufffd\006\ufffd\ufffd" + "'", str11, "\005c\002\ufffd}G\006\ufffd\ufffd\006\ufffd\ufffd");
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
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
        java.lang.String str21 = rSA1.encrypt("12837301271978823652881043010");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "710020161505791437554889429809" + "'", str9, "710020161505791437554889429809");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\u067a\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffd" + "'", str11, "\003\u067a\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "458200887283371491651634600837" + "'", str13, "458200887283371491651634600837");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "734807680276968324791957871388" + "'", str15, "734807680276968324791957871388");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "658243341948141605079784017139" + "'", str17, "658243341948141605079784017139");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "355067472564133114329302861717" + "'", str19, "355067472564133114329302861717");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "190604596268425306214032221777" + "'", str21, "190604596268425306214032221777");
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "484343211826230887099936607214" + "'", str9, "484343211826230887099936607214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\177\007\ufffd\ufffd\ufffd\ufffd\ufffdB" + "'", str11, "\001\ufffd\ufffd\177\007\ufffd\ufffd\ufffd\ufffd\ufffdB");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "67292466463705382394972930086" + "'", str13, "67292466463705382394972930086");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "377928334795687552105408461052" + "'", str15, "377928334795687552105408461052");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\001\u017b\ufffd\ufffd" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\001\u017b\ufffd\ufffd");
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("380423421443618706983369572489");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2263601341171971" + "'", str7, "2263601341171971");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "250790003918720479615151170293" + "'", str13, "250790003918720479615151170293");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "346396063" + "'", str17, "346396063");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("1493841417454789");
        java.lang.String str21 = rSA1.decrypt("3044920011007722");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffdg%#F" + "'", str13, "\005\ufffd\ufffd\ufffdg%#F");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd_" + "'", str19, "\005\ufffd\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\u0705\ufffd" + "'", str21, "\ufffd\u0705\ufffd");
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.String str13 = rSA1.decrypt("1289219933400623");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2525063277" + "'", str3, "2525063277");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "559197891" + "'", str7, "559197891");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffdi" + "'", str9, "\001\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4102279537" + "'", str11, "4102279537");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd}" + "'", str13, "\000\ufffd\ufffd}");
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("\006w\"\ufffd\\\ufffd\u02f7\ufffd\ufffd\u067f");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6102848662" + "'", str5, "6102848662");
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str15 = rSA1.encrypt("210378250090253374708038199698");
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.decrypt("30768540091527817547701778355");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "400994282728234" + "'", str13, "400994282728234");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "370975628943977" + "'", str15, "370975628943977");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd^.\016" + "'", str19, "\000\ufffd^.\016");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "582" + "'", str11, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\013" + "'", str13, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "742" + "'", str15, "742");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "157" + "'", str17, "157");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.decrypt("6756588560");
        java.lang.String str13 = rSA1.encrypt("\003\020\ufffd\ufffd\031\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1876233653" + "'", str3, "1876233653");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4059146660" + "'", str5, "4059146660");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1647683299" + "'", str7, "1647683299");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\034\ufffd" + "'", str9, "\000\ufffd\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffdK" + "'", str11, "\000\ufffd\ufffd\ufffdK");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1331996046" + "'", str13, "1331996046");
    }
}
