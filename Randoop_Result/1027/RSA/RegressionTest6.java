package RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\001X");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\u0117\ufffd\ufffd\ufffd" + "'", str3, "\b\u0117\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2148276359898161" + "'", str5, "2148276359898161");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1727237484714203" + "'", str7, "1727237484714203");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40707584" + "'", str9, "40707584");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("Z");
        java.lang.String str11 = rSA1.encrypt("3463356647");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\ufffdx" + "'", str5, "\000\ufffd\ufffd\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5904900000" + "'", str9, "5904900000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "129837308958871634923397786717" + "'", str11, "129837308958871634923397786717");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\007\025\ufffd\ufffd\ufffd\u0591\ufffd\024\016\006");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??{\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1243000122936320" + "'", str11, "1243000122936320");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "154941470663033" + "'", str13, "154941470663033");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2057635806247966" + "'", str15, "2057635806247966");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2056033756189330" + "'", str17, "2056033756189330");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("576600425658183");
        java.lang.String str13 = rSA1.decrypt("1423068253868870");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035" + "'", str7, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\177" + "'", str9, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "13" + "'", str11, "13");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("1955448203012581");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "215" + "'", str3, "215");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd(" + "'", str7, "\001\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd>T" + "'", str9, "\001\ufffd\ufffd>T");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7348059710" + "'", str11, "7348059710");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("623989711483246");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1526548492676572" + "'", str7, "1526548492676572");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "343839793630954" + "'", str13, "343839793630954");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2115638574065993" + "'", str15, "2115638574065993");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("x\001\005\ufffd\ufffd");
        java.lang.String str7 = rSA1.decrypt("2005425809184648");
        java.lang.String str9 = rSA1.encrypt("1822649237519567");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5493213922" + "'", str5, "5493213922");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\u036e\n" + "'", str7, "\000\ufffd\u036e\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2522652860" + "'", str9, "2522652860");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        java.lang.String str21 = rSA1.decrypt("417297398380098775554179802316");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "430501489960773770928393272597" + "'", str9, "430501489960773770928393272597");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ud8de\udc8d\u015d" + "'", str11, "\001\ufffd\ufffd\ufffd\ud8de\udc8d\u015d");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "90884795457114886824968591920" + "'", str13, "90884795457114886824968591920");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\f\u0508x\036\ufffd\ufffd" + "'", str15, "\005\ufffd\f\u0508x\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6552236648" + "'", str19, "6552236648");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "K\n\ufffd\023" + "'", str21, "K\n\ufffd\023");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("1289219933400623");
        java.lang.String str9 = rSA1.decrypt("184677000372197579945525954200");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("5246302288");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5740624606" + "'", str3, "5740624606");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\001\ufffd\ufffd\ufffd\ufffd\u5f60\036" + "'", str7, "\ufffd\ufffd\001\ufffd\ufffd\ufffd\ufffd\u5f60\036");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\024\ufffdo\024\ufffdG\031\ufffd\ufffd\ufffdG" + "'", str9, "\024\ufffdo\024\ufffdG\031\ufffd\ufffd\ufffdG");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "22054603538550506259227455174" + "'", str11, "22054603538550506259227455174");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\030\ufffd\ufffd\u0468\032\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\030\ufffd\ufffd\u0468\032\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "93" + "'", str5, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "38" + "'", str7, "38");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "261" + "'", str9, "261");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\033" + "'", str13, "\033");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "110" + "'", str15, "110");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) ' ');
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
        java.lang.String str23 = rSA1.encrypt("177737015693917378192561111197");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u2cce\ufffd&" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u2cce\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "165652960330373621505686580408" + "'", str13, "165652960330373621505686580408");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001Q" + "'", str17, "\001Q");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "632" + "'", str23, "632");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("\005\ufffdC\003\ufffd\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "234" + "'", str3, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3213683834" + "'", str7, "3213683834");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "9811950756" + "'", str9, "9811950756");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\"\ufffd" + "'", str11, "\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4611153949" + "'", str13, "4611153949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2072030213449801" + "'", str17, "2072030213449801");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        java.lang.String str25 = rSA1.decrypt("31");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2417647971280492" + "'", str7, "2417647971280492");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\037\ufffd" + "'", str9, "\b\ufffd\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2274312049630037" + "'", str13, "2274312049630037");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "940546112361204" + "'", str17, "940546112361204");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "567449205648774" + "'", str19, "567449205648774");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\006\ufffd\u0386" + "'", str21, "\002\ufffd\006\ufffd\u0386");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd" + "'", str23, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\b\ufffd\023\ufffd\ufffd" + "'", str25, "\b\ufffd\023\ufffd\ufffd");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("9160802449");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "174" + "'", str3, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "945892428" + "'", str7, "945892428");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3418512924" + "'", str9, "3418512924");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\002\f\013" + "'", str11, "\000\ufffd\002\f\013");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5115148525" + "'", str13, "5115148525");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6259113356" + "'", str15, "6259113356");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1632621045" + "'", str17, "1632621045");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1478912435940662" + "'", str7, "1478912435940662");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "625029028897490" + "'", str13, "625029028897490");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd" + "'", str19, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "274567960" + "'", str21, "274567960");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\036N" + "'", str23, "\ufffd\036N");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "104868278017847274921682003585" + "'", str9, "104868278017847274921682003585");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "185672782063121998808507265179" + "'", str13, "185672782063121998808507265179");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\b\ufffd\ufffd\ufffd" + "'", str17, "\001\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "418365932633459" + "'", str19, "418365932633459");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "85389871899801300521352054425" + "'", str9, "85389871899801300521352054425");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "832595611796045640369168064278" + "'", str11, "832595611796045640369168064278");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "776671231395273022076353834341" + "'", str13, "776671231395273022076353834341");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "301" + "'", str17, "301");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "442" + "'", str19, "442");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "174" + "'", str21, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "493" + "'", str23, "493");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "335" + "'", str25, "335");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "899602632432270495807063816238" + "'", str9, "899602632432270495807063816238");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\027\ufffd/" + "'", str13, "\007\ufffd\ufffd\027\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2411269615306021" + "'", str15, "2411269615306021");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1591021546007233" + "'", str17, "1591021546007233");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1917656521947618" + "'", str19, "1917656521947618");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("32427175380384275892758226492");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\ufffd\ufffdg\026\ufffd\ufffd\005\ufffd\ufffd" + "'", str11, "\013\ufffd\ufffdg\026\ufffd\ufffd\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "668569725840158703134703771343" + "'", str13, "668569725840158703134703771343");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd)d\036\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd)d\036\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("512");
        java.lang.String str17 = rSA1.encrypt("213512010366553469837091921761");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1401976291024093" + "'", str7, "1401976291024093");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "901389097" + "'", str11, "901389097");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "135" + "'", str15, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "280" + "'", str17, "280");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "847645689771043" + "'", str7, "847645689771043");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "197" + "'", str15, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "390" + "'", str21, "390");
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("214");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "255764868358956561281913863009" + "'", str9, "255764868358956561281913863009");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "255764868358956561281913863009" + "'", str11, "255764868358956561281913863009");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "35591679331313571136" + "'", str15, "35591679331313571136");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("196777756323469683884737199099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffdVs\030\ufffd{\034");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "723291460984673395909488995464" + "'", str9, "723291460984673395909488995464");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "534328649579821301108746814016" + "'", str11, "534328649579821301108746814016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\f\ufffd\u0728\ufffd\ufffd\ufffd0" + "'", str13, "\t\f\ufffd\u0728\ufffd\ufffd\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "336661802604476402374137006929" + "'", str17, "336661802604476402374137006929");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\n\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\003\ufffd\n\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "418049959631919965887105933393" + "'", str5, "418049959631919965887105933393");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2619217101522770" + "'", str7, "2619217101522770");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1331292922" + "'", str11, "1331292922");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002b" + "'", str7, "\002b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "813459794705001" + "'", str11, "813459794705001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1465177616094856" + "'", str13, "1465177616094856");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1564392935477942" + "'", str15, "1564392935477942");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5429125157661682696721909407" + "'", str19, "5429125157661682696721909407");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffdN8KlBrZ\016\177" + "'", str21, "\003\ufffd\ufffdN8KlBrZ\016\177");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("556");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "377" + "'", str7, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42" + "'", str9, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\023" + "'", str11, "\023");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2906056514" + "'", str15, "2906056514");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("444705404507775010000301066009");
        java.lang.String str13 = rSA1.decrypt("134");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "403227864558393325878748248184" + "'", str9, "403227864558393325878748248184");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "639622034277879017241513352396" + "'", str11, "639622034277879017241513352396");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\031\ufffd\022$" + "'", str13, "\003\ufffd\ufffd\ufffd\031\ufffd\022$");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "289522321140169981619331175420" + "'", str9, "289522321140169981619331175420");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd\u07d4" + "'", str17, "\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd\u07d4");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "g\022\ufffd\ufffd\ufffdw=r\026\ufffd+" + "'", str19, "g\022\ufffd\ufffd\ufffdw=r\026\ufffd+");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("*");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\u9547");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "512636645785595795134315732188" + "'", str11, "512636645785595795134315732188");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "549341358745931309195571039487" + "'", str13, "549341358745931309195571039487");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "104" + "'", str17, "104");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("515");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
        java.lang.String str25 = rSA1.decrypt("640396749099661255743419249290");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "647670458125334985011502609714" + "'", str9, "647670458125334985011502609714");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006L\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006L\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\016\032\ufffd\ufffd\ufffd\ufffdV\000\ufffd" + "'", str13, "\007\016\032\ufffd\ufffd\ufffd\ufffdV\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "$(/j\"\ufffd\ufffd\ufffd\ufffd" + "'", str17, "$(/j\"\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8925701590913693197894983286" + "'", str21, "8925701590913693197894983286");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "38586414774591523534577260846" + "'", str23, "38586414774591523534577260846");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "f\t\ufffd\ufffd\u0628\ufffd\ufffd" + "'", str25, "f\t\ufffd\ufffd\u0628\ufffd\ufffd");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("1007500148816926");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "508517713727145661605160911969" + "'", str9, "508517713727145661605160911969");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffdqK^\007\ufffdu" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffdqK^\007\ufffdu");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.String str13 = rSA1.decrypt("91678854426503168386094718335");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10692904409" + "'", str3, "10692904409");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12583634041" + "'", str7, "12583634041");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "i)5f" + "'", str9, "i)5f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9683984574" + "'", str11, "9683984574");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=\001\u0774" + "'", str13, "=\001\u0774");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.decrypt("361606126042016");
        java.lang.String str17 = rSA1.encrypt("4759101768");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "382" + "'", str9, "382");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\037" + "'", str15, "\037");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "178" + "'", str17, "178");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("\n\ufffd\030\ufffd\007a");
        java.lang.String str13 = rSA1.decrypt("142882767595980348121771717762");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16110529644645057547386804262" + "'", str11, "16110529644645057547386804262");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd[!\t\ufffd\ufffd\ufffd\f\"\ufffd\ufffd" + "'", str13, "\t\ufffd[!\t\ufffd\ufffd\ufffd\f\"\ufffd\ufffd");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("1761509011968114");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "198720107453164070317881458893" + "'", str9, "198720107453164070317881458893");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006o\034\ufffd\ufffd\000\037\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006o\034\ufffd\ufffd\000\037\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd&" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\030\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\030\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "265969195112332354605149482153" + "'", str9, "265969195112332354605149482153");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "265969195112332354605149482153" + "'", str11, "265969195112332354605149482153");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd5r\023" + "'", str13, "\002\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd5r\023");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "430261130087207339342940800905" + "'", str15, "430261130087207339342940800905");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\005\ufffd\ufffd\ufffd\017\ufffd\ufffd~" + "'", str17, "\ufffd\005\ufffd\ufffd\ufffd\017\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "613386271227555654996945075691" + "'", str19, "613386271227555654996945075691");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("7772915241");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "391784799425212821961373390156" + "'", str9, "391784799425212821961373390156");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36427400631713051634535704281" + "'", str11, "36427400631713051634535704281");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\001\ufffd\ufffd\ufffd\ufffd}" + "'", str13, "\002\ufffd\001\ufffd\ufffd\ufffd\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1600376221091423");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffdA" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffdA");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\ufffd`");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\f\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "541" + "'", str17, "541");
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001WrQ@" + "'", str5, "\001WrQ@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42371998213842471979" + "'", str9, "42371998213842471979");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246453071454461340681170201604" + "'", str11, "246453071454461340681170201604");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("333538977866196043865277785098");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8" + "'", str5, "8");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("575730631187720402467793207691");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "320482233410324318183144993688" + "'", str9, "320482233410324318183144993688");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "841619268646719464790099241834" + "'", str11, "841619268646719464790099241834");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "237041871199145437979337006255" + "'", str13, "237041871199145437979337006255");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "463297169206804683328445593919" + "'", str9, "463297169206804683328445593919");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffdP*5/" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffdP*5/");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0014\017\ufffd\ufffd\ufffd\036x)c" + "'", str13, "\0014\017\ufffd\ufffd\ufffd\036x)c");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1178615260210977" + "'", str15, "1178615260210977");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\023\ufffd\006\ufffd\u043c\ufffdCxJ" + "'", str19, "\023\ufffd\006\ufffd\u043c\ufffdCxJ");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2909531061105965" + "'", str7, "2909531061105965");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1301159186334433" + "'", str13, "1301159186334433");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd<" + "'", str15, "\b\ufffd\ufffd<");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("669");
        java.lang.String str17 = rSA1.encrypt("\002\u0699[?\024\ufffd\ufffd\ufffd\022Ej");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507" + "'", str11, "507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "477" + "'", str15, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "542" + "'", str17, "542");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.encrypt("315");
        java.lang.String str15 = rSA1.encrypt("136");
        java.lang.String str17 = rSA1.decrypt("374013126959508333375475409205");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "101921535994725989" + "'", str11, "101921535994725989");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "149766328632475881889033667080" + "'", str13, "149766328632475881889033667080");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "251136877648860177331868080234" + "'", str15, "251136877648860177331868080234");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\u06b1\u074c\ufffdF" + "'", str17, "\001\ufffd\ufffd\u06b1\u074c\ufffdF");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.decrypt("1632923298108129");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "46832411918705229375191928150" + "'", str9, "46832411918705229375191928150");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffdB\030\u06fe" + "'", str11, "\004\ufffd\ufffd\ufffdB\030\u06fe");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "671746144717393713743911320637" + "'", str13, "671746144717393713743911320637");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "709907304604641843694085370401" + "'", str15, "709907304604641843694085370401");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\003H\004\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd6" + "'", str17, "\003\003H\004\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd6");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("289013563216973");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\b\ufffd\ufffd\ufffdc~\f\033\ufffdz");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "322359156609451" + "'", str7, "322359156609451");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "898941731145732811709742450818" + "'", str13, "898941731145732811709742450818");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "W" + "'", str17, "W");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "489986142554115" + "'", str7, "489986142554115");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002~\\\ufffd#" + "'", str15, "\002~\\\ufffd#");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("155795685895605173480434209421");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77" + "'", str9, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "62" + "'", str11, "62");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "972625721581978" + "'", str7, "972625721581978");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\033\ufffd\ufffd" + "'", str9, "\001\ufffd\033\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\003" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\003");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("806729601483697513872336243167");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdw<\r\001" + "'", str3, "\003\ufffd\ufffd\ufffd\ufffdw<\r\001");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
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
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "456" + "'", str9, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "257460611869473752308709489059" + "'", str9, "257460611869473752308709489059");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\017\ufffd\ufffd" + "'", str13, "\004\ufffd\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "402677598027972" + "'", str15, "402677598027972");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\u0738\u040b\ufffd\025" + "'", str19, "\000\ufffd\ufffd\ufffd\ufffd\u0738\u040b\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3496803722634423534503166082" + "'", str21, "3496803722634423534503166082");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\017" + "'", str25, "\001\017");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        java.lang.String str9 = rSA1.encrypt("491597882470490509387393294253");
        java.lang.String str11 = rSA1.decrypt("801");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003K\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\003K\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "184816410648598461966008420663" + "'", str5, "184816410648598461966008420663");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd^\007\ufffd\035\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd^\007\ufffd\035\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "399541468714022580561781209941" + "'", str9, "399541468714022580561781209941");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\u46da\ufffd\ufffd\ufffd\"\002\ufffd\ufffd" + "'", str11, "\004\u46da\ufffd\ufffd\ufffd\"\002\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "369675554524577005298548092295" + "'", str9, "369675554524577005298548092295");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "794690485749806148282171899051" + "'", str11, "794690485749806148282171899051");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd%" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\bg\037\ufffd\"\ufffd" + "'", str17, "\bg\037\ufffd\"\ufffd");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str15 = rSA1.encrypt("210378250090253374708038199698");
        java.lang.String str17 = rSA1.encrypt("2721187082833909");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "433938253143954919771219705283" + "'", str9, "433938253143954919771219705283");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2078369230428307" + "'", str13, "2078369230428307");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "929971618109898" + "'", str15, "929971618109898");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1293045297286383" + "'", str17, "1293045297286383");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "92738861071190187516680461349" + "'", str11, "92738861071190187516680461349");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\037\u06f0\ufffd\ufffd$J" + "'", str13, "\000\ufffd\ufffd\037\u06f0\ufffd\ufffd$J");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "95715901831892123325345732260" + "'", str9, "95715901831892123325345732260");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd\u029b\ufffd\ufffd\016" + "'", str11, "\t\ufffd\ufffd\u029b\ufffd\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "760843221770238143849799162020" + "'", str13, "760843221770238143849799162020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\n\ufffdH\n\ufffd\ufffd\ufffdO\031" + "'", str17, "\n\ufffdH\n\ufffd\ufffd\ufffdO\031");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "356600510992877423236481117556" + "'", str19, "356600510992877423236481117556");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "904388516903634726019087063673" + "'", str9, "904388516903634726019087063673");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013%}\022\ufffd\ufffd\ufffd>e\037" + "'", str11, "\013%}\022\ufffd\ufffd\ufffd>e\037");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1300528745824439" + "'", str19, "1300528745824439");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1498364396328996" + "'", str21, "1498364396328996");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("436888915925883347513701815904");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\024" + "'", str7, "\001\024");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "196" + "'", str9, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1" + "'", str11, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "264" + "'", str13, "264");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffdm");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "57405303089078189255825602834" + "'", str7, "57405303089078189255825602834");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.decrypt("219091099050495");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1037782203098296" + "'", str7, "1037782203098296");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "703" + "'", str15, "703");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffdZH^\bI\005\003\ufffd\007" + "'", str13, "\004\ufffd\ufffdZH^\bI\005\003\ufffd\007");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("378902689213189788900953928362");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1258306152837947" + "'", str13, "1258306152837947");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "175855824006522" + "'", str15, "175855824006522");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("564955806244323");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97162509520029" + "'", str7, "97162509520029");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\037" + "'", str11, "\001\037");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "226864178682519440633688792447" + "'", str17, "226864178682519440633688792447");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "268653860355226626635902926335" + "'", str19, "268653860355226626635902926335");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "185" + "'", str13, "185");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
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
        java.lang.String str21 = rSA1.decrypt("238518633581286165489835490234");
        java.lang.String str23 = rSA1.encrypt("34157020103984569493819670058");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "806509611844721" + "'", str7, "806509611844721");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002R" + "'", str19, "\002R");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002," + "'", str21, "\002,");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "553" + "'", str23, "553");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??&??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "185" + "'", str11, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "596598892" + "'", str3, "596598892");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4350081476" + "'", str7, "4350081476");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2103352579125830" + "'", str13, "2103352579125830");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\021\u06bd\ufffd5\002\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\000\ufffd\036\ufffd\ufffd\ufffd\u0201\ufffdTU");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "508409383645602548611767085074" + "'", str9, "508409383645602548611767085074");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\r\ufffd\ufffd\ufffd\031\ufffds\017\ufffd\ufffd\ufffd" + "'", str11, "\003\r\ufffd\ufffd\ufffd\031\ufffds\017\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "329588437614892234753673815" + "'", str13, "329588437614892234753673815");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\005\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffdn\005" + "'", str15, "\004\005\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffdn\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "475223584694442288360817440141" + "'", str19, "475223584694442288360817440141");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "434154530749904739284944225082" + "'", str21, "434154530749904739284944225082");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("2226987130855552");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffd" + "'", str5, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "517160348" + "'", str7, "517160348");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7345948858" + "'", str9, "7345948858");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "512890937889573450913392629027" + "'", str15, "512890937889573450913392629027");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("487935535487070858957381010441");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "353" + "'", str7, "353");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!" + "'", str11, "!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "369824009393067" + "'", str7, "369824009393067");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "148" + "'", str15, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\024" + "'", str17, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "96" + "'", str21, "96");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("65");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73594038580710241137647975264" + "'", str3, "73594038580710241137647975264");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\t\002" + "'", str7, "\002\ufffd\t\002");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("138378253545377");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "553964331107353210908524684205" + "'", str9, "553964331107353210908524684205");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\021\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "242158071450999460738156840705" + "'", str13, "242158071450999460738156840705");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5334970587" + "'", str3, "5334970587");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1385470886" + "'", str7, "1385470886");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3357727758788");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\n\003");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "69" + "'", str15, "69");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "525" + "'", str17, "525");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172371313040526142935771500794" + "'", str9, "172371313040526142935771500794");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "284047163820604718332274532873" + "'", str11, "284047163820604718332274532873");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "28515000010498273382662282252" + "'", str13, "28515000010498273382662282252");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\u9a71\ufffd\f!\030\ufffd\ufffd" + "'", str15, "\001\ufffd\u9a71\ufffd\f!\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "538994507307793823712648137704" + "'", str17, "538994507307793823712648137704");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "329291308238729528877269733079" + "'", str19, "329291308238729528877269733079");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "113770204602542806209712102690" + "'", str23, "113770204602542806209712102690");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0013" + "'", str7, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\001" + "'", str9, "\002\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001U" + "'", str11, "\001U");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        java.lang.String str15 = rSA1.decrypt("62444957445600");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r]" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\r]");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("2133068282947590");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294558009737348006203045668602" + "'", str9, "294558009737348006203045668602");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444982478256003484001680645562" + "'", str11, "444982478256003484001680645562");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "507536909258967006260330254843" + "'", str13, "507536909258967006260330254843");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "119" + "'", str17, "119");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.encrypt("9775006025014290295669214284");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1554188517313107" + "'", str7, "1554188517313107");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\u0465\r\ufffd\ufffd\ufffd" + "'", str11, "\002\u0465\r\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1112853030499609" + "'", str13, "1112853030499609");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("\b\ufffd\ufffd\f\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "322709493300056652094915769830" + "'", str9, "322709493300056652094915769830");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "681232568311057886253707619688" + "'", str11, "681232568311057886253707619688");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "616548672492706956873074500888" + "'", str13, "616548672492706956873074500888");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.encrypt("2166047227816219");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "441002493416121265566103867655" + "'", str9, "441002493416121265566103867655");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "196845286028079664680135567512" + "'", str11, "196845286028079664680135567512");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\006\u0551\ufffd\ufffdVh:" + "'", str13, "\007\ufffd\006\u0551\ufffd\ufffdVh:");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "633737667092908738185767498251" + "'", str15, "633737667092908738185767498251");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "40" + "'", str17, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "254" + "'", str19, "254");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.decrypt("338");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1752695905351450" + "'", str7, "1752695905351450");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7776" + "'", str13, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\001\u028a\ufffd\ufffdP" + "'", str15, "\002\001\u028a\ufffd\ufffdP");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
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
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\021\u06bd\ufffd5\002\ufffd\ufffd");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "124979577895486028274512047481" + "'", str9, "124979577895486028274512047481");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0063\f\ufffd\"\ufffd\ufffd\ufffdxi" + "'", str11, "\0063\f\ufffd\"\ufffd\ufffd\ufffdxi");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42875" + "'", str17, "42875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1055794832527308770162666270547" + "'", str19, "1055794832527308770162666270547");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "135424553112817267759693053008" + "'", str21, "135424553112817267759693053008");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "254568733851644646848663151440" + "'", str9, "254568733851644646848663151440");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "73774829677131788919715983977" + "'", str13, "73774829677131788919715983977");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("477335194284590038441746180824");
        java.lang.String str13 = rSA1.decrypt("698830179104320016788462155306");
        java.lang.String str15 = rSA1.encrypt("428452644705730171179267584336");
        java.lang.String str17 = rSA1.encrypt("11065442373");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1368495813810754" + "'", str7, "1368495813810754");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007V\t\ufffd\u0236" + "'", str9, "\007V\t\ufffd\u0236");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd~pJ" + "'", str11, "\005\ufffd\ufffd~pJ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\r\ufffd\ufffd:" + "'", str13, "\005\r\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "964314961740013" + "'", str15, "964314961740013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1787740854562916" + "'", str17, "1787740854562916");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("264484706");
        java.lang.String str15 = rSA1.encrypt("196989163804812");
        java.lang.String str17 = rSA1.encrypt("15531997365273025742698361245");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\ufffd\ufffd\025\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "127114802544392651543006042836" + "'", str15, "127114802544392651543006042836");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "173566758359491656250900483815" + "'", str17, "173566758359491656250900483815");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?g??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1710813609020355" + "'", str7, "1710813609020355");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "787366737" + "'", str11, "787366737");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd?" + "'", str13, "\ufffd\ufffd?");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "965006591" + "'", str15, "965006591");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("470860891773042");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\n-V%\021\ufffd" + "'", str7, "\005\n-V%\021\ufffd");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3312383751865006" + "'", str7, "3312383751865006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013F1\001\004\ufffd" + "'", str9, "\013F1\001\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64758066770113" + "'", str13, "64758066770113");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3567908952194685" + "'", str15, "3567908952194685");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("598040450161656559953215209051");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\t:" + "'", str13, "\b\ufffd\ufffd\ufffd\ufffd\t:");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.encrypt("128048112137671");
        java.lang.String str17 = rSA1.decrypt("1912589018");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "309" + "'", str7, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "63" + "'", str13, "63");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3" + "'", str15, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001C");
        java.lang.String str15 = rSA1.decrypt("10571238448");
        java.lang.String str17 = rSA1.encrypt("694697949");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "338633885121500" + "'", str7, "338633885121500");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3515706497843" + "'", str13, "3515706497843");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1599094876954792" + "'", str17, "1599094876954792");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("\0079pC\fysg\006\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("10019204889");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007?\026\ufffd\ufffd\ufffd" + "'", str3, "\007?\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2085051249007650" + "'", str5, "2085051249007650");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "528785344092083" + "'", str7, "528785344092083");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "184535346486753" + "'", str9, "184535346486753");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "789240122770241717531360674504" + "'", str9, "789240122770241717531360674504");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "68457028225962445511201363693" + "'", str11, "68457028225962445511201363693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u05eb\ufffd9" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u05eb\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\u0170\ufffd\u057c\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\u0170\ufffd\u057c\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.encrypt("149");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "561399175560473987996721830394" + "'", str3, "561399175560473987996721830394");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffdD\026" + "'", str5, "\003\ufffd\ufffd\ufffd\ufffd\ufffdD\026");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "159841551536516802333599321853" + "'", str7, "159841551536516802333599321853");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("549539548161837355014455050201");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "180735043518515506014601491284" + "'", str9, "180735043518515506014601491284");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "180735043518515506014601491284" + "'", str11, "180735043518515506014601491284");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\r\ufffd\007\ufffd\ufffd\ufffd\021\ufffd" + "'", str13, "\005\r\ufffd\007\ufffd\ufffd\ufffd\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\u057e\020\ufffdY<\"\ufffd\u010e" + "'", str15, "\005\ufffd\u057e\020\ufffdY<\"\ufffd\u010e");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
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
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "578261371968078717912009556053" + "'", str9, "578261371968078717912009556053");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\177\\\016" + "'", str11, "\005\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\177\\\016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35141992313384114120950630977" + "'", str13, "35141992313384114120950630977");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "629388989576392450425203431014" + "'", str15, "629388989576392450425203431014");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "626242274961064826973762019560" + "'", str17, "626242274961064826973762019560");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "581316892255132158528187087758" + "'", str19, "581316892255132158528187087758");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        java.lang.String str13 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str15 = rSA1.decrypt("352");
        java.lang.String str17 = rSA1.decrypt("611943475129151");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "143559532770914129400054674442" + "'", str9, "143559532770914129400054674442");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "334943882838087288741083235583" + "'", str11, "334943882838087288741083235583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\017\016Wv\000\ufffd\ufffd\ufffd\ufffd_" + "'", str13, "\005\017\016Wv\000\ufffd\ufffd\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\"\ufffd\ufffd\ufffd\ufffd\u032b\ufffd" + "'", str15, "\001\ufffd\"\ufffd\ufffd\ufffd\ufffd\u032b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\u0615\ufffd\ufffd\ufffd" + "'", str17, "\005\u0615\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "402788451761086635460741017690" + "'", str9, "402788451761086635460741017690");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "166145271920416373497103069102" + "'", str11, "166145271920416373497103069102");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "272743039123063626798475449168" + "'", str13, "272743039123063626798475449168");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\u05e9\u05c8\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\u05e9\u05c8\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "364779233798094692736259313254" + "'", str19, "364779233798094692736259313254");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("4387152023");
        java.lang.String str17 = rSA1.decrypt("52521875");
        java.lang.String str19 = rSA1.encrypt("63837675");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "362779680094872333729720649642" + "'", str9, "362779680094872333729720649642");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "518086760569958093040349517128" + "'", str11, "518086760569958093040349517128");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4367302672" + "'", str15, "4367302672");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\n\ufffd5" + "'", str17, "\001\n\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4228732632" + "'", str19, "4228732632");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.encrypt("249149502657092604838469591750");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2376442883726444" + "'", str7, "2376442883726444");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "135860758409350211811686351105" + "'", str13, "135860758409350211811686351105");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "530070515782114655021366859204" + "'", str15, "530070515782114655021366859204");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("197");
        java.lang.String str17 = rSA1.encrypt("462059788404288851690924494526");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "312489132304326482010524066382" + "'", str9, "312489132304326482010524066382");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\013\ufffd\ufffd\006\ufffd\035\u0597\000\ufffdu" + "'", str11, "\t\013\ufffd\ufffd\006\ufffd\035\u0597\000\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "278968122893011552812737956970" + "'", str13, "278968122893011552812737956970");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "555574915886608385953061227521" + "'", str15, "555574915886608385953061227521");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "391451630133543519759838844758" + "'", str17, "391451630133543519759838844758");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\001\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001`");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?`\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "134" + "'", str11, "134");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "626373879165900287414913941476" + "'", str9, "626373879165900287414913941476");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "717940045769632717046882138072" + "'", str11, "717940045769632717046882138072");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "143391597047176666217300388648" + "'", str13, "143391597047176666217300388648");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\u01fe\ufffdz^\025\ufffd\ufffd\ufffd:" + "'", str15, "\002\ufffd\u01fe\ufffdz^\025\ufffd\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "632423623041248547344286792946" + "'", str19, "632423623041248547344286792946");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "883580495795587061849573932993" + "'", str5, "883580495795587061849573932993");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.encrypt("188056847977118301724067984843");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006r\r\ufffdw\032\ufffd" + "'", str3, "\006r\r\ufffdw\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "587924275471583" + "'", str5, "587924275471583");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2364086853551506" + "'", str7, "2364086853551506");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\u0228\ufffd\ufffd" + "'", str9, "\002\ufffd\u0228\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffd\ufffdMH" + "'", str11, "\f\ufffd\ufffdMH");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2374614562892556" + "'", str13, "2374614562892556");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        java.lang.String str15 = rSA1.decrypt("297037574156103209447213891242");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\020\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\r\"" + "'", str11, "\004\020\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\r\"");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\r\005\ufffd\001\t\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\r\005\ufffd\001\t\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\u0635\ufffd\ufffd\ufffd\ufffd]\002" + "'", str15, "\b\u0635\ufffd\ufffd\ufffd\ufffd]\002");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffdhR;\035" + "'", str15, "\002\ufffdhR;\035");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "607716070800956913138315428317" + "'", str9, "607716070800956913138315428317");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "93378733859723" + "'", str13, "93378733859723");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1928962182363297" + "'", str15, "1928962182363297");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "332363048912860601007370188249" + "'", str9, "332363048912860601007370188249");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "451682510248222031366290752768" + "'", str11, "451682510248222031366290752768");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "301203586471055795147497031704" + "'", str13, "301203586471055795147497031704");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "40520998047086375175347217506" + "'", str15, "40520998047086375175347217506");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("86");
        java.lang.String str17 = rSA1.encrypt("4597126594");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd" + "'", str15, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "534" + "'", str17, "534");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
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
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\u0791\ufffd;\b" + "'", str13, "\006\u0791\ufffd;\b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "718843259174528" + "'", str15, "718843259174528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1378039884863501" + "'", str17, "1378039884863501");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "V" + "'", str21, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "389" + "'", str23, "389");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str11 = rSA1.encrypt("104505243654056990127866040198");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd-D");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1072035863580918" + "'", str7, "1072035863580918");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "310" + "'", str15, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "302" + "'", str17, "302");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\002\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?/h?k ?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77855336428782321051962976853" + "'", str9, "77855336428782321051962976853");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "928654082466825030715138192064" + "'", str11, "928654082466825030715138192064");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd2" + "'", str15, "\b\ufffd\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\u0746,Q" + "'", str17, "\007\ufffd\u0746,Q");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\034\ufffd\035\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1958844739743218" + "'", str7, "1958844739743218");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1096188743799554612915909955384" + "'", str9, "1096188743799554612915909955384");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f6\006\ufffd\ufffd\rED\034\ufffd\ufffd*" + "'", str11, "\f6\006\ufffd\ufffd\rED\034\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "486116809393456731861050659912" + "'", str13, "486116809393456731861050659912");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3357727758788");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "143" + "'", str15, "143");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
            java.lang.String str21 = rSA1.decrypt("\002Ec\027\ufffd\u0744\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "235259747203458102803272526060" + "'", str9, "235259747203458102803272526060");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "235259747203458102803272526060" + "'", str11, "235259747203458102803272526060");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffdV\017\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffdV\017\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "218371747465257783216613816652" + "'", str15, "218371747465257783216613816652");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\u04b3\ufffd\ufffd\ufffd\ufffdW\022\ufffd" + "'", str17, "\005\ufffd\u04b3\ufffd\ufffd\ufffd\ufffdW\022\ufffd");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "47502188815715" + "'", str7, "47502188815715");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2124050411083680" + "'", str13, "2124050411083680");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("539");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\000\ufffd\ufffd{a1");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??$?{a1\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "419646237385890210823546591840" + "'", str9, "419646237385890210823546591840");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292080880468342276264113858" + "'", str11, "292080880468342276264113858");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\t\027\ufffd\ufffd\016\037\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??^?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffdbebFn\020\ufffd\ufffdc" + "'", str11, "\b\ufffd\ufffdbebFn\020\ufffd\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\017\b\ufffd\017:\r\ufffd\035\ufffd" + "'", str13, "\b\ufffd\ufffd\017\b\ufffd\017:\r\ufffd\035\ufffd");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.lang.String str17 = rSA1.encrypt("173476924289590");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "22369983321637" + "'", str7, "22369983321637");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238" + "'", str11, "238");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5267573612" + "'", str17, "5267573612");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "518711781880509396426759892141" + "'", str9, "518711781880509396426759892141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "518711781880509396426759892141" + "'", str11, "518711781880509396426759892141");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "553605262502453768131986922512" + "'", str15, "553605262502453768131986922512");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\035%" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\035%");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "271104211178482458936293747804" + "'", str21, "271104211178482458936293747804");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\ufffd\005\013\ufffd\ufffd\ufffd" + "'", str23, "\004\ufffd\ufffd\005\013\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.encrypt("180760426369578260433288579634");
        java.lang.String str7 = rSA1.encrypt("1640784225311781");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "741775149969756690222801488830" + "'", str3, "741775149969756690222801488830");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "945590660181610484197458429295" + "'", str5, "945590660181610484197458429295");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "480435325506487426619750766831" + "'", str7, "480435325506487426619750766831");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("423");
        java.lang.String str5 = rSA1.encrypt("825");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001#" + "'", str3, "\001#");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "245" + "'", str5, "245");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        java.lang.String str13 = rSA1.encrypt("182896684412517005977800507579");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\005" + "'", str5, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "330" + "'", str7, "330");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "102" + "'", str13, "102");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt(".\022\ufffd\ufffd\024\ufffd\ufffd0GF");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\u0522~gfU\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??~\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "156686138718708" + "'", str7, "156686138718708");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "42722607132534103569740158374" + "'", str13, "42722607132534103569740158374");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        java.lang.String str17 = rSA1.encrypt("454");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1803722014779144" + "'", str13, "1803722014779144");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd>" + "'", str15, "\006\ufffd\ufffd\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1985333004581977" + "'", str17, "1985333004581977");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
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
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("992436543");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10341998820" + "'", str3, "10341998820");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd/\b" + "'", str5, "\001\ufffd/\b");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2452166183" + "'", str7, "2452166183");
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.encrypt("9096294327276631334570801956");
        java.lang.String str15 = rSA1.encrypt("16666078853112263439064677627");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\u0379\\\f\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "463642961722367922637187249890" + "'", str9, "463642961722367922637187249890");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "519545053433998329080758826891" + "'", str11, "519545053433998329080758826891");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "593169819762045998694502171824" + "'", str13, "593169819762045998694502171824");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "561488615757481770689526473117" + "'", str15, "561488615757481770689526473117");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144624622097091053077329055542" + "'", str9, "144624622097091053077329055542");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdh9" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffdh9");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "467754836682567537270737257761" + "'", str13, "467754836682567537270737257761");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\b\ufffd\ufffd\ufffd\ufffd\032\023#" + "'", str15, "\004\b\ufffd\ufffd\ufffd\ufffd\032\023#");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "164901950444657785478580141510" + "'", str17, "164901950444657785478580141510");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        java.lang.String str17 = rSA1.encrypt("3105750719");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432725896010221414103004035851" + "'", str9, "432725896010221414103004035851");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1153508090940325" + "'", str13, "1153508090940325");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\031\ufffd\022\ufffd" + "'", str15, "\000\ufffd\ufffd\031\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2352223807661364" + "'", str17, "2352223807661364");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3299146689315890" + "'", str7, "3299146689315890");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\007" + "'", str15, "\001\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4665873730" + "'", str17, "4665873730");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7996583863" + "'", str19, "7996583863");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.encrypt("1016767462448868");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "563659087290615294759192765084" + "'", str9, "563659087290615294759192765084");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "434040196411740630799686919768" + "'", str11, "434040196411740630799686919768");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\001\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd\ufffd\035\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "511829377840183311653181097827" + "'", str17, "511829377840183311653181097827");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("*");
        java.lang.String str19 = rSA1.decrypt("434688540946463240432108100220");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "332727025082938972381350080370" + "'", str11, "332727025082938972381350080370");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144348331052672966231888543463" + "'", str13, "144348331052672966231888543463");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "138" + "'", str17, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\177" + "'", str19, "\177");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.decrypt("2119828432695955");
        java.lang.String str7 = rSA1.encrypt("992436543");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1886925358" + "'", str3, "1886925358");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd" + "'", str5, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "762435202" + "'", str7, "762435202");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "820194510882390" + "'", str7, "820194510882390");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001U" + "'", str19, "\001U");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "233" + "'", str21, "233");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "227" + "'", str9, "227");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "306823561112893038691635952709" + "'", str9, "306823561112893038691635952709");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdU" + "'", str11, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdU");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\nw\t\u03892" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\nw\t\u03892");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "659613077780439" + "'", str7, "659613077780439");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\u05a8\ufffd\ufffd" + "'", str9, "\002\ufffd\u05a8\ufffd\ufffd");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0075:K \000\ufffd" + "'", str3, "\0075:K \000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576717877797591" + "'", str5, "576717877797591");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "868686659940924" + "'", str7, "868686659940924");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("100563547529303");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1981355655168" + "'", str3, "1981355655168");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1690522737399" + "'", str5, "1690522737399");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "378099368298586985188310578313" + "'", str7, "378099368298586985188310578313");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003l" + "'", str11, "\003l");
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        java.lang.String str21 = rSA1.encrypt("516944452864844701091077096215");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1157791782215835" + "'", str7, "1157791782215835");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "146151476109808" + "'", str13, "146151476109808");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\021\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "141620592816156" + "'", str19, "141620592816156");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "752973416621170" + "'", str21, "752973416621170");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("270064452819075595077010738176");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "215" + "'", str3, "215");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6356778940" + "'", str9, "6356778940");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\037" + "'", str11, "\001\ufffd\ufffd\037");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "166043095036148574515753442944" + "'", str11, "166043095036148574515753442944");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "205372069777853615526063837934" + "'", str13, "205372069777853615526063837934");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffdO\n\ufffd\037\ufffd\ufffd(" + "'", str15, "\004\ufffd\ufffdO\n\ufffd\037\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "174073597170904842694746836027" + "'", str17, "174073597170904842694746836027");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "37761701459156484237" + "'", str19, "37761701459156484237");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\u0422\ufffd\ufffd\u0638\ufffd\ufffd/o" + "'", str21, "\004\u0422\ufffd\ufffd\u0638\ufffd\ufffd/o");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "50443555218410359827257988444" + "'", str23, "50443555218410359827257988444");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("2279400941187448");
        java.lang.String str15 = rSA1.encrypt("2339068862822151");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "562061340177907" + "'", str7, "562061340177907");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "124107009758636302286154311728" + "'", str13, "124107009758636302286154311728");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "306742219852620631080527646732" + "'", str15, "306742219852620631080527646732");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
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
        java.lang.String str21 = rSA1.decrypt("48239235403704247208166431885");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1483149119707979" + "'", str7, "1483149119707979");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "251" + "'", str15, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "196" + "'", str17, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "/" + "'", str19, "/");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("511324906649475524073057205686");
        java.lang.String str17 = rSA1.encrypt("1489595178");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "776444653834096" + "'", str7, "776444653834096");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffdw" + "'", str13, "\004\ufffd\ufffd\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd56)\026\ufffd" + "'", str15, "\007\ufffd56)\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1671836196126444" + "'", str17, "1671836196126444");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1048637289434762" + "'", str19, "1048637289434762");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\016\ufffd\ufffd\ufffd\031" + "'", str13, "\016\ufffd\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "203607648115436" + "'", str15, "203607648115436");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1136854596949001" + "'", str17, "1136854596949001");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "62" + "'", str21, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "80" + "'", str23, "80");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt(".\022\ufffd\ufffd\024\ufffd\ufffd0GF");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "39177480906295" + "'", str7, "39177480906295");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "18062667127600744076116791892" + "'", str13, "18062667127600744076116791892");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("1053810964353719");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4626613650" + "'", str7, "4626613650");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "45087684437215245508003119474" + "'", str13, "45087684437215245508003119474");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3041582777" + "'", str7, "3041582777");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3603657642" + "'", str9, "3603657642");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd" + "'", str11, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8315392148" + "'", str13, "8315392148");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1300146814" + "'", str15, "1300146814");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "112" + "'", str5, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "408" + "'", str9, "408");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("152");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1817845140561912" + "'", str7, "1817845140561912");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1084984500671051" + "'", str13, "1084984500671051");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "50" + "'", str19, "50");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str15 = rSA1.decrypt("184");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd}\016\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd}\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffdI\007\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffdI\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\036\u0260\ufffd\ufffd\ufffd\0365" + "'", str15, "\005\ufffd\ufffd\036\u0260\ufffd\ufffd\ufffd\0365");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("7772915241");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "559188381928223298552734500420" + "'", str9, "559188381928223298552734500420");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "105198712388298991352741065271" + "'", str11, "105198712388298991352741065271");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\037\ufffd\u06f5U" + "'", str13, "\006\ufffd\ufffd\ufffd\037\ufffd\u06f5U");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\037\ufffd" + "'", str17, "\037\ufffd");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\006\035\ufffd\036Y][");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "?" + "'", str9, "?");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001D" + "'", str11, "\001D");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "162" + "'", str15, "162");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("595214886010763");
        java.lang.String str9 = rSA1.encrypt("659258052412804");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11312692460" + "'", str3, "11312692460");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9052587433" + "'", str7, "9052587433");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8605469003" + "'", str9, "8605469003");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd\u03e0\ufffd");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "175616073595817840659707209676" + "'", str3, "175616073595817840659707209676");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("10590563594");
        java.lang.String str11 = rSA1.decrypt("395899771572896144210561400268");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str3, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576254050801752" + "'", str5, "576254050801752");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "98641600259375" + "'", str7, "98641600259375");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\023\ufffd\ufffd\ufffd" + "'", str9, "\004\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\n\025\ufffd\ufffd" + "'", str11, "\004\ufffd\n\025\ufffd\ufffd");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5340912955750191528759865518" + "'", str9, "5340912955750191528759865518");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "445571975198578709127620919264" + "'", str11, "445571975198578709127620919264");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1062867591338689175331906107937" + "'", str13, "1062867591338689175331906107937");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "489" + "'", str17, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "692" + "'", str19, "692");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "697" + "'", str21, "697");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000" + "'", str23, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "404" + "'", str25, "404");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.encrypt("623433996390119");
        java.lang.String str11 = rSA1.decrypt("299711429567829177107340963225");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3338383242" + "'", str3, "3338383242");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7176793380" + "'", str7, "7176793380");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8990130180" + "'", str9, "8990130180");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffdkV" + "'", str11, "\002\ufffdkV");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("11695976753");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "385" + "'", str9, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1942659455" + "'", str13, "1942659455");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.encrypt("1024");
        java.lang.String str9 = rSA1.encrypt("32785009004481843571057639692");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\ufffdE" + "'", str3, "\n\ufffdE");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1546971104" + "'", str5, "1546971104");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2015988976" + "'", str7, "2015988976");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2099805194" + "'", str9, "2099805194");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("5693705465");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6442979731" + "'", str3, "6442979731");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4340365978" + "'", str5, "4340365978");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5265546577" + "'", str7, "5265546577");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2499795775" + "'", str9, "2499795775");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6225592559" + "'", str11, "6225592559");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("673899523054237850976");
        java.lang.String str11 = rSA1.decrypt("453271197550529659739416350615");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "175839171406089840283131152851" + "'", str9, "175839171406089840283131152851");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd@" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd@");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("805201222");
        java.lang.String str17 = rSA1.encrypt("549808880");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "22679324524629230711545531844" + "'", str9, "22679324524629230711545531844");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "410872251266115715894746650451" + "'", str11, "410872251266115715894746650451");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\u02ee\ufffdl\022\ufffd\t\ufffd5" + "'", str13, "\000\ufffd\ufffd\u02ee\ufffdl\022\ufffd\t\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd]n" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd]n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "149378150270461900948417695971" + "'", str17, "149378150270461900948417695971");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("10590563594");
        java.lang.String str11 = rSA1.decrypt("395899771572896144210561400268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\000\ufffd\ufffd\020");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??]??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\035\ufffd\ufffd" + "'", str3, "\005\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1479022456865572" + "'", str5, "1479022456865572");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2107533200118122" + "'", str7, "2107533200118122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\017\ufffd\ufffd`\"" + "'", str9, "\005\017\ufffd\ufffd`\"");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.lang.String str13 = rSA1.encrypt("538466596764584785061881286421");
        java.lang.String str15 = rSA1.encrypt("208336634701842847222234970395");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\f\ufffd" + "'", str5, "\000\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "203007189253701278497432991463" + "'", str9, "203007189253701278497432991463");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "176767711224161111570036927597" + "'", str11, "176767711224161111570036927597");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "339461122935115748931929350240" + "'", str13, "339461122935115748931929350240");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "494401711253562136886133515715" + "'", str15, "494401711253562136886133515715");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
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
        java.lang.String str27 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd[");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\020\ufffd\ufffd7S" + "'", str13, "\003\020\ufffd\ufffd7S");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "37413129125400" + "'", str15, "37413129125400");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffdj\030\ufffd\u048d\ufffd\ufffd" + "'", str19, "\ufffdj\030\ufffd\u048d\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "27383708030100114084519513473" + "'", str21, "27383708030100114084519513473");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\0011" + "'", str25, "\0011");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "170" + "'", str27, "170");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        java.lang.String str13 = rSA1.decrypt("51072814435354477634104262711");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3077823663" + "'", str3, "3077823663");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4358327787" + "'", str5, "4358327787");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5988040285" + "'", str7, "5988040285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1285156042" + "'", str9, "1285156042");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3636247303" + "'", str11, "3636247303");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\037\ufffd\ufffd%" + "'", str13, "\037\ufffd\ufffd%");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "87888949510307466176954987108" + "'", str11, "87888949510307466176954987108");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "355156122334039835521362686006" + "'", str13, "355156122334039835521362686006");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("79163679617186273630480405800");
        java.lang.String str15 = rSA1.encrypt("128048112137671");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "278" + "'", str7, "278");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "33" + "'", str11, "33");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7" + "'", str13, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "130" + "'", str15, "130");
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "140887349186758937082576096933" + "'", str11, "140887349186758937082576096933");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "493149889644454572725974046173" + "'", str13, "493149889644454572725974046173");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\\" + "'", str21, "\001\\");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "186" + "'", str23, "186");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("1603037267069329");
        java.lang.String str15 = rSA1.decrypt("182896684412517005977800507579");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1584977439283412" + "'", str7, "1584977439283412");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4431580083" + "'", str13, "4431580083");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001<D|v" + "'", str15, "\001<D|v");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "48" + "'", str7, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\f\ufffd\u0378\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\f\ufffd\u0378\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffdJ\f\ufffd\035\ufffde" + "'", str3, "\002\ufffd\ufffd\ufffdJ\f\ufffd\035\ufffde");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "369193799246132809772306933415" + "'", str5, "369193799246132809772306933415");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("891672670784136");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("1101141271759159");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_" + "'", str7, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "315" + "'", str9, "315");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "480" + "'", str13, "480");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\002\u053e\ufffd\ufffdu" + "'", str19, "\006\002\u053e\ufffd\ufffdu");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "261990158049326" + "'", str7, "261990158049326");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffdq\034/Q" + "'", str9, "\003\ufffdq\034/Q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2106674338963441" + "'", str13, "2106674338963441");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "827544718789972" + "'", str15, "827544718789972");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "137" + "'", str19, "137");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "938567964806903" + "'", str7, "938567964806903");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\027\ufffd%" + "'", str9, "\007\ufffd\ufffd\027\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "722226277710348" + "'", str13, "722226277710348");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "329527288809562" + "'", str15, "329527288809562");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2108085267053780" + "'", str7, "2108085267053780");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "167" + "'", str15, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001$" + "'", str17, "\001$");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "29" + "'", str19, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "49" + "'", str21, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("1879527059809546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd#&\013");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??K\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004g\t\ufffd\033\ufffd" + "'", str3, "\004g\t\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2224019741945446" + "'", str5, "2224019741945446");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1785266288864808" + "'", str7, "1785266288864808");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2321081256558149" + "'", str9, "2321081256558149");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001i" + "'", str11, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "V" + "'", str13, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("1046288441");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\036\ufffd" + "'", str5, "\001\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3310044925" + "'", str7, "3310044925");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8805579524" + "'", str9, "8805579524");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\003\udae4\udf1f\ufffd\ufffd\ufffd\r" + "'", str13, "\006\003\udae4\udf1f\ufffd\ufffd\ufffd\r");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("487935535487070858957381010441");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\030" + "'", str5, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "825" + "'", str7, "825");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001=" + "'", str11, "\001=");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("523");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "404757981253273224569920635215" + "'", str9, "404757981253273224569920635215");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42371998213842471979" + "'", str17, "42371998213842471979");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("965471357883334");
        java.lang.String str17 = rSA1.encrypt("1131007583696693");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "266647392408666" + "'", str13, "266647392408666");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "873515965886081" + "'", str15, "873515965886081");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2373411108446119" + "'", str17, "2373411108446119");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1976260092" + "'", str5, "1976260092");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2188570889" + "'", str7, "2188570889");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2632837248" + "'", str3, "2632837248");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3118040851" + "'", str5, "3118040851");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8337057099" + "'", str7, "8337057099");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4935370254" + "'", str9, "4935370254");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9103145188" + "'", str11, "9103145188");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "627833354978214366728512219202" + "'", str9, "627833354978214366728512219202");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "627833354978214366728512219202" + "'", str11, "627833354978214366728512219202");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("411682505874241610340494986128");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "309419886332748125532536682172" + "'", str9, "309419886332748125532536682172");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "602432021889554639238633151155" + "'", str11, "602432021889554639238633151155");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\026\u0250" + "'", str17, "\ufffd\026\u0250");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("603377111727349");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\002\u071a\u0715\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "142059352879831039184639595115" + "'", str11, "142059352879831039184639595115");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "191968372869775369300653952931" + "'", str13, "191968372869775369300653952931");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "252539279110408263379190128509" + "'", str15, "252539279110408263379190128509");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.encrypt("T\024\"\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "527" + "'", str9, "527");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "421" + "'", str11, "421");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3613416724" + "'", str3, "3613416724");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3084088128" + "'", str7, "3084088128");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7169053161" + "'", str9, "7169053161");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5087032707" + "'", str11, "5087032707");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "507" + "'", str11, "507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "539" + "'", str15, "539");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "650" + "'", str17, "650");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "w\036\ufffd" + "'", str21, "w\036\ufffd");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("8403463512");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "752521015197528" + "'", str7, "752521015197528");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\002\ufffd\ufffd\035\ufffd\ufffd" + "'", str9, "\003\002\ufffd\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd~" + "'", str11, "\t\ufffd\ufffd~");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7516865509350965248" + "'", str9, "7516865509350965248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "442668701243280416733129711414" + "'", str11, "442668701243280416733129711414");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\035\ufffd6S+ b\017" + "'", str13, "\000\ufffd\ufffd\ufffd\035\ufffd6S+ b\017");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5498286558" + "'", str17, "5498286558");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("454458126693189319650194474059");
        java.lang.String str13 = rSA1.decrypt("329114188050351");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "480" + "'", str11, "480");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "j" + "'", str13, "j");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("135");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "309" + "'", str9, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "314" + "'", str11, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\ufffd\ufffd" + "'", str15, "\013\ufffd\ufffd");
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("\006w\"\ufffd\\\ufffd\u02f7\ufffd\ufffd\u067f");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5779863772" + "'", str5, "5779863772");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\027\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\027\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "842806259584322" + "'", str15, "842806259584322");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2231753313521866" + "'", str17, "2231753313521866");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1273361260455231" + "'", str19, "1273361260455231");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\000\ufffd\027");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1352711554339275" + "'", str7, "1352711554339275");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "424806521870454118190945387499" + "'", str13, "424806521870454118190945387499");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "333" + "'", str17, "333");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("360143793835170409825620524630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\000\ufffd #\n\ufffd/");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?? #??/\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "652607605365153192398966805850" + "'", str9, "652607605365153192398966805850");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffdr\024\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffdr\024\ufffd\ufffd");
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("603377111727349");
        java.lang.String str13 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7516865509350965248" + "'", str9, "7516865509350965248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16199930625501696670995328101" + "'", str11, "16199930625501696670995328101");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "259305310492427344817172286470" + "'", str13, "259305310492427344817172286470");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "141520042040939" + "'", str7, "141520042040939");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\r\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("4631023864");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\021\ufffd\ufffd\036\u01d6%" + "'", str11, "\ufffd\ufffd\ufffd\021\ufffd\ufffd\036\u01d6%");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "495663628723875290510056312000" + "'", str13, "495663628723875290510056312000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "400764659018072594204887972368" + "'", str15, "400764659018072594204887972368");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\u0448\033\ufffd\ufffd\ufffd\f" + "'", str17, "\007\ufffd\ufffd\u0448\033\ufffd\ufffd\ufffd\f");
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "97937969639183070940284852962" + "'", str9, "97937969639183070940284852962");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97937969639183070940284852962" + "'", str11, "97937969639183070940284852962");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\025\022\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\025\022\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "414272308889810398820189467595" + "'", str15, "414272308889810398820189467595");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdX]" + "'", str17, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdX]");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "606751753718324003293705234975" + "'", str19, "606751753718324003293705234975");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "163122073531170137917191231915" + "'", str21, "163122073531170137917191231915");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "160894455790793594256511064049" + "'", str23, "160894455790793594256511064049");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\021\ufffd");
        java.lang.String str17 = rSA1.encrypt("1134870370675789");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_" + "'", str11, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "324" + "'", str15, "324");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "311" + "'", str17, "311");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd8X\031$\001");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "619" + "'", str17, "619");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("638834298324326143582676832107");
        java.lang.String str15 = rSA1.encrypt("4759101768");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8021902644" + "'", str3, "8021902644");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6067815778" + "'", str7, "6067815778");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd?=" + "'", str9, "\ufffd?=");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\002\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\002\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "63930508706649612921136212615" + "'", str15, "63930508706649612921136212615");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "206855243513550928036740327676" + "'", str9, "206855243513550928036740327676");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\u068d\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\u068d\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "441993138996148862532500818273" + "'", str13, "441993138996148862532500818273");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\u067e\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\u067e\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "794678127250110584925537281333" + "'", str17, "794678127250110584925537281333");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\005\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdI5" + "'", str19, "\007\005\"\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdI5");
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("432268551667889026451279149775");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\"\027\ufffd" + "'", str9, "\"\027\ufffd");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("55");
        java.lang.String str17 = rSA1.encrypt("\002Q");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1263670865615413" + "'", str7, "1263670865615413");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "251" + "'", str15, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "196" + "'", str17, "196");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("440342891669040828628643711699");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001\ufffd\ufffd\ufffdp\b\u031a\ufffd\ufffdP(");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "536" + "'", str11, "536");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("529936916062749373766053298845");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1437294371" + "'", str5, "1437294371");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "292266303" + "'", str7, "292266303");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "213648137367445476485659258003" + "'", str11, "213648137367445476485659258003");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.encrypt("702947451550003778719770877111");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "90270404891474" + "'", str7, "90270404891474");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\f\025\\\021\017c" + "'", str9, "\001\f\025\\\021\017c");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002.j}*\031d" + "'", str11, "\002.j}*\031d");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "524549424805999" + "'", str13, "524549424805999");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("3");
        java.lang.String str19 = rSA1.encrypt("\nt\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "190605816686157713628164459129" + "'", str9, "190605816686157713628164459129");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004i" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004i");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "49463643361541041563026335292" + "'", str13, "49463643361541041563026335292");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "345025251" + "'", str17, "345025251");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2492243987477180" + "'", str19, "2492243987477180");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75" + "'", str9, "75");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "234" + "'", str11, "234");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("549539548161837355014455050201");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "446928089017595447731851229950" + "'", str9, "446928089017595447731851229950");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "446928089017595447731851229950" + "'", str11, "446928089017595447731851229950");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\"\ufffd\020\000\026\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\"\ufffd\020\000\026\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("\t\ufffd\ufffd\ufffd\ufffd\ufffdq");
        java.lang.String str21 = rSA1.encrypt("2100449234");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "214" + "'", str13, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3161801243" + "'", str19, "3161801243");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4866287269" + "'", str21, "4866287269");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        java.lang.String str9 = rSA1.decrypt("436888915925883347513701815904");
        java.lang.String str11 = rSA1.encrypt("703201277");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004" + "'", str7, "\004");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "m" + "'", str9, "m");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "229" + "'", str11, "229");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "361974795492625349730154328380" + "'", str9, "361974795492625349730154328380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffdu\021\ufffd\035" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffdu\021\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "440199590953930277933233287357" + "'", str13, "440199590953930277933233287357");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "427039113779769950693995673488" + "'", str15, "427039113779769950693995673488");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "36129126486975271765413508555" + "'", str21, "36129126486975271765413508555");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("417879610204410439572746380961");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\u87fa\ufffd\031\ufffd\037\r\ufffd\ufffd" + "'", str3, "\005\u87fa\ufffd\031\ufffd\037\r\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "387" + "'", str7, "387");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        java.lang.Class<?> wildcardClass32 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1790735148896114" + "'", str7, "1790735148896114");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "80" + "'", str21, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001/" + "'", str23, "\001/");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "170" + "'", str27, "170");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "31002962349022933681816355954" + "'", str31, "31002962349022933681816355954");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\006\027\ufffd\ufffd\033\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "461263489796439123640308565289" + "'", str9, "461263489796439123640308565289");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\003\ufffd\ufffd\ufffd\ufffd\u014d\ufffd\ufffd\ufffdh" + "'", str11, "\007\003\ufffd\ufffd\ufffd\ufffd\u014d\ufffd\ufffd\ufffdh");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "602325288030920452116503663240" + "'", str13, "602325288030920452116503663240");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
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
        java.lang.String str23 = rSA1.encrypt("371385932470489933238035216400");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2049104037874526" + "'", str7, "2049104037874526");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffdi\\\ufffd\ufffdO" + "'", str9, "\005\ufffdi\\\ufffd\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2647349424826323" + "'", str15, "2647349424826323");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "56" + "'", str19, "56");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "55" + "'", str23, "55");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdm" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdm");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "486875471579668612652659904303" + "'", str15, "486875471579668612652659904303");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "500026624489663793818608420837" + "'", str9, "500026624489663793818608420837");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffdt" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffdt");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "408976131696890469315639672503" + "'", str13, "408976131696890469315639672503");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\013\ufffd\ufffd\ufffd\ufffd\ufffd\035\ufffd>" + "'", str15, "\b\013\ufffd\ufffd\ufffd\ufffd\ufffd\035\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\031s>\032\ufffdo=K" + "'", str17, "\007\ufffd\ufffd\031s>\032\ufffdo=K");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "305453855769515233525470516202" + "'", str19, "305453855769515233525470516202");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "681050180461373976413309129063" + "'", str21, "681050180461373976413309129063");
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("250235708869437867103396182410");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "471555280156756402761207410331" + "'", str5, "471555280156756402761207410331");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "361624772445181909500837906373" + "'", str9, "361624772445181909500837906373");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "41940905389848921143056682672" + "'", str11, "41940905389848921143056682672");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "439565018479177709941976124289" + "'", str13, "439565018479177709941976124289");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("75472562827089017340799555154");
        java.lang.String str11 = rSA1.encrypt("214450326285773129502890621279");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\026\ufffd\ufffd\ufffd" + "'", str3, "\003\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1135576710525203" + "'", str5, "1135576710525203");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1211157867886565" + "'", str7, "1211157867886565");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1472194976119175" + "'", str9, "1472194976119175");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1368669932914401" + "'", str11, "1368669932914401");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.encrypt("T\024\"\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "356" + "'", str9, "356");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "174" + "'", str11, "174");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\030" + "'", str5, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "459" + "'", str7, "459");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "694" + "'", str9, "694");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "R" + "'", str11, "R");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "129" + "'", str13, "129");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("1629935995");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "477394228487338609978587071200" + "'", str9, "477394228487338609978587071200");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd;\020\ufffd\026\ufffd\ufffd\ufffdg." + "'", str11, "\004\ufffd;\020\ufffd\026\ufffd\ufffd\ufffdg.");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0076\0270\t\ufffd\u02fc\"\ufffdg" + "'", str13, "\0076\0270\t\ufffd\u02fc\"\ufffdg");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd%\002B\031" + "'", str3, "\005\ufffd%\002B\031");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "297812925724947" + "'", str5, "297812925724947");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1476029180727220" + "'", str7, "1476029180727220");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdw");
        java.lang.String str15 = rSA1.encrypt("210378250090253374708038199698");
        rSA1.generateKeys((int) '#');
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1502650329387068" + "'", str13, "1502650329387068");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "795287100610632" + "'", str15, "795287100610632");
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("363904346928259064880157652878");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "285" + "'", str9, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "249" + "'", str11, "249");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        java.lang.String str7 = rSA1.decrypt("2387231432217160");
        java.lang.String str9 = rSA1.decrypt("22707670828225102787686214356");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "119526536820610067175903080103" + "'", str5, "119526536820610067175903080103");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\021\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\004\021\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("\002t");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001d" + "'", str7, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "247673152" + "'", str11, "247673152");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("380204032");
        java.lang.String str15 = rSA1.encrypt("380204032");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd" + "'", str13, "\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1890461395708751" + "'", str15, "1890461395708751");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "397311058747478" + "'", str17, "397311058747478");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffdQ\017q~\177\ufffd\025\ufffdM0");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "681319188648747102182273953482" + "'", str17, "681319188648747102182273953482");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.decrypt("1672696756611743");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6719317636" + "'", str3, "6719317636");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "8177333228" + "'", str5, "8177333228");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2164696835" + "'", str7, "2164696835");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\001\ufffd" + "'", str9, "\000\ufffd\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1105779638638740" + "'", str13, "1105779638638740");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\002\ufffd\ufffd\037Q[" + "'", str15, "\003\002\ufffd\ufffd\037Q[");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("35600054765755498264");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"\ufffd\ufffd" + "'", str5, "\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "376947588979561987997611741975" + "'", str9, "376947588979561987997611741975");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "409614408893334" + "'", str7, "409614408893334");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\u03ce\031z`" + "'", str9, "\001\ufffd\u03ce\031z`");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1365148844016876" + "'", str11, "1365148844016876");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1290887761994967" + "'", str13, "1290887761994967");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "425433309242737" + "'", str15, "425433309242737");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("451");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\020\u079a&");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "123" + "'", str13, "123");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7" + "'", str15, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "443" + "'", str17, "443");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        java.lang.String str15 = rSA1.encrypt("1357889660519486");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1051210751650209775354381010786" + "'", str9, "1051210751650209775354381010786");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1051210751650209775354381010786" + "'", str11, "1051210751650209775354381010786");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\031\ufffd\ufffdS!\035\ufffd\u0692\u05b0" + "'", str13, "\031\ufffd\ufffdS!\035\ufffd\u0692\u05b0");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "362357882649223164052848847616" + "'", str15, "362357882649223164052848847616");
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\007\ufffdO\016");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?/oP?O?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "93" + "'", str5, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\023" + "'", str7, "\001\023");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "41" + "'", str9, "41");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\007\b\ufffd\ufffd\ufffd\013\ufffd\ufffd\013\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "57350615393980566093709186204" + "'", str9, "57350615393980566093709186204");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "68760461262082397563143024054" + "'", str11, "68760461262082397563143024054");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("380204032");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1246036214215772" + "'", str7, "1246036214215772");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\031\ufffd\ufffd\u03e4M" + "'", str9, "\002\031\ufffd\ufffd\u03e4M");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2220170325522988" + "'", str11, "2220170325522988");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffda" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffda");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffdL\023\ufffd" + "'", str15, "\003\ufffd\ufffdL\023\ufffd");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\030\ufffd\ufffd\u0468\032\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1654212514262189" + "'", str7, "1654212514262189");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\bM^}85}" + "'", str9, "\bM^}85}");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2543529439714679" + "'", str15, "2543529439714679");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "18" + "'", str19, "18");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "991831160713541595444410634544" + "'", str9, "991831160713541595444410634544");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\r\ufffd\u060f\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\r\ufffd\u060f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "923250675238217022945791315941" + "'", str13, "923250675238217022945791315941");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd<$\013\ufffd\ufffd" + "'", str15, "\b\ufffd\ufffd\ufffd\ufffd<$\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "135738142511253637424257783815" + "'", str17, "135738142511253637424257783815");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5240570098073522536068453850" + "'", str21, "5240570098073522536068453850");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "6723404004860267951613044285" + "'", str23, "6723404004860267951613044285");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("410");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "212701049075394638382617837070" + "'", str9, "212701049075394638382617837070");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40017971597836857344" + "'", str11, "40017971597836857344");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "82126889571563580174719805183" + "'", str9, "82126889571563580174719805183");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "565353879973282492146963745439" + "'", str11, "565353879973282492146963745439");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "490899518626211233056397533289" + "'", str13, "490899518626211233056397533289");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "365334019928176317779933243205" + "'", str15, "365334019928176317779933243205");
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        java.lang.String str21 = rSA1.decrypt("484");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "324045317639420" + "'", str7, "324045317639420");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2419131953889450" + "'", str13, "2419131953889450");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\027\ufffd^j" + "'", str15, "\004\ufffd\ufffd\027\ufffd^j");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\u04ee\ufffdc" + "'", str17, "\007\ufffd\ufffd\u04ee\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1195130967495035" + "'", str19, "1195130967495035");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\b\ufffd\u0495i\016\ufffd" + "'", str21, "\b\ufffd\u0495i\016\ufffd");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
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
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2833580981810086" + "'", str7, "2833580981810086");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "679" + "'", str11, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "315" + "'", str19, "315");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\017" + "'", str23, "\ufffd\ufffd\017");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1043505018445340" + "'", str7, "1043505018445340");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1190788598833094" + "'", str9, "1190788598833094");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90" + "'", str11, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "226" + "'", str15, "226");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2" + "'", str17, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd" + "'", str21, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1157273088" + "'", str23, "1157273088");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        java.lang.String str21 = rSA1.encrypt("\005\ufffd\ufffd\ufffd;");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "116286041575445700331792721149" + "'", str9, "116286041575445700331792721149");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\017\020VA\035\ufffd" + "'", str11, "\005\ufffd\ufffd\017\020VA\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "356764539025609507225327572366" + "'", str13, "356764539025609507225327572366");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "bF;\002\ufffd\005\ufffdj\020\005\ufffd\ufffd" + "'", str15, "bF;\002\ufffd\005\ufffdj\020\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\023\ufffdXr" + "'", str19, "\023\ufffdXr");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "6491799985" + "'", str21, "6491799985");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        java.lang.String str17 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str19 = rSA1.decrypt("271529256484544");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2012233828295382" + "'", str7, "2012233828295382");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "s\022\ufffdTr" + "'", str13, "s\022\ufffdTr");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006.\002\ufffd\022\003s" + "'", str15, "\006.\002\ufffd\022\003s");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2440922732030040" + "'", str17, "2440922732030040");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\024\0320\017\013" + "'", str19, "\003\ufffd\024\0320\017\013");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "83183800189185776897644005170" + "'", str11, "83183800189185776897644005170");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "365862391973682577130282832518" + "'", str13, "365862391973682577130282832518");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "104" + "'", str17, "104");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "t" + "'", str19, "t");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "906732227" + "'", str3, "906732227");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5393029280" + "'", str7, "5393029280");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\002\ufffd" + "'", str9, "\002\002\ufffd");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("828944592250846");
        java.lang.String str11 = rSA1.decrypt("60732077159364971136922584801");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\016" + "'", str9, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "456" + "'", str7, "456");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "299" + "'", str9, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001Q" + "'", str13, "\001Q");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "571" + "'", str15, "571");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("760666216293048255539908876499");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\ufffd\u03cb\005\ufffd\ufffd\ufffd%b");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Z?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\u01eb\ufffd\ufffd\u059c\ufffd" + "'", str11, "\t\ufffd\u01eb\ufffd\ufffd\u059c\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\022\ufffd\u5f21\ufffdG\021\bx" + "'", str13, "\007\022\ufffd\u5f21\ufffdG\021\bx");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "492170281965913932574789541041" + "'", str15, "492170281965913932574789541041");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
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
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\035\ufffd\u93ee\ufffd\027\013\u038d\ufffd" + "'", str11, "\035\ufffd\u93ee\ufffd\027\013\u038d\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\034\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd0" + "'", str17, "\034\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "26957672051611470032792091430" + "'", str19, "26957672051611470032792091430");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.decrypt("316973227613881101828002122645");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\007\n\023\ufffd\ufffd\ufffd\ufffd\ufffd=");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "582" + "'", str11, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\013" + "'", str13, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "742" + "'", str15, "742");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "?" + "'", str17, "?");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        java.lang.String str5 = rSA1.encrypt("1512739533813279");
        java.lang.String str7 = rSA1.encrypt("167385914");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "515" + "'", str5, "515");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "160" + "'", str7, "160");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("8589662889");
        java.lang.String str19 = rSA1.decrypt("1590297372654604");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "98792069898033801489398249656" + "'", str9, "98792069898033801489398249656");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\r\ufffdv$" + "'", str11, "\002\ufffd\ufffd\ufffd\r\ufffdv$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "472830524065384852531634235931" + "'", str13, "472830524065384852531634235931");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\u061c\ufffd\ufffd\ufffdY" + "'", str17, "\005\u061c\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\005\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\r\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("576");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\021\004\ufffd\ufffd\022\ufffd\ufffd\ufffd\u079b" + "'", str11, "\b\021\004\ufffd\ufffd\022\ufffd\ufffd\ufffd\u079b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "385377266254961793177180962616" + "'", str13, "385377266254961793177180962616");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "140701182104552479094295614256" + "'", str15, "140701182104552479094295614256");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "118591633533704424937531513423" + "'", str17, "118591633533704424937531513423");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        java.lang.String str11 = rSA1.decrypt("38224169242876816648692772463");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\001i|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd-\017" + "'", str5, "\000\ufffd\ufffd-\017");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4982037727" + "'", str7, "4982037727");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1641439473" + "'", str9, "1641439473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\023" + "'", str11, "\000\ufffd\ufffd\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5324566279" + "'", str13, "5324566279");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        java.lang.String str17 = rSA1.decrypt("264484706");
        java.lang.String str19 = rSA1.encrypt("5579434439");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1128892483589737" + "'", str13, "1128892483589737");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\031" + "'", str15, "\004\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1144232111389352" + "'", str19, "1144232111389352");
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
            java.lang.String str17 = rSA1.decrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffdm");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?K?%\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "335850901559155" + "'", str7, "335850901559155");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "876226243726186" + "'", str15, "876226243726186");
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
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
        java.lang.String str21 = rSA1.encrypt("843752028538272");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "268908394485107" + "'", str7, "268908394485107");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "104108617308655" + "'", str13, "104108617308655");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2607639844" + "'", str19, "2607639844");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1193579506" + "'", str21, "1193579506");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.decrypt("639857867348047546651687203467");
        java.lang.String str11 = rSA1.decrypt("478908770438626");
        java.lang.String str13 = rSA1.decrypt("200158734821485410300570500774");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5543467171" + "'", str3, "5543467171");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "712487681" + "'", str5, "712487681");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3511977599" + "'", str7, "3511977599");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd" + "'", str11, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1287566878" + "'", str7, "1287566878");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5158103767" + "'", str9, "5158103767");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd)Y" + "'", str11, "\ufffd)Y");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8886402405" + "'", str13, "8886402405");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\r\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("576");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd{\b\ufffd\023\ufffd\177\ufffd\ufffd" + "'", str11, "\006\ufffd{\b\ufffd\023\ufffd\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "397146332469117142623094096119" + "'", str13, "397146332469117142623094096119");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "325965345357132250889484887181" + "'", str15, "325965345357132250889484887181");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "326220322294666824901391183072" + "'", str17, "326220322294666824901391183072");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("136097863426554405905045730677");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2568071843041624" + "'", str7, "2568071843041624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "156005545118765485187887028712" + "'", str13, "156005545118765485187887028712");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\033\ufffd\ufffd\033" + "'", str17, "\033\ufffd\ufffd\033");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("517376765656606617096719830177");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("537303285961013");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8060183114" + "'", str3, "8060183114");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "485678109" + "'", str7, "485678109");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffdR" + "'", str9, "\001\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8073297176" + "'", str11, "8073297176");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6876307625" + "'", str13, "6876307625");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8617775849" + "'", str15, "8617775849");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("936488068250800");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "93" + "'", str5, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "38" + "'", str7, "38");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "261" + "'", str9, "261");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "920788338656271844936357643272" + "'", str9, "920788338656271844936357643272");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffdy\002\004\ufffd\ufffd\u0262\ufffd" + "'", str11, "\006\ufffd\ufffdy\002\004\ufffd\ufffd\u0262\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "465658243464285631088356032819" + "'", str13, "465658243464285631088356032819");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffdI\241\r\ufffd\ufffd\ufffdG" + "'", str15, "\004\ufffd\ufffd\ufffdI\241\r\ufffd\ufffd\ufffdG");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffd\007\u0529\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\f" + "'", str9, "\f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "K" + "'", str11, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "213" + "'", str15, "213");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("1534903236613159");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "68967646044840840749796393584" + "'", str3, "68967646044840840749796393584");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\tK\007\ufffd\001 U\030j\034\u0127" + "'", str5, "\tK\007\ufffd\001 U\030j\034\u0127");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\n\u05f7\"\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "170172624531311399977913928939" + "'", str11, "170172624531311399977913928939");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1000092380090470431476566319797" + "'", str17, "1000092380090470431476566319797");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "247673152" + "'", str19, "247673152");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "635201438758363730764736302998" + "'", str21, "635201438758363730764736302998");
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.encrypt("373");
        java.lang.String str13 = rSA1.encrypt("2374996254220858");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\030" + "'", str5, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "459" + "'", str7, "459");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "694" + "'", str9, "694");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "748" + "'", str11, "748");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "652" + "'", str13, "652");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\u01bd\ufffd\u0717U" + "'", str13, "\006\u01bd\ufffd\u0717U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "181757066013930" + "'", str15, "181757066013930");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1737900923569134" + "'", str17, "1737900923569134");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("7929141622");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "123" + "'", str13, "123");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("1537631062431581");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\ufffd|\002\ufffd\ufffd\ufffd\021\ufffdn{" + "'", str3, "\n\ufffd|\002\ufffd\ufffd\ufffd\021\ufffdn{");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "364430593968623412075920373134" + "'", str5, "364430593968623412075920373134");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "560484506003982477641069225521" + "'", str7, "560484506003982477641069225521");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd");
        java.lang.String str11 = rSA1.decrypt("10944974464");
        java.lang.String str13 = rSA1.encrypt("206");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\ufffd=\\");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???=\\\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "n" + "'", str11, "n");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "112" + "'", str13, "112");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("639581396801755524271293352968");
        java.lang.String str11 = rSA1.decrypt("292");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "w<\026\ufffdA\035\ufffd\007\ufffd\ufffd" + "'", str9, "w<\026\ufffdA\035\ufffd\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd]\025\ufffd\ufffd\030\ufffd\ufffd" + "'", str11, "\ufffd]\025\ufffd\ufffd\030\ufffd\ufffd");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("595214886010763");
        java.lang.String str9 = rSA1.encrypt("659258052412804");
        java.lang.String str11 = rSA1.decrypt("2269472210005561");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2296795461" + "'", str3, "2296795461");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4741714183" + "'", str7, "4741714183");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7904784260" + "'", str9, "7904784260");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.decrypt("2139198067134255");
        java.lang.String str13 = rSA1.encrypt("\002\ufffdj");
        java.lang.String str15 = rSA1.encrypt("721795374474899375053754166522");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3984256387" + "'", str3, "3984256387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5805400670" + "'", str7, "5805400670");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u04b8" + "'", str9, "\u04b8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd" + "'", str11, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3690992193" + "'", str13, "3690992193");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2567500323" + "'", str15, "2567500323");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.encrypt("88676722964906920545187245209");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "898951542142450" + "'", str7, "898951542142450");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "559905545846769" + "'", str13, "559905545846769");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1380457318259931" + "'", str15, "1380457318259931");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "463280650138249952839607060919" + "'", str9, "463280650138249952839607060919");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "207200605082099467087989096834" + "'", str13, "207200605082099467087989096834");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "113696819788030500080476170861" + "'", str15, "113696819788030500080476170861");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "277" + "'", str17, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "463850574522320846871811018478" + "'", str9, "463850574522320846871811018478");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "579893950426906472906275637292" + "'", str11, "579893950426906472906275637292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\\\ufffd\u0746\ufffd" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\\\ufffd\u0746\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "77513056037234928249047989535" + "'", str17, "77513056037234928249047989535");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\032\ufffd\ufffd\ufffd\035\ufffd" + "'", str19, "\005\ufffd\ufffd\ufffd\ufffd\032\ufffd\ufffd\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "186499485348088201858321035591" + "'", str23, "186499485348088201858321035591");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2975548393" + "'", str3, "2975548393");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3421498208" + "'", str5, "3421498208");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "149887638" + "'", str7, "149887638");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\034\ufffd\ufffd" + "'", str9, "\034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3643738339" + "'", str11, "3643738339");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "18423756492673594838419942712" + "'", str7, "18423756492673594838419942712");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1282704100746201" + "'", str7, "1282704100746201");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "383" + "'", str19, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "90" + "'", str21, "90");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("564955806244323");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdkRo");
        java.lang.String str21 = rSA1.encrypt("435513246556281");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\000\ufffd\ufffd\ue28a\ufffdgz\026\177~");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "356031810168357" + "'", str7, "356031810168357");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "c" + "'", str13, "c");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "182201841998559630518319144365" + "'", str17, "182201841998559630518319144365");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "481237145580592048341475509831" + "'", str19, "481237145580592048341475509831");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "452597379247442629794943001976" + "'", str21, "452597379247442629794943001976");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "164341563462254592" + "'", str3, "164341563462254592");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "131591980401875559" + "'", str5, "131591980401875559");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232568207989094955164949966789" + "'", str7, "232568207989094955164949966789");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("3844015076");
        java.lang.String str15 = rSA1.encrypt("\u0205\n\ufffdxGy");
        java.lang.String str17 = rSA1.decrypt("267830102000175788894679043275");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1283949966660578" + "'", str7, "1283949966660578");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\022\ufffd\020\016\ufffd" + "'", str13, "{\022\ufffd\020\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "233852635260665" + "'", str15, "233852635260665");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdU" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffdU");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("97");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "617520837659059765927003531616" + "'", str9, "617520837659059765927003531616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\u0190\u1bbf\ufffd\ufffd\ufffd\f\016" + "'", str11, "\005\u0190\u1bbf\ufffd\ufffd\ufffd\f\016");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
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
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001C" + "'", str13, "\001C");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "360" + "'", str15, "360");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "133" + "'", str17, "133");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2674428970" + "'", str21, "2674428970");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd" + "'", str23, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd]\022\ufffd" + "'", str25, "\000\ufffd]\022\ufffd");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "510" + "'", str3, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11149075719" + "'", str7, "11149075719");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3933664190" + "'", str9, "3933664190");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6306285355" + "'", str13, "6306285355");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1433399114875740" + "'", str17, "1433399114875740");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffdO^\022\ufffd" + "'", str19, "\001\ufffdO^\022\ufffd");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("1289219933400623");
        java.lang.String str9 = rSA1.decrypt("184677000372197579945525954200");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "830419683" + "'", str3, "830419683");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd}" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\310\u02b8" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\310\u02b8");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35824825477753087623940094433" + "'", str11, "35824825477753087623940094433");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str11 = rSA1.encrypt("325053041126851022637890970422");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\032\ufffd<" + "'", str5, "\001\032\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffdjd\036" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffd\ufffdjd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246065549388690410297605952742" + "'", str11, "246065549388690410297605952742");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1127975343460639" + "'", str5, "1127975343460639");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "275812305398768" + "'", str7, "275812305398768");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1279221065518720" + "'", str11, "1279221065518720");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "913238100224789" + "'", str13, "913238100224789");
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "425" + "'", str13, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2523025594" + "'", str19, "2523025594");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("3775398402");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "243824679574551265069661403720" + "'", str9, "243824679574551265069661403720");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93749170520354433656490280463" + "'", str11, "93749170520354433656490280463");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
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
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "34546804442812240010280504882" + "'", str9, "34546804442812240010280504882");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "34546804442812240010280504882" + "'", str11, "34546804442812240010280504882");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\000\ufffd\036\ufffd\ufffd\007" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\000\ufffd\036\ufffd\ufffd\007");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "363094874612490749717771080177" + "'", str15, "363094874612490749717771080177");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("806729601483697513872336243167");
        java.lang.String str5 = rSA1.decrypt("4942163606");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "N\t\ufffd\ufffd\ufffd\ufffd\212\ufffdB\005" + "'", str3, "N\t\ufffd\ufffd\ufffd\ufffd\212\ufffdB\005");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffdfI:xd6" + "'", str5, "\b\ufffd\ufffd\ufffd\ufffdfI:xd6");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.decrypt("430269816702801749253730374585");
        java.lang.String str15 = rSA1.encrypt("90967218952484659256262255690");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1653849392066320" + "'", str11, "1653849392066320");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\005\ufffd\ufffd\ufffd*" + "'", str13, "\005\ufffd\005\ufffd\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "229820700335775" + "'", str15, "229820700335775");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.decrypt("361606126042016");
        java.lang.String str17 = rSA1.decrypt("109");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338" + "'", str9, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "199" + "'", str13, "199");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\0015" + "'", str15, "\0015");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001L" + "'", str17, "\001L");
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("269");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "913729407754218806226565473913" + "'", str9, "913729407754218806226565473913");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "286738548020057170909145705708" + "'", str11, "286738548020057170909145705708");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "469792688734754129391852169220" + "'", str13, "469792688734754129391852169220");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35686284773183624427235194766" + "'", str17, "35686284773183624427235194766");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("1629935995");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "185110066767998222125854397376" + "'", str9, "185110066767998222125854397376");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\035\ufffd\ufffd\026\ufffd" + "'", str11, "\006\ufffd\035\ufffd\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\007\ufffd\ufffd\ufffd\ufffd`" + "'", str13, "\005\ufffd\ufffd\007\ufffd\ufffd\ufffd\ufffd`");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        java.lang.String str17 = rSA1.decrypt("641878189380227");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "669726686682975" + "'", str7, "669726686682975");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2606725871250383" + "'", str13, "2606725871250383");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ri)o\tj\020" + "'", str15, "\ri)o\tj\020");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013\ufffdx\003\ufffd\ufffd" + "'", str17, "\013\ufffdx\003\ufffd\ufffd");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\030\ufffd\ufffd" + "'", str3, "\001\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "124034627355492" + "'", str5, "124034627355492");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "386607523536498" + "'", str7, "386607523536498");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\020'*T" + "'", str9, "\000\ufffd\ufffd\020'*T");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90" + "'", str11, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "226" + "'", str15, "226");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2" + "'", str17, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "641410521" + "'", str21, "641410521");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffdB\n" + "'", str23, "\ufffdB\n");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\u0792" + "'", str25, "\u0792");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd" + "'", str5, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4879448049" + "'", str7, "4879448049");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\f\ufffd" + "'", str9, "\001\ufffd\f\ufffd");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.decrypt("755629646");
        java.lang.String str17 = rSA1.decrypt("1053558225107145");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "350346471535814233205363223968" + "'", str9, "350346471535814233205363223968");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "641276294178677399352003486866" + "'", str11, "641276294178677399352003486866");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "230530580021701746037334141811" + "'", str13, "230530580021701746037334141811");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\u0105\023\ufffd\ufffdf=\n" + "'", str15, "\ufffd\ufffd\u0105\023\ufffd\ufffdf=\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\u0528\004\007\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd\u0528\004\007\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.decrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1242684733026997" + "'", str7, "1242684733026997");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325" + "'", str11, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "383" + "'", str21, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "139" + "'", str27, "139");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1305020330511143" + "'", str7, "1305020330511143");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "240" + "'", str19, "240");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.encrypt("180760426369578260433288579634");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "544552688988650298407047831806" + "'", str3, "544552688988650298407047831806");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "81559963152685296539463585113" + "'", str5, "81559963152685296539463585113");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.encrypt("828944592250846");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "135" + "'", str7, "135");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("5693705465");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\\\ufffd\u0237\ufffd\u6d19\ufffd\ufffd" + "'", str11, "\003\\\ufffd\u0237\ufffd\u6d19\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u0465\ufffd\ufffd\ufffd\ufffd\ufffd\007U" + "'", str13, "\001\u0465\ufffd\ufffd\ufffd\ufffd\ufffd\007U");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        java.lang.String str21 = rSA1.decrypt("930558594");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "528842153008250" + "'", str11, "528842153008250");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "139560119383139" + "'", str13, "139560119383139");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "63516963355439" + "'", str15, "63516963355439");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "86351198295434541835716001358" + "'", str19, "86351198295434541835716001358");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004q_\003\ufffd\026\ufffd\ufffd\ufffd" + "'", str21, "\004q_\003\ufffd\026\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("7686411764");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffddg" + "'", str3, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffddg");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\"\ufffd\u0212\ufffd\ufffd\ufffd" + "'", str9, "\t\"\ufffd\u0212\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "254177897119585444521892832255" + "'", str9, "254177897119585444521892832255");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9789581942711817573290195724" + "'", str11, "9789581942711817573290195724");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\033\\\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\033\\\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\007\ufffd\ufffd\ufffd*" + "'", str17, "\007\007\ufffd\ufffd\ufffd*");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "887002333628960" + "'", str19, "887002333628960");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\034\ufffd\ufffd\ufffd\ufffd\026\t\ufffd4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??T\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5" + "'", str13, "5");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("825110335461462544760601940215");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5562871792" + "'", str3, "5562871792");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "334471077" + "'", str7, "334471077");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "230" + "'", str13, "230");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
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
        java.lang.String str23 = rSA1.decrypt("1996950608877507");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "265" + "'", str15, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "247" + "'", str17, "247");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "849103967" + "'", str21, "849103967");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "&C\r\ufffd" + "'", str23, "&C\r\ufffd");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("49376333609094587042351986760");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\002\ufffd\032\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?C???q?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "469200216639004248547842489901" + "'", str9, "469200216639004248547842489901");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffdc7\023\ufffde\004\ufffd\u02cb\ufffd" + "'", str11, "\006\ufffdc7\023\ufffde\004\ufffd\u02cb\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffdW" + "'", str13, "\013\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffdW");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\003\ufffd\007\201\t\ufffd\ufffd" + "'", str9, "\002\ufffd\003\ufffd\007\201\t\ufffd\ufffd");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        java.lang.String str15 = rSA1.encrypt("453271197550529659739416350615");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "132648571397950" + "'", str7, "132648571397950");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7454189653" + "'", str13, "7454189653");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7817780481" + "'", str15, "7817780481");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("416175732479790270497901975791");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\005\"\ufffd\016\ufffdX");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "%t\rE" + "'", str3, "%t\rE");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "704268101" + "'", str5, "704268101");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("6972139707");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\006\000\ufffd\ufffd\ufffd\022\032\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??Y?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1323982701278841" + "'", str11, "1323982701278841");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
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
        java.lang.String str23 = rSA1.decrypt("2881836573");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45378871259824197293657888282" + "'", str9, "45378871259824197293657888282");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "309498970637259726412280393683" + "'", str13, "309498970637259726412280393683");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1016718315861421" + "'", str19, "1016718315861421");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "882544204183970" + "'", str21, "882544204183970");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "!\027\ufffd\023\ufffd" + "'", str23, "!\027\ufffd\023\ufffd");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2368376479644622" + "'", str11, "2368376479644622");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1932672305136549" + "'", str13, "1932672305136549");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "898390365277067074980102726271" + "'", str19, "898390365277067074980102726271");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
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
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "608162176768928" + "'", str7, "608162176768928");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "654" + "'", str19, "654");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "323" + "'", str11, "323");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "357" + "'", str13, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "861146582543015857800642702335" + "'", str17, "861146582543015857800642702335");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "573036296106798935315609316727" + "'", str19, "573036296106798935315609316727");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("612697493508374");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10978119750830177912865198535" + "'", str5, "10978119750830177912865198535");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24963179976282148779004854138" + "'", str7, "24963179976282148779004854138");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "121" + "'", str13, "121");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "64" + "'", str15, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "403" + "'", str17, "403");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4441119558376593799174424700" + "'", str9, "4441119558376593799174424700");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd\u0552\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd\u0552\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "513601515320734033807294675922" + "'", str13, "513601515320734033807294675922");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "261518892039158115192768128314" + "'", str15, "261518892039158115192768128314");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "284624997107158656722728717521" + "'", str9, "284624997107158656722728717521");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "284624997107158656722728717521" + "'", str11, "284624997107158656722728717521");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd-" + "'", str13, "\003\ufffd\ufffd\023\ufffd\ufffd\ufffd\ufffd-");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "25790866149454306829012950490" + "'", str15, "25790866149454306829012950490");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003+\021\ufffd\ufffd\ufffd\ufffd\ufffdda`\017" + "'", str17, "\003+\021\ufffd\ufffd\ufffd\ufffd\ufffdda`\017");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\n\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("451850837066694558586623217114");
        java.lang.String str15 = rSA1.decrypt("39686563120869282232251443678");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "782059555453462079482225297835" + "'", str9, "782059555453462079482225297835");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "782059555453462079482225297835" + "'", str11, "782059555453462079482225297835");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\026\ufffd\ufffd\ufffd\ufffd\ufffdg" + "'", str15, "\b\026\ufffd\ufffd\ufffd\ufffd\ufffdg");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\030\030\ufffd\ufffd\ufffdK\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\u067b\ufffd\u0444\034" + "'", str11, "\000\ufffd\ufffd\ufffd\u067b\ufffd\u0444\034");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20110356930055299733025416045" + "'", str13, "20110356930055299733025416045");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.decrypt("361606126042016");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003." + "'", str7, "\003.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "754" + "'", str9, "754");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "368" + "'", str13, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "X" + "'", str15, "X");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\000w\002\ufffd\ufffd\ufffdUI\025z" + "'", str11, "\005\ufffd\000w\002\ufffd\ufffd\ufffdUI\025z");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002*#\007\ufffd\ufffd\ufffd\ufffd\ufffd)" + "'", str13, "\002*#\007\ufffd\ufffd\ufffd\ufffd\ufffd)");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("2448943656306246");
        java.lang.String str15 = rSA1.decrypt("1761509011968114");
        java.lang.String str17 = rSA1.encrypt("586484883488476944285634949595");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "480076263943580495796335313071" + "'", str9, "480076263943580495796335313071");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\034\ufffd\ufffd\ufffd\ufffd\030" + "'", str13, "\002\ufffd\034\ufffd\ufffd\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\027\021\0344\022\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\027\021\0344\022\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "102401801900034277224633433457" + "'", str17, "102401801900034277224633433457");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("141592947570930378736777989995");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\006\027\ufffd\ufffd\033\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "133946576314426099569777849954" + "'", str9, "133946576314426099569777849954");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0056\017\ufffd\007s\026" + "'", str13, "\0056\017\ufffd\007s\026");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1135447941694403" + "'", str15, "1135447941694403");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "272652927824505" + "'", str17, "272652927824505");
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("23596208946137472461782808");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1488551120555090" + "'", str7, "1488551120555090");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\023\ufffd\u04da\ufffd" + "'", str9, "\004\ufffd\023\ufffd\u04da\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "509217366257397" + "'", str13, "509217366257397");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "487417146619725" + "'", str15, "487417146619725");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
            java.lang.String str19 = rSA1.decrypt("\001\ufffd\ufffdw");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?)??w\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "98" + "'", str13, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "303270186577106047169940671604" + "'", str17, "303270186577106047169940671604");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
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
        java.lang.String str29 = rSA1.decrypt("256772000544593082063878359898");
        java.lang.Class<?> wildcardClass30 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1436679675899456" + "'", str7, "1436679675899456");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "627181307627295" + "'", str13, "627181307627295");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffdR\007S" + "'", str15, "\ufffdR\007S");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\004\ufffd8" + "'", str19, "\003\004\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "18380723" + "'", str21, "18380723");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\027" + "'", str23, "\001\027");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\017\007" + "'", str25, "\ufffd\017\007");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2379410442" + "'", str27, "2379410442");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ufffd\ufffd2" + "'", str29, "\ufffd\ufffd2");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\ufffd\026\ufffd\ufffd\ufffd?\037[");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"cAU\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "544808115" + "'", str3, "544808115");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6088128514" + "'", str5, "6088128514");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8254279551" + "'", str7, "8254279551");
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("556");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2562028469" + "'", str15, "2562028469");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("2226987130855552");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\000\ufffd\ufffdC" + "'", str5, "\002\000\ufffd\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2546860720" + "'", str7, "2546860720");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3601260135" + "'", str9, "3601260135");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "509464954247632736429644810882" + "'", str15, "509464954247632736429644810882");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("726538495898349057827372017464");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd;n\000\ufffd\u07d1\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd;n\000\ufffd\u07d1\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "520894147885148525060169357624" + "'", str13, "520894147885148525060169357624");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "131223141522073681120609954864" + "'", str15, "131223141522073681120609954864");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2978921143302241" + "'", str7, "2978921143302241");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1264125908514376" + "'", str13, "1264125908514376");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd9" + "'", str15, "\001\ufffd\ufffd\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\u06c0" + "'", str17, "\004\ufffd\ufffd\ufffd\u06c0");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1055253820949808" + "'", str19, "1055253820949808");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffdptt" + "'", str21, "\002\ufffd\ufffdptt");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("1053810964353719");
        java.lang.String str15 = rSA1.encrypt("702623848205781281862423126661");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1225675505" + "'", str7, "1225675505");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "34265915101091610190468107448" + "'", str13, "34265915101091610190468107448");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "37872118870973104959485826116" + "'", str15, "37872118870973104959485826116");
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\t\023\ufffdw");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??[uC?w\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37840735588322" + "'", str13, "37840735588322");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd \016\001\ufffd" + "'", str15, "\000\ufffd \016\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "131336823024181782222360067685" + "'", str19, "131336823024181782222360067685");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\n\ufffd\ufffd\ufffd\023\ufffd0\017\ufffd(\002y" + "'", str21, "\003\n\ufffd\ufffd\ufffd\023\ufffd0\017\ufffd(\002y");
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "424750978858007" + "'", str7, "424750978858007");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1642586901230845" + "'", str13, "1642586901230845");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd1E " + "'", str15, "\002\ufffd\ufffd\ufffd1E ");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffdf~" + "'", str19, "\000\ufffd\ufffdf~");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("402589691083885215292103569097");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "789671095612003974310027108031" + "'", str9, "789671095612003974310027108031");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "861941706500555296705992128158" + "'", str11, "861941706500555296705992128158");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "825092263110222" + "'", str7, "825092263110222");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1104250124363949" + "'", str13, "1104250124363949");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\037\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "837085632562659" + "'", str19, "837085632562659");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10311809939173" + "'", str21, "10311809939173");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
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
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "223241174311475" + "'", str7, "223241174311475");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "355" + "'", str19, "355");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "101065484198496496483344720180" + "'", str9, "101065484198496496483344720180");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd.\004\002\ufffd\u011e\ufffdjx\023" + "'", str11, "\003\ufffd.\004\002\ufffd\u011e\ufffdjx\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd(\026\024\ufffd\t1\n\030" + "'", str15, "\004\ufffd(\026\024\ufffd\t1\n\030");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "404672707452906720930653153691" + "'", str19, "404672707452906720930653153691");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("225089623685693560529903855490");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\u0465\r\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1986366133822287" + "'", str7, "1986366133822287");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "197" + "'", str15, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        java.lang.String str17 = rSA1.encrypt("372");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1193239306477439" + "'", str7, "1193239306477439");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001l\007\ufffd\ufffd\ufffd" + "'", str13, "\001l\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd=\016\fM" + "'", str15, "\001\ufffd\ufffd=\016\fM");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2883164829924131" + "'", str17, "2883164829924131");
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1262689862001069" + "'", str7, "1262689862001069");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2098353558446057" + "'", str13, "2098353558446057");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\033\ufffd\ufffd\u0175" + "'", str15, "\007\ufffd\033\ufffd\ufffd\u0175");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\021\ufffd\ufffd\ufffd" + "'", str19, "\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "673176864" + "'", str21, "673176864");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\027" + "'", str23, "\001\027");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\030\ufffd\f\ufffd" + "'", str25, "\030\ufffd\f\ufffd");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.encrypt("2372308538763998");
        java.lang.String str9 = rSA1.decrypt("557470480640898599124170393563");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "992436543" + "'", str5, "992436543");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "316849506034013557108733412574" + "'", str7, "316849506034013557108733412574");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\037\u02f1\032\ufffd\ufffd\000\ufffd\ufffd\ufffd" + "'", str9, "\005\ufffd\037\u02f1\032\ufffd\ufffd\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd`x\030\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd`x\030\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\020\ufffdn" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\020\ufffdn");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "538736489371187" + "'", str7, "538736489371187");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "393" + "'", str19, "393");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "789" + "'", str21, "789");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
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
        java.lang.String str25 = rSA1.encrypt("430");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "45599853482593564081025897112" + "'", str9, "45599853482593564081025897112");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\032\b?9i\033\ufffd\ufffd\b\ufffd\ufffd\ufffd" + "'", str11, "\007\032\b?9i\033\ufffd\ufffd\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\u020a\u0136\ufffd" + "'", str13, "\007\ufffd\ufffd\u020a\u0136\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u9de2\ufffd\u04eb\ufffd\ufffd+E" + "'", str17, "\u9de2\ufffd\u04eb\ufffd\ufffd+E");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8990596271555829408119233099" + "'", str21, "8990596271555829408119233099");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "25932163985687353835708581982" + "'", str23, "25932163985687353835708581982");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "16900244034710469630798199615" + "'", str25, "16900244034710469630798199615");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\f\026\ufffd\ufffd\ufffd" + "'", str13, "\005\f\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001}\017\ufffd\ufffd\ufffd\n\ufffd\ufffd" + "'", str15, "\001}\017\ufffd\ufffd\ufffd\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd" + "'", str19, "\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "522867589435290170539933745451" + "'", str9, "522867589435290170539933745451");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ud253\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\003\ud253\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "112906057619583055721115223356" + "'", str13, "112906057619583055721115223356");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "235918702832609136719443988057" + "'", str15, "235918702832609136719443988057");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7962624" + "'", str17, "7962624");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\017(B\006\030\016\ufffdJ" + "'", str19, "\003\017(B\006\030\016\ufffdJ");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
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
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "868103321521268" + "'", str7, "868103321521268");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "135" + "'", str15, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "490684685416666" + "'", str7, "490684685416666");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\007\ufffd\ufffdR" + "'", str9, "\007\ufffd\007\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2893635835151664" + "'", str13, "2893635835151664");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffdm");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\037" + "'", str3, "\037");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40522448924073179928202896109" + "'", str7, "40522448924073179928202896109");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\b\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("157959505315451452517211227333");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1590047805902023" + "'", str7, "1590047805902023");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "381" + "'", str15, "381");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "201" + "'", str17, "201");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("806729601483697513872336243167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\001LP\033\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?LP?C0?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\025\023\u0462k12" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\025\023\u0462k12");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\\\ufffd\ufffd" + "'", str13, "\005\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1126133504978783" + "'", str15, "1126133504978783");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "316219404730153" + "'", str17, "316219404730153");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\016" + "'", str21, "\016");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "843827892126249" + "'", str7, "843827892126249");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1273936963484508" + "'", str13, "1273936963484508");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffdJ\t$" + "'", str15, "\003\ufffdJ\t$");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\017\ufffd" + "'", str19, "\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "189575077561551918486097990398" + "'", str23, "189575077561551918486097990398");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "365464609534571354337922689152" + "'", str25, "365464609534571354337922689152");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        java.lang.String str25 = rSA1.encrypt("u");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2548538411889867" + "'", str7, "2548538411889867");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3351198976258246" + "'", str13, "3351198976258246");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\n\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!ZZz" + "'", str19, "!ZZz");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "142431850366602497298314599801" + "'", str23, "142431850366602497298314599801");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "21924480357" + "'", str25, "21924480357");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdw");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\001\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?c???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "214395163521533" + "'", str13, "214395163521533");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("6972139707");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "328" + "'", str7, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1215388935289525" + "'", str11, "1215388935289525");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.decrypt("5447816862");
        java.lang.String str11 = rSA1.encrypt("895208255");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "294" + "'", str11, "294");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffdQ\017q~\177\ufffd\025\ufffdM0");
        java.lang.String str19 = rSA1.encrypt("1934199967458848");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "530" + "'", str11, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "509" + "'", str13, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "289695506134872186859706683125" + "'", str17, "289695506134872186859706683125");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "88326139265469821322795099627" + "'", str19, "88326139265469821322795099627");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("496833099736621829647942842495");
        java.lang.String str13 = rSA1.decrypt("2836091720111680");
        java.lang.String str15 = rSA1.decrypt("3416410363345270");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2191382922" + "'", str3, "2191382922");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6101317772" + "'", str7, "6101317772");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5248331344" + "'", str9, "5248331344");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7190639698" + "'", str11, "7190639698");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("\030\ufffd\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("9160802449");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2902801383" + "'", str7, "2902801383");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "399218178" + "'", str9, "399218178");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd;j" + "'", str11, "\001\ufffd;j");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7035134689" + "'", str13, "7035134689");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3652659794" + "'", str15, "3652659794");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "203295766041821509236512994768" + "'", str9, "203295766041821509236512994768");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\001\ufffd\ufffd\u031e\ufffd\ufffd\ufffd\ufffd\177\ufffd," + "'", str11, "\n\001\ufffd\ufffd\u031e\ufffd\ufffd\ufffd\ufffd\177\ufffd,");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "236222360610618930276055300629" + "'", str13, "236222360610618930276055300629");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "146307919763486402359870476706" + "'", str15, "146307919763486402359870476706");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "489324479208692056418970888301" + "'", str17, "489324479208692056418970888301");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
            java.lang.String str17 = rSA1.decrypt("\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"kJ?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1205209594918868" + "'", str7, "1205209594918868");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1634308302494433" + "'", str13, "1634308302494433");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "315802401881916" + "'", str7, "315802401881916");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "49" + "'", str19, "49");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.decrypt("473642297");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3938980639167" + "'", str5, "3938980639167");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd=\"\ufffd\ufffd\ufffdM" + "'", str7, "\001\ufffd\ufffd=\"\ufffd\ufffd\ufffdM");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "95240229075679" + "'", str7, "95240229075679");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001 \016\ufffd\ufffd\ufffd" + "'", str9, "\001 \016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "71372725889711" + "'", str13, "71372725889711");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1607380136496818" + "'", str15, "1607380136496818");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffdx" + "'", str17, "\000\ufffd\ufffd\ufffdx");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("3064477541808429");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "859838899510723" + "'", str7, "859838899510723");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "280076376441377" + "'", str9, "280076376441377");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1345336651639943" + "'", str11, "1345336651639943");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "114" + "'", str15, "114");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("503");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2157191890" + "'", str3, "2157191890");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3895956568" + "'", str5, "3895956568");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2413543394" + "'", str7, "2413543394");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "95344643820416272274799358533" + "'", str11, "95344643820416272274799358533");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5" + "'", str11, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10" + "'", str15, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "245" + "'", str17, "245");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "126" + "'", str19, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "232" + "'", str21, "232");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("410");
        java.lang.String str5 = rSA1.decrypt("456351013126802");
        java.lang.String str7 = rSA1.encrypt("268370251453300563787314458062");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "235579036583572596036859111161" + "'", str3, "235579036583572596036859111161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffdw&" + "'", str5, "\001\ufffd\ufffd\ufffd\ufffd\ufffdw&");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "334196875763943193202003765461" + "'", str7, "334196875763943193202003765461");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
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
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "200475666520496" + "'", str7, "200475666520496");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "425146764508140" + "'", str13, "425146764508140");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1810572787129066" + "'", str17, "1810572787129066");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("Y\036\ufffd\025");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"Y???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "643103274848837" + "'", str7, "643103274848837");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1059475045" + "'", str3, "1059475045");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4481202347" + "'", str7, "4481202347");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
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
        java.lang.String str25 = rSA1.decrypt("783154590");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "127235983340678793101203539058" + "'", str9, "127235983340678793101203539058");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43898385091156310057237778213" + "'", str11, "43898385091156310057237778213");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "245762891400776503118175935177" + "'", str13, "245762891400776503118175935177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "177" + "'", str17, "177");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{" + "'", str19, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "205" + "'", str21, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd" + "'", str25, "\002\ufffd");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("2183500682712619");
        java.lang.String str15 = rSA1.encrypt("183122363891109260507523236265");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5152913264" + "'", str7, "5152913264");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40908281608365304085360195731" + "'", str13, "40908281608365304085360195731");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "36889312402462405966288044447" + "'", str15, "36889312402462405966288044447");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("321842069114441562362352839359");
        java.lang.String str11 = rSA1.decrypt("1012529833103073");
        java.lang.String str13 = rSA1.decrypt("134072367032148763347304674117");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001Z" + "'", str3, "\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\037\ufffd\ufffdX,\021\ufffd\001\ufffd" + "'", str9, "\007\ufffd\037\ufffd\ufffdX,\021\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\030\ufffd\ufffd\ufffd\ufffd\ufffd\u019f\ufffd\ufffd\ufffd" + "'", str11, "\030\ufffd\ufffd\ufffd\ufffd\ufffd\u019f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\021\ufffdt\017\ufffd" + "'", str13, "\004\ufffd\ufffd\021\ufffdt\017\ufffd");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        java.lang.String str15 = rSA1.decrypt("324");
        java.lang.String str17 = rSA1.decrypt("397646092825710359010702002350");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1490554701246154" + "'", str7, "1490554701246154");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "357533855546395458347439071567" + "'", str13, "357533855546395458347439071567");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\035\002\u062b\ufffd\ufffd" + "'", str15, "\b\ufffd\ufffd\ufffd\ufffd\035\002\u062b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\032\ufffd\ufffd\ufffdA4" + "'", str17, "\001\ufffd\032\ufffd\ufffd\ufffdA4");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\"\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\"\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1107875396833160" + "'", str7, "1107875396833160");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\u040a" + "'", str9, "\001\ufffd\u040a");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1180483922769156" + "'", str13, "1180483922769156");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1073515848971087" + "'", str17, "1073515848971087");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "447806816374638" + "'", str19, "447806816374638");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
        java.lang.String str21 = rSA1.encrypt("451");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "637542278062286336803514502787" + "'", str9, "637542278062286336803514502787");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "954036618435107624467537179679" + "'", str11, "954036618435107624467537179679");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "276240870271915124983563202044" + "'", str13, "276240870271915124983563202044");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006K\001\ufffd\ufffd\ufffd\ufffd=\027\ufffd\ufffd" + "'", str15, "\006K\001\ufffd\ufffd\ufffd\ufffd=\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1519445852" + "'", str21, "1519445852");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "340561159968930557220944766873" + "'", str9, "340561159968930557220944766873");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "532853256939317389180424776241" + "'", str11, "532853256939317389180424776241");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\u0238^wK\017 " + "'", str13, "\004\ufffd\ufffd\u0238^wK\017 ");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
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
        java.lang.String str23 = rSA1.encrypt("1561327131722797");
        java.lang.String str25 = rSA1.decrypt("8803893522");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001>" + "'", str15, "\001>");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "46" + "'", str17, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "173" + "'", str19, "173");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "101" + "'", str21, "101");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "322" + "'", str23, "322");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd" + "'", str25, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("760666216293048255539908876499");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.decrypt("753709548305681");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\002\034\ufffd\026\ufffd\006\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "215133780031781948531481203336" + "'", str9, "215133780031781948531481203336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "215956886111595992758879988281" + "'", str11, "215956886111595992758879988281");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\u0258\024\ufffd\ufffd\r\254\ufffd(" + "'", str13, "\003\ufffd\ufffd\u0258\024\ufffd\ufffd\r\254\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\027\\\ufffd\ufffd\\\ufffd\0353" + "'", str15, "\003\ufffd\ufffd\ufffd\027\\\ufffd\ufffd\\\ufffd\0353");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("2133068282947590");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "308199411844394186625331255904" + "'", str11, "308199411844394186625331255904");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "457148489889767833306516590829" + "'", str13, "457148489889767833306516590829");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "128" + "'", str17, "128");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        java.lang.String str17 = rSA1.encrypt("538621452366062192513302577482");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1171252779006817" + "'", str7, "1171252779006817");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "316" + "'", str11, "316");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001 OdE" + "'", str15, "\001 OdE");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2253364757" + "'", str17, "2253364757");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\005\u027d");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffdFQ\006\u0636\ufffd\017\ufffd\ufffd\\" + "'", str11, "\ufffdFQ\006\u0636\ufffd\017\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35650768842852432574244243682" + "'", str13, "35650768842852432574244243682");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "227" + "'", str7, "227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "185" + "'", str11, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44921598478127941669411360805" + "'", str17, "44921598478127941669411360805");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "27648062498372864467093452677" + "'", str19, "27648062498372864467093452677");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("1882619584226286");
        java.lang.String str17 = rSA1.decrypt("308540024292235");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "514667371176992503645439785592" + "'", str9, "514667371176992503645439785592");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\u0290\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd\u0290\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffdm(\020\ufffd\u063c\ufffd\ufffd\020" + "'", str13, "\007\ufffd\ufffdm(\020\ufffd\u063c\ufffd\ufffd\020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "793344289443193635452459322076" + "'", str15, "793344289443193635452459322076");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\\\016\ufffd\ufffd\001\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\007\\\016\ufffd\ufffd\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("779");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1838651471" + "'", str9, "1838651471");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\007KS]" + "'", str11, "\001\007KS]");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.decrypt("361606126042016");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001>" + "'", str7, "\001>");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "506" + "'", str9, "506");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "430" + "'", str13, "430");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\022" + "'", str15, "\001\022");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "214" + "'", str9, "214");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.lang.String str15 = rSA1.encrypt("576838359927970006129927354507");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\ufffdSB\001\ufffd\003\ufffd\t\rP");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"vY?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "274" + "'", str13, "274");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "45" + "'", str15, "45");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
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
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\001\ufffdx\n\ufffd\ufffdF" + "'", str11, "\005\001\ufffdx\n\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "33570448563366733031" + "'", str15, "33570448563366733031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3179541548601264698954981240" + "'", str17, "3179541548601264698954981240");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\177\r\ufffd\027\ufffd\ufffdY\025\ufffdX" + "'", str19, "\004\177\r\ufffd\027\ufffd\ufffdY\025\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "153847642271516769744159921954" + "'", str21, "153847642271516769744159921954");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "43171378366127328243679691166" + "'", str23, "43171378366127328243679691166");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1216338460834190" + "'", str7, "1216338460834190");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffdV" + "'", str9, "\003\ufffd\ufffd\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1251472241038399" + "'", str13, "1251472241038399");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "140608" + "'", str15, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1358259592875960" + "'", str17, "1358259592875960");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1492651220205243" + "'", str19, "1492651220205243");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001J\003\ufffd\002\ufffd" + "'", str21, "\001J\003\ufffd\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "s\b\ufffd\ufffd\ufffd" + "'", str23, "s\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1277396088912664" + "'", str25, "1277396088912664");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("687316887150992152363348790340");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "597146767740818539450506584703" + "'", str11, "597146767740818539450506584703");
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("612697493508374");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffdh\n\n\036\ufffdJ" + "'", str3, "\ufffd\ufffd\ufffd\ufffdh\n\n\036\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "35365794009384051641273003371" + "'", str5, "35365794009384051641273003371");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "122340388237639228670744271653" + "'", str7, "122340388237639228670744271653");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd\ufffd\u02c0\ufffd\ufffd\007," + "'", str3, "\006\ufffd\ufffd\u02c0\ufffd\ufffd\007,");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("23596208946137472461782808");
        java.lang.String str17 = rSA1.encrypt("\n\ufffd\ufffd\ufffd\001\ufffd9/\020\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17965615287067" + "'", str7, "17965615287067");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "94439647148862" + "'", str13, "94439647148862");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "628052419056805" + "'", str15, "628052419056805");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2929796062614011" + "'", str17, "2929796062614011");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.String str5 = rSA1.encrypt("\001\027");
        java.lang.String str7 = rSA1.encrypt("303767102520551097735618372907");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("100563547529303");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "164341563462254592" + "'", str3, "164341563462254592");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "131591980401875559" + "'", str5, "131591980401875559");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "31771264123140442017947275269" + "'", str7, "31771264123140442017947275269");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\t" + "'", str11, "\001\t");
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\006\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??oq?q?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "13532079517" + "'", str3, "13532079517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10802259758" + "'", str5, "10802259758");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "14019177668" + "'", str7, "14019177668");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("4");
        java.lang.String str17 = rSA1.decrypt("407287699968968719545226543717");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "620933733310083" + "'", str7, "620933733310083");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\025\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2494447254331543" + "'", str11, "2494447254331543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2568940474180916" + "'", str13, "2568940474180916");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\013\ufffdaj" + "'", str17, "\005\ufffd\013\ufffdaj");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("8403463512");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\000\ufffd\ufffdf]");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???f]\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "678350101087290" + "'", str7, "678350101087290");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n\ufffd\":\001\ufffd" + "'", str9, "\n\ufffd\":\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\\r" + "'", str11, "\005\ufffd\ufffd\ufffd\\r");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "994726211378621" + "'", str7, "994726211378621");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "228" + "'", str15, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "700" + "'", str17, "700");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "160" + "'", str19, "160");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
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
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "596099446840826" + "'", str7, "596099446840826");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "24" + "'", str15, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "481" + "'", str17, "481");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\020" + "'", str19, "\020");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("5693705465");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??)??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34594700" + "'", str3, "34594700");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3138923038" + "'", str5, "3138923038");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8401129835" + "'", str7, "8401129835");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7587497483" + "'", str9, "7587497483");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1942778849" + "'", str11, "1942778849");
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1110200530" + "'", str3, "1110200530");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6361337565" + "'", str7, "6361337565");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\001\ufffd" + "'", str9, "\000\ufffd\001\ufffd");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.decrypt("582");
        java.lang.String str17 = rSA1.decrypt("641878189380227");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \";F.?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "428159463374140" + "'", str7, "428159463374140");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2122951541863494" + "'", str13, "2122951541863494");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\004\ufffd\ufffd\ufffd" + "'", str17, "\006\004\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("96");
        java.lang.String str13 = rSA1.decrypt("651504433178840");
        java.lang.String str15 = rSA1.decrypt("2070900819871414");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10416085735186" + "'", str7, "10416085735186");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\022" + "'", str11, "\ufffd\022");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\035AAd" + "'", str13, "\035AAd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\f\ufffd\ufffd" + "'", str15, "\f\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        java.lang.String str15 = rSA1.decrypt("570514976048732924728282873013");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "662087537287149184233112791732" + "'", str9, "662087537287149184233112791732");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "766140474021158380393300101691" + "'", str11, "766140474021158380393300101691");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4194304" + "'", str13, "4194304");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007brt\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007\ufffd" + "'", str15, "\007brt\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\007\ufffd");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("86");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("776798903819055");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\024\ufffdy\026\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\024\ufffdy\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3.Z6" + "'", str11, "3.Z6");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        java.lang.String str27 = rSA1.encrypt("_");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1434941597024827" + "'", str7, "1434941597024827");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd}\177" + "'", str9, "\003\ufffd\ufffd\ufffd}\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "551788014343873" + "'", str13, "551788014343873");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "140608" + "'", str15, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1619739221177735" + "'", str17, "1619739221177735");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "462598715855363" + "'", str19, "462598715855363");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\u01e0\ufffd" + "'", str21, "\006\ufffd\u01e0\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffd\ufffd\ufffd\003\ufffd" + "'", str23, "\006\ufffd\ufffd\ufffd\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2071133220488206" + "'", str25, "2071133220488206");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "857375" + "'", str27, "857375");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1744065944868592" + "'", str7, "1744065944868592");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122" + "'", str11, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "x" + "'", str19, "x");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
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
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1915208971210447" + "'", str7, "1915208971210447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "127433198102768249492928032449" + "'", str13, "127433198102768249492928032449");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "277" + "'", str19, "277");
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("\002t");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("382306363299315393630957444423");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250" + "'", str5, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001B" + "'", str7, "\001B");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97678328378368" + "'", str11, "97678328378368");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1869498743" + "'", str15, "1869498743");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "101" + "'", str13, "101");
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("96549157373046875");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2805956427" + "'", str7, "2805956427");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6707288519" + "'", str9, "6707288519");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\007\ufffd$5" + "'", str11, "\002\007\ufffd$5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6880439596" + "'", str13, "6880439596");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("2183500682712619");
        java.lang.String str15 = rSA1.encrypt("131591980401875559");
        java.lang.String str17 = rSA1.decrypt("740436370679345");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "556" + "'", str3, "556");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4234818680" + "'", str7, "4234818680");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "24276413110797909553585208025" + "'", str13, "24276413110797909553585208025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "15608734722149910054699234724" + "'", str15, "15608734722149910054699234724");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffdt\021\037\013\ufffd\ufffd\ufffd\u0663\ufffd" + "'", str17, "\ufffdt\021\037\013\ufffd\ufffd\ufffd\u0663\ufffd");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007NFr\n\ufffd\ufffd\u040e\ufffd\ufffd" + "'", str11, "\007NFr\n\ufffd\ufffd\u040e\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "113938893120168054832874970957" + "'", str13, "113938893120168054832874970957");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i" + "'", str17, "i");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("178");
        java.lang.String str13 = rSA1.encrypt("530");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "$" + "'", str7, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "414788471190448" + "'", str11, "414788471190448");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1257144050330287" + "'", str13, "1257144050330287");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1450352388931742" + "'", str7, "1450352388931742");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1922559557720715" + "'", str13, "1922559557720715");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd_" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1565211172443314" + "'", str19, "1565211172443314");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2138362817854839" + "'", str21, "2138362817854839");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        java.lang.String str25 = rSA1.decrypt("31");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1809136646130839" + "'", str7, "1809136646130839");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\017\ufffd\025\ufffd" + "'", str9, "\001\ufffd\017\ufffd\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2790686920739043" + "'", str11, "2790686920739043");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2913764186271605" + "'", str13, "2913764186271605");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1028071702528" + "'", str15, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1339649287900724" + "'", str17, "1339649287900724");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "90356996690898" + "'", str19, "90356996690898");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\b\ufffd\301\ufffd\ufffd\037" + "'", str21, "\b\ufffd\301\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\ufffd\ufffd\ufffd\u04c5\ufffd" + "'", str23, "\003\ufffd\ufffd\ufffd\u04c5\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\t\ufffd\ufffd\ufffdA" + "'", str25, "\t\ufffd\ufffd\ufffdA");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        java.lang.String str23 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffdV");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\003\ufffd\ufffdJ" + "'", str13, "\000\ufffd\003\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3013952614946463" + "'", str15, "3013952614946463");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "6T\036\ufffd\ufffd\ufffddi+V" + "'", str19, "6T\036\ufffd\ufffd\ufffddi+V");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "22141369977435740414141476221" + "'", str21, "22141369977435740414141476221");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "15060095559781545755899087811" + "'", str23, "15060095559781545755899087811");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.encrypt("503");
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("377847364199075660969689943732");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3250065843992330977890612027" + "'", str3, "3250065843992330977890612027");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42353332408625927723" + "'", str5, "42353332408625927723");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "481091898611356036611484581480" + "'", str7, "481091898611356036611484581480");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004h|\002\ufffd\u0385\ufffd\016\ufffd\ufffd" + "'", str9, "\004h|\002\ufffd\u0385\ufffd\016\ufffd\ufffd");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\u8e25\ufffd\ufffdZ");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "~" + "'", str9, "~");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\022" + "'", str11, "\022");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "478" + "'", str15, "478");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "233205454605693410532861469025" + "'", str9, "233205454605693410532861469025");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\006\013\ufffd\ufffd\002h6<lV" + "'", str11, "\003\006\013\ufffd\ufffd\002h6<lV");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "290918302272849346598158524720" + "'", str13, "290918302272849346598158524720");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\r\n\\\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\r\n\\\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "570147939693723469303754749464" + "'", str19, "570147939693723469303754749464");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "73201115818892180036129685018" + "'", str21, "73201115818892180036129685018");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007m\"\000\ufffd\ufffd\ufffdAm" + "'", str23, "\007m\"\000\ufffd\ufffd\ufffdAm");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\003\ufffd\ufffdS\020\ufffd\ufffd\026\ufffd" + "'", str25, "\003\ufffd\ufffdS\020\ufffd\ufffd\026\ufffd");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("564955806244323");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdkRo");
        java.lang.String str21 = rSA1.encrypt("435513246556281");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2234525361074495" + "'", str7, "2234525361074495");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003" + "'", str13, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "392225528034232261216055459303" + "'", str17, "392225528034232261216055459303");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "175755150276078601757919287122" + "'", str19, "175755150276078601757919287122");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "447688034339302379299554782423" + "'", str21, "447688034339302379299554782423");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("108862119398595");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37805074531238270313" + "'", str11, "37805074531238270313");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\u0127\022\ufffd\ufffd\ufffd:" + "'", str13, "\000\ufffd\ufffd\u0127\022\ufffd\ufffd\ufffd:");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "58499243693484514356147890806" + "'", str9, "58499243693484514356147890806");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238634747977006070701274257212" + "'", str11, "238634747977006070701274257212");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "187561263486505198285051283029" + "'", str9, "187561263486505198285051283029");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "187027647136400250783292059405" + "'", str11, "187027647136400250783292059405");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "415510894702028874216848172697" + "'", str15, "415510894702028874216848172697");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "300797711243631367246303502486" + "'", str17, "300797711243631367246303502486");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("612289405983445152292783659486");
        java.lang.String str11 = rSA1.encrypt("1211351982");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5185630361" + "'", str3, "5185630361");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "702056100" + "'", str5, "702056100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6689050637" + "'", str7, "6689050637");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\024;&" + "'", str9, "\000\ufffd\024;&");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4612546549" + "'", str11, "4612546549");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.encrypt("1879527059809546");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd_\025\u05ad" + "'", str3, "\005\ufffd_\025\u05ad");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2316460836385944" + "'", str5, "2316460836385944");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "710248044092134" + "'", str7, "710248044092134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "192692818183207" + "'", str9, "192692818183207");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "563600615127196" + "'", str7, "563600615127196");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2675205388644609" + "'", str13, "2675205388644609");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffdVv" + "'", str15, "\b\ufffd\ufffdVv");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2124613158856504" + "'", str19, "2124613158856504");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1622909302448222" + "'", str21, "1622909302448222");
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("454984008143903684571717895618");
        java.lang.String str7 = rSA1.encrypt("73");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "403806017751799138003353185268" + "'", str5, "403806017751799138003353185268");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "563461804751933959651" + "'", str7, "563461804751933959651");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("241");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "87" + "'", str13, "87");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "661110543490480" + "'", str7, "661110543490480");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\0012" + "'", str19, "\0012");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffde" + "'", str25, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffde");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "799781046939902491920407305508" + "'", str9, "799781046939902491920407305508");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd8\020\ufffd\ufffd\037\ufffd" + "'", str11, "\b\ufffd\ufffd8\020\ufffd\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "195003671613559110940163607955" + "'", str13, "195003671613559110940163607955");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1069888064228859" + "'", str7, "1069888064228859");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1782652793585843" + "'", str13, "1782652793585843");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("\001 ");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23887872" + "'", str3, "23887872");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("844202742226834");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.encrypt("432373222534973726506934894382");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2072089189406422" + "'", str7, "2072089189406422");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "120559929" + "'", str11, "120559929");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\\\001\ufffdZ" + "'", str13, "\\\001\ufffdZ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1683017709" + "'", str15, "1683017709");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("8403463512");
        java.lang.String str13 = rSA1.decrypt("425");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdaI2");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1626648049431163" + "'", str7, "1626648049431163");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\u015ac06" + "'", str9, "\001\ufffd\u015ac06");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\b\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd>" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd>");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("17862321440275");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\ufffdV" + "'", str7, "\007\ufffd\ufffd\ufffdV");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\r\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("576");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "210894385280168594567906949817" + "'", str9, "210894385280168594567906949817");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\025Z" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\025Z");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "237476719285763280123351018905" + "'", str13, "237476719285763280123351018905");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "267043846285006968118879561522" + "'", str15, "267043846285006968118879561522");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "109683659374195231890102254406" + "'", str17, "109683659374195231890102254406");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1285927499702195" + "'", str7, "1285927499702195");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "90992643882518" + "'", str13, "90992643882518");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1598252790680564" + "'", str13, "1598252790680564");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "955296071326167" + "'", str15, "955296071326167");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\017\ufffd\ufffd\ufffd\ufffdO" + "'", str17, "\005\017\ufffd\ufffd\ufffd\ufffdO");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\u05eaJ\034\ufffd" + "'", str19, "\u05eaJ\034\ufffd");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.decrypt("806729601483697513872336243167");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\004\u46da\ufffd\ufffd\ufffd\"\002\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "605875738220270827910225572886" + "'", str9, "605875738220270827910225572886");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0069#\n\026\ufffd\ufffd\u07fc\ufffd" + "'", str11, "\0069#\n\026\ufffd\ufffd\u07fc\ufffd");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1085983737671052" + "'", str7, "1085983737671052");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "606918167" + "'", str11, "606918167");
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("321842069114441562362352839359");
        java.lang.String str11 = rSA1.decrypt("1012529833103073");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007" + "'", str3, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\036\ufffd\ufffd\u01d7|'\021\ufffd" + "'", str9, "\002\ufffd\036\ufffd\ufffd\u01d7|'\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffdV5g" + "'", str11, "\ufffd\ufffd\ufffd\ufffdV5g");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.decrypt("674932422672366921537205620483");
        java.lang.String str9 = rSA1.encrypt("34157020103984569493819670058");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "112" + "'", str5, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "408" + "'", str9, "408");
    }
}
