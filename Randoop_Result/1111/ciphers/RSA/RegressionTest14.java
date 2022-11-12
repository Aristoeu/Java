package ciphers.RSA;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str7 = rSA1.encrypt("\001\n+\f\ufffd\004\ufffd\ufffd\006\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("540862025840994112940254955947");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "387" + "'", str5, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "86" + "'", str7, "86");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\n" + "'", str9, "\001\n");
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("211");
        java.lang.String str13 = rSA1.decrypt("289734891292401713311056387999");
        java.lang.String str15 = rSA1.decrypt("10");
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "271949548536861492312696663840" + "'", str5, "271949548536861492312696663840");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\032\u0360\ufffd\ufffd\f" + "'", str7, "\001\ufffd\032\u0360\ufffd\ufffd\f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "126322860419059217527478134622" + "'", str9, "126322860419059217527478134622");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "273814382735267358258714083114" + "'", str11, "273814382735267358258714083114");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd$A'/R\022o3" + "'", str13, "\002\ufffd\ufffd\ufffd$A'/R\022o3");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\025\ufffd\ufffdq\r\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\025\ufffd\ufffdq\r\ufffd");
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.encrypt("g");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\000\ufffd\ufffd\177\ufffd\ufffd" + "'", str11, "\000\ufffd\000\ufffd\ufffd\177\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "122987386542487" + "'", str13, "122987386542487");
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("\002\u99ed\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("420302657462966387311701231107");
        java.lang.String str21 = rSA1.encrypt("\001y");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\u0271\ufffds\025\n\ufffdN\007\ufffd_" + "'", str9, "\005\u0271\ufffds\025\n\ufffdN\007\ufffd_");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "344" + "'", str17, "344");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "136" + "'", str19, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "384" + "'", str21, "384");
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("746226611113599520813292889194");
        java.lang.String str21 = rSA1.encrypt("\002");
        java.lang.String str23 = rSA1.encrypt("\000\ufffd\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004D\021\ufffd\027\ufffd$\\" + "'", str17, "\004D\021\ufffd\027\ufffd$\\");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "680533690269732828849989806287" + "'", str19, "680533690269732828849989806287");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "8" + "'", str21, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "752699961247777026511110547820" + "'", str23, "752699961247777026511110547820");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        java.lang.String str9 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000h\020");
        java.lang.String str11 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\000\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "353" + "'", str7, "353");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "16" + "'", str9, "16");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "484" + "'", str11, "484");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
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
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "419" + "'", str3, "419");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "37389697848022010721620500828" + "'", str7, "37389697848022010721620500828");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "24150540027051559927504716501" + "'", str9, "24150540027051559927504716501");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "a\013\ufffd\ufffd\ufffd\ufffd\ufffdDnX" + "'", str11, "a\013\ufffd\ufffd\ufffd\ufffd\ufffdDnX");
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.encrypt("151576759553152219386286841859");
        java.lang.String str11 = rSA1.decrypt("182939750793257963236342034709");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52074719373262323144896205854" + "'", str3, "52074719373262323144896205854");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "46727543287663679452767780549" + "'", str5, "46727543287663679452767780549");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "13918204898779908496166768215" + "'", str9, "13918204898779908496166768215");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\u0736\ufffd\ufffd\ufffd\ufffd\u07a2\ufffd\ufffdr" + "'", str11, "\000\u0736\ufffd\ufffd\ufffd\ufffd\u07a2\ufffd\ufffdr");
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.decrypt("236");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\000\ufffd\u0278\ufffd\ufffdn\031");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1998947500173" + "'", str9, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffdA" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffdA");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\"\u04ec\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\006\"\u04ec\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("6901296438808693457125536937");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "285669013012569559893121302327" + "'", str11, "285669013012569559893121302327");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "307732862434921875" + "'", str13, "307732862434921875");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "D4[/\022\ufffd\ufffd\ufffd\ufffd\ufffd\024" + "'", str17, "D4[/\022\ufffd\ufffd\ufffd\ufffd\ufffd\024");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002:" + "'", str3, "\002:");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.decrypt("3");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("57175998901367284276443266086");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd+w!X;\002" + "'", str9, "\000\ufffd\ufffd\ufffd\ufffd\ufffd+w!X;\002");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "346683552840176898947862162844" + "'", str11, "346683552840176898947862162844");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\037\ufffdh0\000\ufffd\ufffd\ufffd\ufffd.2" + "'", str13, "\002\037\ufffdh0\000\ufffd\ufffd\ufffd\ufffd.2");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\u02cd\020\ufffd\007" + "'", str17, "\ufffd\u02cd\020\ufffd\007");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.decrypt("45739559234940083783638906525");
        java.lang.String str17 = rSA1.encrypt("\025\ufffd\ufffd\ufffd\t\u04ab\ufffd\u0124F");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\u077f\ufffd\ufffd");
        java.lang.String str21 = rSA1.decrypt("17753220861171122863843485581");
        java.lang.String str23 = rSA1.decrypt("26483223552903068015403589737");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3021500063" + "'", str13, "3021500063");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\177\ufffd" + "'", str15, "\002\ufffd\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2793791976" + "'", str17, "2793791976");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5645417023" + "'", str19, "5645417023");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\u05b4" + "'", str21, "\001\u05b4");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd" + "'", str23, "\ufffd");
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\024\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001\024\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "502992019779535489466300084947" + "'", str15, "502992019779535489466300084947");
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffd\ufffd\002" + "'", str3, "\005\ufffd\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "648634758" + "'", str5, "648634758");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.encrypt("\002\030");
        java.lang.String str15 = rSA1.decrypt("1279241919");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\u0493\013\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\u0493\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "25796383652980266935563327617" + "'", str11, "25796383652980266935563327617");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "153990656" + "'", str13, "153990656");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffdk\031\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffdk\031\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "678832912901739560877800724119" + "'", str5, "678832912901739560877800724119");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "242068764717711729074047076311" + "'", str13, "242068764717711729074047076311");
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("1");
        java.lang.String str17 = rSA1.decrypt("562006943487545493254596708066");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\030\ufffd`" + "'", str7, "\000\ufffd\030\ufffd`");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6344149474" + "'", str9, "6344149474");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001" + "'", str15, "\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\tw\031\ufffd" + "'", str17, "\tw\031\ufffd");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("1182893724347850");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "809399517" + "'", str11, "809399517");
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.decrypt("2533194306");
        java.lang.String str17 = rSA1.encrypt("d2FD");
        java.lang.String str19 = rSA1.decrypt("1078240112268825");
        java.lang.String str21 = rSA1.encrypt("\002\ufffdz\037\ufffd\ufffd\ufffd");
        java.lang.String str23 = rSA1.decrypt("603881001871112697036903648995");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "67" + "'", str9, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001v" + "'", str13, "\001v");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\r" + "'", str15, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "79" + "'", str17, "79");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd" + "'", str19, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "428" + "'", str21, "428");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        java.lang.String str15 = rSA1.encrypt("3934956567");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002E" + "'", str7, "\002E");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "478" + "'", str9, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "751" + "'", str13, "751");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "247" + "'", str15, "247");
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
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
        java.lang.String str21 = rSA1.encrypt("\005AI6\003\ufffd\ufffd\022\ufffd\ufffd");
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffdwy|,\021\n\ufffd" + "'", str13, "\ufffd\ufffdwy|,\021\n\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "37395606164520323091711777376" + "'", str15, "37395606164520323091711777376");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "28289523097165297642941795121" + "'", str17, "28289523097165297642941795121");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "41628909866109482491068357128" + "'", str19, "41628909866109482491068357128");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2227025543835092946807702539" + "'", str21, "2227025543835092946807702539");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.decrypt("663612053");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffdM");
        java.lang.String str17 = rSA1.encrypt("800428690524956154324372637061");
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.encrypt("\001\ufffdK2");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "477" + "'", str9, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "564" + "'", str11, "564");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "594" + "'", str15, "594");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "465" + "'", str17, "465");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "33535234787326737660703790153" + "'", str21, "33535234787326737660703790153");
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("25523618145658550617122254904");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "279" + "'", str7, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "303" + "'", str9, "303");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "322970626508278142662333636036" + "'", str13, "322970626508278142662333636036");
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\f\ufffdx");
        java.lang.String str11 = rSA1.decrypt("1427855474");
        java.lang.String str13 = rSA1.decrypt("307707995715569958842130375");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("660324100868081021933239531849");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\u04f0\r\ufffd" + "'", str7, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\u04f0\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "89245870536477964023154446141" + "'", str9, "89245870536477964023154446141");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\u0410\ufffd\ufffd\ufffd\177!" + "'", str11, "\ufffd\u0410\ufffd\ufffd\ufffd\177!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\\\ufffd\ufffd\u0415\ufffd\006\u063d\ufffd" + "'", str13, "\001\ufffd\ufffd\\\ufffd\ufffd\u0415\ufffd\006\u063d\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "311322307297954007948849716247" + "'", str15, "311322307297954007948849716247");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "46725233422190937778690989853" + "'", str17, "46725233422190937778690989853");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("9810541998");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u072b\ufffd\ufffd\u0256\034\003\024");
        java.lang.String str9 = rSA1.decrypt("5229405238");
        java.lang.String str11 = rSA1.encrypt("867707232022423978954101232634");
        java.lang.String str13 = rSA1.decrypt("400186681612588698514703255002");
        java.lang.String str15 = rSA1.decrypt("839781259776750366986808080725");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "114" + "'", str5, "114");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "393" + "'", str7, "393");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "466" + "'", str11, "466");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("34");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "^`e!" + "'", str3, "^`e!");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002<Ar\tM-" + "'", str7, "\002<Ar\tM-");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.encrypt("304");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.decrypt("368725291998970996212051547330");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "293967930" + "'", str5, "293967930");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1413672584" + "'", str7, "1413672584");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\003|" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\003|");
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
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
        java.lang.String str21 = rSA1.encrypt("467");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\032\ufffd\ufffd" + "'", str9, "\032\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1176432987" + "'", str11, "1176432987");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\022\000\ufffd\ufffd" + "'", str13, "\022\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Twj/" + "'", str15, "Twj/");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "326760886" + "'", str17, "326760886");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "93710134" + "'", str19, "93710134");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1885335096" + "'", str21, "1885335096");
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("1579535512211996");
        java.lang.String str9 = rSA1.encrypt("\003\ufffd\ufffd\032\ufffd\ufffd\ufffd\u0649\ufffdo");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffdA~X" + "'", str3, "\000\ufffdA~X");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "933370679876872918542074912426" + "'", str7, "933370679876872918542074912426");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "69102112457455343769935717338" + "'", str9, "69102112457455343769935717338");
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        java.lang.String str17 = rSA1.encrypt("\ufffd\r\u0155W\002\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "249072750693398274343792978668" + "'", str11, "249072750693398274343792978668");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "35650010007221349888" + "'", str13, "35650010007221349888");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\u0661\u0180\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\u0661\u0180\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "196703811915191199568477408101" + "'", str17, "196703811915191199568477408101");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("1977421183");
        java.lang.String str13 = rSA1.encrypt("6435105965");
        java.lang.String str15 = rSA1.decrypt("12953298553151981494781864461");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1360665034643983" + "'", str11, "1360665034643983");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2091188283790418" + "'", str13, "2091188283790418");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffdA\037\ufffd" + "'", str15, "\005\ufffd\ufffdA\037\ufffd");
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("410411422422033928813383347735");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("173606844086014783550054563092");
        java.lang.String str13 = rSA1.encrypt("\013W\f\ufffdS~\177\ufffd\021\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p" + "'", str3, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "523" + "'", str7, "523");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\026" + "'", str11, "\001\026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "27" + "'", str13, "27");
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.decrypt("402271083010688");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd1" + "'", str7, "\002\ufffd\ufffd1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffdD6\017" + "'", str9, "\001\ufffdD6\017");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\u078ak\024" + "'", str11, "\000\u078ak\024");
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str9 = rSA1.decrypt("699920911295512");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd!J[" + "'", str3, "\000\ufffd!J[");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "34771409" + "'", str5, "34771409");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("4448254484");
        java.lang.String str9 = rSA1.decrypt("2533194306");
        java.lang.String str11 = rSA1.decrypt("407692171330915");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "543" + "'", str7, "543");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\r" + "'", str9, "\001\r");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "O" + "'", str11, "O");
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("718921407");
        java.lang.String str7 = rSA1.encrypt("1757553155773477");
        java.lang.String str9 = rSA1.decrypt("1243244621587145");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25943070461885508875872980875" + "'", str5, "25943070461885508875872980875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "272631744095828751217363780048" + "'", str7, "272631744095828751217363780048");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001iN\033\ufffd\ufffd+K\002^U" + "'", str9, "\001iN\033\ufffd\ufffd+K\002^U");
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.decrypt("0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\003\ufffd\022\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???q\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "455" + "'", str7, "455");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000" + "'", str9, "\000");
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\016\ufffda&");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "184808613810207357489973237480" + "'", str11, "184808613810207357489973237480");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("584282792217330789222543235577");
        java.lang.String str15 = rSA1.decrypt("219");
        java.lang.String str17 = rSA1.encrypt("16156209496766550638227152486");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58" + "'", str7, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "314" + "'", str11, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "44" + "'", str17, "44");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("477");
        java.lang.String str11 = rSA1.decrypt("2738770455975095");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "49" + "'", str7, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "185" + "'", str9, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\003\024\ufffd^\b\ufffd\ufffd" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\003\024\ufffd^\b\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "275366478784524519464659884473" + "'", str11, "275366478784524519464659884473");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "726372679487773967271279366029" + "'", str13, "726372679487773967271279366029");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\016*A" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\016*A");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\030\ufffd\ufffd\ufffd\ufffd\ufffdb\001\ufffd\ufffd" + "'", str17, "\002\030\ufffd\ufffd\ufffd\ufffd\ufffdb\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "832973218179528128539135501144" + "'", str19, "832973218179528128539135501144");
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\ufffdV");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\026n\f-\004E\003");
        java.lang.String str15 = rSA1.decrypt("111689798687628537347293047723");
        java.lang.String str17 = rSA1.decrypt("411980550599073681535390193692");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "108053296578227370191539738064" + "'", str5, "108053296578227370191539738064");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "607148237335412027456065707946" + "'", str7, "607148237335412027456065707946");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\016\ufffd\ufffdW.\000\ufffd\ufffd" + "'", str9, "\005\016\ufffd\ufffdW.\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "207632302499526717867050896331" + "'", str11, "207632302499526717867050896331");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "821865547999518352084917922772" + "'", str13, "821865547999518352084917922772");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffdy3" + "'", str15, "\007\ufffd\ufffd\ufffd\ufffdy3");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffda\004\241\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffda\004\241\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.encrypt("875");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "451189469670444398420151377367" + "'", str3, "451189469670444398420151377367");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "512770044686406142384949679971" + "'", str5, "512770044686406142384949679971");
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\004\031\ufffd\ufffd\ufffda");
        java.lang.String str13 = rSA1.encrypt("852");
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd+" + "'", str7, "\001\ufffd+");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1005005810" + "'", str11, "1005005810");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1819949246" + "'", str13, "1819949246");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.encrypt("377");
        java.lang.String str9 = rSA1.encrypt("537903484179846573266404376905");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\t" + "'", str3, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "907" + "'", str5, "907");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "188" + "'", str7, "188");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "315" + "'", str9, "315");
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("124998287");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("=");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"=\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "K\026\002d" + "'", str9, "K\026\002d");
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("497");
        java.lang.String str15 = rSA1.decrypt("9014646877");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "357" + "'", str7, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415" + "'", str9, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88" + "'", str13, "88");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\0019" + "'", str15, "\0019");
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "265085122047615995631688555150" + "'", str3, "265085122047615995631688555150");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1066332592229231159162666773865" + "'", str5, "1066332592229231159162666773865");
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
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
        java.lang.String str21 = rSA1.encrypt("\ufffd\ufffdk\017\ufffdi\025");
        java.lang.String str23 = rSA1.decrypt("72469838409023");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "369366373155623672742613474473" + "'", str5, "369366373155623672742613474473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "373874795534262896979629602640" + "'", str7, "373874795534262896979629602640");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdQ\035\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffdQ\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "169" + "'", str19, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "371" + "'", str21, "371");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "U" + "'", str23, "U");
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("502069562720669011972970389935");
        java.lang.String str9 = rSA1.encrypt("223805125323478817181308095756");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "109" + "'", str7, "109");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "204" + "'", str9, "204");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.decrypt("188289157854256346200468674953");
        java.lang.String str5 = rSA1.decrypt("93629648365587704361423475727");
        java.lang.String str7 = rSA1.decrypt("12890789073783317926012605505");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\\\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\\\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd\ufffd\b\ufffd\ufffd\b)\023\ufffd\ufffdJ" + "'", str5, "\000\ufffd\ufffd\b\ufffd\ufffd\b)\023\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ud218\ufffd\ufffd\ufffd\027\ufffd" + "'", str7, "\ufffd\ud218\ufffd\ufffd\ufffd\027\ufffd");
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("292429178019428864799183198942");
        java.lang.String str17 = rSA1.encrypt("\006");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\021\ufffd\u02c8\ufffd\ufffd\031OQ" + "'", str11, "\005\ufffd\021\ufffd\u02c8\ufffd\ufffd\031OQ");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffd\013" + "'", str15, "\007\ufffd\ufffd\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "7776" + "'", str17, "7776");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3230532224693906" + "'", str19, "3230532224693906");
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("68");
        java.lang.String str13 = rSA1.encrypt("~");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "348" + "'", str7, "348");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "119" + "'", str9, "119");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "227" + "'", str13, "227");
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.decrypt("304417796247364099549471429573");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("4542561699");
        rSA1.generateKeys((int) '4');
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\025\ufffd)^" + "'", str9, "\025\ufffd)^");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        java.lang.String str9 = rSA1.encrypt("151576759553152219386286841859");
        java.lang.String str11 = rSA1.encrypt("\007\ufffd\u037a\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "14904917576011845236390754420" + "'", str3, "14904917576011845236390754420");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "25250969401837439299960606568" + "'", str5, "25250969401837439299960606568");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19467680060316834240683763005" + "'", str9, "19467680060316834240683763005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "36760729132213273155682171114" + "'", str11, "36760729132213273155682171114");
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.decrypt("45739559234940083783638906525");
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("8591457828");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "8219682344" + "'", str13, "8219682344");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "T\003\ufffd\ufffd" + "'", str15, "T\003\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\n\u02ae\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\n\u02ae\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.decrypt("109");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "287" + "'", str3, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "24271978351896734104387211172" + "'", str7, "24271978351896734104387211172");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "38088554118686021819579420341" + "'", str9, "38088554118686021819579420341");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd@\032 \037\030\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd@\032 \037\030\ufffd");
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.decrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str7 = rSA1.encrypt("1579535512211996");
        java.lang.String str9 = rSA1.encrypt("\001@");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("630010341");
        java.lang.String str15 = rSA1.encrypt("\001i\f\u0116");
        java.lang.String str17 = rSA1.encrypt("\ufffd\ufffd\005\ufffd\ufffd\f\ufffd\ufffd\035");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\016\ufffd\ufffd\ufffd" + "'", str3, "\001\016\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "46479831723794807553730426808" + "'", str7, "46479831723794807553730426808");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "343597383680000000" + "'", str9, "343597383680000000");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004#q@?\030\ufffdz\t\ufffd\ufffd\013" + "'", str13, "\004#q@?\030\ufffdz\t\ufffd\ufffd\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "661376555622571221331761581761" + "'", str15, "661376555622571221331761581761");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "450989127443762822335118532608" + "'", str17, "450989127443762822335118532608");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("18");
        java.lang.String str5 = rSA1.decrypt("198");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "34" + "'", str3, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001)" + "'", str5, "\001)");
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.lang.String str7 = rSA1.encrypt("\001.");
        java.lang.String str9 = rSA1.encrypt("2635132195937723");
        java.lang.String str11 = rSA1.decrypt("1440088436628059");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "29526593786588593359792111" + "'", str3, "29526593786588593359792111");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3004130206729492107986470930" + "'", str5, "3004130206729492107986470930");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "229112403180614528" + "'", str7, "229112403180614528");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12899600428714231759916353134" + "'", str9, "12899600428714231759916353134");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\030\035\ufffd\ufffd\ufffd\ufffd\ufffd2" + "'", str11, "\004\030\035\ufffd\ufffd\ufffd\ufffd\ufffd2");
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("91");
        java.lang.String str15 = rSA1.decrypt("18978112990239");
        java.lang.String str17 = rSA1.encrypt("778110729542933295770468116968");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\u049b~L" + "'", str7, "\001\u049b~L");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002x\031\ufffd>" + "'", str9, "\002x\031\ufffd>");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144209936106499234037676064081" + "'", str13, "144209936106499234037676064081");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033cj" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\033cj");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "343225017592288719703266877835" + "'", str17, "343225017592288719703266877835");
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("i");
        java.lang.String str11 = rSA1.encrypt("693");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd@\0130" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffd@\0130");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140710042265625" + "'", str9, "140710042265625");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "17242818438489945059980444046" + "'", str11, "17242818438489945059980444046");
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
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
        java.lang.String str29 = rSA1.encrypt("x*\022;");
        java.lang.Class<?> wildcardClass30 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\177KTJ\030\ufffdhNdWth" + "'", str13, "\177KTJ\030\ufffdhNdWth");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "474059751214899" + "'", str17, "474059751214899");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3148349653317181" + "'", str19, "3148349653317181");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2047105870073506" + "'", str21, "2047105870073506");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\000\ufffd" + "'", str25, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "500" + "'", str27, "500");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "424" + "'", str29, "424");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\013\ufffd\ufffd\u0217\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\u02e8\ufffd\ufffd\026\ufffd\ufffd" + "'", str11, "\007\ufffd\ufffd\ufffd\u02e8\ufffd\ufffd\026\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2173138377523171" + "'", str15, "2173138377523171");
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "504193358342105754579508815786" + "'", str5, "504193358342105754579508815786");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\023\ufffd\ufffdV}hi\025f" + "'", str7, "\007\ufffd\023\ufffd\ufffdV}hi\025f");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380240656897239460951632150047" + "'", str9, "380240656897239460951632150047");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "861239658493403459122397677430" + "'", str11, "861239658493403459122397677430");
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("103");
        java.lang.String str7 = rSA1.encrypt("594763017596588918767158214056");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "33498445484715677227" + "'", str5, "33498445484715677227");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "393627807797345357367499171580" + "'", str7, "393627807797345357367499171580");
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "l" + "'", str3, "l");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\ufffd\u066f\ufffd\027Z~7" + "'", str9, "\004\ufffd\ufffd\ufffd\u066f\ufffd\027Z~7");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "497235326305363466559747638887" + "'", str15, "497235326305363466559747638887");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "129983834663565246829753040538" + "'", str17, "129983834663565246829753040538");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "426739146264898219777390219591" + "'", str19, "426739146264898219777390219591");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.encrypt("257");
        rSA1.generateKeys(10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "282" + "'", str7, "282");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "295" + "'", str9, "295");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.decrypt("29559895124206004158548285824");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "c" + "'", str9, "c");
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("140852255849216393944528302312");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\u021f\ufffd\ufffd\020\ufffd%" + "'", str9, "\002\ufffd\ufffd\u021f\ufffd\ufffd\020\ufffd%");
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\036\ufffd\ufffd\ufffd\002\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "34" + "'", str7, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "181" + "'", str9, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\033" + "'", str11, "\001\033");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "206" + "'", str13, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "338" + "'", str15, "338");
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("24913536938563019036853654452");
        java.lang.String str5 = rSA1.encrypt("654236752367953961630478066413");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("5121143687");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3129322179" + "'", str3, "3129322179");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "954600933" + "'", str5, "954600933");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2035442928" + "'", str9, "2035442928");
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("4448254484");
        java.lang.String str9 = rSA1.decrypt("4124289089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\000\ufffd\ufffd\r\ufffd,");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??td\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "357" + "'", str7, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001x" + "'", str9, "\001x");
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.encrypt("37345113952975016677704988614");
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.encrypt("32435583623013222146027734347");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "432" + "'", str5, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "203411862380698269808942563358" + "'", str9, "203411862380698269808942563358");
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
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
        java.lang.String str23 = rSA1.decrypt("433957177");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd/B\021v6" + "'", str13, "\ufffd\ufffd\ufffd\ufffd/B\021v6");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "858531946860191" + "'", str17, "858531946860191");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "587862705273057" + "'", str19, "587862705273057");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "821193591520269" + "'", str21, "821193591520269");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\u0137\ufffd\ufffd" + "'", str23, "\u0137\ufffd\ufffd");
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.decrypt("235");
        java.lang.String str13 = rSA1.encrypt("\001\023");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \" !??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n.\031$T\000\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\n.\031$T\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "144555030144998575362767788416" + "'", str9, "144555030144998575362767788416");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdJ" + "'", str11, "\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "118940252685546875" + "'", str13, "118940252685546875");
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "493039" + "'", str11, "493039");
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\023\ufffd\ufffdQ" + "'", str9, "\023\ufffd\ufffdQ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1098535969" + "'", str11, "1098535969");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "576" + "'", str13, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1313878726" + "'", str15, "1313878726");
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys((int) (short) 100);
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\004k\035\ufffd\026\ufffd" + "'", str3, "\004k\035\ufffd\026\ufffd");
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("697");
        java.lang.String str13 = rSA1.decrypt("39821921640796845967029940985");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1803001238655218" + "'", str7, "1803001238655218");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141001386125" + "'", str9, "3141001386125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "610589441215726" + "'", str11, "610589441215726");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\b\ufffd\ufffd\ufffd\026" + "'", str13, "\b\ufffd\ufffd\ufffd\026");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("1977421183");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\005\ufffd\ufffd\001\ufffd\"");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??]???\"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "961840709562398" + "'", str11, "961840709562398");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\030");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "287" + "'", str3, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "38315035745113936211113897741" + "'", str7, "38315035745113936211113897741");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "434122354776271665407291753291" + "'", str11, "434122354776271665407291753291");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("1571893042486033");
        java.lang.String str15 = rSA1.encrypt("10552031185");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "546630000935723586966920743518" + "'", str5, "546630000935723586966920743518");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\f\u0171\ufffd\ufffdd1\177\ufffdo" + "'", str7, "\b\f\u0171\ufffd\ufffdd1\177\ufffdo");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "425927596977747" + "'", str9, "425927596977747");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\037\ufffd\ufffd\ufffd\ufffdx" + "'", str13, "\002\ufffd\037\ufffd\ufffd\ufffd\ufffdx");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "65537127233087747986799007296" + "'", str15, "65537127233087747986799007296");
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("78125");
        java.lang.String str15 = rSA1.encrypt("42051371067607649082953930198");
        java.lang.String str17 = rSA1.encrypt("1789939320482584");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "104" + "'", str13, "104");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "489" + "'", str15, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "238" + "'", str17, "238");
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("2953018038");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "352" + "'", str7, "352");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "165" + "'", str15, "165");
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        java.lang.String str13 = rSA1.encrypt("26473901013199856375128902653");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\003\033\ufffd\ufffd\ufffd\ufffd/X\032\ufffd>Hf");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "g" + "'", str9, "g");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "134" + "'", str11, "134");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
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
        java.lang.String str23 = rSA1.encrypt("368600707613005943035554527983");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?????'?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002K" + "'", str15, "\002K");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "473784386" + "'", str23, "473784386");
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
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
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "90" + "'", str9, "90");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "390" + "'", str11, "390");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144" + "'", str13, "144");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "311" + "'", str15, "311");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\031" + "'", str17, "\031");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.encrypt("806");
        java.lang.String str13 = rSA1.encrypt("114");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "401" + "'", str11, "401");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "23" + "'", str13, "23");
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
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
        java.lang.String str21 = rSA1.decrypt("772648570002884559471380374683");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\ufffd\037\007\ufffd\ufffd\ufffd\ufffd\ufffd'");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"cs?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "74109398551604694513091414206" + "'", str5, "74109398551604694513091414206");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "160832434237573306346505698523" + "'", str7, "160832434237573306346505698523");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\u06c6\u071a\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\003\ufffd\u06c6\u071a\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\u0214\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\u0214\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "400" + "'", str19, "400");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001;" + "'", str21, "\001;");
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.decrypt("576");
        java.lang.String str9 = rSA1.decrypt("2435142595");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "158742761512750927240534048406" + "'", str5, "158742761512750927240534048406");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\017" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\017");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("18");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("371");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10375776746" + "'", str11, "10375776746");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3643865860" + "'", str13, "3643865860");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4537608783" + "'", str15, "4537608783");
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("110");
        java.lang.String str9 = rSA1.encrypt("\002\"");
        java.lang.String str11 = rSA1.encrypt("530125664087763084892740249912");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "473" + "'", str3, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\024\025\ufffd\ufffd:\004\ufffd\ufffd7" + "'", str7, "\024\025\ufffd\ufffd:\004\ufffd\ufffd7");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "14466001271480793216" + "'", str9, "14466001271480793216");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10130515865222011848229794538" + "'", str11, "10130515865222011848229794538");
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("\037\ufffdbM");
        java.lang.String str9 = rSA1.encrypt("12191618230608297297178555740");
        java.lang.String str11 = rSA1.decrypt("4270488148458321450044560294");
        java.lang.String str13 = rSA1.encrypt("592507074497355564223410845271");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "238" + "'", str7, "238");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "127" + "'", str9, "127");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003K" + "'", str11, "\003K");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "808" + "'", str13, "808");
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("2312924388126772");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???@\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "12916476053196255375495287851" + "'", str5, "12916476053196255375495287851");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
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
        java.lang.String str21 = rSA1.encrypt("572318888080881357035132732482");
        java.lang.String str23 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "U" + "'", str7, "U");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "188" + "'", str9, "188");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001;" + "'", str11, "\001;");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "234" + "'", str13, "234");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "425" + "'", str15, "425");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "42" + "'", str17, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "348" + "'", str19, "348");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "31" + "'", str21, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "253" + "'", str23, "253");
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("746226611113599520813292889194");
        java.lang.String str21 = rSA1.encrypt("\002");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "287" + "'", str9, "287");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\t\ufffd\ufffdY\003\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\t\ufffd\ufffdY\003\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "873319366223866285528593536587" + "'", str19, "873319366223866285528593536587");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "32" + "'", str21, "32");
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("2445186040379015");
        java.lang.String str13 = rSA1.encrypt("6455004095");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\003`");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8758605346" + "'", str11, "8758605346");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "914521003" + "'", str13, "914521003");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7274668170" + "'", str15, "7274668170");
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("746226611113599520813292889194");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\ufffd\017\ufffd\ufffd\177@\022e" + "'", str17, "\ufffd\ufffd\017\ufffd\ufffd\177@\022e");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "62699978206735033936631613915" + "'", str19, "62699978206735033936631613915");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(10);
        java.lang.String str3 = rSA1.encrypt("49");
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "250" + "'", str3, "250");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        java.lang.String str11 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\004\ufffd\ufffd\ufffdZ\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "51677424298801867813789955410" + "'", str3, "51677424298801867813789955410");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "14755239411839959143328432097" + "'", str5, "14755239411839959143328432097");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\b\ufffd\ufffd\r" + "'", str7, "\ufffd\ufffd\ufffd\b\ufffd\ufffd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28153056843" + "'", str9, "28153056843");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "27355077640932952148505150366" + "'", str11, "27355077640932952148505150366");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "55383652788770909594007163933" + "'", str13, "55383652788770909594007163933");
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.encrypt("292429178019428864799183198942");
        java.lang.String str19 = rSA1.encrypt("\ufffd\ufffdM");
        java.lang.String str21 = rSA1.encrypt("3445157757");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "341228989696786833865375406141" + "'", str17, "341228989696786833865375406141");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "477899392129723202331613225644" + "'", str19, "477899392129723202331613225644");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "453953801765694640559715121679" + "'", str21, "453953801765694640559715121679");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("48241217274650060621544778321");
        java.lang.String str11 = rSA1.encrypt("233522071185160290788315309401");
        java.lang.String str13 = rSA1.encrypt("503895191747017347732049762840");
        java.lang.String str15 = rSA1.decrypt("5824490359974973208230734176");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\035\000\ufffd\u07d3\ufffd{\035\ufffdk6");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "402682679846580723567410167473" + "'", str5, "402682679846580723567410167473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\ufffd\ufffd\007\ufffd\bmB" + "'", str7, "\b\ufffd\ufffd\ufffd\007\ufffd\bmB");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3287489800855579410913965509" + "'", str9, "3287489800855579410913965509");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "115738188450775179795001069214" + "'", str11, "115738188450775179795001069214");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "236143489929676285740865662899" + "'", str13, "236143489929676285740865662899");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffdMsJ=f\036\ufffd\ufffd\ufffdX" + "'", str15, "\006\ufffdMsJ=f\036\ufffd\ufffd\ufffdX");
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\0020O\030\007");
        java.lang.String str15 = rSA1.encrypt("426709633355535076532095478064");
        java.lang.String str17 = rSA1.encrypt("559930125032924915039245243630");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16993771596502140753371675213" + "'", str13, "16993771596502140753371675213");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "462171344033468788362750625" + "'", str15, "462171344033468788362750625");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "18556171882891482040090181768" + "'", str17, "18556171882891482040090181768");
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\033");
        java.lang.String str15 = rSA1.decrypt("210694636170018958841360670021");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.encrypt("400186681612588698514703255002");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd&\b\u5520 \007" + "'", str7, "\002\ufffd\ufffd\ufffd\ufffd&\b\u5520 \007");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "89206503930210860090893431118" + "'", str11, "89206503930210860090893431118");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "358824968808582125458412282927" + "'", str13, "358824968808582125458412282927");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\037\ufffd\020\ufffd\ufffd\u02b4\ufffd" + "'", str15, "\005\037\ufffd\020\ufffd\ufffd\u02b4\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "3977047358305117" + "'", str21, "3977047358305117");
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("\003i\t\ufffd\ufffdn");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("\004\ufffd\t\032\ufffd\004\ufffd\ufffd\ufffd\037\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.decrypt("\ufffd\ufffd\ufffduV\023\ufffdn");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "197471687944778096338294016490" + "'", str5, "197471687944778096338294016490");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\u0200\ufffdL\\\f-" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\u0200\ufffdL\\\f-");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "521549380304869245037946558071" + "'", str9, "521549380304869245037946558071");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "28697212706541563669868408313" + "'", str11, "28697212706541563669868408313");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1605822614" + "'", str15, "1605822614");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "103009627773369743775578988603" + "'", str19, "103009627773369743775578988603");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "298579587743074337189817309447" + "'", str21, "298579587743074337189817309447");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.decrypt("149");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "388" + "'", str7, "388");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002" + "'", str11, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "173" + "'", str13, "173");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\004\ufffd\ufffd\022\ufffd" + "'", str17, "\004\ufffd\004\ufffd\ufffd\022\ufffd");
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("7591156848866311702672535389");
        java.lang.String str17 = rSA1.encrypt("\t\032\ufffd\177\003\ufffd");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "297" + "'", str5, "297");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd" + "'", str7, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffdH" + "'", str15, "\001\ufffd\ufffd\ufffd\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "629164885518163" + "'", str17, "629164885518163");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("305");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\006g}\033\ufffd\ufffd\ufffd" + "'", str3, "\006g}\033\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "501441249222997" + "'", str5, "501441249222997");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.decrypt("21262565530067871612812451046");
        java.lang.String str21 = rSA1.decrypt("619563701");
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
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "274" + "'", str15, "274");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006" + "'", str19, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "X" + "'", str21, "X");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\033");
        java.lang.String str15 = rSA1.decrypt("210694636170018958841360670021");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5838008143481814867494127426" + "'", str5, "5838008143481814867494127426");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\004\ufffd_@&a\177\ufffd_aI" + "'", str7, "\004\ufffd_@&a\177\ufffd_aI");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "352862396018666572700476950926" + "'", str9, "352862396018666572700476950926");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "246657009154966253741656398179" + "'", str11, "246657009154966253741656398179");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "100506933176136910082025223361" + "'", str13, "100506933176136910082025223361");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\007\ufffd\ufffd\ufffdV\036\ufffd\ufffd\ufffd" + "'", str15, "\007\ufffd\ufffd\ufffdV\036\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.decrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("43274475586756537315930221703");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "302" + "'", str13, "302");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\013" + "'", str15, "\001\013");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "333" + "'", str17, "333");
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.decrypt("25881465153328890912467033366");
        java.lang.String str5 = rSA1.decrypt("405427151532843293141986653273");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd3g\034\ufffd{");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffdKZ,/" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffdKZ,/");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\u01f9\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\u01f9\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "7518005768313303656103386323" + "'", str7, "7518005768313303656103386323");
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
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
        java.lang.String str29 = rSA1.encrypt("x*\022;");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\u01b8\ufffd\ufffd\ufffd\016\t" + "'", str13, "\005\u01b8\ufffd\ufffd\ufffd\016\t");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "870706574758158" + "'", str17, "870706574758158");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1068169598886720" + "'", str19, "1068169598886720");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2077759531114472" + "'", str21, "2077759531114472");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001d" + "'", str25, "\001d");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "20" + "'", str27, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "263" + "'", str29, "263");
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("3141644858136");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("40266789915854491972442378621");
        java.lang.String str15 = rSA1.decrypt("555673510403649237558006483347");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffdo\006\ufffdd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffdo\006\ufffdd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "19606421062865120305467246752" + "'", str9, "19606421062865120305467246752");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3838141625" + "'", str13, "3838141625");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001n\032\u04e7" + "'", str15, "\001n\032\u04e7");
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002." + "'", str3, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "399" + "'", str7, "399");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O" + "'", str13, "O");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("334584945244912143283576554504");
        rSA1.generateKeys(10);
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\000\ufffd\177\ufffd\ufffd\ufffd" + "'", str7, "\007\ufffd\ufffd\000\ufffd\177\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\ufffd@\017\020\u02e2\032!\013\ufffd\007" + "'", str9, "\007\ufffd@\017\020\u02e2\032!\013\ufffd\007");
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.decrypt("18");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "38058865412163501933948627651" + "'", str3, "38058865412163501933948627651");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\u01bb\ufffd\ufffd@" + "'", str5, "\ufffd\ufffd\ufffd\u01bb\ufffd\ufffd@");
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("1757850692");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1433502911" + "'", str3, "1433502911");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\007|\004\ufffd1\020\ufffd\ufffd\ufffd" + "'", str7, "\b\007|\004\ufffd1\020\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("324006784837190610335526937353");
        java.lang.String str15 = rSA1.decrypt("1479170647844363");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026" + "'", str13, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\026");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffdD%\035\ufffd\ufffd\ufffd\ufffdj\005\001" + "'", str15, "\001\ufffdD%\035\ufffd\ufffd\ufffd\ufffdj\005\001");
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.encrypt("181432710910510765520166162804");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1421606552" + "'", str9, "1421606552");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2024361928" + "'", str13, "2024361928");
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("720881662483885555150199331319");
        java.lang.String str7 = rSA1.decrypt("819271931489141549926823657343");
        java.lang.String str9 = rSA1.decrypt("18853454238969305465279082584");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "154" + "'", str5, "154");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006" + "'", str7, "\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(100);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\013F\024\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd" + "'", str9, "\013F\024\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
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
        java.lang.String str21 = rSA1.encrypt("\t\ufffd\u04d8\ufffd\ufffd\013\ufffdWE[");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u05bf\ufffd\ufffd\ufffd\ufffdx\020\ufffd\034w" + "'", str13, "\u05bf\ufffd\ufffd\ufffd\ufffdx\020\ufffd\034w");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd" + "'", str17, "\005\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd" + "'", str19, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1796792704651137" + "'", str21, "1796792704651137");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.decrypt("374819453554656300671140535178");
        java.lang.String str11 = rSA1.decrypt("692097757822452120469993314703");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\tC" + "'", str9, "\ufffd\tC");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd");
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd]\035c");
        java.lang.String str19 = rSA1.encrypt("805453545486090582568173469490");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "372404830285835255868357142262" + "'", str11, "372404830285835255868357142262");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "502853898522269645014899247794" + "'", str13, "502853898522269645014899247794");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "419857798680791245478923486609" + "'", str17, "419857798680791245478923486609");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "182720694240952897906257164034" + "'", str19, "182720694240952897906257164034");
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("\007\016\ufffd\ufffd\ufffdt\001\ufffd\ufffd\r]");
        java.lang.String str15 = rSA1.decrypt("14404185661858243257287146439");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "607" + "'", str5, "607");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003A" + "'", str7, "\003A");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\0034" + "'", str9, "\0034");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "115247053115026086573267557461" + "'", str13, "115247053115026086573267557461");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffdo\020\024\u04e0\036V2" + "'", str15, "\005\ufffd\ufffd\ufffdo\020\024\u04e0\036V2");
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        java.lang.String str7 = rSA1.encrypt("\001.");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9297510739210388047224623159" + "'", str3, "9297510739210388047224623159");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "24503905788267830284625812993" + "'", str5, "24503905788267830284625812993");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "229112403180614528" + "'", str7, "229112403180614528");
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str19 = rSA1.decrypt("375222114829344077571796106442");
        java.lang.String str21 = rSA1.decrypt("64037679241642740792323135881");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\u0653\032\ufffd0o\027" + "'", str13, "\ufffd\ufffd\u0653\032\ufffd0o\027");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "44993433260953308809852239679" + "'", str15, "44993433260953308809852239679");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "8764054133860741442063691095" + "'", str17, "8764054133860741442063691095");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\u059f\ufffd\ufffd\ufffd\t2" + "'", str19, "\000\ufffd\ufffd\ufffd\ufffd\u059f\ufffd\ufffd\ufffd\t2");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\ufffd\ufffdd\001\ufffd\ufffd" + "'", str21, "\ufffd\ufffd\ufffd\ufffdd\001\ufffd\ufffd");
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("\002&f\006\ufffd#A");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.decrypt("713240672502241121516669753845");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19579041399704845014541719298" + "'", str5, "19579041399704845014541719298");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\t\ufffd\ufffd\ufffd\ufffd\ufffd\u07c4" + "'", str7, "\002\t\ufffd\ufffd\ufffd\ufffd\ufffd\u07c4");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "90897516740905250769838441858" + "'", str9, "90897516740905250769838441858");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd" + "'", str13, "\002\ufffd");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("11860916928095778934456708933");
        java.lang.String str15 = rSA1.decrypt("269");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "188385116" + "'", str13, "188385116");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd");
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("92");
        java.lang.String str11 = rSA1.encrypt("477");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("\ufffd\t\ufffd\t\ufffd\ufffd|E)<");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "84" + "'", str9, "84");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "198" + "'", str11, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "316680398" + "'", str15, "316680398");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd]\035c");
        java.lang.String str19 = rSA1.encrypt("805453545486090582568173469490");
        java.lang.String str21 = rSA1.decrypt("1010956965162879339435427668088");
        java.lang.String str23 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\004\ufffdBk");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "320049140770600233801102177848" + "'", str11, "320049140770600233801102177848");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "209026572895794884039539848407" + "'", str13, "209026572895794884039539848407");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd.O\005\ufffd\ufffd\002" + "'", str15, "\003\ufffd.O\005\ufffd\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "56130727514866251936980498997" + "'", str17, "56130727514866251936980498997");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "457092886991170591466373426577" + "'", str19, "457092886991170591466373426577");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd:i\023\ufffd" + "'", str21, "\006\ufffd\ufffd\ufffd\ufffd:i\023\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "34827110932691956918846983975" + "'", str23, "34827110932691956918846983975");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.decrypt("9076220414");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffdF9" + "'", str7, "\001\ufffdF9");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdf" + "'", str9, "\000\ufffd\ufffdf");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\037\ufffd\027\ufffd\ufffdq5");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("6910757459");
        java.lang.String str17 = rSA1.decrypt("29381871547015419129208926646");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0vJ\032" + "'", str9, "0vJ\032");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "637983138" + "'", str11, "637983138");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffdf" + "'", str15, "\002\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\"\ufffd" + "'", str17, "\"\ufffd");
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("1571893042486033");
        java.lang.String str15 = rSA1.encrypt("10552031185");
        java.lang.String str17 = rSA1.decrypt("656356768");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1860867" + "'", str9, "1860867");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\013\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd^" + "'", str13, "\002\013\ufffd\ufffd\005\ufffd\ufffd\ufffd\ufffd^");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "128732145530864375858811893090" + "'", str15, "128732145530864375858811893090");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffd\ufffd\ufffd\u04fe\ufffd\ufffd\020" + "'", str17, "\004\ufffd\ufffd\ufffd\u04fe\ufffd\ufffd\020");
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("324006784837190610335526937353");
        java.lang.String str15 = rSA1.encrypt("692429752057800817142458536884");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd" + "'", str7, "\003\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\027\ufffd\ufffdJ" + "'", str11, "\002\ufffd\ufffd\ufffd\027\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\026BP\r\b\ufffd\f\ufffd\ufffd\ufffd4" + "'", str13, "\004\026BP\r\b\ufffd\f\ufffd\ufffd\ufffd4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "51566410051062513703759736638" + "'", str15, "51566410051062513703759736638");
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.decrypt("663612053");
        java.lang.String str15 = rSA1.encrypt("\001\ufffd\ufffd\ufffdM");
        java.lang.String str17 = rSA1.encrypt("800428690524956154324372637061");
        rSA1.generateKeys((int) 'a');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "91" + "'", str7, "91");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "336" + "'", str9, "336");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "306" + "'", str11, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "191" + "'", str15, "191");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "17" + "'", str17, "17");
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("i");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("512");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\033\u04af\ufffd)\f\ufffds" + "'", str7, "\ufffd\ufffd\033\u04af\ufffd)\f\ufffds");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "140710042265625" + "'", str9, "140710042265625");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "62761084699980660606823646467" + "'", str11, "62761084699980660606823646467");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "60190449826644295434748051777" + "'", str13, "60190449826644295434748051777");
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u039d");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\\\033`e\035\ufffd\ufffd\037\ufffd\ufffd$");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + ")\035\ufffd\ufffd\ufffd\ufffd\031\ufffd?\037\ufffd" + "'", str9, ")\035\ufffd\ufffd\ufffd\ufffd\031\ufffd?\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "126" + "'", str13, "126");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "473" + "'", str15, "473");
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        java.lang.String str3 = rSA1.decrypt("393");
        java.lang.String str5 = rSA1.encrypt("\036\ufffd\ufffdT\004:S\001\ufffd\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\003\005\ufffd\ufffd\ufffd\ufffd\033\ufffd" + "'", str3, "\003\005\ufffd\ufffd\ufffd\ufffd\033\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "822425345398321344785411607834" + "'", str5, "822425345398321344785411607834");
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.decrypt("328805791735498462601197839334");
        java.lang.String str15 = rSA1.decrypt("61");
        java.lang.String str17 = rSA1.decrypt("97335813");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007\ufffd\ufffd\ufffd" + "'", str7, "\007\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\b\021\ufffd" + "'", str9, "\000\ufffd\b\021\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\000\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001D\030\ufffdb" + "'", str17, "\001D\030\ufffdb");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) ' ');
        java.lang.String str5 = rSA1.encrypt("\001\ufffd_\n\027\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2933364332" + "'", str5, "2933364332");
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.decrypt("1906624");
        java.lang.String str13 = rSA1.encrypt("7719506125");
        java.lang.String str15 = rSA1.encrypt("5658379289867321085145523895");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "|" + "'", str11, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "140" + "'", str13, "140");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "168" + "'", str15, "168");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("317201802686979902757");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\001\ufffd\002$");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?&??$\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032" + "'", str7, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "15" + "'", str9, "15");
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("\001Y");
        java.lang.String str7 = rSA1.decrypt("598335595765249845160178918537");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9261" + "'", str3, "9261");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "41063625" + "'", str5, "41063625");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001+}<Q" + "'", str7, "\001+}<Q");
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        java.lang.String str15 = rSA1.decrypt("480692378304951721450550723915");
        java.lang.String str17 = rSA1.encrypt("2956466552832");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\u02d9\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I" + "'", str7, "I");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "80872219435463356756193858629" + "'", str11, "80872219435463356756193858629");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3101364196875" + "'", str13, "3101364196875");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\177\016\ufffd\ufffd\002" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\177\016\ufffd\ufffd\002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "423586205307859105017734053504" + "'", str17, "423586205307859105017734053504");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "93939645463290951326076083739" + "'", str19, "93939645463290951326076083739");
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\002:");
        java.lang.String str11 = rSA1.decrypt("330347498407571458385524140683");
        java.lang.String str13 = rSA1.decrypt("559022853183225123364289860429");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2512629386" + "'", str9, "2512629386");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffdo\177f" + "'", str11, "\000\ufffdo\177f");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O\005\ufffdU" + "'", str13, "O\005\ufffdU");
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("\003\u04b3\025\037\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33026333768764928663961033768" + "'", str3, "33026333768764928663961033768");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18117288929677850217264589131" + "'", str11, "18117288929677850217264589131");
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "260" + "'", str7, "260");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "194" + "'", str9, "194");
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("3085358694");
        java.lang.String str15 = rSA1.decrypt("29278535641906038529534558959");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\024\ufffd\025\ufffd\ufffdT\030\ufffdyP!" + "'", str11, "\024\ufffd\025\ufffd\ufffdT\030\ufffdyP!");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\ufffdg\023\u065cE" + "'", str15, "\004\ufffd\ufffd\ufffdg\023\u065cE");
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("\002\033v\023\036\ufffd\ufffd\ufffd\u06e3\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "57" + "'", str9, "57");
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("352232997633148504781500198579");
        java.lang.String str9 = rSA1.encrypt("1747364598648182");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "665337901088898" + "'", str7, "665337901088898");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1245833986830223" + "'", str9, "1245833986830223");
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\033/7ZX");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \">??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "549898773453741555461146069350" + "'", str5, "549898773453741555461146069350");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "786427969244524392150818299063" + "'", str7, "786427969244524392150818299063");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd&\034\ufffdPa\n\ufffd\ufffd" + "'", str9, "\003\ufffd&\034\ufffdPa\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "306392271725023374600571931285" + "'", str15, "306392271725023374600571931285");
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.encrypt("70");
        java.lang.String str19 = rSA1.encrypt("\f\ufffd\ufffdP\025\ufffdy");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\000\ufffd\ufffd[");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??c?[\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "495903743" + "'", str11, "495903743");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1353082583" + "'", str15, "1353082583");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2181775125" + "'", str17, "2181775125");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2352055131" + "'", str19, "2352055131");
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("26173501046328141438509470773");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = rSA1.decrypt("\004\ufffdf\021\uc370\\\ufffdd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?o\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "431" + "'", str3, "431");
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("8610947732");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "207" + "'", str5, "207");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<" + "'", str7, "<");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "513565579" + "'", str11, "513565579");
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str19 = rSA1.decrypt("375222114829344077571796106442");
        java.lang.String str21 = rSA1.encrypt("\016");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\u0153\ufffd\ufffd\ufffd+>3\027\ufffd" + "'", str13, "\u0153\ufffd\ufffd\ufffd+>3\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "12713636989813294300530166764" + "'", str15, "12713636989813294300530166764");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "25206816830963248414868695404" + "'", str17, "25206816830963248414868695404");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\001\ufffdB\022\u06a4\ufffdKk" + "'", str19, "\000\ufffd\ufffd\001\ufffdB\022\u06a4\ufffdKk");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "537824" + "'", str21, "537824");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("331");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffdd*");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\004\ufffd\ufffd\n\ufffd\ufffd\032\ufffd\ufffdS\037if");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5977702121" + "'", str3, "5977702121");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "164587789493223331826213083807" + "'", str7, "164587789493223331826213083807");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "365813731538021530134367646507" + "'", str9, "365813731538021530134367646507");
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("2757505283");
        java.lang.String str11 = rSA1.encrypt("124998287");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "647" + "'", str7, "647");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "116" + "'", str11, "116");
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd\ufffd\033\ufffd");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("4655825244");
        java.lang.String str17 = rSA1.encrypt("207");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "752" + "'", str3, "752");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "337" + "'", str9, "337");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "291" + "'", str15, "291");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "306" + "'", str17, "306");
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("91");
        java.lang.String str15 = rSA1.decrypt("18978112990239");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd8" + "'", str7, "\001\ufffd\ufffd8");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\005\ufffd" + "'", str9, "\001\ufffd\ufffd\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3138428376721" + "'", str13, "3138428376721");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("\001/\017\ufffd9k\r%\001\ufffd\013\003@");
        java.lang.String str5 = rSA1.decrypt("101829020601681135151848379840");
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "319" + "'", str3, "319");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("1571893042486033");
        java.lang.String str9 = rSA1.encrypt("\003\021\ufffd\u076d\ufffd\u06fd\ufffdX\f\020");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4255087107");
        java.lang.String str15 = rSA1.encrypt("613471119662558");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0010" + "'", str7, "\0010");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "148" + "'", str9, "148");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9129175044821592354356361225" + "'", str15, "9129175044821592354356361225");
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("920884837535134851866630826219");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "20308211604254138098430720150" + "'", str7, "20308211604254138098430720150");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "334135264" + "'", str11, "334135264");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("598936615230950507052406172861");
        java.lang.String str9 = rSA1.encrypt("\001(");
        java.lang.String str11 = rSA1.encrypt("245");
        java.lang.String str13 = rSA1.encrypt("23585400911907150218938419175");
        java.lang.String str15 = rSA1.encrypt("1961392473");
        java.lang.String str17 = rSA1.encrypt("1229323393739314");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\r\ufffd\ufffdZ" + "'", str7, "\r\ufffd\ufffdZ");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4046922986" + "'", str9, "4046922986");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1364656513" + "'", str11, "1364656513");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "29405213" + "'", str13, "29405213");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "498765243" + "'", str15, "498765243");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "5634227446" + "'", str17, "5634227446");
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("3476022725615491");
        java.lang.String str9 = rSA1.decrypt("297390345872291348704589241775");
        java.lang.String str11 = rSA1.decrypt("22750475076595990664472268818");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "37761667692440245568" + "'", str3, "37761667692440245568");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\005\ufffd\000\ufffd\ufffd\ufffd\t\ufffd}\004r" + "'", str5, "\005\ufffd\000\ufffd\ufffd\ufffd\t\ufffd}\004r");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "648119145020051918426726977106" + "'", str7, "648119145020051918426726977106");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\033P\023\ufffd\ufffd\ufffd\032?(" + "'", str9, "\000\ufffd\ufffd\033P\023\ufffd\ufffd\ufffd\032?(");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\026\ufffd\ufffdep" + "'", str11, "\007\ufffd\ufffd\ufffd\026\ufffd\ufffdep");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        java.lang.String str13 = rSA1.decrypt("35583402576551630221");
        java.lang.String str15 = rSA1.decrypt("122987386542487");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "31" + "'", str11, "31");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1" + "'", str13, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\"" + "'", str15, "\001\"");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("110");
        java.lang.String str9 = rSA1.encrypt("\002\"");
        java.lang.String str11 = rSA1.encrypt("530125664087763084892740249912");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\f\ufffd\ufffd6\013\ufffd\ufffd" + "'", str7, "\ufffd\ufffd\f\ufffd\ufffd6\013\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48524739602976" + "'", str9, "48524739602976");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "18336125864445281381362058168" + "'", str11, "18336125864445281381362058168");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("23585400911907150218938419175");
        java.lang.String str9 = rSA1.decrypt("7");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "222" + "'", str7, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002A" + "'", str9, "\002A");
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
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
        java.lang.String str21 = rSA1.encrypt("408");
        java.lang.String str23 = rSA1.encrypt("81");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd:0\b\ufffd\ufffd\ufffd\ufffd{x" + "'", str13, "\ufffd:0\b\ufffd\ufffd\ufffd\ufffd{x");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\ufffd\ufffdJ" + "'", str17, "\001\ufffd\ufffd\ufffdJ");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "242242419257826875217717311605" + "'", str21, "242242419257826875217717311605");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "615955490989244240625" + "'", str23, "615955490989244240625");
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("302478007679515165391351820133");
        java.lang.String str11 = rSA1.decrypt("1911968676487794861921270941");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "598811383528458149786794040166" + "'", str9, "598811383528458149786794040166");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\t\ufffd\ufffd\u0161\n\ufffd\ufffd\ufffd" + "'", str11, "\t\ufffd\ufffd\u0161\n\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
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
        java.lang.String str21 = rSA1.encrypt("408");
        java.lang.String str23 = rSA1.encrypt("81");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd1" + "'", str13, "\000\ufffd\024\ufffd\ufffd\ufffd\ufffd\ufffd1");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\nTZ\"\ufffd]" + "'", str17, "\nTZ\"\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "449497083046147344345066297138" + "'", str21, "449497083046147344345066297138");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "187699958510171083654557851371" + "'", str23, "187699958510171083654557851371");
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("27281717494758208926478163563");
        java.lang.String str15 = rSA1.encrypt("\003\ufffd\021\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "833339346911138252540375365789" + "'", str5, "833339346911138252540375365789");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\006\ufffd\ufffd\ufffde>-\021" + "'", str9, "\001\006\ufffd\ufffd\ufffde>-\021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffdT\022\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffdT\022\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "16021429962373589041861240238" + "'", str15, "16021429962373589041861240238");
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("412855490441922175904469813661");
        java.lang.String str15 = rSA1.decrypt("311430194");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\u059e\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\024\u05ec7");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??7\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001>\017\r\ufffd" + "'", str7, "\001>\017\r\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2053703658086729" + "'", str11, "2053703658086729");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "941009691899779" + "'", str13, "941009691899779");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd)" + "'", str15, "\001\ufffd\ufffd\ufffd)");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "808377997891831" + "'", str17, "808377997891831");
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.decrypt("108");
        rSA1.generateKeys((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\026\025\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "p" + "'", str7, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "N" + "'", str9, "N");
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        java.lang.String str11 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str13 = rSA1.encrypt("166869500146933535004111431966");
        java.lang.String str15 = rSA1.decrypt("375");
        java.lang.String str17 = rSA1.encrypt("181650628272418426546905312378");
        rSA1.generateKeys((int) (short) 10);
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002 n^\032\ufffd\ufffd\ufffd" + "'", str9, "\002 n^\032\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "477472883185495099471073290703" + "'", str11, "477472883185495099471073290703");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "363868928120590156892827244445" + "'", str13, "363868928120590156892827244445");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006k\032\ufffd\ufffd\036\ufffd\ufffd\ufffd&" + "'", str15, "\006k\032\ufffd\ufffd\036\ufffd\ufffd\ufffd&");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "707783975798547496007101676481" + "'", str17, "707783975798547496007101676481");
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.decrypt("1091385417287759808405208588958");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("388222837");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n+\030\ufffd\340\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\n+\030\ufffd\340\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\007\ufffdJ\r\ufffd" + "'", str13, "\r\007\ufffdJ\r\ufffd");
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        java.lang.String str11 = rSA1.encrypt("488");
        java.lang.String str13 = rSA1.decrypt("407");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\031\ufffdz\034\013\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\031\ufffdz\034\013\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\024\ufffd\ufffd\u076f\ufffd\ufffd\ufffd\ufffd'" + "'", str9, "\ufffd\024\ufffd\ufffd\u076f\ufffd\ufffd\ufffd\ufffd'");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "26991046194867712800499804158" + "'", str11, "26991046194867712800499804158");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\006\ufffd\ufffd\u07d6\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\006\ufffd\ufffd\u07d6\ufffd");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.decrypt("576");
        java.lang.String str9 = rSA1.encrypt("464233162758104");
        rSA1.generateKeys((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "19697940448839067136418098073" + "'", str5, "19697940448839067136418098073");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdasD\006" + "'", str7, "\001\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdasD\006");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "390699275032164204590397217683" + "'", str9, "390699275032164204590397217683");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("\001\031");
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\003" + "'", str7, "\000\ufffd\ufffd\003");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1212974313" + "'", str13, "1212974313");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("35039915204721349358906154439");
        java.lang.String str11 = rSA1.decrypt("521");
        java.lang.String str13 = rSA1.encrypt("9136502753890856391130904668");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\034pB~7" + "'", str9, "\t\ufffd\ufffd\ufffd\ufffd\034pB~7");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\026\ufffd\ufffd\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd" + "'", str11, "\005\026\ufffd\ufffd\ufffd\ufffd\ufffd\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "699478325375464112617580598305" + "'", str13, "699478325375464112617580598305");
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.decrypt("478");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("6718140675");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd,\013\"E\t\ufffd\ufffd\ufffd1" + "'", str7, "\000\ufffd,\013\"E\t\ufffd\ufffd\ufffd1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "v\033\ufffd\ufffd\ufffd\ufffdd\023\ufffd\005\"D" + "'", str9, "v\033\ufffd\ufffd\ufffd\ufffdd\023\ufffd\005\"D");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "7451407226" + "'", str15, "7451407226");
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("148019774747790885656882734520");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\ufffd\b");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffdD\025\ufffd\ufffdT\022\004\ufffd\ufffd" + "'", str7, "\ufffdD\025\ufffd\ufffdT\022\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39583797585073624328175418595" + "'", str9, "39583797585073624328175418595");
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.encrypt("\006\017\u01c0\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.encrypt("a\f\ufffd");
        java.lang.String str9 = rSA1.encrypt("1245833986830223");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd\ufffd\ufffdc\033\ufffd\ufffd\bMG" + "'", str3, "\001\ufffd\ufffd\ufffdc\033\ufffd\ufffd\bMG");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "422691229519116641507763050245" + "'", str5, "422691229519116641507763050245");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "78192043699801272736928899054" + "'", str7, "78192043699801272736928899054");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "74253152647394124868448920284" + "'", str9, "74253152647394124868448920284");
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("7281312789");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "478" + "'", str5, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001C" + "'", str7, "\001C");
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "157" + "'", str9, "157");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001y" + "'", str11, "\001y");
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("339388108585043364906784345300");
        java.lang.String str9 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffdQ\035\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "887690865" + "'", str3, "887690865");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "230592352187564426014172933316" + "'", str7, "230592352187564426014172933316");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "691443884596831552965630682790" + "'", str9, "691443884596831552965630682790");
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.decrypt("14859665413418003080745671009");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\032\ufffd\025\ufffd\ufffd\ufffd\ufffd\035\ufffd\n" + "'", str11, "\004\ufffd\032\ufffd\025\ufffd\ufffd\ufffd\ufffd\035\ufffd\n");
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) '4');
        java.lang.String str13 = rSA1.decrypt("16408535731864370850402195300");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "416" + "'", str7, "416");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "306" + "'", str9, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffdA" + "'", str13, "\003\ufffd\ufffd\ufffd\ufffdA");
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("4141931971");
        java.lang.String str9 = rSA1.encrypt("\006\ufffd\ufffdU\020`");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "294612072" + "'", str3, "294612072");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "346346513484802975567617381762" + "'", str7, "346346513484802975567617381762");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "40521999421943158087732082655" + "'", str9, "40521999421943158087732082655");
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.encrypt("19152287741614");
        java.lang.String str21 = rSA1.decrypt("444286381059900859862762305623");
        java.lang.String str23 = rSA1.decrypt("638275819114067925202123398574");
        java.lang.String str25 = rSA1.encrypt("9703262712");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001W" + "'", str5, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005" + "'", str7, "\005");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\024\ufffdR" + "'", str11, "\004\ufffd\ufffd\ufffd\ufffd\024\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\021\ufffd\ufffd\ufffd\ufffd\034\ufffd\t\001<\020" + "'", str13, "\003\021\ufffd\ufffd\ufffd\ufffd\034\ufffd\t\001<\020");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "18017594191240411783444154130" + "'", str19, "18017594191240411783444154130");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd\030\ufffd\031\ufffd\031" + "'", str21, "\ufffd\ufffd\030\ufffd\031\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ufffd\022\ufffd\ufffd\013~n" + "'", str23, "\ufffd\022\ufffd\ufffd\013~n");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "3308971525213148970804289427" + "'", str25, "3308971525213148970804289427");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        java.lang.String str9 = rSA1.decrypt("143827611740296741825726282072");
        java.lang.String str11 = rSA1.encrypt("\003E");
        java.lang.String str13 = rSA1.decrypt("3541590856");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\027\ufffd\ufffd" + "'", str7, "\000\ufffd\027\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd@" + "'", str9, "\000\ufffd\ufffd@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4682033640" + "'", str11, "4682033640");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\b\ufffd\ufffd\ufffd" + "'", str13, "\001\b\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("28");
        java.lang.String str7 = rSA1.encrypt("255635653807356729488134260102");
        java.lang.String str9 = rSA1.decrypt("496767291");
        java.lang.String str11 = rSA1.decrypt("822");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9261" + "'", str3, "9261");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "723067938" + "'", str5, "723067938");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "70814199" + "'", str7, "70814199");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "^O@\r" + "'", str9, "^O@\r");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str11, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("29339648412823630308726258195");
        java.lang.String str15 = rSA1.encrypt("24829636972784436289623304425");
        java.lang.String str17 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("216114282778955613352595642073");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "450766669594624" + "'", str11, "450766669594624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd$R\000#" + "'", str13, "\004\ufffd\ufffd$R\000#");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1194073131853087" + "'", str15, "1194073131853087");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "727782152868015" + "'", str17, "727782152868015");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "277617522803050" + "'", str19, "277617522803050");
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
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
        java.lang.String str21 = rSA1.encrypt("\022\037\ufffd\026!?W");
        java.lang.String str23 = rSA1.decrypt("7882021201");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffdK\007\013\000\ufffd\ufffd\ufffd" + "'", str9, "\000\ufffd\ufffdK\007\013\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd" + "'", str17, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\006\022\ufffd\u03c1\ufffd\025" + "'", str19, "\006\022\ufffd\u03c1\ufffd\025");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "515932063502782" + "'", str21, "515932063502782");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\007v\032\ufffd" + "'", str23, "\007v\032\ufffd");
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("262");
        java.lang.String str13 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\017\ufffd.\021\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "476048364018954769887483783323" + "'", str5, "476048364018954769887483783323");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "295770396322832904083930275518" + "'", str7, "295770396322832904083930275518");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\004\t\ufffd\\\ufffd\ufffd\ufffd\013c" + "'", str9, "\001\004\t\ufffd\\\ufffd\ufffd\ufffd\013c");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "150562606468104253886196824333" + "'", str11, "150562606468104253886196824333");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "189845026726625395544118813011" + "'", str13, "189845026726625395544118813011");
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        java.lang.String str7 = rSA1.decrypt("1666742766");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\021\ufffd\ufffd\u0611\ufffd\ufffd*");
        java.lang.String str11 = rSA1.decrypt("456991522694002995070299717036");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "261" + "'", str5, "261");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "d" + "'", str7, "d");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "208" + "'", str9, "208");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.decrypt("566493823002207702026333299738");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u0395\ufffd" + "'", str3, "\u0395\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1059244298" + "'", str5, "1059244298");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\030\ufffd\ufffd\ufffd" + "'", str7, "\030\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("205");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("313579402379602599084496040893");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\313\ufffd\ufffd\ufffd\ufffd\036b" + "'", str7, "\000\ufffd\ufffd\313\ufffd\ufffd\ufffd\ufffd\036b");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35583402576551630221" + "'", str9, "35583402576551630221");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\006\ufffd\ufffd\ufffdmg\022\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\006\ufffd\ufffd\ufffdmg\022\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "201556738557908727113395416223" + "'", str13, "201556738557908727113395416223");
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("431923607505788966570625676475");
        java.lang.String str11 = rSA1.decrypt("1087283443");
        java.lang.String str13 = rSA1.encrypt("116838479707839055307388502694");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "39" + "'", str13, "39");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("\001F");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "66" + "'", str3, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32459581509316905109258921055" + "'", str7, "32459581509316905109258921055");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "34645976" + "'", str11, "34645976");
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001&" + "'", str9, "\001&");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        rSA1.generateKeys((int) '4');
        java.lang.String str17 = rSA1.encrypt("166");
        java.lang.String str19 = rSA1.encrypt("\001i\f\u0116");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\000\ufffd\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1780500216882033" + "'", str17, "1780500216882033");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2152318254996370" + "'", str19, "2152318254996370");
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("32");
        java.lang.String str9 = rSA1.decrypt("150463785061299561387815225633");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002s" + "'", str7, "\002s");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001;" + "'", str9, "\001;");
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        java.lang.String str15 = rSA1.encrypt("\004\u05b9\ufffd\001Yt\035\ufffd\u04968");
        java.lang.String str17 = rSA1.encrypt("852");
        java.lang.String str19 = rSA1.decrypt("1480310721");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1998947500173" + "'", str7, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1998947500173" + "'", str9, "1998947500173");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "223216565020308563308447127" + "'", str11, "223216565020308563308447127");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\b\ufffd\ufffd;\0133O4\035" + "'", str13, "\005\ufffd\ufffd\b\ufffd\ufffd;\0133O4\035");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "94159987215899262916300863715" + "'", str15, "94159987215899262916300863715");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "49983817086544684104" + "'", str17, "49983817086544684104");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\007NnHT\035\ufffd\177\ufffd\ufffd\013]" + "'", str19, "\007NnHT\035\ufffd\177\ufffd\ufffd\013]");
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000" + "'", str7, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "120" + "'", str9, "120");
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\005\ufffd\ufffd\\\001:\b\ufffd\u02c4\032\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.decrypt("0");
        java.lang.String str11 = rSA1.encrypt("403654551844995");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "187" + "'", str7, "187");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000" + "'", str9, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "142" + "'", str11, "142");
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("1506896065904167");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "{" + "'", str3, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\033" + "'", str7, "\001\033");
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
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
        java.lang.String str21 = rSA1.encrypt("236383474459525947628898035169");
        java.lang.String str23 = rSA1.encrypt("\000\u0351\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "571095976054665245552397244611" + "'", str11, "571095976054665245552397244611");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "243816705057654705423640417516" + "'", str13, "243816705057654705423640417516");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "46254853587346578137791161722" + "'", str19, "46254853587346578137791161722");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "30182429664070893742746104702" + "'", str21, "30182429664070893742746104702");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "39659306253093543316149657449" + "'", str23, "39659306253093543316149657449");
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("1572583165");
        java.lang.String str17 = rSA1.decrypt("1362239351");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "372" + "'", str9, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "347" + "'", str15, "347");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\u0368\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("843213133151520430191382738317");
        java.lang.String str15 = rSA1.decrypt("1865230467");
        java.lang.String str17 = rSA1.encrypt("365362228598105534857580613959");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1962465120461914" + "'", str7, "1962465120461914");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "768545918687599" + "'", str9, "768545918687599");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1679836964437277" + "'", str11, "1679836964437277");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "374105515353368" + "'", str13, "374105515353368");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\ufffd\ub913\ufffd" + "'", str15, "\003\ufffd\ub913\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1003196865292823" + "'", str17, "1003196865292823");
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("4");
        java.lang.String str11 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.encrypt("746000545279848273630129316903");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "48" + "'", str9, "48");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "374" + "'", str11, "374");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "404" + "'", str13, "404");
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("352232997633148504781500198579");
        java.lang.String str9 = rSA1.encrypt("1102300624");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str13 = rSA1.encrypt("756430847779839392136205126048");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1495345769837843" + "'", str7, "1495345769837843");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "89303077142462" + "'", str9, "89303077142462");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "551710641365267722506073962528" + "'", str13, "551710641365267722506073962528");
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.decrypt("18");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\003\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffdj\000\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "40888385426283947353944977713" + "'", str3, "40888385426283947353944977713");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "`\020$\n\003\ufffd\ufffd\027\ufffdx`" + "'", str5, "`\020$\n\003\ufffd\ufffd\027\ufffdx`");
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("Z\013\ufffd\r");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("8199452757566862981340493898");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "752" + "'", str3, "752");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "687" + "'", str11, "687");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10902413865357832034142625455" + "'", str15, "10902413865357832034142625455");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "97" + "'", str21, "97");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffdp4" + "'", str7, "\000\ufffd\ufffdp4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1100536400683345" + "'", str11, "1100536400683345");
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt(":\032\ufffd");
        java.lang.String str11 = rSA1.decrypt("948800098063362453917824121700");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28994864466389676822411069452" + "'", str3, "28994864466389676822411069452");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "24439576692054765744311126989" + "'", str5, "24439576692054765744311126989");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd\027\ufffd\ufffd\ufffd\t\ufffd\ufffdR" + "'", str7, "\002\ufffd\ufffd\ufffd\027\ufffd\ufffd\ufffd\t\ufffd\ufffdR");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5939511629769541253590969256" + "'", str9, "5939511629769541253590969256");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\t\ufffd\020\ufffd\ufffd\017\ufffd" + "'", str11, "\000\ufffd\t\ufffd\020\ufffd\ufffd\017\ufffd");
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.encrypt("160015912349121428858268699636");
        java.lang.String str11 = rSA1.decrypt("3101364196875");
        java.lang.String str13 = rSA1.encrypt("156694516981785097946586665689");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "567270567118209508451299148086" + "'", str9, "567270567118209508451299148086");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001;" + "'", str11, "\001;");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "727503301035209792329915648057" + "'", str13, "727503301035209792329915648057");
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        java.lang.String str3 = rSA1.encrypt("314");
        java.lang.String str5 = rSA1.decrypt("211");
        java.lang.String str7 = rSA1.encrypt("3476022725615491");
        java.lang.String str9 = rSA1.encrypt("\ufffd\ufffd\u03a5\ufffd\ufffd\ufffd)q");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\033\ufffd\ufffd\035");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "813040157762276879596380524561" + "'", str3, "813040157762276879596380524561");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "132797042301465805236619652650" + "'", str7, "132797042301465805236619652650");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "726508550728891700350767954961" + "'", str9, "726508550728891700350767954961");
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        java.lang.String str9 = rSA1.decrypt("42988629419629811268004412533");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys(100);
        java.lang.String str15 = rSA1.decrypt("35583402576551630221");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002@" + "'", str3, "\002@");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001Q" + "'", str5, "\001Q");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "265" + "'", str7, "265");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\030" + "'", str9, "\001\030");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\ufffd\027\ufffd\u07e6\ufffd\ufffd" + "'", str15, "\001\ufffd\ufffd\ufffd\027\ufffd\u07e6\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("911315954");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "615511673" + "'", str11, "615511673");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1935922260" + "'", str13, "1935922260");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1640885865" + "'", str15, "1640885865");
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
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
        rSA1.generateKeys((int) ' ');
        java.lang.Class<?> wildcardClass24 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\026\ufffd\ufffd\ufffd\027\033f\004\u04f1" + "'", str13, "\000\ufffd\026\ufffd\ufffd\ufffd\027\033f\004\u04f1");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\001\u05dd\ufffd\ufffd" + "'", str17, "\004\001\u05dd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "342218129592177542034430919600" + "'", str21, "342218129592177542034430919600");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("51");
        java.lang.String str13 = rSA1.decrypt("2962249235");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "49" + "'", str7, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "204" + "'", str11, "204");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "w" + "'", str13, "w");
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
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
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\f\ufffd" + "'", str7, "\001\ufffd\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "272440717975361" + "'", str11, "272440717975361");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\004\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("80");
        java.lang.String str7 = rSA1.decrypt("16");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.encrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\\" + "'", str5, "\\");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "{" + "'", str7, "{");
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("1757850692");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.decrypt("891");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1642760521" + "'", str3, "1642760521");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\013\ufffd\ufffd\"\ufffd\ufffd\u05a4" + "'", str7, "\013\ufffd\ufffd\"\ufffd\ufffd\u05a4");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\027\ufffd\u02a0" + "'", str15, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\027\ufffd\u02a0");
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("95");
        java.lang.String str11 = rSA1.encrypt("779");
        java.lang.String str13 = rSA1.encrypt("177");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "258" + "'", str7, "258");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "41" + "'", str11, "41");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "267" + "'", str13, "267");
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        java.lang.String str9 = rSA1.encrypt("408960869851281769295293236048");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.encrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Q" + "'", str7, "Q");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "355" + "'", str9, "355");
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.decrypt("188289157854256346200468674953");
        java.lang.String str5 = rSA1.encrypt("100636888765105");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str3, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "13890597923339765329335970768" + "'", str5, "13890597923339765329335970768");
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        java.lang.String str9 = rSA1.encrypt("6901296438808693457125536937");
        java.lang.String str11 = rSA1.encrypt("41");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "377" + "'", str7, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "206" + "'", str9, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("\ufffd\034\ufffd\ufffd\007\ufffdy\006\r");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4996946657" + "'", str13, "4996946657");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "611532647" + "'", str15, "611532647");
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.encrypt("\ufffd\ufffd\030\\\ufffdM");
        java.lang.String str7 = rSA1.encrypt("34341750481510291836846710096");
        java.lang.String str9 = rSA1.decrypt("6575066778");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "229" + "'", str7, "229");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\t" + "'", str9, "\t");
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i" + "'", str5, "i");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "111172783825781844369284468783" + "'", str11, "111172783825781844369284468783");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31255875" + "'", str13, "31255875");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("497");
        java.lang.String str15 = rSA1.encrypt("\u33cc\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "357" + "'", str7, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415" + "'", str9, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88" + "'", str13, "88");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "26" + "'", str15, "26");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.decrypt("392170649013389");
        rSA1.generateKeys((int) (short) 100);
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
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\035\ufffd\ufffdu\027\002\f\ufffd" + "'", str13, "\ufffd\ufffd\035\ufffd\ufffdu\027\002\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "21232281354368734656684588079" + "'", str15, "21232281354368734656684588079");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\u040f\003\ufffd\ufffd\ufffd\ufffdS\031" + "'", str17, "\u040f\003\ufffd\ufffd\ufffd\ufffdS\031");
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("946669947");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("415");
        java.lang.String str13 = rSA1.decrypt("342981671868457888627866774352");
        java.lang.String str15 = rSA1.decrypt("102507813693098421712079540038");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "622" + "'", str3, "622");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "K" + "'", str5, "K");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "p" + "'", str7, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "39148494604456749876325589183" + "'", str11, "39148494604456749876325589183");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\u05a6Xvrg\032J" + "'", str13, "\ufffd\ufffd\u05a6Xvrg\032J");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\032\ufffd\u07be\u0130\ufffd\ufffd\f\ufffdb" + "'", str15, "\032\ufffd\u07be\u0130\ufffd\ufffd\f\ufffdb");
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("61273672939825812829984836584");
        java.lang.String str13 = rSA1.encrypt("270");
        java.lang.String str15 = rSA1.encrypt("462728225710467480573651150067");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\037\ufffd\ufffd" + "'", str7, "\037\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582305430" + "'", str9, "1582305430");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3208649587" + "'", str13, "3208649587");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1522434266" + "'", str15, "1522434266");
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("377");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd]\035c");
        rSA1.generateKeys(100);
        java.lang.String str21 = rSA1.encrypt("2360813996002195");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "473806727398903680945762817159" + "'", str11, "473806727398903680945762817159");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40339566574972586792587546341" + "'", str13, "40339566574972586792587546341");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd\n\u02d1" + "'", str15, "\006\ufffd\ufffd\ufffd\n\u02d1");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "457286203915417547932840201114" + "'", str17, "457286203915417547932840201114");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "216611231245042512865009906623" + "'", str21, "216611231245042512865009906623");
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.encrypt("\b\ufffd{[K\350\026\027\ufffd\ufffd@");
        java.lang.String str15 = rSA1.decrypt("1028793282341587");
        java.lang.String str17 = rSA1.decrypt("342981671868457888627866774352");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\ufffdA:q$\177\\\025\ufffd\037" + "'", str9, "\005\ufffd\ufffd\ufffdA:q$\177\\\025\ufffd\037");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "555172454059977692092022722465" + "'", str11, "555172454059977692092022722465");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "356858148300664011639861975158" + "'", str13, "356858148300664011639861975158");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd\ufffd\023\ufffd\ufffd\ufffd\024\ufffd\031\ufffd" + "'", str15, "\000\ufffd\ufffd\023\ufffd\ufffd\ufffd\024\ufffd\031\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006%\017\t\ufffd\023\ufffd\ufffd\u0332\ufffd" + "'", str17, "\006%\017\t\ufffd\023\ufffd\ufffd\u0332\ufffd");
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        java.lang.String str13 = rSA1.encrypt("517");
        java.lang.String str15 = rSA1.decrypt("720881662483885555150199331319");
        java.lang.String str17 = rSA1.encrypt("2977826838347180772119751944");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "779" + "'", str3, "779");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "646" + "'", str7, "646");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "693" + "'", str9, "693");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002B" + "'", str11, "\002B");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "325" + "'", str13, "325");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\001" + "'", str15, "\002\001");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "470" + "'", str17, "470");
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("28");
        java.lang.String str7 = rSA1.decrypt("155");
        java.lang.String str9 = rSA1.decrypt("1626986527636699");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5747863027" + "'", str5, "5747863027");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd.\177" + "'", str7, "\001\ufffd\ufffd.\177");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\022\ufffd" + "'", str9, "\001\ufffd\022\ufffd");
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("18035926155503512753160158122");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\007$k\016" + "'", str7, "\002\007$k\016");
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("17370499172228494712705721347");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "479364539409513259816802389846" + "'", str11, "479364539409513259816802389846");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "486628718237225461176333362380" + "'", str13, "486628718237225461176333362380");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b\037\ufffd\ufffd" + "'", str15, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\b\037\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.decrypt("287794280118878208");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "355847295966213983090708127128" + "'", str5, "355847295966213983090708127128");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "166368937549526370168648781884" + "'", str9, "166368937549526370168648781884");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "218697737179366676087747331211" + "'", str11, "218697737179366676087747331211");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\016\ufffd/" + "'", str15, "\016\ufffd/");
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("253");
        java.lang.String str13 = rSA1.decrypt("450766669594624");
        rSA1.generateKeys((int) 'a');
        java.lang.String str17 = rSA1.decrypt("8261899730695270217127585390");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
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
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004\ufffdZ\033\ufffd\ufffdx\013\r\ufffd" + "'", str17, "\004\ufffdZ\033\ufffd\ufffdx\013\r\ufffd");
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\016\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("2664643038279709");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "182180313510772897355903622786" + "'", str5, "182180313510772897355903622786");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "72591714081507124634303891463" + "'", str7, "72591714081507124634303891463");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\0010\003\ufffd\ufffd\ufffd\ufffd\ufffd\tC" + "'", str9, "\0010\003\ufffd\ufffd\ufffd\ufffd\ufffd\tC");
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("3085358694");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005B\"\ufffd\t\f\024\013\ufffd\033]" + "'", str11, "\005B\"\ufffd\t\f\024\013\ufffd\033]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\003\ufffd\ufffd\ufffdB" + "'", str13, "\006\ufffd\ufffd\ufffd\ufffd\003\ufffd\ufffd\ufffdB");
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
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
        java.lang.String str27 = rSA1.decrypt("7552527775");
        java.lang.String str29 = rSA1.encrypt("\003\ufffd\ufffd?Gwlso042");
        java.math.BigInteger bigInteger30 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger31 = rSA1.decrypt(bigInteger30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "69890032734119749529614022310" + "'", str5, "69890032734119749529614022310");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "425734909342933778319160925655" + "'", str7, "425734909342933778319160925655");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffdf" + "'", str9, "\003\ufffd\ufffd\ufffd\ufffd\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\u2787\ufffdXj%0" + "'", str11, "\007\u2787\ufffdXj%0");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "118" + "'", str19, "118");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "186" + "'", str21, "186");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000\ufffd" + "'", str23, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\000\ufffd^(i" + "'", str27, "\000\ufffd^(i");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "6006045800" + "'", str29, "6006045800");
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        java.lang.String str13 = rSA1.encrypt("4084101");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "lN``" + "'", str7, "lN``");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "493039" + "'", str11, "493039");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2293695759" + "'", str13, "2293695759");
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("40021916406662028876239884409");
        java.lang.String str17 = rSA1.decrypt("606785054325890502753303704230");
        java.lang.String str19 = rSA1.encrypt("\026\"\ufffd\ufffd\ufffd\013\ufffdC\\\n\ufffd\ufffd");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "67" + "'", str5, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55" + "'", str7, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9696122733" + "'", str15, "9696122733");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\027\ufffd" + "'", str17, "\001\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "5580990343" + "'", str19, "5580990343");
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.decrypt("1530678394");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001f" + "'", str3, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\n\ufffd\024\ufffd" + "'", str7, "\001\n\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffdf" + "'", str11, "\013\ufffd\ufffd\ufffd\ufffd\ufffdf");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3118010014874211" + "'", str13, "3118010014874211");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\t\ufffd\ufffd\ufffd\u0778" + "'", str15, "\t\ufffd\ufffd\ufffd\u0778");
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.decrypt("166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\006\ufffd\ufffd\ufffd\u0652\ufffd\ufffdx");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??w\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("20914855833503360039624631433");
        java.lang.String str9 = rSA1.encrypt("16156209496766550638227152486");
        java.lang.String str11 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\025\ufffd\u0247");
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "275" + "'", str9, "275");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "198" + "'", str11, "198");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
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
        java.lang.String str23 = rSA1.encrypt("30822019617233960135898227164");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\006" + "'", str5, "\001\006");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "23" + "'", str7, "23");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\007\ufffdU\007\ufffd\ufffdP\020$a" + "'", str17, "\007\ufffdU\007\ufffd\ufffdP\020$a");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "626060360622386125799760278625" + "'", str19, "626060360622386125799760278625");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "540237200671998097184593896897" + "'", str21, "540237200671998097184593896897");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "535874462835571562537770591227" + "'", str23, "535874462835571562537770591227");
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\001\037\ufffd\031\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("3258273441");
        java.lang.String str17 = rSA1.decrypt("39419623263939876888746627986");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\022\ufffd" + "'", str9, "\001\ufffd\022\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10567277936" + "'", str13, "10567277936");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\177\ufffd\031" + "'", str15, "\001\ufffd\177\ufffd\031");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\u06d4" + "'", str17, "\000\ufffd\ufffd\u06d4");
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffdD" + "'", str7, "\001\ufffd\ufffdD");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\000\ufffd" + "'", str9, "\000\ufffd\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "135005697" + "'", str11, "135005697");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("\002E");
        java.lang.String str13 = rSA1.encrypt("412855490441922175904469813661");
        java.lang.String str15 = rSA1.decrypt("311430194");
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\u059e\ufffd\ufffd");
        java.lang.String str19 = rSA1.encrypt("520");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\0006" + "'", str7, "\ufffd\0006");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "66203456086901" + "'", str11, "66203456086901");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2874066761642313" + "'", str13, "2874066761642313");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3135558281440615" + "'", str17, "3135558281440615");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1635512816037821" + "'", str19, "1635512816037821");
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("216830069518019772347544852692");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "M" + "'", str3, "M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "287" + "'", str5, "287");
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("\000\ufffd\ufffd\ufffdl");
        java.lang.String str13 = rSA1.decrypt("425");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "566474607672180" + "'", str9, "566474607672180");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "632361259322610" + "'", str11, "632361259322610");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd" + "'", str13, "\002\ufffd\ufffd");
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.encrypt("233006726736920949521554542653");
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.decrypt("878");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "230700405522730064730420061452" + "'", str5, "230700405522730064730420061452");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "254070965560124946172778563129" + "'", str7, "254070965560124946172778563129");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n\ufffd\ufffdh\022\ufffd\ufffd\ufffd" + "'", str9, "\n\ufffd\ufffdh\022\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "235283323447051548538911801211" + "'", str11, "235283323447051548538911801211");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.encrypt("~");
        java.lang.String str15 = rSA1.decrypt("448340620349665226658011811305");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\013\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2000376" + "'", str13, "2000376");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\004\025\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.decrypt("1008102450");
        java.lang.String str9 = rSA1.encrypt("276289691474689647742001128640");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\020\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\u01c6\ufffd" + "'", str3, "\u01c6\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "383002018162107" + "'", str9, "383002018162107");
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("4089374768");
        java.lang.String str5 = rSA1.encrypt("\000\ufffd\u06d9\003");
        java.lang.String str7 = rSA1.encrypt("127038516285899548678629729898");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\177\ufffd\ufffd \f\ufffd]");
        java.lang.String str15 = rSA1.decrypt("3541590856");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\u74ea\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "54" + "'", str5, "54");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "242" + "'", str7, "242");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "178" + "'", str13, "178");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "649" + "'", str17, "649");
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\002\u028e\r\ufffd\ufffd\f\ufffd\ufffd");
        java.lang.String str13 = rSA1.decrypt("211");
        java.lang.String str15 = rSA1.encrypt("\004\u05b9\ufffd\001Yt\035\ufffd\u04968");
        java.lang.String str17 = rSA1.decrypt("475");
        java.lang.String str19 = rSA1.decrypt("223216565020308563308447127");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "620790049448380366925938525278" + "'", str11, "620790049448380366925938525278");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\307\ufffd\ufffd\ufffd\ufffd\025!" + "'", str13, "\000\307\ufffd\ufffd\ufffd\ufffd\025!");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "542899706389933606896287005150" + "'", str15, "542899706389933606896287005150");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\b\b\ufffd\177\ufffd\ufffdk-\004" + "'", str17, "\b\b\ufffd\177\ufffd\ufffdk-\004");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\007\ufffd\ufffd\024\ufffd\ufffd\ufffdU" + "'", str19, "\001\ufffd\ufffd\007\ufffd\ufffd\024\ufffd\ufffd\ufffdU");
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("9810541998");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u072b\ufffd\ufffd\u0256\034\003\024");
        java.lang.String str9 = rSA1.decrypt("5229405238");
        java.lang.String str11 = rSA1.encrypt("867707232022423978954101232634");
        java.lang.String str13 = rSA1.decrypt("400186681612588698514703255002");
        java.lang.String str15 = rSA1.encrypt("\002\024\ufffdOp");
        java.lang.String str17 = rSA1.encrypt("140");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "332" + "'", str5, "332");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "181" + "'", str7, "181");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "A" + "'", str9, "A");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "430" + "'", str11, "430");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "196" + "'", str15, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "229" + "'", str17, "229");
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.encrypt("235");
        java.lang.String str11 = rSA1.encrypt("u\020\ufffd\ufffd");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003_" + "'", str7, "\003_");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "788" + "'", str9, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "238" + "'", str11, "238");
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("40021916406662028876239884409");
        java.lang.String str17 = rSA1.decrypt("606785054325890502753303704230");
        java.lang.String str19 = rSA1.encrypt("57871922763596790861247573518");
        java.lang.String str21 = rSA1.encrypt("887549839668016186028927618781");
        java.lang.String str23 = rSA1.encrypt("12510917220");
        java.lang.String str25 = rSA1.decrypt("11933296890856824977746263654");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p" + "'", str3, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "491" + "'", str5, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "311" + "'", str7, "311");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001W" + "'", str9, "\001W");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6691331852" + "'", str15, "6691331852");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\022\013CO" + "'", str17, "\001\022\013CO");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2466738125" + "'", str19, "2466738125");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "4790971602" + "'", str21, "4790971602");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "6537234477" + "'", str23, "6537234477");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str25, "\001\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("48524739602976");
        java.lang.String str13 = rSA1.decrypt("44797199491853112088");
        java.lang.String str15 = rSA1.decrypt("1333165682");
        rSA1.generateKeys((int) '4');
        java.lang.String str19 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr");
        java.lang.String str21 = rSA1.encrypt("851214216235725");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd,9\177\ufffd" + "'", str7, "\003\ufffd\ufffd\ufffd\ufffd\ufffd,9\177\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "248729032375480086289174510257" + "'", str9, "248729032375480086289174510257");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "784264851107514306082541311792" + "'", str11, "784264851107514306082541311792");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\034\037" + "'", str13, "\t\ufffd\ufffd\ufffd\ufffd\034\037");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\u0571\ufffdKZ.\016" + "'", str15, "\001\ufffd\u0571\ufffdKZ.\016");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1394234079801644" + "'", str19, "1394234079801644");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "116926150761661" + "'", str21, "116926150761661");
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.encrypt("\0020O\030\007");
        java.lang.String str15 = rSA1.encrypt("426709633355535076532095478064");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001f" + "'", str5, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "478" + "'", str7, "478");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10755238970079974825592021585" + "'", str13, "10755238970079974825592021585");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4269389756996468110208722877" + "'", str15, "4269389756996468110208722877");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
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
        java.lang.String str23 = rSA1.encrypt("2446039933");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd" + "'", str9, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "325491718" + "'", str11, "325491718");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd" + "'", str13, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1661883049" + "'", str15, "1661883049");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "86272503" + "'", str17, "86272503");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\027" + "'", str19, "\ufffd\ufffd\027");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "410" + "'", str23, "410");
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("9810541998");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u072b\ufffd\ufffd\u0256\034\003\024");
        java.lang.String str9 = rSA1.decrypt("5229405238");
        java.lang.String str11 = rSA1.encrypt("867707232022423978954101232634");
        java.lang.String str13 = rSA1.decrypt("400186681612588698514703255002");
        java.lang.String str15 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\n\u02d1");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "411" + "'", str5, "411");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "49" + "'", str7, "49");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "402" + "'", str11, "402");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\025" + "'", str13, "\025");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "103" + "'", str15, "103");
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("197176914");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "236" + "'", str9, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "641" + "'", str11, "641");
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("39454960305471");
        java.lang.String str11 = rSA1.encrypt("28810958726693343186799777157");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "369602363956075679926873229079" + "'", str11, "369602363956075679926873229079");
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("1798350776157985");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.encrypt("1166426200069845");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "172725048810295" + "'", str7, "172725048810295");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141001386125" + "'", str9, "3141001386125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1765887490210036" + "'", str11, "1765887490210036");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1544264891254291" + "'", str15, "1544264891254291");
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("168");
        java.lang.String str13 = rSA1.encrypt("28765443577209770831492742566");
        java.lang.String str15 = rSA1.encrypt("15");
        rSA1.generateKeys(10);
        rSA1.generateKeys(10);
        java.lang.String str21 = rSA1.decrypt("172");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffdv" + "'", str7, "\005\ufffd\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8357233823" + "'", str9, "8357233823");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "7858648698" + "'", str11, "7858648698");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1353537691" + "'", str13, "1353537691");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1233521224" + "'", str15, "1233521224");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\000\ufffd" + "'", str21, "\000\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\b\u0421\ufffd\ufffd\ufffd");
        java.lang.String str17 = rSA1.decrypt("24829636972784436289623304425");
        rSA1.generateKeys((int) (short) 100);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "186" + "'", str9, "186");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "153801734020871576474839230505" + "'", str15, "153801734020871576474839230505");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\ufffd\ufffd\ufffdu\b\ufffd\ufffd\u05b6\ufffd\ufffd" + "'", str17, "\003\ufffd\ufffd\ufffdu\b\ufffd\ufffd\u05b6\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str13 = rSA1.decrypt("1075488919");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\024");
        java.lang.String str19 = rSA1.encrypt("\005f\n\ufffd\000Y\033\ufffd\n\ufffd\ufffd\016");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\ufffd\207\177\ufffd\ufffd\025");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \")N\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "14464911423876510225514431337" + "'", str7, "14464911423876510225514431337");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002K" + "'", str13, "\002K");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "308287974977518370412328594476" + "'", str17, "308287974977518370412328594476");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "279360938031727015563547923527" + "'", str19, "279360938031727015563547923527");
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\006" + "'", str3, "\001\006");
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.encrypt("490");
        java.lang.String str5 = rSA1.encrypt("1617874323937581");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1675147861" + "'", str3, "1675147861");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2041875722" + "'", str5, "2041875722");
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("393");
        java.lang.String str7 = rSA1.decrypt("227022896246510918381181022856");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) '#');
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("7591156848866311702672535389");
        java.lang.String str17 = rSA1.encrypt("\t\032\ufffd\177\003\ufffd");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "103" + "'", str3, "103");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "279" + "'", str5, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001I" + "'", str7, "\001I");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "~" + "'", str9, "~");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str15, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1782756891429236" + "'", str17, "1782756891429236");
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 10);
        java.lang.String str3 = rSA1.decrypt("50334980593118017863872015613");
        java.lang.String str5 = rSA1.decrypt("1040671174887698");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000" + "'", str3, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.decrypt("37687704605112457902789117609");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "382499759945960201078191082046" + "'", str5, "382499759945960201078191082046");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\b\ufffd\ufffd\ufffd\ufffd!" + "'", str7, "\002\ufffd\b\ufffd\ufffd\ufffd\ufffd!");
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "830" + "'", str7, "830");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "822" + "'", str9, "822");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\035,D" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\035,D");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003\u0458\u065f\ufffd" + "'", str17, "\003\u0458\u065f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "576948285517337915956208650633" + "'", str21, "576948285517337915956208650633");
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str5 = rSA1.encrypt("720881662483885555150199331319");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "419" + "'", str5, "419");
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        java.lang.String str11 = rSA1.encrypt("76525688979612163312788900454");
        java.lang.String str13 = rSA1.decrypt("3");
        java.lang.String str15 = rSA1.decrypt("17100415790055507982022224050");
        java.lang.String str17 = rSA1.encrypt("\001+5{1");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "746766321134224946748982619361" + "'", str11, "746766321134224946748982619361");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\021\003\ufffdbJ\022" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\021\003\ufffdbJ\022");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\n\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "126497883237376797273707551889" + "'", str17, "126497883237376797273707551889");
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\u077f\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?Ic??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "388" + "'", str7, "388");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "283" + "'", str13, "283");
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("18");
        java.lang.String str5 = rSA1.encrypt("839781259776750366986808080725");
        java.lang.String str7 = rSA1.encrypt("8725160283");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "56" + "'", str5, "56");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "163" + "'", str7, "163");
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("3085358694");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002P\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\002P\004\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffdj" + "'", str13, "\002\ufffd\ufffd\ufffd\ufffd\ufffdj");
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\001+5{1");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "168" + "'", str9, "168");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "222" + "'", str13, "222");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.encrypt("35549168584584202529715460357");
        java.lang.String str5 = rSA1.encrypt("\013\ufffd~");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1859934654557908" + "'", str3, "1859934654557908");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "848075175106470" + "'", str5, "848075175106470");
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.encrypt("304");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\f[j");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\\:\005\ufffd" + "'", str3, "\\:\005\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "598842838" + "'", str5, "598842838");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1631440096" + "'", str7, "1631440096");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1822974372" + "'", str9, "1822974372");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("452749904557785829080067757432");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "30" + "'", str7, "30");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "736977496763242460953277011369" + "'", str11, "736977496763242460953277011369");
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\002H");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\ufffdh");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1801088541" + "'", str3, "1801088541");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10757911484" + "'", str9, "10757911484");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "464" + "'", str13, "464");
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("208642166923338001575549632629");
        java.lang.String str13 = rSA1.encrypt("\001\n\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "216451348437765571629029106210" + "'", str5, "216451348437765571629029106210");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "571550678097662072836984004474" + "'", str7, "571550678097662072836984004474");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\000\ufffd\ufffd\ufffd\ufffd\026\ufffd:1" + "'", str9, "\006\ufffd\000\ufffd\ufffd\ufffd\ufffd\026\ufffd:1");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\b\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "713027581749704294299178782749" + "'", str13, "713027581749704294299178782749");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys(10);
        java.lang.String str15 = rSA1.encrypt("1572583165");
        java.lang.String str17 = rSA1.encrypt("203842691587258713");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "496" + "'", str9, "496");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "462" + "'", str15, "462");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "495" + "'", str17, "495");
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("6");
        java.lang.String str9 = rSA1.encrypt("235");
        java.lang.String str11 = rSA1.encrypt("u\020\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("1285291712371426");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "64" + "'", str3, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "p" + "'", str7, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222" + "'", str9, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "316" + "'", str11, "316");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "149" + "'", str13, "149");
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("502069562720669011972970389935");
        java.lang.String str9 = rSA1.decrypt("1836473909513684");
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("5747602594");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "359" + "'", str5, "359");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "71" + "'", str7, "71");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001Y" + "'", str9, "\001Y");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3128042775" + "'", str13, "3128042775");
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("24913536938563019036853654452");
        java.lang.String str5 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "3129001075" + "'", str3, "3129001075");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "7798637140" + "'", str5, "7798637140");
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("292429178019428864799183198942");
        java.lang.String str17 = rSA1.encrypt("A\024\ufffd\003");
        rSA1.generateKeys((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("vK\002\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"vK??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\u0336\ufffd\ufffd\026+SG\036" + "'", str11, "\002\ufffd\u0336\ufffd\ufffd\026+SG\036");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\ufffd\022\ufffdl\032" + "'", str15, "\006\ufffd\022\ufffdl\032");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "927555001677420" + "'", str17, "927555001677420");
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
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
        java.lang.String str21 = rSA1.decrypt("3308971525213148970804289427");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "564524712736656735769538998801" + "'", str11, "564524712736656735769538998801");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd\u0180\ufffd\036\ufffd\004\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd\u0180\ufffd\036\ufffd\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "464211528467947203766505408878" + "'", str15, "464211528467947203766505408878");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2347616586915046" + "'", str19, "2347616586915046");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001p\\\u073d)-" + "'", str21, "\001p\\\u073d)-");
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1032334531050296720974988907627" + "'", str5, "1032334531050296720974988907627");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "665083167391241046744074343251" + "'", str7, "665083167391241046744074343251");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n\ufffd3\r\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\n\ufffd3\r\ufffd\021\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\005\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\005\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "245" + "'", str19, "245");
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\bj9\001");
        java.lang.String str15 = rSA1.decrypt("346");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "77" + "'", str9, "77");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "?" + "'", str11, "?");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "340" + "'", str13, "340");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\ufffd" + "'", str15, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "713" + "'", str17, "713");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("4084101");
        java.lang.String str9 = rSA1.decrypt("3");
        java.lang.String str11 = rSA1.encrypt("424091219959079056061298336306");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "216" + "'", str7, "216");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\035" + "'", str9, "\035");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "235" + "'", str11, "235");
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003$" + "'", str7, "\003$");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380" + "'", str9, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\021" + "'", str11, "\001\021");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "571" + "'", str13, "571");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "530" + "'", str15, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "504" + "'", str17, "504");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "197" + "'", str19, "197");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "610" + "'", str21, "610");
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
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
        java.lang.String str21 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\032" + "'", str3, "\002\032");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001." + "'", str7, "\001.");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "95" + "'", str9, "95");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "b" + "'", str11, "b");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "637" + "'", str13, "637");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "115" + "'", str15, "115");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "591" + "'", str17, "591");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "375" + "'", str19, "375");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "6" + "'", str21, "6");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd++\023`\036");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffdv" + "'", str9, "\ufffd\ufffdv");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "421059242" + "'", str11, "421059242");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "O" + "'", str13, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2059591679" + "'", str15, "2059591679");
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("41144739492370870768298163666");
        java.lang.String str9 = rSA1.encrypt("\u0483\ufffd\ufffd\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "123232399865017293994466471188" + "'", str5, "123232399865017293994466471188");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "116955727250192221877947914638" + "'", str7, "116955727250192221877947914638");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "218526725127988304264489698493" + "'", str9, "218526725127988304264489698493");
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "70" + "'", str3, "70");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21029429441138668649274140042" + "'", str7, "21029429441138668649274140042");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "385284889750532117555830583" + "'", str9, "385284889750532117555830583");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        java.lang.String str13 = rSA1.decrypt("4");
        java.lang.String str15 = rSA1.encrypt("875");
        java.lang.String str17 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\032\ufffd\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\032\ufffd\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "29183045457060108105500030679" + "'", str15, "29183045457060108105500030679");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "22097111156778335300476302379" + "'", str17, "22097111156778335300476302379");
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.decrypt("560");
        java.lang.String str9 = rSA1.encrypt("561185535");
        java.lang.String str11 = rSA1.encrypt("302647921494941030719500406314");
        java.lang.String str13 = rSA1.encrypt("168722142217433535724187011065");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "e" + "'", str7, "e");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "58" + "'", str9, "58");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35" + "'", str11, "35");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "409" + "'", str13, "409");
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("884210559297628");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.encrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\005\ufffdPQB\020\ufffd\ufffd\u0161^4" + "'", str3, "\005\ufffdPQB\020\ufffd\ufffd\u0161^4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd7" + "'", str5, "\001\ufffd\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd7");
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("410411422422033928813383347735");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001m" + "'", str3, "\001m");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "270" + "'", str7, "270");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("334584945244912143283576554504");
        rSA1.generateKeys((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\ufffd\ufffd\032\ufffd\ufffd\u03ed\ufffd" + "'", str7, "\005\ufffd\ufffd\032\ufffd\ufffd\u03ed\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd~\\u+\177\ufffd\ufffd" + "'", str9, "\003\ufffd~\\u+\177\ufffd\ufffd");
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.decrypt("305");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.decrypt("11860916928095778934456708933");
        java.lang.String str11 = rSA1.encrypt("3133319017839987");
        java.lang.String str13 = rSA1.decrypt("25589616082632032517938786561");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Y" + "'", str3, "Y");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "135" + "'", str5, "135");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "252" + "'", str11, "252");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("1208902895495334527");
        java.lang.String str9 = rSA1.decrypt("233006726736920949521554542653");
        java.lang.String str11 = rSA1.encrypt("630");
        java.lang.String str13 = rSA1.encrypt("322696943272860652176323875115");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\b\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd" + "'", str7, "\b\ufffd\ufffd\ufffd\004\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\005\ufffd\ufffd\002\ufffd\ufffd\ufffdC4" + "'", str9, "\005\ufffd\ufffd\002\ufffd\ufffd\ufffdC4");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44816349437927534592" + "'", str11, "44816349437927534592");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "40779428343156952114885590239" + "'", str13, "40779428343156952114885590239");
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.Class<?> wildcardClass4 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str11 = rSA1.decrypt("171");
        java.lang.String str13 = rSA1.encrypt("395514968476641543536797786000");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + ")" + "'", str7, ")");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\ufffd\ufffd\004%\005" + "'", str11, "\002\ufffd\ufffd\ufffd\ufffd\ufffd\004%\005");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "120782200216387908812643163713" + "'", str13, "120782200216387908812643163713");
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        rSA1.generateKeys(100);
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "15" + "'", str7, "15");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.decrypt("146028369");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\000\u0662\ufffdo");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???o\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338" + "'", str9, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\006\"\ufffd\ufffd(\023\ufffd\ufffd" + "'", str15, "\006\"\ufffd\ufffd(\023\ufffd\ufffd");
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
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
        java.lang.String str21 = rSA1.decrypt("1537578650599684");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "50334980593118017863872015613" + "'", str7, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50334980593118017863872015613" + "'", str9, "50334980593118017863872015613");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\ufffd\007\000\ufffd>\013\ufffd\u03ec" + "'", str11, "\004\ufffd\ufffd\007\000\ufffd>\013\ufffd\u03ec");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd!," + "'", str13, "\005\ufffd\ufffd\ufffd\ufffd\034\ufffd\ufffd!,");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "24363486190053226183663947157" + "'", str17, "24363486190053226183663947157");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002\ufffdW\004\ufffd|P`}O\f\ufffd\\" + "'", str21, "\002\ufffdW\004\ufffd|P`}O\f\ufffd\\");
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
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
        java.lang.String str27 = rSA1.encrypt("721661990879907026395100048351");
        java.lang.String str29 = rSA1.encrypt("1430482807");
        java.lang.String str31 = rSA1.decrypt("622955089907199824564798609828");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\037\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1452084199300947" + "'", str17, "1452084199300947");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "620414231317088" + "'", str19, "620414231317088");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\007\ufffd\ufffd@}" + "'", str21, "\007\ufffd\ufffd@}");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "532387060879878798464724443922" + "'", str27, "532387060879878798464724443922");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "388817955451828459067042646807" + "'", str29, "388817955451828459067042646807");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\002\ufffd\ufffd\ufffd@C" + "'", str31, "\002\ufffd\ufffd\ufffd@C");
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.encrypt("181970895497689");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\032\u06f1\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "270" + "'", str3, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17378183541502560072275129565" + "'", str7, "17378183541502560072275129565");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "4373405192449946588536639422" + "'", str9, "4373405192449946588536639422");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23140712199440489226324480494" + "'", str11, "23140712199440489226324480494");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "16985980637965770951063902853" + "'", str13, "16985980637965770951063902853");
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
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
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "323328620319559538615919753575" + "'", str17, "323328620319559538615919753575");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "72009400857680467094472252732" + "'", str19, "72009400857680467094472252732");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        java.lang.String str5 = rSA1.encrypt("\001Y");
        java.lang.String str7 = rSA1.decrypt("598335595765249845160178918537");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4084101" + "'", str3, "4084101");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3062001418" + "'", str5, "3062001418");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("#");
        java.lang.String str11 = rSA1.encrypt("362");
        java.lang.String str13 = rSA1.decrypt("1087034431089135");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "182301369537630621342415342208" + "'", str5, "182301369537630621342415342208");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\002\ufffd\ufffd\u0354" + "'", str7, "\002\ufffd\002\ufffd\ufffd\u0354");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "64339296875" + "'", str9, "64339296875");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "150824597096105621667078856573" + "'", str11, "150824597096105621667078856573");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\006\ufffd&\\\u02ab\ufffd\ufffd\u01c8\t\ufffd" + "'", str13, "\006\ufffd&\\\u02ab\ufffd\ufffd\u01c8\t\ufffd");
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("495");
        java.lang.String str7 = rSA1.decrypt("44");
        java.lang.String str9 = rSA1.decrypt("30242537688890328294181300595");
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "560" + "'", str3, "560");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\003D" + "'", str5, "\003D");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\0031" + "'", str7, "\0031");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd" + "'", str9, "\002\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("18");
        java.lang.String str5 = rSA1.encrypt("839781259776750366986808080725");
        java.lang.String str7 = rSA1.decrypt("229112403180614528");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "360" + "'", str3, "360");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "40" + "'", str5, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001." + "'", str7, "\001.");
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
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
        rSA1.generateKeys(10);
        java.lang.String str23 = rSA1.decrypt("4458619195");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\b\ufffd\ufffd\ufffd\ufffd5;" + "'", str9, "\b\ufffd\ufffd\ufffd\ufffd5;");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "217071489180860484445776717716" + "'", str15, "217071489180860484445776717716");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd~\017\035\037\ufffd\ufffd \030\ufffdqV" + "'", str17, "\001\ufffd~\017\035\037\ufffd\ufffd \030\ufffdqV");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "155931026974334331177922162754" + "'", str19, "155931026974334331177922162754");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\001\ufffd" + "'", str23, "\001\ufffd");
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("330");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "196" + "'", str7, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002." + "'", str9, "\002.");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002y" + "'", str11, "\002y");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd\013\022\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\001\ufffd\013\022\ufffd\ufffd\021\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
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
        java.lang.String str27 = rSA1.encrypt("721661990879907026395100048351");
        java.lang.String str29 = rSA1.decrypt("154373708709881814069259883968");
        java.lang.String str31 = rSA1.encrypt("\n\ufffd\017\ufffd\ufffd6:TD");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\032U\b\ufffd\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\032U\b\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1473991659813980" + "'", str17, "1473991659813980");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "585645591358414" + "'", str19, "585645591358414");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001*d\025\004\ufffd\ufffd" + "'", str21, "\001*d\025\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "380876071911397989141733889073" + "'", str27, "380876071911397989141733889073");
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<" + "'", str29, "\003\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd<");
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "13137555716738669785121441638" + "'", str31, "13137555716738669785121441638");
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("92");
        java.lang.String str11 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002E" + "'", str7, "\002E");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "392" + "'", str9, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "392" + "'", str11, "392");
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("377");
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\005wb\f\ufffd\ufffd\032\ufffd\177");
        java.lang.String str15 = rSA1.encrypt("120021421");
        java.lang.String str17 = rSA1.decrypt("38265044118301608894280961359");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "z" + "'", str3, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\023\027\ufffd" + "'", str7, "\002\023\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1492895846" + "'", str11, "1492895846");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1431391252" + "'", str13, "1431391252");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1685662532" + "'", str15, "1685662532");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + ">sHH" + "'", str17, ">sHH");
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        rSA1.generateKeys((int) ' ');
        java.lang.String str11 = rSA1.encrypt("441");
        java.lang.String str13 = rSA1.encrypt("573027999461902947452889180577");
        java.lang.String str15 = rSA1.encrypt("911315954");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("17753220861171122863843485581");
        java.lang.String str21 = rSA1.decrypt("27048606413282706946212193992");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "950119793" + "'", str11, "950119793");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "951010561" + "'", str13, "951010561");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "463016574" + "'", str15, "463016574");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "410" + "'", str19, "410");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\002!" + "'", str21, "\002!");
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        java.math.BigInteger bigInteger6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger7 = rSA1.decrypt(bigInteger6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "148" + "'", str5, "148");
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
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
        java.lang.String str21 = rSA1.decrypt("525");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\004\ufffd\ufffd\006\ufffd\020\022\ufffd\ufffd\027\ufffd" + "'", str9, "\004\ufffd\ufffd\006\ufffd\020\022\ufffd\ufffd\027\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "505921014328572275207265133993" + "'", str11, "505921014328572275207265133993");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "452126020707988041877012596572" + "'", str13, "452126020707988041877012596572");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\004\ufffd\ufffd\002\ufffd\ufffd'\026\ufffdL" + "'", str15, "\004\ufffd\ufffd\002\ufffd\ufffd'\026\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\004tVLt\314\002\ufffd\ufffd\ufffdV" + "'", str17, "\004tVLt\314\002\ufffd\ufffd\ufffdV");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\026\ufffd\007\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\002\026\ufffd\007\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd" + "'", str21, "\003\ufffd\ufffd\ufffd\016\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("175");
        java.lang.String str15 = rSA1.decrypt("1417328927");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "527856807739151723740975737552" + "'", str5, "527856807739151723740975737552");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5915732136554190986731380068" + "'", str11, "5915732136554190986731380068");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "36528236343048840232164877084" + "'", str13, "36528236343048840232164877084");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\017\ufffd\002\ufffd\ufffdH\n\ufffd\ufffd\ufffd" + "'", str15, "\017\ufffd\002\ufffd\ufffdH\n\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("5824490359974973208230734176");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str9 = rSA1.decrypt("2063650974266313");
        rSA1.generateKeys((int) 'a');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\000" + "'", str3, "\ufffd\000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1566119643" + "'", str5, "1566119643");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        rSA1.generateKeys(100);
        java.lang.String str11 = rSA1.encrypt("421538216752639241087728305427");
        java.lang.String str13 = rSA1.encrypt("4084101");
        java.lang.String str15 = rSA1.encrypt("\f\n\025\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\ufffd" + "'", str5, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "113" + "'", str7, "113");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "210116943354298680335730143266" + "'", str11, "210116943354298680335730143266");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "522321085110459833149818943093" + "'", str13, "522321085110459833149818943093");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "73560974859817184230810948334" + "'", str15, "73560974859817184230810948334");
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("415163767468787129289142588454");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\ufffd\ufffd%7Wd'\t" + "'", str7, "\ufffd\ufffd\ufffd%7Wd'\t");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5247501935" + "'", str11, "5247501935");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3789547396" + "'", str13, "3789547396");
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("1798350776157985");
        java.lang.String str13 = rSA1.decrypt("995014123623020");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531652172547594" + "'", str7, "531652172547594");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1568621348978676" + "'", str9, "1568621348978676");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1706137652836161" + "'", str11, "1706137652836161");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\001\ufffd\ufffd\031\ufffd" + "'", str13, "\000\ufffd\001\ufffd\ufffd\031\ufffd");
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        java.lang.String str17 = rSA1.decrypt("61273672939825812829984836584");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\0016" + "'", str3, "\0016");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\tg\032\ufffd\ufffd\001\ufffd\ufffd\ufffd" + "'", str9, "\tg\032\ufffd\ufffd\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "395985737745217246040684816073" + "'", str15, "395985737745217246040684816073");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\ufffd\ufffd\u038e\023\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str17, "\002\ufffd\ufffd\u038e\023\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.decrypt("371");
        java.lang.String str11 = rSA1.encrypt("18284470307236561615055147777");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("15629808557179674750489130205");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.encrypt("410785195077034366023673745330");
        java.lang.String str21 = rSA1.decrypt("44");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "488" + "'", str7, "488");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "370" + "'", str13, "370");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "295163953151232553126068838764" + "'", str19, "295163953151232553126068838764");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\006\ufffd\ufffd\ufffd\016\ufffd\ufffd\006\0360" + "'", str21, "\006\ufffd\ufffd\ufffd\016\ufffd\ufffd\006\0360");
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("946669947");
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("415");
        java.lang.String str13 = rSA1.decrypt("342981671868457888627866774352");
        java.lang.String str15 = rSA1.decrypt("1104211347652736886025289933692");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98" + "'", str3, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001=" + "'", str5, "\001=");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23887965014447077668373854026" + "'", str11, "23887965014447077668373854026");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd^");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd,\033\u0106\ufffd\ufffd" + "'", str15, "\ufffd,\033\u0106\ufffd\ufffd");
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass12 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "297" + "'", str7, "297");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "125" + "'", str9, "125");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd\u0204");
        java.lang.String str13 = rSA1.decrypt("17924349572865205354386909918");
        java.lang.String str15 = rSA1.decrypt("1075488919");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "549" + "'", str3, "549");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "125" + "'", str11, "125");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002Q" + "'", str13, "\002Q");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\001" + "'", str15, "\001\001");
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
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
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr" + "'", str13, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdr");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1409473595305400" + "'", str17, "1409473595305400");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "234740646560992" + "'", str19, "234740646560992");
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str19 = rSA1.decrypt("137642157118530");
        rSA1.generateKeys((int) '#');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004\ufffd\001\006\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004\ufffd\001\006\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\ufffd\ufffd\ufffd\026Y\177z9\006\ufffd" + "'", str13, "\r\ufffd\ufffd\ufffd\026Y\177z9\006\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\000\ufffd\ufffd\\\ufffd\ufffd\ufffd'\025\ufffd" + "'", str19, "\000\ufffd\ufffd\\\ufffd\ufffd\ufffd'\025\ufffd");
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.encrypt("304");
        rSA1.generateKeys((int) 'a');
        java.lang.Class<?> wildcardClass10 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\ufffd" + "'", str3, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1878211964" + "'", str5, "1878211964");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "777486770" + "'", str7, "777486770");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.decrypt("334064745499191746012789729451");
        java.lang.String str15 = rSA1.decrypt("52572151102535773735776019652");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "66" + "'", str7, "66");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "171" + "'", str9, "171");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\ufffd\002P" + "'", str15, "\001\ufffd\ufffd\002P");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("1200725932");
        java.lang.String str19 = rSA1.encrypt("173606844086014783550054563092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\000\ufffd\ufffd\ufffd\u051b\020t\033KR");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\004K\025j\034\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\004K\025j\034\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "265470070513080924131608597337" + "'", str17, "265470070513080924131608597337");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "401054175980815457301295786038" + "'", str19, "401054175980815457301295786038");
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("34089860651578007478246711177");
        java.lang.String str9 = rSA1.encrypt("4003796192");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "346" + "'", str3, "346");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "351" + "'", str5, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "226" + "'", str9, "226");
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = rSA1.decrypt("\000\ufffd\ufffd\003");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??Y??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035" + "'", str7, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "50" + "'", str9, "50");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "392" + "'", str11, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "289" + "'", str13, "289");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "235" + "'", str15, "235");
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("288");
        java.lang.String str15 = rSA1.decrypt("304");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\ufffd\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/???\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002L" + "'", str5, "\002L");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\007" + "'", str7, "\007");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "255896847633336637068856731184" + "'", str11, "255896847633336637068856731184");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "92694128982448221043532930044" + "'", str13, "92694128982448221043532930044");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\013\ufffd\ufffd/\006\ufffd\ufffd\ufffd" + "'", str15, "\013\ufffd\ufffd/\006\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\004\ufffdm\r\007\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("516646600458947599388515648739");
        rSA1.generateKeys((int) ' ');
        java.lang.String str15 = rSA1.encrypt("\003i\t\ufffd\ufffdn");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
        java.lang.String str21 = rSA1.encrypt("\004\ufffd\t\032\ufffd\004\ufffd\ufffd\ufffd\037\ufffd");
        java.lang.String str23 = rSA1.encrypt("2082151896");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "813400195320808670243145547443" + "'", str5, "813400195320808670243145547443");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd!1\"\ufffd\ufffd\ufffd" + "'", str7, "\000\ufffd\ufffd\ufffd!1\"\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "61657336324652081802166055887" + "'", str9, "61657336324652081802166055887");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "823429189402624043428128660890" + "'", str11, "823429189402624043428128660890");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2825030443" + "'", str15, "2825030443");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "568424452467276784226611114962" + "'", str19, "568424452467276784226611114962");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "875972832999099044704978335123" + "'", str21, "875972832999099044704978335123");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "560565179044332515253366337087" + "'", str23, "560565179044332515253366337087");
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.decrypt("292429178019428864799183198942");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("6491002602");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "129" + "'", str7, "129");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "28" + "'", str9, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001f" + "'", str11, "\001f");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "470" + "'", str15, "470");
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        java.lang.String str15 = rSA1.encrypt("35");
        java.lang.String str17 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\001\ufffd*\\\ufffd\005");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5" + "'", str7, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(" + "'", str9, "(");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "J" + "'", str11, "J");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "160" + "'", str13, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "151" + "'", str15, "151");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "307" + "'", str17, "307");
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        java.lang.String str15 = rSA1.encrypt("144252953354502585977976224207");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "160" + "'", str3, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003L" + "'", str9, "\003L");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "685" + "'", str11, "685");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "373" + "'", str13, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "814" + "'", str15, "814");
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str17 = rSA1.encrypt("818354031919437822956478981367");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\030\017\ufffd\ufffd\001\ufffd" + "'", str9, "\000\ufffd\030\017\ufffd\ufffd\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "300" + "'", str17, "300");
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
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
        java.lang.String str23 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.decrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\007\017&\003\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\007\017&\003\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "576273120043177311241493929975" + "'", str15, "576273120043177311241493929975");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "498154878053018620258275191440" + "'", str17, "498154878053018620258275191440");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002\ufffd\u0673\u0261\ufffd\u025b~" + "'", str19, "\002\ufffd\u0673\u0261\ufffd\u025b~");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "540635190440282468182530432586" + "'", str21, "540635190440282468182530432586");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "292361140051971980342290844256" + "'", str23, "292361140051971980342290844256");
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
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
        java.lang.String str21 = rSA1.decrypt("1537578650599684");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\006\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005n\t\ufffd\000\ufffd\ufffd\u03ee\ufffd_ " + "'", str13, "\005n\t\ufffd\000\ufffd\ufffd\u03ee\ufffd_ ");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "21089836100504014289376334444" + "'", str17, "21089836100504014289376334444");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\004\u0429\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034/r" + "'", str21, "\004\u0429\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\034/r");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("477");
        java.lang.String str9 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\003\035");
        java.lang.String str13 = rSA1.encrypt("1895529914177013");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\030\ufffd\ufffdG" + "'", str7, "\030\ufffd\ufffdG");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "12649764925" + "'", str9, "12649764925");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "506261573" + "'", str11, "506261573");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2419732985" + "'", str13, "2419732985");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        java.lang.String str15 = rSA1.encrypt("24728158503917487987839420576");
        java.lang.String str17 = rSA1.encrypt("66");
        java.lang.String str19 = rSA1.decrypt("485974862797680425669299086221");
        rSA1.generateKeys((int) (short) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffdL" + "'", str7, "\001\ufffdL");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001A\\\ufffd~\r\004" + "'", str11, "\001A\\\ufffd~\r\004");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "876866414629179" + "'", str13, "876866414629179");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "998276857193018" + "'", str15, "998276857193018");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "481538572981070" + "'", str17, "481538572981070");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\u06df\ufffd\ufffd" + "'", str19, "\003\u06df\ufffd\ufffd");
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("\003A");
        java.lang.String str7 = rSA1.decrypt("491");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "118" + "'", str5, "118");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "B" + "'", str7, "B");
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
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
        java.lang.String str25 = rSA1.decrypt("710953641251092049316066633256");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003\ufffd\u0470\ufffd\026\u0250\026\ufffd" + "'", str9, "\003\ufffd\u0470\ufffd\026\u0250\026\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30371328" + "'", str15, "30371328");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3138428376721" + "'", str17, "3138428376721");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd/" + "'", str19, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "70238767395089043472719944400" + "'", str21, "70238767395089043472719944400");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\006~-\013\ufffd\005\ufffd\ufffd\ufffd\ufffd" + "'", str23, "\006~-\013\ufffd\005\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\004*>n\033\ufffd\ufffd\ufffd\u0652\ufffd" + "'", str25, "\004*>n\033\ufffd\ufffd\ufffd\u0652\ufffd");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.encrypt("\b\ufffd\ufffd\ufffd\ufffd63^\020j+\r");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("690675774561579157326569817971");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "136" + "'", str7, "136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd,=\024i\026\ufffd\ufffd\u0659" + "'", str11, "\002\ufffd\ufffd,=\024i\026\ufffd\ufffd\u0659");
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("42418796185018424088");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("\001\ufffd\ufffd\ufffdM");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"??[?L?M\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd]" + "'", str9, "\000\ufffd\ufffd]");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2106734109" + "'", str11, "2106734109");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\032t" + "'", str13, "\ufffd\032t");
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        java.lang.String str15 = rSA1.encrypt("144252953354502585977976224207");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.decrypt("713820127729075");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "473" + "'", str5, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\034" + "'", str9, "\002\034");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "177" + "'", str11, "177");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52" + "'", str13, "52");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "327" + "'", str15, "327");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003\ufffdI+MB\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str19, "\003\ufffdI+MB\016\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        rSA1.generateKeys((int) '4');
        java.lang.String str15 = rSA1.decrypt("292429178019428864799183198942");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("1687398946");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n\ufffd\037C<\034" + "'", str15, "\n\ufffd\037C<\034");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\004\ufffd\ufffd\ufffd\ufffd\ufffd\u07bf" + "'", str19, "\004\ufffd\ufffd\ufffd\ufffd\ufffd\u07bf");
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
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
        java.lang.String str21 = rSA1.encrypt("\t\ufffd\u04d8\ufffd\ufffd\013\ufffdWE[");
        java.lang.String str23 = rSA1.encrypt("21546345245347987662852530302");
        java.lang.String str25 = rSA1.decrypt("622396255803752");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\u023e\ufffd" + "'", str13, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\u023e\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\ufffd\ufffd\017I" + "'", str17, "\005\ufffd\ufffd\ufffd\017I");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\u0313\ufffd\u01df" + "'", str19, "\001\u0313\ufffd\u01df");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "486273699440124" + "'", str21, "486273699440124");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "309022573916397" + "'", str23, "309022573916397");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\b\n\ufffd\ufffd\ufffd" + "'", str25, "\b\n\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str17 = rSA1.decrypt("265482618753364");
        java.lang.String str19 = rSA1.encrypt("\003\ufffd\ufffd\030\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\f\017\ufffd\ufffd\ufffd\021\ufffd\ufffd\u05b8\ufffd\ufffd" + "'", str17, "\f\017\ufffd\ufffd\ufffd\021\ufffd\ufffd\u05b8\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "50767429497688979429261896903" + "'", str19, "50767429497688979429261896903");
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("\001\bl:0");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\ufffd\ufffd" + "'", str3, "\n\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "232095989" + "'", str5, "232095989");
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
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
        java.lang.String str27 = rSA1.encrypt("2468733137");
        java.lang.Class<?> wildcardClass28 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "18" + "'", str9, "18");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\177" + "'", str13, "\000\ufffd\ufffd\ufffd\r\ufffd\ufffd\ufffd\177");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1332108924225591" + "'", str17, "1332108924225591");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2048742948671630" + "'", str19, "2048742948671630");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\003Bl\013\ufffd,n" + "'", str21, "\003Bl\013\ufffd,n");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "`" + "'", str25, "`");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "797" + "'", str27, "797");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
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
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "248" + "'", str13, "248");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001h" + "'", str15, "\001h");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "349" + "'", str17, "349");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001p" + "'", str19, "\001p");
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("80");
        java.lang.String str7 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\001\ufffd\ufffd\ufffdH");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("32");
        java.lang.String str15 = rSA1.decrypt("2425696798257060");
        java.lang.String str17 = rSA1.encrypt("J");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str11, "\000\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\002" + "'", str13, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffdZ\006w\"\u04d5\ufffd\ufffd\ufffd" + "'", str15, "\ufffdZ\006w\"\u04d5\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2219006624" + "'", str17, "2219006624");
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("221468958");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        java.lang.String str17 = rSA1.decrypt("61273672939825812829984836584");
        rSA1.generateKeys((int) 'a');
        java.lang.String str21 = rSA1.decrypt("404149536867166624568266810671");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001\ufffd" + "'", str3, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd^#\004\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffd^#\004\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "433713144118481766973835308083" + "'", str15, "433713144118481766973835308083");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\003+\t\0258\016\ufffd\ufffd$\r\ufffd\ufffd" + "'", str17, "\003+\t\0258\016\ufffd\ufffd$\r\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\026\ufffd\ufffd\ufffd\ufffd\004\ufffd\030" + "'", str21, "\026\ufffd\ufffd\ufffd\ufffd\004\ufffd\030");
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.decrypt("18");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = rSA1.decrypt("\ufffd\ufffd\u01c3\ufffd\ufffdI");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"U?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str5, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("228013474449632847102912946578");
        rSA1.generateKeys(10);
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\002\031" + "'", str5, "\002\031");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "511" + "'", str7, "511");
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
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
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1860867" + "'", str9, "1860867");
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.decrypt("516");
        java.lang.String str5 = rSA1.decrypt("225057066974976279922672677189");
        java.lang.String str7 = rSA1.encrypt("517113791735339540201452239425");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\007\ufffd\ufffd\ufffd\177\ufffd\ufffd\ufffd,\f\035\"6" + "'", str3, "\007\ufffd\ufffd\ufffd\177\ufffd\ufffd\ufffd,\f\035\"6");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\006i\007_(%\025\ufffd\ufffd.D\016" + "'", str5, "\006i\007_(%\025\ufffd\ufffd.D\016");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616301426214348715011379259201" + "'", str7, "616301426214348715011379259201");
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("\023\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\ufffd\ufffd\u07a4\ufffd\ufffdY");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "116363148906801054037955920838" + "'", str5, "116363148906801054037955920838");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "115234056676750705622939465813" + "'", str7, "115234056676750705622939465813");
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        java.lang.String str11 = rSA1.encrypt("\002\001");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd>");
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffd-");
        rSA1.generateKeys(10);
        java.lang.String str19 = rSA1.encrypt("873460151899213759571695512032");
        java.lang.String str21 = rSA1.encrypt("\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd9%\022IH");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "X\f\020\ufffd" + "'", str7, "X\f\020\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffdd\r" + "'", str9, "\001\ufffdd\r");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "8437364096" + "'", str11, "8437364096");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1661925259" + "'", str13, "1661925259");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1782439282" + "'", str15, "1782439282");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "184" + "'", str19, "184");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "270" + "'", str21, "270");
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.encrypt("432076670134015691603482141593");
        java.lang.String str7 = rSA1.encrypt("513130765460560900877328176159");
        java.lang.String str9 = rSA1.decrypt("1732464738");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "346" + "'", str3, "346");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "47" + "'", str5, "47");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "375" + "'", str7, "375");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001V" + "'", str9, "\001V");
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.encrypt("410411422422033928813383347735");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("173606844086014783550054563092");
        java.lang.String str13 = rSA1.decrypt("223");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\023" + "'", str5, "\001\023");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "329" + "'", str7, "329");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "t" + "'", str11, "t");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "]" + "'", str13, "]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("497");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) '#');
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdCO");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "187" + "'", str7, "187");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "139" + "'", str9, "139");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "482" + "'", str13, "482");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "4849162373" + "'", str19, "4849162373");
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.encrypt("475");
        java.lang.String str15 = rSA1.decrypt("236");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\022\ufffd\177");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "483" + "'", str11, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "473" + "'", str13, "473");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\016" + "'", str15, "\001\016");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "587" + "'", str17, "587");
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.encrypt("181970895497689");
        java.lang.String str13 = rSA1.encrypt("873529845479541");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.decrypt("125316652306773009488778690732");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "42" + "'", str3, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6655990647868501549992168872" + "'", str7, "6655990647868501549992168872");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "39158171517490694157503188541" + "'", str9, "39158171517490694157503188541");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4234338344070267679384336434" + "'", str11, "4234338344070267679384336434");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "22530323244958496347845127396" + "'", str13, "22530323244958496347845127396");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002\\\ufffd\ufffd\ufffd\027\ufffd\ufffd\ufffd" + "'", str17, "\002\\\ufffd\ufffd\ufffd\027\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
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
            java.math.BigInteger bigInteger17 = rSA1.encrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\021\ufffd\ufffd" + "'", str7, "\001\021\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "5517000625" + "'", str9, "5517000625");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "750153958" + "'", str11, "750153958");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "643851457" + "'", str13, "643851457");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1533427203" + "'", str15, "1533427203");
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("z");
        java.lang.String str9 = rSA1.encrypt("\b\ufffdA3\033\u0459\ufffd\ufffd\030\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("1470301955");
        java.lang.String str13 = rSA1.decrypt("34771552816615312677513613232");
        java.lang.String str15 = rSA1.encrypt("857");
        java.lang.Class<?> wildcardClass16 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "O" + "'", str5, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "27" + "'", str7, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "383" + "'", str9, "383");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "72" + "'", str11, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd" + "'", str13, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "345" + "'", str15, "345");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
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
        java.lang.String str21 = rSA1.encrypt("329713248891718622578075746116");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "A\016\u0163\ufffd\ufffd\021\ufffd\ufffdj\001" + "'", str7, "A\016\u0163\ufffd\ufffd\021\ufffd\ufffdj\001");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7384655844797740931461324210" + "'", str9, "7384655844797740931461324210");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "4749280466663883458592034823" + "'", str11, "4749280466663883458592034823");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\013\u06dfL\023\ufffd\ufffd\ufffd\ufffd_P" + "'", str13, "\013\u06dfL\023\ufffd\ufffd\ufffd\ufffd_P");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2834796001060658579068533596" + "'", str15, "2834796001060658579068533596");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "12683544528800345044464907986" + "'", str17, "12683544528800345044464907986");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2840714608" + "'", str21, "2840714608");
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\007\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("i");
        java.lang.String str11 = rSA1.decrypt("3129001075");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "614" + "'", str7, "614");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "889" + "'", str9, "889");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
    }

    @Test
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        rSA1.generateKeys((int) 'a');
        java.lang.String str11 = rSA1.encrypt("1685568049313385");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "39695773646357340911708485553" + "'", str11, "39695773646357340911708485553");
    }

    @Test
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("40021916406662028876239884409");
        java.lang.String str17 = rSA1.decrypt("606785054325890502753303704230");
        java.lang.String str19 = rSA1.encrypt("57871922763596790861247573518");
        java.lang.String str21 = rSA1.encrypt("887549839668016186028927618781");
        java.lang.String str23 = rSA1.encrypt("12510917220");
        java.lang.String str25 = rSA1.decrypt("11933296890856824977746263654");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "251" + "'", str7, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "z" + "'", str9, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "8833131265" + "'", str15, "8833131265");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\002*\026\ufffd\021" + "'", str17, "\002*\026\ufffd\021");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "415144623" + "'", str19, "415144623");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1980211000" + "'", str21, "1980211000");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "4559095198" + "'", str23, "4559095198");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ufffd\ufffd\013" + "'", str25, "\ufffd\ufffd\013");
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str17 = rSA1.encrypt("635566984948500137490046848848");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = rSA1.decrypt("\027\ufffd\ufffd3[\r\ufffdB\021");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?o?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "511" + "'", str3, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "187" + "'", str7, "187");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "139" + "'", str9, "139");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "196" + "'", str13, "196");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "878519356476231329491024881475" + "'", str17, "878519356476231329491024881475");
    }

    @Test
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.decrypt("72");
        java.lang.String str9 = rSA1.decrypt("1234543668832");
        java.lang.String str11 = rSA1.decrypt("266");
        java.lang.String str13 = rSA1.encrypt("5959263759");
        java.lang.String str15 = rSA1.encrypt("516");
        java.lang.String str17 = rSA1.decrypt("702295615");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "281" + "'", str13, "281");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "319" + "'", str15, "319");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("110");
        java.lang.String str9 = rSA1.encrypt("642622633261757814741586969");
        java.lang.String str11 = rSA1.decrypt("333");
        java.lang.String str13 = rSA1.encrypt("\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\024x8");
        java.lang.String str15 = rSA1.encrypt("50665420085846036948497877901");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\ufffd\ufffd\026Yu;" + "'", str7, "\000\ufffd\ufffd\ufffd\ufffd\026Yu;");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7343058422587780654505629910" + "'", str9, "7343058422587780654505629910");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd\005\n\ufffd\ufffd\ufffdAL" + "'", str11, "\ufffd\ufffd\005\n\ufffd\ufffd\ufffdAL");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "48589175471035044430467133175" + "'", str13, "48589175471035044430467133175");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9816883240215721095836107164" + "'", str15, "9816883240215721095836107164");
    }

    @Test
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("495");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("Z\013\ufffd\r");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("5067917407");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035" + "'", str7, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd" + "'", str9, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "251" + "'", str11, "251");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "14053559174488995920633564073" + "'", str15, "14053559174488995920633564073");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "67" + "'", str21, "67");
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = rSA1.decrypt("\000\ufffd\ufffd\024|");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????|\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "154194606498561003114866851234" + "'", str5, "154194606498561003114866851234");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8241264822143" + "'", str7, "8241264822143");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "212933810742890937139814678550" + "'", str9, "212933810742890937139814678550");
    }

    @Test
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
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
        java.lang.String str23 = rSA1.encrypt("18500643531705236304075842419");
        java.lang.String str25 = rSA1.decrypt("4808314487");
        java.lang.Class<?> wildcardClass26 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "274" + "'", str15, "274");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "114" + "'", str19, "114");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\001\ufffd" + "'", str21, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "212" + "'", str23, "212");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "?" + "'", str25, "?");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (short) 100);
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("80");
        java.lang.String str7 = rSA1.decrypt("16");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = rSA1.decrypt("\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd[\004\024");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Illegal embedded sign character");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\f" + "'", str5, "\001\f");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#" + "'", str7, "#");
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
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
        java.lang.String str21 = rSA1.decrypt("295532353949249155639336087943");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "185" + "'", str3, "185");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "266" + "'", str5, "266");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\u0703" + "'", str9, "\u0703");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "39346449" + "'", str11, "39346449");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "669490681" + "'", str15, "669490681");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "622688448" + "'", str17, "622688448");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\035\ufffd\ufffd" + "'", str19, "\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ufffd\ufffd" + "'", str21, "\ufffd\ufffd");
    }

    @Test
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("\002\ufffd\ufffdD");
        rSA1.generateKeys(100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "160" + "'", str3, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003L" + "'", str9, "\003L");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "685" + "'", str11, "685");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "147101571914552136849449684717" + "'", str15, "147101571914552136849449684717");
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.decrypt("616");
        java.lang.String str11 = rSA1.encrypt("174");
        java.lang.String str13 = rSA1.decrypt("3077056399");
        java.lang.String str15 = rSA1.encrypt("\005\ufffd\ufffd\ufffd++\023`\036");
        java.lang.String str17 = rSA1.encrypt("2\021\ufffd\t\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "142" + "'", str5, "142");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(^\017\ufffd" + "'", str9, "(^\017\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "217348741" + "'", str11, "217348741");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\033" + "'", str13, "\ufffd\033");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1611125651" + "'", str15, "1611125651");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1761211910" + "'", str17, "1761211910");
    }

    @Test
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        java.lang.String str11 = rSA1.encrypt("181970895497689");
        java.lang.String str13 = rSA1.encrypt("301394451350660253266054962046");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4130873876619126500890068248" + "'", str7, "4130873876619126500890068248");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "14466392899727400223547817810" + "'", str9, "14466392899727400223547817810");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10283638102340135022240219971" + "'", str11, "10283638102340135022240219971");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "6373244196704069054586033140" + "'", str13, "6373244196704069054586033140");
    }

    @Test
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("\0245|\r\ufffd\004\ufffd\r\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("485974862797680425669299086221");
        java.lang.String str11 = rSA1.encrypt("17984728");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58266309681658367705956574815" + "'", str7, "58266309681658367705956574815");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52264627906354623628714479563" + "'", str9, "52264627906354623628714479563");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "110267252164020542880735364632" + "'", str11, "110267252164020542880735364632");
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
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
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "61" + "'", str7, "61");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "72" + "'", str9, "72");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\031\u026e\ufffd\016" + "'", str13, "\ufffd\031\u026e\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\ufffd\002\ufffd\ufffd\ufffd" + "'", str17, "\005\ufffd\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\016" + "'", str19, "\001\ufffd\ufffd\ufffd\ufffd\016");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "676702229794562" + "'", str21, "676702229794562");
    }

    @Test
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("6203695486");
        java.lang.String str15 = rSA1.encrypt("911315954");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffdZ" + "'", str7, "\001\ufffd\ufffdZ");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "29316250624" + "'", str11, "29316250624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str13, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "762874687955522" + "'", str15, "762874687955522");
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\bj9\001");
        java.lang.String str15 = rSA1.decrypt("346");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str21 = rSA1.encrypt("\000\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "441" + "'", str5, "441");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "531" + "'", str7, "531");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "338" + "'", str9, "338");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "630" + "'", str13, "630");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "104" + "'", str17, "104");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "511" + "'", str21, "511");
    }

    @Test
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str13 = rSA1.encrypt("\001;");
        java.lang.String str15 = rSA1.decrypt("480692378304951721450550723915");
        java.lang.String str17 = rSA1.encrypt("\ufffdX\017\n\ufffd\ufffd\ufffd");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "663620098364977637281343048823" + "'", str11, "663620098364977637281343048823");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "31255875" + "'", str13, "31255875");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\005\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "737783926414336688334889404385" + "'", str17, "737783926414336688334889404385");
    }

    @Test
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.decrypt("304417796247364099549471429573");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "236" + "'", str3, "236");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "169" + "'", str5, "169");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\ufffd\ufffd\b" + "'", str9, "\001\ufffd\ufffd\b");
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("334584945244912143283576554504");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt("\000\ufffd\022\ufffd\ufffd\016\ufffd\ufffdo\r\ufffd\023");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"????\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "517" + "'", str3, "517");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\t\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd" + "'", str7, "\t\ufffd\ufffd\ufffd\ufffd\036\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str9, "\006\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.decrypt("8");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.decrypt("474056181514113440240671949593");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002" + "'", str9, "\002");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd\177[" + "'", str15, "\001\ufffd\177[");
    }

    @Test
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "D\007\ufffd\001\017\ufffd" + "'", str3, "D\007\ufffd\001\017\ufffd");
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("6203695486");
        java.lang.String str15 = rSA1.encrypt("911315954");
        rSA1.generateKeys((int) (byte) 100);
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\ufffd\024\ufffd" + "'", str7, "\000\ufffd\ufffd\024\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1868121349617952" + "'", str11, "1868121349617952");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\ufffd\ufffd\"\ufffd" + "'", str13, "\003\ufffd\ufffd\"\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "781871392450212" + "'", str15, "781871392450212");
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("\006");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.encrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "81" + "'", str3, "81");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "680" + "'", str7, "680");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "358" + "'", str11, "358");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "362797056" + "'", str17, "362797056");
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.decrypt("387");
        java.lang.String str9 = rSA1.encrypt("i");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = rSA1.decrypt(")");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \")\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\020\ufffd\ufffd\ufffd\ufffd\004\ufffd\ufffd9\032" + "'", str7, "\020\ufffd\ufffd\ufffd\ufffd\004\ufffd\ufffd9\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1157625" + "'", str9, "1157625");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "52157327756827725163495293028" + "'", str11, "52157327756827725163495293028");
    }

    @Test
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.encrypt("\007\ufffd\ufffd\006\ufffd\ufffd\ufffdQ^");
        rSA1.generateKeys(100);
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "166" + "'", str3, "166");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "381" + "'", str5, "381");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "257862636630666503930340220937" + "'", str9, "257862636630666503930340220937");
    }

    @Test
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) ' ');
        java.lang.String str3 = rSA1.decrypt("206");
        java.lang.String str5 = rSA1.encrypt("307707995715569958842130375");
        java.lang.String str7 = rSA1.encrypt("304");
        java.math.BigInteger bigInteger8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger9 = rSA1.decrypt(bigInteger8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "X\004\ufffd\ufffd" + "'", str3, "X\004\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1488067020" + "'", str5, "1488067020");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "834420266" + "'", str7, "834420266");
    }

    @Test
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("96");
        java.lang.String str11 = rSA1.encrypt("99");
        java.lang.String str13 = rSA1.encrypt("\003\ufffd\u033e");
        java.lang.String str15 = rSA1.encrypt("2883934637");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\005\ufffd\ufffd\ufffd\ufffd\ufffd\u0562\ufffd" + "'", str7, "\001\005\ufffd\ufffd\ufffd\ufffd\ufffd\u0562\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141644858136" + "'", str9, "3141644858136");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3143575801449" + "'", str11, "3143575801449");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "552295210500790142742290784333" + "'", str13, "552295210500790142742290784333");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "617976654891550892708347639477" + "'", str15, "617976654891550892708347639477");
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("\001\ufffd\ufffd");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"?H?L?\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd{" + "'", str13, "\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd{");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\006\ufffd\ufffd\ufffd" + "'", str17, "\006\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2562233183199115" + "'", str19, "2562233183199115");
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.decrypt("342");
        rSA1.generateKeys((int) '4');
        java.lang.String str21 = rSA1.encrypt("2877259260690810");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "475" + "'", str3, "475");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "404" + "'", str9, "404");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "387" + "'", str11, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "52" + "'", str13, "52");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "34" + "'", str15, "34");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\ufffd" + "'", str17, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "104253121456678" + "'", str21, "104253121456678");
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        java.lang.String str9 = rSA1.decrypt("107");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.decrypt("418739768099769983098062928547");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002M" + "'", str3, "\002M");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55" + "'", str7, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002i" + "'", str9, "\002i");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\007\ufffd\ufffd\ufffd\ufffd\021\ufffd" + "'", str13, "\007\ufffd\ufffd\ufffd\ufffd\021\ufffd");
    }

    @Test
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("489");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("1998947500173");
        java.lang.String str9 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\u0370\ufffd");
        java.lang.String str11 = rSA1.decrypt("15028238390418345727767527777");
        java.lang.String str13 = rSA1.encrypt("X\034R\004\ufffd\ufffd\000\ufffd\ufffd");
        java.lang.String str15 = rSA1.encrypt("317579693760000000000");
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\020" + "'", str7, "\001\020");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "222" + "'", str9, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001K" + "'", str11, "\001K");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "132" + "'", str13, "132");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "221" + "'", str15, "221");
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str9 = rSA1.decrypt("35039915204721349358906154439");
        java.lang.String str11 = rSA1.decrypt("26624023838936183373062913224");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "G\030\ufffd\ufffd\023\r\ufffd\ufffd\022M" + "'", str9, "G\030\ufffd\ufffd\023\r\ufffd\ufffd\022M");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd\ufffd\ufffd\002\ufffd\ufffd\ufffd" + "'", str11, "\002\ufffd\ufffd\ufffd\002\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str7 = rSA1.encrypt("393");
        java.lang.String str9 = rSA1.encrypt("\013lf\020\ufffd\034\ufffd\ufffd\ufffd\016\ufffdah");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "8" + "'", str3, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "279" + "'", str7, "279");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "341" + "'", str9, "341");
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) '4');
        java.lang.String str7 = rSA1.encrypt("1208902895495334527");
        java.lang.String str9 = rSA1.encrypt("95");
        java.lang.String str11 = rSA1.encrypt("1798350776157985");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("569");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2484383330687638" + "'", str7, "2484383330687638");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3141001386125" + "'", str9, "3141001386125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1096312402519793" + "'", str11, "1096312402519793");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "q" + "'", str17, "q");
    }

    @Test
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("465270144019721");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("8");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '4');
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "55" + "'", str5, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "388" + "'", str7, "388");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001F" + "'", str11, "\001F");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "285" + "'", str13, "285");
    }

    @Test
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\002u");
        java.lang.String str9 = rSA1.encrypt("453285907300587");
        java.lang.String str11 = rSA1.decrypt("7560459277510187155396998311");
        java.lang.String str13 = rSA1.decrypt("5637094912");
        java.lang.String str15 = rSA1.decrypt("31050892783218811443338608687");
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
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "488" + "'", str7, "488");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "63" + "'", str9, "63");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\001\016" + "'", str13, "\001\016");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("29358506122049777298420844854");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\004");
        java.lang.String str13 = rSA1.decrypt("233256986767027678444463879174");
        java.lang.String str15 = rSA1.decrypt("68997291858491843541976262940");
        java.lang.String str17 = rSA1.encrypt("560768012096920");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.decrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "{" + "'", str5, "{");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\035" + "'", str7, "\001\035");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002=" + "'", str9, "\002=");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "5" + "'", str11, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "52" + "'", str17, "52");
    }

    @Test
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) '4');
        java.lang.String str9 = rSA1.encrypt("206");
        java.lang.String str11 = rSA1.encrypt("226208872463543249023298211472");
        java.lang.String str13 = rSA1.encrypt("1279023995809993");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1220088323969668" + "'", str9, "1220088323969668");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "862130960212624" + "'", str11, "862130960212624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "259827677325937" + "'", str13, "259827677325937");
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("81");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.encrypt("|");
        java.lang.String str13 = rSA1.decrypt("6203695486");
        java.lang.String str15 = rSA1.encrypt("911315954");
        java.lang.String str17 = rSA1.decrypt("111");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\001G" + "'", str3, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd\004\u0472" + "'", str7, "\000\ufffd\004\u0472");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1906624" + "'", str11, "1906624");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffdm@\f\ufffd" + "'", str13, "\ufffdm@\f\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1036605135699084" + "'", str15, "1036605135699084");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ufffd\025\ufffd\ufffd\ufffd" + "'", str17, "\ufffd\025\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("24913536938563019036853654452");
        java.lang.String str5 = rSA1.encrypt("654236752367953961630478066413");
        java.lang.String str7 = rSA1.encrypt("\002\ufffd\ufffd\ufffduq$");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "929970877" + "'", str3, "929970877");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "3680124890" + "'", str5, "3680124890");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "6557652682" + "'", str7, "6557652682");
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("95");
        rSA1.generateKeys((int) (byte) 10);
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.encrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "149" + "'", str7, "149");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys(10);
        java.lang.String str11 = rSA1.encrypt("1611067079503803");
        java.lang.String str13 = rSA1.decrypt("18980981751395059997709561778");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str17 = rSA1.decrypt("2168059484");
        java.lang.String str19 = rSA1.encrypt("551053999596147142417007739252");
        java.lang.String str21 = rSA1.encrypt("\003\r\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\001");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "392" + "'", str3, "392");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "576" + "'", str5, "576");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "306" + "'", str7, "306");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "270" + "'", str11, "270");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "40" + "'", str19, "40");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "331" + "'", str21, "331");
    }

    @Test
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("|");
        java.lang.String str11 = rSA1.decrypt("270");
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\bj9\001");
        java.lang.String str15 = rSA1.decrypt("346");
        java.lang.String str17 = rSA1.encrypt("\000\ufffd\ufffd\ufffd\ufffd\b\ufffd\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "516" + "'", str3, "516");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "616" + "'", str7, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "372" + "'", str9, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\002\ufffd" + "'", str11, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001Z" + "'", str15, "\001Z");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "561" + "'", str17, "561");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
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
        java.lang.String str25 = rSA1.encrypt("560674577461086973111197950781");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd\034\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd\034\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1963572153008381" + "'", str17, "1963572153008381");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3016772045426189" + "'", str19, "3016772045426189");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "178669608258384" + "'", str21, "178669608258384");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "33" + "'", str25, "33");
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.decrypt("622");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str13 = rSA1.encrypt("91");
        java.lang.String str15 = rSA1.decrypt("18978112990239");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str19 = rSA1.encrypt("\001\ufffd\ufffd\ufffd\ufffd\023\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002\ufffd" + "'", str3, "\002\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd," + "'", str7, "\001\ufffd\ufffd,");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd\ufffd\036" + "'", str9, "\000\ufffd\ufffd\036");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3138428376721" + "'", str13, "3138428376721");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\017\025zD\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\017\025zD\007\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "709" + "'", str19, "709");
    }

    @Test
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str11 = rSA1.encrypt("199");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str15 = rSA1.encrypt("674589993819081348249");
        java.lang.String str17 = rSA1.decrypt("267732256991725538729642205655");
        java.lang.String str19 = rSA1.encrypt("33530503450432431591");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "198" + "'", str3, "198");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "167" + "'", str7, "167");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "490" + "'", str11, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "384" + "'", str15, "384");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd" + "'", str17, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "391" + "'", str19, "391");
    }

    @Test
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        java.lang.String str9 = rSA1.encrypt("461");
        rSA1.generateKeys(10);
        java.lang.String str13 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd/");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd" + "'", str7, "\001\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "7096015861" + "'", str9, "7096015861");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "204" + "'", str13, "204");
    }

    @Test
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("658320474506132562654648259626");
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "110798786563975683408286839231" + "'", str11, "110798786563975683408286839231");
    }

    @Test
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
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
        java.lang.String str23 = rSA1.encrypt("\003$\036\ufffd\ufffd\027\ufffd\ufffd\ufffd\ufffdz\004");
        java.lang.String str25 = rSA1.encrypt("180349332592896420858975498194");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.encrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "373" + "'", str3, "373");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\177" + "'", str5, "\001\177");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "124" + "'", str7, "124");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "432" + "'", str9, "432");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "115" + "'", str15, "115");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "368" + "'", str19, "368");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "190" + "'", str23, "190");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "157" + "'", str25, "157");
    }

    @Test
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str9 = rSA1.encrypt("56181887");
        rSA1.generateKeys(100);
        java.lang.String str13 = rSA1.encrypt("39246191592791469444276543224");
        java.lang.String str15 = rSA1.encrypt("173");
        java.math.BigInteger bigInteger16 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger17 = rSA1.decrypt(bigInteger16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "5937758088583476286631703630" + "'", str7, "5937758088583476286631703630");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "29591645913519589474105170741" + "'", str9, "29591645913519589474105170741");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "520149916534210700036841762800" + "'", str13, "520149916534210700036841762800");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "267709474689611698092419515522" + "'", str15, "267709474689611698092419515522");
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        java.lang.String str3 = rSA1.encrypt("\025");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("\002H");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.encrypt("\005\ufffd\ufffd\ufffd\ufffd\ufffd9a");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "9261" + "'", str3, "9261");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "199176704" + "'", str9, "199176704");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "176" + "'", str13, "176");
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
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
        java.lang.String str25 = rSA1.encrypt("10960976");
        java.math.BigInteger bigInteger26 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger27 = rSA1.decrypt(bigInteger26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002u" + "'", str3, "\002u");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "529" + "'", str9, "529");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "$" + "'", str11, "$");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "699" + "'", str13, "699");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "735" + "'", str15, "735");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "64" + "'", str17, "64");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "902" + "'", str19, "902");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "489" + "'", str21, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7" + "'", str23, "7");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "773" + "'", str25, "773");
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
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
        java.lang.String str23 = rSA1.encrypt("5779633556");
        java.math.BigInteger bigInteger24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger25 = rSA1.encrypt(bigInteger24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\002!" + "'", str3, "\002!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\006\ufffdq\026\ufffd\ufffdS\035\ufffd\ufffd" + "'", str9, "\006\ufffdq\026\ufffd\ufffdS\035\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "341986654930584764693187196600" + "'", str11, "341986654930584764693187196600");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "334664647278639551193470243279" + "'", str13, "334664647278639551193470243279");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\002\"\ufffd\ufffd\027\u0482" + "'", str15, "\002\"\ufffd\ufffd\027\u0482");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\005\u0370\ufffd\ufffd\036h-%b%?" + "'", str17, "\005\u0370\ufffd\ufffd\036h-%b%?");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "554963696297784987827752206567" + "'", str19, "554963696297784987827752206567");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "332403450579806843917128086379" + "'", str21, "332403450579806843917128086379");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "811403781341278814628621543806" + "'", str23, "811403781341278814628621543806");
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("343225017592288719703266877835");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "419" + "'", str3, "419");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "30573293755887111743378159609" + "'", str7, "30573293755887111743378159609");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10507064511" + "'", str11, "10507064511");
    }

    @Test
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.decrypt("288");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("2268879881");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "102960650724508565796633633088" + "'", str5, "102960650724508565796633633088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdF" + "'", str7, "\001\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffdF");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffd" + "'", str11, "\001\ufffd");
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("\002!");
        java.lang.String str5 = rSA1.encrypt("555673510403649237558006483347");
        java.lang.String str7 = rSA1.encrypt("\006\ufffd\ufffd\016\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("667916463799571988019866642344");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.decrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11310226265746580578616705725" + "'", str3, "11310226265746580578616705725");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1908855724283235279136277579" + "'", str5, "1908855724283235279136277579");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "21190732367911396393954846291" + "'", str7, "21190732367911396393954846291");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd" + "'", str9, "\ufffd\ufffd\ufffd\ufffd\ufffd\"\ufffd");
    }

    @Test
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("460");
        java.lang.String str13 = rSA1.decrypt("663612053");
        java.lang.String str15 = rSA1.encrypt("1157625");
        java.lang.String str17 = rSA1.decrypt("486515548");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "96" + "'", str5, "96");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "117" + "'", str7, "117");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "163" + "'", str9, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "273" + "'", str11, "273");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\000\ufffd" + "'", str13, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "114" + "'", str15, "114");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001`" + "'", str17, "\001`");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        java.lang.String str9 = rSA1.encrypt("206");
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str13 = rSA1.decrypt("314");
        java.lang.String str15 = rSA1.decrypt("2533194306");
        java.lang.String str17 = rSA1.encrypt("d2FD");
        java.lang.String str19 = rSA1.decrypt("1078240112268825");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = rSA1.decrypt("");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: Zero length BigInteger");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "489" + "'", str3, "489");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "y" + "'", str7, "y");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "67" + "'", str9, "67");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003\013" + "'", str13, "\003\013");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\000\ufffd" + "'", str15, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "292" + "'", str17, "292");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\003%" + "'", str19, "\003%");
    }

    @Test
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("295655242858698839782451220669");
        java.lang.String str7 = rSA1.encrypt("779873504017588604169185223");
        java.lang.String str9 = rSA1.decrypt("504102086659325072487593440444");
        java.lang.String str11 = rSA1.decrypt("11716232800583690748559256041");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.encrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "474212175880352387052482899539" + "'", str5, "474212175880352387052482899539");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "442470197974063257498769302308" + "'", str7, "442470197974063257498769302308");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002\ufffd`\026\ufffd\ufffd\016=\001\ufffd" + "'", str9, "\002\ufffd`\026\ufffd\ufffd\016=\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\u015brJ\031\ufffd\032\ufffd\ufffdM" + "'", str11, "\003\u015brJ\031\ufffd\032\ufffd\ufffdM");
    }

    @Test
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        java.lang.String str3 = rSA1.encrypt("239");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "724295257725808" + "'", str3, "724295257725808");
    }

    @Test
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) 'a');
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str15 = rSA1.decrypt("461");
        java.lang.String str17 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str19 = rSA1.encrypt("326");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "15" + "'", str3, "15");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001G" + "'", str5, "\001G");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "509" + "'", str7, "509");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "8" + "'", str9, "8");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "163" + "'", str17, "163");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "488" + "'", str19, "488");
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("478");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.decrypt("9014646877");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd%");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "447" + "'", str5, "447");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\ufffd" + "'", str9, "\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3466401875" + "'", str11, "3466401875");
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("3995249758");
        java.lang.String str17 = rSA1.encrypt("281");
        java.lang.Class<?> wildcardClass18 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "616" + "'", str3, "616");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "357" + "'", str7, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415" + "'", str9, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "304" + "'", str13, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "281" + "'", str17, "281");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\u029f\ufffd\ufffd\ufffd\023\ufffd");
        java.lang.String str9 = rSA1.encrypt("208642166923338001575549632629");
        java.lang.String str11 = rSA1.encrypt("7345347997");
        java.lang.String str13 = rSA1.encrypt("1506896065904167");
        java.lang.Class<?> wildcardClass14 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "267" + "'", str5, "267");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "9" + "'", str7, "9");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415" + "'", str9, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "418" + "'", str11, "418");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "45" + "'", str13, "45");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str5 = rSA1.encrypt("576");
        java.lang.String str7 = rSA1.encrypt("\001\177");
        java.lang.String str9 = rSA1.encrypt("4839922246");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys((int) '#');
        java.lang.String str15 = rSA1.encrypt("510508996908794292191886213738");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "42418796185018424088" + "'", str5, "42418796185018424088");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "56181887" + "'", str7, "56181887");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "119066688686337675206930475400" + "'", str9, "119066688686337675206930475400");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "4168872277" + "'", str15, "4168872277");
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.decrypt("449846234494357149231112317014");
        rSA1.generateKeys(10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "285" + "'", str3, "285");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\0014" + "'", str5, "\0014");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "'" + "'", str7, "'");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "380" + "'", str9, "380");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "738" + "'", str11, "738");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "28" + "'", str13, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "398" + "'", str15, "398");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\b" + "'", str17, "\001\b");
    }

    @Test
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd| ");
        rSA1.generateKeys((int) (short) 10);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "O" + "'", str3, "O");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd" + "'", str7, "\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3125" + "'", str9, "3125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3077056399" + "'", str11, "3077056399");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "214104337390334394321012162382" + "'", str17, "214104337390334394321012162382");
    }

    @Test
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '4');
        rSA1.generateKeys((int) (short) 100);
        rSA1.generateKeys((int) (byte) 10);
        java.lang.Class<?> wildcardClass6 = rSA1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        java.lang.String str9 = rSA1.decrypt("279");
        java.lang.String str11 = rSA1.decrypt("177");
        java.lang.String str13 = rSA1.encrypt("267");
        rSA1.generateKeys(10);
        java.lang.String str17 = rSA1.encrypt("423");
        java.lang.String str19 = rSA1.decrypt("6390996257622735243951242204");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "351" + "'", str7, "351");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "430" + "'", str13, "430");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "510" + "'", str17, "510");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\r" + "'", str19, "\001\r");
    }

    @Test
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.decrypt("206");
        java.lang.String str7 = rSA1.decrypt("771929004");
        java.lang.String str9 = rSA1.encrypt("\007\027\ufffd\ufffd\ufffd\016\ufffd\013\ufffd\ufffdh");
        java.math.BigInteger bigInteger10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger11 = rSA1.encrypt(bigInteger10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000" + "'", str3, "\000");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\002" + "'", str5, "\001\002");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "802" + "'", str9, "802");
    }

    @Test
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        rSA1.generateKeys((int) (short) 10);
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str15 = rSA1.encrypt("392170649013389");
        java.lang.String str17 = rSA1.encrypt("26819265790429984140014673731");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001u" + "'", str7, "\001u");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "70652723741860970335357892921" + "'", str15, "70652723741860970335357892921");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "334413683480524147681873203340" + "'", str17, "334413683480524147681873203340");
    }

    @Test
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("198");
        rSA1.generateKeys((int) '4');
        java.lang.String str11 = rSA1.decrypt("703153339289949437747864939069");
        java.lang.String str13 = rSA1.encrypt("167");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("241");
        java.lang.String str19 = rSA1.decrypt("4");
        java.lang.String str21 = rSA1.encrypt("684201394212404496755281199042");
        java.math.BigInteger bigInteger22 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger23 = rSA1.decrypt(bigInteger22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002\ufffd\ufffd\ufffd" + "'", str7, "\002\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003\ufffd\ufffd\ufffd\n1e" + "'", str11, "\003\ufffd\ufffd\ufffd\n1e");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "632998939643448" + "'", str13, "632998939643448");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "923942771" + "'", str17, "923942771");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str19, "\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "997274637" + "'", str21, "997274637");
    }

    @Test
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        java.lang.String str11 = rSA1.encrypt("267732256991725538729642205655");
        java.lang.String str13 = rSA1.decrypt("620414231317088");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\t" + "'", str5, "\001\t");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "788" + "'", str7, "788");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "256" + "'", str9, "256");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "562" + "'", str11, "562");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\003X" + "'", str13, "\003X");
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("12856024970639395620261580662");
        java.lang.String str7 = rSA1.decrypt("5411392559");
        java.lang.String str9 = rSA1.encrypt("{");
        rSA1.generateKeys(10);
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "33562394575160520077" + "'", str3, "33562394575160520077");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "16813916902303736216333838012" + "'", str5, "16813916902303736216333838012");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\020\\\ufffd\ufffd\ufffd\024" + "'", str7, "\ufffd\020\\\ufffd\ufffd\ufffd\024");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1860867" + "'", str9, "1860867");
    }

    @Test
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("338");
        java.lang.String str5 = rSA1.decrypt("394");
        java.lang.String str7 = rSA1.decrypt("650");
        java.lang.String str9 = rSA1.encrypt("\013\ufffd\ufffd\ufffd\034\"\ufffd\"");
        java.lang.String str11 = rSA1.encrypt("202715462764073189402121037930");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "98" + "'", str3, "98");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001P" + "'", str5, "\001P");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "433" + "'", str9, "433");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "476" + "'", str11, "476");
    }

    @Test
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("72");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "p" + "'", str3, "p");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "491" + "'", str5, "491");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "311" + "'", str7, "311");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\003" + "'", str11, "\003");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32093110984544066087063979709" + "'", str15, "32093110984544066087063979709");
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("946669947");
        java.lang.String str7 = rSA1.encrypt("414601987065913579031306059745");
        java.lang.String str9 = rSA1.decrypt("43845903535359091850927913216");
        java.lang.String str11 = rSA1.encrypt("3258273441");
        java.lang.String str13 = rSA1.encrypt("\005*\023\ufffd\ufffd\ufffd\007\ufffd\ufffd");
        java.math.BigInteger bigInteger14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger15 = rSA1.decrypt(bigInteger14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "z" + "'", str5, "z");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "168" + "'", str7, "168");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\000\ufffd" + "'", str9, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "76" + "'", str11, "76");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "145" + "'", str13, "145");
    }

    @Test
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        java.lang.String str11 = rSA1.encrypt("\ufffd\ufffd\ufffd\u0795\ufffd$");
        java.lang.String str13 = rSA1.encrypt("380");
        java.lang.String str15 = rSA1.encrypt("587");
        java.lang.String str17 = rSA1.decrypt("1102137549");
        java.lang.String str19 = rSA1.decrypt("1300442306");
        java.lang.Class<?> wildcardClass20 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "314" + "'", str3, "314");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001n" + "'", str5, "\001n");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "496" + "'", str9, "496");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "42" + "'", str11, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "144" + "'", str13, "144");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "195" + "'", str15, "195");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\001\037" + "'", str17, "\001\037");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\002j" + "'", str19, "\002j");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("205276678295651539749919023246");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("357953123");
        rSA1.generateKeys((int) '4');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "26246420772959970107573738983" + "'", str7, "26246420772959970107573738983");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ufffd\ufffd\ufffd" + "'", str13, "\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.decrypt("61");
        java.lang.String str7 = rSA1.decrypt("516");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str11 = rSA1.decrypt("4448254484");
        java.lang.String str13 = rSA1.decrypt("324006784837190610335526937353");
        java.lang.String str15 = rSA1.encrypt("692429752057800817142458536884");
        java.lang.String str17 = rSA1.encrypt("113");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "206" + "'", str3, "206");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001\ufffd" + "'", str5, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001@" + "'", str7, "\001@");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\007\ufffd\ufffd\ufffd\013u*\341" + "'", str11, "\007\ufffd\ufffd\ufffd\013u*\341");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\004p]\034\ufffd\ufffd\ufffd\u029f,j\027" + "'", str13, "\004p]\034\ufffd\ufffd\ufffd\u029f,j\027");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "188508338687385637115710152584" + "'", str15, "188508338687385637115710152584");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "257480700307415264534995820161" + "'", str17, "257480700307415264534995820161");
    }

    @Test
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        rSA1.generateKeys((int) '#');
        java.lang.String str7 = rSA1.decrypt("461");
        java.lang.String str9 = rSA1.encrypt("\005");
        java.lang.String str11 = rSA1.encrypt("O");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str17 = rSA1.encrypt("\003\ufffd\ufffd\ufffd\ufffd\ufffd| ");
        rSA1.generateKeys((int) ' ');
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\003\ufffdM" + "'", str7, "\003\ufffdM");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3125" + "'", str9, "3125");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3077056399" + "'", str11, "3077056399");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "519321867027775136475015372778" + "'", str17, "519321867027775136475015372778");
    }

    @Test
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
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
        java.lang.String str25 = rSA1.encrypt("\001f");
        java.lang.String str27 = rSA1.decrypt("920122250984500");
        rSA1.generateKeys((int) (byte) 100);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "80" + "'", str3, "80");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "5" + "'", str5, "5");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "232" + "'", str7, "232");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "357" + "'", str9, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "7Q\032\u036b\013\ufffd\ufffdJ\b\ufffd6" + "'", str13, "7Q\032\u036b\013\ufffd\ufffdJ\b\ufffd6");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3709282432799081" + "'", str17, "3709282432799081");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3565636250626263" + "'", str19, "3565636250626263");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2599646562298355" + "'", str21, "2599646562298355");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2086133419496032" + "'", str23, "2086133419496032");
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1565163637370699" + "'", str25, "1565163637370699");
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\001\ufffd\ufffd\ufffd\ufffd\ufffd" + "'", str27, "\001\ufffd\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str7 = rSA1.encrypt("15");
        java.lang.String str9 = rSA1.encrypt("15");
        java.lang.String str11 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\ufffd\ufffd\007");
        java.lang.String str13 = rSA1.encrypt("\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "387" + "'", str3, "387");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "317201802686979902757" + "'", str7, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "317201802686979902757" + "'", str9, "317201802686979902757");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "228794212606882517018432973402" + "'", str11, "228794212606882517018432973402");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1167080863602103580608239078795" + "'", str13, "1167080863602103580608239078795");
    }

    @Test
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.encrypt("11860916928095778934456708933");
        java.lang.String str15 = rSA1.encrypt("\001v");
        java.lang.String str17 = rSA1.decrypt("82");
        java.lang.String str19 = rSA1.encrypt("85");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "510918531" + "'", str13, "510918531");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "635251253" + "'", str15, "635251253");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\000\ufffd\ufffd\027g" + "'", str17, "\000\ufffd\ufffd\027g");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2543731324" + "'", str19, "2543731324");
    }

    @Test
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("477");
        java.lang.String str5 = rSA1.encrypt("227022896246510918381181022856");
        java.lang.String str7 = rSA1.decrypt("149");
        java.lang.String str9 = rSA1.decrypt("400");
        java.lang.String str11 = rSA1.decrypt("15629808557179674750489130205");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\000\ufffd" + "'", str3, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "130" + "'", str5, "130");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\000\ufffd" + "'", str7, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "u" + "'", str9, "u");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "o" + "'", str11, "o");
    }

    @Test
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
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
        java.lang.String str21 = rSA1.decrypt("782090545893003517395861688889");
        java.lang.String str23 = rSA1.decrypt("1800251330");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "381007419056839373413710545012" + "'", str5, "381007419056839373413710545012");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\005\b\ufffdD\bT\016\ufffdVS[" + "'", str7, "\005\b\ufffdD\bT\016\ufffdVS[");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "221655898975335392613377804494" + "'", str9, "221655898975335392613377804494");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "165459456728873227779458390875" + "'", str11, "165459456728873227779458390875");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "273477918060208097054440740644" + "'", str15, "273477918060208097054440740644");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "317327726386340207968" + "'", str17, "317327726386340207968");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "*" + "'", str21, "*");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\000" + "'", str23, "\000");
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("\000\ufffd\032\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str15 = rSA1.decrypt("3995249758");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "518" + "'", str9, "518");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "222" + "'", str13, "222");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\003\020" + "'", str15, "\003\020");
    }

    @Test
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("516");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.decrypt("317201802686979902757");
        java.lang.String str9 = rSA1.decrypt("392");
        java.lang.String str11 = rSA1.encrypt("\ufffd");
        java.lang.String str13 = rSA1.encrypt("174");
        rSA1.generateKeys((int) (byte) 10);
        rSA1.generateKeys(100);
        java.lang.String str19 = rSA1.encrypt("\002\u2684\ufffd\ufffd\ufffd\u04ee");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.encrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "490" + "'", str3, "490");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "669" + "'", str5, "669");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001\ufffd" + "'", str7, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\002W" + "'", str9, "\002W");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "673" + "'", str11, "673");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "249" + "'", str13, "249");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "365347310052514529816488921665" + "'", str19, "365347310052514529816488921665");
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
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
        java.lang.String str21 = rSA1.encrypt("436");
        java.lang.Class<?> wildcardClass22 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "304" + "'", str3, "304");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "36" + "'", str5, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\001i" + "'", str7, "\001i");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001q" + "'", str9, "\001q");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "377" + "'", str11, "377");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "429" + "'", str13, "429");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + ")" + "'", str15, ")");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "22" + "'", str17, "22");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "149" + "'", str19, "149");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "223" + "'", str21, "223");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.decrypt("295655242858698839782451220669");
        java.lang.String str5 = rSA1.encrypt("1184438612620945");
        java.lang.String str7 = rSA1.encrypt("\004\ufffd\ufffd\ufffd\u0429");
        rSA1.generateKeys((int) (byte) 10);
        java.lang.String str11 = rSA1.decrypt("72");
        rSA1.generateKeys((int) 'a');
        java.lang.String str15 = rSA1.encrypt("6027768308437645793663749491");
        rSA1.generateKeys((int) (byte) 100);
        java.lang.String str19 = rSA1.encrypt("791");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "|" + "'", str3, "|");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "253" + "'", str5, "253");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55" + "'", str7, "55");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "30361967424801382224291580029" + "'", str15, "30361967424801382224291580029");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "811880436044899274477957556578" + "'", str19, "811880436044899274477957556578");
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
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
        java.lang.String str21 = rSA1.encrypt("436");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "160" + "'", str3, "160");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "875" + "'", str5, "875");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\032" + "'", str7, "\032");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\003L" + "'", str9, "\003L");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "538" + "'", str11, "538");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "511" + "'", str13, "511");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\001\ufffd" + "'", str15, "\001\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "182" + "'", str17, "182");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "768" + "'", str19, "768");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "101" + "'", str21, "101");
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        rSA1.generateKeys((int) ' ');
        java.lang.String str9 = rSA1.encrypt("518");
        java.lang.String str11 = rSA1.decrypt("432");
        java.math.BigInteger bigInteger12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger13 = rSA1.decrypt(bigInteger12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "372" + "'", str3, "372");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "470" + "'", str5, "470");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "204208755" + "'", str9, "204208755");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\006\ufffd\ufffd" + "'", str11, "\006\ufffd\ufffd");
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.decrypt("42418796185018424088");
        rSA1.generateKeys(100);
        rSA1.generateKeys((int) ' ');
        java.lang.String str13 = rSA1.decrypt("244491094832186423838238028174");
        java.lang.String str15 = rSA1.encrypt("152877368672763475612453496527");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "852" + "'", str3, "852");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\002E" + "'", str7, "\002E");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\005\ufffd\ufffd\ufffd" + "'", str13, "\005\ufffd\ufffd\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "383372548" + "'", str15, "383372548");
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) '#');
        rSA1.generateKeys((int) (short) 10);
        java.lang.String str5 = rSA1.decrypt("2977826838347180772119751944");
        java.lang.String str7 = rSA1.encrypt("113495284406038417495967191849");
        java.lang.Class<?> wildcardClass8 = rSA1.getClass();
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\001N" + "'", str5, "\001N");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) 'a');
        java.lang.String str3 = rSA1.encrypt("185");
        java.lang.String str5 = rSA1.encrypt("693");
        rSA1.generateKeys((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "7104910651344038949542072571" + "'", str3, "7104910651344038949542072571");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44694149934110000251600506945" + "'", str5, "44694149934110000251600506945");
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("477");
        java.lang.String str5 = rSA1.encrypt("489");
        java.lang.String str7 = rSA1.encrypt("\006\u060a\"\ufffd\ufffd\ufffd\ufffd\ufffd");
        java.lang.String str9 = rSA1.decrypt("453285907300587");
        java.lang.String str11 = rSA1.decrypt("51753720001912228847635533267");
        java.lang.String str13 = rSA1.decrypt("2656269775891060901331017612");
        java.lang.String str15 = rSA1.encrypt("\u014c\ufffd\ufffd\ufffd\ufffdQ");
        rSA1.generateKeys((int) ' ');
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "483" + "'", str5, "483");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "244" + "'", str7, "244");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\001\003" + "'", str9, "\001\003");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "e" + "'", str11, "e");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "D" + "'", str13, "D");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "301" + "'", str15, "301");
    }

    @Test
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        java.lang.String str5 = rSA1.decrypt("477");
        java.lang.String str7 = rSA1.encrypt("576");
        java.lang.String str9 = rSA1.encrypt("61");
        rSA1.generateKeys((int) '#');
        java.lang.String str13 = rSA1.encrypt("478");
        java.lang.String str15 = rSA1.encrypt("646");
        rSA1.generateKeys((int) (short) 100);
        java.lang.String str19 = rSA1.decrypt("158090137");
        java.math.BigInteger bigInteger20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger21 = rSA1.decrypt(bigInteger20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"encryptedMessage\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000\ufffd" + "'", str5, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "205" + "'", str9, "205");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "9088624803" + "'", str13, "9088624803");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1191551612" + "'", str15, "1191551612");
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "\001\ufffd\037\ufffd\ufffd\ufffd\ufffd\017\037\ufffd" + "'", str19, "\001\ufffd\037\ufffd\ufffd\ufffd\ufffd\017\037\ufffd");
    }

    @Test
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("hi!");
        rSA1.generateKeys(10);
        java.lang.String str7 = rSA1.encrypt("432");
        java.lang.String str9 = rSA1.encrypt("1208902895495334527");
        java.lang.String str11 = rSA1.decrypt("5");
        java.lang.String str13 = rSA1.encrypt("497");
        rSA1.generateKeys((int) ' ');
        java.lang.String str17 = rSA1.encrypt("42");
        java.math.BigInteger bigInteger18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.math.BigInteger bigInteger19 = rSA1.encrypt(bigInteger18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.math.BigInteger.modPow(java.math.BigInteger, java.math.BigInteger)\" because \"message\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "357" + "'", str7, "357");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "415" + "'", str9, "415");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\000\ufffd" + "'", str11, "\000\ufffd");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "88" + "'", str13, "88");
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "2239688516" + "'", str17, "2239688516");
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 100);
        java.lang.String str3 = rSA1.encrypt("\000\ufffd\002\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd\017");
        java.lang.String str5 = rSA1.encrypt("\005\ufffd\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str9 = rSA1.encrypt("B");
        java.lang.String str11 = rSA1.decrypt("22549721295290863866320683761");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "150740021742801179375606146953" + "'", str3, "150740021742801179375606146953");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "428651164222932577945358499799" + "'", str5, "428651164222932577945358499799");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2375228001" + "'", str9, "2375228001");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\001\ufffdo<y" + "'", str11, "\001\ufffdo<y");
    }

    @Test
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        com.thealgorithms.ciphers.RSA rSA1 = new com.thealgorithms.ciphers.RSA((int) (byte) 10);
        java.lang.String str3 = rSA1.encrypt("387");
        rSA1.generateKeys((int) 'a');
        java.lang.String str7 = rSA1.encrypt("\026J#V}'E\033\ufffd\ufffd");
        rSA1.generateKeys((int) '#');
        java.lang.String str11 = rSA1.encrypt("szE\037");
        // The following exception was thrown during execution in test generation
        try {
            rSA1.generateKeys((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: bitLength < 2");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "477" + "'", str3, "477");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58286123912753186818477714176" + "'", str7, "58286123912753186818477714176");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3429068743" + "'", str11, "3429068743");
    }
}
