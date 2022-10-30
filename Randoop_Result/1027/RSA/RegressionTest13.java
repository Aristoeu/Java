package RSA;

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
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass30 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "157138397918294799342293074804" + "'", str9, "157138397918294799342293074804");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "157138397918294799342293074804" + "'", str11, "157138397918294799342293074804");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\022l\177\ufffd14x" + "'", str13, "\002\ufffd\ufffd\ufffd\022l\177\ufffd14x");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "76574627646191303617911256290" + "'", str15, "76574627646191303617911256290");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\ufffd\ufffd\024\ufffd\u03b9\ufffd" + "'", str21, "\004\ufffd\ufffd\ufffd\024\ufffd\u03b9\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u03ce" + "'", str23, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\u03ce");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "181" + "'", str27, "181");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.decrypt("6756588560");
        java.lang.String str13 = rSA1.encrypt("^\005\ufffd\ufffd\\\ufffd\017\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3640545990" + "'", str3, "3640545990");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "13694762681" + "'", str7, "13694762681");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd)g" + "'", str9, "\002\ufffd)g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6147426108" + "'", str13, "6147426108");
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("451");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "426" + "'", str13, "426");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "171" + "'", str15, "171");
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("965471357883334");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?2?o?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "148820636485133" + "'", str13, "148820636485133");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2521604396918843" + "'", str15, "2521604396918843");
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("10496963571");
        java.lang.String str13 = rSA1.encrypt("106196728087020674353374184536");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "370" + "'", str3, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\u03e7\ufffd" + "'", str9, "\000\ufffd\u03e7\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6666244714" + "'", str11, "6666244714");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3735912056" + "'", str13, "3735912056");
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
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
        java.lang.String str23 = rSA1.encrypt("3123665183");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "313508129916507" + "'", str11, "313508129916507");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1642047223520423" + "'", str13, "1642047223520423");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "987170263879872" + "'", str15, "987170263879872");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "659695118797014019955797143161" + "'", str19, "659695118797014019955797143161");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\013\ufffd\002[?\027\ufffd\u06ee" + "'", str21, "\013\ufffd\002[?\027\ufffd\u06ee");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "765937599626235843385861001208" + "'", str23, "765937599626235843385861001208");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.String str13 = rSA1.decrypt("1030676276581334");
        java.lang.String str15 = rSA1.decrypt("325926960661284150045316145071");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?q?~\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "165154869132331786122067510138" + "'", str11, "165154869132331786122067510138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\006\t\033\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\006\t\033\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("1565011048071623");
        java.lang.String str11 = rSA1.encrypt("473642297");
        java.lang.String str13 = rSA1.decrypt("66011755970030761385223442767");
        java.lang.String str15 = rSA1.encrypt("\003\007\ufffd\017\ufffd\u0236\ufffd\ufffdC\007");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "202" + "'", str5, "202");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\u43bc\u3206ZapG" + "'", str9, "\002\ufffd\u43bc\u3206ZapG");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292748726451434953811374163884" + "'", str11, "292748726451434953811374163884");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\023\ufffd\ufffd\033\ufffd,\"\ufffd\007\031" + "'", str13, "\003\023\ufffd\ufffd\033\ufffd,\"\ufffd\007\031");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "218540058212611524165012897749" + "'", str15, "218540058212611524165012897749");
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2411996795" + "'", str3, "2411996795");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "442056252" + "'", str5, "442056252");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6007878565" + "'", str7, "6007878565");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffdc" + "'", str9, "\001\ufffd\ufffdc");
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("321842069114441562362352839359");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\004\013\ufffd\ufffdQ^\001\ufffd,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??NV\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
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
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "585339934937420811511549297873" + "'", str11, "585339934937420811511549297873");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "404773948071354952137777998778" + "'", str13, "404773948071354952137777998778");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "794647401497918529966145210987" + "'", str15, "794647401497918529966145210987");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffdA{q\036\ufffdrVd" + "'", str17, "\006\ufffd\ufffdA{q\036\ufffdrVd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "504404138687327698093202062168" + "'", str19, "504404138687327698093202062168");
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "83918160710132425130070322730" + "'", str9, "83918160710132425130070322730");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "83918160710132425130070322730" + "'", str11, "83918160710132425130070322730");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffdh\035\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffdb\036" + "'", str13, "\004\ufffdh\035\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffdb\036");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "49843551538689734464785923367" + "'", str15, "49843551538689734464785923367");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\231\ufffd\ufffdzL1" + "'", str17, "\003\ufffd\231\ufffd\ufffdzL1");
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.decrypt("170142287906490331954515313942");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "a>\007\000" + "'", str5, "a>\007\000");
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4657136676" + "'", str3, "4657136676");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "675045150" + "'", str7, "675045150");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4561713601" + "'", str9, "4561713601");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1216989650" + "'", str11, "1216989650");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        java.lang.String str17 = rSA1.decrypt("120");
        java.lang.String str19 = rSA1.decrypt("172702154013448640780877889078");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306647103921987" + "'", str7, "306647103921987");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "48161287997954" + "'", str13, "48161287997954");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\032\ufffd\ufffd\ufffds" + "'", str15, "\004\032\ufffd\ufffd\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\026\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffd\026\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\b\u0755\ufffd\ufffd\034" + "'", str19, "\b\u0755\ufffd\ufffd\034");
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\004\ufffd\ufffd\u07d8");
        java.lang.String str13 = rSA1.encrypt("1785750893713219");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "199" + "'", str9, "199");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6" + "'", str11, "6");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "309" + "'", str13, "309");
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffdK" + "'", str5, "\000\ufffd\ufffdK");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffdvV'\f\ufffd\ufffd\t\020\016\024\ufffd" + "'", str9, "\001\ufffdvV'\f\ufffd\ufffd\t\020\016\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "203683399559367837337416439881" + "'", str11, "203683399559367837337416439881");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "188977799285459774536310253649" + "'", str13, "188977799285459774536310253649");
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("125");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "596118469915874517428558652112" + "'", str9, "596118469915874517428558652112");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "596118469915874517428558652112" + "'", str11, "596118469915874517428558652112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\ufffd^\032\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\n\ufffd\ufffd\ufffd^\032\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "519495686180434" + "'", str7, "519495686180434");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4531866395" + "'", str13, "4531866395");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5576856552" + "'", str15, "5576856552");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffdc" + "'", str17, "\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\001\ufffd\ufffd\ufffd" + "'", str19, "\002\001\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1021189439582918" + "'", str7, "1021189439582918");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\006\037\ufffdA-" + "'", str13, "\001\ufffd\006\037\ufffdA-");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\"\ufffdz" + "'", str15, "\007\ufffd\ufffd\"\ufffdz");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1243407871910495" + "'", str17, "1243407871910495");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1202767346873700" + "'", str19, "1202767346873700");
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("907138002405795583308521934224");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "6913971128" + "'", str3, "6913971128");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str5, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("1629935995");
        java.lang.String str15 = rSA1.decrypt("407683185574927795669797986606");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "381242542851645868032969877600" + "'", str9, "381242542851645868032969877600");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001%}\b\ufffd\u0468\ufffd" + "'", str11, "\001%}\b\ufffd\u0468\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd[\016\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd[\016\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.String str13 = rSA1.encrypt("702947451550003778719770877111");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\006\ufffd@\006\ufffd\"\005\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??@?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1479445847217104" + "'", str7, "1479445847217104");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd/" + "'", str9, "\001\ufffd\ufffd\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\013\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1590714517680401" + "'", str13, "1590714517680401");
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "27863867636169886839609864" + "'", str9, "27863867636169886839609864");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "355571339972073726025491261914" + "'", str11, "355571339972073726025491261914");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "261709697103689407865284806805" + "'", str13, "261709697103689407865284806805");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd/\005\ufffd\u67db\021\ufffdrG" + "'", str15, "\004\ufffd/\005\ufffd\u67db\021\ufffdrG");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\u01a2\021g\006" + "'", str19, "\000\ufffd\ufffd\u01a2\021g\006");
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.lang.String str17 = rSA1.decrypt("144571364606302");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1370292422537796" + "'", str7, "1370292422537796");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238" + "'", str11, "238");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd;" + "'", str15, "\001\ufffd\ufffd;");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd" + "'", str17, "\ufffd\ufffd");
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\t\ufffd\034\ufffd\ufffd" + "'", str3, "\t\ufffd\034\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3037613445673246" + "'", str5, "3037613445673246");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1863129945540741" + "'", str7, "1863129945540741");
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
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
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100063127730971620864508376784" + "'", str9, "100063127730971620864508376784");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100063127730971620864508376784" + "'", str11, "100063127730971620864508376784");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005" + "'", str13, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "254375656525460547007522976477" + "'", str15, "254375656525460547007522976477");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "20" + "'", str23, "20");
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("86");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\ufffd\ufffd\ufffd>l-s");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffdH,\034\ufffd\017\ufffd\ufffd\ufffd" + "'", str7, "\005\ufffdH,\034\ufffd\017\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("\006\n\ufffd\u05b8\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("6527214585");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "385" + "'", str11, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3" + "'", str15, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "46" + "'", str19, "46");
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("2138559621");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1124864700" + "'", str5, "1124864700");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1990338712" + "'", str7, "1990338712");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2072750445" + "'", str9, "2072750445");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\037" + "'", str11, "\ufffd\037");
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4652921017648119919645856931" + "'", str13, "4652921017648119919645856931");
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("192569224470580183531005309777");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\f" + "'", str9, "\f");
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("1882619584226286");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "497745372270017328565265098248" + "'", str9, "497745372270017328565265098248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\002\ufffd\ufffd\ufffd\000\ufffd\ufffd" + "'", str11, "\003\ufffd\ufffd\ufffd\002\ufffd\ufffd\ufffd\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "650293305417592041638967683465" + "'", str15, "650293305417592041638967683465");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        java.lang.String str9 = rSA1.encrypt("491597882470490509387393294253");
        java.lang.String str11 = rSA1.decrypt("801");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("611820819499251777959422481763");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003 \025\ufffd\ufffd\ufffd\ufffd\ufffdzG\035" + "'", str3, "\003 \025\ufffd\ufffd\ufffd\ufffd\ufffdzG\035");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "623497178195821318977625915595" + "'", str5, "623497178195821318977625915595");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\003V\002\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\003V\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "239588783673877084394380367794" + "'", str9, "239588783673877084394380367794");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\u05f3\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\u05f3\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "41372416" + "'", str15, "41372416");
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2110122571" + "'", str5, "2110122571");
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("15573850693655");
        java.lang.String str15 = rSA1.decrypt("880555645873017");
        java.lang.String str17 = rSA1.decrypt("579729540784232");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "206" + "'", str7, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffdgZ" + "'", str11, "\001\ufffd\ufffdgZ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2069046455449321" + "'", str13, "2069046455449321");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\u024c\ufffd\ufffd#" + "'", str15, "\002\u024c\ufffd\ufffd#");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\033\ufffd\ufffd" + "'", str17, "\007\033\ufffd\ufffd");
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.encrypt("6318253741");
        java.lang.String str19 = rSA1.encrypt("\004\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\000\ufffd\ufffd\ufffdj");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????j\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "729603438645826" + "'", str7, "729603438645826");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "706932054212760" + "'", str13, "706932054212760");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1328783064929932" + "'", str15, "1328783064929932");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2074755484183148" + "'", str17, "2074755484183148");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "852560844686789" + "'", str19, "852560844686789");
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("548110071361613660316881187141");
        java.lang.String str17 = rSA1.encrypt("490");
        java.lang.String str19 = rSA1.encrypt("802171763472868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "297077176620173300952745828736" + "'", str9, "297077176620173300952745828736");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "426905927000960237568" + "'", str11, "426905927000960237568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdzS|" + "'", str13, "\006\027\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdzS|");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "627944726316331446311553511166" + "'", str15, "627944726316331446311553511166");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "674182060575399175472113151577" + "'", str17, "674182060575399175472113151577");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "162649158779654829378301167080" + "'", str19, "162649158779654829378301167080");
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        java.lang.String str17 = rSA1.decrypt("316973227613881101828002122645");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "265" + "'", str15, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
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
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "411674735030478553693377674059" + "'", str9, "411674735030478553693377674059");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd]T.0\005\ufffd\r(" + "'", str11, "\001\ufffd\ufffd]T.0\005\ufffd\r(");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\u01f5\\\ufffd\032\u02f7\ufffd\ufffd" + "'", str13, "\b\u01f5\\\ufffd\032\u02f7\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\u07c5\ufffd\ufffd" + "'", str3, "\002\u07c5\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "672362236627704" + "'", str5, "672362236627704");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1476397129494959" + "'", str7, "1476397129494959");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
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
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\000\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??$|?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "393590994630895867113294120925" + "'", str9, "393590994630895867113294120925");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\016\ufffd\ufffd\000\ufffd%\005\ufffd" + "'", str11, "\ufffd\ufffd\016\ufffd\ufffd\000\ufffd%\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\037\u04d0\027\035\ufffd\ufffd\ufffdU\021" + "'", str13, "\002\ufffd\037\u04d0\027\035\ufffd\ufffd\ufffdU\021");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd'" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40552988825859222890842343751" + "'", str19, "40552988825859222890842343751");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "401783134643486050822935542032" + "'", str23, "401783134643486050822935542032");
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.encrypt("\004\035\ufffd\ufffd\032\ufffd\ufffd%';");
        java.lang.String str17 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\005");
        java.lang.String str19 = rSA1.decrypt("10590563594");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1374127497452570" + "'", str7, "1374127497452570");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "118" + "'", str11, "118");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "243" + "'", str13, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8" + "'", str15, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "258" + "'", str17, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004" + "'", str19, "\004");
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
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
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "369" + "'", str13, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "761" + "'", str15, "761");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "772" + "'", str17, "772");
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd4" + "'", str13, "\002\ufffd\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2346733963604473" + "'", str15, "2346733963604473");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "c}}\023\ufffd\ufffd\ufffd\ufffd" + "'", str19, "c}}\023\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "33900623580795826240078518793" + "'", str21, "33900623580795826240078518793");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\023\ufffd\ufffd\t\ufffd\035\ufffd\020\033\ufffd" + "'", str23, "\023\ufffd\ufffd\t\ufffd\035\ufffd\020\033\ufffd");
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        java.lang.String str15 = rSA1.encrypt("5613811618");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "431" + "'", str9, "431");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "644" + "'", str15, "644");
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
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
        java.lang.String str21 = rSA1.encrypt("319862624706953877403554557125");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffdS\n\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffdS\n\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "107453155764366" + "'", str15, "107453155764366");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1237362947877723" + "'", str17, "1237362947877723");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10574573602024011714088989591" + "'", str21, "10574573602024011714088989591");
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("132522483985687636017302287217");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002i" + "'", str7, "\002i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "O" + "'", str9, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001t" + "'", str11, "\001t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001;" + "'", str15, "\001;");
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.encrypt("1140138270580326");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1628934620430304" + "'", str3, "1628934620430304");
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.decrypt("787439318926031104812953602702");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "522152464782748911101867696169" + "'", str9, "522152464782748911101867696169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd3\021\ufffd\ufffd\ufffd" + "'", str11, "\ufffd3\021\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\036\ufffd\ufffdR*|\246\ufffd" + "'", str13, "\001\ufffd\036\ufffd\ufffdR*|\246\ufffd");
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("333538977866196043865277785098");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str9 = rSA1.encrypt("971673362384997");
        java.lang.String str11 = rSA1.encrypt("366159298107333549312946903145");
        java.lang.String str13 = rSA1.decrypt("354629327585307134836652692329");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002w" + "'", str5, "\002w");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "282" + "'", str9, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29" + "'", str11, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
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
        java.lang.String str27 = rSA1.decrypt("1211351982");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "179805878703579024545324914571" + "'", str9, "179805878703579024545324914571");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "179805878703579024545324914571" + "'", str11, "179805878703579024545324914571");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\033\ufffd\031rWw,8" + "'", str13, "\004\ufffd\ufffd\033\ufffd\031rWw,8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "319323692027615527270324228781" + "'", str15, "319323692027615527270324228781");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001V\\\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001V\\\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "500119134375744663846564704776" + "'", str21, "500119134375744663846564704776");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "274199947257074592159658534401" + "'", str23, "274199947257074592159658534401");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "!" + "'", str27, "!");
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
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
        java.lang.String str25 = rSA1.decrypt("227966688963360439196322739470");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "396549866809921544286225409534" + "'", str9, "396549866809921544286225409534");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "82831467782944134764807298211" + "'", str11, "82831467782944134764807298211");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "438248559271202115536184006152" + "'", str13, "438248559271202115536184006152");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "314" + "'", str17, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!" + "'", str19, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "146" + "'", str21, "146");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "176" + "'", str23, "176");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "856204969968564" + "'", str7, "856204969968564");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\u070c" + "'", str9, "\001\u070c");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1005854345307175" + "'", str13, "1005854345307175");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "354219253489453" + "'", str15, "354219253489453");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\031\ufffd\ufffd\021" + "'", str17, "\001\031\ufffd\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1492466748449723" + "'", str19, "1492466748449723");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("6367626140");
        java.lang.String str13 = rSA1.decrypt("257460611869473752308709489059");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1724051338598480" + "'", str7, "1724051338598480");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffdW" + "'", str9, "\005\ufffd\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffdg" + "'", str11, "\004\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\007\ufffdml\000*" + "'", str13, "\007\007\ufffdml\000*");
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "322581567374458847880982871378" + "'", str9, "322581567374458847880982871378");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32487130007701251681229664066" + "'", str11, "32487130007701251681229664066");
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "138" + "'", str9, "138");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "488" + "'", str13, "488");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1699828359913482" + "'", str19, "1699828359913482");
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.String str13 = rSA1.decrypt("1289219933400623");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5146518914" + "'", str3, "5146518914");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2506182219" + "'", str7, "2506182219");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\235\016" + "'", str9, "\000\ufffd\235\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1709745613" + "'", str11, "1709745613");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\033\032" + "'", str13, "\ufffd\033\032");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("42353332408625927723");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\f" + "'", str7, "\001\f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\177\ufffd\ufffd\ufffd\024\ufffd\ufffdV" + "'", str11, "\b\ufffd\177\ufffd\ufffd\ufffd\024\ufffd\ufffdV");
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
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
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\034n\004" + "'", str13, "\004\ufffd\ufffd\ufffd\034n\004");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2324293240711450" + "'", str15, "2324293240711450");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "815030584771398" + "'", str17, "815030584771398");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "196" + "'", str21, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "423" + "'", str23, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "112" + "'", str27, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "187" + "'", str29, "187");
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478374706200223" + "'", str7, "478374706200223");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\u0105\ufffd0" + "'", str3, "\004\u0105\ufffd0");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1524482091617332" + "'", str5, "1524482091617332");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "342384493140247" + "'", str7, "342384493140247");
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
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
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "321152838937094816904970536134" + "'", str9, "321152838937094816904970536134");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\t\ufffd\ufffdY\177\037\ufffd\ufffd\ufffd\ufffd9" + "'", str11, "\004\t\ufffd\ufffdY\177\037\ufffd\ufffd\ufffd\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "391119845930864475560921094783" + "'", str13, "391119845930864475560921094783");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004kNN\030\ufffd\ufffdm\03404" + "'", str15, "\004kNN\030\ufffd\ufffdm\03404");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64339296875" + "'", str17, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi" + "'", str23, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdi");
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "251958238268631012399421694291" + "'", str9, "251958238268631012399421694291");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\034\231\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002\034\231\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6867055263564111935781186429" + "'", str13, "6867055263564111935781186429");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "57688667984646538371800587512" + "'", str15, "57688667984646538371800587512");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "842477072024283136149063925349" + "'", str17, "842477072024283136149063925349");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "599375331288707739093853210454" + "'", str19, "599375331288707739093853210454");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "825128591060005556658767157094" + "'", str21, "825128591060005556658767157094");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "498289078610830558955167808249" + "'", str23, "498289078610830558955167808249");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "65532666954030969396267911893" + "'", str25, "65532666954030969396267911893");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\002\ufffd\u0472\ufffd\ufffd\026\013G6\033" + "'", str27, "\002\ufffd\u0472\ufffd\ufffd\026\013G6\033");
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.encrypt("114499583605784415240056624559");
        java.lang.String str7 = rSA1.decrypt("2508398101423561");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3002721697" + "'", str3, "3002721697");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10219429706" + "'", str5, "10219429706");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\u88d7" + "'", str7, "\001\u88d7");
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffdw");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("135");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "N" + "'", str7, "N");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "178" + "'", str11, "178");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\200\ufffd!\023\ufffd\ufffd\ufffd4");
        java.lang.String str17 = rSA1.encrypt("6318253741");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2365151071647950" + "'", str7, "2365151071647950");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1505593989987154" + "'", str13, "1505593989987154");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "98631057648323" + "'", str15, "98631057648323");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "757656113416983" + "'", str17, "757656113416983");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.encrypt("120278723214103938881357741819");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "951433115230363" + "'", str7, "951433115230363");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "273" + "'", str13, "273");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211" + "'", str5, "211");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "587" + "'", str9, "587");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\030" + "'", str13, "\001\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "187" + "'", str15, "187");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("\b\ufffd\ufffd\f\ufffd");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "241862093930025629369822971219" + "'", str11, "241862093930025629369822971219");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "498876120414600863536497856469" + "'", str13, "498876120414600863536497856469");
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "66769548529801029557828038671" + "'", str9, "66769548529801029557828038671");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd" + "'", str11, "\001\ufffd\033\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "87058663546810742658225152310" + "'", str15, "87058663546810742658225152310");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "584" + "'", str19, "584");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("120");
        java.lang.String str9 = rSA1.encrypt("629870188359595752736151835954");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "462" + "'", str9, "462");
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\000\ufffdL\024\ufffd\ufffd\ufffd>\032");
        rSA1.generateKeys((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18220404417951597090390862337" + "'", str11, "18220404417951597090390862337");
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("353");
        java.lang.String str19 = rSA1.encrypt("54566714573477621265667993609");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "914212352591367750681947308145" + "'", str9, "914212352591367750681947308145");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\002\ufffd\u0154\ufffd\ufffd\ufffd\ufffd\u0762" + "'", str11, "\t\ufffd\002\ufffd\u0154\ufffd\ufffd\ufffd\ufffd\u0762");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20031129663689225603601838740" + "'", str13, "20031129663689225603601838740");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "293491979892312" + "'", str17, "293491979892312");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1826234776518" + "'", str19, "1826234776518");
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("8403463512");
        java.lang.String str13 = rSA1.decrypt("425");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1591423722051526" + "'", str7, "1591423722051526");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\u03db\ufffd\ufffd\ufffdg" + "'", str11, "\b\u03db\ufffd\ufffd\ufffdg");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd_w" + "'", str13, "\003\ufffd\ufffd\ufffd_w");
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
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
        java.lang.String str23 = rSA1.decrypt("618401003690856");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "190" + "'", str17, "190");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\001" + "'", str23, "\001\001");
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
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
        java.lang.String str21 = rSA1.decrypt("439161610538377200236688884473");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "903516794457269" + "'", str7, "903516794457269");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd$\n" + "'", str15, "\001\ufffd\ufffd$\n");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2924441200" + "'", str17, "2924441200");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8089795766" + "'", str19, "8089795766");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffdm\r\ufffd" + "'", str21, "\001\ufffdm\r\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        java.lang.String str13 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str15 = rSA1.encrypt("155498968560368134222812407008");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "590799153119159986872889793540" + "'", str9, "590799153119159986872889793540");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "500467944143883601682466568232" + "'", str11, "500467944143883601682466568232");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdjCb\t" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffdjCb\t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "509167546073730461713801641026" + "'", str15, "509167546073730461713801641026");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("317888314060982043747922937082");
        java.lang.String str13 = rSA1.decrypt("51072814435354477634104262711");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1044006256" + "'", str3, "1044006256");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5356303828" + "'", str5, "5356303828");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7006862907" + "'", str7, "7006862907");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3131239537" + "'", str9, "3131239537");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6562684323" + "'", str11, "6562684323");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2047194644656127" + "'", str7, "2047194644656127");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
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
        java.lang.String str21 = rSA1.encrypt("\004\ufffd\ufffd\ufffdPi");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "787013968822745046607684987852" + "'", str9, "787013968822745046607684987852");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\\Z\"\ufffd\025\ufffd\020\ufffd\ufffd6\004" + "'", str11, "\006\\Z\"\ufffd\025\ufffd\020\ufffd\ufffd6\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "371248256326890066868432898893" + "'", str15, "371248256326890066868432898893");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "366837167582229136734010864712" + "'", str17, "366837167582229136734010864712");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "53640099770658002617449247842" + "'", str19, "53640099770658002617449247842");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "355699694454088670298309184649" + "'", str21, "355699694454088670298309184649");
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1980818151758697" + "'", str7, "1980818151758697");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002R" + "'", str19, "\002R");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "486" + "'", str21, "486");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("222102907907357");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.decrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
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
        java.lang.String str21 = rSA1.encrypt("\004\ufffd\ufffd\020\ufffd\ufffd\ufffd\ufffd\ufffd\013\032");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478394193630894" + "'", str7, "478394193630894");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "625" + "'", str19, "625");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "600" + "'", str21, "600");
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
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
        java.lang.String str23 = rSA1.encrypt("588589126");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "161" + "'", str3, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002M" + "'", str5, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffdi" + "'", str13, "\007\ufffd\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2364403640096163" + "'", str15, "2364403640096163");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1919122725609839" + "'", str17, "1919122725609839");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "147863243237885" + "'", str19, "147863243237885");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2241864239944143" + "'", str21, "2241864239944143");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2228523193174491" + "'", str23, "2228523193174491");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
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
        java.lang.String str23 = rSA1.encrypt("131709301205923924822282636506");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "170378402711844384763431937128" + "'", str9, "170378402711844384763431937128");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2388907372032" + "'", str11, "2388907372032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\024\ufffd\ufffd\033,\026\ufffd\ufffde" + "'", str13, "\003\ufffd\024\ufffd\ufffd\033,\026\ufffd\ufffde");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "531086119416095820730690599221" + "'", str15, "531086119416095820730690599221");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "484566895942193837805313434483" + "'", str19, "484566895942193837805313434483");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "365996519844355043145932052564" + "'", str21, "365996519844355043145932052564");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "467469008685157727188998837296" + "'", str23, "467469008685157727188998837296");
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\b\ufffd\004ra=\030\ufffdr\021\ufffdH");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "819" + "'", str5, "819");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "150" + "'", str9, "150");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "731" + "'", str11, "731");
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "388166234194837835190232594866" + "'", str9, "388166234194837835190232594866");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffdN\003\ufffd\u07db\u0731" + "'", str11, "\004\ufffd\ufffdN\003\ufffd\u07db\u0731");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "428431519327080209418409146963" + "'", str13, "428431519327080209418409146963");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "386346067466507236776559900655" + "'", str15, "386346067466507236776559900655");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "133877900085651431240951255696" + "'", str17, "133877900085651431240951255696");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd4\0355\004\ufffd\002\ufffd\ufffd=" + "'", str19, "\001\ufffd4\0355\004\ufffd\002\ufffd\ufffd=");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\034\ufffd\0268:" + "'", str21, "\ufffd\ufffd\ufffd\ufffd\034\ufffd\0268:");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
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
        java.lang.String str21 = rSA1.decrypt("238451586798323247237066979964");
        java.lang.String str23 = rSA1.encrypt("\000\ufffd\ufffd5\b\ufffd\ufffd\ufffd\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "419441764992801709054900183348" + "'", str9, "419441764992801709054900183348");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "43418437474060513836227560178" + "'", str15, "43418437474060513836227560178");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "563461804751933959651" + "'", str17, "563461804751933959651");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "w" + "'", str21, "w");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "548" + "'", str23, "548");
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\017\ufffd\ufffd\u463d\ufffd\"");
        java.lang.String str17 = rSA1.decrypt("303415754433376700047708890998");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "160" + "'", str13, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "125" + "'", str15, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "@" + "'", str17, "@");
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\033\\\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1124771004247108" + "'", str7, "1124771004247108");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd" + "'", str9, "\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "98" + "'", str13, "98");
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "246135483347629302287518195382" + "'", str9, "246135483347629302287518195382");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246135483347629302287518195382" + "'", str11, "246135483347629302287518195382");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005Nv\016\ufffd\ufffd\ufffd\ufffd\006\ufffdF" + "'", str13, "\005Nv\016\ufffd\ufffd\ufffd\ufffd\006\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "594868941223861623239104372138" + "'", str15, "594868941223861623239104372138");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\032\ufffd\ufffd\ufffdSz." + "'", str17, "\005\ufffd\ufffd\ufffd\ufffd\032\ufffd\ufffd\ufffdSz.");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "172892162208951744127143356751" + "'", str21, "172892162208951744127143356751");
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.encrypt("576943578929631435681926812308");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1372270860797403" + "'", str7, "1372270860797403");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n\ufffd\b\nNT" + "'", str9, "\n\ufffd\b\nNT");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "603684981373314" + "'", str11, "603684981373314");
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("1934199967458848");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "552674570102726211187656700648" + "'", str9, "552674570102726211187656700648");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "378172380251464387970756724119" + "'", str11, "378172380251464387970756724119");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16384" + "'", str13, "16384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\021@l+\t\ufffd\ufffd\013");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3670148331" + "'", str3, "3670148331");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3370266825" + "'", str7, "3370266825");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2799724972" + "'", str11, "2799724972");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2915143549" + "'", str13, "2915143549");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("1392333286104922");
        java.lang.String str21 = rSA1.decrypt("441395404422730517085573187572");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "87220732595546646201905650194" + "'", str9, "87220732595546646201905650194");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "491118076205356731315268775437" + "'", str11, "491118076205356731315268775437");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\\1\027;z\fd^C" + "'", str13, "\002\ufffd\ufffd\\1\027;z\fd^C");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\035\ufffd\006\ufffd\025\ufffd" + "'", str15, "\ufffd\ufffd\035\ufffd\006\ufffd\025\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "447" + "'", str19, "447");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001w" + "'", str21, "\001w");
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("531562961217889631797132197378");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1068169860742118" + "'", str7, "1068169860742118");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1197353323459851" + "'", str9, "1197353323459851");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\033\ufffd\ufffd3\035\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\b\ufffd\ufffd\033\ufffd\ufffd3\035\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("498517715595236544046073650611");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001Z" + "'", str3, "\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Lm]\016\ufffd\"(\034\ufffd\ufffd" + "'", str7, "Lm]\016\ufffd\"(\034\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.encrypt("\002<|\031\016\ufffdt");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("27");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\ufffd%e\f1");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "65" + "'", str9, "65");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdP\030\u047e\ufffd\036\ufffd\ufffd\ufffd" + "'", str13, "\ufffdP\030\u047e\ufffd\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1190229549836403363972668307" + "'", str15, "1190229549836403363972668307");
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
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
        java.lang.String str29 = rSA1.encrypt("106936737423066067971305426060");
        java.lang.Class<?> wildcardClass30 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "398045600640969101979239848386" + "'", str9, "398045600640969101979239848386");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "232568891749409624847421876156" + "'", str11, "232568891749409624847421876156");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32864970364192910981748922569" + "'", str13, "32864970364192910981748922569");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "440" + "'", str17, "440");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + ";" + "'", str19, ";");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "15" + "'", str21, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "279778724017902193550316438330" + "'", str25, "279778724017902193550316438330");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "6641992583976719479820622197" + "'", str27, "6641992583976719479820622197");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "87211142458151794521418243878" + "'", str29, "87211142458151794521418243878");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.decrypt("338");
        java.lang.String str17 = rSA1.decrypt("803592413162055");
        java.lang.String str19 = rSA1.encrypt("2566593727806295");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1438359441957661" + "'", str7, "1438359441957661");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\024\ufffd\ufffdi" + "'", str15, "\t\ufffd\ufffd\024\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\013\ufffd\ufffd\ufffd" + "'", str17, "\013\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1956607289140990" + "'", str19, "1956607289140990");
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n" + "'", str7, "\001\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "k" + "'", str9, "k");
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "145249139383201221370116292014" + "'", str5, "145249139383201221370116292014");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\026\ufffd\ufffd\ufffd\ufffd/U1\022\ufffd");
        java.lang.String str19 = rSA1.encrypt("6327754702");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3446865071729492" + "'", str7, "3446865071729492");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "586607550495464" + "'", str13, "586607550495464");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1228972759970620" + "'", str15, "1228972759970620");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1295349346902507" + "'", str17, "1295349346902507");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "373431742447524" + "'", str19, "373431742447524");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
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
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1009105161319889" + "'", str7, "1009105161319889");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\u05f2" + "'", str11, "\000\ufffd\u05f2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1596747529" + "'", str13, "1596747529");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "221307192" + "'", str15, "221307192");
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\037\f\ufffd\ufffd\ufffd\ufffd\ufffdY\035" + "'", str3, "\002\037\f\ufffd\ufffd\ufffd\ufffd\ufffdY\035");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "115677080442636512306552702007" + "'", str5, "115677080442636512306552702007");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "479670244429952726274013472915" + "'", str7, "479670244429952726274013472915");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd:\033G\024t\017m" + "'", str9, "\001\ufffd\ufffd:\033G\024t\017m");
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str13 = rSA1.decrypt("3775398402");
        java.lang.String str15 = rSA1.decrypt("172724761660472190993592461870");
        java.lang.String str17 = rSA1.encrypt("1468234090");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "622268890549845557612713968487" + "'", str9, "622268890549845557612713968487");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "622268890549845557612713968487" + "'", str11, "622268890549845557612713968487");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\027\ufffd\ufffd\u05f2\ufffd1\026\036U" + "'", str13, "\007\ufffd\ufffd\027\ufffd\ufffd\u05f2\ufffd1\026\036U");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005E\006\u061c\ufffd\ufffd\t\ufffd\ufffdv`" + "'", str15, "\005E\006\u061c\ufffd\ufffd\t\ufffd\ufffdv`");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64794144546311012154560014788" + "'", str17, "64794144546311012154560014788");
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.decrypt("956742419960502");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1616399260243739" + "'", str7, "1616399260243739");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd2\177" + "'", str9, "\003\ufffd\ufffd\ufffd2\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd6" + "'", str11, "\004\ufffd\ufffd6");
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\u0341\ufffd\ufffdF" + "'", str9, "\003\ufffd\ufffd\u0341\ufffd\ufffdF");
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\007");
        java.lang.String str13 = rSA1.encrypt("\000\u020f\ufffd\ufffd\ufffd\ufffdi\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "191" + "'", str3, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035\ufffd#X" + "'", str7, "\001\035\ufffd#X");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4788804443" + "'", str9, "4788804443");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "16807" + "'", str11, "16807");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1128160196" + "'", str13, "1128160196");
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.encrypt("724884093492597");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd#\037\ufffd\ufffd\ufffdy");
        java.lang.String str19 = rSA1.encrypt("\n\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("1944296795");
        java.lang.String str23 = rSA1.encrypt("243125940370807565255318859235");
        java.lang.String str25 = rSA1.encrypt("\006\025\ufffd\002\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "109" + "'", str9, "109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "=" + "'", str13, "=");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "42" + "'", str15, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "284" + "'", str17, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "173" + "'", str19, "173");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\005" + "'", str21, "\001\005");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "265" + "'", str23, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "79" + "'", str25, "79");
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "102" + "'", str11, "102");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "344" + "'", str15, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd8Qo\t\ufffd\027\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("270064452819075595077010738176");
        java.lang.String str13 = rSA1.encrypt("160933697917949198820719447915");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "215" + "'", str3, "215");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\023\002\ufffd_" + "'", str7, "\023\002\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8527357728" + "'", str9, "8527357728");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd4" + "'", str11, "\000\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7949160127" + "'", str13, "7949160127");
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\006\ufffd\ufffd\ufffd'");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???7?'\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "78" + "'", str13, "78");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "612391439125784865849149098388" + "'", str17, "612391439125784865849149098388");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "341056262815516387117967445811" + "'", str19, "341056262815516387117967445811");
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
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
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffdP4\021\ufffd\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\ufffdP4\021\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("\036\034\u01b7\ufffd\035\ufffd\ufffd\ufffd9h;");
        java.lang.String str9 = rSA1.encrypt("\ufffd");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "819" + "'", str5, "819");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "664" + "'", str7, "664");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "873" + "'", str9, "873");
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        java.lang.String str11 = rSA1.decrypt("6367626140");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1672479213885064" + "'", str7, "1672479213885064");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\u0799\u0354" + "'", str9, "\003\ufffd\ufffd\u0799\u0354");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd|q\037Z" + "'", str11, "\006\ufffd\ufffd|q\037Z");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "241840806051519" + "'", str13, "241840806051519");
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
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
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "342015394278352297865750322124" + "'", str9, "342015394278352297865750322124");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\035\ufffd(;C\003\ufffd\ufffd\035\u04ec" + "'", str11, "\n\035\ufffd(;C\003\ufffd\ufffd\035\u04ec");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "744347701536978935075977267312" + "'", str13, "744347701536978935075977267312");
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
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
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd?\n\ufffd" + "'", str13, "\ufffd?\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1177938001516214" + "'", str15, "1177938001516214");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\022\ufffd\ufffd\ufffd\ufffd\ufffd\u063c\034\033\ufffd" + "'", str19, "\022\ufffd\ufffd\ufffd\ufffd\ufffd\u063c\034\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "a\022\177\ufffd\ufffdE*/\003\ufffd3{" + "'", str21, "a\022\177\ufffd\ufffdE*/\003\ufffd3{");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\ufffd\u023f\ufffd\ufffd8" + "'", str23, "\ufffd\ufffd\u023f\ufffd\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\026," + "'", str25, "\ufffd\ufffd\ufffd\ufffd\ufffd\026,");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        java.lang.String str11 = rSA1.encrypt("361");
        java.lang.String str13 = rSA1.decrypt("939196575401842");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1909587139859388" + "'", str7, "1909587139859388");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1046403501381132" + "'", str9, "1046403501381132");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3993965386337654" + "'", str11, "3993965386337654");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\r/\024\ufffdlK" + "'", str13, "\f\r/\024\ufffdlK");
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
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
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "55" + "'", str11, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1726041852993534" + "'", str15, "1726041852993534");
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("373");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffdQ\017q~\177\ufffd\025\ufffdM0");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "72" + "'", str13, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "201440071584798238742532457214" + "'", str17, "201440071584798238742532457214");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\006");
        java.lang.String str15 = rSA1.decrypt("338");
        java.lang.String str17 = rSA1.decrypt("803592413162055");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "737130973296962" + "'", str7, "737130973296962");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "279936" + "'", str13, "279936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\"\ufffd\003\ufffd\ufffd\ufffd" + "'", str17, "\001\"\ufffd\003\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("1249253780109007");
        java.lang.String str15 = rSA1.encrypt("218338345005273735882612532307");
        java.lang.String str17 = rSA1.encrypt("83679343486945720795101116780");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "888395349200490" + "'", str7, "888395349200490");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "537252306" + "'", str11, "537252306");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd5" + "'", str13, "\ufffd5");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1079765681" + "'", str15, "1079765681");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2043441127" + "'", str17, "2043441127");
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("432268551667889026451279149775");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52099558592809403745431984329" + "'", str3, "52099558592809403745431984329");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\001" + "'", str7, "\002\ufffd\ufffd\001");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.decrypt("639857867348047546651687203467");
        java.lang.String str11 = rSA1.decrypt("478908770438626");
        java.lang.String str13 = rSA1.encrypt("477275381709667864596972007455");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7186833153" + "'", str3, "7186833153");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7724165533" + "'", str5, "7724165533");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7502782604" + "'", str7, "7502782604");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\0058" + "'", str9, "\001\ufffd\ufffd\0058");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\034\ufffd'" + "'", str11, "\000\ufffd\034\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3964946532" + "'", str13, "3964946532");
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("541070444203118");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\025\ufffd\ufffd\005\u03f4\ufffd\026" + "'", str9, "\003\ufffd\ufffd\ufffd\025\ufffd\ufffd\005\u03f4\ufffd\026");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("5627337140");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "383165803455165755640970640596" + "'", str9, "383165803455165755640970640596");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "132498657503876581521263703232" + "'", str11, "132498657503876581521263703232");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("3");
        java.lang.String str19 = rSA1.encrypt("3247968556");
        java.lang.String str21 = rSA1.encrypt("1610609348121997");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "345025251" + "'", str17, "345025251");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2152230916208656" + "'", str19, "2152230916208656");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2268170560420456" + "'", str21, "2268170560420456");
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("451");
        java.lang.String str17 = rSA1.encrypt("\003\005\ufffd\ufffd\ufffdk*\032\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "323" + "'", str11, "323");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "30" + "'", str13, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "441" + "'", str15, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "246" + "'", str17, "246");
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("682207750398180758004262180703");
        java.lang.String str13 = rSA1.decrypt("357690512925543535751245880674");
        java.lang.String str15 = rSA1.decrypt("4986469791");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007\ufffd\u02fd\ufffdk" + "'", str3, "\007\ufffd\u02fd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1624717697620705" + "'", str5, "1624717697620705");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "814790819443427" + "'", str7, "814790819443427");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\026\f" + "'", str9, "\004\ufffd\ufffd\026\f");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1705656661830620" + "'", str11, "1705656661830620");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\u0237" + "'", str13, "\004\ufffd\ufffd\ufffd\u0237");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ufffd" + "'", str15, "\003\ufffd\ufffd");
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        java.lang.String str15 = rSA1.encrypt("576838359927970006129927354507");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "$" + "'", str5, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "290" + "'", str7, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8" + "'", str13, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "273" + "'", str15, "273");
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
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
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffd\026\006\ufffd3");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2341093809992758" + "'", str7, "2341093809992758");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "24" + "'", str15, "24");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "n" + "'", str17, "n");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "222" + "'", str19, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "254" + "'", str21, "254");
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.String str17 = rSA1.decrypt("1632923298108129");
        java.lang.String str19 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd,");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\b\ufffd\001\002\ufffd{d");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????{d\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "376857728006709000494254357145" + "'", str9, "376857728006709000494254357145");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\023\ufffd\r\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\023\ufffd\r\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "252378424564621387529124148490" + "'", str15, "252378424564621387529124148490");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\036\ufffd\u8fb9\"\ufffd\013|\026k" + "'", str17, "\001\036\ufffd\u8fb9\"\ufffd\013|\026k");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "245061872426851576357526983256" + "'", str19, "245061872426851576357526983256");
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
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
        java.lang.String str23 = rSA1.decrypt("183692074128392504068783805063");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "266379144277413612845749323025" + "'", str9, "266379144277413612845749323025");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\001\ufffd\013$\\\ufffd\ufffd}O" + "'", str11, "\006\ufffd\001\ufffd\013$\\\ufffd\ufffd}O");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "129921317519484504107928294062" + "'", str13, "129921317519484504107928294062");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "841359196735488984016316932052" + "'", str15, "841359196735488984016316932052");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "496143896604400758044894695158" + "'", str17, "496143896604400758044894695158");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "691314613609405275574693506617" + "'", str19, "691314613609405275574693506617");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW" + "'", str21, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd\u07f4\ufffd\033\ufffd\ufffd_" + "'", str23, "\002\ufffd\ufffd\u07f4\ufffd\033\ufffd\ufffd_");
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("460217969209365935495543722411");
        java.lang.String str15 = rSA1.encrypt("5613811618");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "247" + "'", str9, "247");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "892" + "'", str15, "892");
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) (short) 10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001qf\021\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd," + "'", str15, "\001qf\021\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd,");
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        java.lang.String str15 = rSA1.decrypt("472");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "829" + "'", str3, "829");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1909991526" + "'", str7, "1909991526");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7551840657" + "'", str9, "7551840657");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffdMZO" + "'", str11, "\000\ufffdMZO");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6538199936" + "'", str13, "6538199936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffdU4g" + "'", str15, "\000\ufffdU4g");
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("4334658428");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "309" + "'", str7, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "45213801433100254691158854488" + "'", str11, "45213801433100254691158854488");
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1459116938193998" + "'", str7, "1459116938193998");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("635442583753138455625950920532");
        java.lang.String str7 = rSA1.encrypt("\003\016D?\n\ufffd\005\005\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\013\ufffd\ufffdD\000\ufffd\ufffd\ufffd% M" + "'", str3, "\006\013\ufffd\ufffdD\000\ufffd\ufffd\ufffd% M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "390383257726448741980517023675" + "'", str5, "390383257726448741980517023675");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66883066308710953136902356513" + "'", str7, "66883066308710953136902356513");
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.encrypt("682207750398180758004262180703");
        java.lang.String str13 = rSA1.decrypt("357690512925543535751245880674");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\u0740\ufffd\ufffdk" + "'", str3, "\004\ufffd\u0740\ufffd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1725282299499790" + "'", str5, "1725282299499790");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1921673605888501" + "'", str7, "1921673605888501");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffde" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffde");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "542858808807359" + "'", str11, "542858808807359");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\027\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\027\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd\u02c0\ufffd\ufffd\007,");
        rSA1.generateKeys((int) '4');
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "388" + "'", str9, "388");
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
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
        java.lang.String str27 = rSA1.encrypt("88311020181547747371412072505");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1170425664035063" + "'", str7, "1170425664035063");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "216" + "'", str13, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\u0199!-" + "'", str15, "\005\ufffd\u0199!-");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "585" + "'", str19, "585");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "666" + "'", str21, "666");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd" + "'", str23, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\036" + "'", str25, "\002\036");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "382" + "'", str27, "382");
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
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
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "77" + "'", str5, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\016" + "'", str7, "\016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "265" + "'", str9, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "359" + "'", str11, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "74" + "'", str13, "74");
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        java.lang.String str5 = rSA1.decrypt("5483845661");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12759234748784822456560811161" + "'", str3, "12759234748784822456560811161");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\u074a\ufffd\u077b\ufffd" + "'", str5, "\003\u074a\ufffd\u077b\ufffd");
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("\005g\006\ufffd\ufffda");
        java.lang.String str7 = rSA1.encrypt("\007\025\ufffd\ufffd\ufffd\u0591\ufffd\024\016\006");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\002\024\ufffd\ufffdu");
        java.lang.String str11 = rSA1.decrypt("80522451683158304659309371713");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5833387629" + "'", str3, "5833387629");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7145459048" + "'", str5, "7145459048");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1521436386" + "'", str7, "1521436386");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4086968223" + "'", str9, "4086968223");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\\\ufffd\013" + "'", str11, "\\\ufffd\013");
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("153853134159497141190339455222");
        java.lang.String str11 = rSA1.decrypt("3060553596769532");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "296807715677676" + "'", str7, "296807715677676");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\037" + "'", str9, "\003\ufffd\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\023\ufffdL" + "'", str11, "\006\023\ufffdL");
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr\013\ufffd");
        java.lang.String str13 = rSA1.encrypt("208");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd`\f\022\ufffd\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("1547751917465224");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "172" + "'", str5, "172");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "404" + "'", str7, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "192" + "'", str9, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "41" + "'", str11, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "239" + "'", str13, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "113" + "'", str15, "113");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "410" + "'", str19, "410");
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("Z");
        java.lang.String str11 = rSA1.encrypt("1422455974188443");
        java.lang.String str13 = rSA1.decrypt("1330434113842336");
        java.lang.String str15 = rSA1.decrypt("1622863312003274");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\001\ufffd\ufffd>" + "'", str5, "\001\001\ufffd\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "729000" + "'", str9, "729000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387969516984022474645318670910" + "'", str11, "387969516984022474645318670910");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffdI\006\016\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffdI\006\016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\0022<\"\ufffd\ufffd\ufffdwi]!" + "'", str15, "\001\0022<\"\ufffd\ufffd\ufffdwi]!");
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
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
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\033\ufffd\ufffd\ufffd\ufffd\003\ufffd\017\ufffd\004\ufffd" + "'", str15, "\003\033\ufffd\ufffd\ufffd\ufffd\003\ufffd\017\ufffd\004\ufffd");
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
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
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "600518263374048758733643555433" + "'", str9, "600518263374048758733643555433");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd-w\032\u0228" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\ufffd-w\032\u0228");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\b\ufffd\016\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\b\ufffd\016\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42875" + "'", str17, "42875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "366937698448499287986547040575" + "'", str19, "366937698448499287986547040575");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "106330472578294446031604104526" + "'", str21, "106330472578294446031604104526");
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
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
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "399192906231682078241291964398" + "'", str9, "399192906231682078241291964398");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "399192906231682078241291964398" + "'", str11, "399192906231682078241291964398");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\003\ufffd\ufffd\ufffd\ufffd\ufffd3" + "'", str13, "\b\003\ufffd\ufffd\ufffd\ufffd\ufffd3");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "863351676099443068949216142480" + "'", str15, "863351676099443068949216142480");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t<)\\\ufffd\ufffd\ufffd!\030\ufffd9m" + "'", str17, "\t<)\\\ufffd\ufffd\ufffd!\030\ufffd9m");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "574797686857172944039350963231" + "'", str19, "574797686857172944039350963231");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\"\ufffd\ufffd\ufffd\ufffd\ufffd\034" + "'", str21, "\001\"\ufffd\ufffd\ufffd\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd\032\ufffd\007" + "'", str25, "\000\ufffd\032\ufffd\007");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
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
        java.lang.String str25 = rSA1.decrypt("3981061103171427086153773424");
        java.lang.String str27 = rSA1.decrypt("405147025853472");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "126263995172187678047415224686" + "'", str9, "126263995172187678047415224686");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "364488356200076158315504502359" + "'", str13, "364488356200076158315504502359");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004.\002\ufffd\ufffd\ufffd\ufffd\ufffdP" + "'", str15, "\004.\002\ufffd\ufffd\ufffd\ufffd\ufffdP");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "338073594890800367407825147472" + "'", str17, "338073594890800367407825147472");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "15725957275240176451390306439" + "'", str21, "15725957275240176451390306439");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\016\ufffd5\017\u0476\ufffd" + "'", str25, "\001\ufffd\016\ufffd5\017\u0476\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\005\ufffd\ufffd\000\ufffd\ufffd~\030 " + "'", str27, "\005\ufffd\ufffd\000\ufffd\ufffd~\030 ");
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1888566810359954" + "'", str7, "1888566810359954");
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.decrypt("2847095304086592");
        java.lang.String str15 = rSA1.decrypt("2076257449927824");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1780467230781614" + "'", str7, "1780467230781614");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "34" + "'", str11, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002_" + "'", str15, "\002_");
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.encrypt("114499583605784415240056624559");
        java.lang.String str7 = rSA1.decrypt("14738995945");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8757769357" + "'", str3, "8757769357");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "11192786933" + "'", str5, "11192786933");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd");
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd5" + "'", str7, "\002\ufffd5");
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        java.lang.String str15 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffd\ufffd\ufffd\021zl");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1070281340639859" + "'", str7, "1070281340639859");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1668826856324310" + "'", str13, "1668826856324310");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "405012032595570" + "'", str15, "405012032595570");
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
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
        java.lang.String str23 = rSA1.encrypt("\f\u05d1\ufffd\ufffd\ufffd\ufffd\ufffdsL");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "420977539281257" + "'", str7, "420977539281257");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004K\026\ufffd\ufffd" + "'", str9, "\004K\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "637109765607210" + "'", str13, "637109765607210");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "449137234555448" + "'", str17, "449137234555448");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "626447964938784" + "'", str19, "626447964938784");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd\ufffdy\002\ufffd" + "'", str21, "\001\ufffd\ufffdy\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1789974630921250" + "'", str23, "1789974630921250");
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
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
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172644399729854511907451183563" + "'", str9, "172644399729854511907451183563");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "76289550880965645741255032832" + "'", str11, "76289550880965645741255032832");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "189262134071631360869194021681" + "'", str15, "189262134071631360869194021681");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32518566577693309798125591179" + "'", str19, "32518566577693309798125591179");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "512358034921961528081841428894" + "'", str21, "512358034921961528081841428894");
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.encrypt("432373222534973726506934894382");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("89199811206853317062284726130");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "801227853954885" + "'", str7, "801227853954885");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "995715667" + "'", str15, "995715667");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1202700205260426" + "'", str19, "1202700205260426");
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
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
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "904845562620153" + "'", str7, "904845562620153");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "338" + "'", str11, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P" + "'", str19, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "41" + "'", str21, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001L" + "'", str23, "\001L");
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
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
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "502229179330936887737241951312" + "'", str9, "502229179330936887737241951312");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "497237710455945878954970632609" + "'", str11, "497237710455945878954970632609");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd.{\035" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd.{\035");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffdBF" + "'", str15, "\004\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffdBF");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\023" + "'", str19, "\023");
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1579539181348398");
        java.lang.String str13 = rSA1.encrypt("\003");
        java.lang.String str15 = rSA1.encrypt("9047872");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "345183295117836" + "'", str7, "345183295117836");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27" + "'", str13, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "543" + "'", str15, "543");
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
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
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "377051776771860406389185592096" + "'", str9, "377051776771860406389185592096");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8553590138425744943796790144" + "'", str11, "8553590138425744943796790144");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\032\026\ufffd\ufffd\361\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\032\026\ufffd\ufffd\361\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd>" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001Z" + "'", str19, "\001Z");
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("1396895478287703");
        java.lang.String str5 = rSA1.encrypt("251943736018795");
        java.lang.String str7 = rSA1.encrypt("1024");
        java.lang.String str9 = rSA1.encrypt("32785009004481843571057639692");
        java.lang.String str11 = rSA1.decrypt("42362846909373312512");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("C");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1729777273" + "'", str5, "1729777273");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "466553122" + "'", str7, "466553122");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2093547333" + "'", str9, "2093547333");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\034\ufffd" + "'", str11, "\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "300763" + "'", str15, "300763");
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001C");
        java.lang.String str15 = rSA1.decrypt("237830699929158427676435923969");
        java.lang.String str17 = rSA1.decrypt("3060553596769532");
        java.lang.String str19 = rSA1.decrypt("25298973144167063265441755985");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "460788450605750" + "'", str7, "460788450605750");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33698267" + "'", str13, "33698267");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001fIq\031\ufffd" + "'", str15, "\001fIq\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\u040e\ufffd(\0004" + "'", str17, "\000\u040e\ufffd(\0004");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\n" + "'", str19, "\006\ufffd\ufffd\ufffd\ufffd\n");
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003[" + "'", str7, "\003[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "587" + "'", str9, "587");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "124" + "'", str11, "124");
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        java.lang.String str15 = rSA1.encrypt("258");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\u0259\ufffd\ufffd\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "341978647749441951446927811890" + "'", str9, "341978647749441951446927811890");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd?\\\ufffd\ufffd\ufffdW\002" + "'", str11, "\b\ufffd?\\\ufffd\ufffd\ufffdW\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\035\u0413\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\035\u0413\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "726215827655110988046775580693" + "'", str15, "726215827655110988046775580693");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "549636231128531513899504441698" + "'", str17, "549636231128531513899504441698");
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        java.lang.String str15 = rSA1.decrypt("618443824774458842838968720878");
        java.lang.String str17 = rSA1.encrypt("13987155673");
        java.lang.String str19 = rSA1.encrypt("1353360630");
        java.lang.String str21 = rSA1.encrypt("1042540646165926");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2429442175759743" + "'", str7, "2429442175759743");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "I" + "'", str11, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002t" + "'", str13, "\002t");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\036" + "'", str15, "\001\036");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "369" + "'", str17, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "275" + "'", str19, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "110" + "'", str21, "110");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
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
        java.lang.String str21 = rSA1.encrypt("\001\ufffd\ufffd\177\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3086226318762675" + "'", str7, "3086226318762675");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd)0\013" + "'", str15, "\000\ufffd)0\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1605766039" + "'", str17, "1605766039");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "8573758065" + "'", str19, "8573758065");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1516062356" + "'", str21, "1516062356");
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.decrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\036\u03bfR");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2097103477808005" + "'", str7, "2097103477808005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\036\ufffd\ufffd\ufffd" + "'", str11, "\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "89822813" + "'", str13, "89822813");
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("219430057538805555486238156998");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\005\ufffd)d\036\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??)\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3054792014" + "'", str11, "3054792014");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\027u|\020" + "'", str13, "\027u|\020");
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\001\ufffd\ufffd\022\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "412972787837579439594943363305" + "'", str9, "412972787837579439594943363305");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1309161928991175" + "'", str15, "1309161928991175");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\026\\\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\026\\\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "6075948496734304924910249088" + "'", str21, "6075948496734304924910249088");
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
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
        java.lang.String str23 = rSA1.encrypt("\ufffd\u016c");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "640587132605995680772585127227" + "'", str9, "640587132605995680772585127227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\r\ufffd\ufffd\023\ufffdE\017" + "'", str11, "\ufffd\r\ufffd\ufffd\023\ufffdE\017");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "409160835727069168092095656345" + "'", str13, "409160835727069168092095656345");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "132651" + "'", str17, "132651");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\013\ufffd`\022~" + "'", str19, "\013\ufffd`\022~");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "729000" + "'", str21, "729000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "989228751026855" + "'", str23, "989228751026855");
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("2771335575613869");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8059736490" + "'", str3, "8059736490");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5329666366" + "'", str7, "5329666366");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\023\ufffdW" + "'", str9, "\000\ufffd\023\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "949606056977677" + "'", str13, "949606056977677");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1749053391018210" + "'", str15, "1749053391018210");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007F.\013\ufffd\ufffd\ufffd" + "'", str19, "\007F.\013\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("317888314060982043747922937082");
        java.lang.String str15 = rSA1.encrypt("387");
        java.lang.String str17 = rSA1.encrypt("178");
        java.lang.String str19 = rSA1.decrypt("884541953392248018581296326339");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\004\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1435399368739605" + "'", str15, "1435399368739605");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1472711435602327" + "'", str17, "1472711435602327");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("\036\034\u01b7\ufffd\035\ufffd\ufffd\ufffd9h;");
        java.lang.String str9 = rSA1.encrypt("1355487281059316");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "234" + "'", str5, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "389" + "'", str7, "389");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "25" + "'", str9, "25");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
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
        java.lang.String str21 = rSA1.decrypt("769504592354484");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1088158979231586" + "'", str15, "1088158979231586");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "782" + "'", str19, "782");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
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
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145136782048220657637947193115" + "'", str11, "145136782048220657637947193115");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "722172217642419504339367640376" + "'", str13, "722172217642419504339367640376");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "278114643508437594953787852137" + "'", str17, "278114643508437594953787852137");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "37761701459156484237" + "'", str19, "37761701459156484237");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\ufffdO\005\ufffd\ufffd/\335" + "'", str21, "\007\ufffd\ufffdO\005\ufffd\ufffd/\335");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "185181035386731685402295488167" + "'", str23, "185181035386731685402295488167");
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
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
        java.lang.String str23 = rSA1.decrypt("3");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "437545299835664148444484790557" + "'", str9, "437545299835664148444484790557");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "437545299835664148444484790557" + "'", str11, "437545299835664148444484790557");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u05fc\ufffd\u06f5\ufffd\ufffd\ufffd" + "'", str13, "\001\u05fc\ufffd\u06f5\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "161394198387047192119022123783" + "'", str15, "161394198387047192119022123783");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "276184020059256362756026775658" + "'", str21, "276184020059256362756026775658");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\ufffd\ufffd\ufffd9\033\ufffd\ufffd\ufffd" + "'", str23, "\b\ufffd\ufffd\ufffd9\033\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("805201222");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("42353332408625927723");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\u0159\ufffdW\030\ufffd\027\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\u0159\ufffdW\030\ufffd\027\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
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
        java.lang.String str21 = rSA1.decrypt("358");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "90958230002426" + "'", str11, "90958230002426");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1459854003326911" + "'", str13, "1459854003326911");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffdy[" + "'", str19, "\006\ufffd\ufffd\ufffd\ufffd\030\ufffd\ufffdy[");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd\ufffdY\n\ufffd\ufffd\u07e0X\033\n\005" + "'", str21, "\000\ufffd\ufffdY\n\ufffd\ufffd\u07e0X\033\n\005");
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("965471357883334");
        java.lang.String str17 = rSA1.decrypt("1698695996533702");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "265745690614207564134906785388" + "'", str11, "265745690614207564134906785388");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "377835828908621969844871695660" + "'", str13, "377835828908621969844871695660");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\033\ufffd\ufffd\r\ufffd\031" + "'", str15, "\004\ufffd\ufffd\033\ufffd\ufffd\r\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\017\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\005\017\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("410");
        java.lang.String str13 = rSA1.encrypt("\004\004\ufffd\ufffd\u03bd\ufffd\u5c1c\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "132839642906502095081536218075" + "'", str9, "132839642906502095081536218075");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "40017971597836857344" + "'", str11, "40017971597836857344");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "286137964642821678986297991164" + "'", str13, "286137964642821678986297991164");
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
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
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "464271494739387768930352732036" + "'", str9, "464271494739387768930352732036");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffdq\"\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffdq\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "787651117247518798285569999445" + "'", str13, "787651117247518798285569999445");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "179174595521245096600004065941" + "'", str15, "179174595521245096600004065941");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1051355051028028921441057246524" + "'", str17, "1051355051028028921441057246524");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "410" + "'", str21, "410");
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
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
        java.lang.String str25 = rSA1.encrypt("270623192145785");
        java.lang.String str27 = rSA1.encrypt("\006\ufffd\r\177\ufffd\ufffd\ufffddO\"");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "578143224702917440609968674401" + "'", str9, "578143224702917440609968674401");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd2" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\u03f2\036\005Sq-\003\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\u03f2\036\005Sq-\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\u021fC j\t\ufffd\ufffd\ufffd" + "'", str17, "\002\u021fC j\t\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\027\ufffd\ufffd\ufffd\ufffd\ufffd\031\ufffd\ufffd" + "'", str19, "\027\ufffd\ufffd\ufffd\ufffd\ufffd\031\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "38261863195747044622277340881" + "'", str21, "38261863195747044622277340881");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\025\ufffdz\002\u04e9\ufffd~" + "'", str23, "\025\ufffdz\002\u04e9\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "34181304814687331189810433537" + "'", str25, "34181304814687331189810433537");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "34486694745965984085066743774" + "'", str27, "34486694745965984085066743774");
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        java.lang.String str15 = rSA1.decrypt("354");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "351211637770950573413471648305" + "'", str9, "351211637770950573413471648305");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\n\ufffd\ufffd\ufffd\u4b9b" + "'", str11, "\001\ufffd\ufffd\n\ufffd\ufffd\ufffd\u4b9b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001/\b\002\ufffd\ufffd\016\ufffd\ufffd\ufffd" + "'", str13, "\001/\b\002\ufffd\ufffd\016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\003\ufffd\ufffd\032\ufffd\ufffd\017\ufffd" + "'", str15, "\b\ufffd\003\ufffd\ufffd\032\ufffd\ufffd\017\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        java.lang.String str15 = rSA1.encrypt("314691894122019175527390431206");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\037\ufffd\000\036\ufffd\ufffd\ufffd" + "'", str11, "\003\ufffd\037\ufffd\000\036\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\t\ufffd\ufffd\ufffd\ufffd\"\ufffd" + "'", str13, "\004\t\ufffd\ufffd\ufffd\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "545514876463719301499428180947" + "'", str15, "545514876463719301499428180947");
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
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
        java.lang.String str25 = rSA1.decrypt("455928842758588725806316011992");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?o?????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "158452168046521186286563245735" + "'", str9, "158452168046521186286563245735");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "237434913448181772928108431516" + "'", str11, "237434913448181772928108431516");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "143621486762670454843801302136" + "'", str13, "143621486762670454843801302136");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "54" + "'", str17, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "436" + "'", str21, "436");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001%" + "'", str25, "\001%");
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str15 = rSA1.decrypt("1311807268931843");
        java.lang.String str17 = rSA1.encrypt("\ufffd/\b\003\005\ufffd\017\ufffd");
        java.lang.String str19 = rSA1.encrypt("122407182664076317296661295564");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7516865509350965248" + "'", str9, "7516865509350965248");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "490646148336175014269540091814" + "'", str11, "490646148336175014269540091814");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\006\ufffd\024\022\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\006\ufffd\024\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "218627177577924613013416607901" + "'", str17, "218627177577924613013416607901");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "592390450684498531663490422331" + "'", str19, "592390450684498531663490422331");
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
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
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "328" + "'", str7, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\025\ufffd\u0317\ufffdf\f\020\022-" + "'", str11, "\025\ufffd\u0317\ufffdf\f\020\022-");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31785275312757720184383576076" + "'", str13, "31785275312757720184383576076");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "136" + "'", str19, "136");
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
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
        java.lang.String str21 = rSA1.encrypt("493");
        java.lang.String str23 = rSA1.encrypt("956686158365351");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = rSA1.decrypt("\005\ufffd\ufffd\f\ufffd\ufffd\ufffd\u0688");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "940306400120949" + "'", str7, "940306400120949");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "393" + "'", str21, "393");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "815" + "'", str23, "815");
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2740457617840309" + "'", str7, "2740457617840309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P" + "'", str19, "P");
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
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
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "314352160056819835911821114293" + "'", str9, "314352160056819835911821114293");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffdG3\006\032\"\ufffd" + "'", str11, "\006\ufffdG3\006\032\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "132354788650544478541721209636" + "'", str13, "132354788650544478541721209636");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\\\005\177\177\ufffd\u07b8\u01f3" + "'", str15, "\000\ufffd\ufffd\\\005\177\177\ufffd\u07b8\u01f3");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "462394953478820443557558772349" + "'", str17, "462394953478820443557558772349");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5664909139352255732768994147" + "'", str21, "5664909139352255732768994147");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffdt{[\034\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\ufffdt{[\034\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffdV\033\ufffd`\006x\023\ufffd\ufffd" + "'", str25, "\ufffd\ufffdV\033\ufffd`\006x\023\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "17365720975913927633038710378" + "'", str27, "17365720975913927633038710378");
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "407355978550032193960397510767" + "'", str9, "407355978550032193960397510767");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "282395175712750500542624031416" + "'", str11, "282395175712750500542624031416");
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("1955448203012581");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "191" + "'", str3, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\b\ufffd\ufffd:" + "'", str7, "\001\b\ufffd\ufffd:");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffde\r" + "'", str9, "\001\ufffd\ufffde\r");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7311536842" + "'", str11, "7311536842");
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\r\ufffd\ufffd\u052c5n");
        java.lang.String str15 = rSA1.decrypt("861146582543015857800642702335");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "954536731437005" + "'", str11, "954536731437005");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1554899983851010" + "'", str13, "1554899983851010");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1978305830528623" + "'", str15, "1978305830528623");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "298717131201462962358744302187" + "'", str19, "298717131201462962358744302187");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\t\ufffd\u056c\ufffd)\220\ufffdr" + "'", str21, "\t\ufffd\u056c\ufffd)\220\ufffdr");
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\021\ufffd");
        java.lang.String str17 = rSA1.encrypt("604599376813224");
        java.lang.String str19 = rSA1.encrypt("304");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002+" + "'", str11, "\002+");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "K" + "'", str13, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "196" + "'", str15, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "218" + "'", str17, "218");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "675" + "'", str19, "675");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("241");
        java.lang.String str15 = rSA1.encrypt("48545501064253568549105436091");
        java.lang.String str17 = rSA1.decrypt("6774691164");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "121" + "'", str13, "121");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "64" + "'", str15, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\031" + "'", str17, "\002\031");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("521834014122859");
        java.lang.String str13 = rSA1.decrypt("6647907366");
        java.lang.String str15 = rSA1.encrypt("1682803771672384");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("873747823109916320200515184082");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffdPz");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????Pz\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24144641862818891705242562606" + "'", str9, "24144641862818891705242562606");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "215239355752217030210694813894" + "'", str11, "215239355752217030210694813894");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd>" + "'", str13, "\007\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "260102354890865073184791354913" + "'", str15, "260102354890865073184791354913");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "227893640034341762378370741610" + "'", str19, "227893640034341762378370741610");
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
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
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "130074285072161894314706809634" + "'", str9, "130074285072161894314706809634");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\027\ufffd\ufffd\036\ufffdkS\177\ufffd\034" + "'", str13, "\004\ufffd\027\ufffd\ufffd\036\ufffdkS\177\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "427227306281426197088931917373" + "'", str15, "427227306281426197088931917373");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\"\ufffd\ufffd\ufffd\004\017\u7117\ufffd:" + "'", str17, "\003\"\ufffd\ufffd\ufffd\004\017\u7117\ufffd:");
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\034" + "'", str7, "\001\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "743211282124566" + "'", str11, "743211282124566");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "969553099571976" + "'", str13, "969553099571976");
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd\023\023" + "'", str11, "\004\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd\023\023");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44311093845002958029890003573" + "'", str13, "44311093845002958029890003573");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "i" + "'", str17, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "56" + "'", str19, "56");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "345" + "'", str21, "345");
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("805201222");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "294080107063515412719706158934" + "'", str9, "294080107063515412719706158934");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "350763298510442686779165254885" + "'", str11, "350763298510442686779165254885");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\022\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffdfKq\n\ufffd\ufffd'" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffdfKq\n\ufffd\ufffd'");
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        java.lang.String str9 = rSA1.encrypt("11695976753");
        java.lang.String str11 = rSA1.encrypt("\002\033\ufffd\t\ufffd\ufffd>\026\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("144833308724683925683949639490");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("_\033\ufffdN");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"_??N\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "400" + "'", str5, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "328" + "'", str7, "328");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "347" + "'", str9, "347");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31" + "'", str11, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "429" + "'", str13, "429");
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.decrypt("1672696756611743");
        java.lang.String str17 = rSA1.encrypt("896");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11596156585" + "'", str3, "11596156585");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1014575825" + "'", str7, "1014575825");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2361761625212910" + "'", str13, "2361761625212910");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd9" + "'", str15, "\b\ufffd\ufffd\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1708312528663385" + "'", str17, "1708312528663385");
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
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
        java.lang.String str23 = rSA1.encrypt("\004\u0757\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "628157183764907073540778566190" + "'", str9, "628157183764907073540778566190");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33554497923064000000" + "'", str13, "33554497923064000000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "698549619024548" + "'", str19, "698549619024548");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\030\ufffdH\037\"\ufffd" + "'", str21, "\003\030\ufffdH\037\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "183799828425046" + "'", str23, "183799828425046");
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.decrypt("429740296");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\f\ufffd\ufffdW\013\ufffd\ufffdw\037" + "'", str5, "\f\ufffd\ufffdW\013\ufffd\ufffdw\037");
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("15573850693655");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("264863117025037959468884013668");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\u79e7>g" + "'", str11, "\005\ufffd\u79e7>g");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1027631714189473" + "'", str13, "1027631714189473");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffds\013\f\ufffd\ufffd\ufffd" + "'", str17, "\007\ufffd\ufffds\013\f\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("208");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("1563226434239877");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\006\ufffdl\005\ufffd\ufffd2" + "'", str9, "\004\006\ufffdl\005\ufffd\ufffd2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44152292790111941675967555543" + "'", str13, "44152292790111941675967555543");
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        java.lang.String str9 = rSA1.encrypt("825110335461462544760601940215");
        java.lang.String str11 = rSA1.encrypt("1552988480642433");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd ");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4977612986" + "'", str3, "4977612986");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3570713075" + "'", str7, "3570713075");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3308255594" + "'", str9, "3308255594");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3868086845" + "'", str11, "3868086845");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2845259510" + "'", str13, "2845259510");
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
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
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "143190948579157" + "'", str7, "143190948579157");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33698267" + "'", str13, "33698267");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\u029du" + "'", str15, "\000\ufffd\ufffd\u029du");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\017\ufffd\u031a\001\ufffd" + "'", str17, "\t\017\ufffd\u031a\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\027\ufffd\ufffd" + "'", str19, "\001\ufffd\ufffd\027\ufffd\ufffd");
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
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
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1827544636429500" + "'", str7, "1827544636429500");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "140" + "'", str19, "140");
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str5 = rSA1.encrypt("\n\007\ufffdG\005\ufffd$K\020\ufffd|7\013");
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("1364942359434675");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "21992939126774212384504650459" + "'", str5, "21992939126774212384504650459");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2243619908397911" + "'", str9, "2243619908397911");
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("488269800592697");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "67782294631079" + "'", str7, "67782294631079");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "632" + "'", str15, "632");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1804215952688068" + "'", str19, "1804215952688068");
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("1021508253829588");
        java.lang.String str17 = rSA1.decrypt("55073177600000");
        java.lang.String str19 = rSA1.decrypt("2251185751828143");
        java.lang.String str21 = rSA1.decrypt("92863431994950947822828330387");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1904678453502446" + "'", str7, "1904678453502446");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\u031ct" + "'", str9, "\001\ufffd\ufffd\u031ct");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1886442809903127" + "'", str13, "1886442809903127");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2749709069721538" + "'", str15, "2749709069721538");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\0020" + "'", str17, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\t\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\001\t\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ufffd" + "'", str21, "\002\ufffd\ufffd");
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("275650827612592659521534319728");
        java.lang.String str13 = rSA1.encrypt("2033326571273066");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "286" + "'", str5, "286");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "309" + "'", str7, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\022\ufffd\ufffd\ufffd+Ob\033\ufffd" + "'", str11, "\022\ufffd\ufffd\ufffd+Ob\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8021984898836661305864986227" + "'", str13, "8021984898836661305864986227");
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("4");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("2411260992603826");
        java.lang.String str17 = rSA1.encrypt("1291865181882013");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "140608" + "'", str11, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1113317713" + "'", str15, "1113317713");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "37721273" + "'", str17, "37721273");
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("366659386383014");
        java.lang.String str13 = rSA1.encrypt("\001d");
        java.lang.String str15 = rSA1.encrypt("100808031796894");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "271" + "'", str13, "271");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "264" + "'", str15, "264");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.decrypt("416175732479790270497901975791");
        java.lang.String str9 = rSA1.encrypt("491597882470490509387393294253");
        java.lang.String str11 = rSA1.decrypt("332892179453072453431910072674");
        java.lang.String str13 = rSA1.encrypt("779678916");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "f,\004\ufffd\ufffd\ufffd\000\ufffd2E" + "'", str3, "f,\004\ufffd\ufffd\ufffd\000\ufffd2E");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "137069217954317281665111287053" + "'", str5, "137069217954317281665111287053");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffdIC\177\ufffd\201\ufffd\r\ufffd" + "'", str7, "\004\ufffdIC\177\ufffd\201\ufffd\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "175772154478044275401156782971" + "'", str9, "175772154478044275401156782971");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\u06c9\ufffd\u07fb\ufffd\ufffd\ufffd\ufffd!" + "'", str11, "\004\u06c9\ufffd\u07fb\ufffd\ufffd\ufffd\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "136796020253812033350882453401" + "'", str13, "136796020253812033350882453401");
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffdN\033\ufffd\u062a");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("224495630513799910487095884514");
        java.lang.String str15 = rSA1.encrypt("474495743389303022429066728937");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\bkF" + "'", str5, "\000\ufffd\bkF");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6567880942" + "'", str7, "6567880942");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6417600317" + "'", str9, "6417600317");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144115661695539871828387882529" + "'", str13, "144115661695539871828387882529");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "349774380726341712788445165559" + "'", str15, "349774380726341712788445165559");
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("546441400885176648772586357406");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("688");
        java.lang.String str19 = rSA1.decrypt("820266544164791899762265317897");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!" + "'", str7, "!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2" + "'", str9, "2");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "H" + "'", str13, "H");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\020\ufffd\u01cf\ufffd\035\u07c5Y" + "'", str17, "\004\ufffd\ufffd\020\ufffd\u01cf\ufffd\035\u07c5Y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\\\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\004\ufffd\ufffd\\\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd\u02c0\ufffd\ufffd\007,");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("815487733353957");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd_");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"9Z?_\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "336" + "'", str7, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "388" + "'", str9, "388");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd#" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd#");
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
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
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "399509793852052169794455322925" + "'", str9, "399509793852052169794455322925");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\027\ufffd\ufffd\ufffd\ufffd(" + "'", str11, "\004\027\ufffd\ufffd\ufffd\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "354353699050853794196076172906" + "'", str13, "354353699050853794196076172906");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001_\004\ufffd\ufffdD\003\ufffd@Q" + "'", str15, "\001_\004\ufffd\ufffdD\003\ufffd@Q");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "126620796563673995758362184177" + "'", str19, "126620796563673995758362184177");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "126330474105720117168831455672" + "'", str21, "126330474105720117168831455672");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\032\ufffd\ufffd\u042c\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\001\032\ufffd\ufffd\u042c\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "499320735953512606720312135655" + "'", str25, "499320735953512606720312135655");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "97903637081415946195959459216" + "'", str27, "97903637081415946195959459216");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("292007140694737696201256199778");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\b\ufffd\ufffd\u04ac\ufffd\036" + "'", str3, "\b\ufffd\ufffd\u04ac\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2865870077114545" + "'", str5, "2865870077114545");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1492391481376698" + "'", str7, "1492391481376698");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd8\\\ufffd" + "'", str9, "\003\ufffd8\\\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\ufffd^\006\ufffd\ufffd" + "'", str11, "\013\ufffd^\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd-8" + "'", str13, "\005\ufffd\ufffd\ufffd-8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2259256941070693" + "'", str15, "2259256941070693");
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("10606287702275894954582520061");
        java.lang.String str19 = rSA1.decrypt("691019171402730790365030190926");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140608" + "'", str9, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "175616000" + "'", str11, "175616000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "433631510543783430076261252255" + "'", str13, "433631510543783430076261252255");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\027\ufffd\ufffd\ufffd9F\026\u4b69\ufffd" + "'", str17, "\004\027\ufffd\ufffd\ufffd9F\026\u4b69\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\013\016\ufffd\ufffd" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\013\016\ufffd\ufffd");
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\r\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("576");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n\ufffd\ufffd\ufffd+\002\ufffd\005HW" + "'", str11, "\n\ufffd\ufffd\ufffd+\002\ufffd\005HW");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "75754234820568329912506618190" + "'", str13, "75754234820568329912506618190");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "674673301270403163989509420077" + "'", str15, "674673301270403163989509420077");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "779233193107977021403081118091" + "'", str17, "779233193107977021403081118091");
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("612697493508374");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u062e\ufffd\036" + "'", str3, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u062e\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "736751555659626518883661114478" + "'", str5, "736751555659626518883661114478");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "675931623392569818798358541573" + "'", str7, "675931623392569818798358541573");
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.encrypt("1555947862956257");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\002\002");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10041208173" + "'", str3, "10041208173");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9189045023" + "'", str7, "9189045023");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\035\ufffd" + "'", str9, "\001\ufffd\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3593592821120706" + "'", str13, "3593592821120706");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "504730526463890" + "'", str15, "504730526463890");
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("2821440436690149");
        java.lang.String str5 = rSA1.encrypt("2851293010");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "19" + "'", str3, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "307" + "'", str5, "307");
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.String str15 = rSA1.decrypt("3938980639167");
        java.lang.String str17 = rSA1.decrypt("775860831955899");
        java.lang.String str19 = rSA1.decrypt("1872897855942201");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "202428983436012784789485820662" + "'", str9, "202428983436012784789485820662");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "251755522677366329598638410808" + "'", str11, "251755522677366329598638410808");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "20047677436300630993011737279" + "'", str13, "20047677436300630993011737279");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "?" + "'", str15, "?");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003I,EfR2^\r9\003\ufffd\r" + "'", str17, "\003I,EfR2^\r9\003\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\017\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd\032" + "'", str19, "\005\017\ufffd\ufffd\ufffd\ufffd\037\ufffd\ufffd\032");
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        java.lang.String str15 = rSA1.decrypt("603423657");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1351851338525851" + "'", str7, "1351851338525851");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "284321801" + "'", str11, "284321801");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd" + "'", str13, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd");
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("1603037267069329");
        java.lang.String str15 = rSA1.encrypt("1602403727");
        java.lang.String str17 = rSA1.decrypt("120210931294819567914781828560");
        java.lang.String str19 = rSA1.decrypt("1956176948820165");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "805201438294224" + "'", str7, "805201438294224");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "12692000364" + "'", str13, "12692000364");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9576691842" + "'", str15, "9576691842");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd}\000" + "'", str17, "\ufffd}\000");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffdM\020" + "'", str19, "\001\ufffdM\020");
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("1260379134508742");
        java.lang.String str15 = rSA1.decrypt("755629646");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "552624662509962529423186183393" + "'", str9, "552624662509962529423186183393");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "435600497178770030959411598479" + "'", str11, "435600497178770030959411598479");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "310718947912493567226602042304" + "'", str13, "310718947912493567226602042304");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\023\ufffd\ufffd\ufffd\ufffd\023\ufffd?\r" + "'", str15, "\004\ufffd\023\ufffd\ufffd\ufffd\ufffd\023\ufffd?\r");
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
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
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "970662604127353" + "'", str11, "970662604127353");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "247410031157713" + "'", str13, "247410031157713");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1843417002268949" + "'", str15, "1843417002268949");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "618078253635748773983191495672" + "'", str19, "618078253635748773983191495672");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\ufffd\ufffdh" + "'", str21, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\ufffd\ufffdh");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\f\b\ufffd^\n\ufffd\017z73" + "'", str23, "\f\b\ufffd^\n\ufffd\017z73");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "237" + "'", str27, "237");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("48");
        java.lang.String str13 = rSA1.decrypt("59761034433964984688906952333");
        java.lang.String str15 = rSA1.encrypt("548110071361613660316881187141");
        java.lang.String str17 = rSA1.encrypt("490");
        java.lang.String str19 = rSA1.encrypt("802171763472868");
        java.lang.String str21 = rSA1.encrypt("(");
        java.lang.String str23 = rSA1.decrypt("19361709036883565719920867399");
        java.lang.String str25 = rSA1.decrypt("24");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "637965637438646878480803962778" + "'", str9, "637965637438646878480803962778");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "426905927000960237568" + "'", str11, "426905927000960237568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005=\016\ufffd\ufffd=\t\ufffd\ufffd\ufffds" + "'", str13, "\005=\016\ufffd\ufffd=\t\ufffd\ufffd\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "345865087510092849505639406652" + "'", str15, "345865087510092849505639406652");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "195943245809474727029509115922" + "'", str17, "195943245809474727029509115922");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "24614215881042445233253583863" + "'", str19, "24614215881042445233253583863");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "102400000" + "'", str21, "102400000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\003\n\ufffd\ufffd\022\ufffd\023\ufffd" + "'", str23, "\003\n\ufffd\ufffd\022\ufffd\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd^dR\024\ufffd\ufffd\ufffd" + "'", str25, "\ufffd^dR\024\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        java.lang.String str15 = rSA1.decrypt("299");
        java.lang.String str17 = rSA1.decrypt("129");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "33" + "'", str11, "33");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001=" + "'", str15, "\001=");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "O" + "'", str17, "O");
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\026\ufffd\ufffd\ufffd\ufffd/U1\022\ufffd");
        java.lang.String str19 = rSA1.encrypt("18026990752909779991013431080");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "386936145202973" + "'", str7, "386936145202973");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "827951316542331" + "'", str13, "827951316542331");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2524785320239452" + "'", str15, "2524785320239452");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2749876300588318" + "'", str17, "2749876300588318");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1900882628475589" + "'", str19, "1900882628475589");
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("3775398402");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffdqV\026\ufffd\001\ufffd\f\ufffd\025\r");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "190806304335748291685542146225" + "'", str9, "190806304335748291685542146225");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "378638661462101072211641085911" + "'", str11, "378638661462101072211641085911");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffdD" + "'", str15, "\000\ufffd\ufffd\ufffdD");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2462719699" + "'", str17, "2462719699");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("11695976753");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "385" + "'", str9, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3582249667" + "'", str13, "3582249667");
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("\007y\031\ufffd-\r\ufffd\ufffd\u0778\ufffd");
        java.lang.String str9 = rSA1.decrypt("227");
        java.lang.String str11 = rSA1.encrypt("308422204620092985527502288542");
        java.lang.String str13 = rSA1.encrypt("2496260200544749");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "211387393302587499168404702549" + "'", str5, "211387393302587499168404702549");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "441818713502364896645867263918" + "'", str7, "441818713502364896645867263918");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\u31d8\ufffd\ufffd\ufffd\n\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\u31d8\ufffd\ufffd\ufffd\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "48482427850595429622173926187" + "'", str11, "48482427850595429622173926187");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "773344792559371699124746057074" + "'", str13, "773344792559371699124746057074");
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.decrypt("259");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3341329657736912" + "'", str7, "3341329657736912");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "19465109" + "'", str11, "19465109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd" + "'", str15, "\ufffd\ufffd");
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str17 = rSA1.encrypt("\001\u0736\ufffd\ufffd\ufffd\ufffdf\016\023\036\007");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("V\002l<");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"V?l<\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "69344566726129796861090634041" + "'", str9, "69344566726129796861090634041");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\u058f\ufffd\ufffd\ufffd\t\ufffdl" + "'", str11, "\001\u058f\ufffd\ufffd\ufffd\t\ufffdl");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "334805586052834999005697594064" + "'", str15, "334805586052834999005697594064");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "167448453653554425874912758908" + "'", str17, "167448453653554425874912758908");
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("969465452");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "978421320860829" + "'", str7, "978421320860829");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "828740128546797" + "'", str13, "828740128546797");
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffdtV^\021\ufffd\177\ufffd");
        java.lang.String str13 = rSA1.encrypt("328502517086339993872400506330");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "405803536485611889405448895071" + "'", str11, "405803536485611889405448895071");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "514151854012594548242081261209" + "'", str13, "514151854012594548242081261209");
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("940030954591878");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffd(\r\021\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"w?(\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1231054630048606" + "'", str7, "1231054630048606");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1793157059873910" + "'", str9, "1793157059873910");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1379338842389470" + "'", str11, "1379338842389470");
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
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
        java.lang.String str21 = rSA1.encrypt("313390026649007");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "362" + "'", str11, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "262450334957875522924668741587" + "'", str17, "262450334957875522924668741587");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "332868448225851750261409624057" + "'", str19, "332868448225851750261409624057");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "366470276622254829732351143250" + "'", str21, "366470276622254829732351143250");
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
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
        java.lang.String str25 = rSA1.encrypt("\001\ufffd\ufffd\u0513\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52210460051450571378771773481" + "'", str9, "52210460051450571378771773481");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52210460051450571378771773481" + "'", str11, "52210460051450571378771773481");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\013\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "417885451692796990788071708119" + "'", str15, "417885451692796990788071708119");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "423775366078449677343558557044" + "'", str21, "423775366078449677343558557044");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b" + "'", str23, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "239208146127421978554945639737" + "'", str25, "239208146127421978554945639737");
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.decrypt("1198965058209000");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "427152295362030206445140525912" + "'", str3, "427152295362030206445140525912");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffdR\003\u0734\ufffd\u0521\ufffd\036\ufffd" + "'", str5, "\002\ufffdR\003\u0734\ufffd\u0521\ufffd\036\ufffd");
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
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
        rSA1.generateKeys((int) '4');
        java.lang.String str25 = rSA1.decrypt("481319624228338601442651284641");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "67253801260233789709372209033" + "'", str9, "67253801260233789709372209033");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "67253801260233789709372209033" + "'", str11, "67253801260233789709372209033");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\036LH\b\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\036LH\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "628478774387722039743300528846" + "'", str15, "628478774387722039743300528846");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\n\ufffd" + "'", str17, "\002\ufffd\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "174084875694755995332098956662" + "'", str19, "174084875694755995332098956662");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "384203341804725291328266232348" + "'", str21, "384203341804725291328266232348");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\036\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\002\036\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("239");
        java.lang.String str11 = rSA1.encrypt("401654989267724659354349777255");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "383511623703263" + "'", str7, "383511623703263");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\025\ud8a6\udc6b" + "'", str9, "\004\ufffd\025\ud8a6\udc6b");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1142051814285091" + "'", str11, "1142051814285091");
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.decrypt("629119262626298670614212798439");
        java.lang.String str15 = rSA1.decrypt("136050176823069173982770643607");
        java.lang.String str17 = rSA1.encrypt("2825601433494882");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\177\ufffd\ufffd" + "'", str11, "\ufffd\ufffd\ufffd\ufffd\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003'E\004\ufffd\ufffd\ufffd\ufffd\ufffd\020" + "'", str13, "\003'E\004\ufffd\ufffd\ufffd\ufffd\ufffd\020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\u0329\ufffd*+\322\ufffdK" + "'", str15, "\004\ufffd\u0329\ufffd*+\322\ufffdK");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "49622439958132580401304193960" + "'", str17, "49622439958132580401304193960");
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
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
        java.lang.String str25 = rSA1.decrypt("377");
        rSA1.generateKeys((int) 'a');
        java.lang.String str29 = rSA1.decrypt("1295871879356944");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270273411070806" + "'", str7, "270273411070806");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\000X" + "'", str9, "\002\ufffd\ufffd\ufffd\000X");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "447961716698332" + "'", str13, "447961716698332");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "648809079981567" + "'", str17, "648809079981567");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "449997867646302" + "'", str19, "449997867646302");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\ufffd\ufffd\ufffd\tA" + "'", str21, "\004\ufffd\ufffd\ufffd\tA");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd" + "'", str25, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdg`J" + "'", str29, "\003\ufffd\ufffd\ufffd\ufffdg`J");
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.decrypt("429740296");
        java.lang.String str7 = rSA1.encrypt("g\022\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\007\ufffd\ufffd\022\ufffd\ufffd\025\ufffd\ufffd\ufffd" + "'", str5, "\007\ufffd\ufffd\022\ufffd\ufffd\025\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "267531626842851571233145935884" + "'", str7, "267531626842851571233145935884");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "427956401601047964953258446582" + "'", str9, "427956401601047964953258446582");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
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
        java.lang.String str23 = rSA1.encrypt("64520429774428");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "211929994058198858194963866647" + "'", str9, "211929994058198858194963866647");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "147340842791044333158976960723" + "'", str11, "147340842791044333158976960723");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50899398823780846855557199336" + "'", str15, "50899398823780846855557199336");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "477692141927879222033304239929" + "'", str17, "477692141927879222033304239929");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "214294174231614204158271141216" + "'", str21, "214294174231614204158271141216");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "144938735091257682780323028958" + "'", str23, "144938735091257682780323028958");
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("346125639250942006569169281670");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "191" + "'", str5, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "28" + "'", str7, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "185" + "'", str11, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "286" + "'", str13, "286");
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.encrypt("x\001\005\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10068730970" + "'", str5, "10068730970");
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\001\003\ufffdl\\\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??Z?l\\?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "567076961497131" + "'", str7, "567076961497131");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1683306644368301" + "'", str13, "1683306644368301");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\u02e3\ufffd\004" + "'", str15, "\002\ufffd\ufffd\u02e3\ufffd\004");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\r|(\026\ufffdH" + "'", str17, "\r|(\026\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3239211510111898" + "'", str19, "3239211510111898");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2486756402758125" + "'", str21, "2486756402758125");
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("503");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1844250903706879" + "'", str11, "1844250903706879");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "250768717294798" + "'", str13, "250768717294798");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("787439318926031104812953602702");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd8X\031$\001");
        java.lang.String str19 = rSA1.decrypt("2500784063619124");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_" + "'", str11, "_");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "362" + "'", str17, "362");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001P" + "'", str19, "\001P");
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("370");
        java.lang.String str17 = rSA1.encrypt("844202742226834");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "323698550463979326088977446256" + "'", str9, "323698550463979326088977446256");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5\023\017\ufffd\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffd" + "'", str11, "5\023\017\ufffd\ufffd\ufffd\ufffd\033\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "350219186673886779003114316604" + "'", str13, "350219186673886779003114316604");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\036\ufffd\ufffd\006!F!\005" + "'", str15, "\000\ufffd\ufffd\036\ufffd\ufffd\006!F!\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "274334561058435103215437290743" + "'", str17, "274334561058435103215437290743");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("574410298724081");
        java.lang.String str17 = rSA1.decrypt("455316315712794");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1128835274000334" + "'", str7, "1128835274000334");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str17, "\000\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
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
        rSA1.generateKeys((int) '4');
        java.lang.String str23 = rSA1.encrypt("507735161454502401211578520289");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "833650380576130" + "'", str7, "833650380576130");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "765482705656117" + "'", str13, "765482705656117");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2178014943908636" + "'", str15, "2178014943908636");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2997898137241939" + "'", str17, "2997898137241939");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1217817909314869" + "'", str19, "1217817909314869");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2024773207511607" + "'", str23, "2024773207511607");
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
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
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "223567105729784176150313212031" + "'", str9, "223567105729784176150313212031");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffdS$N\r_\006\ufffdc" + "'", str11, "\002\ufffd\ufffd\ufffdS$N\r_\006\ufffdc");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "301728815832838564895323109705" + "'", str13, "301728815832838564895323109705");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50115026385866014908186111695" + "'", str15, "50115026385866014908186111695");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\027\ufffdP\034\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\027\ufffdP\034\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "50435848695154607592576948977" + "'", str19, "50435848695154607592576948977");
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.decrypt("829");
        java.lang.String str5 = rSA1.encrypt("?");
        java.lang.String str7 = rSA1.encrypt("2372308538763998");
        java.lang.String str9 = rSA1.decrypt("557470480640898599124170393563");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001kt\037\ufffd\247\ufffd\ufffd!" + "'", str3, "\001kt\037\ufffd\247\ufffd\ufffd!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "250047" + "'", str5, "250047");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "377117138346683403604195474143" + "'", str7, "377117138346683403604195474143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\001\ufffdtmE" + "'", str9, "\002\ufffd\ufffd\ufffd\001\ufffdtmE");
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
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
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "513193872758990742546571333689" + "'", str9, "513193872758990742546571333689");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "245931752549498057275615786142" + "'", str11, "245931752549498057275615786142");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "211226639935010515200348251346" + "'", str13, "211226639935010515200348251346");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "54" + "'", str17, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "170" + "'", str19, "170");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "378" + "'", str21, "378");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\035" + "'", str23, "\035");
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
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
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "546898238164961" + "'", str7, "546898238164961");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1045685859345403" + "'", str13, "1045685859345403");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1483548219527549" + "'", str15, "1483548219527549");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "379617363544217" + "'", str17, "379617363544217");
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
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
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "599981940448187381554319868769" + "'", str9, "599981940448187381554319868769");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\002\ufffd\026\ufffd\ufffd\ufffd\ufffd\ufffdOy" + "'", str11, "\006\002\ufffd\026\ufffd\ufffd\ufffd\ufffd\ufffdOy");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("638834298324326143582676832107");
        java.lang.String str15 = rSA1.encrypt("287453852200194401992539143141");
        java.lang.String str17 = rSA1.decrypt("838185870748435");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8028238774" + "'", str3, "8028238774");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "140608" + "'", str5, "140608");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3418181049" + "'", str7, "3418181049");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\u0204" + "'", str9, "\001\ufffd\ufffd\u0204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\006\ufffd\ufffdI\n\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\006\ufffd\ufffdI\n\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "350685093896418403947578341163" + "'", str15, "350685093896418403947578341163");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\000\ufffd\t\ufffdQ\001\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\000\ufffd\t\ufffdQ\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
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
        java.lang.String str25 = rSA1.decrypt("377");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1933465116642134" + "'", str7, "1933465116642134");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffdK\036\ufffd,j" + "'", str9, "\004\ufffdK\036\ufffd,j");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "489556870096247" + "'", str11, "489556870096247");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "541769813111714" + "'", str13, "541769813111714");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2433291883106148" + "'", str15, "2433291883106148");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "942546494461886" + "'", str17, "942546494461886");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "790930684623035" + "'", str19, "790930684623035");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\ufffd\ufffd\006\ufffd" + "'", str21, "\007\ufffd\ufffd\ufffd\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\b\ufffd\u0582\ufffd\ufffd" + "'", str23, "\b\ufffd\u0582\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str25, "\003\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
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
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "927847395708126918264720470699" + "'", str9, "927847395708126918264720470699");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "926752963357188172053286954369" + "'", str11, "926752963357188172053286954369");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t6{p\006\ufffd\ufffd\"\ufffd\ufffd" + "'", str13, "\t6{p\006\ufffd\ufffd\"\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "380656724652572143714996981901" + "'", str17, "380656724652572143714996981901");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "660650993188959836717063964079" + "'", str19, "660650993188959836717063964079");
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.decrypt("331999810103969");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1890813111891369" + "'", str7, "1890813111891369");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\007\ufffd\ufffd\ufffd" + "'", str9, "\003\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18191447" + "'", str11, "18191447");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\026\ufffd" + "'", str13, "\003\ufffd\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffdv" + "'", str15, "\007\ufffd\ufffd\ufffdv");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "248" + "'", str15, "248");
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.encrypt("3060553596769532");
        java.lang.String str7 = rSA1.encrypt("2354813854350387");
        java.lang.String str9 = rSA1.encrypt("61293188598388456186436251765");
        java.lang.String str11 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr\013\ufffd");
        java.lang.String str13 = rSA1.encrypt("208");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd`\f\022\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("339257337319992927037122241849");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffdY-\013\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "202" + "'", str5, "202");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "183" + "'", str7, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "235" + "'", str9, "235");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "62" + "'", str11, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "103" + "'", str13, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "163" + "'", str15, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2701867360104311" + "'", str7, "2701867360104311");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "355" + "'", str15, "355");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "289" + "'", str17, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001a" + "'", str21, "\001a");
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
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
        java.lang.String str21 = rSA1.encrypt("677");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3353953919162320" + "'", str7, "3353953919162320");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "311746582916423" + "'", str13, "311746582916423");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "679840827337524" + "'", str15, "679840827337524");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "577171806189715" + "'", str17, "577171806189715");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1819267905792520" + "'", str21, "1819267905792520");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("441");
        java.lang.String str13 = rSA1.decrypt("2448943656306246");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("225674565341323165744277133024");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "231196829339873477184463850628" + "'", str9, "231196829339873477184463850628");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd9" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd9");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\005\ufffd\ufffd\ufffd" + "'", str13, "\007\ufffd\ufffd\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001O" + "'", str17, "\001O");
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1389973222410868" + "'", str7, "1389973222410868");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\007\ufffd\037\ufffd)" + "'", str13, "\004\007\ufffd\037\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd \t\ufffd\ufffdw" + "'", str15, "\000\ufffd \t\ufffd\ufffdw");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1138472357160784" + "'", str17, "1138472357160784");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "160740284941249" + "'", str19, "160740284941249");
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "408600521965888041728696157990" + "'", str9, "408600521965888041728696157990");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "499970078988140626043769343531" + "'", str11, "499970078988140626043769343531");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "60732036616288839617836811233" + "'", str13, "60732036616288839617836811233");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "278491917590586698730168990481" + "'", str15, "278491917590586698730168990481");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "240185431195076250737159989119" + "'", str17, "240185431195076250737159989119");
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("539");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "96806643207734192549786481855" + "'", str9, "96806643207734192549786481855");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "347722061058537791588664069684" + "'", str11, "347722061058537791588664069684");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("7929141622");
        java.lang.String str15 = rSA1.decrypt("361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "337" + "'", str11, "337");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "261" + "'", str13, "261");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000" + "'", str15, "\000");
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("1204620642");
        java.lang.String str19 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "470838316280967324915699996403" + "'", str9, "470838316280967324915699996403");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffdz1\020\ufffd\ufffd\026\ufffd\ufffd" + "'", str11, "\005\ufffdz1\020\ufffd\ufffd\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\002\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\005\002\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3V\0303\rl\r\ufffd\030\ufffd" + "'", str17, "3V\0303\rl\r\ufffd\030\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "17776048577960482073267873057" + "'", str19, "17776048577960482073267873057");
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\u02fe\002p" + "'", str13, "\001\ufffd\ufffd\u02fe\002p");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1238238389051989" + "'", str15, "1238238389051989");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5592366564487" + "'", str17, "5592366564487");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2250666132625" + "'", str19, "2250666132625");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.encrypt("\006\016\ufffd\ufffda2");
        java.lang.String str17 = rSA1.decrypt("3546049091");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\004vi+\003" + "'", str11, "\006\ufffd\ufffd\004vi+\003");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "477481750465376436354834598525" + "'", str13, "477481750465376436354834598525");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "163110219417149252302463791240" + "'", str15, "163110219417149252302463791240");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd]0" + "'", str17, "\006\ufffd\ufffd\ufffd]0");
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("1204620642");
        java.lang.String str19 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "286713870101883631419324176107" + "'", str9, "286713870101883631419324176107");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\u05e1$D\025\u0760\ufffd\ufffdk" + "'", str11, "\001\u05e1$D\025\u0760\ufffd\ufffdk");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\024\ufffd\ufffd\u0635\037\ufffdN" + "'", str13, "\006\ufffd\024\ufffd\ufffd\u0635\037\ufffdN");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\023\ufffd\ufffd\ufffd\ufffd\ufffdcm" + "'", str17, "\023\ufffd\ufffd\ufffd\ufffd\ufffdcm");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "12276574943800692673267287741" + "'", str19, "12276574943800692673267287741");
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
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
        java.lang.String str21 = rSA1.decrypt("11");
        java.lang.String str23 = rSA1.decrypt("758210078578159280931259695371");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd>\033\001\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd>\033\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5825313612444686982946639636" + "'", str13, "5825313612444686982946639636");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "66" + "'", str19, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001z" + "'", str23, "\001z");
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("6539556310");
        java.lang.String str5 = rSA1.decrypt("882662503");
        java.lang.String str7 = rSA1.encrypt("1144232111389352");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001k" + "'", str5, "\001k");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "246" + "'", str7, "246");
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("538621452366062192513302577482");
        java.lang.String str17 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdW2");
        java.lang.String str19 = rSA1.encrypt("\002\016\ufffd\ufffd\ufffd\"\ufffd`\032\ufffdO5");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "269925530419645144316668898767" + "'", str9, "269925530419645144316668898767");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "432073635879924152413947726393" + "'", str11, "432073635879924152413947726393");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "860219461507820703080225324890" + "'", str13, "860219461507820703080225324890");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\034\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\034\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "82114471051721618197243589066" + "'", str17, "82114471051721618197243589066");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97753685939865692533596775775" + "'", str19, "97753685939865692533596775775");
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("5447816862");
        java.lang.String str19 = rSA1.encrypt("331798109808860");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "761455376541144" + "'", str7, "761455376541144");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "5852351873" + "'", str13, "5852351873");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4212481218" + "'", str15, "4212481218");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3527258674" + "'", str17, "3527258674");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "278766996" + "'", str19, "278766996");
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
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
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001[" + "'", str11, "\001[");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "58" + "'", str15, "58");
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd<");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.decrypt("10606287702275894954582520061");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35261993462004858028271074125" + "'", str13, "35261993462004858028271074125");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd\r\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd\r\ufffd\ufffd");
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
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
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "439" + "'", str5, "439");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h\013\ufffd\ufffd\ufffd\ufffdAF" + "'", str11, "h\013\ufffd\ufffd\ufffd\ufffdAF");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8614753943433049594702787747" + "'", str13, "8614753943433049594702787747");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "159" + "'", str19, "159");
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
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
        java.lang.String str21 = rSA1.encrypt("2284507059");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1252579981174378" + "'", str7, "1252579981174378");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\024" + "'", str11, "\001\024");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0015" + "'", str13, "\0015");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "108" + "'", str17, "108");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "438" + "'", str19, "438");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "385" + "'", str21, "385");
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
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
        java.lang.String str21 = rSA1.decrypt("1710728060");
        java.lang.String str23 = rSA1.decrypt("691614055774462");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "341219315342248" + "'", str7, "341219315342248");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "56839429904027" + "'", str13, "56839429904027");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd" + "'", str19, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001GG1" + "'", str21, "\001GG1");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffdF" + "'", str23, "\ufffdF");
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.decrypt("2484642719825111");
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffd\034\ufffd-!U");
        java.lang.String str23 = rSA1.decrypt("1252276865159201");
        java.lang.String str25 = rSA1.encrypt("560811996527371116456868526406");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2805080287419318" + "'", str7, "2805080287419318");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "391301306722034" + "'", str13, "391301306722034");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "29" + "'", str21, "29");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001G" + "'", str23, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "398" + "'", str25, "398");
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("2448943656306246");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "273" + "'", str15, "273");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\u6a5e\016");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1782486692845557" + "'", str7, "1782486692845557");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "281" + "'", str15, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "518611516546826951399874661054" + "'", str9, "518611516546826951399874661054");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "403317391263694825775064013116" + "'", str11, "403317391263694825775064013116");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "146155391852850499822511885301" + "'", str13, "146155391852850499822511885301");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "50027057370136624516605211407" + "'", str15, "50027057370136624516605211407");
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.decrypt("192569224470580183531005309777");
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("369");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "214" + "'", str7, "214");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19" + "'", str9, "19");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "*" + "'", str11, "*");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "37805074531238270313" + "'", str17, "37805074531238270313");
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        java.lang.String str15 = rSA1.decrypt("618443824774458842838968720878");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\020\ufffd\ufffd\ufffdD");
        java.lang.String str19 = rSA1.encrypt("718772914756829042159802081918");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2131356982751822" + "'", str7, "2131356982751822");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\t" + "'", str15, "\002\t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "299" + "'", str17, "299");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "237" + "'", str19, "237");
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("4334658428");
        java.lang.String str13 = rSA1.encrypt("\001\u03a8\ufffd\ufffd\ufffdx\035\ufffd");
        java.lang.String str15 = rSA1.encrypt("785509947817066");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "524" + "'", str7, "524");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "27185491123569003497231380761" + "'", str11, "27185491123569003497231380761");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44574257067163383253983353985" + "'", str13, "44574257067163383253983353985");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "17497989236573653781145440931" + "'", str15, "17497989236573653781145440931");
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.decrypt("55299950208785589429998926364");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "134" + "'", str15, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\006\ufffd\ufffdZ" + "'", str19, "\002\ufffd\006\ufffd\ufffdZ");
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("3264782225");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("298315469201606");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "757" + "'", str11, "757");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "523" + "'", str15, "523");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\\\ufffd\ufffd\ufffd\024\ufffd\ufffd\007\ufffdU" + "'", str19, "\\\ufffd\ufffd\ufffd\024\ufffd\ufffd\007\ufffdU");
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.encrypt("11519054535");
        java.lang.String str13 = rSA1.decrypt("91678854426503168386094718335");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("1018081255");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "307438240" + "'", str3, "307438240");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "944684310" + "'", str7, "944684310");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffdH" + "'", str9, "\001\ufffd\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9930211188" + "'", str11, "9930211188");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\005" + "'", str13, "\000\ufffd\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd`\036\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd`\036\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\007\ufffd\ufffd\ufffd6\b");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??o??6?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "37555042267653" + "'", str13, "37555042267653");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\\\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\\\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "383" + "'", str3, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffdb\t\ufffd\ufffdM" + "'", str11, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\026\ufffdb\t\ufffd\ufffdM");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "103913220766926212679434483629" + "'", str13, "103913220766926212679434483629");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "469158814072724628427392769716" + "'", str17, "469158814072724628427392769716");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\ufffd\025\ufffd\ufffd\026\ufffd\031" + "'", str19, "\007\ufffd\ufffd\025\ufffd\ufffd\026\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\u028ep\t\ufffdzsv" + "'", str21, "\002\ufffd\u028ep\t\ufffdzsv");
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("618634567082229426892176637695");
        java.lang.String str15 = rSA1.decrypt("1033988105172965");
        java.lang.String str17 = rSA1.encrypt("3105750719");
        java.lang.String str19 = rSA1.decrypt("663118659673004530145366810572");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1593381357260122" + "'", str13, "1593381357260122");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\023\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1548353830071868" + "'", str17, "1548353830071868");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffdh" + "'", str19, "\005\ufffd\ufffdh");
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
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
        java.lang.String str23 = rSA1.decrypt("48402783356415986547604486026");
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "251687317396420375497461346203" + "'", str11, "251687317396420375497461346203");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "524116609794745417099662519636" + "'", str15, "524116609794745417099662519636");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "490465373359509410054328049628" + "'", str19, "490465373359509410054328049628");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001v" + "'", str23, "\001v");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.decrypt("1609305523506661");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "172133550393802628610317632730" + "'", str9, "172133550393802628610317632730");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285025667904411204650997104671" + "'", str13, "285025667904411204650997104671");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\025\021\ufffd\ufffd\ufffd\ufffd\023\004a" + "'", str15, "\002\ufffd\025\021\ufffd\ufffd\ufffd\ufffd\023\004a");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd/-K" + "'", str19, "\007\ufffd\b\ufffd\ufffd\ufffd\ufffd\ufffd/-K");
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str9 = rSA1.decrypt("156420681989455759137605914496");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd&k" + "'", str5, "\002\ufffd&k");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd\000\ufffd\ufffd\037\ufffd\ufffdb?" + "'", str9, "\007\ufffd\ufffd\000\ufffd\ufffd\037\ufffd\ufffdb?");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("142");
        java.lang.String str7 = rSA1.encrypt("276");
        java.lang.String str9 = rSA1.encrypt("172");
        java.lang.String str11 = rSA1.encrypt("5693705465");
        java.lang.String str13 = rSA1.encrypt("1200261676045258");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5416207938" + "'", str3, "5416207938");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "6445603901" + "'", str5, "6445603901");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1850210838" + "'", str7, "1850210838");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2178222399" + "'", str9, "2178222399");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1611248469" + "'", str11, "1611248469");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "820677746" + "'", str13, "820677746");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1792074056760905");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\u04e8\ufffd\ufffd\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1310473051048185" + "'", str7, "1310473051048185");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffdT" + "'", str9, "\003\ufffd\ufffd\ufffdT");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001j" + "'", str13, "\001j");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "154" + "'", str15, "154");
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("366659386383014");
        java.lang.String str15 = rSA1.decrypt("538621452366062192513302577482");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "136155687553857281958966678187" + "'", str9, "136155687553857281958966678187");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "403398824494147966370394620444" + "'", str11, "403398824494147966370394620444");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "17522409050977119377559589881" + "'", str13, "17522409050977119377559589881");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\u053f\ufffd\u0179\ufffd\ufffd\032\006" + "'", str15, "\003\ufffd\u053f\ufffd\u0179\ufffd\ufffd\032\006");
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1792074056760905");
        java.lang.String str15 = rSA1.decrypt("421663632197972441202228182732");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1344708368847449" + "'", str7, "1344708368847449");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\u04f3" + "'", str9, "\006\ufffd\ufffd\u04f3");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "," + "'", str13, ",");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        java.lang.String str13 = rSA1.encrypt("147563026464741632979335701288");
        java.lang.String str15 = rSA1.decrypt("1822649237519567");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "362038341847022036303102480819" + "'", str9, "362038341847022036303102480819");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17845158504167840250382420838" + "'", str11, "17845158504167840250382420838");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "175442041447987662297473235559" + "'", str13, "175442041447987662297473235559");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\016\ufffd\ufffdOl\037\ufffdM\n\ufffd2" + "'", str15, "\004\016\ufffd\ufffdOl\037\ufffdM\n\ufffd2");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
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
        java.lang.String str23 = rSA1.decrypt("502345906021690680168440269415");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1591966353839446" + "'", str7, "1591966353839446");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd" + "'", str9, "\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1154905763836644" + "'", str11, "1154905763836644");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffdZ\n\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffdZ\n\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2432579872179244" + "'", str15, "2432579872179244");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "189" + "'", str19, "189");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        java.lang.String str17 = rSA1.encrypt("4437661730");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2998588731851212" + "'", str7, "2998588731851212");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffdTJ" + "'", str13, "\006\ufffd\ufffdTJ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\u0215r\034\ufffd" + "'", str15, "\004\ufffd\u0215r\034\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1104247704378427" + "'", str17, "1104247704378427");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("8589662889");
        java.lang.String str13 = rSA1.encrypt("7772915241");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("765314849130516");
        java.lang.String str19 = rSA1.decrypt("9425723813");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "515730133112201609891529349298" + "'", str9, "515730133112201609891529349298");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\003\013\ufffd\t\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\003\013\ufffd\t\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10410803618639590804785503260" + "'", str13, "10410803618639590804785503260");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "T" + "'", str19, "T");
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("257");
        java.lang.String str17 = rSA1.decrypt("608858562594023");
        java.lang.String str19 = rSA1.encrypt("3873613222696433919289856324");
        java.lang.String str21 = rSA1.decrypt("3988510568");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "983620123187344" + "'", str7, "983620123187344");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "228" + "'", str15, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "q" + "'", str17, "q");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "319" + "'", str19, "319");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001*" + "'", str21, "\001*");
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.encrypt("M\021\ufffd");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\u033f\ufffd\ufffd" + "'", str3, "\005\ufffd\ufffd\u033f\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1185510204323786" + "'", str5, "1185510204323786");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1525746900987549" + "'", str7, "1525746900987549");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\033\ufffd(\177" + "'", str9, "\ufffd\033\ufffd(\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + ")\033\021\ufffd\ufffd" + "'", str11, ")\033\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\r\ufffd\ufffdD\032" + "'", str13, "\003\r\ufffd\ufffdD\032");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1050270296553053" + "'", str15, "1050270296553053");
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("207427644475216000163013074574");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "560181193244574288997287385385" + "'", str9, "560181193244574288997287385385");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\\\ufffd\036\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd\ufffd\ufffd\\\ufffd\036\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "246792522784585949442206385710" + "'", str13, "246792522784585949442206385710");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "43484497782904612327652372016" + "'", str15, "43484497782904612327652372016");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001,k\013\005\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\001,k\013\005\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        java.lang.String str15 = rSA1.decrypt("618443824774458842838968720878");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\020\ufffd\ufffd\ufffdD");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "253760750074930" + "'", str7, "253760750074930");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0011" + "'", str11, "\0011");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "j" + "'", str13, "j");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "153" + "'", str17, "153");
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
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
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "99565256176549578575923821277" + "'", str9, "99565256176549578575923821277");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "242471803183235978349259941147" + "'", str11, "242471803183235978349259941147");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "67108864" + "'", str13, "67108864");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "916201165355914045479043561727" + "'", str15, "916201165355914045479043561727");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "930403191889234267504909686726" + "'", str17, "930403191889234267504909686726");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005=f\r\ufffd\ufffd8" + "'", str21, "\005=f\r\ufffd\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\u02a4\ufffd\ufffdC\035\ufffd\ufffdX" + "'", str23, "\004\u02a4\ufffd\ufffdC\035\ufffd\ufffdX");
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("556443160399275552123079795843");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "136" + "'", str3, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002Q" + "'", str5, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "11558430641120503673832387628" + "'", str17, "11558430641120503673832387628");
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("100935160444972936488645408652");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\u05d4\017\ufffd\ufffd\007\ufffd" + "'", str7, "\002\ufffd\ufffd\u05d4\017\ufffd\ufffd\007\ufffd");
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "546733804542548" + "'", str7, "546733804542548");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "I" + "'", str11, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002t" + "'", str13, "\002t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "756952508588792537136764142571" + "'", str17, "756952508588792537136764142571");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "363609994439059319130727122405" + "'", str19, "363609994439059319130727122405");
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
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
        java.lang.String str23 = rSA1.encrypt("\b\ufffd?\\\ufffd\ufffd\ufffdW\002");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "779343274247697089753533652442" + "'", str9, "779343274247697089753533652442");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "434207175877437028950826036814" + "'", str11, "434207175877437028950826036814");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "807457762495157738114405726310" + "'", str13, "807457762495157738114405726310");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "244" + "'", str17, "244");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "267" + "'", str19, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "390" + "'", str21, "390");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "387" + "'", str23, "387");
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("635442583753138455625950920532");
        java.lang.String str7 = rSA1.encrypt("\003\016D?\n\ufffd\005\005\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?v?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006W\001\231\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034" + "'", str3, "\006W\001\231\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "564829726582511267770828872296" + "'", str5, "564829726582511267770828872296");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "352849888508461569021545858201" + "'", str7, "352849888508461569021545858201");
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "433804832109779075293482319899" + "'", str9, "433804832109779075293482319899");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "433804832109779075293482319899" + "'", str11, "433804832109779075293482319899");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\025\ufffd\ufffd\ufffd\026\031\ufffd\ufffd\030\ufffd" + "'", str13, "\003\ufffd\025\ufffd\ufffd\ufffd\026\031\ufffd\ufffd\030\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd8\013\ufffd\ufffd\ufffd\ufffd\ufffd\005" + "'", str15, "\007\ufffd\ufffd8\013\ufffd\ufffd\ufffd\ufffd\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "570913589005106416332036076061" + "'", str17, "570913589005106416332036076061");
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.decrypt("604449738099992");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "290" + "'", str3, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "@" + "'", str5, "@");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("538");
        java.lang.String str9 = rSA1.encrypt("2498126528283274");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\u057e");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("678992678904336709456791763410");
        java.lang.String str17 = rSA1.encrypt("543");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3714320661" + "'", str3, "3714320661");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6553332684" + "'", str7, "6553332684");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3548928615" + "'", str9, "3548928615");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2282266575" + "'", str11, "2282266575");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "298" + "'", str15, "298");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "129" + "'", str17, "129");
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\001\r");
        java.lang.String str13 = rSA1.decrypt("214795012199997513219774055720");
        java.lang.String str15 = rSA1.decrypt("259");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2652381989992404" + "'", str7, "2652381989992404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562626527" + "'", str11, "562626527");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\030_?Q" + "'", str13, "\030_?Q");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd" + "'", str15, "\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.decrypt("37822311364830212583");
        java.lang.String str13 = rSA1.decrypt("611820819499251777959422481763");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.decrypt("816000352");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "371805732555058826070109010991" + "'", str9, "371805732555058826070109010991");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd7%" + "'", str11, "\003\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd7%");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffdIK" + "'", str17, "\ufffdIK");
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
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
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.decrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "909171915970372" + "'", str7, "909171915970372");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1753626987109396" + "'", str13, "1753626987109396");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\r-" + "'", str15, "\001\ufffd\ufffd\r-");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\ufffd\ufffd\ub686" + "'", str17, "\b\ufffd\ufffd\ub686");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1079229928362045" + "'", str19, "1079229928362045");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "246760930866068471318902491275" + "'", str23, "246760930866068471318902491275");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "477266316860336947664215439970" + "'", str25, "477266316860336947664215439970");
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        java.lang.String str11 = rSA1.encrypt("517376765656606617096719830177");
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("1392803603326574");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "102280162" + "'", str3, "102280162");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6371779344" + "'", str7, "6371779344");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "6042735353" + "'", str11, "6042735353");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\026?\007\ufffd\ufffd\ufffd\ufffd\005" + "'", str15, "\001\ufffd\026?\007\ufffd\ufffd\ufffd\ufffd\005");
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        java.lang.String str15 = rSA1.decrypt("299");
        java.lang.String str17 = rSA1.encrypt("633142800628300");
        java.lang.String str19 = rSA1.decrypt("348");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "254" + "'", str11, "254");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18" + "'", str17, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("286695718283372156430210651393");
        java.lang.String str5 = rSA1.encrypt("\002\007\ufffd\ufffd\ud7ea");
        java.lang.String str7 = rSA1.encrypt("318828732913781385831591827337");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5035001223" + "'", str3, "5035001223");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2049588456" + "'", str5, "2049588456");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5755176131" + "'", str7, "5755176131");
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
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
        java.lang.String str25 = rSA1.encrypt("\005s\032\ufffd\ufffd\ufffdi");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "102754619272236232104237869544" + "'", str9, "102754619272236232104237869544");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd4\n\177\022\ufffd\n" + "'", str11, "\002\ufffd\ufffd4\n\177\022\ufffd\n");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "110097162623548427439915689161" + "'", str13, "110097162623548427439915689161");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd9\024\ufffd\ufffd%\1776!" + "'", str15, "\001\ufffd9\024\ufffd\ufffd%\1776!");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "341964387286306352686271980776" + "'", str19, "341964387286306352686271980776");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "522757885591008481332286241588" + "'", str21, "522757885591008481332286241588");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd\ufffdi" + "'", str23, "\004\ufffd\ufffd\ufffd\\\ufffd\ufffd\ufffd\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "54744165527788361326675524814" + "'", str25, "54744165527788361326675524814");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\020\uba44\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\006\f\ufffd\ufffd8\177\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1639666051125810" + "'", str7, "1639666051125810");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "34" + "'", str13, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "569" + "'", str15, "569");
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("1597935467345796");
        java.lang.String str9 = rSA1.decrypt("2978375726236206");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1171944860634512");
        java.lang.String str15 = rSA1.decrypt("1672696756611743");
        java.lang.String str17 = rSA1.encrypt("896");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3987803410" + "'", str3, "3987803410");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10425758031" + "'", str5, "10425758031");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10838409235" + "'", str7, "10838409235");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "969689548323743" + "'", str13, "969689548323743");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd_" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2350448122483349" + "'", str17, "2350448122483349");
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.decrypt("136");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "45212578687332" + "'", str7, "45212578687332");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1460441046985203" + "'", str13, "1460441046985203");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\002\"" + "'", str15, "\007\ufffd\ufffd\ufffd\002\"");
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("1863031711965363");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.decrypt("69973686666167");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?)?'\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "197486303407348125123596820744" + "'", str11, "197486303407348125123596820744");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1\013\ufffd\ufffd\ufffd\u0463\ufffd\ufffdI" + "'", str15, "1\013\ufffd\ufffd\ufffd\u0463\ufffd\ufffdI");
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("4898507559");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "48" + "'", str3, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10747154644624822116783043839" + "'", str11, "10747154644624822116783043839");
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
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
        java.lang.String str31 = rSA1.encrypt("11617810775");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1645463795783131" + "'", str7, "1645463795783131");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "229345064807360297497350496341" + "'", str13, "229345064807360297497350496341");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "y" + "'", str17, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\013" + "'", str19, "\002\013");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "12295223171723635909056248021" + "'", str23, "12295223171723635909056248021");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\u029e" + "'", str25, "\ufffd\ufffd\ufffd\ufffd\ufffd\u029e");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "15910928819137725768117944385" + "'", str27, "15910928819137725768117944385");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "9243083506489740676669700114" + "'", str29, "9243083506489740676669700114");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "15036891279548634463765170861" + "'", str31, "15036891279548634463765170861");
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
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
        java.lang.String str27 = rSA1.encrypt("\000\ufffd\006\ufffd\ufffdN\"\036c\\\br");
        java.lang.String str29 = rSA1.decrypt("478535548657058");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "102983638453041144550577034895" + "'", str9, "102983638453041144550577034895");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "11259632149506266294211147167" + "'", str11, "11259632149506266294211147167");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "563373287679782505003735206663" + "'", str13, "563373287679782505003735206663");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "301" + "'", str17, "301");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "442" + "'", str19, "442");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "174" + "'", str21, "174");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "493" + "'", str23, "493");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "335" + "'", str25, "335");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "363" + "'", str27, "363");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\001\ufffd" + "'", str29, "\001\ufffd");
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
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
        java.lang.String str25 = rSA1.encrypt("2858452018");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1914779109130160" + "'", str7, "1914779109130160");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "393" + "'", str19, "393");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "233" + "'", str21, "233");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1202788253" + "'", str25, "1202788253");
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
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
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\033");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??2?s??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "466652205834741" + "'", str7, "466652205834741");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "463" + "'", str21, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001?" + "'", str23, "\001?");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "190" + "'", str27, "190");
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        rSA1.generateKeys((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1508943669" + "'", str5, "1508943669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "920543990" + "'", str7, "920543990");
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("288414846881290225890986105369");
        java.lang.String str15 = rSA1.decrypt("5508697251");
        java.lang.String str17 = rSA1.encrypt("372");
        java.lang.String str19 = rSA1.decrypt("3905524405221252");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "629551897129501" + "'", str7, "629551897129501");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffdW" + "'", str13, "\t\ufffd\ufffd\ufffdW");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\ufffd\u0100\ufffd" + "'", str15, "\013\ufffd\u0100\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3874662782575631" + "'", str17, "3874662782575631");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\t" + "'", str19, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\t");
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("463");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("520311866388828822881614108575");
        java.lang.String str15 = rSA1.decrypt("448135720855058258985292762207");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\006\ufffd\006Bzr\023");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???Bzr?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007\u0618\ufffd\ufffd)" + "'", str3, "\007\u0618\ufffd\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3934678635895687" + "'", str5, "3934678635895687");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3624962964582673" + "'", str7, "3624962964582673");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "384" + "'", str13, "384");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001" + "'", str17, "\001");
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "564610852486567" + "'", str7, "564610852486567");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.encrypt("\004\ufffd\017\ufffd\ufffd\u463d\ufffd\"");
        java.lang.String str17 = rSA1.decrypt("303415754433376700047708890998");
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.encrypt("610719530719962633447796913297");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "192" + "'", str5, "192");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Z" + "'", str7, "Z");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "483" + "'", str9, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198" + "'", str13, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "296" + "'", str15, "296");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\033" + "'", str17, "\002\033");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "815382399193159" + "'", str21, "815382399193159");
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1467722024976987" + "'", str7, "1467722024976987");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "444" + "'", str11, "444");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\033\u0531\016" + "'", str15, "\033\u0531\016");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd" + "'", str17, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1388619851" + "'", str19, "1388619851");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
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
        java.lang.String str25 = rSA1.encrypt("\007\002\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3366193423294961" + "'", str7, "3366193423294961");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "23" + "'", str15, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "367" + "'", str23, "367");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "82" + "'", str25, "82");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.decrypt("51");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98907156152532250555410124310" + "'", str3, "98907156152532250555410124310");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd-\002\ufffd\ufffd\ufffd\ufffdm" + "'", str7, "\003\ufffd\ufffd\ufffd-\002\ufffd\ufffd\ufffd\ufffdm");
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("478480907");
        java.lang.String str13 = rSA1.decrypt("10262013576437037109817071209");
        java.lang.String str15 = rSA1.encrypt("88163053801867586941492124226");
        java.lang.String str17 = rSA1.decrypt("2886579111");
        java.lang.String str19 = rSA1.decrypt("444970117535720526462934972583");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43" + "'", str11, "43");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001)" + "'", str13, "\001)");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "347" + "'", str15, "347");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        java.lang.String str7 = rSA1.encrypt("503437654883536581130267265910");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "492614660855011642370934501163" + "'", str5, "492614660855011642370934501163");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "744371887248477705541000964861" + "'", str7, "744371887248477705541000964861");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3219200510307832644426206353" + "'", str9, "3219200510307832644426206353");
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd\177\ufffd\u02db\ufffd\ufffd\ufffdP\027");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "442" + "'", str13, "442");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "133" + "'", str15, "133");
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("95057093174212120272332960514");
        java.lang.String str11 = rSA1.encrypt("363904346928259064880157652878");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("2029557083181447");
        java.lang.String str17 = rSA1.decrypt("3446865071729492");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003" + "'", str7, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "243" + "'", str9, "243");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "342" + "'", str11, "342");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd5G:" + "'", str15, "\001\ufffd5G:");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\033\ufffd\ufffdL" + "'", str17, "\002\033\ufffd\ufffdL");
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "73" + "'", str3, "73");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0020" + "'", str5, "\0020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "532337775030803991816430806586" + "'", str9, "532337775030803991816430806586");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "500432482871990381462405234599" + "'", str9, "500432482871990381462405234599");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\035\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\b\ufffd\ufffd\035\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "96" + "'", str13, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "267317078467666362165844551688" + "'", str15, "267317078467666362165844551688");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "563461804751933959651" + "'", str17, "563461804751933959651");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1783386774432" + "'", str19, "1783386774432");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        java.lang.String str15 = rSA1.decrypt("94");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "266367549967397100147101785025" + "'", str9, "266367549967397100147101785025");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "787936861830481886636511055749" + "'", str11, "787936861830481886636511055749");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\030\t\ufffd\ufffd\021\001V\023\ufffdA" + "'", str13, "\b\030\t\ufffd\ufffd\021\001V\023\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd\u033e\ufffd\ufffd\003\ufffd" + "'", str15, "\b\ufffd\ufffd\ufffd\u033e\ufffd\ufffd\003\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("852");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("1792074056760905");
        java.lang.String str15 = rSA1.decrypt("421663632197972441202228182732");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\006\ufffd\ufffd\036}\013");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??3??}?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2944757065205518" + "'", str7, "2944757065205518");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd7" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "j" + "'", str13, "j");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "u" + "'", str15, "u");
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("2184831592");
        java.lang.String str19 = rSA1.encrypt("830703359306169");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "C" + "'", str7, "C");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "179" + "'", str9, "179");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "198" + "'", str13, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\t\ufffdd\f" + "'", str17, "\ufffd\ufffd\ufffd\ufffd\t\ufffdd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "14832689715539742070447438182" + "'", str19, "14832689715539742070447438182");
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
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
        java.lang.String str25 = rSA1.decrypt("501491827176365");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "139865971404168006504317537896" + "'", str9, "139865971404168006504317537896");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "139865971404168006504317537896" + "'", str11, "139865971404168006504317537896");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\ufffd\ufffd\025\ufffd\ufffd\ufffd<\025\ufffdF" + "'", str13, "\n\ufffd\ufffd\025\ufffd\ufffd\ufffd<\025\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "565246520101711561197410827002" + "'", str15, "565246520101711561197410827002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffd\033u+[\023H" + "'", str17, "\003\ufffd\ufffd\ufffd\033u+[\023H");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "192588709148527850933419682616" + "'", str19, "192588709148527850933419682616");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "5547045299" + "'", str23, "5547045299");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd%\000\ufffd" + "'", str25, "\000\ufffd%\000\ufffd");
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.decrypt("1929985830");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("1445011235798689");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "575354827811643773774633646427" + "'", str9, "575354827811643773774633646427");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "510547899520946750862350147525" + "'", str11, "510547899520946750862350147525");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\025\036" + "'", str13, "\t\ufffd\ufffd\ufffd\ufffd\025\036");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005p\036\ufffd\ufffd\027\ufffd\031\t\u02b3\ufffd" + "'", str17, "\005p\036\ufffd\ufffd\027\ufffd\031\t\u02b3\ufffd");
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.decrypt("369");
        java.lang.String str5 = rSA1.decrypt("6591173097");
        java.lang.String str7 = rSA1.decrypt("2515314524154825");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("303131796729561309290923831167");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001y" + "'", str5, "\001y");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001e" + "'", str7, "\001e");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "343780626694292872432883740313" + "'", str11, "343780626694292872432883740313");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("815267620206901");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\0013" + "'", str13, "\0013");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
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
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3194116432828134" + "'", str11, "3194116432828134");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1823975481553729" + "'", str13, "1823975481553729");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "150844872000144" + "'", str15, "150844872000144");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "119739593795608299395442746093" + "'", str19, "119739593795608299395442746093");
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
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
            java.lang.String str21 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "204760321283687520499405977790" + "'", str9, "204760321283687520499405977790");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "204760321283687520499405977790" + "'", str11, "204760321283687520499405977790");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\u02a5\ufffd\ufffd\ufffdwc=" + "'", str13, "\002\ufffd\u02a5\ufffd\ufffd\ufffdwc=");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "470611714417816044223263804018" + "'", str15, "470611714417816044223263804018");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\021\ufffd\ufffd\ufffd>T\006\ufffd\ufffd\ufffd\017g" + "'", str17, "\001\021\ufffd\ufffd\ufffd>T\006\ufffd\ufffd\ufffd\017g");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\u0500\ufffd\ufffd\\\ufffd\031\ufffdz" + "'", str19, "\005\u0500\ufffd\ufffd\\\ufffd\031\ufffdz");
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
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
            java.math.BigInteger bigInteger35 = rSA1.encrypt(bigInteger34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "572295495144116" + "'", str7, "572295495144116");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369" + "'", str11, "369");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "463" + "'", str21, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001?" + "'", str23, "\001?");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "170" + "'", str27, "170");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "177304888650441576913369124455" + "'", str31, "177304888650441576913369124455");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "755143705421383381172424294017" + "'", str33, "755143705421383381172424294017");
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.decrypt("250147309");
        java.lang.String str17 = rSA1.encrypt("36765414433673759696743343688");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "602721068682125645409475765069" + "'", str9, "602721068682125645409475765069");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\u0207\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\b\ufffd\u0207\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "691642599858501409824352696845" + "'", str13, "691642599858501409824352696845");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd7" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "171991500683643123849887853498" + "'", str17, "171991500683643123849887853498");
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("58143851088687047188552923988");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "693" + "'", str3, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\0011" + "'", str11, "\0011");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.decrypt("202585656882194916579406915390");
        java.lang.String str13 = rSA1.encrypt("178");
        java.lang.String str15 = rSA1.encrypt("310952423287303162704207659970");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "435381152702882717145547993542" + "'", str9, "435381152702882717145547993542");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\022\ufffd\ufffd%}\n\ufffd\026\ufffd^\032" + "'", str11, "\004\022\ufffd\ufffd%}\n\ufffd\026\ufffd^\032");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "388721170670832233939668827887" + "'", str13, "388721170670832233939668827887");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151253838763545127805782614901" + "'", str15, "151253838763545127805782614901");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.decrypt("2405818939");
        java.lang.String str13 = rSA1.decrypt("387");
        java.lang.String str15 = rSA1.encrypt("258");
        java.lang.String str17 = rSA1.decrypt("159324186965374018993794128375");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "360699024996446203572396547593" + "'", str9, "360699024996446203572396547593");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffdS/\024\ufffd\ufffdm\013" + "'", str13, "\007\ufffd\ufffd\ufffdS/\024\ufffd\ufffdm\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "360269784593448187859562480797" + "'", str15, "360269784593448187859562480797");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003<5\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\003<5\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004\ufffdt\007\ufffd\ufffd\ufffd\ufffd$\0072");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "162362447327118" + "'", str7, "162362447327118");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3310727397" + "'", str11, "3310727397");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "559710057" + "'", str13, "559710057");
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
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
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2105408730825489" + "'", str7, "2105408730825489");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "135" + "'", str15, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
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
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8019446361943" + "'", str7, "8019446361943");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1487989703" + "'", str11, "1487989703");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "245629055" + "'", str15, "245629055");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2269035706" + "'", str17, "2269035706");
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        java.lang.String str13 = rSA1.encrypt("589095713527447830713051752917");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "349172218060266" + "'", str7, "349172218060266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "53" + "'", str11, "53");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "73" + "'", str13, "73");
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
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
            java.lang.String str17 = rSA1.decrypt("\000\ufffds\005\ufffd\021\ufffd\r\ufffd\026");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??s\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "310688541431974266271448319360" + "'", str9, "310688541431974266271448319360");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "225002533933089530397350488026" + "'", str11, "225002533933089530397350488026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "72103062586688094143497797765" + "'", str13, "72103062586688094143497797765");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006R?@\033\024\ufffd`~S$\017" + "'", str15, "\006R?@\033\024\ufffd`~S$\017");
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1811857435690438" + "'", str7, "1811857435690438");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "I" + "'", str11, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002t" + "'", str13, "\002t");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.encrypt("6318253741");
        java.lang.String str15 = rSA1.encrypt("192133877715601418120759356632");
        java.lang.String str17 = rSA1.decrypt("362420038018606127978088960500");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509493020807616" + "'", str7, "509493020807616");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "90" + "'", str13, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "288" + "'", str15, "288");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "X" + "'", str17, "X");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("570226650639502135961025038359");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "656" + "'", str5, "656");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "679" + "'", str7, "679");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "204" + "'", str11, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\177" + "'", str13, "\177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\031\ufffd\n\025\ufffd\ufffd\ufffdL\025\ufffd" + "'", str17, "\031\ufffd\n\025\ufffd\ufffd\ufffdL\025\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "320712163149479625638073476049" + "'", str9, "320712163149479625638073476049");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "263636047043392763851549050785" + "'", str11, "263636047043392763851549050785");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "237912838069851207328082278668" + "'", str15, "237912838069851207328082278668");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "283409048397381122622724597355" + "'", str17, "283409048397381122622724597355");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\035\001\u0756py" + "'", str21, "\005\ufffd\ufffd\ufffd\ufffd\035\001\u0756py");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd}e" + "'", str23, "\t\ufffd\ufffd\ufffd\ufffd}e");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\rMp");
        java.lang.String str7 = rSA1.decrypt("79308455521165");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "38" + "'", str5, "38");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "`" + "'", str7, "`");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.decrypt("7320283309");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5756269017" + "'", str3, "5756269017");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177\ufffdlX" + "'", str5, "\001\177\ufffdlX");
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
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
        java.lang.String str23 = rSA1.encrypt("37468467090067767106021692253");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292" + "'", str11, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "(" + "'", str13, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "275" + "'", str15, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "66" + "'", str17, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "621823794" + "'", str21, "621823794");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "971704060" + "'", str23, "971704060");
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "562299203571838146554009543156" + "'", str9, "562299203571838146554009543156");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "483202532345313829193684161742" + "'", str11, "483202532345313829193684161742");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "24709606186014901394564627264" + "'", str13, "24709606186014901394564627264");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "489" + "'", str17, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001~" + "'", str19, "\001~");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "476" + "'", str21, "476");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100998397819617396532081979994" + "'", str25, "100998397819617396532081979994");
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.decrypt("211673788539744279696210156906");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("188");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "165" + "'", str3, "165");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\030\ufffdD" + "'", str7, "\002\ufffd\030\ufffdD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\0366\016" + "'", str9, "\002\ufffd\0366\016");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd6" + "'", str11, "\000\ufffd\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "240361896003179646383634174283" + "'", str17, "240361896003179646383634174283");
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\005\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger5 = rSA1.encrypt(bigInteger4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "787" + "'", str3, "787");
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) '#');
        java.lang.String str5 = rSA1.decrypt("491871307370489585375257434959");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("523");
        java.lang.String str11 = rSA1.encrypt("418302352161981103798040615915");
        java.lang.String str13 = rSA1.encrypt("538466596764584785061881286421");
        java.lang.String str15 = rSA1.encrypt("255208532862462952347238750539");
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd" + "'", str5, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42371998213842471979" + "'", str9, "42371998213842471979");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "327177858427870499872121047544" + "'", str11, "327177858427870499872121047544");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "310148326456362836655107148083" + "'", str13, "310148326456362836655107148083");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "361369063349916848739235612177" + "'", str15, "361369063349916848739235612177");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("\0020");
        java.lang.String str13 = rSA1.encrypt("\036\u03bfR");
        java.lang.String str15 = rSA1.encrypt("437057932281058866141326378333");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1028071702528" + "'", str9, "1028071702528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17270948495360000000" + "'", str11, "17270948495360000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "29434211073989273076433539013" + "'", str13, "29434211073989273076433539013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10502308340641596695777652131" + "'", str15, "10502308340641596695777652131");
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("250147309");
        java.lang.String str5 = rSA1.encrypt("70366345228454363983960175493");
        java.lang.String str7 = rSA1.encrypt("1537631062431581");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\003\ufffd\ufffd\u02c6\ufffd)0}~N" + "'", str3, "\001\003\ufffd\ufffd\u02c6\ufffd)0}~N");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "385070269142943000720025758281" + "'", str5, "385070269142943000720025758281");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56726854687395924959996426896" + "'", str7, "56726854687395924959996426896");
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
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
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "490554661633844" + "'", str7, "490554661633844");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "159095845919941" + "'", str13, "159095845919941");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\027ZX" + "'", str15, "\004\ufffd\027ZX");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1924680620" + "'", str19, "1924680620");
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "423" + "'", str3, "423");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "V" + "'", str15, "V");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "277" + "'", str17, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "192" + "'", str21, "192");
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("\001\u014c\ufffd\ufffd\u0689\032\ufffd{L");
        java.lang.String str11 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str13 = rSA1.decrypt("289013563216973");
        java.lang.String str15 = rSA1.decrypt("1858995041484385");
        java.lang.String str17 = rSA1.decrypt("5602292640");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "239044371328539601759187332733" + "'", str9, "239044371328539601759187332733");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "649487949510297006400574670985" + "'", str11, "649487949510297006400574670985");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\n\ufffd\ufffd$\037\u0210\b\ufffd\ufffd" + "'", str13, "\003\n\ufffd\ufffd$\037\u0210\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\f\026\ufffd\ufffd\ufffd\ufffd\177vk" + "'", str15, "\f\026\ufffd\ufffd\ufffd\ufffd\177vk");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\u04b9\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd\ufffd\u04b9\ufffd\ufffd");
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "154" + "'", str3, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\035" + "'", str5, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.encrypt("\ufffd\ufffd R\002\ufffd\ufffd\177");
        java.lang.String str17 = rSA1.decrypt("155707469794806709519787576140");
        java.lang.String str19 = rSA1.decrypt("7035134689");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "359430088104161067252928834384" + "'", str9, "359430088104161067252928834384");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "37822311364830212583" + "'", str11, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "455370567134931795219983581516" + "'", str13, "455370567134931795219983581516");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "5379062594482606007796099420" + "'", str15, "5379062594482606007796099420");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\006\033\ufffd\ufffd\ufffd\026\020\ufffd" + "'", str17, "\003\ufffd\006\033\ufffd\ufffd\ufffd\026\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002A\f\ufffd\\\ufffd\n2,ov" + "'", str19, "\002A\f\ufffd\\\ufffd\n2,ov");
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "3039635480635198" + "'", str7, "3039635480635198");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd#x\037\ufffd" + "'", str9, "\006\ufffd\ufffd#x\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2261183813077468" + "'", str13, "2261183813077468");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "380204032" + "'", str15, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "277593051242067" + "'", str17, "277593051242067");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("48");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd:\021\ufffd\ufffd\023\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\017\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "284" + "'", str5, "284");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "247" + "'", str9, "247");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "188" + "'", str11, "188");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("718772914756829042159802081918");
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\ufffd\002\ufffd\ufffd" + "'", str17, "\ufffd\ufffd\ufffd\002\ufffd\ufffd");
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("369");
        java.lang.String str13 = rSA1.decrypt("60129198407427");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("\013\ufffd\u057e");
        java.lang.String str19 = rSA1.decrypt("5603245346");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1132197347323765" + "'", str7, "1132197347323765");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "220020635" + "'", str11, "220020635");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\"\ufffd" + "'", str13, "\007\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "201501378707970" + "'", str17, "201501378707970");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd'" + "'", str19, "\003\ufffd\ufffd\ufffd\ufffd'");
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        java.lang.String str11 = rSA1.encrypt("104505243654056990127866040198");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\016\n\ufffd\ufffd\u0666\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "76" + "'", str5, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338" + "'", str9, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "742" + "'", str11, "742");
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\002\037\r\017+J\032t\000&\023\0272");
        java.lang.String str9 = rSA1.encrypt("851388096742496");
        java.lang.String str11 = rSA1.encrypt("361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\ufffdd\b\ufffd\002\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \";l?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2066768876587689" + "'", str7, "2066768876587689");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1953560182090809" + "'", str9, "1953560182090809");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "790223944108473" + "'", str11, "790223944108473");
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
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
        java.lang.String str21 = rSA1.decrypt("18198554269264934175062898240");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003U\001\ufffdG\002D\\\ufffd\ufffd\b" + "'", str11, "\003U\001\ufffdG\002D\\\ufffd\ufffd\b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "397526411360393099050447387538" + "'", str13, "397526411360393099050447387538");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffdF" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "168919237311932084593389591078" + "'", str17, "168919237311932084593389591078");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "308564992035477494242887177220" + "'", str19, "308564992035477494242887177220");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffd\ud85b\udc68\ufffd\ufffd\ufffd" + "'", str21, "\002\ufffd\ud85b\udc68\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        java.lang.String str9 = rSA1.decrypt("37822311364830212583");
        java.lang.String str11 = rSA1.encrypt("125");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\007\ufffd\ufffd\ufffd\b\ufffd\ufffd\001\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "239" + "'", str3, "239");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001." + "'", str5, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\035" + "'", str7, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\177" + "'", str9, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "322" + "'", str11, "322");
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.encrypt("523");
        java.lang.String str15 = rSA1.encrypt("451");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "112" + "'", str11, "112");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "290" + "'", str13, "290");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "239" + "'", str15, "239");
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.encrypt("747125124716279");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str9 = rSA1.encrypt("2026972169485856");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "226562746893897196414305791288" + "'", str5, "226562746893897196414305791288");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "107" + "'", str9, "107");
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("1258284197543");
        java.lang.String str5 = rSA1.decrypt("429740296");
        java.lang.String str7 = rSA1.encrypt("1863290051759484");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\007" + "'", str3, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\u014b\ufffd\003\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\000\u014b\ufffd\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "490145151079756083767633174670" + "'", str7, "490145151079756083767633174670");
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("219091099050495");
        java.lang.String str5 = rSA1.decrypt("97779635366941227714181850303");
        java.lang.String str7 = rSA1.encrypt("149");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\024\ufffd\ufffd[^");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "184486595282572044193315087565" + "'", str3, "184486595282572044193315087565");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003\0371\024\ufffd.1\016\004" + "'", str5, "\003\0371\024\ufffd.1\016\004");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "391754832743285989403778323356" + "'", str7, "391754832743285989403778323356");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "239816853573643327585272484064" + "'", str9, "239816853573643327585272484064");
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("402119530394494");
        java.lang.String str9 = rSA1.encrypt("825110335461462544760601940215");
        java.lang.String str11 = rSA1.encrypt("1552988480642433");
        java.lang.String str13 = rSA1.encrypt("722397336458138668622780661281");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4442178824" + "'", str3, "4442178824");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3892632361" + "'", str5, "3892632361");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4716823828" + "'", str7, "4716823828");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6298251298" + "'", str9, "6298251298");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5231875923" + "'", str11, "5231875923");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7067545676" + "'", str13, "7067545676");
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("1140138270580326");
        java.lang.String str15 = rSA1.encrypt("867940529775842");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "75884630569429913498329847423" + "'", str9, "75884630569429913498329847423");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "905594491331489594010615633589" + "'", str11, "905594491331489594010615633589");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "196356359744688359030028949800" + "'", str15, "196356359744688359030028949800");
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
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
        java.lang.String str27 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdD");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "276" + "'", str3, "276");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\007" + "'", str5, "\001\007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffdJ\032\ufffd(" + "'", str13, "\003\ufffd\ufffdJ\032\ufffd(");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "465692104699889" + "'", str15, "465692104699889");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "631071333923583" + "'", str17, "631071333923583");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "62" + "'", str21, "62");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "313" + "'", str23, "313");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd" + "'", str25, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "135" + "'", str27, "135");
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("77");
        java.lang.String str7 = rSA1.encrypt("4135191595");
        java.lang.String str9 = rSA1.decrypt("673956605723821641068855364286");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "544375692" + "'", str5, "544375692");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "778174478" + "'", str7, "778174478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n\ufffdlG" + "'", str9, "\n\ufffdlG");
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("387");
        java.lang.String str11 = rSA1.encrypt("1024");
        java.lang.String str13 = rSA1.decrypt("151464558644061297306368349467");
        java.lang.String str15 = rSA1.decrypt("352");
        java.lang.String str17 = rSA1.decrypt("611943475129151");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562010238774123488618906944" + "'", str11, "562010238774123488618906944");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd'\025\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd" + "'", str13, "\003\ufffd'\025\ufffd\ufffd\ufffd\ufffd\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\u4a02\ufffd\ufffd\ufffd8~" + "'", str15, "\004\ufffd\ufffd\u4a02\ufffd\ufffd\ufffd8~");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd0\017\ufffdnv\b\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd0\017\ufffdnv\b\ufffd\ufffd");
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffdb\004");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1052043553685863" + "'", str11, "1052043553685863");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1242548979491587" + "'", str13, "1242548979491587");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "16419392017950263175986932935" + "'", str17, "16419392017950263175986932935");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("320632841594240414839688016246");
        java.lang.String str7 = rSA1.encrypt("336219186651589311639463770865");
        java.lang.String str9 = rSA1.decrypt("10590563594");
        java.lang.String str11 = rSA1.decrypt("395899771572896144210561400268");
        java.lang.String str13 = rSA1.encrypt("\\");
        java.lang.String str15 = rSA1.decrypt("1503284457145148");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006\ufffd\ufffd\ufffdq" + "'", str3, "\006\ufffd\ufffd\ufffdq");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1491731043119035" + "'", str5, "1491731043119035");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1100222908884918" + "'", str7, "1100222908884918");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffdd\002" + "'", str11, "\006\ufffd\ufffdd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1163187913103083" + "'", str13, "1163187913103083");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffdd\035\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffdd\035\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("3060553596769532");
        java.lang.String str11 = rSA1.encrypt("387");
        java.lang.String str13 = rSA1.encrypt("567489291482222151985241898549");
        java.lang.String str15 = rSA1.decrypt("961072818614308");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "470392899727472340078368418766" + "'", str9, "470392899727472340078368418766");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "441093658848290323692536177599" + "'", str11, "441093658848290323692536177599");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2760179434989287289586119152" + "'", str13, "2760179434989287289586119152");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023" + "'", str15, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\023");
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
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
        java.lang.String str21 = rSA1.encrypt("493");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1782215701068999" + "'", str7, "1782215701068999");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "527" + "'", str19, "527");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "296" + "'", str21, "296");
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("96");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("439161610538377200236688884473");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "86" + "'", str3, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "673899523054237850976" + "'", str9, "673899523054237850976");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2807098500239178" + "'", str13, "2807098500239178");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2518993635172917" + "'", str15, "2518993635172917");
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7593646982046696255809705176" + "'", str9, "7593646982046696255809705176");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "426905927000960237568" + "'", str11, "426905927000960237568");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\f\ufffd\ufffd\ufffd\030\ufffd\ufffd" + "'", str13, "\f\ufffd\ufffd\ufffd\030\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "878501592559764487471041534049" + "'", str15, "878501592559764487471041534049");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "71671481040702041844635454140" + "'", str19, "71671481040702041844635454140");
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
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
        java.lang.String str21 = rSA1.encrypt("\t");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "200696658575942288652446008123" + "'", str9, "200696658575942288652446008123");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\032\ufffd\ufffd\ufffd\ufffd\ufffdRlS" + "'", str11, "\003\032\ufffd\ufffd\ufffd\ufffd\ufffdRlS");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "315425313025754783918831901350" + "'", str13, "315425313025754783918831901350");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1551840129673071" + "'", str17, "1551840129673071");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2360028892580043" + "'", str19, "2360028892580043");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "59049" + "'", str21, "59049");
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
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
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "970385042723594" + "'", str7, "970385042723594");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd{N\\\ufffd\ufffd" + "'", str9, "\006\ufffd{N\\\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1361321733870204" + "'", str11, "1361321733870204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "600961448941145" + "'", str13, "600961448941145");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2196611730358704" + "'", str15, "2196611730358704");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1964098042448295" + "'", str17, "1964098042448295");
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("120");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "538" + "'", str3, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "547" + "'", str9, "547");
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\002\ufffd\ufffdT");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?l??T\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "277725182650807467353399659941" + "'", str9, "277725182650807467353399659941");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "289065893247485487718430488470" + "'", str13, "289065893247485487718430488470");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\032\u0751\ufffd\ufffd\u039a\ufffd" + "'", str15, "\b\ufffd\032\u0751\ufffd\ufffd\u039a\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "680968648343674259715423772800" + "'", str17, "680968648343674259715423772800");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "6547098221867703077941634671" + "'", str21, "6547098221867703077941634671");
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.decrypt("1198965058209000");
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.decrypt("65223512648500746621300565797");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372999049701317524914314595422" + "'", str3, "372999049701317524914314595422");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\007\u02c7\013\001\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\007\u02c7\013\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdX5" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdX5");
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("196777756323469683884737199099");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("65");
        java.lang.String str9 = rSA1.decrypt("2795021309");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "104437539474890478723257301403" + "'", str3, "104437539474890478723257301403");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd@t" + "'", str7, "\000\ufffd\ufffd@t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdF'" + "'", str9, "\000\ufffd\ufffdF'");
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
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
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "123082065029405558358493154528" + "'", str9, "123082065029405558358493154528");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "123082065029405558358493154528" + "'", str11, "123082065029405558358493154528");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "440843512466737008749696590576" + "'", str15, "440843512466737008749696590576");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006@\031\ufffd\ufffd\ufffd]\017\ufffd\ufffd~-" + "'", str21, "\006@\031\ufffd\ufffd\ufffd]\017\ufffd\ufffd~-");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\004\ufffd\031F\330\ufffd1j=j" + "'", str23, "\004\ufffd\031F\330\ufffd1j=j");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.decrypt("15399140528");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\002\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "27715545564698" + "'", str5, "27715545564698");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "213578924852864" + "'", str7, "213578924852864");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd5S" + "'", str9, "\004\ufffd5S");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\013\ufffd\ufffd" + "'", str11, "\003\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\u012c\ufffd\n\ufffd" + "'", str13, "\002\u012c\ufffd\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004Kr\b\ufffd\ufffd" + "'", str15, "\004Kr\b\ufffd\ufffd");
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "314452488582754" + "'", str7, "314452488582754");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "145" + "'", str11, "145");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "651" + "'", str19, "651");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "123" + "'", str21, "123");
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        java.lang.String str9 = rSA1.encrypt("7772915241");
        java.lang.String str11 = rSA1.decrypt("230392568664349877198980463493");
        java.lang.String str13 = rSA1.encrypt("3844394415");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.decrypt("30774062305666838944109687145");
        java.lang.String str19 = rSA1.encrypt("7704207059");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\005" + "'", str5, "\002\005");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "408" + "'", str7, "408");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "228" + "'", str9, "228");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "335" + "'", str13, "335");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "504" + "'", str19, "504");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "460346443786271527207574692155" + "'", str9, "460346443786271527207574692155");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "460346443786271527207574692155" + "'", str11, "460346443786271527207574692155");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\u06da\ufffd\ufffd\u04f7\ufffd\ufffd" + "'", str13, "\002\ufffd\u06da\ufffd\ufffd\u04f7\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\016\ufffd\ufffd\ufffdf\004\"\ufffd" + "'", str15, "\ufffd\016\ufffd\ufffd\ufffdf\004\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "815467263869412082537409227354" + "'", str17, "815467263869412082537409227354");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\f\ufffd\ufffd\016\036\ufffd\ufffd\ufffd\ufffd\ufffd@" + "'", str19, "\f\ufffd\ufffd\016\036\ufffd\ufffd\ufffd\ufffd\ufffd@");
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
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
        java.lang.String str23 = rSA1.encrypt("\002\ufffd\ufffd\ufffd-\036\u79b2\026");
        java.lang.String str25 = rSA1.decrypt("169979458167342652716591007703");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2520236361622739" + "'", str7, "2520236361622739");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "643200373795611" + "'", str13, "643200373795611");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\001\ufffd\ufffd7" + "'", str15, "\006\001\ufffd\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\004\ufffd\ufffdt2K" + "'", str17, "\003\004\ufffd\ufffdt2K");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "190322496661217" + "'", str19, "190322496661217");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "88780866378822" + "'", str21, "88780866378822");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1846424482660162" + "'", str23, "1846424482660162");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\030\ufffd\u0205\ufffd" + "'", str25, "\001\030\ufffd\u0205\ufffd");
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.decrypt("3989346653526533");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("\n\u05f7\"\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "58" + "'", str5, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "252" + "'", str7, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "458" + "'", str11, "458");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "7690857020" + "'", str19, "7690857020");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.encrypt("1140138270580326");
        java.lang.String str5 = rSA1.decrypt("1112473507598001");
        java.lang.String str7 = rSA1.encrypt("2610161298");
        java.lang.String str9 = rSA1.encrypt("11985686790487400116744573163");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3820757740057656" + "'", str3, "3820757740057656");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\020\ufffd\ufffd\ufffd" + "'", str5, "\002\020\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1077063821232286" + "'", str7, "1077063821232286");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "85425020449533" + "'", str9, "85425020449533");
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.decrypt("828944592250846");
        java.lang.String str9 = rSA1.encrypt("234981334158433778617000621439");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd\u075f\ufffd\ufffdL@");
        java.lang.String str19 = rSA1.encrypt("\002]\025\ufffd\\");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001>" + "'", str7, "\001>");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "506" + "'", str9, "506");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "460" + "'", str13, "460");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "27779651858199536724034695221" + "'", str17, "27779651858199536724034695221");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "20674209477674827391400926339" + "'", str19, "20674209477674827391400926339");
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
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
        java.lang.String str23 = rSA1.encrypt("\004\n\ufffd\ufffd\033\ufffd\020\ufffd\ufffd\007");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\000\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???j?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "36" + "'", str3, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "797397286994244" + "'", str7, "797397286994244");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2861332263164847" + "'", str13, "2861332263164847");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "344" + "'", str17, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "329" + "'", str19, "329");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "617" + "'", str21, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "833" + "'", str23, "833");
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("214613013380271327686434676578");
        java.lang.String str9 = rSA1.decrypt("4");
        java.lang.String str11 = rSA1.encrypt("10496963571");
        java.lang.String str13 = rSA1.decrypt("946688421");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "463" + "'", str3, "463");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e\003\ufffd\t" + "'", str7, "e\003\ufffd\t");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd+" + "'", str9, "\000\ufffd\ufffd+");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "9014007174" + "'", str11, "9014007174");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\u04c2\ufffd" + "'", str13, "\000\ufffd\u04c2\ufffd");
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
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
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "20670699772920074994968969118" + "'", str9, "20670699772920074994968969118");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffdnC\bv\fp4" + "'", str11, "\005\ufffd\ufffdnC\bv\fp4");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\u0381\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\u0381\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd8," + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd8,");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\021\ufffd\ufffd\b\ufffd" + "'", str17, "\000\ufffd\ufffd\021\ufffd\ufffd\b\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.encrypt("153853134159497141190339455222");
        java.lang.String str5 = rSA1.encrypt("503");
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("4585752360");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "703428198875789865160886293151" + "'", str3, "703428198875789865160886293151");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "230672022553964969859078892387" + "'", str5, "230672022553964969859078892387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "355011596756593087945584352670" + "'", str7, "355011596756593087945584352670");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd%" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd%");
    }

    @Test
    public void test6950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6950");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.decrypt("273390189577687013215022252038");
        java.lang.String str15 = rSA1.decrypt("523");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002+" + "'", str11, "\002+");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "K" + "'", str13, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\013" + "'", str15, "\002\013");
    }

    @Test
    public void test6951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6951");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str5 = rSA1.encrypt("288381885129248325829960577506");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "12734382210465344436792664721" + "'", str3, "12734382210465344436792664721");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "13987257065921975044833055422" + "'", str5, "13987257065921975044833055422");
    }

    @Test
    public void test6952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6952");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("276");
        java.lang.String str7 = rSA1.encrypt("239");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1412380937028196");
        java.lang.String str13 = rSA1.encrypt("7929141622");
        java.lang.String str15 = rSA1.encrypt("550");
        java.lang.String str17 = rSA1.encrypt("4857640671");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "309" + "'", str7, "309");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "33" + "'", str11, "33");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "166" + "'", str13, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "273" + "'", str15, "273");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "256" + "'", str17, "256");
    }

    @Test
    public void test6953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6953");
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
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2042229827233578" + "'", str7, "2042229827233578");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1505564235351509" + "'", str13, "1505564235351509");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\u021d" + "'", str15, "\002\ufffd\ufffd\ufffd\u021d");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\u1e36C" + "'", str17, "\005\ufffd\u1e36C");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd\ufffdo" + "'", str23, "\001\ufffd\ufffdo");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6954");
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
        java.lang.String str21 = rSA1.encrypt("455316315712794");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "37822311364830212583" + "'", str9, "37822311364830212583");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003]\016\t\ufffd\tr\177\ufffd\ufffd\005\ufffd\005" + "'", str11, "\003]\016\t\ufffd\tr\177\ufffd\ufffd\005\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\n\ufffd\ufffdk5" + "'", str13, "\003\ufffd\ufffd\ufffd\n\ufffd\ufffdk5");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\001\ufffd\ufffd\ufffd\ufffd1\016\ufffd" + "'", str17, "\ufffd\001\ufffd\ufffd\ufffd\ufffd1\016\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffdTL\257\ufffd\ufffd\ufffd\ufffd;" + "'", str19, "\ufffdTL\257\ufffd\ufffd\ufffd\ufffd;");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "5983635226927386083736932803" + "'", str21, "5983635226927386083736932803");
    }

    @Test
    public void test6955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6955");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\b\ufffd\002@" + "'", str3, "\001\b\ufffd\002@");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "836367155461800" + "'", str5, "836367155461800");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "983975996168609" + "'", str7, "983975996168609");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6956");
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
        java.lang.String str27 = rSA1.encrypt("515890341162912943457989665054");
        java.math.BigInteger bigInteger28 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger29 = rSA1.encrypt(bigInteger28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "95510922328614477387502666674" + "'", str9, "95510922328614477387502666674");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "95510922328614477387502666674" + "'", str11, "95510922328614477387502666674");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\031\u01cc\ufffd\031\ufffd\003\ufffd\ufffd\ufffd" + "'", str13, "\004\031\u01cc\ufffd\031\ufffd\003\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "240179970819868802825226980156" + "'", str15, "240179970819868802825226980156");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "448556621942885254439433460020" + "'", str21, "448556621942885254439433460020");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007\u0619\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\007\u0619\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2347318497601143" + "'", str27, "2347318497601143");
    }

    @Test
    public void test6957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6957");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "748281178356443" + "'", str7, "748281178356443");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002vg\036\036" + "'", str15, "\002vg\036\036");
    }

    @Test
    public void test6958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6958");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("\002\ufffd");
        java.lang.String str5 = rSA1.encrypt("33498445484715677227");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "119579939769595636001061" + "'", str3, "119579939769595636001061");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "703732117421341246718152590907" + "'", str5, "703732117421341246718152590907");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6959");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("489");
        java.lang.String str15 = rSA1.decrypt("348571328638567086409748209952");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "470" + "'", str3, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1595390288878502" + "'", str7, "1595390288878502");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6614299404" + "'", str13, "6614299404");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\016\ufffd" + "'", str15, "\001\016\ufffd");
    }

    @Test
    public void test6960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6960");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001C");
        java.lang.String str15 = rSA1.decrypt("1343835676241254");
        java.lang.String str17 = rSA1.encrypt("\005\ufffdTu\020\034");
        rSA1.generateKeys(100);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1660061017029415" + "'", str7, "1660061017029415");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16442282715002" + "'", str13, "16442282715002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffdB\"\u0153\026" + "'", str15, "\007\ufffdB\"\u0153\026");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "998333557450033" + "'", str17, "998333557450033");
    }

    @Test
    public void test6961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6961");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("1512739533813279");
        java.lang.String str5 = rSA1.encrypt("678151601826344197358594025404");
        java.lang.String str7 = rSA1.encrypt("611943475129151");
        java.lang.String str9 = rSA1.decrypt("165");
        java.lang.String str11 = rSA1.decrypt("289544367393524284124525093689");
        java.lang.String str13 = rSA1.decrypt("77381396516715217378311807299");
        java.lang.String str15 = rSA1.decrypt("15399140528");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\000\ufffd\ufffd\0077");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????7\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "N\f\ufffd\022\ufffd" + "'", str3, "N\f\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2588648290217114" + "'", str5, "2588648290217114");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2498705575269436" + "'", str7, "2498705575269436");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\005\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\004\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\006\ufffd\ufffd\037X" + "'", str11, "\003\006\ufffd\ufffd\037X");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\u04e4x0T-" + "'", str13, "\002\u04e4x0T-");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\u046a\u02e7\ufffd" + "'", str15, "\004\ufffd\u046a\u02e7\ufffd");
    }

    @Test
    public void test6962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6962");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("273390189577687013215022252038");
        java.lang.String str11 = rSA1.encrypt("144555030144998575362767788416");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.String str15 = rSA1.decrypt("3938980639167");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "200145393097915908217219683778" + "'", str9, "200145393097915908217219683778");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14086425675753067085722539773" + "'", str11, "14086425675753067085722539773");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "365295489230845241359797618485" + "'", str13, "365295489230845241359797618485");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\005\ufffd\ufffd\ufffd\ufffd\u0557\u07f6" + "'", str15, "\004\ufffd\005\ufffd\ufffd\ufffd\ufffd\u0557\u07f6");
    }

    @Test
    public void test6963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6963");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\001\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("360143793835170409825620524630");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "537" + "'", str11, "537");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "128" + "'", str13, "128");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6964");
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
        java.lang.String str33 = rSA1.decrypt("2237885470");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1758067067584708" + "'", str7, "1758067067584708");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "435304544319133561300292936468" + "'", str13, "435304544319133561300292936468");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd" + "'", str19, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "5604279488764802751896273042" + "'", str23, "5604279488764802751896273042");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd8]g\n\ufffd" + "'", str25, "\ufffd\ufffd\ufffd8]g\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "2985319957610824024559857855" + "'", str27, "2985319957610824024559857855");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2241345760798603215761053606" + "'", str29, "2241345760798603215761053606");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "11700532971436430576812348080" + "'", str31, "11700532971436430576812348080");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "`\033\t\ufffd\ufffd}\r\ufffd\ufffd\ufffd\030" + "'", str33, "`\033\t\ufffd\ufffd}\r\ufffd\ufffd\ufffd\030");
    }

    @Test
    public void test6965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6965");
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
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "829" + "'", str3, "829");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9300072841" + "'", str7, "9300072841");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3471464889" + "'", str9, "3471464889");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\035\ufffd\ufffd" + "'", str11, "\001\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4444109224" + "'", str13, "4444109224");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "284890880011629" + "'", str17, "284890880011629");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\t\ufffd\ufffd\u06e3" + "'", str19, "\002\ufffd\t\ufffd\ufffd\u06e3");
    }

    @Test
    public void test6966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6966");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        rSA1.generateKeys(10);
        java.lang.String str5 = rSA1.decrypt("1988705259084950");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test6967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6967");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.encrypt("373");
        java.lang.String str15 = rSA1.encrypt("1021508253829588");
        java.lang.String str17 = rSA1.decrypt("154");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022406548612364" + "'", str7, "2022406548612364");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\000\017\ufffd\ufffd" + "'", str9, "\b\ufffd\000\017\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1258284197543" + "'", str11, "1258284197543");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "754686266939020" + "'", str13, "754686266939020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2328777548671418" + "'", str15, "2328777548671418");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007%\030\ufffd\ufffd\ufffdA" + "'", str17, "\007%\030\ufffd\ufffd\ufffdA");
    }

    @Test
    public void test6968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6968");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd:");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "231917142691099" + "'", str7, "231917142691099");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "154641875851979217989527150584" + "'", str13, "154641875851979217989527150584");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6969");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("177737015693917378192561111197");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\002\ufffd\ufffd\177\b\ufffd");
        java.lang.String str13 = rSA1.decrypt("1030676276581334");
        java.lang.String str15 = rSA1.decrypt("325926960661284150045316145071");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "385" + "'", str7, "385");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "102124087262809442884715559615" + "'", str11, "102124087262809442884715559615");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\u0656\"\r\ufffd\ufffdQ\177)\b\ufffd\016" + "'", str13, "\001\u0656\"\r\ufffd\ufffdQ\177)\b\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdD\007\022\u0270\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffdD\007\022\u0270\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6970");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6971");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("103");
        java.lang.String str11 = rSA1.encrypt("\t\004\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("5627337140");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "483" + "'", str3, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "206836563692210937953411599072" + "'", str11, "206836563692210937953411599072");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "64" + "'", str13, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test6972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6972");
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
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39561796487522682807001065725" + "'", str9, "39561796487522682807001065725");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\u02d7q\022q[" + "'", str11, "\002\ufffd\ufffd\ufffd\u02d7q\022q[");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "379147980304732059782388182521" + "'", str13, "379147980304732059782388182521");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\026" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "118272717781982421875" + "'", str17, "118272717781982421875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "47178147534823169975426389263" + "'", str19, "47178147534823169975426389263");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "201451348873996196552390302344" + "'", str21, "201451348873996196552390302344");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\017\ufffd\ufffd\ufffd\016\034\ufffd6)\025" + "'", str23, "\001\017\ufffd\ufffd\ufffd\016\034\ufffd6)\025");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\002\023\ufffd\034\002\ufffd\ufffd\ufffd" + "'", str25, "\002\023\ufffd\034\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6973");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("3607240756192578");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "381" + "'", str7, "381");
    }

    @Test
    public void test6974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6974");
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
        java.lang.String str23 = rSA1.encrypt("2213573471");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "169" + "'", str3, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "771914163613077" + "'", str7, "771914163613077");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1878474608246425" + "'", str13, "1878474608246425");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1095833565669629" + "'", str15, "1095833565669629");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1878316509370517" + "'", str17, "1878316509370517");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1482974051931094" + "'", str21, "1482974051931094");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2570819820451588" + "'", str23, "2570819820451588");
    }

    @Test
    public void test6975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6975");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("\001C");
        java.lang.String str15 = rSA1.decrypt("237830699929158427676435923969");
        java.lang.String str17 = rSA1.decrypt("816520706679103403988220921956");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1693759298821082" + "'", str7, "1693759298821082");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "33698267" + "'", str13, "33698267");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\027\u0241\033" + "'", str15, "\b\ufffd\027\u0241\033");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\037\ufffd\ufffd\ufffd" + "'", str17, "\004\ufffd\ufffd\037\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6976");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("538");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("144965845792444");
        java.lang.String str13 = rSA1.encrypt("\033\ufffd\ufffd\ufffd\030\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("5799003948");
        java.lang.String str17 = rSA1.encrypt("320632841594240414839688016246");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "624498884714935" + "'", str11, "624498884714935");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "505229957745637" + "'", str13, "505229957745637");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1946088532692102" + "'", str15, "1946088532692102");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2264380769812725" + "'", str17, "2264380769812725");
    }

    @Test
    public void test6977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6977");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("577925724882894");
        java.lang.String str13 = rSA1.encrypt("1976051006651625");
        java.lang.String str15 = rSA1.encrypt("_");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "43" + "'", str11, "43");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "207" + "'", str13, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "57" + "'", str15, "57");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6978");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("1450670214753405");
        java.lang.String str11 = rSA1.encrypt("87203191126925675072023416378");
        java.lang.String str13 = rSA1.encrypt("4603647114");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1931539063465899" + "'", str7, "1931539063465899");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "906376361800650" + "'", str9, "906376361800650");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1859663992140754" + "'", str11, "1859663992140754");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "799141730297638" + "'", str13, "799141730297638");
    }

    @Test
    public void test6979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6979");
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
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "59065797600834308368681931127" + "'", str9, "59065797600834308368681931127");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "260754095620432986748781469374" + "'", str11, "260754095620432986748781469374");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd[\020" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\006\ufffd\ufffd[\020");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd6" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "372244746849900844428887377305" + "'", str17, "372244746849900844428887377305");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\002\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test6980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6980");
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
            java.lang.String str21 = rSA1.decrypt("\004\ufffd\ufffd?\016\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?b?s\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "441" + "'", str3, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "277" + "'", str11, "277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "98" + "'", str13, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "536088138016501077182393055503" + "'", str17, "536088138016501077182393055503");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "197159195227743611186538645986" + "'", str19, "197159195227743611186538645986");
    }

    @Test
    public void test6981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6981");
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
        java.lang.String str23 = rSA1.decrypt("305350523104033606841712607345");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "280924332412985584396845104298" + "'", str9, "280924332412985584396845104298");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\u052b\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\ufffd\u052b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "203851154870044496610463931657" + "'", str13, "203851154870044496610463931657");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "132651" + "'", str17, "132651");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\b\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "729000" + "'", str21, "729000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\005$Z+F\t\023" + "'", str23, "\005$Z+F\t\023");
    }

    @Test
    public void test6982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6982");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("\002\ufffdMiby\036\031\ufffd\ufffd&");
        java.lang.String str13 = rSA1.decrypt("3060553596769532");
        java.lang.String str15 = rSA1.encrypt("257");
        rSA1.generateKeys((int) (short) 10);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "93" + "'", str11, "93");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "148" + "'", str15, "148");
    }

    @Test
    public void test6983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6983");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("96");
        java.lang.String str5 = rSA1.encrypt("4");
        java.lang.String str7 = rSA1.encrypt("\t\001\ufffd\ufffd\ufffdB");
        java.lang.String str9 = rSA1.decrypt("241119870300090292304087394723");
        java.lang.String str11 = rSA1.decrypt("6756588560");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9562383435" + "'", str3, "9562383435");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "380204032" + "'", str5, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "134550656" + "'", str7, "134550656");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdi" + "'", str9, "\000\ufffd\ufffdi");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd=V" + "'", str11, "\001\ufffd\ufffd=V");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6984");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("538");
        java.lang.String str7 = rSA1.encrypt("8589662889");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("16384");
        rSA1.generateKeys(10);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6985");
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
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "267" + "'", str3, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "778784878099523" + "'", str7, "778784878099523");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "617" + "'", str11, "617");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "P" + "'", str19, "P");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "41" + "'", str21, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001L" + "'", str23, "\001L");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "190" + "'", str27, "190");
    }

    @Test
    public void test6986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6986");
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
        java.lang.String str21 = rSA1.encrypt("636654107246801017222072334304");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "576" + "'", str3, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "67747175084118063760122217442" + "'", str9, "67747175084118063760122217442");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "399810899043157385583643441826" + "'", str11, "399810899043157385583643441826");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1024" + "'", str13, "1024");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "161" + "'", str17, "161");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "47" + "'", str19, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "49" + "'", str21, "49");
    }

    @Test
    public void test6987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6987");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380204032" + "'", str9, "380204032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "255552661053564500015262480225" + "'", str11, "255552661053564500015262480225");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1032268004490324261226793942475" + "'", str13, "1032268004490324261226793942475");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "323310540161915584693048017106" + "'", str15, "323310540161915584693048017106");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\n\uad62\ufffd" + "'", str17, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\n\uad62\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "547057033674783078006192016021" + "'", str19, "547057033674783078006192016021");
    }

    @Test
    public void test6988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6988");
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
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "857927231697444" + "'", str7, "857927231697444");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "{" + "'", str11, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
    }

    @Test
    public void test6989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6989");
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
        java.math.BigInteger bigInteger32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger33 = rSA1.encrypt(bigInteger32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "875" + "'", str3, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "554361669990362" + "'", str7, "554361669990362");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "375439759528074998845147645831" + "'", str13, "375439759528074998845147645831");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\r" + "'", str19, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "24467101148382236688280597723" + "'", str23, "24467101148382236688280597723");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\b\ufffd\u0358" + "'", str25, "\ufffd\ufffd\ufffd\ufffd\b\ufffd\u0358");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "25088639582528015544379774742" + "'", str27, "25088639582528015544379774742");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "8014174359158260373293006953" + "'", str29, "8014174359158260373293006953");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "36770038093188573542264691847" + "'", str31, "36770038093188573542264691847");
    }

    @Test
    public void test6990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6990");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\0018");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?8\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "447488817943152159302968204319" + "'", str9, "447488817943152159302968204319");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "260230261905832886672439579863" + "'", str13, "260230261905832886672439579863");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffdI\025\ufffd\ufffd\ufffdp`V\036" + "'", str15, "\003\ufffdI\025\ufffd\ufffd\ufffdp`V\036");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52521875" + "'", str17, "52521875");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\u0556\017\007\ufffdH\021\ufffd" + "'", str19, "\000\ufffd\ufffd\ufffd\u0556\017\007\ufffdH\021\ufffd");
    }

    @Test
    public void test6991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6991");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("4");
        java.lang.String str5 = rSA1.decrypt("4");
        java.lang.String str7 = rSA1.decrypt("338251585");
        java.lang.String str9 = rSA1.decrypt("198");
        java.lang.String str11 = rSA1.decrypt("666852044142564779122674445212");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "257" + "'", str3, "257");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n" + "'", str7, "\001\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "k" + "'", str9, "k");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test6992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6992");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("8882581186");
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("111158135588212");
        java.lang.String str17 = rSA1.decrypt("286265936422108");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "610059321208838" + "'", str7, "610059321208838");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "183" + "'", str11, "183");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffdL\036\ufffd" + "'", str15, "\000\ufffdL\036\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffdr/r" + "'", str17, "\002\ufffdr/r");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6993");
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
        java.lang.String str21 = rSA1.decrypt("259654016390711146139339125239");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "669" + "'", str3, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "33498445484715677227" + "'", str9, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "411557418596379147603626768911" + "'", str11, "411557418596379147603626768911");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "185192237786579330257029541249" + "'", str13, "185192237786579330257029541249");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\n\177\033\ufffd\ufffd\024\ufffd" + "'", str15, "\t\n\177\033\ufffd\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "255710447168586147984475569525" + "'", str17, "255710447168586147984475569525");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000" + "'", str21, "\000");
    }

    @Test
    public void test6994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6994");
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
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "382112951309608" + "'", str7, "382112951309608");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36" + "'", str11, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "49" + "'", str19, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10" + "'", str21, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "." + "'", str23, ".");
    }

    @Test
    public void test6995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6995");
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
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "142" + "'", str3, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "488135028535439" + "'", str7, "488135028535439");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "107" + "'", str11, "107");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "651" + "'", str19, "651");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "547" + "'", str21, "547");
    }

    @Test
    public void test6996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6996");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001.");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.encrypt("1761509011968114");
        java.lang.String str9 = rSA1.encrypt("2076037979466698");
        java.lang.String str11 = rSA1.decrypt("380423421443618706983369572489");
        java.lang.String str13 = rSA1.encrypt("313145417605523375439450352290");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("\005\ufffdC\003\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("1882487327242800");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "82" + "'", str3, "82");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7604497157" + "'", str7, "7604497157");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7014568796" + "'", str9, "7014568796");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4771391963" + "'", str13, "4771391963");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1403342792048221" + "'", str17, "1403342792048221");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2476970491608029" + "'", str19, "2476970491608029");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6997");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.encrypt("1597935467345796");
        java.lang.String str15 = rSA1.encrypt("353706821132697402012447044730");
        java.lang.String str17 = rSA1.decrypt("1422455974188443");
        java.lang.String str19 = rSA1.decrypt("254582105833047647031630618683");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "207" + "'", str3, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "699742684187534" + "'", str7, "699742684187534");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2255877746308792" + "'", str13, "2255877746308792");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2064997574745039" + "'", str15, "2064997574745039");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd'Y" + "'", str17, "\ufffd\ufffd'Y");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\u04e4Y\034\ufffd\023" + "'", str19, "\001\u04e4Y\034\ufffd\023");
    }

    @Test
    public void test6998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6998");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\004\ufffd\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.decrypt("805201222");
        java.lang.String str13 = rSA1.decrypt("44");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("1440845431");
        java.lang.String str21 = rSA1.decrypt("120210931294819567914781828560");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "96" + "'", str3, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1280534516271985" + "'", str7, "1280534516271985");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004" + "'", str11, "\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "z" + "'", str13, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\005\ufffd\ufffd\ufffd\n\ufffd\ufffd\ufffd\ufffd\f\ufffd" + "'", str19, "\005\ufffd\ufffd\ufffd\n\ufffd\ufffd\ufffd\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004ar\007\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\177" + "'", str21, "\004ar\007\036\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\177");
    }

    @Test
    public void test6999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6999");
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
        java.lang.String str21 = rSA1.decrypt("7035134689");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "266" + "'", str3, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "526252146878861300340560787810" + "'", str9, "526252146878861300340560787810");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\034\032\ufffd\ufffd\ufffd\004\037\ufffd\ufffd\ufffd" + "'", str11, "\001\034\032\ufffd\ufffd\ufffd\004\037\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "393349813651063852572282172891" + "'", str13, "393349813651063852572282172891");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\004\"\\\001\ufffd\ufffd\ufffd_G>{" + "'", str15, "\001\ufffd\004\"\\\001\ufffd\ufffd\ufffd_G>{");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "517500552346544342281926445597" + "'", str17, "517500552346544342281926445597");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffdj9iQ\016" + "'", str21, "\005\ufffd\ufffd\ufffd\ufffdj9iQ\016");
    }

    @Test
    public void test7000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test7000");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("103");
        java.lang.String str9 = rSA1.decrypt("387");
        java.lang.String str11 = rSA1.encrypt("\001\007");
        java.lang.String str13 = rSA1.decrypt("673899523054237850976");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\u07de");
        java.lang.String str17 = rSA1.encrypt("721635304447410705445562059742");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "411506233443985" + "'", str7, "411506233443985");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd\ufffd" + "'", str9, "\007\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1197343729052360" + "'", str11, "1197343729052360");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\u04f2\b\ufffd" + "'", str13, "\003\ufffd\ufffd\u04f2\b\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2000437524213890" + "'", str15, "2000437524213890");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2021458345615886" + "'", str17, "2021458345615886");
    }
}
