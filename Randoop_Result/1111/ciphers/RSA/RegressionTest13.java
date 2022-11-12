package ciphers.RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test6501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6501");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44670124994036693200799278318" + "'", str3, "44670124994036693200799278318");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "45847141016281931786928819009" + "'", str5, "45847141016281931786928819009");
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("292429178019428864799183198942");
        java.lang.String str17 = rSA1.encrypt("110302133409931788576842747570");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffdQ\n");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\u026f\ufffd\ufffd\n\ufffd\ufffd\ufffd}[>" + "'", str11, "\b\u026f\ufffd\ufffd\n\ufffd\ufffd\ufffd}[>");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\016\ufffdA" + "'", str15, "\005\ufffd\ufffd\016\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1814459380472414" + "'", str17, "1814459380472414");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "898795882442312" + "'", str19, "898795882442312");
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        java.lang.String str17 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        java.lang.String str19 = rSA1.encrypt("\013\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("115");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6264324650" + "'", str13, "6264324650");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2202504676" + "'", str15, "2202504676");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "700587285" + "'", str17, "700587285");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "297609112" + "'", str19, "297609112");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\033\u01a84" + "'", str21, "\002\033\u01a84");
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("{");
        java.lang.String str13 = rSA1.decrypt("0");
        java.lang.String str15 = rSA1.decrypt("41");
        java.lang.String str17 = rSA1.encrypt("1900954511");
        java.lang.String str19 = rSA1.decrypt("40361159947753931717153642692");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285" + "'", str11, "285");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "108" + "'", str17, "108");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("4448254484");
        java.lang.String str9 = rSA1.decrypt("2533194306");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("2759835273");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "543" + "'", str7, "543");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\r" + "'", str9, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "545169513712366226119925184958" + "'", str13, "545169513712366226119925184958");
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("20914855833503360039624631433");
        java.lang.String str9 = rSA1.encrypt("16156209496766550638227152486");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ue96c");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003|" + "'", str3, "\003|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "689" + "'", str5, "689");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "165" + "'", str7, "165");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "244" + "'", str9, "244");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "807" + "'", str11, "807");
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("211");
        java.lang.String str13 = rSA1.decrypt("289734891292401713311056387999");
        java.lang.String str15 = rSA1.decrypt("10");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35591581950267981457" + "'", str11, "35591581950267981457");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006*\013\003W\022\u02c5\032\ufffd.P\b" + "'", str13, "\006*\013\003W\022\u02c5\032\ufffd.P\b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\u03ec\ufffd\ufffd\ufffd\ufffd\\\ufffdI" + "'", str15, "\002\ufffd\u03ec\ufffd\ufffd\ufffd\ufffd\\\ufffdI");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36659261702001809733098319640" + "'", str5, "36659261702001809733098319640");
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.decrypt("37687704605112457902789117609");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("503");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "301874792443291186473760378283" + "'", str5, "301874792443291186473760378283");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\035\027\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\006\ufffd\035\027\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\003\ufffd\013\ufffd\u0677\ufffd\ufffd\t\ufffd" + "'", str11, "\b\003\ufffd\013\ufffd\u0677\ufffd\ufffd\t\ufffd");
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str9 = rSA1.encrypt("\001(");
        java.lang.String str11 = rSA1.encrypt("245");
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("638225244242910");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7615776716" + "'", str9, "7615776716");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8682775810" + "'", str11, "8682775810");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7714015657" + "'", str13, "7714015657");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1071280868" + "'", str17, "1071280868");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.decrypt("674338054");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("366088292426996016429888575387");
        java.lang.String str19 = rSA1.encrypt("\0014");
        java.lang.String str21 = rSA1.encrypt("2162138502240276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "387764417329288819885271174365" + "'", str5, "387764417329288819885271174365");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "230155299459615713600165440072" + "'", str9, "230155299459615713600165440072");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "389415775959024191988871972218" + "'", str11, "389415775959024191988871972218");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\022\023\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\022\023\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "127373187922064370783158914558" + "'", str15, "127373187922064370783158914558");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2771746976768" + "'", str19, "2771746976768");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1927198581506097528183533579" + "'", str21, "1927198581506097528183533579");
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
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
        java.lang.String str27 = rSA1.decrypt("3541590856");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffdH`B2" + "'", str13, "\ufffd\ufffd\ufffdH`B2");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "520496057454227" + "'", str17, "520496057454227");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str21, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2279431768" + "'", str23, "2279431768");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "4106844671" + "'", str25, "4106844671");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd\ufffd" + "'", str27, "\000\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("3077056399");
        java.lang.String str9 = rSA1.decrypt("3732906095");
        java.lang.String str11 = rSA1.encrypt("\002R");
        java.lang.String str13 = rSA1.decrypt("1720107886");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1552029588" + "'", str5, "1552029588");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "O" + "'", str7, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\022\ufffd\004\024" + "'", str9, "\022\ufffd\004\024");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "604764840" + "'", str11, "604764840");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("3350584720");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\006" + "'", str3, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "176" + "'", str5, "176");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "69" + "'", str7, "69");
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.decrypt("375");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002" + "'", str7, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("409247107494479");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.encrypt("|JH%w\016\t\ufffd\ufffd\001\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("\n\020NMa\032\ufffd\ufffd\ufffdI");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\023\ufffd^\b]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\005\ufffd!Og\022\ufffd\ufffd\032");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Qaz\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\004\r\ufffd\ufffd\032\ufffd\036\004sN\033" + "'", str11, "\b\ufffd\004\r\ufffd\ufffd\032\ufffd\036\004sN\033");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "128590774521902249412696385812" + "'", str15, "128590774521902249412696385812");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "188089377626894531400591637867" + "'", str17, "188089377626894531400591637867");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "410180069943039079747049781926" + "'", str19, "410180069943039079747049781926");
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.decrypt("17100415790055507982022224050");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffdK\f\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffdK\f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\020\ufffd\ufffd\ufffd\r\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\020\ufffd\ufffd\ufffd\r\ufffd\ufffd");
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd[3Z\000\u05ed");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdo\027\ufffd\b\ufffd5" + "'", str7, "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdo\027\ufffd\b\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3143575801449" + "'", str11, "3143575801449");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "534174873587923490982750310537" + "'", str13, "534174873587923490982750310537");
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("292429178019428864799183198942");
        java.lang.String str19 = rSA1.encrypt("116994478270808962397109947005");
        rSA1.generateKeys(100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "249708933517840520211612394521" + "'", str17, "249708933517840520211612394521");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "365111822154561009213434774896" + "'", str19, "365111822154561009213434774896");
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\033#\005X/n*\002\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?#?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("495");
        java.lang.String str9 = rSA1.encrypt("695");
        java.lang.String str11 = rSA1.decrypt("424612467007043689195370760679");
        java.lang.String str13 = rSA1.encrypt("5091654449");
        java.lang.String str15 = rSA1.encrypt("862570471995292");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1225708122760648" + "'", str7, "1225708122760648");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1647864226888864" + "'", str9, "1647864226888864");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\007\ufffd" + "'", str11, "\007\ufffd\ufffd\007\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1747306593049628" + "'", str13, "1747306593049628");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1020326081948323" + "'", str15, "1020326081948323");
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("9469426512");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "249" + "'", str7, "249");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3561027965" + "'", str11, "3561027965");
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("453285907300587");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.decrypt("23");
        java.lang.String str19 = rSA1.decrypt("402792630455279437269280723305");
        java.lang.String str21 = rSA1.encrypt("1899578454891835");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002<SK\004" + "'", str7, "\002<SK\004");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffdh " + "'", str11, "\004\ufffd\ufffd\ufffdh ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "153924391326700" + "'", str13, "153924391326700");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2311423075614672" + "'", str15, "2311423075614672");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\u023f" + "'", str17, "\004\ufffd\ufffd\ufffd\ufffd\u023f");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\"\033o\002W" + "'", str19, "\006\ufffd\"\033o\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1106296221461257" + "'", str21, "1106296221461257");
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("3137785344000");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\024\ufffd]\027\ufffd\ufffd\ufffd\0067." + "'", str11, "\002\ufffd\024\ufffd]\027\ufffd\ufffd\ufffd\0067.");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "57289927056754408857322376237" + "'", str19, "57289927056754408857322376237");
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.decrypt("108");
        java.lang.String str11 = rSA1.decrypt("437");
        java.lang.String str13 = rSA1.decrypt("276");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "c" + "'", str7, "c");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002I" + "'", str9, "\002I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002'" + "'", str11, "\002'");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001=" + "'", str13, "\001=");
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u2804t\021\013");
        java.lang.String str15 = rSA1.decrypt("329964049132614116993653227507");
        java.lang.String str17 = rSA1.encrypt("850127554175508");
        java.lang.String str19 = rSA1.encrypt("\002\027\021\ufffd\016");
        rSA1.generateKeys((int) '#');
        java.lang.String str23 = rSA1.encrypt("166");
        java.lang.String str25 = rSA1.decrypt("7195874034");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "160" + "'", str3, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003L" + "'", str9, "\003L");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "538" + "'", str11, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "511" + "'", str13, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "182" + "'", str17, "182");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "768" + "'", str19, "768");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4653679143" + "'", str23, "4653679143");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str25, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
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
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffdFv\005\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffdFv\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "447486685852863519896677982008" + "'", str15, "447486685852863519896677982008");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "708507857521480741717211094496" + "'", str17, "708507857521480741717211094496");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffd\u0708\ufffd\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd\ufffd\u0708\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "18914567167007359499993594776" + "'", str21, "18914567167007359499993594776");
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        java.lang.String str17 = rSA1.encrypt("524120347");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "560277553357625058315771909329" + "'", str15, "560277553357625058315771909329");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "526906568098570301901811541120" + "'", str17, "526906568098570301901811541120");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("1579535512211996");
        java.lang.String str9 = rSA1.encrypt("\001@");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("630010341");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffdT" + "'", str3, "\001\ufffd\ufffd\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404513723651090547919407931865" + "'", str7, "404513723651090547919407931865");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "343597383680000000" + "'", str9, "343597383680000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd9T\030\ufffdih\017J" + "'", str13, "\003\ufffd9T\030\ufffdih\017J");
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("{");
        java.lang.String str13 = rSA1.decrypt("0");
        java.lang.String str15 = rSA1.decrypt("41");
        java.lang.String str17 = rSA1.encrypt("1900954511");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285" + "'", str11, "285");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "108" + "'", str17, "108");
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("9810541998");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u072b\ufffd\ufffd\u0256\034\003\024");
        java.lang.String str9 = rSA1.decrypt("5229405238");
        java.lang.String str11 = rSA1.encrypt("867707232022423978954101232634");
        java.lang.String str13 = rSA1.decrypt("400186681612588698514703255002");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "237" + "'", str5, "237");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "86" + "'", str7, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "411" + "'", str11, "411");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("\001\u05f8");
        java.lang.String str15 = rSA1.decrypt("412670885907072226160482170559");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002=\033\ufffdC" + "'", str7, "\002=\033\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1699266586090341" + "'", str13, "1699266586090341");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\u0218\ufffd\ufffd\ufffd" + "'", str15, "\001\u0218\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "325" + "'", str13, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "535" + "'", str17, "535");
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "873050396448998221131249532881" + "'", str3, "873050396448998221131249532881");
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("1610322262");
        java.lang.String str13 = rSA1.encrypt("\007\ufffdw\003\ufffd\ufffd\n\ufffd\b\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("122987386542487");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "475250231794956478713785425163" + "'", str11, "475250231794956478713785425163");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "391127600250035079330589623729" + "'", str13, "391127600250035079330589623729");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd&\024\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd&\024\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("5407583147");
        java.lang.String str11 = rSA1.decrypt("337784137");
        java.lang.String str13 = rSA1.encrypt("169761607596613768501581104132");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59" + "'", str9, "59");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "789" + "'", str13, "789");
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("5407583147");
        java.lang.String str11 = rSA1.encrypt("434");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\u028eoV)\003\ufffd\ufffd\ufffd\ufffdM");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"r?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40" + "'", str9, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "502" + "'", str11, "502");
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("18");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6831574336" + "'", str11, "6831574336");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8617431905" + "'", str13, "8617431905");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("868987771488618193611087863649");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("219338071547922340394044615709");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "29200923254830136535497700168" + "'", str5, "29200923254830136535497700168");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\n=\"PiH" + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\n=\"PiH");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "117318626701955727411487916536" + "'", str9, "117318626701955727411487916536");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "279684161593372792261228602824" + "'", str11, "279684161593372792261228602824");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "650959543849314961910493614732" + "'", str15, "650959543849314961910493614732");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str19, "\006\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        java.lang.String str5 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\017\ufffdc\033");
        java.lang.String str9 = rSA1.encrypt("502069562720669011972970389935");
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\u0128\u06d8\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd`Cy");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "694" + "'", str7, "694");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "606" + "'", str9, "606");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "138" + "'", str11, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10" + "'", str13, "10");
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("\005\ufffd\ufffd\u0641\ufffd\037I\\");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "62" + "'", str5, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "391" + "'", str7, "391");
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("485974862797680425669299086221");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "412926472226683539400876318300" + "'", str7, "412926472226683539400876318300");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357638090024297541900364534242" + "'", str9, "357638090024297541900364534242");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        java.lang.String str15 = rSA1.encrypt("166818839354503536721066173577");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd/" + "'", str11, "\000\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "64593953738537622575264506758" + "'", str15, "64593953738537622575264506758");
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\036\ufffd\ufffd\ufffd\ufffd\u05ac\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "18655715051262743453368606594" + "'", str3, "18655715051262743453368606594");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "907235918617751214902143933172" + "'", str5, "907235918617751214902143933172");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "699408322" + "'", str9, "699408322");
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\003\006\ufffd\ufffd\ufffd\ufffd\ufffdP\r\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "323236596324724802399427928" + "'", str7, "323236596324724802399427928");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "282" + "'", str11, "282");
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("1979640026");
        java.lang.String str13 = rSA1.encrypt("\002\031\ufffdlS\r\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2296299593" + "'", str11, "2296299593");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2548884144" + "'", str13, "2548884144");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str13 = rSA1.decrypt("23264544955983291322485115342");
        java.lang.String str15 = rSA1.encrypt("24024972294026087951291000206");
        java.lang.String str17 = rSA1.encrypt("12582352824821637586033699197");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\r\033\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\r\033\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12326111221778841288899899770" + "'", str9, "12326111221778841288899899770");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36833886691261234344555591963" + "'", str11, "36833886691261234344555591963");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\u07f3\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\u07f3\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "26048827712789325436998465052" + "'", str15, "26048827712789325436998465052");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18784921659206965103263694874" + "'", str17, "18784921659206965103263694874");
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("11860916928095778934456708933");
        java.lang.String str15 = rSA1.encrypt("\001v");
        java.lang.String str17 = rSA1.decrypt("82");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002E" + "'", str7, "\002E");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1189031718" + "'", str13, "1189031718");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "945431775" + "'", str15, "945431775");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd" + "'", str17, "\ufffd\ufffd");
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\0020O\030\007");
        java.lang.String str15 = rSA1.encrypt("39821921640796845967029940985");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19130210562877017391166365096" + "'", str13, "19130210562877017391166365096");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12123524093604146410130428244" + "'", str15, "12123524093604146410130428244");
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.encrypt("\002IlrBIC");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd(\026\ufffd\ufffd" + "'", str9, "\006\ufffd(\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "68163991120450066292296130354" + "'", str15, "68163991120450066292296130354");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "39700478163203523488474808604" + "'", str19, "39700478163203523488474808604");
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("644219549490978346761430285079");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "122" + "'", str7, "122");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\021\ufffd>Yd\000\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\021\ufffd>Yd\000\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("523560101545386101969462478793");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2670264702" + "'", str11, "2670264702");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + ">Q\177U" + "'", str13, ">Q\177U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "563060296" + "'", str15, "563060296");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2295717900" + "'", str17, "2295717900");
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("768443727");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "120" + "'", str9, "120");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\016" + "'", str11, "\001\016");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "191" + "'", str13, "191");
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.encrypt("\002\ufffd=\0023\r\ufffda\021");
        java.lang.String str11 = rSA1.decrypt("4701538885");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\004\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Mo??,?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "476" + "'", str5, "476");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "221807546071586677220883890275" + "'", str9, "221807546071586677220883890275");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\u0437\ufffd\ufffd\ufffd" + "'", str11, "\001\u0437\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        java.lang.String str11 = rSA1.encrypt("3133319017839987");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283" + "'", str5, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001N" + "'", str7, "\001N");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\037" + "'", str9, "\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "355" + "'", str11, "355");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.encrypt("453285907300587");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "108" + "'", str7, "108");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "386" + "'", str9, "386");
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\002\ufffd\ufffd\u0138\ufffd\ufffd\ufffdq");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?u?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "571928314996472397390688521953" + "'", str5, "571928314996472397390688521953");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\ufffd\000\ufffd_" + "'", str7, "\005\ufffd\ufffd\ufffd\000\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("650");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "622" + "'", str3, "622");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "K" + "'", str5, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001T" + "'", str7, "\001T");
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("393");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\003\ufffd\ufffd\ufffd&\177\ufffdk" + "'", str13, "\ufffd\003\ufffd\ufffd\ufffd&\177\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "796062136800698" + "'", str17, "796062136800698");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2572167629536751" + "'", str19, "2572167629536751");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("584282792217330789222543235577");
        java.lang.String str15 = rSA1.decrypt("219");
        java.lang.String str17 = rSA1.encrypt("659381568387884");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "438" + "'", str11, "438");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "558" + "'", str13, "558");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001W" + "'", str15, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "524" + "'", str17, "524");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("57871922763596790861247573518");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("29278535641906038529534558959");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "548" + "'", str5, "548");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "105575710655661" + "'", str9, "105575710655661");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "196" + "'", str13, "196");
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        java.lang.String str11 = rSA1.encrypt("\002M");
        java.lang.String str13 = rSA1.decrypt("218675225895926972149739835637");
        java.lang.String str15 = rSA1.encrypt("1005932399");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002." + "'", str3, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "769" + "'", str5, "769");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "765" + "'", str7, "765");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "341" + "'", str11, "341");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "556" + "'", str15, "556");
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.decrypt("1040671174887698");
        java.lang.String str7 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\000\ufffd\022\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\021" + "'", str3, "\021");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001?" + "'", str5, "\001?");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "223" + "'", str7, "223");
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.encrypt("453285907300587");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "209" + "'", str3, "209");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51" + "'", str7, "51");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "310" + "'", str9, "310");
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\u033e");
        java.lang.String str15 = rSA1.decrypt("501619215992877544684325066512");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\017\t" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\u01bd\ufffd\017\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "144762426136206881400148655049" + "'", str11, "144762426136206881400148655049");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "357572122659862737748561752610" + "'", str13, "357572122659862737748561752610");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\020T.v\025\ufffd\ufffd2" + "'", str15, "\001\ufffd\020T.v\025\ufffd\ufffd2");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("4270488148458321450044560294");
        java.lang.String str13 = rSA1.decrypt("571390457067467472516619723373");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "440" + "'", str7, "440");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50" + "'", str9, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd|\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("1184438612620945");
        java.lang.String str13 = rSA1.encrypt("37778891330575010888");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M" + "'", str3, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003$" + "'", str7, "\003$");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "502" + "'", str9, "502");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0023" + "'", str11, "\0023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "685" + "'", str13, "685");
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
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
        java.lang.String str23 = rSA1.encrypt("\f\ufffd\ufffd\ufffd");
        java.lang.String str25 = rSA1.encrypt("\002\027\ufffd\ufffde");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\177" + "'", str3, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ue\0357" + "'", str7, "ue\0357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2522840680" + "'", str11, "2522840680");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10506495201" + "'", str13, "10506495201");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4551977412" + "'", str15, "4551977412");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "99" + "'", str19, "99");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "424" + "'", str23, "424");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "81" + "'", str25, "81");
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("423298601721002386028737058800");
        java.lang.String str9 = rSA1.decrypt("8399918138");
        java.lang.String str11 = rSA1.decrypt("1102137549");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "'" + "'", str5, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "95" + "'", str7, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "." + "'", str9, ".");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2" + "'", str11, "2");
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("26473901013199856375128902653");
        java.lang.String str15 = rSA1.decrypt("351911857970627497367275765431");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
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
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.encrypt("304");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("265");
        java.lang.String str13 = rSA1.encrypt("\b\177\ufffd\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1481107574" + "'", str5, "1481107574");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "338314458" + "'", str7, "338314458");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001L" + "'", str11, "\001L");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "719" + "'", str13, "719");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("6241420964");
        java.lang.String str15 = rSA1.decrypt("132382889831422523496195035353");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1715994339215086" + "'", str7, "1715994339215086");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "676565095072807" + "'", str9, "676565095072807");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd%yv\002\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd%yv\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\u0250\ufffd\032\ufffd%" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd\u0250\ufffd\032\ufffd%");
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("868987771488618193611087863649");
        java.lang.String str17 = rSA1.encrypt("16");
        rSA1.generateKeys(10);
        java.lang.String str21 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\034\"\ufffd\"");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "544002513775797246649708866126" + "'", str5, "544002513775797246649708866126");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr" + "'", str7, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "71211983113446654511103628041" + "'", str9, "71211983113446654511103628041");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "182677514388219648672776042576" + "'", str11, "182677514388219648672776042576");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "532398677629051362945512956892" + "'", str15, "532398677629051362945512956892");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1999423591192" + "'", str17, "1999423591192");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "102" + "'", str21, "102");
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("410411422422033928813383347735");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("118771663151788095008417464237");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002M" + "'", str3, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "356" + "'", str7, "356");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "109" + "'", str11, "109");
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("399507447654974285643717125254");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\u019f\ufffd\u4699b\223G" + "'", str7, "\u019f\ufffd\u4699b\223G");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28710679871494948297036317341" + "'", str9, "28710679871494948297036317341");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14168534837275560532001268673" + "'", str11, "14168534837275560532001268673");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "24781778760833244366462306793" + "'", str13, "24781778760833244366462306793");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "689560470552874014198852091473" + "'", str5, "689560470552874014198852091473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffds\026 " + "'", str7, "\007\ufffd\ufffd\ufffd\ufffds\026 ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "425927596977747" + "'", str9, "425927596977747");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "285" + "'", str15, "285");
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        java.lang.String str11 = rSA1.decrypt("547");
        java.lang.String str13 = rSA1.decrypt("823310087623551739880345477173");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "201" + "'", str9, "201");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\033" + "'", str11, "\033");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\016" + "'", str13, "\016");
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("{");
        java.lang.String str13 = rSA1.decrypt("0");
        java.lang.String str15 = rSA1.decrypt("41");
        java.lang.String str17 = rSA1.encrypt("1900954511");
        java.lang.String str19 = rSA1.encrypt("623396988363473363163248982556");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "98" + "'", str11, "98");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000" + "'", str13, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001/" + "'", str15, "\001/");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "91" + "'", str17, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "14" + "'", str19, "14");
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
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
        rSA1.generateKeys((int) '4');
        java.lang.String str23 = rSA1.encrypt("\ufffd\u0124\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\n\ufffd\030[" + "'", str7, "\004\ufffd\ufffd\ufffd\n\ufffd\030[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\u03f5+\031\ufffd\ufffd\ufffd\ufffdX" + "'", str9, "\ufffd\u03f5+\031\ufffd\ufffd\ufffd\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "21231210367574572294476368559" + "'", str11, "21231210367574572294476368559");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd7j\023\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd7j\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "188474235992973504672551481628" + "'", str17, "188474235992973504672551481628");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "121653679879806937866332111302" + "'", str19, "121653679879806937866332111302");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1882148024138883" + "'", str23, "1882148024138883");
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("1824531455");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\f\177v\\\ufffd\ufffd\ufffd" + "'", str7, "\005\f\177v\\\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "92187310580205170926232365968" + "'", str9, "92187310580205170926232365968");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "122875874108413678989866058605" + "'", str11, "122875874108413678989866058605");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5641372768" + "'", str17, "5641372768");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2155055185841074");
        java.lang.String str13 = rSA1.decrypt("646");
        java.lang.String str15 = rSA1.decrypt("195");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10759458697" + "'", str11, "10759458697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\023\ufffd" + "'", str13, "\000\ufffd\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd");
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        java.lang.String str15 = rSA1.encrypt("509752326");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "237877265180387223412815339406" + "'", str5, "237877265180387223412815339406");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46942231700652536303724576253" + "'", str13, "46942231700652536303724576253");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52820633133301400460465823848" + "'", str15, "52820633133301400460465823848");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("nq\003\ufffd");
        java.lang.String str9 = rSA1.decrypt("1210101131");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "628951418636120263113146852089" + "'", str5, "628951418636120263113146852089");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "470659694564531490169005439291" + "'", str7, "470659694564531490169005439291");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd{\177\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd{\177\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "401413867615190148741991865227" + "'", str5, "401413867615190148741991865227");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26012764767708918581052067967" + "'", str7, "26012764767708918581052067967");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23370439550416113339105706210" + "'", str13, "23370439550416113339105706210");
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        java.lang.String str11 = rSA1.encrypt("245");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("503320528894841210883234548866");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("902169627");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12781402767498014035285168894" + "'", str3, "12781402767498014035285168894");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19805934388624286134340734459" + "'", str5, "19805934388624286134340734459");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\u01eb\ufffdo\f\ufffd\r\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\u01eb\ufffdo\f\ufffd\r\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8418093134296586006473315286" + "'", str11, "8418093134296586006473315286");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\u03ee\ufffd\006\ufffd\ufffds]" + "'", str15, "\ufffd\u03ee\ufffd\006\ufffd\ufffds]");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "487" + "'", str19, "487");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("17399606650451632470785729796");
        java.lang.String str13 = rSA1.decrypt("3713733729885467373772629871");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283" + "'", str5, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\030" + "'", str11, "\030");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001j" + "'", str13, "\001j");
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("22467508193485927834689541506");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\035\ufffd'x\b\ufffd\ufffd\ufffd\ufffd\ufffd-" + "'", str9, "\t\035\ufffd'x\b\ufffd\ufffd\ufffd\ufffd\ufffd-");
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\036" + "'", str7, "\001\036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "308811900151522756322432784542" + "'", str11, "308811900151522756322432784542");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\n=\"PiH");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "204" + "'", str5, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "448" + "'", str7, "448");
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("1572583165");
        java.lang.String str17 = rSA1.decrypt("13434800983655447167584826901");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "186" + "'", str9, "186");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "773" + "'", str15, "773");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000" + "'", str17, "\000");
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\f\ufffdx");
        java.lang.String str11 = rSA1.encrypt("3984502495");
        java.lang.String str13 = rSA1.encrypt("\u01ce");
        java.lang.String str15 = rSA1.decrypt("22893996638579745387307395685");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "126663585090766103547854332626" + "'", str5, "126663585090766103547854332626");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\022\ufffdG4<" + "'", str7, "\005\ufffd\ufffd\ufffd\ufffd\022\ufffdG4<");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "440099635461788314382659015675" + "'", str9, "440099635461788314382659015675");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "124715953517814430697982939072" + "'", str11, "124715953517814430697982939072");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "427277125856323518659016213365" + "'", str13, "427277125856323518659016213365");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\\\ufffd\023\037\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\\\ufffd\023\037\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("232");
        java.lang.String str13 = rSA1.encrypt("\031");
        java.lang.String str15 = rSA1.decrypt("1217398435");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd~" + "'", str7, "\001\ufffd\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2897543964" + "'", str9, "2897543964");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5820248111" + "'", str11, "5820248111");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "15625" + "'", str13, "15625");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\035\ufffd" + "'", str15, "\001\ufffd\035\ufffd");
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.decrypt("715053248569397442655422819632");
        java.lang.String str17 = rSA1.encrypt("2112426122528962");
        java.lang.String str19 = rSA1.encrypt("\ufffd|\016\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RZ\017\ufffd" + "'", str9, "RZ\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "218866200" + "'", str11, "218866200");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O" + "'", str13, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1331744109" + "'", str17, "1331744109");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1106765501" + "'", str19, "1106765501");
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\f\r\ufffd\021x");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\u031a\ufffd:\b\ufffd\034\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "146" + "'", str5, "146");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19509248471334535808748103132" + "'", str9, "19509248471334535808748103132");
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("2063650974266313");
        java.lang.String str5 = rSA1.decrypt("275");
        java.lang.String str7 = rSA1.decrypt("751");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "455423107094250967975788812648" + "'", str3, "455423107094250967975788812648");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd[\035\ufffd\ufffd\ufffd\ufffd\ufffdR" + "'", str5, "\002\ufffd[\035\ufffd\ufffd\ufffd\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\177\ufffd\u0203\ufffd\ufffd\f\ufffd" + "'", str7, "\001\177\ufffd\u0203\ufffd\ufffd\f\ufffd");
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.encrypt("754114764299777929981850028976");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "195" + "'", str7, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\037" + "'", str9, "\001\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("501619215992877544684325066512");
        rSA1.generateKeys(10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "163" + "'", str9, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "83" + "'", str11, "83");
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("\001\ufffd_\n\027\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "626317569" + "'", str5, "626317569");
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\fq\"\u055a\031\027\ufffd~" + "'", str13, "\ufffd\ufffd\fq\"\u055a\031\027\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1154832255147806" + "'", str17, "1154832255147806");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\005\ufffd%F" + "'", str21, "\001\005\ufffd%F");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1035813217" + "'", str23, "1035813217");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\u01afI\b" + "'", str25, "\001\u01afI\b");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1949472910" + "'", str27, "1949472910");
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("531");
        java.lang.String str11 = rSA1.decrypt("51753720001912228847635533267");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0016" + "'", str7, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("5407583147");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "349" + "'", str9, "349");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\031\ufffd{M\004\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\031\ufffd{M\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1711760635108162" + "'", str17, "1711760635108162");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "560768012096920" + "'", str19, "560768012096920");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2367541190803541" + "'", str21, "2367541190803541");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t\ufffd\ufffd\006E" + "'", str23, "\t\ufffd\ufffd\006E");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.decrypt("108");
        java.lang.String str11 = rSA1.encrypt("\004\r\ufffd\ufffdLb\025\ufffd\ufffd\f\ufffd");
        java.lang.String str13 = rSA1.decrypt("6494239579");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ">" + "'", str7, ">");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16" + "'", str11, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("35583402576551630221");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "250728931" + "'", str11, "250728931");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O" + "'", str13, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "N" + "'", str17, "N");
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("465270144019721");
        java.lang.String str15 = rSA1.decrypt("152900825838224951269381371407");
        java.lang.String str17 = rSA1.decrypt("17744561918194567077703409997");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\024" + "'", str3, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\f\036\ufffd\ufffd\ufffd" + "'", str13, "\t\ufffd\ufffd\f\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd'" + "'", str15, "\t\ufffd\ufffd\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ucd31\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\ucd31\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.decrypt("273538835379743155872028642663");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\"" + "'", str11, "\ufffd\ufffd\"");
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "201" + "'", str11, "201");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\000\u02bf\ufffd\t\021\ufffd#\b\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??V\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001." + "'", str7, "\001.");
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("20914855833503360039624631433");
        java.lang.String str9 = rSA1.encrypt("16156209496766550638227152486");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\025\ufffd\u0247");
        java.lang.String str13 = rSA1.encrypt("785539727012536");
        java.lang.String str15 = rSA1.encrypt("26473901013199856375128902653");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002'" + "'", str3, "\002'");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "368" + "'", str9, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "384" + "'", str11, "384");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "324" + "'", str13, "324");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "598" + "'", str15, "598");
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7415131725045112911094158984" + "'", str7, "7415131725045112911094158984");
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
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
        java.lang.String str27 = rSA1.encrypt("\ufffd\ufffd\ufffd\022\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "391830757006916737987057478617" + "'", str5, "391830757006916737987057478617");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "183796169494458149934334063662" + "'", str7, "183796169494458149934334063662");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\034\ufffd(" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\034\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd6\020e\r\003\u051d\ufffd\ufffd\ufffd" + "'", str11, "\007\ufffd6\020e\r\003\u051d\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4" + "'", str19, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "91" + "'", str21, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001t" + "'", str23, "\001t");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1789125740" + "'", str27, "1789125740");
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("2783614369450889");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\023" + "'", str5, "\001\023");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "327" + "'", str7, "327");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001f" + "'", str9, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\025" + "'", str13, "\001\025");
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002" + "'", str9, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "24950061057615173932904071962" + "'", str13, "24950061057615173932904071962");
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("126");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("\001\026");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\020\u018a\ufffd\017\ufffdQ\033\007}" + "'", str7, "\020\u018a\ufffd\017\ufffdQ\033\007}");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\\\ufffd\ufffd?h\037" + "'", str9, "\ufffd\ufffd\ufffd\\\ufffd\ufffd?h\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40081182550045535744" + "'", str11, "40081182550045535744");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\023\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\023\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "21484952" + "'", str17, "21484952");
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.encrypt("~");
        java.lang.String str15 = rSA1.encrypt("4\020\ufffd1");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd?Gwlso042" + "'", str11, "\003\ufffd\ufffd?Gwlso042");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31757969376" + "'", str13, "31757969376");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2967295446266546430708528201" + "'", str15, "2967295446266546430708528201");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        java.lang.String str11 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str13 = rSA1.encrypt("166869500146933535004111431966");
        java.lang.String str15 = rSA1.decrypt("375");
        java.lang.String str17 = rSA1.decrypt("2315739982");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd-\004\ufffd\ufffd\ufffdiH" + "'", str9, "\006\ufffd-\004\ufffd\ufffd\ufffdiH");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "229701085166569230119874748529" + "'", str11, "229701085166569230119874748529");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "115704752103723701474360156878" + "'", str13, "115704752103723701474360156878");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\004\ufffd\ufffd\ufffd\ufffdU\000\ufffd" + "'", str15, "\b\004\ufffd\ufffd\ufffd\ufffdU\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\017\ufffd\ufffd\020\035\ufffd\ufffd\u0154" + "'", str17, "\007\ufffd\017\ufffd\ufffd\020\035\ufffd\ufffd\u0154");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "671765681208634287774797088117" + "'", str19, "671765681208634287774797088117");
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1564592155" + "'", str3, "1564592155");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("292429178019428864799183198942");
        java.lang.String str17 = rSA1.decrypt("970687815872098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\177\ufffdI$p\017\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\177\ufffdI$p\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\023\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd\023\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\030\ufffd3" + "'", str17, "\001\ufffd\030\ufffd3");
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.encrypt("326");
        java.lang.String str11 = rSA1.encrypt("693163497185261709622839235979");
        java.lang.String str13 = rSA1.encrypt("193186633393731903120836319657");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "582" + "'", str5, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "419" + "'", str9, "419");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "596" + "'", str11, "596");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "258" + "'", str13, "258");
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("208193977755069288740804886340");
        java.lang.String str13 = rSA1.decrypt("2877147294");
        java.lang.String str15 = rSA1.decrypt("556176107112066662549548393072");
        java.lang.String str17 = rSA1.encrypt("15028238390418345727767527777");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "664304258596640392039030237473" + "'", str11, "664304258596640392039030237473");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007e\027\ufffd\ufffd\ufffd*\024\ufffd" + "'", str15, "\007e\027\ufffd\ufffd\ufffd*\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "295017219678035892401508031521" + "'", str17, "295017219678035892401508031521");
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("2977826838347180772119751944");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\032\031\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?O?a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\023\003\ufffd\ufffd&\024" + "'", str7, "\001\ufffd\ufffd\ufffd\023\003\ufffd\ufffd&\024");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "636829341678038156411934409601" + "'", str11, "636829341678038156411934409601");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\u058c\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\003\u058c\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "569643102100370525757682807781" + "'", str15, "569643102100370525757682807781");
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        java.lang.String str9 = rSA1.decrypt("6523362118");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "168" + "'", str7, "168");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001I" + "'", str9, "\001I");
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("2300259466937311211200536600");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\007");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\036\ufffd\ufffd\ue197\ufffd\ufffd?\004" + "'", str9, "\036\ufffd\ufffd\ue197\ufffd\ufffd?\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "f" + "'", str13, "f");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "182" + "'", str15, "182");
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("9166202918806161334403193735");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317" + "'", str7, "317");
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("1643625409");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1548322202" + "'", str9, "1548322202");
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("286281611158858110965771107047");
        java.lang.String str19 = rSA1.encrypt("\002\013\ufffdv\031\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("\002\ufffd\036\031\006\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "720671264036647782499912111837" + "'", str11, "720671264036647782499912111837");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31255875" + "'", str13, "31255875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "41691343010038435867058370958" + "'", str17, "41691343010038435867058370958");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "30526647024830457750674086657" + "'", str19, "30526647024830457750674086657");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "28082703695544345968476369503" + "'", str21, "28082703695544345968476369503");
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("1688357233497343");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\036" + "'", str7, "\001\036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "274824393038132000261314560698" + "'", str11, "274824393038132000261314560698");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "307732862434921875" + "'", str13, "307732862434921875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9609209192" + "'", str17, "9609209192");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8360894484" + "'", str19, "8360894484");
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
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
        java.lang.String str25 = rSA1.encrypt("321521331256063736403780061512");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "406" + "'", str15, "406");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "68" + "'", str19, "68");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\025" + "'", str21, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "121" + "'", str25, "121");
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        java.lang.String str15 = rSA1.encrypt("\004\u05b9\ufffd\001Yt\035\ufffd\u04968");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("\000\u05cf\ufffd<");
        java.lang.String str21 = rSA1.decrypt("1617874323937581");
        java.lang.String str23 = rSA1.encrypt("\016\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd\030f");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "194442851042175231418895448519" + "'", str11, "194442851042175231418895448519");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\032\ufffd\ufffd\u02e5\u0374\b\020Z8" + "'", str13, "\002\032\ufffd\ufffd\u02e5\u0374\b\020Z8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "131090025315872653050248213695" + "'", str15, "131090025315872653050248213695");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1460695723107370" + "'", str19, "1460695723107370");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd0" + "'", str21, "\004\ufffd\ufffd\ufffd\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "354078587153331" + "'", str23, "354078587153331");
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\u0528\ufffd\ufffd\005\ufffdQ;");
        java.lang.String str13 = rSA1.encrypt("\001l\000\ufffd)\005i\017\ufffd<");
        java.lang.String str15 = rSA1.encrypt("355789566");
        java.lang.String str17 = rSA1.encrypt("252136932413870403963239357132");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "595" + "'", str11, "595");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "364" + "'", str13, "364");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "554" + "'", str15, "554");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "217" + "'", str17, "217");
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd[3Z\000\u05ed");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\275\ufffd\ufffd\ufffd\006." + "'", str7, "\ufffd\ufffd\275\ufffd\ufffd\ufffd\006.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "674589993819081348249" + "'", str11, "674589993819081348249");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "316030176429144793773861370073" + "'", str13, "316030176429144793773861370073");
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("465270144019721");
        java.lang.String str15 = rSA1.decrypt("152900825838224951269381371407");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\024" + "'", str3, "\024");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342" + "'", str7, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\005\ufffd\ufffdWjK\036\ufffd;\036" + "'", str13, "\001\005\ufffd\ufffdWjK\036\ufffd;\036");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\020\n\234\u02c9\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\020\n\234\u02c9\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("72");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("6027768308437645793663749491");
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\u5ae6\037\ufffd\024\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "403" + "'", str7, "403");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "38410383111676910233924436934" + "'", str15, "38410383111676910233924436934");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6023168904652779887755279866" + "'", str17, "6023168904652779887755279866");
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("N");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("1672287935580631");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "518833522953440574292143213167" + "'", str5, "518833522953440574292143213167");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "474552" + "'", str7, "474552");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\016" + "'", str11, "\002\016");
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("818023820300058026071813055769");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1493573715340736" + "'", str7, "1493573715340736");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1490127194" + "'", str11, "1490127194");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("180");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd" + "'", str3, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "499515345" + "'", str5, "499515345");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "=\003\ufffd~" + "'", str7, "=\003\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "469402951" + "'", str9, "469402951");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("616");
        java.lang.String str13 = rSA1.encrypt("\001)");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd" + "'", str7, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "28693914268735867295918587423" + "'", str11, "28693914268735867295918587423");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2310905821257" + "'", str13, "2310905821257");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30288317700880201798701988396" + "'", str15, "30288317700880201798701988396");
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("141224142623299318932334460073");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd5\"\ufffd\u0556\u01a7\ufffdz" + "'", str7, "\007\ufffd5\"\ufffd\u0556\u01a7\ufffdz");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "'\033\ufffd\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd\\" + "'", str11, "'\033\ufffd\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd\\");
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("521");
        java.lang.String str11 = rSA1.decrypt("412855490441922175904469813661");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\037,L" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\037,L");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\016\ufffd\ufffd\ud932\udd59\ufffd\r" + "'", str11, "\016\ufffd\ufffd\ud932\udd59\ufffd\r");
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
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
        java.lang.String str21 = rSA1.encrypt("912826846186196");
        java.lang.String str23 = rSA1.encrypt("451");
        java.lang.String str25 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "157" + "'", str9, "157");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001y" + "'", str11, "\001y");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "358" + "'", str13, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "425" + "'", str15, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "560" + "'", str17, "560");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "344" + "'", str19, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "210" + "'", str21, "210");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7" + "'", str23, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "300" + "'", str25, "300");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("241");
        java.lang.String str13 = rSA1.decrypt("64");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\016@j," + "'", str7, "\001\016@j,");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1858989207708423" + "'", str11, "1858989207708423");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\\\020\ufffd\ufffdt" + "'", str13, "\005\\\020\ufffd\ufffdt");
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001I" + "'", str7, "\001I");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "~" + "'", str9, "~");
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
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
        java.lang.String str21 = rSA1.decrypt("410618194397438268367973548817");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "236" + "'", str9, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "113" + "'", str11, "113");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "196" + "'", str13, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "359" + "'", str15, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "?" + "'", str17, "?");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u2804t\021\013");
        java.lang.String str15 = rSA1.encrypt("703");
        java.lang.String str17 = rSA1.decrypt("272969633120771513421161122948");
        java.lang.String str19 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\005\002\ufffd\ufffdid");
        java.lang.String str21 = rSA1.decrypt("41836450938620397983215071936");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "490" + "'", str3, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "220" + "'", str11, "220");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "364" + "'", str13, "364");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "598" + "'", str15, "598");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd" + "'", str17, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "317" + "'", str19, "317");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "w" + "'", str21, "w");
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("412855490441922175904469813661");
        java.lang.String str15 = rSA1.encrypt("431831202918548381948627330408");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u0381" + "'", str7, "\ufffd\u0381");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "196122941" + "'", str11, "196122941");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2459195794758218" + "'", str13, "2459195794758218");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1140804503668646" + "'", str15, "1140804503668646");
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\ufffdR*\035(`e");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "141" + "'", str9, "141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "217" + "'", str11, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16" + "'", str13, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "410" + "'", str15, "410");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "53" + "'", str17, "53");
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.encrypt("151576759553152219386286841859");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15376701500012903294203071948" + "'", str3, "15376701500012903294203071948");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5992399948857086003383591451" + "'", str5, "5992399948857086003383591451");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "23198111716048860543426953352" + "'", str9, "23198111716048860543426953352");
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("3252276922");
        java.lang.String str19 = rSA1.encrypt("2977826838347180772119751944");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36674170719792937154349679493" + "'", str7, "36674170719792937154349679493");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24820392930130422316970079539" + "'", str9, "24820392930130422316970079539");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\023\ufffd&\030\ufffd\ufffd\177+C" + "'", str11, "\ufffd\023\ufffd&\030\ufffd\ufffd\177+C");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "321" + "'", str17, "321");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "45" + "'", str19, "45");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("352232997633148504781500198579");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1400269295449781" + "'", str7, "1400269295449781");
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("|JH%w\016\t\ufffd\ufffd\001\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("48159020044353377656022340487");
        java.lang.String str13 = rSA1.encrypt("586656078404500661980529726446");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1845653826" + "'", str9, "1845653826");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4373634879" + "'", str13, "4373634879");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8873570817089389027823861542" + "'", str7, "8873570817089389027823861542");
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
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
        java.lang.String str31 = rSA1.decrypt("2380937213");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdk" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "604472614473408" + "'", str17, "604472614473408");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffd:" + "'", str21, "\000\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7269126799" + "'", str23, "7269126799");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str25, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "494277179" + "'", str27, "494277179");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "8725160283" + "'", str29, "8725160283");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\002\001A\b\035" + "'", str31, "\002\001A\b\035");
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("587");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3!L~\021\ufffdcy\025" + "'", str9, "3!L~\021\ufffdcy\025");
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
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
        java.lang.String str21 = rSA1.encrypt("23509955487960715140744001668");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\016\037\ufffd\ufffd\ufffd\ufffd\007\ufffd@K$" + "'", str9, "\003\016\037\ufffd\ufffd\ufffd\ufffd\007\ufffd@K$");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "209584584" + "'", str15, "209584584");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "830115237708763" + "'", str21, "830115237708763");
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
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
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "467894157" + "'", str9, "467894157");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8\n\ufffd\ufffd" + "'", str11, "8\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\031-W\n" + "'", str13, "\031-W\n");
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\025\ufffdD" + "'", str3, "\025\ufffdD");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "978527077" + "'", str5, "978527077");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd" + "'", str7, "\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("3995249758");
        java.lang.String str17 = rSA1.encrypt("281");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "92" + "'", str7, "92");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "587" + "'", str9, "587");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "m" + "'", str11, "m");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "641" + "'", str13, "641");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "789" + "'", str17, "789");
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("20914855833503360039624631433");
        java.lang.String str9 = rSA1.encrypt("586376253");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "427" + "'", str5, "427");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "74" + "'", str7, "74");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("127038516285899548678629729898");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("25490140207333398829927291174");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003|" + "'", str3, "\003|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "689" + "'", str5, "689");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "384" + "'", str7, "384");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "533" + "'", str13, "533");
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2300360180572152323627409615" + "'", str7, "2300360180572152323627409615");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39387803656196501766187466923" + "'", str9, "39387803656196501766187466923");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\001\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\ufffd\032\ufffd\ufffd\u01e4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"%\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "346" + "'", str3, "346");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "351" + "'", str5, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("317201802686979902757");
        java.lang.String str13 = rSA1.encrypt("6901296438808693457125536937");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "193" + "'", str9, "193");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "268" + "'", str13, "268");
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        java.lang.String str11 = rSA1.decrypt("40059718235344279847714872762");
        java.lang.String str13 = rSA1.decrypt("614");
        java.lang.String str15 = rSA1.encrypt("381018392633645705650223906599");
        java.lang.String str17 = rSA1.decrypt("348249611912110734910386805023");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "67" + "'", str5, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55" + "'", str7, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001n" + "'", str13, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "99" + "'", str15, "99");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "a" + "'", str17, "a");
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("3541590856");
        rSA1.generateKeys(10);
        java.lang.String str9 = rSA1.encrypt("511433997501547127895019390426");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY" + "'", str3, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffd\u01e9\ufffd}E" + "'", str5, "\002\ufffd\ufffd\u01e9\ufffd}E");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "114" + "'", str9, "114");
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\002\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Y?N?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\033\ufffd\ufffd\030\n\ufffd\ufffdGe\f\ufffd" + "'", str13, "\033\ufffd\ufffd\030\n\ufffd\ufffdGe\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2789666082965314" + "'", str17, "2789666082965314");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1900961644" + "'", str21, "1900961644");
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.decrypt("1");
        java.lang.String str9 = rSA1.encrypt("\b\ufffd\ufffd\035\ufffd\ufffd\ufffd,");
        java.lang.String str11 = rSA1.decrypt("6924099056");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffdE\034\ufffd(X");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001" + "'", str7, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "650" + "'", str9, "650");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "F" + "'", str11, "F");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "684" + "'", str13, "684");
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
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
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "112" + "'", str7, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\r" + "'", str11, "\001\r");
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("188");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdg\002\ufffd\ufffd\ufffdRmAd" + "'", str7, "\ufffdg\002\ufffd\ufffd\ufffdRmAd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "287238601402378809410585912221" + "'", str11, "287238601402378809410585912221");
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("1322348827");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12149627928299145726488297021" + "'", str3, "12149627928299145726488297021");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21845475049085790879301558885" + "'", str5, "21845475049085790879301558885");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\017\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "57" + "'", str13, "57");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\033/7ZX");
        java.lang.String str17 = rSA1.encrypt("\034\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "499501995507444742440115112162" + "'", str5, "499501995507444742440115112162");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "623199044481387863318633521300" + "'", str7, "623199044481387863318633521300");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\031\ufffd\001\ufffd\007\030\ufffd\ufffdJ" + "'", str9, "\031\ufffd\001\ufffd\007\030\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "285670216301264665224984974657" + "'", str15, "285670216301264665224984974657");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "99212900391457625015214446219" + "'", str17, "99212900391457625015214446219");
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\u61f9\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?6\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "62" + "'", str7, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "242" + "'", str9, "242");
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("6241420964");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "107" + "'", str7, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "105" + "'", str9, "105");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\" + "'", str11, "\\");
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
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
        java.math.BigInteger bigInteger32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger33 = rSA1.decrypt(bigInteger32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\002\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "934597467659607" + "'", str17, "934597467659607");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd\ufffd\000" + "'", str21, "\001\ufffd\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7263975680" + "'", str23, "7263975680");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\ufffdB" + "'", str25, "\000\ufffd\ufffdB");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "5010258177" + "'", str27, "5010258177");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "3811338283" + "'", str29, "3811338283");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\027\ufffd!" + "'", str31, "\027\ufffd!");
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "425" + "'", str11, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "249" + "'", str13, "249");
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5" + "'", str7, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(" + "'", str9, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "J" + "'", str11, "J");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "160" + "'", str13, "160");
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.encrypt("862118454");
        java.lang.String str11 = rSA1.decrypt("2075246788185557");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "180" + "'", str9, "180");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd" + "'", str11, "\002\ufffd");
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\025");
        java.lang.String str21 = rSA1.decrypt("430");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1452683840163422061275191684" + "'", str15, "1452683840163422061275191684");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "9767497876202453346455764263" + "'", str17, "9767497876202453346455764263");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "535865628847726325473255989" + "'", str19, "535865628847726325473255989");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\033\u0603\ufffd\000\r\ufffd\ufffd\ufffd[r`" + "'", str21, "\033\u0603\ufffd\000\r\ufffd\ufffd\ufffd[r`");
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "204" + "'", str7, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "94" + "'", str9, "94");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "583" + "'", str13, "583");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\ufffdV");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\026n\f-\004E\003");
        java.lang.String str15 = rSA1.decrypt("111689798687628537347293047723");
        java.lang.String str17 = rSA1.decrypt("10533540197701377965021536254");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "119820599168329525434531342676" + "'", str5, "119820599168329525434531342676");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58631599193929315389383143551" + "'", str7, "58631599193929315389383143551");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\036\ufffd!\036\004\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\005\ufffd\036\ufffd!\036\004\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "142336288984628932413688095842" + "'", str11, "142336288984628932413688095842");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "85535686327633978308027390824" + "'", str13, "85535686327633978308027390824");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\u0241\ufffd\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd\u0241\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffdW=\fBA.\025\006" + "'", str17, "\001\ufffd\ufffd\ufffdW=\fBA.\025\006");
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        java.lang.String str11 = rSA1.decrypt("547");
        java.lang.String str13 = rSA1.encrypt("\013\ufffd\031\ufffd\u0147\ufffd\u0117)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "241" + "'", str9, "241");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0028" + "'", str11, "\0028");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "230" + "'", str13, "230");
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        java.lang.String str11 = rSA1.encrypt("30962286017337529394493920187");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "554830273050869043630478436277" + "'", str5, "554830273050869043630478436277");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "565884328063002374701339587373" + "'", str9, "565884328063002374701339587373");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "190146774110847652113330878612" + "'", str11, "190146774110847652113330878612");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "511930212511255703448596151248" + "'", str13, "511930212511255703448596151248");
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffd\b");
        rSA1.generateKeys(100);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\005\ufffd\ufffd\f\ufffd\ufffd\035" + "'", str7, "\ufffd\ufffd\005\ufffd\ufffd\f\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "64527210609537255467908729064" + "'", str9, "64527210609537255467908729064");
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("\005\ufffd\ufffd\u0641\ufffd\037I\\");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "309" + "'", str5, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "220" + "'", str7, "220");
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("4480877383687016191663601857");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\031\ufffd\ufffd=" + "'", str7, "\ufffd\ufffd\031\ufffd\ufffd=");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\013\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "126" + "'", str13, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "417322268207874811841271749236" + "'", str17, "417322268207874811841271749236");
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("189189237");
        java.lang.String str13 = rSA1.encrypt("%\025\ufffd");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "291553722528374643007070468939" + "'", str5, "291553722528374643007070468939");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "705058733096965312362771311108" + "'", str7, "705058733096965312362771311108");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\u0151\ufffdC" + "'", str9, "\n\ufffd\ufffd\ufffd\ufffd\u0151\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1114785694893504310871438748864" + "'", str11, "1114785694893504310871438748864");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1072851096501560006640595328937" + "'", str13, "1072851096501560006640595328937");
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("7591156848866311702672535389");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("\021\005\u04d9\u01f0\u0259;");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "29951642291709308775154723882" + "'", str7, "29951642291709308775154723882");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "43338859895791011825474536787" + "'", str9, "43338859895791011825474536787");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\020\ufffd\ufffd\ufffd\ufffdx" + "'", str11, "\ufffd\ufffd\ufffd\020\ufffd\ufffd\ufffd\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "257218022391240931618163182765" + "'", str17, "257218022391240931618163182765");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\016\ufffd\ud7b7Z\013\b\002\ufffd" + "'", str17, "\002\016\ufffd\ud7b7Z\013\b\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "563670386434044322267635107556" + "'", str19, "563670386434044322267635107556");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "777255748079042341926097726972" + "'", str21, "777255748079042341926097726972");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("317201802686979902757");
        java.lang.String str13 = rSA1.decrypt("7571988491");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "307" + "'", str9, "307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001i" + "'", str11, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001j" + "'", str13, "\001j");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\u022cW/0\032\ufffd" + "'", str9, "\004\ufffd\u022cW/0\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "120239837533203817315977011847" + "'", str15, "120239837533203817315977011847");
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("392170649013389");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"i.??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\022\033\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\022\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6567096830063558917563613215" + "'", str15, "6567096830063558917563613215");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\r\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\r\ufffd");
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.String str9 = rSA1.encrypt("\001r\031\ufffd\ufffd");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "346" + "'", str3, "346");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "181" + "'", str5, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "409" + "'", str9, "409");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("17399606650451632470785729796");
        java.lang.String str13 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "283" + "'", str5, "283");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\n" + "'", str11, "\002\n");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "513" + "'", str13, "513");
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\bj9\001");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("370");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "186" + "'", str9, "186");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "530" + "'", str13, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "63" + "'", str17, "63");
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
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
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1525415830" + "'", str11, "1525415830");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\007\ufffd\ufffd" + "'", str13, "\013\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9331680" + "'", str15, "9331680");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1065267953" + "'", str17, "1065267953");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1021000552" + "'", str19, "1021000552");
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd");
        java.lang.String str15 = rSA1.decrypt("666669488190815");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "465" + "'", str9, "465");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\003" + "'", str11, "\002\003");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "149" + "'", str13, "149");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd" + "'", str15, "\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("376230106637114381994083478121");
        java.lang.String str15 = rSA1.encrypt("3066983185");
        java.lang.String str17 = rSA1.encrypt("19119955408662529345651987019");
        java.lang.String str19 = rSA1.decrypt("24440932696610818244056805529");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffdq\022\ufffd\ufffd\ufffdXF" + "'", str9, "\006\ufffd\ufffd\ufffdq\022\ufffd\ufffd\ufffdXF");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\037\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1101678046330366" + "'", str15, "1101678046330366");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1338962661226570" + "'", str17, "1338962661226570");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd{\023u" + "'", str19, "\001\ufffd{\023u");
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.encrypt("\ufffd\u011d\ufffd\ufffd\ufffd`\002S+f");
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("58468531515623494501554799972");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1511926407" + "'", str13, "1511926407");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("68");
        java.lang.String str13 = rSA1.encrypt("402271083010688");
        java.lang.String str15 = rSA1.decrypt("28282565275297032528883088356");
        java.lang.String str17 = rSA1.encrypt("1129414480");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "706" + "'", str7, "706");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "301" + "'", str9, "301");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "328" + "'", str13, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "=" + "'", str15, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "711" + "'", str17, "711");
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("\001\003\ufffdwu");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "521" + "'", str3, "521");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "189" + "'", str11, "189");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19" + "'", str13, "19");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        java.lang.String str9 = rSA1.encrypt("6901296438808693457125536937");
        java.lang.String str11 = rSA1.encrypt("41");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "197" + "'", str7, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "335" + "'", str9, "335");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "359" + "'", str11, "359");
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("531");
        java.lang.String str11 = rSA1.encrypt("\005\006\ufffd\000hH");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "111" + "'", str5, "111");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_" + "'", str9, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "561" + "'", str11, "561");
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("1826321098642803");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4930646787" + "'", str11, "4930646787");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2963530424" + "'", str13, "2963530424");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2125048046293407" + "'", str17, "2125048046293407");
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\035\ufffd\ufffd\ufffd\ufffd\ufffdg");
        java.lang.String str13 = rSA1.encrypt("1184438612620945");
        java.lang.String str15 = rSA1.encrypt("\024\ufffd\033\u04e0\ufffd\ufffd\ufffd9");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "67" + "'", str9, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "280" + "'", str11, "280");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "169" + "'", str13, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "321" + "'", str15, "321");
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\003\001\ufffd\ufffd\ufffd\027\001\ufffd\u07a3");
        java.lang.String str15 = rSA1.encrypt("26507047337243548657799763260");
        java.lang.String str17 = rSA1.encrypt("233633571202998402694320649835");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1068817412" + "'", str13, "1068817412");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3893077225" + "'", str15, "3893077225");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5303022362" + "'", str17, "5303022362");
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("92");
        java.lang.String str11 = rSA1.encrypt("477");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "540" + "'", str9, "540");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "103" + "'", str11, "103");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("2783614369450889");
        java.lang.String str15 = rSA1.encrypt("\035\ufffd\u014e");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002." + "'", str3, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "399" + "'", str7, "399");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001," + "'", str13, "\001,");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50" + "'", str15, "50");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("122892780830403884776352229482");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("1579535512211996");
        java.lang.String str9 = rSA1.encrypt("\001@");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("630010341");
        java.lang.String str15 = rSA1.encrypt("\001i\f\u0116");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffdlI" + "'", str3, "\002\ufffdlI");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40451673220703897378404212122" + "'", str7, "40451673220703897378404212122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32768000" + "'", str9, "32768000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\022\ufffdM\017\ufffd\017\ufffd\ufffd\177" + "'", str13, "\002\022\ufffdM\017\ufffd\017\ufffd\ufffd\177");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "515293391054343181164894106061" + "'", str15, "515293391054343181164894106061");
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("489");
        java.lang.String str13 = rSA1.encrypt("\006$\f\ufffd\ufffd\ufffd\ufffd\025xP1");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffdj\000\ufffd");
        java.lang.String str19 = rSA1.encrypt("301394451350660253266054962046");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\177\022\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\177\022\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "646599530602462917629990236643" + "'", str13, "646599530602462917629990236643");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "422085811464283572702535998653" + "'", str17, "422085811464283572702535998653");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "802919118933281688138010056063" + "'", str19, "802919118933281688138010056063");
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        java.lang.String str15 = rSA1.decrypt("410");
        java.lang.String str17 = rSA1.encrypt("\002B");
        java.lang.String str19 = rSA1.decrypt("1663575816645466");
        java.lang.String str21 = rSA1.decrypt("10533540197701377965021536254");
        java.lang.String str23 = rSA1.encrypt("412926472226683539400876318300");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "509" + "'", str9, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "438" + "'", str13, "438");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\"" + "'", str15, "\002\"");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "142" + "'", str17, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\023" + "'", str19, "\001\023");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001e" + "'", str21, "\001e");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "242" + "'", str23, "242");
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "594" + "'", str7, "594");
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
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
        java.lang.String str21 = rSA1.encrypt("2534161547869551609048955957");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003A" + "'", str15, "\003A");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "477" + "'", str17, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "109" + "'", str21, "109");
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "352" + "'", str11, "352");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "B" + "'", str13, "B");
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013" + "'", str17, "\013");
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("182");
        java.lang.String str11 = rSA1.encrypt("\004\u04f1\ufffd\ufffd\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "244" + "'", str7, "244");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "307" + "'", str9, "307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.decrypt("25881465153328890912467033366");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\007S\\\ufffd.Z\025\ufffd\017\ufffd}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?S\\?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdl" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdl");
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("474056181514113440240671949593");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "817474491731749808509765742934" + "'", str5, "817474491731749808509765742934");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1208902895495334527" + "'", str7, "1208902895495334527");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\032\ufffd\ufffdg\005\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\032\ufffd\ufffdg\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd|" + "'", str15, "\001\ufffd\ufffd|");
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("1798350776157985");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("231304546751176212661338793524");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\u031a\ufffd:\b\ufffd\034\ufffd\ufffd");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "731466907373327" + "'", str7, "731466907373327");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1300178745820292" + "'", str9, "1300178745820292");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "928905270453084" + "'", str11, "928905270453084");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "133" + "'", str17, "133");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "162" + "'", str19, "162");
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffdt\001\ufffd\ufffd\r]");
        java.lang.String str15 = rSA1.decrypt("14404185661858243257287146439");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd/");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "253" + "'", str5, "253");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001p" + "'", str7, "\001p");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001%" + "'", str9, "\001%");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "288930342648300107814256117806" + "'", str13, "288930342648300107814256117806");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\u066c\ufffd\f\ufffd\013\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\u066c\ufffd\f\ufffd\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "301493290423159857491245090206" + "'", str17, "301493290423159857491245090206");
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("23585400911907150218938419175");
        java.lang.String str5 = rSA1.encrypt("144");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p" + "'", str3, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "374" + "'", str5, "374");
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.decrypt("251293784");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??N<?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd" + "'", str7, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1743707338512231" + "'", str13, "1743707338512231");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffdf" + "'", str15, "\006\ufffd\ufffd\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1669171767623584" + "'", str17, "1669171767623584");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\033\ufffd" + "'", str19, "\ufffd\ufffd\033\ufffd");
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        java.lang.String str15 = rSA1.encrypt("\004\u05b9\ufffd\001Yt\035\ufffd\u04968");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("\000\u05cf\ufffd<");
        java.lang.String str21 = rSA1.decrypt("1617874323937581");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "61404146150722014908116005497" + "'", str11, "61404146150722014908116005497");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u031d\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\u031d\ufffd\ufffd\177\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "206335959113450212719293384680" + "'", str15, "206335959113450212719293384680");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1473965640367670" + "'", str19, "1473965640367670");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\025\ufffd\ufffd\ufffdo" + "'", str21, "\006\025\ufffd\ufffd\ufffdo");
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.encrypt("862118454");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.decrypt("11831344030969652997092927382");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\036" + "'", str7, "\001\036");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "165" + "'", str9, "165");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "K" + "'", str15, "K");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("155325805838506");
        java.lang.String str11 = rSA1.encrypt("947370313855704349365862998582");
        java.lang.String str13 = rSA1.decrypt("32");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26818240230238882583827338521" + "'", str7, "26818240230238882583827338521");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2236450475226474815857006602" + "'", str11, "2236450475226474815857006602");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
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
        java.lang.String str21 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\u0508\ufffdB");
        java.lang.String str23 = rSA1.encrypt("299618005893157767956794962567");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2365666127" + "'", str11, "2365666127");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\005c" + "'", str13, "\ufffd\005c");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\000" + "'", str17, "\002\000");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "407041204080162505236320580461" + "'", str21, "407041204080162505236320580461");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "401217112208574887793908723596" + "'", str23, "401217112208574887793908723596");
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\0018");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\uc88d\ufffd\ufffd\ufffdE" + "'", str9, "\004\uc88d\ufffd\ufffd\ufffdE");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "287794280118878208" + "'", str15, "287794280118878208");
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("106618729686746388855762464470");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "31633447053668969510268601941" + "'", str5, "31633447053668969510268601941");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "363726417541171330990883018910" + "'", str11, "363726417541171330990883018910");
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("232501808598646088728588706843");
        java.lang.String str19 = rSA1.encrypt("1027254282");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "325" + "'", str13, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "412" + "'", str17, "412");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "74" + "'", str19, "74");
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.encrypt("754114764299777929981850028976");
        java.lang.String str13 = rSA1.decrypt("959429256");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "305" + "'", str7, "305");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "531" + "'", str11, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("110");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "540" + "'", str5, "540");
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.decrypt("3");
        java.lang.String str15 = rSA1.decrypt("17100415790055507982022224050");
        java.lang.String str17 = rSA1.encrypt("\001+5{1");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\r\024\ufffd\ufffd\ufffd\ufffd\ufffd\u02e1\ufffd\ufffd" + "'", str9, "\r\024\ufffd\ufffd\ufffd\ufffd\ufffd\u02e1\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "701642147488371917149818646050" + "'", str11, "701642147488371917149818646050");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd|I\"\ufffd\ufffd\ufffd\ufffd\036" + "'", str13, "\001\ufffd|I\"\ufffd\ufffd\ufffd\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffdkL" + "'", str15, "\003\ufffd\ufffdkL");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "126497883237376797273707551889" + "'", str17, "126497883237376797273707551889");
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("15686160858");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("136436024158101403260395954510");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "405340882413191594169875996475" + "'", str5, "405340882413191594169875996475");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\177\ufffd\ufffd\021\ufffd" + "'", str7, "\001\ufffd\ufffd\177\ufffd\ufffd\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "96549157373046875" + "'", str9, "96549157373046875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffdfK\000\ufffd\u0753\ufffd\025" + "'", str11, "\000\ufffd\ufffdfK\000\ufffd\u0753\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("582");
        java.lang.String str13 = rSA1.encrypt("594159122957569969449491971345");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd=Bu" + "'", str7, "\000\ufffd=Bu");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4575877672" + "'", str9, "4575877672");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "64258909" + "'", str11, "64258909");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2041988351" + "'", str13, "2041988351");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2090663378" + "'", str15, "2090663378");
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("244491094832186423838238028174");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\007" + "'", str7, "\002\007");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("4141931971");
        java.lang.String str9 = rSA1.encrypt("311430194");
        java.lang.String str11 = rSA1.encrypt("952601693");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "743095359" + "'", str3, "743095359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "783466540230196026402134858403" + "'", str7, "783466540230196026402134858403");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "251739954775124090136742304213" + "'", str9, "251739954775124090136742304213");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "650091142801105518517580093150" + "'", str11, "650091142801105518517580093150");
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd*\022" + "'", str17, "\003\ufffd\ufffd\ufffd*\022");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd_" + "'", str19, "\002\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2008965810078193" + "'", str21, "2008965810078193");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "648077881310807" + "'", str23, "648077881310807");
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd-\320\031\ufffd\016\030");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0102\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M" + "'", str3, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\032\ufffd~\f\ufffd\ufffd\"\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\032\ufffd~\f\ufffd\ufffd\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "73589567904144802197469026264" + "'", str15, "73589567904144802197469026264");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32622623963449229552141988517" + "'", str17, "32622623963449229552141988517");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "217574900736893820726670285611" + "'", str19, "217574900736893820726670285611");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "317" + "'", str3, "317");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "732" + "'", str5, "732");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "f" + "'", str7, "f");
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("586164191051957443639887490707");
        java.lang.String str11 = rSA1.encrypt("4048474313590082781301727312");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "32647187928230780234518102185" + "'", str3, "32647187928230780234518102185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14144544616054776496181117219" + "'", str5, "14144544616054776496181117219");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035\ufffd\020\ufffd\ufffd\ufffd(\034a\000" + "'", str7, "\035\ufffd\020\ufffd\ufffd\ufffd(\034a\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7436311135415736650746590244" + "'", str9, "7436311135415736650746590244");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6606449976144941103581225588" + "'", str11, "6606449976144941103581225588");
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\ufffdR*\035(`e");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035" + "'", str7, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50" + "'", str9, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "392" + "'", str11, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "289" + "'", str13, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "235" + "'", str15, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "287" + "'", str17, "287");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.encrypt("\032\ufffd$\030\ufffd\ufffd\u02c3\ufffd\ufffd{");
        java.lang.String str15 = rSA1.decrypt("9689375820439133685507573070");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("488587433873091327064661528423");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "264629183" + "'", str9, "264629183");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffdX" + "'", str11, "\ufffdX");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1781506886" + "'", str13, "1781506886");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "18633641800366288508873626977" + "'", str19, "18633641800366288508873626977");
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("2908957702");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "437" + "'", str7, "437");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9129634090257009864307539078" + "'", str13, "9129634090257009864307539078");
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("958913602649032");
        java.lang.String str13 = rSA1.decrypt("322206248827960928498686998334");
        java.lang.String str15 = rSA1.encrypt("\f\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdX]");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("35633179814210302024");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "110" + "'", str7, "110");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "324" + "'", str15, "324");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "95525114147316160564776871806" + "'", str19, "95525114147316160564776871806");
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
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
        java.lang.String str31 = rSA1.encrypt("116502501450433174429674086323");
        java.math.BigInteger bigInteger32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger33 = rSA1.decrypt(bigInteger32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "v\002\ufffd\004\ufffd\ufffd\ufffd\ufffd\034\ufffd" + "'", str13, "v\002\ufffd\004\ufffd\ufffd\ufffd\ufffd\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "723319258026756" + "'", str17, "723319258026756");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\027\ufffdc" + "'", str21, "\027\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2622533737" + "'", str23, "2622533737");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002{k{n" + "'", str25, "\002{k{n");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "880928156" + "'", str27, "880928156");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "4043448101" + "'", str29, "4043448101");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "7010080685" + "'", str31, "7010080685");
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
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
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32290985035617702181230056513" + "'", str11, "32290985035617702181230056513");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "432012413421426278273838352490" + "'", str13, "432012413421426278273838352490");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "195776097777379739067763806825" + "'", str15, "195776097777379739067763806825");
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        java.lang.String str15 = rSA1.encrypt("3934956567");
        java.lang.String str17 = rSA1.encrypt("442657522808357693876262984000");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002E" + "'", str7, "\002E");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "478" + "'", str9, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37" + "'", str13, "37");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "425" + "'", str15, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "23" + "'", str17, "23");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("616");
        java.lang.String str13 = rSA1.encrypt("\001)");
        java.lang.String str15 = rSA1.encrypt("1139845274");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\002\ufffdb" + "'", str7, "\000\ufffd\002\ufffdb");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32546810001302450348637612025" + "'", str11, "32546810001302450348637612025");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2310905821257" + "'", str13, "2310905821257");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30454790773097930394316602546" + "'", str15, "30454790773097930394316602546");
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("582");
        java.lang.String str13 = rSA1.encrypt("K\023\ufffd\ufffd\003\ufffd\ufffd3\032.6");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd" + "'", str7, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5399014002" + "'", str9, "5399014002");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5773529944" + "'", str11, "5773529944");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2188246796" + "'", str13, "2188246796");
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("444022667764530828653440708581");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "121" + "'", str5, "121");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\006" + "'", str7, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "921332082197485" + "'", str11, "921332082197485");
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("911315954");
        java.lang.String str15 = rSA1.encrypt("56836079408617351725413407053");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\033\ufffd");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "435293357626388949535838252412" + "'", str5, "435293357626388949535838252412");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100833259961899148745462290617" + "'", str7, "100833259961899148745462290617");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\027\003\ufffd\ufffd\ufffd\\\ufffd" + "'", str9, "\005\ufffd\ufffd\027\003\ufffd\ufffd\ufffd\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\002[e" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffd\002[e");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "382008708825482696440381167627" + "'", str15, "382008708825482696440381167627");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "307847199580036837287878322885" + "'", str17, "307847199580036837287878322885");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("404");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "489492367240985448757663286054" + "'", str11, "489492367240985448757663286054");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "307732862434921875" + "'", str13, "307732862434921875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7161242121" + "'", str17, "7161242121");
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^\005");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?*??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "14994143451201033266676510293" + "'", str7, "14994143451201033266676510293");
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.decrypt("304417796247364099549471429573");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("4542561699");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\025\ufffd\ufffd" + "'", str9, "\000\ufffd\025\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\022\ufffd" + "'", str15, "\001\ufffd\022\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("9215357598594065411749980871");
        java.lang.String str17 = rSA1.decrypt("948843007");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "358" + "'", str11, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8768729599" + "'", str15, "8768729599");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffdF\034" + "'", str17, "\ufffdF\034");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("187");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "112" + "'", str3, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001" + "'", str9, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "289" + "'", str11, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88" + "'", str13, "88");
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("40208053863613346450978315343");
        java.lang.String str9 = rSA1.decrypt("9076220414");
        java.lang.String str11 = rSA1.encrypt("1286422617657626");
        java.lang.String str13 = rSA1.encrypt("331353530344858050139818870561");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "37761667692440245568" + "'", str3, "37761667692440245568");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006\u02d2~\026\ufffd\ufffd\ufffd\016\017" + "'", str5, "\006\u02d2~\026\ufffd\ufffd\ufffd\016\017");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "361986865638461697848721311469" + "'", str7, "361986865638461697848721311469");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\u0156\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\u0156\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "475768254009481998359945717343" + "'", str11, "475768254009481998359945717343");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "689472312324309909384599102055" + "'", str13, "689472312324309909384599102055");
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\ufffd\003\ufffd\025\ufffd" + "'", str17, "\002\ufffd\ufffd\ufffd\003\ufffd\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "666980721260266702713325134077" + "'", str19, "666980721260266702713325134077");
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("66");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffdw1$\035\ufffd\ufffd\005");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\"\ufffdM\025\ufffd\ufffd\ufffd\ufffd$z" + "'", str13, "\"\ufffdM\025\ufffd\ufffd\ufffd\ufffd$z");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004H\027\ufffd9" + "'", str17, "\004H\027\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1732021083058186" + "'", str19, "1732021083058186");
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("232");
        java.lang.String str13 = rSA1.encrypt("193");
        java.lang.String str15 = rSA1.encrypt("649467050318131325090883855258");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\001a" + "'", str7, "\000\ufffd\ufffd\001a");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6031892551" + "'", str9, "6031892551");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3982792573" + "'", str11, "3982792573");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4875000798" + "'", str13, "4875000798");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1237885899" + "'", str15, "1237885899");
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\032" + "'", str5, "\001\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "274" + "'", str9, "274");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "293" + "'", str11, "293");
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\u077f\ufffd\ufffd");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\u018a\ufffd\ufffd\027\ufffd" + "'", str11, "\003\ufffd\ufffd\u018a\ufffd\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\u0158\ufffd\ufffd\023\ufffd\ufffd\ufffd" + "'", str13, "\003\ufffd\u0158\ufffd\ufffd\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "16878951045384315807325574007" + "'", str17, "16878951045384315807325574007");
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "48" + "'", str5, "48");
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.lang.String str7 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "13459220591214778269604390596" + "'", str3, "13459220591214778269604390596");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "18934159848795954319753669588" + "'", str5, "18934159848795954319753669588");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2512087224032" + "'", str7, "2512087224032");
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("1471233510");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "594" + "'", str7, "594");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "295" + "'", str11, "295");
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("2329675105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001a");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "307" + "'", str9, "307");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2945341693658097614291613316" + "'", str15, "2945341693658097614291613316");
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("23585400911907150218938419175");
        java.lang.String str5 = rSA1.encrypt("144");
        java.lang.String str7 = rSA1.encrypt("155");
        java.lang.String str9 = rSA1.encrypt("1824531455");
        java.lang.String str11 = rSA1.decrypt("1506084210238196");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "85" + "'", str5, "85");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "287" + "'", str7, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "128" + "'", str9, "128");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "T" + "'", str11, "T");
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("394");
        java.lang.String str13 = rSA1.encrypt("278119583940060340062984608521");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'00\177\ufffd\ufffd\ufffd\ufffd.\021" + "'", str7, "'00\177\ufffd\ufffd\ufffd\ufffd.\021");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\000\ufffd\ufffd\ufffd\036\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\000\ufffd\ufffd\ufffd\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "629628709561544622576742514606" + "'", str13, "629628709561544622576742514606");
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.decrypt("338664280");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.encrypt("173308812382735061240593731618");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "67243930848333873284186724903" + "'", str3, "67243930848333873284186724903");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdx\003e}uv" + "'", str5, "\001\ufffd\ufffd\ufffd\ufffdx\003e}uv");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "82" + "'", str9, "82");
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.String str9 = rSA1.encrypt("674338054");
        java.lang.String str11 = rSA1.encrypt("567824154010472842391682528857");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98" + "'", str3, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "81" + "'", str5, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + " " + "'", str7, " ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "490" + "'", str9, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "425" + "'", str11, "425");
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("1980227294551308");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55280781781530423449973107728" + "'", str7, "55280781781530423449973107728");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "251" + "'", str11, "251");
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\0020O\030\007");
        java.lang.String str15 = rSA1.decrypt("706279662");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13961757341562622146438705347" + "'", str13, "13961757341562622146438705347");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffde\023$Pt>" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffde\023$Pt>");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.decrypt("375");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("152877368672763475612453496527");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002s" + "'", str7, "\002s");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002d" + "'", str9, "\002d");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\005\ufffd\030\ufffd\033" + "'", str13, "\004\ufffd\ufffd\ufffd\005\ufffd\030\ufffd\033");
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        java.lang.String str7 = rSA1.decrypt("315");
        java.lang.String str9 = rSA1.encrypt("217");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
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
        java.lang.String str21 = rSA1.encrypt("\001\026\ufffd\ufffd\ufffd\ufffd\u0233\ufffd\ufffd*");
        java.lang.String str23 = rSA1.decrypt("25089298554744898751637716200");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\025\ufffd\ufffd\ufffdc\034" + "'", str13, "\025\ufffd\ufffd\ufffdc\034");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12890789073783317926012605505" + "'", str15, "12890789073783317926012605505");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ud6bdEf\t\ufffd[" + "'", str17, "\ufffd\ufffd\ud6bdEf\t\ufffd[");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "20" + "'", str21, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001:" + "'", str23, "\001:");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("26473901013199856375128902653");
        java.lang.String str15 = rSA1.decrypt("351911857970627497367275765431");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "134" + "'", str11, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "t" + "'", str15, "t");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("495");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6065606465" + "'", str9, "6065606465");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\002!");
        java.lang.String str5 = rSA1.encrypt("555673510403649237558006483347");
        java.lang.String str7 = rSA1.encrypt("1298890405798896");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48081998590625" + "'", str3, "48081998590625");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "46412668139522962637393043346" + "'", str5, "46412668139522962637393043346");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "38618264456448662250158111938" + "'", str7, "38618264456448662250158111938");
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        java.lang.String str13 = rSA1.decrypt("187");
        java.lang.String str15 = rSA1.encrypt("32");
        java.lang.String str17 = rSA1.encrypt("425");
        java.lang.String str19 = rSA1.decrypt("95");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str23 = rSA1.encrypt("1032186447382812159882698701641");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2285570299" + "'", str11, "2285570299");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\\" + "'", str13, "\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31725467" + "'", str15, "31725467");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "347464110" + "'", str17, "347464110");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd4" + "'", str19, "\000\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "466" + "'", str23, "466");
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        java.lang.String str11 = rSA1.decrypt("2589008067855306");
        java.lang.String str13 = rSA1.decrypt("847000063");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5" + "'", str7, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "54" + "'", str9, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("731550677551533714083843213025");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\023\ufffd\ufffd\u06e6'\"\ufffd\035\ufffd4");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "275" + "'", str11, "275");
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("600262523634158424115576293750");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2006202922801945" + "'", str7, "2006202922801945");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1188857940188697" + "'", str9, "1188857940188697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "799500794703261400362378573005" + "'", str13, "799500794703261400362378573005");
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.decrypt("474552");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\004");
        java.lang.String str15 = rSA1.decrypt("462640104830285555641109561987");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "310" + "'", str9, "310");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "N" + "'", str11, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "382" + "'", str13, "382");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001P" + "'", str15, "\001P");
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("2132861796");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\007\016\000\ufffd(%\005\ufffd\t\ufffd\005");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547" + "'", str9, "547");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "496" + "'", str11, "496");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "471" + "'", str13, "471");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("376230106637114381994083478121");
        java.lang.String str15 = rSA1.encrypt("\024\t\ufffd\ufffd\036\ufffdq\003\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("35447081836632474773806770245");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffd\t\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Uw!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\027\ufffd\ufffd\ufffd\ufffdw\021\ufffd" + "'", str9, "\005\ufffd\027\ufffd\ufffd\ufffd\ufffdw\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\021j" + "'", str13, "\002\ufffd\ufffd\021j");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2852799444325568" + "'", str15, "2852799444325568");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "944445246216384" + "'", str17, "944445246216384");
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "261307135177420182052482801186" + "'", str5, "261307135177420182052482801186");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "208921698784647008211585662410" + "'", str7, "208921698784647008211585662410");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\u0294\ufffd8\003\ufffd\ufffd\ufffd\013\ufffdD" + "'", str9, "\t\u0294\ufffd8\003\ufffd\ufffd\ufffd\013\ufffdD");
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
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
        java.lang.String str23 = rSA1.encrypt("476454198423578595515596293095");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "812" + "'", str15, "812");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "29" + "'", str19, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "211" + "'", str23, "211");
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34202962869650826182828221430" + "'", str3, "34202962869650826182828221430");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36303303039496034566889015335" + "'", str5, "36303303039496034566889015335");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd%" + "'", str7, "\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "425927596977747" + "'", str9, "425927596977747");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "27518330780726830355764846867" + "'", str11, "27518330780726830355764846867");
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.decrypt("45739559234940083783638906525");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("1428617785778869");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "223766081" + "'", str13, "223766081");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffdR" + "'", str15, "\000\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffdpK\017\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\ufffdpK\017\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("582");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd| ");
        java.lang.String str11 = rSA1.decrypt("18899767089855957428658471484");
        java.lang.String str13 = rSA1.decrypt("22377768887302657979511220671");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\u06f5\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\u06f5\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3177637392251944400625523751" + "'", str9, "3177637392251944400625523751");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "~\037\ufffd\ufffd\ufffd" + "'", str11, "~\037\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006ke\025\ufffd\ufffd|R\276z" + "'", str13, "\006ke\025\ufffd\ufffd|R\276z");
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
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
        java.lang.String str21 = rSA1.decrypt("24910607840224317483596072080");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\036\003\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\036\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdEV" + "'", str17, "\000\ufffd\ufffd\ufffd\ufffdEV");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\033\ufffd\ufffd\ufffd" + "'", str19, "\000\ufffd\033\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd\ufffd\u0511\ufffd" + "'", str21, "\001\ufffd\ufffd\ufffd\u0511\ufffd");
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
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
        java.lang.String str23 = rSA1.encrypt("1911054678189828");
        java.lang.String str25 = rSA1.encrypt("\002\007\033\ufffdUl\007\ufffd\u045b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\0042\017\354\ufffd9e8\013\ufffd\024\ufffd" + "'", str9, "\0042\017\354\ufffd9e8\013\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "89515436785455761215673629877" + "'", str15, "89515436785455761215673629877");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\f\t<" + "'", str17, "\007\ufffd\ufffd\ufffd\ufffd\f\t<");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "544370141010823769534714948182" + "'", str19, "544370141010823769534714948182");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdi\t" + "'", str21, "\003\ufffd\ufffd\ufffd\ufffdi\t");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "347916389155992942878036041377" + "'", str23, "347916389155992942878036041377");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "404529835339637742660849265850" + "'", str25, "404529835339637742660849265850");
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("5880511900768");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "157042322856966148255851047193" + "'", str5, "157042322856966148255851047193");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "69593961881970291315418461730" + "'", str7, "69593961881970291315418461730");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\f\ufffd\u066b\025\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd\f\ufffd\u066b\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\035\ufffd\021\ufffd\013\ufffd\ufffd\ufffd" + "'", str11, "\005\035\ufffd\021\ufffd\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001f" + "'", str15, "\001f");
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
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
        java.lang.String str25 = rSA1.encrypt("\n\u0790\ufffd\ufffd\026\ufffds\f\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd\016\ufffdS" + "'", str9, "\004\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd\016\ufffdS");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2727096677140470662732709888" + "'", str15, "2727096677140470662732709888");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "657042197032126236886035675917" + "'", str17, "657042197032126236886035675917");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\035\ufffd\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd\035\ufffd\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "155057682437569797769388409788" + "'", str21, "155057682437569797769388409788");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\033\ufffd\ufffd\u01a7\ufffd\ufffdrL" + "'", str23, "\003\033\ufffd\ufffd\u01a7\ufffd\ufffdrL");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "242883103509303933803100261049" + "'", str25, "242883103509303933803100261049");
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("331");
        java.lang.String str13 = rSA1.encrypt("-");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44874627577612233003" + "'", str5, "44874627577612233003");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\000\f .\031\ufffd\ufffd%" + "'", str11, "\ufffd\000\f .\031\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "91125" + "'", str13, "91125");
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1408257552770397");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "777916756208950106657109605928" + "'", str7, "777916756208950106657109605928");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "507145971160778657242459646560" + "'", str9, "507145971160778657242459646560");
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("718921407");
        java.lang.String str7 = rSA1.encrypt("1757553155773477");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "587109776355624867977167459917" + "'", str5, "587109776355624867977167459917");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "591535538436159735776464277869" + "'", str7, "591535538436159735776464277869");
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        java.lang.String str13 = rSA1.encrypt("1135680707");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "91" + "'", str7, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "490" + "'", str11, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "189" + "'", str13, "189");
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.decrypt("674338054");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("366088292426996016429888575387");
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\u02d9\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\u02d9\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "476870527304680075190150316886" + "'", str9, "476870527304680075190150316886");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "129111633749947413994628652964" + "'", str11, "129111633749947413994628652964");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "186956476434570333004184797638" + "'", str15, "186956476434570333004184797638");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\034\ufffd\"\ufffd\ufffd\ufffd\023\ufffd\037=" + "'", str17, "\004\ufffd\034\ufffd\"\ufffd\ufffd\ufffd\023\ufffd\037=");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.decrypt("1255296538");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134" + "'", str7, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1" + "'", str9, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0374\ufffd\ufffdy\025\ufffd" + "'", str13, "\u0374\ufffd\ufffdy\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffdQ\006\ufffdn" + "'", str15, "\ufffd\ufffd\ufffd\ufffdQ\006\ufffdn");
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd'" + "'", str9, "\b\ufffd\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "344059720883812627681235075288" + "'", str11, "344059720883812627681235075288");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("616");
        java.lang.String str13 = rSA1.encrypt("\001)");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd`\035\002" + "'", str7, "\000\ufffd`\035\002");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14657562745955754178343975897" + "'", str11, "14657562745955754178343975897");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "203842691587258713" + "'", str13, "203842691587258713");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8901199380991299634254749533" + "'", str15, "8901199380991299634254749533");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("25881465153328890912467033366");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "368" + "'", str7, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "228" + "'", str9, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("24728158503917487987839420576");
        java.lang.String str9 = rSA1.encrypt("76953254708816336608130262493");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\u05b4" + "'", str7, "\000\ufffd\ufffd\u05b4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6729088155" + "'", str9, "6729088155");
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("160015912349121428858268699636");
        java.lang.String str11 = rSA1.encrypt("505764498321127");
        java.lang.String str13 = rSA1.encrypt("\001m");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "49697839193982577957353066361" + "'", str7, "49697839193982577957353066361");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ".5d\\\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, ".5d\\\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37762895192179667525388810797" + "'", str11, "37762895192179667525388810797");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6478348728125" + "'", str13, "6478348728125");
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
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
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\006" + "'", str3, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001pTC`" + "'", str7, "\001pTC`");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffdk4" + "'", str9, "\001\ufffdk4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2381645965" + "'", str11, "2381645965");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3657785955" + "'", str13, "3657785955");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3186605408" + "'", str15, "3186605408");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "421" + "'", str19, "421");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("421538216752639241087728305427");
        java.lang.String str13 = rSA1.encrypt("35650010007221349888");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "30" + "'", str7, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "224115010065025106909359140464" + "'", str11, "224115010065025106909359140464");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "514038766282184145888027815440" + "'", str13, "514038766282184145888027815440");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("25781477714155137707289447841");
        java.lang.String str9 = rSA1.decrypt("40021916406662028876239884409");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("532");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3859951572" + "'", str7, "3859951572");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216898804699520158226788374248" + "'", str13, "216898804699520158226788374248");
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002" + "'", str9, "\002");
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd\ufffd\033\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("4655825244");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "160" + "'", str3, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "878" + "'", str9, "878");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "724" + "'", str15, "724");
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.encrypt("\b\ufffd{[K\350\026\027\ufffd\ufffd@");
        java.lang.String str15 = rSA1.decrypt("1028793282341587");
        java.lang.String str17 = rSA1.decrypt("342981671868457888627866774352");
        java.lang.String str19 = rSA1.encrypt("20256379923826066825919342649");
        java.lang.String str21 = rSA1.encrypt("2640934495");
        java.lang.String str23 = rSA1.encrypt("\t\ufffd\ufffd\ufffd\ufffd\020\ufffd\022\ufffd\ufffdM");
        java.lang.String str25 = rSA1.decrypt("412670885907072226160482170559");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\f\ufffd\ufffd\ufffd\ufffd\ufffd\037$eF" + "'", str9, "\004\f\ufffd\ufffd\ufffd\ufffd\ufffd\037$eF");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "445887141307436464156348202329" + "'", str11, "445887141307436464156348202329");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "417150547473214509510580847210" + "'", str13, "417150547473214509510580847210");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd6" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\004\ufffd\ufffd<.p9\r2" + "'", str17, "\ufffd\004\ufffd\ufffd<.p9\r2");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "474479236838869888182099457310" + "'", str19, "474479236838869888182099457310");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10161520854395546963078154705" + "'", str21, "10161520854395546963078154705");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "265918997504741071953464799132" + "'", str23, "265918997504741071953464799132");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\005\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd@" + "'", str25, "\005\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd@");
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("12");
        java.lang.String str7 = rSA1.encrypt("159881670619010845812598316629");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1375407192" + "'", str5, "1375407192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2224212970" + "'", str7, "2224212970");
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("67767090432257996401325509937");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("g");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"g\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001," + "'", str11, "\001,");
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.String str15 = rSA1.encrypt("24829636972784436289623304425");
        java.lang.String str17 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\003-\026" + "'", str7, "\000\ufffd\003-\026");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "450766669594624" + "'", str11, "450766669594624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\r\ufffdw" + "'", str13, "\003\ufffd\r\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3151154340816725" + "'", str15, "3151154340816725");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1395121311233413" + "'", str17, "1395121311233413");
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\005\ufffd\ufffd\n\ufffd\ufffd*");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.encrypt("907");
        java.lang.String str17 = rSA1.encrypt("703153339289949437747864939069");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35270568919477663190045256291" + "'", str7, "35270568919477663190045256291");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "397205622676798655643788202745" + "'", str11, "397205622676798655643788202745");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "52645620152203942375" + "'", str15, "52645620152203942375");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "589740511804446579493648260840" + "'", str17, "589740511804446579493648260840");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        java.lang.String str9 = rSA1.decrypt("43845903535359091850927913216");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\013" + "'", str5, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "392" + "'", str7, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "432" + "'", str11, "432");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("449976981647208350843955950310");
        java.lang.String str19 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u02c5K");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "282" + "'", str7, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001b" + "'", str11, "\001b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "46" + "'", str13, "46");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\u0596\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd\u0596\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "463269886319804466205457140734" + "'", str19, "463269886319804466205457140734");
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
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
        java.lang.String str21 = rSA1.decrypt("715702306073061046224667861488");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10697700509" + "'", str13, "10697700509");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10931612020" + "'", str15, "10931612020");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "245165364" + "'", str17, "245165364");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\u03ee" + "'", str21, "\002\ufffd\ufffd\u03ee");
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("\003e\006\ufffdi");
        java.lang.String str9 = rSA1.encrypt("\007\ufffd\u5b07\ufffd\177!\031\u0786");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10327170777" + "'", str7, "10327170777");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10773236910" + "'", str9, "10773236910");
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
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
            java.lang.String str21 = rSA1.decrypt("\003\025\ufffd\u8c94\ufffd\004<Ul\026");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "669258555" + "'", str13, "669258555");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4044643095" + "'", str15, "4044643095");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7988831443" + "'", str17, "7988831443");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "313307911" + "'", str19, "313307911");
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.decrypt("551955677861788400383088695165");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "353" + "'", str7, "353");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd\u0204");
        java.lang.String str13 = rSA1.decrypt("17924349572865205354386909918");
        java.lang.String str15 = rSA1.encrypt("1321862735");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\034" + "'", str9, "\002\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "51" + "'", str11, "51");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "y" + "'", str13, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "433" + "'", str15, "433");
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "67" + "'", str7, "67");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
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
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\002" + "'", str17, "\001\002");
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffdt\001\ufffd\ufffd\r]");
        java.lang.String str15 = rSA1.decrypt("14404185661858243257287146439");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000\ufffd/");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\007\004\020\ufffd\ufffd\ufffd<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "253" + "'", str5, "253");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001p" + "'", str7, "\001p");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001%" + "'", str9, "\001%");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "430543049403533477647637046646" + "'", str13, "430543049403533477647637046646");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\016\ufffd\ufffd\ufffd\ufffd\001\ufffd\ufffd0" + "'", str15, "\002\ufffd\016\ufffd\ufffd\ufffd\ufffd\001\ufffd\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "39869424504702946317340339856" + "'", str17, "39869424504702946317340339856");
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
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
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007I\t0V\024\ufffd6\017\ufffd\ufffd\ufffd" + "'", str17, "\007I\t0V\024\ufffd6\017\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "37778891330575010888" + "'", str19, "37778891330575010888");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "39942647459936564623086553735" + "'", str21, "39942647459936564623086553735");
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("1470301955");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "130" + "'", str7, "130");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\034" + "'", str11, "\034");
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\u057a\ufffd!\r\ufffdkk\004" + "'", str7, "\ufffd\u057a\ufffd!\r\ufffdkk\004");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "224434025693274148401050804932" + "'", str9, "224434025693274148401050804932");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\001\023\ufffd0\026\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\001\023\ufffd0\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffdl'M'" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffdl'M'");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "152624199323907036483367827582" + "'", str15, "152624199323907036483367827582");
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("12");
        java.lang.String str7 = rSA1.decrypt("1696283518");
        java.lang.String str9 = rSA1.encrypt("37");
        java.lang.String str11 = rSA1.decrypt("13613878250930930610526736747");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "238202695" + "'", str5, "238202695");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "636186063" + "'", str9, "636186063");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("461");
        java.lang.String str17 = rSA1.encrypt("208642166923338001575549632629");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\001\033\013<\037\ufffd\ufffd\ufffd\ufffd\ufffd\u0198\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\025" + "'", str15, "\001\025");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "662" + "'", str17, "662");
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("40021916406662028876239884409");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("\004]m\024\016\ufffdDu\034\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002." + "'", str3, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "769" + "'", str5, "769");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "765" + "'", str7, "765");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1797127169" + "'", str15, "1797127169");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "120" + "'", str19, "120");
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211644835628325975645129328276" + "'", str5, "211644835628325975645129328276");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "388309308326067334640781503368" + "'", str7, "388309308326067334640781503368");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\u0770\t\ufffd\ufffd\ufffd\027\ufffd\016~" + "'", str9, "\001\u0770\t\ufffd\ufffd\ufffd\027\ufffd\016~");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "298484967705824844303483277038" + "'", str11, "298484967705824844303483277038");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "114526292674322184743829302561" + "'", str13, "114526292674322184743829302561");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\004\ufffd\ufffd\u043e\ufffd\u0727\ufffd" + "'", str15, "\003\ufffd\004\ufffd\ufffd\u043e\ufffd\u0727\ufffd");
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("558");
        java.lang.String str11 = rSA1.encrypt("248");
        java.lang.String str13 = rSA1.encrypt("24913536938563019036853654452");
        java.lang.String str15 = rSA1.decrypt("275");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1876372503" + "'", str9, "1876372503");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "61122309" + "'", str11, "61122309");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1075928914" + "'", str13, "1075928914");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffdV" + "'", str15, "\ufffdV");
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("488268062867093539922400418770");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd'\027d");
        java.lang.String str11 = rSA1.encrypt("38298930827492792191661171455");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "562" + "'", str9, "562");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "357" + "'", str11, "357");
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\u07dd\ufffd\ufffd\034\ufffd\033");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("5542174771");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "247555121049017439834235576171" + "'", str5, "247555121049017439834235576171");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\021\ufffd." + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\021\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "406796969223405995204343800873" + "'", str9, "406796969223405995204343800873");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "48937299405814871585876300531" + "'", str11, "48937299405814871585876300531");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "223318616650671792475216449946" + "'", str13, "223318616650671792475216449946");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffdWJo" + "'", str17, "\000\ufffdWJo");
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        java.lang.String str11 = rSA1.encrypt("232");
        java.lang.String str13 = rSA1.encrypt("193");
        java.lang.String str15 = rSA1.encrypt("8241264822143");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\000" + "'", str7, "\000\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3518692503" + "'", str9, "3518692503");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7043490579" + "'", str11, "7043490579");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1770016384" + "'", str13, "1770016384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7917342068" + "'", str15, "7917342068");
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("833859270634783141252842076531");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd,\020\ufffd\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd\006" + "'", str9, "\003\ufffd\ufffd\ufffd\024\ufffd\ufffd\ufffd\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25884407698369392485706564145" + "'", str11, "25884407698369392485706564145");
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
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
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "141" + "'", str9, "141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "217" + "'", str11, "217");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16" + "'", str13, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "410" + "'", str15, "410");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0010" + "'", str17, "\0010");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001B" + "'", str21, "\001B");
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("306842132257782653009905995376");
        java.lang.String str7 = rSA1.encrypt("2112426122528962");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "118075009473427083880770442165" + "'", str5, "118075009473427083880770442165");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "399663326984559735064092304983" + "'", str7, "399663326984559735064092304983");
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.encrypt("8");
        java.lang.String str11 = rSA1.encrypt("933206985629308854320368650426");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("627871141952798007064534203107");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "204" + "'", str5, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "56" + "'", str9, "56");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "331" + "'", str11, "331");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "612677243480664074705140979520" + "'", str15, "612677243480664074705140979520");
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\036\ufffd\ufffd\ufffd\ufffdt" + "'", str3, "\005\036\ufffd\ufffd\ufffd\ufffdt");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\035\003\u05f7\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\002\003\u0342\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\002\003\u0342\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u043c" + "'", str11, "\007\ufffd\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u043c");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "26071971587859556925423233937" + "'", str13, "26071971587859556925423233937");
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        java.lang.String str13 = rSA1.encrypt("1135680707");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "91" + "'", str7, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "490" + "'", str11, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "189" + "'", str13, "189");
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\001\ufffdt");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("343");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "229988238778746357197697989767" + "'", str3, "229988238778746357197697989767");
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.decrypt("23");
        java.lang.String str19 = rSA1.decrypt("402792630455279437269280723305");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0018i\f\ufffd\037\ufffd" + "'", str11, "\0018i\f\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1033510931226852" + "'", str13, "1033510931226852");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2091907205472804" + "'", str15, "2091907205472804");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\007\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffd_" + "'", str19, "\001\ufffd\ufffd\ufffd_");
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("\003\001\ufffd\ufffd\ufffd\027\001\ufffd\u07a3");
        java.lang.String str15 = rSA1.decrypt("2080911283");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1759098436" + "'", str13, "1759098436");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("488268062867093539922400418770");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd'\027d");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001T" + "'", str7, "\001T");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "288" + "'", str9, "288");
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("2132861796");
        java.lang.String str13 = rSA1.encrypt(" \025\ufffd\ufffd\ufffd\u02d8\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "210" + "'", str9, "210");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "744" + "'", str11, "744");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "199" + "'", str13, "199");
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("\001\ufffd\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str7 = rSA1.encrypt("1905795830785729527017781248");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2230200134" + "'", str3, "2230200134");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "186098101648560151241683988238" + "'", str7, "186098101648560151241683988238");
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\ufffdV");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\026n\f-\004E\003");
        java.lang.String str15 = rSA1.decrypt("111689798687628537347293047723");
        java.lang.String str17 = rSA1.decrypt("411980550599073681535390193692");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd(;%\r\ufffd\177J");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "667109171422668542370460856383" + "'", str5, "667109171422668542370460856383");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "74836272631926854361957287239" + "'", str7, "74836272631926854361957287239");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0279" + "'", str9, "\006\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0279");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "694316182368858088039314602357" + "'", str11, "694316182368858088039314602357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "748977622215981232356339311722" + "'", str13, "748977622215981232356339311722");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\003\ufffd\ufffd\ufffd\u07ec\037\ufffdu" + "'", str15, "\ufffd\003\ufffd\ufffd\ufffd\u07ec\037\ufffdu");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r\ufffd\ufffdJ2.6[>" + "'", str17, "\r\ufffd\ufffdJ2.6[>");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "289917028933769029575445609119" + "'", str19, "289917028933769029575445609119");
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1998947500173" + "'", str9, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdu\006\ufffd\ufffd\ufffd]" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffdu\006\ufffd\ufffd\ufffd]");
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
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
        java.lang.Class<?> wildcardClass30 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "285" + "'", str7, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294" + "'", str9, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffde\017\ufffd\035\ufffd?V" + "'", str13, "\ufffd\ufffde\017\ufffd\035\ufffd?V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1498209537991975" + "'", str17, "1498209537991975");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str21, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "5294613767" + "'", str23, "5294613767");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd\ufffd" + "'", str25, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "9280885456" + "'", str27, "9280885456");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "7844317402" + "'", str29, "7844317402");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("327");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\033\ufffd\ufffd\ufffd\020\0027B4X" + "'", str7, "\001\033\ufffd\ufffd\ufffd\020\0027B4X");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001w" + "'", str11, "\001w");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
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
        java.lang.String str21 = rSA1.decrypt("1733796387844847");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\ufffd\335\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\b\ufffd\ufffd\335\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "719800660727876177300933358532" + "'", str11, "719800660727876177300933358532");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "51219698877452305031657920151" + "'", str13, "51219698877452305031657920151");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\177\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\177\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\t\033\ufffd\ufffd\035\ufffd\ufffd" + "'", str19, "\t\033\ufffd\ufffd\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\000" + "'", str21, "\ufffd\ufffd\ufffd\000");
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\\\000\ufffd\ufffd\ufffd\ufffd\ufffd\003/");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "462667719230677664952389533931" + "'", str3, "462667719230677664952389533931");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "30170312121151371656027179280" + "'", str5, "30170312121151371656027179280");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6262488131" + "'", str9, "6262488131");
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.decrypt("616");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.decrypt("521");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("614874826354358104452398113828");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001p" + "'", str5, "\001p");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "nAz?\037\ufffdI=.]2S" + "'", str9, "nAz?\037\ufffdI=.]2S");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\r\ufffd" + "'", str13, "\006\ufffd\ufffd\r\ufffd");
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\017\ufffd.\021\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "500603475428969536400655330924" + "'", str5, "500603475428969536400655330924");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "432837872142005968125606289252" + "'", str7, "432837872142005968125606289252");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffdG\f\007&\001\u060f\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffdG\f\007&\001\u060f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35633179814210302024" + "'", str11, "35633179814210302024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "203744777163624126586176104724" + "'", str13, "203744777163624126586176104724");
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002M" + "'", str3, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55" + "'", str7, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002i" + "'", str9, "\002i");
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("42418796185018424088");
        java.lang.String str19 = rSA1.encrypt("25695127238291905944659232192");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffdO\"\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffdO\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "11055857655553266601961575878" + "'", str17, "11055857655553266601961575878");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "21388402178970227117003155788" + "'", str19, "21388402178970227117003155788");
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        java.lang.String str13 = rSA1.encrypt("28765443577209770831492742566");
        java.lang.String str15 = rSA1.encrypt("15");
        rSA1.generateKeys(10);
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffdI" + "'", str7, "\000\ufffd\ufffdI");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5329321199" + "'", str9, "5329321199");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5651042158" + "'", str11, "5651042158");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3478104287" + "'", str13, "3478104287");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3403572456" + "'", str15, "3403572456");
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "275046517124343" + "'", str7, "275046517124343");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1059918334966521" + "'", str9, "1059918334966521");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.decrypt("6307084357");
        java.lang.String str11 = rSA1.encrypt("392665001845472701397620468182");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "427" + "'", str7, "427");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001N" + "'", str9, "\001N");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "383" + "'", str11, "383");
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        java.lang.String str15 = rSA1.decrypt("410");
        java.lang.String str17 = rSA1.encrypt("201505539860873048562977932183");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<" + "'", str7, "<");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "373" + "'", str9, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "531" + "'", str13, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "154" + "'", str17, "154");
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001Z" + "'", str11, "\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "|" + "'", str13, "|");
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("465270144019721");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\031" + "'", str5, "\002\031");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "511" + "'", str7, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\022-Z\\\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\022-Z\\\ufffd\ufffd");
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.encrypt("\032\ufffd$\030\ufffd\ufffd\u02c3\ufffd\ufffd{");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("23264544955983291322485115342");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2150896290" + "'", str9, "2150896290");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd" + "'", str11, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2422262898" + "'", str13, "2422262898");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\f\ufffd\u0527\ufffd57" + "'", str17, "\f\ufffd\u0527\ufffd57");
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("17399606650451632470785729796");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\t\ufffd\026\ufffd\032\ufffd\ufffd\ufffd\033\023");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???~\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001l" + "'", str3, "\001l");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "403" + "'", str7, "403");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("501619215992877544684325066512");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("110");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "662" + "'", str9, "662");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "204" + "'", str11, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001l" + "'", str15, "\001l");
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
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
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "567241296467044765662897075547" + "'", str11, "567241296467044765662897075547");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "197602646103199850226201962838" + "'", str13, "197602646103199850226201962838");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "43293894862688786270370122200" + "'", str15, "43293894862688786270370122200");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd'\027\ufffd\ufffd\ufffd " + "'", str17, "\000\ufffd'\027\ufffd\ufffd\ufffd ");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("7345347997");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffd\ufffd\013\004\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"D??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "662" + "'", str9, "662");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "602" + "'", str11, "602");
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "409191034470679615695290193613" + "'", str5, "409191034470679615695290193613");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffdk>\020t#" + "'", str7, "\007\ufffd\ufffd\ufffd\ufffdk>\020t#");
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("2155055185841074");
        java.lang.String str11 = rSA1.decrypt("474552");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035" + "'", str7, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "558" + "'", str9, "558");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0018" + "'", str11, "\0018");
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
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
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\026\ufffd\ufffd\ufffd\ufffd\ufffdy" + "'", str9, "\004\026\ufffd\ufffd\ufffd\ufffd\ufffdy");
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("13336787284781825535175267386");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "489" + "'", str9, "489");
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("208193977755069288740804886340");
        java.lang.String str13 = rSA1.decrypt("2877147294");
        java.lang.String str15 = rSA1.decrypt("556176107112066662549548393072");
        java.lang.String str17 = rSA1.encrypt("\ufffdq\007\ufffd\t7Z");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\u04ef\ufffd(>\024\u0493\003" + "'", str9, "\004\ufffd\u04ef\ufffd(>\024\u0493\003");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "241622428961015875553339745159" + "'", str11, "241622428961015875553339745159");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\ufffda\032\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\013\ufffda\032\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\nWlx\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\nWlx\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "280853348241617382838788253583" + "'", str17, "280853348241617382838788253583");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "953864985145314186229924853571" + "'", str19, "953864985145314186229924853571");
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "195" + "'", str7, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\037" + "'", str9, "\001\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001A" + "'", str11, "\001A");
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.decrypt("251293784");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\t\ufffd\005\ufffd\ufffd\ufffd\002e" + "'", str9, "\003\t\ufffd\005\ufffd\ufffd\ufffd\002e");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "364240360242152702529022588468" + "'", str11, "364240360242152702529022588468");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23675778166799516443588207544" + "'", str13, "23675778166799516443588207544");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\u0128\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd." + "'", str15, "\002\u0128\ufffd\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd.");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd*a9.P\b" + "'", str17, "\005\ufffd\ufffd\ufffd*a9.P\b");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u5573" + "'", str19, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u5573");
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.decrypt("641495569173411");
        java.lang.String str7 = rSA1.decrypt("44690606995474965646087032640");
        java.lang.String str9 = rSA1.encrypt("470608518065406383416365402465");
        java.lang.String str11 = rSA1.decrypt("1169922117698141");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001\ufffdc");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?pI?c\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd\ufffd" + "'", str7, "\007\ufffd\ufffd\ufffd\ufffd\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "278992041139892483656313819739" + "'", str9, "278992041139892483656313819739");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\177\032\ufffd\ufffd\ufffd\000\ufffd\"\ufffd" + "'", str11, "\007\ufffd\ufffd\177\032\ufffd\ufffd\ufffd\000\ufffd\"\ufffd");
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("233006726736920949521554542653");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\023\u8ac7\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "420016028562853220573404466078" + "'", str5, "420016028562853220573404466078");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "495997577270607365222110270699" + "'", str7, "495997577270607365222110270699");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd.\b\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd.\b\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "146677942311113693706017150032" + "'", str11, "146677942311113693706017150032");
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "22393427554506180331523658054" + "'", str11, "22393427554506180331523658054");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "334172702096570604226014863628" + "'", str13, "334172702096570604226014863628");
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2339878065" + "'", str13, "2339878065");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6024732956" + "'", str15, "6024732956");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("352232997633148504781500198579");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("42418796185018424088");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "658501897205345" + "'", str7, "658501897205345");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "576" + "'", str15, "576");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\f\ufffd\ufffd\ufffd\ufffd\u061d\ufffd\u06fe");
        java.lang.String str11 = rSA1.decrypt("304417796247364099549471429573");
        java.lang.String str13 = rSA1.decrypt("3555494157626530");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "25621168391916495485375501691" + "'", str7, "25621168391916495485375501691");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11286013750733671749159185828" + "'", str9, "11286013750733671749159185828");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd{\264\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd{\264\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\021\ufffd\ufffd41\022\177\ufffd" + "'", str13, "\ufffd\021\ufffd\ufffd41\022\177\ufffd");
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.encrypt("\b\ufffd{[K\350\026\027\ufffd\ufffd@");
        java.lang.String str15 = rSA1.decrypt("1028793282341587");
        java.lang.String str17 = rSA1.decrypt("342981671868457888627866774352");
        java.lang.String str19 = rSA1.encrypt("20256379923826066825919342649");
        java.lang.String str21 = rSA1.encrypt("336465254499630723626823198869");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd9\005\u0640\013$<" + "'", str9, "\003\ufffd\ufffd\ufffd9\005\u0640\013$<");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "179075983986087483151313648464" + "'", str11, "179075983986087483151313648464");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5753021229572181553843255052" + "'", str13, "5753021229572181553843255052");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\r\ufffd\004\ufffd\ufffd\026\ufffd" + "'", str15, "\001\r\ufffd\004\ufffd\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd,\025\ufffd+\026\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd,\025\ufffd+\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "432927412036855023716312408699" + "'", str19, "432927412036855023716312408699");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "42674468577098617965334121201" + "'", str21, "42674468577098617965334121201");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "419" + "'", str3, "419");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "13777856364972307697205563345" + "'", str7, "13777856364972307697205563345");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002K" + "'", str13, "\002K");
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        rSA1.generateKeys((int) 'a');
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6015231394233867929460950238" + "'", str5, "6015231394233867929460950238");
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
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
        java.lang.String str23 = rSA1.encrypt("516");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\033\ufffd\f\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\033\ufffd\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "328136107973779" + "'", str17, "328136107973779");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1233113998484536" + "'", str19, "1233113998484536");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1252316559374003" + "'", str21, "1252316559374003");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "713598180556928" + "'", str23, "713598180556928");
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36037192522772913876017210639" + "'", str7, "36037192522772913876017210639");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36037192522772913876017210639" + "'", str9, "36037192522772913876017210639");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffdJ5" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffdJ5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\025\b\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\025\b\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\u07dd\ufffd\ufffd\034\ufffd\033");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("5542174771");
        java.lang.String str19 = rSA1.decrypt("609630986");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "212608698789160502183642922873" + "'", str5, "212608698789160502183642922873");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\024\ufffd\ufffd\ufffd\002\ufffd\\\ufffd" + "'", str7, "\001\ufffd\024\ufffd\ufffd\ufffd\002\ufffd\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "340624686469936132947436944084" + "'", str9, "340624686469936132947436944084");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "804063104329852599614113168942" + "'", str11, "804063104329852599614113168942");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "637611605919931169228635129701" + "'", str13, "637611605919931169228635129701");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\013\ufffd" + "'", str17, "\b\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\003\ufffd" + "'", str19, "\ufffd\003\ufffd");
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffdDT" + "'", str11, "\006\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffdDT");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "715120637647722" + "'", str15, "715120637647722");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("27281717494758208926478163563");
        java.lang.String str13 = rSA1.decrypt("11496058661406079155888450723");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "521" + "'", str3, "521");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "289" + "'", str7, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001v" + "'", str11, "\001v");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\bj9\001");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("370");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77" + "'", str9, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "340" + "'", str13, "340");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "171" + "'", str17, "171");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("244491094832186423838238028174");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdE&" + "'", str13, "\ufffdE&");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("421538216752639241087728305427");
        java.lang.String str13 = rSA1.encrypt("4084101");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "168" + "'", str7, "168");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "47874892208870719280781732045" + "'", str11, "47874892208870719280781732045");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "85899428699059704905640866879" + "'", str13, "85899428699059704905640866879");
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u0721");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002" + "'", str5, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "115" + "'", str7, "115");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "130" + "'", str17, "130");
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.decrypt("108");
        java.lang.String str11 = rSA1.encrypt("289310232493402385225708534539");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "421" + "'", str11, "421");
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("16084856823955309419015643273");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "B" + "'", str5, "B");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "213" + "'", str7, "213");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "200" + "'", str11, "200");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "433" + "'", str13, "433");
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("485974862797680425669299086221");
        java.lang.String str11 = rSA1.encrypt("193");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385196326916171382302876750487" + "'", str7, "385196326916171382302876750487");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "241282500210764833176113243496" + "'", str9, "241282500210764833176113243496");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "333755794417522711529426045832" + "'", str11, "333755794417522711529426045832");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\003\035");
        java.lang.String str13 = rSA1.encrypt("1895529914177013");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd.\n" + "'", str7, "\000\ufffd\ufffd.\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1105599424" + "'", str9, "1105599424");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "506261573" + "'", str11, "506261573");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "76644600" + "'", str13, "76644600");
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("399507447654974285643717125254");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\016U\033\ufffd\ufffd\ufffd\ufffdk");
        java.lang.String str17 = rSA1.decrypt("301771435623330155704685670041");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\025\ufffd\ufffd\ufffd\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd=\023\ufffd\ufffdn\006\ufffd" + "'", str7, "\ufffd=\023\ufffd\ufffdn\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8921622422888854522441982737" + "'", str9, "8921622422888854522441982737");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "26074605518705761002767399401" + "'", str11, "26074605518705761002767399401");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10296638318130114199177854655" + "'", str13, "10296638318130114199177854655");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7527971045535875546659961587" + "'", str15, "7527971045535875546659961587");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\u0651\ufffd\ufffd-\003\t\ufffd" + "'", str17, "\001\u0651\ufffd\ufffd-\003\t\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7231946010096468320608453933" + "'", str19, "7231946010096468320608453933");
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.decrypt("438640715");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "448806671144114797037234085912" + "'", str11, "448806671144114797037234085912");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\022\ufffd\ufffd" + "'", str17, "\000\ufffd\022\ufffd\ufffd");
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
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
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd`" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd`");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1156935319598650" + "'", str17, "1156935319598650");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "701210173723595" + "'", str19, "701210173723595");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\001\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("208193977755069288740804886340");
        java.lang.String str13 = rSA1.encrypt("5897350289");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\u07adhB-HA\0269?" + "'", str9, "\005\ufffd\u07adhB-HA\0269?");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "243320281095264472138253216660" + "'", str11, "243320281095264472138253216660");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "530610574406179007738816471010" + "'", str13, "530610574406179007738816471010");
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("764080762608778560955290362258");
        java.lang.String str13 = rSA1.decrypt("1492432233");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "95" + "'", str3, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "194" + "'", str5, "194");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\u0520P" + "'", str11, "\006\ufffd\u0520P");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\u0656\ufffd\ufffd\n9" + "'", str13, "\002\u0656\ufffd\ufffd\n9");
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.lang.String str7 = rSA1.encrypt("\001.");
        java.lang.String str9 = rSA1.encrypt("2635132195937723");
        java.lang.String str11 = rSA1.decrypt("26768039787967638576013357987");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4619200812388252003871196901" + "'", str3, "4619200812388252003871196901");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "23892422987043881879936925855" + "'", str5, "23892422987043881879936925855");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "229112403180614528" + "'", str7, "229112403180614528");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "43474878970331171760521465691" + "'", str9, "43474878970331171760521465691");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\020\ufffd\033\ufffd\ufffd9" + "'", str11, "\ufffd\ufffd\020\ufffd\033\ufffd\ufffd9");
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("233760065650718630256974302201");
        java.lang.String str15 = rSA1.encrypt("657774902");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\036" + "'", str7, "\001\036");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "28" + "'", str13, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "187" + "'", str15, "187");
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("302478007679515165391351820133");
        java.lang.String str15 = rSA1.encrypt("21262565530067871612812451046");
        java.lang.String str17 = rSA1.decrypt("490");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "775306609005701830150160701259" + "'", str11, "775306609005701830150160701259");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "452292274313471705904343362025" + "'", str13, "452292274313471705904343362025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "233126484691296562861102617888" + "'", str15, "233126484691296562861102617888");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013\ufffd\ufffd\000\ufffd\034\027\ufffd\ufffd" + "'", str17, "\013\ufffd\ufffd\000\ufffd\034\027\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("2951232610");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\001\005\ufffd\f");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("283828185923712655441037297950");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "208" + "'", str7, "208");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "568" + "'", str9, "568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88" + "'", str13, "88");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4765487503" + "'", str17, "4765487503");
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2445186040379015");
        java.lang.String str13 = rSA1.encrypt("90875166998927");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\007\ufffd\ufffd\ufffd\ufffd\f\t<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2084268823" + "'", str11, "2084268823");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2828128083" + "'", str13, "2828128083");
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("336011552384423252582675852");
        java.lang.String str11 = rSA1.encrypt("47777950521712127746591213977");
        java.lang.String str13 = rSA1.decrypt("258265091322468553983668563257");
        java.lang.String str15 = rSA1.decrypt("191");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "288" + "'", str5, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "314" + "'", str7, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001W" + "'", str9, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "245" + "'", str11, "245");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001h" + "'", str13, "\001h");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001." + "'", str15, "\001.");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\ufffdV");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"gR?V\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd#\n\ufffd" + "'", str9, "\000\ufffd#\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2502523117" + "'", str11, "2502523117");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\023n\022#" + "'", str13, "\023n\022#");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2797632424" + "'", str15, "2797632424");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2651629139" + "'", str17, "2651629139");
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.decrypt("44874627577612233003");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffdD-z\037\ufffd");
        java.lang.String str19 = rSA1.encrypt("\002\ufffd\ufffd\036\ufffd\ufffd*\370\u07e3\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0013" + "'", str13, "\0013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "21394701226080141662956578791" + "'", str17, "21394701226080141662956578791");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12932101422011051204569274826" + "'", str19, "12932101422011051204569274826");
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.decrypt("11128077818278452663651906231");
        java.lang.String str17 = rSA1.encrypt("4765487503");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "351" + "'", str7, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "337" + "'", str13, "337");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001H" + "'", str15, "\001H");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "434" + "'", str17, "434");
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.encrypt("503320528894841210883234548866");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "157487699159295137779350871440" + "'", str9, "157487699159295137779350871440");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("155325805838506");
        java.lang.String str11 = rSA1.encrypt("947370313855704349365862998582");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7078807998497099290060456123" + "'", str7, "7078807998497099290060456123");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\022\n\ufffd\ufffd\ufffd\ufffd\u05ae" + "'", str9, "\022\n\ufffd\ufffd\ufffd\ufffd\u05ae");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29997689315577765810709208330" + "'", str11, "29997689315577765810709208330");
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("616");
        java.lang.String str13 = rSA1.encrypt("\001)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\0020O\030\007");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?0O??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd" + "'", str7, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44797199491853112088" + "'", str11, "44797199491853112088");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "26198073" + "'", str13, "26198073");
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("29358506122049777298420844854");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\004");
        java.lang.String str13 = rSA1.decrypt("233256986767027678444463879174");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "180" + "'", str11, "180");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("58");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.decrypt("6241420964");
        java.lang.String str15 = rSA1.decrypt("132382889831422523496195035353");
        java.lang.String str17 = rSA1.encrypt("3145466309");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1923886734571294" + "'", str7, "1923886734571294");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1395955703353561" + "'", str9, "1395955703353561");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffdOZ\035\ufffd\ufffd\037\ufffd\035\ufffd\030" + "'", str13, "\b\ufffd\ufffdOZ\035\ufffd\ufffd\037\ufffd\035\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\033\ufffd\ufffd\016\ufffd\032\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\033\ufffd\ufffd\016\ufffd\032\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "321327346416216762205494923451" + "'", str17, "321327346416216762205494923451");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("3541590856");
        rSA1.generateKeys(10);
        java.lang.String str9 = rSA1.encrypt("511433997501547127895019390426");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd%" + "'", str3, "\006\ufffd\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd%");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\036\ufffd\ufffdg\035\036\ufffd\ufffdF" + "'", str5, "\000\ufffd\ufffd\036\ufffd\ufffdg\035\036\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "17" + "'", str9, "17");
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("352232997633148504781500198579");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffd\u075d\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "54353838686283" + "'", str7, "54353838686283");
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("407");
        java.lang.String str15 = rSA1.decrypt("31275603190686706611516590621");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\033\ufffdk\007$\026\ufffd\ufffd" + "'", str7, "\033\ufffdk\007$\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u02fe\b\ufffd\ufffd\006-\177\u0121" + "'", str9, "\u02fe\b\ufffd\ufffd\006-\177\u0121");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40081182550045535744" + "'", str11, "40081182550045535744");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdU\026\ufffd\\\027\ufffd\ufffd\ufffd" + "'", str13, "\ufffdU\026\ufffd\\\027\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\u0114\ufffd\ufffd\ufffdH" + "'", str15, "\ufffd\u0114\ufffd\ufffd\ufffdH");
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.encrypt("17984728");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002" + "'", str7, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "545" + "'", str9, "545");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.decrypt("6307084357");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "458" + "'", str7, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7" + "'", str9, "7");
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "259307851531130029880344071219" + "'", str5, "259307851531130029880344071219");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "674035482044273029430942864215" + "'", str9, "674035482044273029430942864215");
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
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
        java.lang.String str21 = rSA1.encrypt("246645748134111282160220676453");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10790628298974828368163164472" + "'", str5, "10790628298974828368163164472");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "375219081326850966652987037614" + "'", str7, "375219081326850966652987037614");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd~5\036*\025UzO" + "'", str9, "\002\ufffd\ufffd~5\036*\025UzO");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "353620487538028912380283743444" + "'", str11, "353620487538028912380283743444");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "272760988969197246600175931852" + "'", str13, "272760988969197246600175931852");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "47349433198000944393813262620" + "'", str17, "47349433198000944393813262620");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "25935953832270666856380619640" + "'", str19, "25935953832270666856380619640");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "28296998441899854377639396596" + "'", str21, "28296998441899854377639396596");
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        java.lang.String str11 = rSA1.encrypt("\177\ufffd\ufffd5");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffd\ufffd\ufffd\ufffd\ufffdJ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "366650386202525652938074408540" + "'", str9, "366650386202525652938074408540");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "219013471694735776489510313206" + "'", str11, "219013471694735776489510313206");
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd\000");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\006\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "253" + "'", str5, "253");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "387" + "'", str7, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "412640918016273" + "'", str11, "412640918016273");
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("40208053863613346450978315343");
        java.lang.String str9 = rSA1.decrypt("9076220414");
        java.lang.String str11 = rSA1.encrypt("1286422617657626");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "324433091117288565795217530642" + "'", str3, "324433091117288565795217530642");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\024\ufffd\ufffd\b\u0121\ufffd6" + "'", str5, "\000\ufffd\024\ufffd\ufffd\b\u0121\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "59699500271284615328154429929" + "'", str7, "59699500271284615328154429929");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\034\ufffd\ufffdC\026\ufffd" + "'", str9, "\007\ufffd\034\ufffd\ufffdC\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "436432895576345578107252111058" + "'", str11, "436432895576345578107252111058");
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\030\\\ufffdM");
        java.lang.String str7 = rSA1.decrypt("39227321947341666623299176560");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\021" + "'", str3, "\021");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "64" + "'", str5, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001:" + "'", str7, "\001:");
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
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
        java.lang.String str23 = rSA1.encrypt("674808022");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\034c\004\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\034c\004\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30371328" + "'", str15, "30371328");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3138428376721" + "'", str17, "3138428376721");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\022\ufffd\u04ca\ufffd}" + "'", str19, "\003\ufffd\ufffd\ufffd\022\ufffd\u04ca\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "456" + "'", str23, "456");
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd-\320\031\ufffd\016\030");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0102\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str23 = rSA1.decrypt("226064857381486869587443300980");
        java.lang.String str25 = rSA1.encrypt("7\024\023\002\ufffd\ufffd\ufffd\ufffdC\030\ufffdt");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\025\ufffds\002\031");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???$\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u052a\u0346\ufffd\ufffd\\" + "'", str9, "\u052a\u0346\ufffd\ufffd\\");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "581671663023117037398287615698" + "'", str15, "581671663023117037398287615698");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "405479792210025414040475698679" + "'", str17, "405479792210025414040475698679");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "614364898777205055062561042503" + "'", str19, "614364898777205055062561042503");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\021\ufffd3\036\ufffd\ufffd\ufffd4" + "'", str23, "\004\ufffd\021\ufffd3\036\ufffd\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "293447080092684325077706742679" + "'", str25, "293447080092684325077706742679");
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "88884529550767859144510786172" + "'", str5, "88884529550767859144510786172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1208902895495334527" + "'", str7, "1208902895495334527");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\024\ufffd\ufffd\u04da\u0354\ufffd\ufffd\ufffd" + "'", str9, "\003\024\ufffd\ufffd\u04da\u0354\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("128237144859227944036252260591");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\u03c7\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"1??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "304451343362070367538355885506" + "'", str7, "304451343362070367538355885506");
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd| ");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\017\ufffd\ufffd" + "'", str7, "\000\ufffd\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3125" + "'", str9, "3125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3077056399" + "'", str11, "3077056399");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "284767954198087857054922959306" + "'", str17, "284767954198087857054922959306");
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.encrypt("626302468");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "516947693094762068064705912071" + "'", str5, "516947693094762068064705912071");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\003\ufffd\ufffd+\025\ufffd" + "'", str7, "\007\ufffd\ufffd\003\ufffd\ufffd+\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52521875" + "'", str9, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "21109841544978805585099581552" + "'", str11, "21109841544978805585099581552");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "243571194471973438804567072806" + "'", str7, "243571194471973438804567072806");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "243571194471973438804567072806" + "'", str9, "243571194471973438804567072806");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "201144137735673817568614331687" + "'", str11, "201144137735673817568614331687");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdJ" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdJ");
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("1492432233");
        java.lang.String str19 = rSA1.encrypt("118");
        java.lang.String str21 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "357" + "'", str7, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415" + "'", str9, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "304" + "'", str13, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "256397486335315406719667835172" + "'", str17, "256397486335315406719667835172");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "410019991231459078893846270325" + "'", str19, "410019991231459078893846270325");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdg\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\ufffdg\006\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\0018");
        java.lang.String str17 = rSA1.encrypt("91");
        java.lang.String str19 = rSA1.decrypt("996519616859002414184940772874");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\"\r\ufffd\ufffd6a\t\ufffdL" + "'", str9, "\003\ufffd\ufffd\"\r\ufffd\ufffd6a\t\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30371328" + "'", str15, "30371328");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3138428376721" + "'", str17, "3138428376721");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\b\ufffd\u0757\ufffd\u06b1\ufffd\ufffd\002\ufffd" + "'", str19, "\b\ufffd\u0757\ufffd\u06b1\ufffd\ufffd\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("911315954");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "892206784" + "'", str11, "892206784");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1575250478" + "'", str13, "1575250478");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "550350182" + "'", str15, "550350182");
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\u2804t\021\013");
        java.lang.String str15 = rSA1.encrypt("703");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001K" + "'", str9, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "187" + "'", str11, "187");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "296" + "'", str13, "296");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "177" + "'", str15, "177");
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("2239671374");
        java.lang.String str9 = rSA1.encrypt("\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffdt}\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\004\ufffdt}\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n\ufffd\ufffd" + "'", str7, "\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3435463127413538" + "'", str9, "3435463127413538");
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("531");
        java.lang.String str7 = rSA1.encrypt("\002W");
        java.lang.String str9 = rSA1.encrypt("314432");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("57022474381017927500879345278");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "476" + "'", str5, "476");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "421" + "'", str7, "421");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "492" + "'", str9, "492");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "%" + "'", str13, "%");
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        java.lang.String str11 = rSA1.decrypt("40059718235344279847714872762");
        java.lang.String str13 = rSA1.decrypt("614");
        java.lang.String str15 = rSA1.encrypt("381018392633645705650223906599");
        java.lang.String str17 = rSA1.encrypt("\001\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001m" + "'", str3, "\001m");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "215" + "'", str5, "215");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "12" + "'", str7, "12");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\003" + "'", str13, "\002\003");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "250" + "'", str15, "250");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "378" + "'", str17, "378");
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("233006726736920949521554542653");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "297892464843432168850605017950" + "'", str5, "297892464843432168850605017950");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "146902749470479386454662980137" + "'", str7, "146902749470479386454662980137");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003%\t\ufffd\ufffd\026\t\ufffd{t\bj" + "'", str9, "\003%\t\ufffd\ufffd\026\t\ufffd{t\bj");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "522983085975516545014088897058" + "'", str11, "522983085975516545014088897058");
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("188");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str21 = rSA1.decrypt("48954002458377242854906772120");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\tc\021\u0756\ufffd\f\ufffd\ufffd\ufffd" + "'", str7, "\tc\021\u0756\ufffd\f\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "140956848006970196372732037476" + "'", str11, "140956848006970196372732037476");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\021" + "'", str21, "\ufffd\ufffd\021");
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("317201802686979902757");
        java.lang.String str11 = rSA1.decrypt("427");
        java.lang.String str13 = rSA1.encrypt("334584945244912143283576554504");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffdsV\005\ufffd\002\ufffdk" + "'", str9, "\004\ufffd\ufffd\ufffd\ufffdsV\005\ufffd\002\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\"B\033\034\ufffd\ufffdDR\005\ufffd" + "'", str11, "\005\"B\033\034\ufffd\ufffdDR\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6550868451639400020159661467" + "'", str13, "6550868451639400020159661467");
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("409247107494479");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.encrypt("|JH%w\016\t\ufffd\ufffd\001\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("\n\020NMa\032\ufffd\ufffd\ufffdI");
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\023\ufffd^\b]");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<" + "'", str7, "<");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd(p\023\ufffd\ufffdv" + "'", str11, "\b\ufffd\ufffd(p\023\ufffd\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "261289730369303392630010107359" + "'", str15, "261289730369303392630010107359");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "272850189977288359382396187861" + "'", str17, "272850189977288359382396187861");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "285615177664325672696317446701" + "'", str19, "285615177664325672696317446701");
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("131222746997146929506994054470");
        java.lang.String str9 = rSA1.encrypt("3996992257");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "s" + "'", str7, "s");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "511" + "'", str9, "511");
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd[3Z\000\u05ed");
        rSA1.generateKeys((int) '#');
        java.lang.String str17 = rSA1.encrypt("\f\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\177");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\007\ufffd\u03b0\ufffd]" + "'", str7, "\003\ufffd\007\ufffd\u03b0\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "674589993819081348249" + "'", str11, "674589993819081348249");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "727637968175382540378638426494" + "'", str13, "727637968175382540378638426494");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7053573268" + "'", str17, "7053573268");
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
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
        java.lang.String str29 = rSA1.encrypt("190");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\u01c3\ufffd\ufffdI" + "'", str13, "\ufffd\ufffd\u01c3\ufffd\ufffdI");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd,\000\ufffd\ufffdC" + "'", str17, "\004\ufffd,\000\ufffd\ufffdC");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1884888065115489" + "'", str19, "1884888065115489");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1166171107282951" + "'", str21, "1166171107282951");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2236102469501718" + "'", str23, "2236102469501718");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2451965723091823" + "'", str27, "2451965723091823");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2256659483922849" + "'", str29, "2256659483922849");
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000" + "'", str3, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\002" + "'", str5, "\001\002");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "604" + "'", str7, "604");
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
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
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\u0116\ufffd\u041b;m" + "'", str13, "\ufffd\ufffd\u0116\ufffd\u041b;m");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\037\ufffd5g" + "'", str17, "\001\037\ufffd5g");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\003\ufffd" + "'", str19, "\001\ufffd\ufffd\003\ufffd");
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        java.lang.String str7 = rSA1.encrypt("\005\u04ac\ufffd\u04df\ufffd\ufffd\u067c<5");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\005\023\u8ac7\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("89822155645869026893556033840");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "295532353949249155639336087943" + "'", str5, "295532353949249155639336087943");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "237163494681899001281546983818" + "'", str7, "237163494681899001281546983818");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1690360543" + "'", str11, "1690360543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "239336968" + "'", str13, "239336968");
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("393");
        java.lang.String str5 = rSA1.encrypt(";n\025\ufffd");
        java.lang.String str7 = rSA1.decrypt("336465254499630723626823198869");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffdH\r\ufffd\ufffd\ufffd\ufffd\020\u01c5" + "'", str3, "\000\ufffdH\r\ufffd\ufffd\ufffd\ufffd\020\u01c5");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "330202910578306395442625077255" + "'", str5, "330202910578306395442625077255");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\033\ufffd\r\ufffdl!\031" + "'", str7, "\002\ufffd\033\ufffd\r\ufffdl!\031");
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("394");
        java.lang.String str13 = rSA1.encrypt("*\"\ufffd");
        java.lang.String str15 = rSA1.decrypt("138387139807390396644881019262");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\021\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\021\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\u063c\ufffd\ufffdE\033\013\ufffd" + "'", str11, "\002\ufffd\u063c\ufffd\ufffdE\033\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "199237611761802542377039816242" + "'", str13, "199237611761802542377039816242");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\t\f" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\t\f");
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("625554684732559581014312991005");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\u050d\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd0\f");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\u05fdC1" + "'", str7, "\001\u05fdC1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\030" + "'", str13, "\ufffd\ufffd\030");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "570466681784425639787968843561" + "'", str17, "570466681784425639787968843561");
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("217553495639783048879663754486");
        java.lang.String str11 = rSA1.encrypt("5393925662028418268861275810");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\u0278\ufffd\ufffdn\031");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\f\177\ufffdWp\030[\005\ufffd" + "'", str3, "\004\ufffd\ufffd\f\177\ufffdWp\030[\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1013694683258434" + "'", str7, "1013694683258434");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "728380086580981" + "'", str9, "728380086580981");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1289371694028701" + "'", str11, "1289371694028701");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1609527900085388" + "'", str13, "1609527900085388");
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        java.lang.String str7 = rSA1.decrypt("5164814492198769846277396329");
        java.lang.String str9 = rSA1.encrypt("\b\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "903767638" + "'", str5, "903767638");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd#" + "'", str7, "\ufffd\ufffd#");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "585538760" + "'", str9, "585538760");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1614652464" + "'", str11, "1614652464");
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("3476022725615491");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\u03a5\ufffd\ufffd\ufffd)q");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "453774066788563660982748675303" + "'", str3, "453774066788563660982748675303");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u0737\ufffd8" + "'", str5, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u0737\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "254594137961246020456339940822" + "'", str7, "254594137961246020456339940822");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "621645541357499153680909935414" + "'", str9, "621645541357499153680909935414");
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("460");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "659286235224432624228895285898" + "'", str5, "659286235224432624228895285898");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n\ufffd\002\ufffd\ufffd\ufffd\ufffd!" + "'", str7, "\n\ufffd\002\ufffd\ufffd\ufffd\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9" + "'", str15, "9");
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("461");
        java.lang.String str17 = rSA1.encrypt("208642166923338001575549632629");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\177" + "'", str15, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "299" + "'", str17, "299");
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("91");
        java.lang.String str15 = rSA1.decrypt("18978112990239");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.decrypt("28495513466458636502174013530");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "}\035\ufffd" + "'", str7, "}\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\005\ufffd1" + "'", str9, "\001\005\ufffd1");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "672749994932560009201" + "'", str13, "672749994932560009201");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\005\000\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\005\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd" + "'", str19, "\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
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
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "351" + "'", str7, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "430" + "'", str13, "430");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "153" + "'", str17, "153");
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("650");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("37823627598864236536472770066");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98" + "'", str3, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001=" + "'", str5, "\001=");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001f" + "'", str7, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "194" + "'", str11, "194");
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("791944786");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\016" + "'", str11, "\016");
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("806");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "370" + "'", str11, "370");
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "210" + "'", str9, "210");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "432" + "'", str13, "432");
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("3334789382");
        java.lang.String str17 = rSA1.decrypt("125569370317531718219858472586");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001g" + "'", str7, "\001g");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "224" + "'", str9, "224");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "18817329856551713353631094781" + "'", str13, "18817329856551713353631094781");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "11767472533367189837529915323" + "'", str15, "11767472533367189837529915323");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\013\ufffd\ufffd\ufffd\ufffdXn\177;" + "'", str17, "\ufffd\013\ufffd\ufffd\ufffd\ufffdXn\177;");
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2155055185841074");
        java.lang.String str13 = rSA1.decrypt("646");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1768861613" + "'", str11, "1768861613");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\0233\004" + "'", str13, "\000\ufffd\0233\004");
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("|JH%w\016\t\ufffd\ufffd\001\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("48159020044353377656022340487");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\022\ufffd\u04ca\ufffd}");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdE[" + "'", str7, "\ufffdE[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7903684796" + "'", str9, "7903684796");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4959665279" + "'", str15, "4959665279");
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("685");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "744595714717178454848062913053" + "'", str5, "744595714717178454848062913053");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "704007056979850373249768767753" + "'", str9, "704007056979850373249768767753");
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("768443727");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001." + "'", str7, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "95" + "'", str9, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "498" + "'", str13, "498");
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("1611067079503803");
        java.lang.String str17 = rSA1.encrypt("\006\ufffd\ufffd-\320\031\ufffd\016\030");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0102\ufffd");
        rSA1.generateKeys(100);
        java.lang.String str23 = rSA1.decrypt("226064857381486869587443300980");
        java.lang.String str25 = rSA1.encrypt("7\024\023\002\ufffd\ufffd\ufffd\ufffdC\030\ufffdt");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "160228491113601969184909576503" + "'", str15, "160228491113601969184909576503");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5809067200267128791867655142" + "'", str17, "5809067200267128791867655142");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "134005504909373359247657725248" + "'", str19, "134005504909373359247657725248");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffdw\016\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd2" + "'", str23, "\006\ufffdw\016\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "578166460497369830186863958075" + "'", str25, "578166460497369830186863958075");
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd7$:\t\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd4s" + "'", str7, "\001\ufffd\ufffd4s");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "255" + "'", str11, "255");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("4");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\001\026\ufffd\ufffd\ufffd\ufffd\u0233\ufffd\ufffd*");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "161" + "'", str9, "161");
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("17399606650451632470785729796");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "251" + "'", str7, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        java.lang.String str11 = rSA1.encrypt("3133319017839987");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "135" + "'", str5, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "252" + "'", str11, "252");
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("7345347997");
        java.lang.String str13 = rSA1.encrypt("1506896065904167");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "374" + "'", str9, "374");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "261" + "'", str11, "261");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "404" + "'", str13, "404");
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.encrypt("5");
        java.lang.String str9 = rSA1.encrypt("q:Y2");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "317" + "'", str3, "317");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20" + "'", str7, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "439" + "'", str9, "439");
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("\001\031");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("19710080159351497799007175728");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2727392649" + "'", str13, "2727392649");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "77469351" + "'", str17, "77469351");
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.decrypt("1");
        java.lang.String str13 = rSA1.encrypt("24532836005837375321238621134");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\035[\016\ufffd\002\ufffd\ufffd\ufffd" + "'", str7, "\003\035[\016\ufffd\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42875" + "'", str9, "42875");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001" + "'", str11, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "327243268118238043427290194208" + "'", str13, "327243268118238043427290194208");
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
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
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\u0797\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\u0797\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50004784369000759949" + "'", str15, "50004784369000759949");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\ufffd\023\013\027\ufffd\u036b\ufffd\023\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"D?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "294" + "'", str13, "294");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "391" + "'", str15, "391");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "282" + "'", str17, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\r" + "'", str19, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "556453638277699019065467673341" + "'", str23, "556453638277699019065467673341");
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
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
        java.lang.String str21 = rSA1.encrypt("5824490359974973208230734176");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\u045f\ufffd\177/" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\u045f\ufffd\177/");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "334619555030436" + "'", str17, "334619555030436");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1779080098808602" + "'", str19, "1779080098808602");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "529716576098467" + "'", str21, "529716576098467");
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
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
        java.lang.String str23 = rSA1.encrypt("6");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Q7\004\ufffd\u067d\ufffd\ufffd\ufffd\ufffd\ufffdF" + "'", str13, "Q7\004\ufffd\u067d\ufffd\ufffd\ufffd\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1151532908766161" + "'", str17, "1151532908766161");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "579881528085523" + "'", str19, "579881528085523");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "157464" + "'", str23, "157464");
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
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
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6270703141" + "'", str13, "6270703141");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7082465357" + "'", str15, "7082465357");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1109409736" + "'", str17, "1109409736");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4436137684" + "'", str19, "4436137684");
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("489");
        java.lang.String str13 = rSA1.encrypt("\031\ufffd\ufffd\ufffd\007\ufffd\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "355" + "'", str7, "355");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "669" + "'", str11, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "65" + "'", str13, "65");
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("25710884063451404379123576388");
        java.lang.String str15 = rSA1.decrypt("713285178266359597156629568229");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\002\ufffd\ufffd\036\ufffd\ufffd3");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "565548837782075788629966113815" + "'", str7, "565548837782075788629966113815");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "19182176942358519441013563519" + "'", str13, "19182176942358519441013563519");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ucfa1\ud2c7\ufffd\ufffd\021\ufffd" + "'", str15, "\007\ucfa1\ud2c7\ufffd\ufffd\021\ufffd");
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("25589616082632032517938786561");
        java.lang.String str13 = rSA1.decrypt("2934672804");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6\025\\" + "'", str9, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd6\025\\");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "400805857371564968032013727800" + "'", str11, "400805857371564968032013727800");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\006\ufffd");
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("1374382698");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42677885391992991085247373923" + "'", str7, "42677885391992991085247373923");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "98" + "'", str11, "98");
    }
}
