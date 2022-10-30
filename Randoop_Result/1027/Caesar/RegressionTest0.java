package Caesar;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("qr!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("ij!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("de!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        com.thealgorithms.ciphers.Caesar caesar0 = new com.thealgorithms.ciphers.Caesar();
        java.lang.Class<?> wildcardClass1 = caesar0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("pq!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("st!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("fg!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("jk!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("mn!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("wx!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("uv!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("vw!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("no!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("gh!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{d!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("mn!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{h!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("za!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{b!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("rs!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("hi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("op!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("lm!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{i!" + "'", str2, "{i!");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{h!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{o!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("xy!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("tu!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{h!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{k!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("cd!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("jk!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("kl!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{s!" + "'", str2, "{s!");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{f!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{e!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{s!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("yz!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("wx!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{t!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{u!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("pq!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{d!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("yz!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{r!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{a!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "uv!" + "'", str2, "uv!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{s!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("rs!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("ef!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("cd!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "y`!" + "'", str2, "y`!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{n!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`q!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("y`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{t!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("no!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{k!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "kl!" + "'", str2, "kl!");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("za!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "vw!" + "'", str2, "vw!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("ab!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("gh!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{q!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("mn!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gh!" + "'", str2, "gh!");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{z!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("xy!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{d!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{e!" + "'", str2, "{e!");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{g!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("qr!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("tu!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ab!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{n!" + "'", str2, "{n!");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{t!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("de!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`a!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{c!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`q!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{y!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("gh!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "qr!" + "'", str2, "qr!");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{z!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{`!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{t!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{t!" + "'", str2, "{t!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`m!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("yz!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{v!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("cd!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{z!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ij!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("de!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yz!" + "'", str2, "yz!");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`s!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{e!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{o!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("op!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{f!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{x!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`n!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`n!" + "'", str2, "`n!");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("no!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{e!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`s!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`w!" + "'", str2, "`w!");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("jk!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "jk!" + "'", str2, "jk!");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{j!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`a!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`m!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`q!" + "'", str2, "`q!");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`h!" + "'", str2, "`h!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "cd!" + "'", str2, "cd!");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{c!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{n!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{c!" + "'", str2, "{c!");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("uv!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("fg!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("vw!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`t!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("hi!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`w!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`a!" + "'", str2, "`a!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`n!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{i!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ab!" + "'", str2, "ab!");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`n!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("fg!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{f!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ef!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "op!" + "'", str2, "op!");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`h!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`s!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{x!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{v!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{l!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{y!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{u!" + "'", str2, "{u!");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{`!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{`!" + "'", str2, "{`!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ef!" + "'", str2, "ef!");
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`t!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{y!" + "'", str2, "{y!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`a!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{b!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("op!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`b!" + "'", str2, "`b!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{r!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{l!" + "'", str2, "{l!");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`z!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`{!" + "'", str2, "`{!");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`p!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`o!" + "'", str2, "`o!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("st!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fg!" + "'", str2, "fg!");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("lm!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "mn!" + "'", str2, "mn!");
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{j!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{j!" + "'", str2, "{j!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`b!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ab!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`u!" + "'", str2, "`u!");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`b!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`l!" + "'", str2, "`l!");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{j!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{d!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`q!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`r!" + "'", str2, "`r!");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("wx!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`t!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{u!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{q!" + "'", str2, "{q!");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`z!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{r!" + "'", str2, "{r!");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("hi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{y!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{o!" + "'", str2, "{o!");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`p!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`g!" + "'", str2, "`g!");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`m!" + "'", str2, "`m!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{z!" + "'", str2, "{z!");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{q!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`y!" + "'", str2, "`y!");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{k!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`z!" + "'", str2, "`z!");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("bc!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("vw!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "za!" + "'", str2, "za!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`t!" + "'", str2, "`t!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("lm!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "pq!" + "'", str2, "pq!");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`f!" + "'", str2, "`f!");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`y!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`x!" + "'", str2, "`x!");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("pq!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ij!" + "'", str2, "ij!");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{v!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{f!" + "'", str2, "{f!");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("qr!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "wx!" + "'", str2, "wx!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("za!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`r!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{c!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{d!" + "'", str2, "{d!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`o!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`e!" + "'", str2, "`e!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{x!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{x!" + "'", str2, "{x!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{g!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("{t!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("tu!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no!" + "'", str2, "no!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("kl!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "lm!" + "'", str2, "lm!");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{o!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`l!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{i!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{h!" + "'", str2, "{h!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{g!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{g!" + "'", str2, "{g!");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("st!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "tu!" + "'", str2, "tu!");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("rs!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{p!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{p!" + "'", str2, "{p!");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("uv!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("ij!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "st!" + "'", str2, "st!");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.lang.String[] strArray1 = com.thealgorithms.ciphers.Caesar.bruteforce("`h!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("bc!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("y`!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "o`!" + "'", str2, "o`!");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{b!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{v!" + "'", str2, "{v!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("ef!", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de!" + "'", str2, "de!");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("kl!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "bc!" + "'", str2, "bc!");
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("xy!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "xy!" + "'", str2, "xy!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("{r!", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{a!" + "'", str2, "{a!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("bc!", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`f!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`p!" + "'", str2, "`p!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{a!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{b!" + "'", str2, "{b!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("bc!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "rs!" + "'", str2, "rs!");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.encode("`s!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`s!" + "'", str2, "`s!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("{l!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "{k!" + "'", str2, "{k!");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.lang.String str2 = com.thealgorithms.ciphers.Caesar.decode("`b!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "`c!" + "'", str2, "`c!");
    }
}

