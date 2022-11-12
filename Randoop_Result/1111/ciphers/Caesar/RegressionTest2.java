package ciphers.Caesar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("bc!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`m!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{d!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`i!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`g!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("a`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("x`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("c`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("``!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`l!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("i`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "p`!" + "'", str2, "p`!");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{t!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`x!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("k`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i`!" + "'", str2, "i`!");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("n`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("l`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`d!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("l`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("p`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("v`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("m`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("v`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("o`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{d!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("b`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("p`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`x!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`k!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("b`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("s`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("q`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("h`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{n!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n`!" + "'", str2, "n`!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("q`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{w!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`g!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("h`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("n`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`x!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{w!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{w!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h`!" + "'", str2, "h`!");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("d`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("y{!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "c`!" + "'", str2, "c`!");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("c`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`i!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`o!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f`!" + "'", str2, "f`!");
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`x!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{m!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("p`!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`x!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("``!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("b`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`e!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`m!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("z{!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{m!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{h!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`w!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`v!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`r!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`j!" + "'", str2, "`j!");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`c!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("f{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`g!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{p!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("m`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`j!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("n`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`i!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z`!" + "'", str2, "z`!");
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`k!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t`!" + "'", str2, "t`!");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{s!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("r`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q`!" + "'", str2, "q`!");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("r`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "r`!" + "'", str2, "r`!");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("t`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("w`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("t`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w`!" + "'", str2, "w`!");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`d!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`c!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`u!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("``!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "``!" + "'", str2, "``!");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("k`!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`y!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("v`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "v`!" + "'", str2, "v`!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("w`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g`!" + "'", str2, "g`!");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("o`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("d`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "m`!" + "'", str2, "m`!");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e`!" + "'", str2, "e`!");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "z{!" + "'", str2, "z{!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e{!" + "'", str2, "e{!");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`l!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("x`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{w!" + "'", str2, "{w!");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`r!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z{!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y{!" + "'", str2, "y{!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{m!" + "'", str2, "{m!");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("x`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("f{!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f{!" + "'", str2, "f{!");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("t`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`e!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "d`!" + "'", str2, "d`!");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "b`!" + "'", str2, "b`!");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("z{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j{!" + "'", str2, "j{!");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`p!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("e`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "u`!" + "'", str2, "u`!");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("g{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "g{!" + "'", str2, "g{!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`m!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`i!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("j{!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i{!" + "'", str2, "i{!");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("l`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "l`!" + "'", str2, "l`!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`j!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("a{!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a{!" + "'", str2, "a{!");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{u!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("a{!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "q{!" + "'", str2, "q{!");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("i`!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("j`!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "j`!" + "'", str2, "j`!");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g`!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a`!" + "'", str2, "a`!");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`h!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`i!" + "'", str2, "`i!");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`f!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`e!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("e`!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("k`!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "k`!" + "'", str2, "k`!");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "w{!" + "'", str2, "w{!");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("z`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("w`!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x`!" + "'", str2, "x`!");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`k!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`k!" + "'", str2, "`k!");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`{!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("y{!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "x{!" + "'", str2, "x{!");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`p!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("s`!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "s`!" + "'", str2, "s`!");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`d!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`d!" + "'", str2, "`d!");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`u!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`v!" + "'", str2, "`v!");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("g{!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "n{!" + "'", str2, "n{!");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }
}

